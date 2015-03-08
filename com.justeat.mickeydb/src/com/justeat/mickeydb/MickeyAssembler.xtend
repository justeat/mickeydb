package com.justeat.mickeydb

import com.google.inject.Inject
import com.google.inject.Provider
import com.justeat.mickeydb.generator.SqliteDatabaseSnapshot
import com.justeat.mickeydb.mickeyLang.Model
import org.eclipse.emf.ecore.resource.Resource

class MickeyAssembler {
	
	@Inject Provider<SqliteDatabaseSnapshot.Builder> mDbSnapshotBuilderProvider
	
	def MickeyModel assemble(Resource resource) {

		val mickeyModel = new MickeyModel();
		
		resource.resourceSet.resources.forEach[r|					
			var model = r.allContents.head as Model
			mickeyModel.addModel(model.databaseName, model)
		]
		
		mickeyModel.databases.values.forEach[db|		
			db.migrations.sortInplaceBy[m|m.name]
			db.initTables.sortInplaceBy[x|x.name]
			db.initViews.sortInplaceBy[x|x.name]
			
			val snapshot = mDbSnapshotBuilderProvider.get().build(db);
			db.snapshot = snapshot;
			db.snapshot.tables.sortInplaceBy[x|x.name]
			db.snapshot.views.sortInplaceBy[x|x.name]
			db.snapshot.triggers.sortInplaceBy[x|x.name]]	
		return mickeyModel;
	}
}