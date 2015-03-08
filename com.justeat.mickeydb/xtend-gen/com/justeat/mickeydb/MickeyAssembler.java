package com.justeat.mickeydb;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.justeat.mickeydb.MickeyDatabaseModel;
import com.justeat.mickeydb.MickeyModel;
import com.justeat.mickeydb.generator.SqliteDatabaseSnapshot;
import com.justeat.mickeydb.mickeyLang.CreateTableStatement;
import com.justeat.mickeydb.mickeyLang.CreateTriggerStatement;
import com.justeat.mickeydb.mickeyLang.CreateViewStatement;
import com.justeat.mickeydb.mickeyLang.MigrationBlock;
import com.justeat.mickeydb.mickeyLang.Model;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class MickeyAssembler {
  @Inject
  private Provider<SqliteDatabaseSnapshot.Builder> mDbSnapshotBuilderProvider;
  
  public MickeyModel assemble(final Resource resource) {
    final MickeyModel mickeyModel = new MickeyModel();
    ResourceSet _resourceSet = resource.getResourceSet();
    EList<Resource> _resources = _resourceSet.getResources();
    final Consumer<Resource> _function = new Consumer<Resource>() {
      public void accept(final Resource r) {
        TreeIterator<EObject> _allContents = r.getAllContents();
        EObject _head = IteratorExtensions.<EObject>head(_allContents);
        Model model = ((Model) _head);
        String _databaseName = model.getDatabaseName();
        mickeyModel.addModel(_databaseName, model);
      }
    };
    _resources.forEach(_function);
    Collection<MickeyDatabaseModel> _values = mickeyModel.databases.values();
    final Consumer<MickeyDatabaseModel> _function_1 = new Consumer<MickeyDatabaseModel>() {
      public void accept(final MickeyDatabaseModel db) {
        final Function1<MigrationBlock, BigDecimal> _function = new Function1<MigrationBlock, BigDecimal>() {
          public BigDecimal apply(final MigrationBlock m) {
            return m.getName();
          }
        };
        ListExtensions.<MigrationBlock, BigDecimal>sortInplaceBy(db.migrations, _function);
        final Function1<CreateTableStatement, String> _function_1 = new Function1<CreateTableStatement, String>() {
          public String apply(final CreateTableStatement x) {
            return x.getName();
          }
        };
        ListExtensions.<CreateTableStatement, String>sortInplaceBy(db.initTables, _function_1);
        final Function1<CreateViewStatement, String> _function_2 = new Function1<CreateViewStatement, String>() {
          public String apply(final CreateViewStatement x) {
            return x.getName();
          }
        };
        ListExtensions.<CreateViewStatement, String>sortInplaceBy(db.initViews, _function_2);
        SqliteDatabaseSnapshot.Builder _get = MickeyAssembler.this.mDbSnapshotBuilderProvider.get();
        final SqliteDatabaseSnapshot snapshot = _get.build(db);
        db.setSnapshot(snapshot);
        SqliteDatabaseSnapshot _snapshot = db.getSnapshot();
        ArrayList<CreateTableStatement> _tables = _snapshot.getTables();
        final Function1<CreateTableStatement, String> _function_3 = new Function1<CreateTableStatement, String>() {
          public String apply(final CreateTableStatement x) {
            return x.getName();
          }
        };
        ListExtensions.<CreateTableStatement, String>sortInplaceBy(_tables, _function_3);
        SqliteDatabaseSnapshot _snapshot_1 = db.getSnapshot();
        ArrayList<CreateViewStatement> _views = _snapshot_1.getViews();
        final Function1<CreateViewStatement, String> _function_4 = new Function1<CreateViewStatement, String>() {
          public String apply(final CreateViewStatement x) {
            return x.getName();
          }
        };
        ListExtensions.<CreateViewStatement, String>sortInplaceBy(_views, _function_4);
        SqliteDatabaseSnapshot _snapshot_2 = db.getSnapshot();
        ArrayList<CreateTriggerStatement> _triggers = _snapshot_2.getTriggers();
        final Function1<CreateTriggerStatement, String> _function_5 = new Function1<CreateTriggerStatement, String>() {
          public String apply(final CreateTriggerStatement x) {
            return x.getName();
          }
        };
        ListExtensions.<CreateTriggerStatement, String>sortInplaceBy(_triggers, _function_5);
      }
    };
    _values.forEach(_function_1);
    return mickeyModel;
  }
}
