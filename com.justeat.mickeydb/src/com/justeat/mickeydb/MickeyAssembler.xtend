package com.justeat.mickeydb

import com.google.inject.Inject
import com.google.inject.Provider
import com.justeat.mickeydb.generator.SqliteDatabaseSnapshot
import com.justeat.mickeydb.mickeyLang.ActionStatement
import com.justeat.mickeydb.mickeyLang.CreateTableStatement
import com.justeat.mickeydb.mickeyLang.CreateViewStatement
import com.justeat.mickeydb.mickeyLang.MickeyFile
import com.justeat.mickeydb.mickeyLang.MickeyFunction
import com.justeat.mickeydb.mickeyLang.MigrationBlock
import java.util.List
import org.eclipse.emf.ecore.resource.Resource

class MickeyAssembler {
	
	@Inject Provider<SqliteDatabaseSnapshot.Builder> mDbSnapshotBuilderProvider
	
	def MickeyModel assemble(Resource resource) {
		return assemble(resource.resourceSet.resources.map[it.allContents.head as MickeyFile], null)
	}
		
	def MickeyModel assemble(List<MickeyFile> files) {
		return assemble(files, null)
	}
	
	def MickeyModel assemble(List<MickeyFile> files, MigrationBlock upToMigration) {

		val mickeyModel = new MickeyModel();
		
		files.forEach[file|mickeyModel.registerFile(file)]
		
		mickeyModel.databases.values.forEach[db|		
			db.sortMigrations(upToMigration)
			db.initTables.sortInplaceBy[x|x.name]
			db.initViews.sortInplaceBy[x|x.name]
			
			val snapshot = mDbSnapshotBuilderProvider.get().build(db);
			db.snapshot = snapshot;
			db.snapshot.tables.sortInplaceBy[x|x.name]
			db.snapshot.views.sortInplaceBy[x|x.name]
			db.snapshot.triggers.sortInplaceBy[x|x.name]]	
		return mickeyModel;
	}
	
	private def sortMigrations(MickeyDatabaseModel db, MigrationBlock upToMigration) {
		var migration = db.migrationsByName.values.findFirst[from==null]
		
		if(migration == null) {
			return
		}
		
		while(migration != null) {	
				db.migrations.add(migration)
				
				if(upToMigration != null && upToMigration.name.equals(migration.name)) {
					return
				}
				
				migration = db.migrationsByFromName.get(migration.name)
		}		
	}
	
	private def registerFile(MickeyModel model, MickeyFile file) {
		var result = model.databases.get(file.databaseName)
		
		if(result == null) {
			result = new MickeyDatabaseModel(file.databaseName);
			model.databases.put(file.databaseName, result)
		}
		
		val db = result
		
		db.actions.addAll(file.blocks.filter(ActionStatement))
		db.functions.addAll(file.blocks.filter(MickeyFunction))
		db.initTables.addAll(file.blocks.filter(CreateTableStatement))
		db.initViews.addAll(file.blocks.filter(CreateViewStatement))
		
		var migrations = file.blocks.filter(MigrationBlock)
		
		migrations.forEach[db.migrationsByName.put(it.name, it)]
		migrations.forEach[
			if(it.from != null) {
				db.migrationsByFromName.put(it.from.name, it)
			}
		]
		
		return db
	}
	
}