package com.justeat.mickeydb;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.justeat.mickeydb.MickeyDatabaseModel;
import com.justeat.mickeydb.MickeyModel;
import com.justeat.mickeydb.generator.SqliteDatabaseSnapshot;
import com.justeat.mickeydb.mickeyLang.ActionStatement;
import com.justeat.mickeydb.mickeyLang.CreateTableStatement;
import com.justeat.mickeydb.mickeyLang.CreateTriggerStatement;
import com.justeat.mickeydb.mickeyLang.CreateViewStatement;
import com.justeat.mickeydb.mickeyLang.MickeyBlock;
import com.justeat.mickeydb.mickeyLang.MickeyFile;
import com.justeat.mickeydb.mickeyLang.MickeyFunction;
import com.justeat.mickeydb.mickeyLang.MigrationBlock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class MickeyAssembler {
  @Inject
  private Provider<SqliteDatabaseSnapshot.Builder> mDbSnapshotBuilderProvider;
  
  public MickeyModel assemble(final Resource resource) {
    ResourceSet _resourceSet = resource.getResourceSet();
    EList<Resource> _resources = _resourceSet.getResources();
    final Function1<Resource, MickeyFile> _function = new Function1<Resource, MickeyFile>() {
      public MickeyFile apply(final Resource it) {
        TreeIterator<EObject> _allContents = it.getAllContents();
        EObject _head = IteratorExtensions.<EObject>head(_allContents);
        return ((MickeyFile) _head);
      }
    };
    List<MickeyFile> _map = ListExtensions.<Resource, MickeyFile>map(_resources, _function);
    return this.assemble(_map, null);
  }
  
  public MickeyModel assemble(final Resource resource, final MigrationBlock upToMigration) {
    ResourceSet _resourceSet = resource.getResourceSet();
    EList<Resource> _resources = _resourceSet.getResources();
    final Function1<Resource, MickeyFile> _function = new Function1<Resource, MickeyFile>() {
      public MickeyFile apply(final Resource it) {
        TreeIterator<EObject> _allContents = it.getAllContents();
        EObject _head = IteratorExtensions.<EObject>head(_allContents);
        return ((MickeyFile) _head);
      }
    };
    List<MickeyFile> _map = ListExtensions.<Resource, MickeyFile>map(_resources, _function);
    return this.assemble(_map, upToMigration);
  }
  
  public MickeyModel assemble(final List<MickeyFile> files) {
    return this.assemble(files, null);
  }
  
  public MickeyModel assemble(final List<MickeyFile> files, final MigrationBlock upToMigration) {
    final MickeyModel mickeyModel = new MickeyModel();
    final Procedure1<MickeyFile> _function = new Procedure1<MickeyFile>() {
      public void apply(final MickeyFile file) {
        MickeyAssembler.this.registerFile(mickeyModel, file);
      }
    };
    IterableExtensions.<MickeyFile>forEach(files, _function);
    Collection<MickeyDatabaseModel> _values = mickeyModel.databases.values();
    final Procedure1<MickeyDatabaseModel> _function_1 = new Procedure1<MickeyDatabaseModel>() {
      public void apply(final MickeyDatabaseModel db) {
        MickeyAssembler.this.sortMigrations(db, upToMigration);
        final Function1<CreateTableStatement, String> _function = new Function1<CreateTableStatement, String>() {
          public String apply(final CreateTableStatement x) {
            return x.getName();
          }
        };
        ListExtensions.<CreateTableStatement, String>sortInplaceBy(db.initTables, _function);
        final Function1<CreateViewStatement, String> _function_1 = new Function1<CreateViewStatement, String>() {
          public String apply(final CreateViewStatement x) {
            return x.getName();
          }
        };
        ListExtensions.<CreateViewStatement, String>sortInplaceBy(db.initViews, _function_1);
        SqliteDatabaseSnapshot.Builder _get = MickeyAssembler.this.mDbSnapshotBuilderProvider.get();
        final SqliteDatabaseSnapshot snapshot = _get.build(db);
        db.setSnapshot(snapshot);
        SqliteDatabaseSnapshot _snapshot = db.getSnapshot();
        ArrayList<CreateTableStatement> _tables = _snapshot.getTables();
        final Function1<CreateTableStatement, String> _function_2 = new Function1<CreateTableStatement, String>() {
          public String apply(final CreateTableStatement x) {
            return x.getName();
          }
        };
        ListExtensions.<CreateTableStatement, String>sortInplaceBy(_tables, _function_2);
        SqliteDatabaseSnapshot _snapshot_1 = db.getSnapshot();
        ArrayList<CreateViewStatement> _views = _snapshot_1.getViews();
        final Function1<CreateViewStatement, String> _function_3 = new Function1<CreateViewStatement, String>() {
          public String apply(final CreateViewStatement x) {
            return x.getName();
          }
        };
        ListExtensions.<CreateViewStatement, String>sortInplaceBy(_views, _function_3);
        SqliteDatabaseSnapshot _snapshot_2 = db.getSnapshot();
        ArrayList<CreateTriggerStatement> _triggers = _snapshot_2.getTriggers();
        final Function1<CreateTriggerStatement, String> _function_4 = new Function1<CreateTriggerStatement, String>() {
          public String apply(final CreateTriggerStatement x) {
            return x.getName();
          }
        };
        ListExtensions.<CreateTriggerStatement, String>sortInplaceBy(_triggers, _function_4);
      }
    };
    IterableExtensions.<MickeyDatabaseModel>forEach(_values, _function_1);
    return mickeyModel;
  }
  
  private void sortMigrations(final MickeyDatabaseModel db, final MigrationBlock upToMigration) {
    Collection<MigrationBlock> _values = db.migrationsByName.values();
    final Function1<MigrationBlock, Boolean> _function = new Function1<MigrationBlock, Boolean>() {
      public Boolean apply(final MigrationBlock it) {
        MigrationBlock _from = it.getFrom();
        return Boolean.valueOf(Objects.equal(_from, null));
      }
    };
    MigrationBlock migration = IterableExtensions.<MigrationBlock>findFirst(_values, _function);
    boolean _equals = Objects.equal(migration, null);
    if (_equals) {
      return;
    }
    while ((!Objects.equal(migration, null))) {
      {
        db.migrations.add(migration);
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(upToMigration, null));
        if (!_notEquals) {
          _and = false;
        } else {
          String _name = upToMigration.getName();
          String _name_1 = migration.getName();
          boolean _equals_1 = _name.equals(_name_1);
          _and = _equals_1;
        }
        if (_and) {
          return;
        }
        String _name_2 = migration.getName();
        MigrationBlock _get = db.migrationsByFromName.get(_name_2);
        migration = _get;
      }
    }
  }
  
  private MickeyDatabaseModel registerFile(final MickeyModel model, final MickeyFile file) {
    String _databaseName = file.getDatabaseName();
    MickeyDatabaseModel result = model.databases.get(_databaseName);
    boolean _equals = Objects.equal(result, null);
    if (_equals) {
      String _databaseName_1 = file.getDatabaseName();
      MickeyDatabaseModel _mickeyDatabaseModel = new MickeyDatabaseModel(_databaseName_1);
      result = _mickeyDatabaseModel;
      String _databaseName_2 = file.getDatabaseName();
      model.databases.put(_databaseName_2, result);
    }
    final MickeyDatabaseModel db = result;
    EList<MickeyBlock> _blocks = file.getBlocks();
    Iterable<ActionStatement> _filter = Iterables.<ActionStatement>filter(_blocks, ActionStatement.class);
    Iterables.<ActionStatement>addAll(db.actions, _filter);
    EList<MickeyBlock> _blocks_1 = file.getBlocks();
    Iterable<MickeyFunction> _filter_1 = Iterables.<MickeyFunction>filter(_blocks_1, MickeyFunction.class);
    Iterables.<MickeyFunction>addAll(db.functions, _filter_1);
    EList<MickeyBlock> _blocks_2 = file.getBlocks();
    Iterable<CreateTableStatement> _filter_2 = Iterables.<CreateTableStatement>filter(_blocks_2, CreateTableStatement.class);
    Iterables.<CreateTableStatement>addAll(db.initTables, _filter_2);
    EList<MickeyBlock> _blocks_3 = file.getBlocks();
    Iterable<CreateViewStatement> _filter_3 = Iterables.<CreateViewStatement>filter(_blocks_3, CreateViewStatement.class);
    Iterables.<CreateViewStatement>addAll(db.initViews, _filter_3);
    EList<MickeyBlock> _blocks_4 = file.getBlocks();
    Iterable<MigrationBlock> migrations = Iterables.<MigrationBlock>filter(_blocks_4, MigrationBlock.class);
    final Procedure1<MigrationBlock> _function = new Procedure1<MigrationBlock>() {
      public void apply(final MigrationBlock it) {
        String _name = it.getName();
        db.migrationsByName.put(_name, it);
      }
    };
    IterableExtensions.<MigrationBlock>forEach(migrations, _function);
    final Procedure1<MigrationBlock> _function_1 = new Procedure1<MigrationBlock>() {
      public void apply(final MigrationBlock it) {
        MigrationBlock _from = it.getFrom();
        boolean _notEquals = (!Objects.equal(_from, null));
        if (_notEquals) {
          MigrationBlock _from_1 = it.getFrom();
          String _name = _from_1.getName();
          db.migrationsByFromName.put(_name, it);
        }
      }
    };
    IterableExtensions.<MigrationBlock>forEach(migrations, _function_1);
    return db;
  }
}
