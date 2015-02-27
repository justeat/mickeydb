package com.justeat.mickeydb

import org.eclipse.emf.common.util.EList
import com.justeat.mickeydb.mickeyLang.MigrationBlock
import java.util.Hashtable
import com.justeat.mickeydb.mickeyLang.Model
import com.justeat.mickeydb.mickeyLang.ActionStatement
import com.justeat.mickeydb.mickeyLang.Function
import com.justeat.mickeydb.mickeyLang.DDLStatement
import com.justeat.mickeydb.mickeyLang.CreateTableStatement
import com.justeat.mickeydb.mickeyLang.CreateViewStatement

class MickeyModel {
	public var databases = new Hashtable<String, MickeyDatabaseModel>();
	
	def addModel(String databaseFqn, Model model) {
		var db = databases.get(databaseFqn)
		
		if(db == null) {
			db = new MickeyDatabaseModel(databaseFqn);
			databases.put(databaseFqn, db)
		}
		
		db.actions.addAll(model.blocks.filter(ActionStatement))
		db.functions.addAll(model.blocks.filter(Function))
		db.initTables.addAll(model.blocks.filter(CreateTableStatement))
		db.initViews.addAll(model.blocks.filter(CreateViewStatement))
		db.migrations.addAll(model.blocks.filter(MigrationBlock))
	}
}