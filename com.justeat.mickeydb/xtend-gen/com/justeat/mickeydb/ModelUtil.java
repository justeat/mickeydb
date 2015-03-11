package com.justeat.mickeydb;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.justeat.mickeydb.MickeyDatabaseModel;
import com.justeat.mickeydb.generator.SqliteDatabaseSnapshot;
import com.justeat.mickeydb.mickeyLang.AlterTableRenameStatement;
import com.justeat.mickeydb.mickeyLang.CastExpression;
import com.justeat.mickeydb.mickeyLang.ColumnDef;
import com.justeat.mickeydb.mickeyLang.ColumnSource;
import com.justeat.mickeydb.mickeyLang.ColumnSourceRef;
import com.justeat.mickeydb.mickeyLang.ColumnType;
import com.justeat.mickeydb.mickeyLang.CreateTableStatement;
import com.justeat.mickeydb.mickeyLang.CreateViewStatement;
import com.justeat.mickeydb.mickeyLang.DDLStatement;
import com.justeat.mickeydb.mickeyLang.DMLStatement;
import com.justeat.mickeydb.mickeyLang.DeleteStatement;
import com.justeat.mickeydb.mickeyLang.ExprConcat;
import com.justeat.mickeydb.mickeyLang.Expression;
import com.justeat.mickeydb.mickeyLang.Function;
import com.justeat.mickeydb.mickeyLang.InsertStatement;
import com.justeat.mickeydb.mickeyLang.JoinSource;
import com.justeat.mickeydb.mickeyLang.JoinStatement;
import com.justeat.mickeydb.mickeyLang.MickeyFile;
import com.justeat.mickeydb.mickeyLang.MickeyLangPackage;
import com.justeat.mickeydb.mickeyLang.MigrationBlock;
import com.justeat.mickeydb.mickeyLang.ResultColumn;
import com.justeat.mickeydb.mickeyLang.SelectCore;
import com.justeat.mickeydb.mickeyLang.SelectCoreExpression;
import com.justeat.mickeydb.mickeyLang.SelectExpression;
import com.justeat.mickeydb.mickeyLang.SelectList;
import com.justeat.mickeydb.mickeyLang.SelectStatement;
import com.justeat.mickeydb.mickeyLang.SingleSource;
import com.justeat.mickeydb.mickeyLang.SingleSourceTable;
import com.justeat.mickeydb.mickeyLang.SqliteDataType;
import com.justeat.mickeydb.mickeyLang.TableDefinition;
import com.justeat.mickeydb.mickeyLang.UpdateStatement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class ModelUtil {
  /**
   * def static <T extends DDLStatement> ArrayList<T> findPreviousStatementsOfType(DDLStatement stmt, Class<T> statementType, boolean inclusive) {
   * var list = new ArrayList<T>()
   * 
   * var db = ModelUtil::getAncestorOfType(stmt, typeof(DatabaseBlock))
   * 
   * for(MigrationBlock migration : db.migrations) {
   * for(ddl : migration.statements) {
   * 
   * if(!inclusive) {
   * if(ddl == stmt) {
   * return list
   * }
   * }
   * 
   * if(statementType.isAssignableFrom(ddl.getClass())) {
   * list.add(ddl as T)
   * }
   * 
   * if(ddl == stmt) {
   * return list
   * }
   * }
   * }
   * 
   * if(ModelUtil::getAncestorOfType(stmt, typeof(InitBlock)) != null) {
   * for(ddl : db.init.statements) {
   * 
   * if(!inclusive) {
   * if(ddl == stmt) {
   * return list
   * }
   * }
   * 
   * if(statementType.isAssignableFrom(ddl.getClass())) {
   * list.add(ddl as T)
   * }
   * 
   * if(ddl == stmt) {
   * return list
   * }
   * }
   * }
   * 
   * return list
   * }
   * 
   * def static <T extends DDLStatement> ArrayList<T> findPreviousStatementsOfType(DatabaseBlock db, DDLStatement stmt, Class<T> statementType, boolean inclusive) {
   * var list = new ArrayList<T>()
   * 
   * for(MigrationBlock migration : db.migrations) {
   * for(ddl : migration.statements) {
   * 
   * if(!inclusive) {
   * if(ddl == stmt) {
   * return list
   * }
   * }
   * 
   * if(statementType.isAssignableFrom(ddl.getClass())) {
   * list.add(ddl as T)
   * }
   * 
   * if(ddl == stmt) {
   * return list
   * }
   * }
   * }
   * 
   * if(db.init != null) {
   * for(ddl : db.init.statements) {
   * 
   * if(!inclusive) {
   * if(ddl == stmt) {
   * return list
   * }
   * }
   * 
   * if(statementType.isAssignableFrom(ddl.getClass())) {
   * list.add(ddl as T)
   * }
   * 
   * if(ddl == stmt) {
   * return list
   * }
   * }
   * }
   * 
   * return list
   * }
   */
  public static <T extends EObject> T getAncestorOfType(final EObject obj, final Class<T> ancestorType) {
    EObject temp = ((EObject) obj);
    while ((!Objects.equal(temp.eContainer(), null))) {
      {
        EObject _eContainer = temp.eContainer();
        temp = _eContainer;
        Class<? extends EObject> _class = temp.getClass();
        boolean _isAssignableFrom = ancestorType.isAssignableFrom(_class);
        if (_isAssignableFrom) {
          return ((T) temp);
        }
      }
    }
    return null;
  }
  
  /**
   * walks back and visits each previous statement from the given statement, returning
   * false will cancel the process
   */
  public static void forEachPreviousStatement(final DDLStatement stmt, final Function1<DDLStatement, Boolean> delegate) {
    EObject current = ((EObject) stmt);
    MigrationBlock migration = null;
    do {
      {
        while ((!Objects.equal(EcoreUtil2.getPreviousSibling(current), null))) {
          {
            EObject _previousSibling = EcoreUtil2.getPreviousSibling(current);
            current = _previousSibling;
            Boolean _apply = delegate.apply(((DDLStatement) current));
            boolean _not = (!(_apply).booleanValue());
            if (_not) {
              return;
            }
          }
        }
        EObject _eContainer = current.eContainer();
        EObject previousContainer = EcoreUtil2.getPreviousSibling(_eContainer);
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(previousContainer, null));
        if (!_notEquals) {
          _and = false;
        } else {
          _and = (previousContainer instanceof MigrationBlock);
        }
        if (_and) {
          migration = ((MigrationBlock) previousContainer);
          EList<DDLStatement> _statements = migration.getStatements();
          DDLStatement _last = IterableExtensions.<DDLStatement>last(_statements);
          current = _last;
          boolean _equals = Objects.equal(current, null);
          if (_equals) {
            return;
          }
          Boolean _apply = delegate.apply(((DDLStatement) current));
          boolean _not = (!(_apply).booleanValue());
          if (_not) {
            return;
          }
        } else {
          migration = null;
        }
      }
    } while((!Objects.equal(migration, null)));
  }
  
  public static ArrayList<EObject> getAllReferenceableSingleSources(final SelectCoreExpression expr) {
    final ArrayList<EObject> items = Lists.<EObject>newArrayList();
    if ((expr instanceof SelectCore)) {
      SelectCoreExpression _left = ((SelectCore) expr).getLeft();
      ArrayList<EObject> _allReferenceableSingleSources = ModelUtil.getAllReferenceableSingleSources(_left);
      items.addAll(_allReferenceableSingleSources);
      SelectCoreExpression _right = ((SelectCore) expr).getRight();
      ArrayList<EObject> _allReferenceableSingleSources_1 = ModelUtil.getAllReferenceableSingleSources(_right);
      items.addAll(_allReferenceableSingleSources_1);
    } else {
      if ((expr instanceof SelectExpression)) {
        ArrayList<SingleSource> _findAllSingleSources = ModelUtil.findAllSingleSources(((SelectExpression) expr));
        items.addAll(_findAllSingleSources);
      }
    }
    return items;
  }
  
  public static ArrayList<SingleSource> findAllSingleSources(final SelectExpression expr) {
    final ArrayList<SingleSource> items = Lists.<SingleSource>newArrayList();
    JoinSource _source = expr.getSource();
    SingleSource _source_1 = _source.getSource();
    items.add(_source_1);
    JoinSource _source_2 = expr.getSource();
    EList<JoinStatement> _joinStatements = _source_2.getJoinStatements();
    for (final JoinStatement join : _joinStatements) {
      SingleSource _singleSource = join.getSingleSource();
      items.add(_singleSource);
    }
    return items;
  }
  
  public static ColumnType toColumnType(final SqliteDataType dt) {
    if (dt != null) {
      switch (dt) {
        case BLOB:
          return ColumnType.BLOB;
        case INTEGER:
          return ColumnType.INTEGER;
        case REAL:
          return ColumnType.REAL;
        default:
          break;
      }
    }
    return ColumnType.TEXT;
  }
  
  public static String toJavaTypeName(final ColumnType type) {
    if (type != null) {
      switch (type) {
        case TEXT:
          return "String";
        case INTEGER:
          return "long";
        case REAL:
          return "double";
        case BLOB:
          return "byte[]";
        case BOOLEAN:
          return "boolean";
        default:
          break;
      }
    }
    return "!!ERROR!!";
  }
  
  public static ColumnType getInferredColumnType(final ResultColumn col) {
    Expression expr = col.getExpression();
    boolean _matched = false;
    if (!_matched) {
      if (expr instanceof CastExpression) {
        _matched=true;
        SqliteDataType _type = ((CastExpression)expr).getType();
        return ModelUtil.toColumnType(_type);
      }
    }
    if (!_matched) {
      if (expr instanceof ColumnSourceRef) {
        _matched=true;
        ColumnSource _column = ((ColumnSourceRef)expr).getColumn();
        if ((_column instanceof ResultColumn)) {
          ColumnSource _column_1 = ((ColumnSourceRef)expr).getColumn();
          ColumnType _inferredColumnType = ModelUtil.getInferredColumnType(((ResultColumn) _column_1));
          return ((ColumnType) _inferredColumnType);
        } else {
          ColumnSource _column_2 = ((ColumnSourceRef)expr).getColumn();
          return ((ColumnDef) _column_2).getType();
        }
      }
    }
    if (!_matched) {
      if (expr instanceof ExprConcat) {
        _matched=true;
        return ColumnType.TEXT;
      }
    }
    if (!_matched) {
      if (expr instanceof Function) {
        _matched=true;
        boolean _or = false;
        boolean _or_1 = false;
        boolean _or_2 = false;
        boolean _or_3 = false;
        boolean _or_4 = false;
        String _name = ((Function)expr).getName();
        boolean _equalsIgnoreCase = _name.equalsIgnoreCase("count");
        if (_equalsIgnoreCase) {
          _or_4 = true;
        } else {
          String _name_1 = ((Function)expr).getName();
          boolean _equalsIgnoreCase_1 = _name_1.equalsIgnoreCase("length");
          _or_4 = _equalsIgnoreCase_1;
        }
        if (_or_4) {
          _or_3 = true;
        } else {
          String _name_2 = ((Function)expr).getName();
          boolean _equalsIgnoreCase_2 = _name_2.equalsIgnoreCase("random");
          _or_3 = _equalsIgnoreCase_2;
        }
        if (_or_3) {
          _or_2 = true;
        } else {
          String _name_3 = ((Function)expr).getName();
          boolean _equalsIgnoreCase_3 = _name_3.equalsIgnoreCase("last_insert_rowid");
          _or_2 = _equalsIgnoreCase_3;
        }
        if (_or_2) {
          _or_1 = true;
        } else {
          String _name_4 = ((Function)expr).getName();
          boolean _equalsIgnoreCase_4 = _name_4.equalsIgnoreCase("changes");
          _or_1 = _equalsIgnoreCase_4;
        }
        if (_or_1) {
          _or = true;
        } else {
          String _name_5 = ((Function)expr).getName();
          boolean _equalsIgnoreCase_5 = _name_5.equalsIgnoreCase("total_changes");
          _or = _equalsIgnoreCase_5;
        }
        if (_or) {
          return ColumnType.INTEGER;
        } else {
          boolean _or_5 = false;
          boolean _or_6 = false;
          boolean _or_7 = false;
          boolean _or_8 = false;
          boolean _or_9 = false;
          String _name_6 = ((Function)expr).getName();
          boolean _equalsIgnoreCase_6 = _name_6.equalsIgnoreCase("abs");
          if (_equalsIgnoreCase_6) {
            _or_9 = true;
          } else {
            String _name_7 = ((Function)expr).getName();
            boolean _equalsIgnoreCase_7 = _name_7.equalsIgnoreCase("avg");
            _or_9 = _equalsIgnoreCase_7;
          }
          if (_or_9) {
            _or_8 = true;
          } else {
            String _name_8 = ((Function)expr).getName();
            boolean _equalsIgnoreCase_8 = _name_8.equalsIgnoreCase("round");
            _or_8 = _equalsIgnoreCase_8;
          }
          if (_or_8) {
            _or_7 = true;
          } else {
            String _name_9 = ((Function)expr).getName();
            boolean _equalsIgnoreCase_9 = _name_9.equalsIgnoreCase("sum");
            _or_7 = _equalsIgnoreCase_9;
          }
          if (_or_7) {
            _or_6 = true;
          } else {
            String _name_10 = ((Function)expr).getName();
            boolean _equalsIgnoreCase_10 = _name_10.equalsIgnoreCase("total");
            _or_6 = _equalsIgnoreCase_10;
          }
          if (_or_6) {
            _or_5 = true;
          } else {
            String _name_11 = ((Function)expr).getName();
            boolean _equalsIgnoreCase_11 = _name_11.equalsIgnoreCase("likelihood");
            _or_5 = _equalsIgnoreCase_11;
          }
          if (_or_5) {
            return ColumnType.REAL;
          } else {
            boolean _or_10 = false;
            String _name_12 = ((Function)expr).getName();
            boolean _equalsIgnoreCase_12 = _name_12.equalsIgnoreCase("randomblob");
            if (_equalsIgnoreCase_12) {
              _or_10 = true;
            } else {
              String _name_13 = ((Function)expr).getName();
              boolean _equalsIgnoreCase_13 = _name_13.equalsIgnoreCase("zeroblob");
              _or_10 = _equalsIgnoreCase_13;
            }
            if (_or_10) {
              return ColumnType.BLOB;
            }
          }
        }
        return ColumnType.TEXT;
      }
    }
    return ColumnType.TEXT;
  }
  
  public static ArrayList<ColumnSource> getViewResultColumns(final CreateViewStatement stmt) {
    ArrayList<ColumnSource> result = new ArrayList<ColumnSource>();
    SelectStatement _selectStatement = stmt.getSelectStatement();
    SelectCoreExpression coreExpr = _selectStatement.getCore();
    if ((coreExpr instanceof SelectCore)) {
      SelectCore core = ((SelectCore) coreExpr);
      SelectCoreExpression _right = core.getRight();
      SelectList selectList = ((SelectExpression) _right).getSelectList();
      boolean _notEquals = (!Objects.equal(selectList, null));
      if (_notEquals) {
        EList<ColumnSource> _resultColumns = selectList.getResultColumns();
        final Function1<ColumnSource, Boolean> _function = new Function1<ColumnSource, Boolean>() {
          public Boolean apply(final ColumnSource it) {
            boolean _and = false;
            String _name = it.getName();
            boolean _notEquals = (!Objects.equal(_name, null));
            if (!_notEquals) {
              _and = false;
            } else {
              String _name_1 = it.getName();
              boolean _equals = _name_1.equals("");
              boolean _not = (!_equals);
              _and = _not;
            }
            return Boolean.valueOf(_and);
          }
        };
        Iterable<ColumnSource> _filter = IterableExtensions.<ColumnSource>filter(_resultColumns, _function);
        Iterables.<ColumnSource>addAll(result, _filter);
      }
    } else {
      SelectList selectList_1 = ((SelectExpression) coreExpr).getSelectList();
      boolean _notEquals_1 = (!Objects.equal(selectList_1, null));
      if (_notEquals_1) {
        EList<ColumnSource> _resultColumns_1 = selectList_1.getResultColumns();
        final Function1<ColumnSource, Boolean> _function_1 = new Function1<ColumnSource, Boolean>() {
          public Boolean apply(final ColumnSource it) {
            boolean _and = false;
            String _name = it.getName();
            boolean _notEquals = (!Objects.equal(_name, null));
            if (!_notEquals) {
              _and = false;
            } else {
              String _name_1 = it.getName();
              boolean _equals = _name_1.equals("");
              boolean _not = (!_equals);
              _and = _not;
            }
            return Boolean.valueOf(_and);
          }
        };
        Iterable<ColumnSource> _filter_1 = IterableExtensions.<ColumnSource>filter(_resultColumns_1, _function_1);
        Iterables.<ColumnSource>addAll(result, _filter_1);
      }
    }
    return result;
  }
  
  public static HashSet<CreateViewStatement> getAllViewsReferencingTable(final SqliteDatabaseSnapshot snapshot, final TableDefinition tableDef) {
    HashSet<CreateViewStatement> matches = new HashSet<CreateViewStatement>();
    ArrayList<CreateViewStatement> _views = snapshot.getViews();
    for (final CreateViewStatement view : _views) {
      boolean _isDefinitionReferencedByView = ModelUtil.isDefinitionReferencedByView(tableDef, view);
      if (_isDefinitionReferencedByView) {
        matches.add(view);
      }
    }
    return matches;
  }
  
  public static HashSet<CreateViewStatement> getAllViewsInConfigInitReferencingTable(final MickeyDatabaseModel model, final TableDefinition tableDef) {
    HashSet<CreateViewStatement> matches = new HashSet<CreateViewStatement>();
    for (final CreateViewStatement view : model.initViews) {
      boolean _isDefinitionReferencedByView = ModelUtil.isDefinitionReferencedByView(tableDef, view);
      if (_isDefinitionReferencedByView) {
        matches.add(view);
      }
    }
    return matches;
  }
  
  public static boolean isDefinitionReferencedByView(final TableDefinition tableDef, final CreateViewStatement view) {
    TreeIterator<EObject> _eAllContents = view.eAllContents();
    final Function1<EObject, Boolean> _function = new Function1<EObject, Boolean>() {
      public Boolean apply(final EObject obj) {
        if ((obj instanceof SingleSourceTable)) {
          SingleSourceTable sourceTable = ((SingleSourceTable) obj);
          TableDefinition _tableReference = sourceTable.getTableReference();
          if ((!(_tableReference instanceof CreateViewStatement))) {
            TableDefinition _tableReference_1 = sourceTable.getTableReference();
            String _name = _tableReference_1.getName();
            String _name_1 = tableDef.getName();
            boolean _equals = _name.equals(_name_1);
            if (_equals) {
              return Boolean.valueOf(true);
            }
          } else {
            TableDefinition _tableReference_2 = sourceTable.getTableReference();
            return Boolean.valueOf(ModelUtil.isDefinitionReferencedByView(tableDef, ((CreateViewStatement) _tableReference_2)));
          }
        }
        return Boolean.valueOf(false);
      }
    };
    return IteratorExtensions.<EObject>exists(_eAllContents, _function);
  }
  
  public static boolean hasAndroidPrimaryKey(final CreateTableStatement stmt) {
    EList<ColumnSource> _columnDefs = stmt.getColumnDefs();
    final Function1<ColumnSource, Boolean> _function = new Function1<ColumnSource, Boolean>() {
      public Boolean apply(final ColumnSource it) {
        String _name = it.getName();
        return Boolean.valueOf(_name.equals("_id"));
      }
    };
    return IterableExtensions.<ColumnSource>exists(_columnDefs, _function);
  }
  
  public static boolean hasAndroidPrimaryKey(final CreateViewStatement stmt) {
    ArrayList<ColumnSource> _viewResultColumns = ModelUtil.getViewResultColumns(stmt);
    final Function1<ColumnSource, Boolean> _function = new Function1<ColumnSource, Boolean>() {
      public Boolean apply(final ColumnSource it) {
        boolean _and = false;
        String _name = it.getName();
        boolean _isEmpty = Strings.isEmpty(_name);
        boolean _not = (!_isEmpty);
        if (!_not) {
          _and = false;
        } else {
          String _name_1 = it.getName();
          boolean _equals = _name_1.equals("_id");
          _and = _equals;
        }
        return Boolean.valueOf(_and);
      }
    };
    return IterableExtensions.<ColumnSource>exists(_viewResultColumns, _function);
  }
  
  /**
   * Find column definitions from caller going back to the definition
   */
  public static LinkedList<TableDefinition> getHistory(final TableDefinition ref) {
    LinkedList<TableDefinition> refs = new LinkedList<TableDefinition>();
    TableDefinition current = ref;
    while ((current instanceof AlterTableRenameStatement)) {
      {
        refs.add(current);
        TableDefinition _table = ((AlterTableRenameStatement) current).getTable();
        current = _table;
      }
    }
    refs.add(current);
    return refs;
  }
  
  public static MickeyFile getModel(final EObject ele) {
    EObject e = ele;
    do {
      EObject _eContainer = e.eContainer();
      e = _eContainer;
    } while((!(e instanceof MickeyFile)));
    return ((MickeyFile) e);
  }
  
  public static <T extends Object> T getContainerOfType(final EObject element, final Class<T> type) {
    EObject ele = element;
    do {
      {
        EObject _eContainer = ele.eContainer();
        ele = _eContainer;
        boolean _equals = Objects.equal(ele, null);
        if (_equals) {
          return null;
        }
      }
    } while((!type.isAssignableFrom(ele.getClass())));
    return ((T) ele);
  }
  
  public static String getFeatureNodeText(final EObject obj, final EReference reference) {
    List<INode> nodes = NodeModelUtils.findNodesForFeature(obj, reference);
    INode _get = nodes.get(0);
    return NodeModelUtils.getTokenText(_get);
  }
  
  public static Object getAllColumnsForTableName(final ArrayList<EObject> allContents, final String tableName) {
    return null;
  }
  
  public static String getTargetTableName(final DMLStatement statement) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (statement instanceof UpdateStatement) {
        _matched=true;
        _switchResult = ModelUtil.getFeatureNodeText(statement, MickeyLangPackage.Literals.UPDATE_STATEMENT__TABLE);
      }
    }
    if (!_matched) {
      if (statement instanceof InsertStatement) {
        _matched=true;
        _switchResult = ModelUtil.getFeatureNodeText(statement, MickeyLangPackage.Literals.INSERT_STATEMENT__TABLE);
      }
    }
    if (!_matched) {
      if (statement instanceof DeleteStatement) {
        _matched=true;
        _switchResult = ModelUtil.getFeatureNodeText(statement, MickeyLangPackage.Literals.DELETE_STATEMENT__TABLE);
      }
    }
    return _switchResult;
  }
}
