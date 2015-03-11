package com.justeat.mickeydb

import com.google.inject.Inject
import com.google.inject.Provider
import com.justeat.mickeydb.generator.SqliteDatabaseSnapshot
import com.justeat.mickeydb.mickeyLang.MickeyFile
import org.eclipse.emf.ecore.resource.Resource
import java.util.ArrayList
import com.justeat.mickeydb.mickeyLang.MigrationBlock
import org.eclipse.xtext.EcoreUtil2
import com.justeat.mickeydb.mickeyLang.ActionStatement
import com.justeat.mickeydb.mickeyLang.MickeyFunction
import com.justeat.mickeydb.mickeyLang.CreateTableStatement
import com.justeat.mickeydb.mickeyLang.CreateViewStatement

class MickeyAssembler {
	
	@Inject Provider<SqliteDatabaseSnapshot.Builder> mDbSnapshotBuilderProvider
	
	def MickeyModel assemble(Resource resource) {

		var allFiles = resource.resourceSet.resources.map[it.allContents.head as MickeyFile]

		val mickeyModel = new MickeyModel();
		
		allFiles.forEach[file|mickeyModel.registerFile(file)]
		
		mickeyModel.databases.values.forEach[db|		
			db.sortMigrations
			db.initTables.sortInplaceBy[x|x.name]
			db.initViews.sortInplaceBy[x|x.name]
			
			val snapshot = mDbSnapshotBuilderProvider.get().build(db);
			db.snapshot = snapshot;
			db.snapshot.tables.sortInplaceBy[x|x.name]
			db.snapshot.views.sortInplaceBy[x|x.name]
			db.snapshot.triggers.sortInplaceBy[x|x.name]]	
		return mickeyModel;
	}
	
	private def sortMigrations(MickeyDatabaseModel db) {
		var migration = db.migrationsByName.values.findFirst[from==null]
		
		db.migrations.add(migration)
		
		while(migration != null) {
			migration = db.migrationsByFromName.get(migration.name)
			if(migration != null) {
				db.migrations.add(migration)
			}
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