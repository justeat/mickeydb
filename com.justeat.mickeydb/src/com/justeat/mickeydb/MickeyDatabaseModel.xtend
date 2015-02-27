package com.justeat.mickeydb

import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.emf.common.util.EList
import com.justeat.mickeydb.mickeyLang.MigrationBlock
import java.util.ArrayList
import com.justeat.mickeydb.mickeyLang.DDLStatement
import com.justeat.mickeydb.mickeyLang.Function
import com.justeat.mickeydb.mickeyLang.ActionStatement
import com.justeat.mickeydb.generator.SqliteDatabaseSnapshot
import com.justeat.mickeydb.mickeyLang.CreateTableStatement
import com.justeat.mickeydb.mickeyLang.CreateViewStatement

class MickeyDatabaseModel {
		
	@Accessors String packageName
	@Accessors String databaseName
	@Accessors SqliteDatabaseSnapshot snapshot
	public var migrations = new ArrayList<MigrationBlock>();
	public var initTables = new ArrayList<CreateTableStatement>();
	public var initViews = new ArrayList<CreateViewStatement>();
	public var functions = new ArrayList<Function>();
	public var actions = new ArrayList<ActionStatement>();
	
	new(String databaseFqn) {
		if(databaseFqn.contains(".")) {
			var s = databaseFqn.lastIndexOf(".")
			packageName = databaseFqn.substring(0, s)
			databaseName = databaseFqn.substring(s + 1)
		} else {
			packageName = databaseFqn;
			databaseName = databaseFqn;			
		}
	}
}