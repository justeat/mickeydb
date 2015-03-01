package com.justeat.mickeydb;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.justeat.mickeydb.MickeyDatabaseModel;
import com.justeat.mickeydb.mickeyLang.ActionStatement;
import com.justeat.mickeydb.mickeyLang.CreateTableStatement;
import com.justeat.mickeydb.mickeyLang.CreateViewStatement;
import com.justeat.mickeydb.mickeyLang.MickeyBlock;
import com.justeat.mickeydb.mickeyLang.MickeyFunction;
import com.justeat.mickeydb.mickeyLang.MigrationBlock;
import com.justeat.mickeydb.mickeyLang.Model;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class MickeyModel {
  public Hashtable<String, MickeyDatabaseModel> databases = new Hashtable<String, MickeyDatabaseModel>();
  
  public MickeyDatabaseModel addModel(final String databaseFqn, final Model model) {
    MickeyDatabaseModel db = this.databases.get(databaseFqn);
    boolean _equals = Objects.equal(db, null);
    if (_equals) {
      MickeyDatabaseModel _mickeyDatabaseModel = new MickeyDatabaseModel(databaseFqn);
      db = _mickeyDatabaseModel;
      this.databases.put(databaseFqn, db);
    }
    EList<MickeyBlock> _blocks = model.getBlocks();
    Iterable<ActionStatement> _filter = Iterables.<ActionStatement>filter(_blocks, ActionStatement.class);
    Iterables.<ActionStatement>addAll(db.actions, _filter);
    EList<MickeyBlock> _blocks_1 = model.getBlocks();
    Iterable<MickeyFunction> _filter_1 = Iterables.<MickeyFunction>filter(_blocks_1, MickeyFunction.class);
    Iterables.<MickeyFunction>addAll(db.functions, _filter_1);
    EList<MickeyBlock> _blocks_2 = model.getBlocks();
    Iterable<CreateTableStatement> _filter_2 = Iterables.<CreateTableStatement>filter(_blocks_2, CreateTableStatement.class);
    Iterables.<CreateTableStatement>addAll(db.initTables, _filter_2);
    EList<MickeyBlock> _blocks_3 = model.getBlocks();
    Iterable<CreateViewStatement> _filter_3 = Iterables.<CreateViewStatement>filter(_blocks_3, CreateViewStatement.class);
    Iterables.<CreateViewStatement>addAll(db.initViews, _filter_3);
    EList<MickeyBlock> _blocks_4 = model.getBlocks();
    Iterable<MigrationBlock> _filter_4 = Iterables.<MigrationBlock>filter(_blocks_4, MigrationBlock.class);
    Iterables.<MigrationBlock>addAll(db.migrations, _filter_4);
    return db;
  }
}
