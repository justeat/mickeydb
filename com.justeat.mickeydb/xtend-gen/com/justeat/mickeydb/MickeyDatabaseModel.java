package com.justeat.mickeydb;

import com.justeat.mickeydb.generator.SqliteDatabaseSnapshot;
import com.justeat.mickeydb.mickeyLang.ActionStatement;
import com.justeat.mickeydb.mickeyLang.CreateTableStatement;
import com.justeat.mickeydb.mickeyLang.CreateViewStatement;
import com.justeat.mickeydb.mickeyLang.MickeyFunction;
import com.justeat.mickeydb.mickeyLang.MigrationBlock;
import java.util.ArrayList;
import java.util.Hashtable;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class MickeyDatabaseModel {
  @Accessors
  private String packageName;
  
  @Accessors
  private String databaseName;
  
  @Accessors
  private SqliteDatabaseSnapshot snapshot;
  
  public ArrayList<MigrationBlock> migrations = new ArrayList<MigrationBlock>();
  
  public Hashtable<String, MigrationBlock> migrationsByName = new Hashtable<String, MigrationBlock>();
  
  public Hashtable<String, MigrationBlock> migrationsByFromName = new Hashtable<String, MigrationBlock>();
  
  public ArrayList<CreateTableStatement> initTables = new ArrayList<CreateTableStatement>();
  
  public ArrayList<CreateViewStatement> initViews = new ArrayList<CreateViewStatement>();
  
  public ArrayList<MickeyFunction> functions = new ArrayList<MickeyFunction>();
  
  public ArrayList<ActionStatement> actions = new ArrayList<ActionStatement>();
  
  public MickeyDatabaseModel(final String databaseFqn) {
    boolean _contains = databaseFqn.contains(".");
    if (_contains) {
      int s = databaseFqn.lastIndexOf(".");
      String _substring = databaseFqn.substring(0, s);
      this.packageName = _substring;
      String _substring_1 = databaseFqn.substring((s + 1));
      this.databaseName = _substring_1;
    } else {
      this.packageName = databaseFqn;
      this.databaseName = databaseFqn;
    }
  }
  
  @Pure
  public String getPackageName() {
    return this.packageName;
  }
  
  public void setPackageName(final String packageName) {
    this.packageName = packageName;
  }
  
  @Pure
  public String getDatabaseName() {
    return this.databaseName;
  }
  
  public void setDatabaseName(final String databaseName) {
    this.databaseName = databaseName;
  }
  
  @Pure
  public SqliteDatabaseSnapshot getSnapshot() {
    return this.snapshot;
  }
  
  public void setSnapshot(final SqliteDatabaseSnapshot snapshot) {
    this.snapshot = snapshot;
  }
}
