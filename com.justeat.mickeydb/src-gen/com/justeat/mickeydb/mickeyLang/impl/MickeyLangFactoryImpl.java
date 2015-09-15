/**
 */
package com.justeat.mickeydb.mickeyLang.impl;

import com.justeat.mickeydb.mickeyLang.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MickeyLangFactoryImpl extends EFactoryImpl implements MickeyLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MickeyLangFactory init()
  {
    try
    {
      MickeyLangFactory theMickeyLangFactory = (MickeyLangFactory)EPackage.Registry.INSTANCE.getEFactory(MickeyLangPackage.eNS_URI);
      if (theMickeyLangFactory != null)
      {
        return theMickeyLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MickeyLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MickeyLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MickeyLangPackage.MICKEY_FILE: return createMickeyFile();
      case MickeyLangPackage.MICKEY_BLOCK: return createMickeyBlock();
      case MickeyLangPackage.MICKEY_FUNCTION: return createMickeyFunction();
      case MickeyLangPackage.ACTION_STATEMENT: return createActionStatement();
      case MickeyLangPackage.FUNCTION_ARG: return createFunctionArg();
      case MickeyLangPackage.CONTENT_URI: return createContentUri();
      case MickeyLangPackage.CONTENT_URI_PARAM: return createContentUriParam();
      case MickeyLangPackage.CONTENT_URI_SEGMENT: return createContentUriSegment();
      case MickeyLangPackage.MIGRATION_BLOCK: return createMigrationBlock();
      case MickeyLangPackage.EXPRESSION: return createExpression();
      case MickeyLangPackage.CASE: return createCase();
      case MickeyLangPackage.SELECT_STATEMENT: return createSelectStatement();
      case MickeyLangPackage.ORDERING_TERM_LIST: return createOrderingTermList();
      case MickeyLangPackage.SELECT_CORE_EXPRESSION: return createSelectCoreExpression();
      case MickeyLangPackage.SELECT_LIST: return createSelectList();
      case MickeyLangPackage.WHERE_EXPRESSIONS: return createWhereExpressions();
      case MickeyLangPackage.GROUP_BY_EXPRESSIONS: return createGroupByExpressions();
      case MickeyLangPackage.HAVING_EXPRESSIONS: return createHavingExpressions();
      case MickeyLangPackage.ORDERING_TERM: return createOrderingTerm();
      case MickeyLangPackage.JOIN_SOURCE: return createJoinSource();
      case MickeyLangPackage.SINGLE_SOURCE: return createSingleSource();
      case MickeyLangPackage.SELECT_SOURCE: return createSelectSource();
      case MickeyLangPackage.SINGLE_SOURCE_JOIN: return createSingleSourceJoin();
      case MickeyLangPackage.JOIN_STATEMENT: return createJoinStatement();
      case MickeyLangPackage.COLUMN_SOURCE: return createColumnSource();
      case MickeyLangPackage.LITERAL_VALUE: return createLiteralValue();
      case MickeyLangPackage.DDL_STATEMENT: return createDDLStatement();
      case MickeyLangPackage.TABLE_DEFINITION: return createTableDefinition();
      case MickeyLangPackage.CREATE_TRIGGER_STATEMENT: return createCreateTriggerStatement();
      case MickeyLangPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT: return createAlterTableAddColumnStatement();
      case MickeyLangPackage.DROP_TABLE_STATEMENT: return createDropTableStatement();
      case MickeyLangPackage.DROP_TRIGGER_STATEMENT: return createDropTriggerStatement();
      case MickeyLangPackage.DROP_VIEW_STATEMENT: return createDropViewStatement();
      case MickeyLangPackage.CREATE_INDEX_STATEMENT: return createCreateIndexStatement();
      case MickeyLangPackage.DROP_INDEX_STATEMENT: return createDropIndexStatement();
      case MickeyLangPackage.COLUMN_CONSTRAINT: return createColumnConstraint();
      case MickeyLangPackage.TABLE_CONSTRAINT: return createTableConstraint();
      case MickeyLangPackage.UNIQUE_TABLE_CONSTRAINT: return createUniqueTableConstraint();
      case MickeyLangPackage.PRIMARY_CONSTRAINT: return createPrimaryConstraint();
      case MickeyLangPackage.CHECK_TABLE_CONSTRAINT: return createCheckTableConstraint();
      case MickeyLangPackage.INDEXED_COLUMN: return createIndexedColumn();
      case MickeyLangPackage.DEFAULT_VALUE: return createDefaultValue();
      case MickeyLangPackage.CONFLICT_CLAUSE: return createConflictClause();
      case MickeyLangPackage.DML_STATEMENT: return createDMLStatement();
      case MickeyLangPackage.DELETE_STATEMENT: return createDeleteStatement();
      case MickeyLangPackage.INSERT_STATEMENT: return createInsertStatement();
      case MickeyLangPackage.UPDATE_STATEMENT: return createUpdateStatement();
      case MickeyLangPackage.UPDATE_COLUMN_EXPRESSION: return createUpdateColumnExpression();
      case MickeyLangPackage.CONTENT_URI_PARAM_SEGMENT: return createContentUriParamSegment();
      case MickeyLangPackage.EXPR_CONCAT: return createExprConcat();
      case MickeyLangPackage.EXPR_MULT: return createExprMult();
      case MickeyLangPackage.EXPR_ADD: return createExprAdd();
      case MickeyLangPackage.EXPR_BIT: return createExprBit();
      case MickeyLangPackage.EXPR_RELATE: return createExprRelate();
      case MickeyLangPackage.EXPR_EQUAL: return createExprEqual();
      case MickeyLangPackage.EXPR_AND: return createExprAnd();
      case MickeyLangPackage.EXPR_OR: return createExprOr();
      case MickeyLangPackage.NULL_CHECK_EXPRESSION: return createNullCheckExpression();
      case MickeyLangPackage.IS_NULL: return createIsNull();
      case MickeyLangPackage.NOT_NULL: return createNotNull();
      case MickeyLangPackage.NEW_COLUMN: return createNewColumn();
      case MickeyLangPackage.OLD_COLUMN: return createOldColumn();
      case MickeyLangPackage.COLUMN_SOURCE_REF: return createColumnSourceRef();
      case MickeyLangPackage.LITERAL: return createLiteral();
      case MickeyLangPackage.NESTED_EXPRESSION: return createNestedExpression();
      case MickeyLangPackage.SELECT_STATEMENT_EXPRESSION: return createSelectStatementExpression();
      case MickeyLangPackage.CASE_EXPRESSION: return createCaseExpression();
      case MickeyLangPackage.FUNCTION: return createFunction();
      case MickeyLangPackage.CAST_EXPRESSION: return createCastExpression();
      case MickeyLangPackage.FUNCTION_ARGUMENT: return createFunctionArgument();
      case MickeyLangPackage.SELECT_CORE: return createSelectCore();
      case MickeyLangPackage.SELECT_EXPRESSION: return createSelectExpression();
      case MickeyLangPackage.SINGLE_SOURCE_TABLE: return createSingleSourceTable();
      case MickeyLangPackage.SINGLE_SOURCE_SELECT_STATEMENT: return createSingleSourceSelectStatement();
      case MickeyLangPackage.RESULT_COLUMN: return createResultColumn();
      case MickeyLangPackage.NUMERIC_LITERAL: return createNumericLiteral();
      case MickeyLangPackage.STRING_LITERAL: return createStringLiteral();
      case MickeyLangPackage.NULL_LITERAL: return createNullLiteral();
      case MickeyLangPackage.CURRENT_TIME_LITERAL: return createCurrentTimeLiteral();
      case MickeyLangPackage.CURRENT_DATE_LITERAL: return createCurrentDateLiteral();
      case MickeyLangPackage.CURRENT_TIME_STAMP_LITERAL: return createCurrentTimeStampLiteral();
      case MickeyLangPackage.CREATE_TABLE_STATEMENT: return createCreateTableStatement();
      case MickeyLangPackage.CREATE_VIEW_STATEMENT: return createCreateViewStatement();
      case MickeyLangPackage.ALTER_TABLE_RENAME_STATEMENT: return createAlterTableRenameStatement();
      case MickeyLangPackage.COLUMN_DEF: return createColumnDef();
      case MickeyLangPackage.PRIMARY_KEY_COLUMN_CONSTRAINT: return createPrimaryKeyColumnConstraint();
      case MickeyLangPackage.NOT_NULL_CONSTRAINT: return createNotNullConstraint();
      case MickeyLangPackage.UNIQUE_CONSTRAINT: return createUniqueConstraint();
      case MickeyLangPackage.DEFAULT_CONSTRAINT: return createDefaultConstraint();
      case MickeyLangPackage.CHECK_CONSTRAINT: return createCheckConstraint();
      case MickeyLangPackage.LITERAL_DEFAULT_VALUE: return createLiteralDefaultValue();
      case MickeyLangPackage.EXPRESSION_DEFAULT_VALUE: return createExpressionDefaultValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MickeyLangPackage.COMPOUND_OPERATOR:
        return createCompoundOperatorFromString(eDataType, initialValue);
      case MickeyLangPackage.SQLITE_DATA_TYPE:
        return createSqliteDataTypeFromString(eDataType, initialValue);
      case MickeyLangPackage.COLUMN_TYPE:
        return createColumnTypeFromString(eDataType, initialValue);
      case MickeyLangPackage.CONFLICT_RESOLUTION:
        return createConflictResolutionFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MickeyLangPackage.COMPOUND_OPERATOR:
        return convertCompoundOperatorToString(eDataType, instanceValue);
      case MickeyLangPackage.SQLITE_DATA_TYPE:
        return convertSqliteDataTypeToString(eDataType, instanceValue);
      case MickeyLangPackage.COLUMN_TYPE:
        return convertColumnTypeToString(eDataType, instanceValue);
      case MickeyLangPackage.CONFLICT_RESOLUTION:
        return convertConflictResolutionToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MickeyFile createMickeyFile()
  {
    MickeyFileImpl mickeyFile = new MickeyFileImpl();
    return mickeyFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MickeyBlock createMickeyBlock()
  {
    MickeyBlockImpl mickeyBlock = new MickeyBlockImpl();
    return mickeyBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MickeyFunction createMickeyFunction()
  {
    MickeyFunctionImpl mickeyFunction = new MickeyFunctionImpl();
    return mickeyFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionStatement createActionStatement()
  {
    ActionStatementImpl actionStatement = new ActionStatementImpl();
    return actionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionArg createFunctionArg()
  {
    FunctionArgImpl functionArg = new FunctionArgImpl();
    return functionArg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentUri createContentUri()
  {
    ContentUriImpl contentUri = new ContentUriImpl();
    return contentUri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentUriParam createContentUriParam()
  {
    ContentUriParamImpl contentUriParam = new ContentUriParamImpl();
    return contentUriParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentUriSegment createContentUriSegment()
  {
    ContentUriSegmentImpl contentUriSegment = new ContentUriSegmentImpl();
    return contentUriSegment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MigrationBlock createMigrationBlock()
  {
    MigrationBlockImpl migrationBlock = new MigrationBlockImpl();
    return migrationBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case createCase()
  {
    CaseImpl case_ = new CaseImpl();
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectStatement createSelectStatement()
  {
    SelectStatementImpl selectStatement = new SelectStatementImpl();
    return selectStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderingTermList createOrderingTermList()
  {
    OrderingTermListImpl orderingTermList = new OrderingTermListImpl();
    return orderingTermList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectCoreExpression createSelectCoreExpression()
  {
    SelectCoreExpressionImpl selectCoreExpression = new SelectCoreExpressionImpl();
    return selectCoreExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectList createSelectList()
  {
    SelectListImpl selectList = new SelectListImpl();
    return selectList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhereExpressions createWhereExpressions()
  {
    WhereExpressionsImpl whereExpressions = new WhereExpressionsImpl();
    return whereExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupByExpressions createGroupByExpressions()
  {
    GroupByExpressionsImpl groupByExpressions = new GroupByExpressionsImpl();
    return groupByExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HavingExpressions createHavingExpressions()
  {
    HavingExpressionsImpl havingExpressions = new HavingExpressionsImpl();
    return havingExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderingTerm createOrderingTerm()
  {
    OrderingTermImpl orderingTerm = new OrderingTermImpl();
    return orderingTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinSource createJoinSource()
  {
    JoinSourceImpl joinSource = new JoinSourceImpl();
    return joinSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleSource createSingleSource()
  {
    SingleSourceImpl singleSource = new SingleSourceImpl();
    return singleSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectSource createSelectSource()
  {
    SelectSourceImpl selectSource = new SelectSourceImpl();
    return selectSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleSourceJoin createSingleSourceJoin()
  {
    SingleSourceJoinImpl singleSourceJoin = new SingleSourceJoinImpl();
    return singleSourceJoin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinStatement createJoinStatement()
  {
    JoinStatementImpl joinStatement = new JoinStatementImpl();
    return joinStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnSource createColumnSource()
  {
    ColumnSourceImpl columnSource = new ColumnSourceImpl();
    return columnSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralValue createLiteralValue()
  {
    LiteralValueImpl literalValue = new LiteralValueImpl();
    return literalValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DDLStatement createDDLStatement()
  {
    DDLStatementImpl ddlStatement = new DDLStatementImpl();
    return ddlStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableDefinition createTableDefinition()
  {
    TableDefinitionImpl tableDefinition = new TableDefinitionImpl();
    return tableDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateTriggerStatement createCreateTriggerStatement()
  {
    CreateTriggerStatementImpl createTriggerStatement = new CreateTriggerStatementImpl();
    return createTriggerStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlterTableAddColumnStatement createAlterTableAddColumnStatement()
  {
    AlterTableAddColumnStatementImpl alterTableAddColumnStatement = new AlterTableAddColumnStatementImpl();
    return alterTableAddColumnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DropTableStatement createDropTableStatement()
  {
    DropTableStatementImpl dropTableStatement = new DropTableStatementImpl();
    return dropTableStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DropTriggerStatement createDropTriggerStatement()
  {
    DropTriggerStatementImpl dropTriggerStatement = new DropTriggerStatementImpl();
    return dropTriggerStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DropViewStatement createDropViewStatement()
  {
    DropViewStatementImpl dropViewStatement = new DropViewStatementImpl();
    return dropViewStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateIndexStatement createCreateIndexStatement()
  {
    CreateIndexStatementImpl createIndexStatement = new CreateIndexStatementImpl();
    return createIndexStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DropIndexStatement createDropIndexStatement()
  {
    DropIndexStatementImpl dropIndexStatement = new DropIndexStatementImpl();
    return dropIndexStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnConstraint createColumnConstraint()
  {
    ColumnConstraintImpl columnConstraint = new ColumnConstraintImpl();
    return columnConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableConstraint createTableConstraint()
  {
    TableConstraintImpl tableConstraint = new TableConstraintImpl();
    return tableConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UniqueTableConstraint createUniqueTableConstraint()
  {
    UniqueTableConstraintImpl uniqueTableConstraint = new UniqueTableConstraintImpl();
    return uniqueTableConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryConstraint createPrimaryConstraint()
  {
    PrimaryConstraintImpl primaryConstraint = new PrimaryConstraintImpl();
    return primaryConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckTableConstraint createCheckTableConstraint()
  {
    CheckTableConstraintImpl checkTableConstraint = new CheckTableConstraintImpl();
    return checkTableConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexedColumn createIndexedColumn()
  {
    IndexedColumnImpl indexedColumn = new IndexedColumnImpl();
    return indexedColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultValue createDefaultValue()
  {
    DefaultValueImpl defaultValue = new DefaultValueImpl();
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConflictClause createConflictClause()
  {
    ConflictClauseImpl conflictClause = new ConflictClauseImpl();
    return conflictClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DMLStatement createDMLStatement()
  {
    DMLStatementImpl dmlStatement = new DMLStatementImpl();
    return dmlStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeleteStatement createDeleteStatement()
  {
    DeleteStatementImpl deleteStatement = new DeleteStatementImpl();
    return deleteStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertStatement createInsertStatement()
  {
    InsertStatementImpl insertStatement = new InsertStatementImpl();
    return insertStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateStatement createUpdateStatement()
  {
    UpdateStatementImpl updateStatement = new UpdateStatementImpl();
    return updateStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateColumnExpression createUpdateColumnExpression()
  {
    UpdateColumnExpressionImpl updateColumnExpression = new UpdateColumnExpressionImpl();
    return updateColumnExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentUriParamSegment createContentUriParamSegment()
  {
    ContentUriParamSegmentImpl contentUriParamSegment = new ContentUriParamSegmentImpl();
    return contentUriParamSegment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprConcat createExprConcat()
  {
    ExprConcatImpl exprConcat = new ExprConcatImpl();
    return exprConcat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprMult createExprMult()
  {
    ExprMultImpl exprMult = new ExprMultImpl();
    return exprMult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprAdd createExprAdd()
  {
    ExprAddImpl exprAdd = new ExprAddImpl();
    return exprAdd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprBit createExprBit()
  {
    ExprBitImpl exprBit = new ExprBitImpl();
    return exprBit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprRelate createExprRelate()
  {
    ExprRelateImpl exprRelate = new ExprRelateImpl();
    return exprRelate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprEqual createExprEqual()
  {
    ExprEqualImpl exprEqual = new ExprEqualImpl();
    return exprEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprAnd createExprAnd()
  {
    ExprAndImpl exprAnd = new ExprAndImpl();
    return exprAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprOr createExprOr()
  {
    ExprOrImpl exprOr = new ExprOrImpl();
    return exprOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullCheckExpression createNullCheckExpression()
  {
    NullCheckExpressionImpl nullCheckExpression = new NullCheckExpressionImpl();
    return nullCheckExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsNull createIsNull()
  {
    IsNullImpl isNull = new IsNullImpl();
    return isNull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotNull createNotNull()
  {
    NotNullImpl notNull = new NotNullImpl();
    return notNull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewColumn createNewColumn()
  {
    NewColumnImpl newColumn = new NewColumnImpl();
    return newColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OldColumn createOldColumn()
  {
    OldColumnImpl oldColumn = new OldColumnImpl();
    return oldColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnSourceRef createColumnSourceRef()
  {
    ColumnSourceRefImpl columnSourceRef = new ColumnSourceRefImpl();
    return columnSourceRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedExpression createNestedExpression()
  {
    NestedExpressionImpl nestedExpression = new NestedExpressionImpl();
    return nestedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectStatementExpression createSelectStatementExpression()
  {
    SelectStatementExpressionImpl selectStatementExpression = new SelectStatementExpressionImpl();
    return selectStatementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseExpression createCaseExpression()
  {
    CaseExpressionImpl caseExpression = new CaseExpressionImpl();
    return caseExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastExpression createCastExpression()
  {
    CastExpressionImpl castExpression = new CastExpressionImpl();
    return castExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionArgument createFunctionArgument()
  {
    FunctionArgumentImpl functionArgument = new FunctionArgumentImpl();
    return functionArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectCore createSelectCore()
  {
    SelectCoreImpl selectCore = new SelectCoreImpl();
    return selectCore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectExpression createSelectExpression()
  {
    SelectExpressionImpl selectExpression = new SelectExpressionImpl();
    return selectExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleSourceTable createSingleSourceTable()
  {
    SingleSourceTableImpl singleSourceTable = new SingleSourceTableImpl();
    return singleSourceTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleSourceSelectStatement createSingleSourceSelectStatement()
  {
    SingleSourceSelectStatementImpl singleSourceSelectStatement = new SingleSourceSelectStatementImpl();
    return singleSourceSelectStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultColumn createResultColumn()
  {
    ResultColumnImpl resultColumn = new ResultColumnImpl();
    return resultColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericLiteral createNumericLiteral()
  {
    NumericLiteralImpl numericLiteral = new NumericLiteralImpl();
    return numericLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullLiteral createNullLiteral()
  {
    NullLiteralImpl nullLiteral = new NullLiteralImpl();
    return nullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurrentTimeLiteral createCurrentTimeLiteral()
  {
    CurrentTimeLiteralImpl currentTimeLiteral = new CurrentTimeLiteralImpl();
    return currentTimeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurrentDateLiteral createCurrentDateLiteral()
  {
    CurrentDateLiteralImpl currentDateLiteral = new CurrentDateLiteralImpl();
    return currentDateLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurrentTimeStampLiteral createCurrentTimeStampLiteral()
  {
    CurrentTimeStampLiteralImpl currentTimeStampLiteral = new CurrentTimeStampLiteralImpl();
    return currentTimeStampLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateTableStatement createCreateTableStatement()
  {
    CreateTableStatementImpl createTableStatement = new CreateTableStatementImpl();
    return createTableStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateViewStatement createCreateViewStatement()
  {
    CreateViewStatementImpl createViewStatement = new CreateViewStatementImpl();
    return createViewStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlterTableRenameStatement createAlterTableRenameStatement()
  {
    AlterTableRenameStatementImpl alterTableRenameStatement = new AlterTableRenameStatementImpl();
    return alterTableRenameStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnDef createColumnDef()
  {
    ColumnDefImpl columnDef = new ColumnDefImpl();
    return columnDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryKeyColumnConstraint createPrimaryKeyColumnConstraint()
  {
    PrimaryKeyColumnConstraintImpl primaryKeyColumnConstraint = new PrimaryKeyColumnConstraintImpl();
    return primaryKeyColumnConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotNullConstraint createNotNullConstraint()
  {
    NotNullConstraintImpl notNullConstraint = new NotNullConstraintImpl();
    return notNullConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UniqueConstraint createUniqueConstraint()
  {
    UniqueConstraintImpl uniqueConstraint = new UniqueConstraintImpl();
    return uniqueConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultConstraint createDefaultConstraint()
  {
    DefaultConstraintImpl defaultConstraint = new DefaultConstraintImpl();
    return defaultConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckConstraint createCheckConstraint()
  {
    CheckConstraintImpl checkConstraint = new CheckConstraintImpl();
    return checkConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralDefaultValue createLiteralDefaultValue()
  {
    LiteralDefaultValueImpl literalDefaultValue = new LiteralDefaultValueImpl();
    return literalDefaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionDefaultValue createExpressionDefaultValue()
  {
    ExpressionDefaultValueImpl expressionDefaultValue = new ExpressionDefaultValueImpl();
    return expressionDefaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompoundOperator createCompoundOperatorFromString(EDataType eDataType, String initialValue)
  {
    CompoundOperator result = CompoundOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCompoundOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqliteDataType createSqliteDataTypeFromString(EDataType eDataType, String initialValue)
  {
    SqliteDataType result = SqliteDataType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSqliteDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnType createColumnTypeFromString(EDataType eDataType, String initialValue)
  {
    ColumnType result = ColumnType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertColumnTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConflictResolution createConflictResolutionFromString(EDataType eDataType, String initialValue)
  {
    ConflictResolution result = ConflictResolution.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConflictResolutionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MickeyLangPackage getMickeyLangPackage()
  {
    return (MickeyLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MickeyLangPackage getPackage()
  {
    return MickeyLangPackage.eINSTANCE;
  }

} //MickeyLangFactoryImpl
