package com.justeat.mickeydb;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.justeat.mickeydb.MickeyAssembler;
import com.justeat.mickeydb.MickeyDatabaseModel;
import com.justeat.mickeydb.MickeyEnvironment;
import com.justeat.mickeydb.MickeyModel;
import com.justeat.mickeydb.ModelUtil;
import com.justeat.mickeydb.generator.SqliteDatabaseSnapshot;
import com.justeat.mickeydb.mickeyLang.ActionStatement;
import com.justeat.mickeydb.mickeyLang.AlterTableAddColumnStatement;
import com.justeat.mickeydb.mickeyLang.AlterTableRenameStatement;
import com.justeat.mickeydb.mickeyLang.ColumnSource;
import com.justeat.mickeydb.mickeyLang.ColumnSourceRef;
import com.justeat.mickeydb.mickeyLang.ContentUriParamSegment;
import com.justeat.mickeydb.mickeyLang.ContentUriQueryParam;
import com.justeat.mickeydb.mickeyLang.CreateTableStatement;
import com.justeat.mickeydb.mickeyLang.CreateTriggerStatement;
import com.justeat.mickeydb.mickeyLang.CreateViewStatement;
import com.justeat.mickeydb.mickeyLang.DMLStatement;
import com.justeat.mickeydb.mickeyLang.DropTableStatement;
import com.justeat.mickeydb.mickeyLang.DropTriggerStatement;
import com.justeat.mickeydb.mickeyLang.DropViewStatement;
import com.justeat.mickeydb.mickeyLang.MickeyFile;
import com.justeat.mickeydb.mickeyLang.MickeyLangPackage;
import com.justeat.mickeydb.mickeyLang.MigrationBlock;
import com.justeat.mickeydb.mickeyLang.NewColumn;
import com.justeat.mickeydb.mickeyLang.OldColumn;
import com.justeat.mickeydb.mickeyLang.SelectExpression;
import com.justeat.mickeydb.mickeyLang.SelectSource;
import com.justeat.mickeydb.mickeyLang.SingleSource;
import com.justeat.mickeydb.mickeyLang.SingleSourceTable;
import com.justeat.mickeydb.mickeyLang.TableDefinition;
import com.justeat.mickeydb.mickeyLang.UpdateColumnExpression;
import com.justeat.mickeydb.mickeyLang.UpdateStatement;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class MickeyScopeProvider extends AbstractDeclarativeScopeProvider {
  private final static Logger LOG = Logger.getLogger(MickeyScopeProvider.class);
  
  @Inject
  private IQualifiedNameProvider nameProvider;
  
  @Inject
  private IResourceDescriptions resourceDescriptions;
  
  @Inject
  private MickeyAssembler assembler;
  
  @Inject
  private MickeyEnvironment mickeyEnvironment;
  
  public IScope getScope(final EObject context, final EReference reference) {
    return super.getScope(context, reference);
  }
  
  public IScope scope_AlterTableAddColumnStatement_table(final AlterTableAddColumnStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scope = this.delegateGetScope(context, ref);
      MickeyFile model = ModelUtil.getModel(context);
      String tableName = ModelUtil.getFeatureNodeText(context, ref);
      String _databaseName = model.getDatabaseName();
      QualifiedName _create = QualifiedName.create(_databaseName, tableName);
      Iterable<IEObjectDescription> _elements = scope.getElements(_create);
      final Function1<IEObjectDescription, EObject> _function = new Function1<IEObjectDescription, EObject>() {
        public EObject apply(final IEObjectDescription e) {
          EObject _eObjectOrProxy = e.getEObjectOrProxy();
          return EcoreUtil.resolve(_eObjectOrProxy, context);
        }
      };
      Iterable<EObject> scopedElements = IterableExtensions.<IEObjectDescription, EObject>map(_elements, _function);
      _xblockexpression = Scopes.scopeFor(scopedElements, scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_AlterTableRenameStatement_table(final AlterTableRenameStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scope = this.delegateGetScope(context, ref);
      MickeyFile model = ModelUtil.getModel(context);
      String tableName = ModelUtil.getFeatureNodeText(context, ref);
      String _databaseName = model.getDatabaseName();
      QualifiedName _create = QualifiedName.create(_databaseName, tableName);
      Iterable<IEObjectDescription> _elements = scope.getElements(_create);
      final Function1<IEObjectDescription, EObject> _function = new Function1<IEObjectDescription, EObject>() {
        public EObject apply(final IEObjectDescription e) {
          EObject _eObjectOrProxy = e.getEObjectOrProxy();
          return EcoreUtil.resolve(_eObjectOrProxy, context);
        }
      };
      Iterable<EObject> scopedElements = IterableExtensions.<IEObjectDescription, EObject>map(_elements, _function);
      _xblockexpression = Scopes.scopeFor(scopedElements, scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_ActionStatement_type(final ActionStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scope = this.delegateGetScope(context, ref);
      MickeyFile model = ModelUtil.getModel(context);
      String tableName = ModelUtil.getFeatureNodeText(context, ref);
      String _databaseName = model.getDatabaseName();
      QualifiedName _create = QualifiedName.create(_databaseName, tableName);
      Iterable<IEObjectDescription> _elements = scope.getElements(_create);
      final Function1<IEObjectDescription, EObject> _function = new Function1<IEObjectDescription, EObject>() {
        public EObject apply(final IEObjectDescription e) {
          EObject _eObjectOrProxy = e.getEObjectOrProxy();
          return EcoreUtil.resolve(_eObjectOrProxy, context);
        }
      };
      Iterable<EObject> scopedElements = IterableExtensions.<IEObjectDescription, EObject>map(_elements, _function);
      _xblockexpression = Scopes.scopeFor(scopedElements, scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_SingleSourceTable_tableReference(final SingleSourceTable context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scope = this.delegateGetScope(context, ref);
      MickeyFile model = ModelUtil.getModel(context);
      String tableName = ModelUtil.getFeatureNodeText(context, ref);
      String _databaseName = model.getDatabaseName();
      QualifiedName _create = QualifiedName.create(_databaseName, tableName);
      Iterable<IEObjectDescription> _elements = scope.getElements(_create);
      final Function1<IEObjectDescription, EObject> _function = new Function1<IEObjectDescription, EObject>() {
        public EObject apply(final IEObjectDescription e) {
          EObject _eObjectOrProxy = e.getEObjectOrProxy();
          return EcoreUtil.resolve(_eObjectOrProxy, context);
        }
      };
      Iterable<EObject> scopedElements = IterableExtensions.<IEObjectDescription, EObject>map(_elements, _function);
      _xblockexpression = Scopes.scopeFor(scopedElements, scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_ColumnSourceRef_column(final ColumnSourceRef context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      MickeyFile _model = ModelUtil.getModel(context);
      String dbName = _model.getDatabaseName();
      String tableName = "";
      SelectSource _source = context.getSource();
      boolean _notEquals = (!Objects.equal(_source, null));
      if (_notEquals) {
        SelectSource _source_1 = context.getSource();
        String _featureNodeText = ModelUtil.getFeatureNodeText(_source_1, MickeyLangPackage.Literals.SINGLE_SOURCE_TABLE__TABLE_REFERENCE);
        tableName = _featureNodeText;
      } else {
        UpdateStatement updateStatement = ModelUtil.<UpdateStatement>getAncestorOfType(context, UpdateStatement.class);
        boolean _notEquals_1 = (!Objects.equal(updateStatement, null));
        if (_notEquals_1) {
          String _featureNodeText_1 = ModelUtil.getFeatureNodeText(updateStatement, MickeyLangPackage.Literals.UPDATE_STATEMENT__TABLE);
          tableName = _featureNodeText_1;
        }
      }
      _xblockexpression = this.scopeTableColumns(context, dbName, tableName);
    }
    return _xblockexpression;
  }
  
  public IScope scope_NewColumn_column(final NewColumn context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      MickeyFile _model = ModelUtil.getModel(context);
      String dbName = _model.getDatabaseName();
      CreateTriggerStatement statement = ModelUtil.<CreateTriggerStatement>getAncestorOfType(context, CreateTriggerStatement.class);
      String tableName = ModelUtil.getFeatureNodeText(statement, MickeyLangPackage.Literals.CREATE_TRIGGER_STATEMENT__TABLE);
      _xblockexpression = this.scopeTableColumns(context, dbName, tableName);
    }
    return _xblockexpression;
  }
  
  public IScope scope_OldColumn_column(final OldColumn context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      MickeyFile _model = ModelUtil.getModel(context);
      String dbName = _model.getDatabaseName();
      CreateTriggerStatement statement = ModelUtil.<CreateTriggerStatement>getAncestorOfType(context, CreateTriggerStatement.class);
      String tableName = ModelUtil.getFeatureNodeText(statement, MickeyLangPackage.Literals.CREATE_TRIGGER_STATEMENT__TABLE);
      _xblockexpression = this.scopeTableColumns(context, dbName, tableName);
    }
    return _xblockexpression;
  }
  
  public IScope scope_UpdateColumnExpression_columnName(final UpdateColumnExpression context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      MickeyFile _model = ModelUtil.getModel(context);
      String dbName = _model.getDatabaseName();
      DMLStatement statement = ModelUtil.<DMLStatement>getAncestorOfType(context, DMLStatement.class);
      String tableName = ModelUtil.getTargetTableName(statement);
      _xblockexpression = this.scopeTableColumns(context, dbName, tableName);
    }
    return _xblockexpression;
  }
  
  public IScope scope_ColumnSourceRef_source(final ColumnSourceRef context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scope = this.delegateGetScope(context, ref);
      SelectExpression select = ModelUtil.<SelectExpression>getAncestorOfType(context, SelectExpression.class);
      ArrayList<SingleSource> _findAllSingleSources = ModelUtil.findAllSingleSources(select);
      _xblockexpression = Scopes.scopeFor(_findAllSingleSources, scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_DropViewStatement_view(final DropViewStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scope = this.delegateGetScope(context, ref);
      MickeyFile model = ModelUtil.getModel(context);
      String viewName = ModelUtil.getFeatureNodeText(context, ref);
      String _databaseName = model.getDatabaseName();
      QualifiedName _create = QualifiedName.create(_databaseName, viewName);
      Iterable<IEObjectDescription> _elements = scope.getElements(_create);
      final Function1<IEObjectDescription, EObject> _function = new Function1<IEObjectDescription, EObject>() {
        public EObject apply(final IEObjectDescription e) {
          EObject _eObjectOrProxy = e.getEObjectOrProxy();
          return EcoreUtil.resolve(_eObjectOrProxy, context);
        }
      };
      Iterable<EObject> scopedElements = IterableExtensions.<IEObjectDescription, EObject>map(_elements, _function);
      _xblockexpression = Scopes.scopeFor(scopedElements, scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_DropTableStatement_table(final DropTableStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scope = this.delegateGetScope(context, ref);
      MickeyFile model = ModelUtil.getModel(context);
      String viewName = ModelUtil.getFeatureNodeText(context, ref);
      String _databaseName = model.getDatabaseName();
      QualifiedName _create = QualifiedName.create(_databaseName, viewName);
      Iterable<IEObjectDescription> _elements = scope.getElements(_create);
      final Function1<IEObjectDescription, EObject> _function = new Function1<IEObjectDescription, EObject>() {
        public EObject apply(final IEObjectDescription e) {
          EObject _eObjectOrProxy = e.getEObjectOrProxy();
          return EcoreUtil.resolve(_eObjectOrProxy, context);
        }
      };
      Iterable<EObject> scopedElements = IterableExtensions.<IEObjectDescription, EObject>map(_elements, _function);
      _xblockexpression = Scopes.scopeFor(scopedElements, scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_DropTriggerStatement_trigger(final DropTriggerStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scope = this.delegateGetScope(context, ref);
      MickeyFile model = ModelUtil.getModel(context);
      String triggerName = ModelUtil.getFeatureNodeText(context, ref);
      String _databaseName = model.getDatabaseName();
      QualifiedName _create = QualifiedName.create(_databaseName, triggerName);
      Iterable<IEObjectDescription> _elements = scope.getElements(_create);
      final Function1<IEObjectDescription, EObject> _function = new Function1<IEObjectDescription, EObject>() {
        public EObject apply(final IEObjectDescription e) {
          EObject _eObjectOrProxy = e.getEObjectOrProxy();
          return EcoreUtil.resolve(_eObjectOrProxy, context);
        }
      };
      Iterable<EObject> scopedElements = IterableExtensions.<IEObjectDescription, EObject>map(_elements, _function);
      _xblockexpression = Scopes.scopeFor(scopedElements, scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_MigrationBlock_from(final MigrationBlock context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      IScope scope = this.delegateGetScope(context, ref);
      MickeyFile model = ModelUtil.getModel(context);
      String migrationName = ModelUtil.getFeatureNodeText(context, ref);
      String _databaseName = model.getDatabaseName();
      QualifiedName _create = QualifiedName.create(_databaseName, migrationName);
      Iterable<IEObjectDescription> _elements = scope.getElements(_create);
      final Function1<IEObjectDescription, EObject> _function = new Function1<IEObjectDescription, EObject>() {
        public EObject apply(final IEObjectDescription e) {
          EObject _eObjectOrProxy = e.getEObjectOrProxy();
          return EcoreUtil.resolve(_eObjectOrProxy, context);
        }
      };
      Iterable<EObject> scopedElements = IterableExtensions.<IEObjectDescription, EObject>map(_elements, _function);
      _xblockexpression = Scopes.scopeFor(scopedElements, scope);
    }
    return _xblockexpression;
  }
  
  public MickeyModel getMickeyModelInScope(final EObject context) {
    List<MickeyFile> files = null;
    boolean _isStandalone = this.mickeyEnvironment.isStandalone();
    String _plus = ("[Get Model In Scope] Standalone: " + Boolean.valueOf(_isStandalone));
    MickeyScopeProvider.LOG.debug(_plus);
    boolean _isStandalone_1 = this.mickeyEnvironment.isStandalone();
    if (_isStandalone_1) {
      Resource _eResource = context.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      EList<Resource> _resources = _resourceSet.getResources();
      final Function1<Resource, MickeyFile> _function = new Function1<Resource, MickeyFile>() {
        public MickeyFile apply(final Resource it) {
          TreeIterator<EObject> _allContents = it.getAllContents();
          EObject _head = IteratorExtensions.<EObject>head(_allContents);
          return ((MickeyFile) _head);
        }
      };
      List<MickeyFile> _map = ListExtensions.<Resource, MickeyFile>map(_resources, _function);
      files = _map;
    } else {
      Iterable<IEObjectDescription> _exportedObjectsByType = this.resourceDescriptions.getExportedObjectsByType(MickeyLangPackage.Literals.MICKEY_FILE);
      final Function1<IEObjectDescription, MickeyFile> _function_1 = new Function1<IEObjectDescription, MickeyFile>() {
        public MickeyFile apply(final IEObjectDescription e) {
          EObject _eObjectOrProxy = e.getEObjectOrProxy();
          EObject _resolve = EcoreUtil.resolve(_eObjectOrProxy, context);
          return ((MickeyFile) _resolve);
        }
      };
      Iterable<MickeyFile> _map_1 = IterableExtensions.<IEObjectDescription, MickeyFile>map(_exportedObjectsByType, _function_1);
      List<MickeyFile> _list = IterableExtensions.<MickeyFile>toList(_map_1);
      files = _list;
    }
    int _size = files.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      int _size_1 = files.size();
      String _plus_1 = ("[Get Model In Scope] Files: " + Integer.valueOf(_size_1));
      MickeyScopeProvider.LOG.debug(_plus_1);
      MigrationBlock migration = ModelUtil.<MigrationBlock>getAncestorOfType(context, MigrationBlock.class);
      try {
        return this.assembler.assemble(files, migration);
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          MickeyScopeProvider.LOG.debug("[Get Model In Scope] Failed with error ", e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    MickeyScopeProvider.LOG.debug("[Get Model In Scope] Failed ");
    return null;
  }
  
  public IScope scopeTableColumns(final EObject context, final String dbName, final String tableName) {
    MickeyModel mickeyModel = this.getMickeyModelInScope(context);
    boolean _notEquals = (!Objects.equal(mickeyModel, null));
    if (_notEquals) {
      MickeyDatabaseModel _get = mickeyModel.databases.get(dbName);
      SqliteDatabaseSnapshot _snapshot = _get.getSnapshot();
      TableDefinition definition = _snapshot.getTableDefinition(tableName);
      boolean _equals = Objects.equal(definition, null);
      if (_equals) {
        MickeyDatabaseModel _get_1 = mickeyModel.databases.get(dbName);
        final Function1<CreateTableStatement, Boolean> _function = new Function1<CreateTableStatement, Boolean>() {
          public Boolean apply(final CreateTableStatement it) {
            String _name = it.getName();
            return Boolean.valueOf(_name.equals(tableName));
          }
        };
        CreateTableStatement _findFirst = IterableExtensions.<CreateTableStatement>findFirst(_get_1.initTables, _function);
        definition = _findFirst;
      }
      boolean _equals_1 = Objects.equal(definition, null);
      if (_equals_1) {
        MickeyDatabaseModel _get_2 = mickeyModel.databases.get(dbName);
        final Function1<CreateViewStatement, Boolean> _function_1 = new Function1<CreateViewStatement, Boolean>() {
          public Boolean apply(final CreateViewStatement it) {
            String _name = it.getName();
            return Boolean.valueOf(_name.equals(tableName));
          }
        };
        CreateViewStatement _findFirst_1 = IterableExtensions.<CreateViewStatement>findFirst(_get_2.initViews, _function_1);
        definition = _findFirst_1;
      }
      if ((definition instanceof CreateTableStatement)) {
        CreateTableStatement table = ((CreateTableStatement) definition);
        EList<ColumnSource> _columnDefs = table.getColumnDefs();
        IScope columnScope = Scopes.scopeFor(_columnDefs, IScope.NULLSCOPE);
        return columnScope;
      } else {
        CreateViewStatement view = ((CreateViewStatement) definition);
        ArrayList<ColumnSource> _viewResultColumns = ModelUtil.getViewResultColumns(view);
        IScope columnScope_1 = Scopes.scopeFor(_viewResultColumns, IScope.NULLSCOPE);
        return columnScope_1;
      }
    }
    return IScope.NULLSCOPE;
  }
  
  public IScope scope_ContentUriParamSegment_param(final ContentUriParamSegment context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      MickeyFile _model = ModelUtil.getModel(context);
      String dbName = _model.getDatabaseName();
      String tableName = "";
      ActionStatement action = ModelUtil.<ActionStatement>getAncestorOfType(context, ActionStatement.class);
      String _featureNodeText = ModelUtil.getFeatureNodeText(action, MickeyLangPackage.Literals.ACTION_STATEMENT__TYPE);
      tableName = _featureNodeText;
      _xblockexpression = this.scopeTableColumns(context, dbName, tableName);
    }
    return _xblockexpression;
  }
  
  public IScope scope_ContentUriQueryParam_column(final ContentUriQueryParam context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      MickeyFile _model = ModelUtil.getModel(context);
      String dbName = _model.getDatabaseName();
      String tableName = "";
      ActionStatement action = ModelUtil.<ActionStatement>getAncestorOfType(context, ActionStatement.class);
      String _featureNodeText = ModelUtil.getFeatureNodeText(action, MickeyLangPackage.Literals.ACTION_STATEMENT__TYPE);
      tableName = _featureNodeText;
      _xblockexpression = this.scopeTableColumns(context, dbName, tableName);
    }
    return _xblockexpression;
  }
}
