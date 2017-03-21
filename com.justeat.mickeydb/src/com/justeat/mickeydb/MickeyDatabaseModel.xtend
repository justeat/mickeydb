package com.justeat.mickeydb

import com.justeat.mickeydb.generator.SqliteDatabaseSnapshot
import com.justeat.mickeydb.mickeyLang.ActionStatement
import com.justeat.mickeydb.mickeyLang.CreateTableStatement
import com.justeat.mickeydb.mickeyLang.CreateViewStatement
import com.justeat.mickeydb.mickeyLang.MickeyFunction
import com.justeat.mickeydb.mickeyLang.MigrationBlock
import java.util.ArrayList
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Hashtable

class MickeyDatabaseModel {
		
	@Accessors String packageName
	@Accessors String databaseName
	@Accessors int version = 0;
	@Accessors SqliteDatabaseSnapshot snapshot
	public var migrations = new ArrayList<MigrationBlock>();
	public var migrationsByName = new Hashtable<String, MigrationBlock>();
	public var migrationsByFromName = new Hashtable<String, MigrationBlock>();
	public var initTables = new ArrayList<CreateTableStatement>();
	public var initViews = new ArrayList<CreateViewStatement>();
	public var functions = new ArrayList<MickeyFunction>();
	public var actions = new ArrayList<ActionStatement>();
	
	new(String databaseFqn, int version) {
		if(databaseFqn.contains(".")) {
			var s = databaseFqn.lastIndexOf(".")
			packageName = databaseFqn.substring(0, s)
			databaseName = databaseFqn.substring(s + 1)
		} else {
			packageName = databaseFqn;
			databaseName = databaseFqn;			
		}

		this.version = version;
	}
}