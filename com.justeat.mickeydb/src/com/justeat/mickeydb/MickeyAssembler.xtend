package com.justeat.mickeydb

import com.google.inject.Inject
import com.justeat.mickeydb.mickeyLang.Model
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.justeat.mickeydb.generator.SqliteDatabaseSnapshot
import com.google.inject.Provider
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.IGlobalScopeProvider

class MickeyAssembler {
	
	@Inject IQualifiedNameProvider nameProvider
	@Inject IGlobalScopeProvider scopeProvider
	@Inject Provider<SqliteDatabaseSnapshot.Builder> mDbSnapshotBuilderProvider
	
	def MickeyModel assemble(ResourceSet set) {
		var resources = set.resources;
		var mickeyModel = new MickeyModel();
		
		for(var i=0; i < resources.length; i++) {
			var r = resources.get(i)
			var model = r.contents.head as Model;
			mickeyModel.addModel(model.databaseName, model)
		}
		
		mickeyModel.databases.values.forEach[db|
			db.migrations.sortInplaceBy[m|m.version]
			db.initTables.sortInplaceBy[x|x.name]
			db.initViews.sortInplaceBy[x|x.name]
			
			val snapshot = mDbSnapshotBuilderProvider.get().build(db);
			db.snapshot = snapshot;
			db.snapshot.tables.sortInplaceBy[x|x.name]
			db.snapshot.views.sortInplaceBy[x|x.name]
			db.snapshot.triggers.sortInplaceBy[x|x.name]
			
		]
		return mickeyModel;
	}
}