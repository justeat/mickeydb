package com.justeat.mickeydb.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.justeat.mickeydb.mickeyLang.ActionStatement;
import com.justeat.mickeydb.mickeyLang.AlterTableAddColumnStatement;
import com.justeat.mickeydb.mickeyLang.AlterTableRenameStatement;
import com.justeat.mickeydb.mickeyLang.Case;
import com.justeat.mickeydb.mickeyLang.CaseExpression;
import com.justeat.mickeydb.mickeyLang.CastExpression;
import com.justeat.mickeydb.mickeyLang.CheckConstraint;
import com.justeat.mickeydb.mickeyLang.CheckTableConstraint;
import com.justeat.mickeydb.mickeyLang.ColumnDef;
import com.justeat.mickeydb.mickeyLang.ColumnSourceRef;
import com.justeat.mickeydb.mickeyLang.ConflictClause;
import com.justeat.mickeydb.mickeyLang.ContentUri;
import com.justeat.mickeydb.mickeyLang.ContentUriParamSegment;
import com.justeat.mickeydb.mickeyLang.ContentUriQueryParam;
import com.justeat.mickeydb.mickeyLang.ContentUriSegment;
import com.justeat.mickeydb.mickeyLang.CreateIndexStatement;
import com.justeat.mickeydb.mickeyLang.CreateTableStatement;
import com.justeat.mickeydb.mickeyLang.CreateTriggerStatement;
import com.justeat.mickeydb.mickeyLang.CreateViewStatement;
import com.justeat.mickeydb.mickeyLang.CurrentDateLiteral;
import com.justeat.mickeydb.mickeyLang.CurrentTimeLiteral;
import com.justeat.mickeydb.mickeyLang.CurrentTimeStampLiteral;
import com.justeat.mickeydb.mickeyLang.DefaultConstraint;
import com.justeat.mickeydb.mickeyLang.DeleteStatement;
import com.justeat.mickeydb.mickeyLang.DropIndexStatement;
import com.justeat.mickeydb.mickeyLang.DropTableStatement;
import com.justeat.mickeydb.mickeyLang.DropTriggerStatement;
import com.justeat.mickeydb.mickeyLang.DropViewStatement;
import com.justeat.mickeydb.mickeyLang.ExprAdd;
import com.justeat.mickeydb.mickeyLang.ExprAnd;
import com.justeat.mickeydb.mickeyLang.ExprBit;
import com.justeat.mickeydb.mickeyLang.ExprConcat;
import com.justeat.mickeydb.mickeyLang.ExprEqual;
import com.justeat.mickeydb.mickeyLang.ExprMult;
import com.justeat.mickeydb.mickeyLang.ExprOr;
import com.justeat.mickeydb.mickeyLang.ExprRelate;
import com.justeat.mickeydb.mickeyLang.ExpressionDefaultValue;
import com.justeat.mickeydb.mickeyLang.Function;
import com.justeat.mickeydb.mickeyLang.FunctionArg;
import com.justeat.mickeydb.mickeyLang.FunctionArgument;
import com.justeat.mickeydb.mickeyLang.GroupByExpressions;
import com.justeat.mickeydb.mickeyLang.HavingExpressions;
import com.justeat.mickeydb.mickeyLang.IndexedColumn;
import com.justeat.mickeydb.mickeyLang.InsertStatement;
import com.justeat.mickeydb.mickeyLang.IsNull;
import com.justeat.mickeydb.mickeyLang.JoinSource;
import com.justeat.mickeydb.mickeyLang.JoinStatement;
import com.justeat.mickeydb.mickeyLang.Literal;
import com.justeat.mickeydb.mickeyLang.LiteralDefaultValue;
import com.justeat.mickeydb.mickeyLang.MickeyFile;
import com.justeat.mickeydb.mickeyLang.MickeyFunction;
import com.justeat.mickeydb.mickeyLang.MickeyLangPackage;
import com.justeat.mickeydb.mickeyLang.MigrationBlock;
import com.justeat.mickeydb.mickeyLang.NestedExpression;
import com.justeat.mickeydb.mickeyLang.NewColumn;
import com.justeat.mickeydb.mickeyLang.NotNull;
import com.justeat.mickeydb.mickeyLang.NotNullConstraint;
import com.justeat.mickeydb.mickeyLang.NullCheckExpression;
import com.justeat.mickeydb.mickeyLang.NullLiteral;
import com.justeat.mickeydb.mickeyLang.NumericLiteral;
import com.justeat.mickeydb.mickeyLang.OldColumn;
import com.justeat.mickeydb.mickeyLang.OrderingTerm;
import com.justeat.mickeydb.mickeyLang.OrderingTermList;
import com.justeat.mickeydb.mickeyLang.PrimaryConstraint;
import com.justeat.mickeydb.mickeyLang.PrimaryKeyColumnConstraint;
import com.justeat.mickeydb.mickeyLang.ResultColumn;
import com.justeat.mickeydb.mickeyLang.SelectCore;
import com.justeat.mickeydb.mickeyLang.SelectExpression;
import com.justeat.mickeydb.mickeyLang.SelectList;
import com.justeat.mickeydb.mickeyLang.SelectStatement;
import com.justeat.mickeydb.mickeyLang.SelectStatementExpression;
import com.justeat.mickeydb.mickeyLang.SingleSourceJoin;
import com.justeat.mickeydb.mickeyLang.SingleSourceSelectStatement;
import com.justeat.mickeydb.mickeyLang.SingleSourceTable;
import com.justeat.mickeydb.mickeyLang.StringLiteral;
import com.justeat.mickeydb.mickeyLang.UniqueConstraint;
import com.justeat.mickeydb.mickeyLang.UniqueTableConstraint;
import com.justeat.mickeydb.mickeyLang.UpdateColumnExpression;
import com.justeat.mickeydb.mickeyLang.UpdateStatement;
import com.justeat.mickeydb.mickeyLang.WhereExpressions;
import com.justeat.mickeydb.services.MickeyLangGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MickeyLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MickeyLangGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MickeyLangPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MickeyLangPackage.ACTION_STATEMENT:
				if(context == grammarAccess.getActionStatementRule() ||
				   context == grammarAccess.getMickeyBlockRule()) {
					sequence_ActionStatement(context, (ActionStatement) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.ALTER_TABLE_ADD_COLUMN_STATEMENT:
				if(context == grammarAccess.getAlterTableAddColumnStatementRule() ||
				   context == grammarAccess.getDDLStatementRule() ||
				   context == grammarAccess.getMickeyBlockRule()) {
					sequence_AlterTableAddColumnStatement(context, (AlterTableAddColumnStatement) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.ALTER_TABLE_RENAME_STATEMENT:
				if(context == grammarAccess.getAlterTableRenameStatementRule() ||
				   context == grammarAccess.getDDLStatementRule() ||
				   context == grammarAccess.getMickeyBlockRule()) {
					sequence_AlterTableRenameStatement(context, (AlterTableRenameStatement) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.CASE:
				if(context == grammarAccess.getCaseRule()) {
					sequence_Case(context, (Case) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.CASE_EXPRESSION:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getNullCheckExpressionRule() ||
				   context == grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_PrimaryExpression(context, (CaseExpression) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.CAST_EXPRESSION:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getNullCheckExpressionRule() ||
				   context == grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_PrimaryExpression(context, (CastExpression) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.CHECK_CONSTRAINT:
				if(context == grammarAccess.getColumnConstraintRule()) {
					sequence_ColumnConstraint(context, (CheckConstraint) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.CHECK_TABLE_CONSTRAINT:
				if(context == grammarAccess.getCheckTableConstraintRule() ||
				   context == grammarAccess.getTableConstraintRule()) {
					sequence_CheckTableConstraint(context, (CheckTableConstraint) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.COLUMN_DEF:
				if(context == grammarAccess.getColumnDefRule()) {
					sequence_ColumnDef(context, (ColumnDef) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.COLUMN_SOURCE_REF:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getNullCheckExpressionRule() ||
				   context == grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_PrimaryExpression(context, (ColumnSourceRef) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.CONFLICT_CLAUSE:
				if(context == grammarAccess.getConflictClauseRule()) {
					sequence_ConflictClause(context, (ConflictClause) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.CONTENT_URI:
				if(context == grammarAccess.getContentUriRule()) {
					sequence_ContentUri(context, (ContentUri) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.CONTENT_URI_PARAM_SEGMENT:
				if(context == grammarAccess.getContentUriSegmentRule()) {
					sequence_ContentUriSegment(context, (ContentUriParamSegment) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.CONTENT_URI_QUERY_PARAM:
				if(context == grammarAccess.getContentUriQueryParamRule()) {
					sequence_ContentUriQueryParam(context, (ContentUriQueryParam) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.CONTENT_URI_SEGMENT:
				if(context == grammarAccess.getContentUriSegmentRule()) {
					sequence_ContentUriSegment(context, (ContentUriSegment) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.CREATE_INDEX_STATEMENT:
				if(context == grammarAccess.getCreateIndexStatementRule() ||
				   context == grammarAccess.getDDLStatementRule() ||
				   context == grammarAccess.getMickeyBlockRule()) {
					sequence_CreateIndexStatement(context, (CreateIndexStatement) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.CREATE_TABLE_STATEMENT:
				if(context == grammarAccess.getCreateTableStatementRule() ||
				   context == grammarAccess.getDDLStatementRule() ||
				   context == grammarAccess.getMickeyBlockRule()) {
					sequence_CreateTableStatement(context, (CreateTableStatement) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.CREATE_TRIGGER_STATEMENT:
				if(context == grammarAccess.getCreateTriggerStatementRule() ||
				   context == grammarAccess.getDDLStatementRule() ||
				   context == grammarAccess.getMickeyBlockRule()) {
					sequence_CreateTriggerStatement(context, (CreateTriggerStatement) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.CREATE_VIEW_STATEMENT:
				if(context == grammarAccess.getCreateViewStatementRule() ||
				   context == grammarAccess.getDDLStatementRule() ||
				   context == grammarAccess.getMickeyBlockRule()) {
					sequence_CreateViewStatement(context, (CreateViewStatement) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.CURRENT_DATE_LITERAL:
				if(context == grammarAccess.getLiteralValueRule()) {
					sequence_LiteralValue(context, (CurrentDateLiteral) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.CURRENT_TIME_LITERAL:
				if(context == grammarAccess.getLiteralValueRule()) {
					sequence_LiteralValue(context, (CurrentTimeLiteral) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.CURRENT_TIME_STAMP_LITERAL:
				if(context == grammarAccess.getLiteralValueRule()) {
					sequence_LiteralValue(context, (CurrentTimeStampLiteral) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.DEFAULT_CONSTRAINT:
				if(context == grammarAccess.getColumnConstraintRule()) {
					sequence_ColumnConstraint(context, (DefaultConstraint) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.DELETE_STATEMENT:
				if(context == grammarAccess.getDMLStatementRule() ||
				   context == grammarAccess.getDeleteStatementRule()) {
					sequence_DeleteStatement(context, (DeleteStatement) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.DROP_INDEX_STATEMENT:
				if(context == grammarAccess.getDDLStatementRule() ||
				   context == grammarAccess.getDropIndexStatementRule() ||
				   context == grammarAccess.getMickeyBlockRule()) {
					sequence_DropIndexStatement(context, (DropIndexStatement) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.DROP_TABLE_STATEMENT:
				if(context == grammarAccess.getDDLStatementRule() ||
				   context == grammarAccess.getDropTableStatementRule() ||
				   context == grammarAccess.getMickeyBlockRule()) {
					sequence_DropTableStatement(context, (DropTableStatement) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.DROP_TRIGGER_STATEMENT:
				if(context == grammarAccess.getDDLStatementRule() ||
				   context == grammarAccess.getDropTriggerStatementRule() ||
				   context == grammarAccess.getMickeyBlockRule()) {
					sequence_DropTriggerStatement(context, (DropTriggerStatement) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.DROP_VIEW_STATEMENT:
				if(context == grammarAccess.getDDLStatementRule() ||
				   context == grammarAccess.getDropViewStatementRule() ||
				   context == grammarAccess.getMickeyBlockRule()) {
					sequence_DropViewStatement(context, (DropViewStatement) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.EXPR_ADD:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_ExprAdd(context, (ExprAdd) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.EXPR_AND:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_ExprAnd(context, (ExprAnd) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.EXPR_BIT:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_ExprBit(context, (ExprBit) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.EXPR_CONCAT:
				if(context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_ExprConcat(context, (ExprConcat) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.EXPR_EQUAL:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_ExprEqual(context, (ExprEqual) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.EXPR_MULT:
				if(context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_ExprMult(context, (ExprMult) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.EXPR_OR:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_ExprOr(context, (ExprOr) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.EXPR_RELATE:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_ExprRelate(context, (ExprRelate) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.EXPRESSION_DEFAULT_VALUE:
				if(context == grammarAccess.getDefaultValueRule()) {
					sequence_DefaultValue(context, (ExpressionDefaultValue) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.FUNCTION:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getNullCheckExpressionRule() ||
				   context == grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_PrimaryExpression(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.FUNCTION_ARG:
				if(context == grammarAccess.getFunctionArgRule()) {
					sequence_FunctionArg(context, (FunctionArg) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.FUNCTION_ARGUMENT:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getNullCheckExpressionRule() ||
				   context == grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_PrimaryExpression(context, (FunctionArgument) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.GROUP_BY_EXPRESSIONS:
				if(context == grammarAccess.getGroupByExpressionsRule()) {
					sequence_GroupByExpressions(context, (GroupByExpressions) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.HAVING_EXPRESSIONS:
				if(context == grammarAccess.getHavingExpressionsRule()) {
					sequence_HavingExpressions(context, (HavingExpressions) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.INDEXED_COLUMN:
				if(context == grammarAccess.getIndexedColumnRule()) {
					sequence_IndexedColumn(context, (IndexedColumn) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.INSERT_STATEMENT:
				if(context == grammarAccess.getDMLStatementRule() ||
				   context == grammarAccess.getInsertStatementRule()) {
					sequence_InsertStatement(context, (InsertStatement) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.IS_NULL:
				if(context == grammarAccess.getNullExpressionRule()) {
					sequence_NullExpression(context, (IsNull) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.JOIN_SOURCE:
				if(context == grammarAccess.getJoinSourceRule()) {
					sequence_JoinSource(context, (JoinSource) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.JOIN_STATEMENT:
				if(context == grammarAccess.getJoinStatementRule()) {
					sequence_JoinStatement(context, (JoinStatement) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.LITERAL:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getNullCheckExpressionRule() ||
				   context == grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_PrimaryExpression(context, (Literal) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.LITERAL_DEFAULT_VALUE:
				if(context == grammarAccess.getDefaultValueRule()) {
					sequence_DefaultValue(context, (LiteralDefaultValue) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.MICKEY_FILE:
				if(context == grammarAccess.getMickeyFileRule()) {
					sequence_MickeyFile(context, (MickeyFile) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.MICKEY_FUNCTION:
				if(context == grammarAccess.getMickeyBlockRule() ||
				   context == grammarAccess.getMickeyFunctionRule()) {
					sequence_MickeyFunction(context, (MickeyFunction) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.MIGRATION_BLOCK:
				if(context == grammarAccess.getMickeyBlockRule() ||
				   context == grammarAccess.getMigrationBlockRule()) {
					sequence_MigrationBlock(context, (MigrationBlock) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.NESTED_EXPRESSION:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getNullCheckExpressionRule() ||
				   context == grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_PrimaryExpression(context, (NestedExpression) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.NEW_COLUMN:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getNullCheckExpressionRule() ||
				   context == grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_PrimaryExpression(context, (NewColumn) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.NOT_NULL:
				if(context == grammarAccess.getNullExpressionRule()) {
					sequence_NullExpression(context, (NotNull) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.NOT_NULL_CONSTRAINT:
				if(context == grammarAccess.getColumnConstraintRule()) {
					sequence_ColumnConstraint(context, (NotNullConstraint) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.NULL_CHECK_EXPRESSION:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getNullCheckExpressionRule() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_NullCheckExpression(context, (NullCheckExpression) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.NULL_LITERAL:
				if(context == grammarAccess.getLiteralValueRule()) {
					sequence_LiteralValue(context, (NullLiteral) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.NUMERIC_LITERAL:
				if(context == grammarAccess.getLiteralValueRule()) {
					sequence_LiteralValue(context, (NumericLiteral) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.OLD_COLUMN:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getNullCheckExpressionRule() ||
				   context == grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_PrimaryExpression(context, (OldColumn) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.ORDERING_TERM:
				if(context == grammarAccess.getOrderingTermRule()) {
					sequence_OrderingTerm(context, (OrderingTerm) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.ORDERING_TERM_LIST:
				if(context == grammarAccess.getOrderingTermListRule()) {
					sequence_OrderingTermList(context, (OrderingTermList) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.PRIMARY_CONSTRAINT:
				if(context == grammarAccess.getPrimaryConstraintRule() ||
				   context == grammarAccess.getTableConstraintRule()) {
					sequence_PrimaryConstraint(context, (PrimaryConstraint) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.PRIMARY_KEY_COLUMN_CONSTRAINT:
				if(context == grammarAccess.getColumnConstraintRule()) {
					sequence_ColumnConstraint(context, (PrimaryKeyColumnConstraint) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.RESULT_COLUMN:
				if(context == grammarAccess.getResultColumnRule()) {
					sequence_ResultColumn(context, (ResultColumn) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.SELECT_CORE:
				if(context == grammarAccess.getSelectCoreRule() ||
				   context == grammarAccess.getSelectCoreAccess().getSelectCoreLeftAction_1_0()) {
					sequence_SelectCore(context, (SelectCore) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.SELECT_EXPRESSION:
				if(context == grammarAccess.getSelectCoreRule() ||
				   context == grammarAccess.getSelectCoreAccess().getSelectCoreLeftAction_1_0() ||
				   context == grammarAccess.getSelectExpressionRule()) {
					sequence_SelectExpression(context, (SelectExpression) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.SELECT_LIST:
				if(context == grammarAccess.getSelectListRule()) {
					sequence_SelectList(context, (SelectList) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.SELECT_STATEMENT:
				if(context == grammarAccess.getDMLStatementRule() ||
				   context == grammarAccess.getSelectStatementRule()) {
					sequence_SelectStatement(context, (SelectStatement) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.SELECT_STATEMENT_EXPRESSION:
				if(context == grammarAccess.getExprAddRule() ||
				   context == grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0() ||
				   context == grammarAccess.getExprAndRule() ||
				   context == grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0() ||
				   context == grammarAccess.getExprBitRule() ||
				   context == grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0() ||
				   context == grammarAccess.getExprConcatRule() ||
				   context == grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0() ||
				   context == grammarAccess.getExprEqualRule() ||
				   context == grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0() ||
				   context == grammarAccess.getExprMultRule() ||
				   context == grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0() ||
				   context == grammarAccess.getExprOrRule() ||
				   context == grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0() ||
				   context == grammarAccess.getExprRelateRule() ||
				   context == grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0() ||
				   context == grammarAccess.getNullCheckExpressionRule() ||
				   context == grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSqlExpressionRule()) {
					sequence_PrimaryExpression(context, (SelectStatementExpression) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.SINGLE_SOURCE_JOIN:
				if(context == grammarAccess.getSingleSourceRule() ||
				   context == grammarAccess.getSingleSourceJoinRule()) {
					sequence_SingleSourceJoin(context, (SingleSourceJoin) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.SINGLE_SOURCE_SELECT_STATEMENT:
				if(context == grammarAccess.getSingleSourceRule() ||
				   context == grammarAccess.getSingleSourceSelectStatementRule()) {
					sequence_SingleSourceSelectStatement(context, (SingleSourceSelectStatement) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.SINGLE_SOURCE_TABLE:
				if(context == grammarAccess.getSingleSourceRule() ||
				   context == grammarAccess.getSingleSourceTableRule()) {
					sequence_SingleSourceTable(context, (SingleSourceTable) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.STRING_LITERAL:
				if(context == grammarAccess.getLiteralValueRule()) {
					sequence_LiteralValue(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.UNIQUE_CONSTRAINT:
				if(context == grammarAccess.getColumnConstraintRule()) {
					sequence_ColumnConstraint(context, (UniqueConstraint) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.UNIQUE_TABLE_CONSTRAINT:
				if(context == grammarAccess.getTableConstraintRule() ||
				   context == grammarAccess.getUniqueTableConstraintRule()) {
					sequence_UniqueTableConstraint(context, (UniqueTableConstraint) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.UPDATE_COLUMN_EXPRESSION:
				if(context == grammarAccess.getUpdateColumnExpressionRule()) {
					sequence_UpdateColumnExpression(context, (UpdateColumnExpression) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.UPDATE_STATEMENT:
				if(context == grammarAccess.getDMLStatementRule() ||
				   context == grammarAccess.getUpdateStatementRule()) {
					sequence_UpdateStatement(context, (UpdateStatement) semanticObject); 
					return; 
				}
				else break;
			case MickeyLangPackage.WHERE_EXPRESSIONS:
				if(context == grammarAccess.getWhereExpressionsRule()) {
					sequence_WhereExpressions(context, (WhereExpressions) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID uri=ContentUri type=[TableDefinition|QualifiedName] unique?='unique'? params+=ContentUriQueryParam*)
	 */
	protected void sequence_ActionStatement(EObject context, ActionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (table=[TableDefinition|ID] columnDef=ColumnDef)
	 */
	protected void sequence_AlterTableAddColumnStatement(EObject context, AlterTableAddColumnStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.ALTER_TABLE_ADD_COLUMN_STATEMENT__TABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.ALTER_TABLE_ADD_COLUMN_STATEMENT__TABLE));
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.ALTER_TABLE_ADD_COLUMN_STATEMENT__COLUMN_DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.ALTER_TABLE_ADD_COLUMN_STATEMENT__COLUMN_DEF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlterTableAddColumnStatementAccess().getTableTableDefinitionIDTerminalRuleCall_2_0_1(), semanticObject.getTable());
		feeder.accept(grammarAccess.getAlterTableAddColumnStatementAccess().getColumnDefColumnDefParserRuleCall_4_0(), semanticObject.getColumnDef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (table=[TableDefinition|ID] name=ID)
	 */
	protected void sequence_AlterTableRenameStatement(EObject context, AlterTableRenameStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.TABLE_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.TABLE_DEFINITION__NAME));
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.ALTER_TABLE_RENAME_STATEMENT__TABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.ALTER_TABLE_RENAME_STATEMENT__TABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlterTableRenameStatementAccess().getTableTableDefinitionIDTerminalRuleCall_3_0_1(), semanticObject.getTable());
		feeder.accept(grammarAccess.getAlterTableRenameStatementAccess().getNameIDTerminalRuleCall_5_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (whenExpression=SqlExpression thenExpression=SqlExpression)
	 */
	protected void sequence_Case(EObject context, Case semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.CASE__WHEN_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.CASE__WHEN_EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.CASE__THEN_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.CASE__THEN_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCaseAccess().getWhenExpressionSqlExpressionParserRuleCall_1_0(), semanticObject.getWhenExpression());
		feeder.accept(grammarAccess.getCaseAccess().getThenExpressionSqlExpressionParserRuleCall_3_0(), semanticObject.getThenExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? expression=SqlExpression)
	 */
	protected void sequence_CheckTableConstraint(EObject context, CheckTableConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=SqlExpression
	 */
	protected void sequence_ColumnConstraint(EObject context, CheckConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.CHECK_CONSTRAINT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.CHECK_CONSTRAINT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColumnConstraintAccess().getExpressionSqlExpressionParserRuleCall_4_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     defaultValue=DefaultValue
	 */
	protected void sequence_ColumnConstraint(EObject context, DefaultConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.DEFAULT_CONSTRAINT__DEFAULT_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.DEFAULT_CONSTRAINT__DEFAULT_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColumnConstraintAccess().getDefaultValueDefaultValueParserRuleCall_3_2_0(), semanticObject.getDefaultValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (conflictClause=ConflictClause?)
	 */
	protected void sequence_ColumnConstraint(EObject context, NotNullConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((asc?='asc' | desc?='desc')? autoincrement?='autoincrement'?)
	 */
	protected void sequence_ColumnConstraint(EObject context, PrimaryKeyColumnConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (conflictClause=ConflictClause?)
	 */
	protected void sequence_ColumnConstraint(EObject context, UniqueConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=ColumnType constraints+=ColumnConstraint*)
	 */
	protected void sequence_ColumnDef(EObject context, ColumnDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     resolution=ConflictResolution
	 */
	protected void sequence_ConflictClause(EObject context, ConflictClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.CONFLICT_CLAUSE__RESOLUTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.CONFLICT_CLAUSE__RESOLUTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConflictClauseAccess().getResolutionConflictResolutionEnumRuleCall_2_0(), semanticObject.getResolution());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (like?='like'? column=[ColumnSource|ID])
	 */
	protected void sequence_ContentUriQueryParam(EObject context, ContentUriQueryParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     param=[ColumnSource|ID]
	 */
	protected void sequence_ContentUriSegment(EObject context, ContentUriParamSegment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ContentUriSegment(EObject context, ContentUriSegment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.CONTENT_URI_SEGMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.CONTENT_URI_SEGMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getContentUriSegmentAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (segments+=ContentUriSegment? segments+=ContentUriSegment*)
	 */
	protected void sequence_ContentUri(EObject context, ContentUri semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unique?='unique'? name=ID table=[TableDefinition|ID] columns+=IndexedColumn columns+=IndexedColumn*)
	 */
	protected void sequence_CreateIndexStatement(EObject context, CreateIndexStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (temporary?='temp'? name=ID columnDefs+=ColumnDef columnDefs+=ColumnDef* constraints+=TableConstraint*)
	 */
	protected void sequence_CreateTableStatement(EObject context, CreateTableStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         temporary?='temp'? 
	 *         name=ID 
	 *         (when='before' | when='after' | when='instead of')? 
	 *         (eventType='delete' | eventType='insert' | (eventType='update' (updateColumnNames+=ID updateColumnNames+=ID*)?)) 
	 *         table=[TableDefinition|ID] 
	 *         forEachRow='for each row'? 
	 *         whenExpression=SqlExpression? 
	 *         (statements+=DMLStatement statements+=DMLStatement*)?
	 *     )
	 */
	protected void sequence_CreateTriggerStatement(EObject context, CreateTriggerStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (temporary?='temp'? name=ID selectStatement=SelectStatement)
	 */
	protected void sequence_CreateViewStatement(EObject context, CreateViewStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=SqlExpression
	 */
	protected void sequence_DefaultValue(EObject context, ExpressionDefaultValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.EXPRESSION_DEFAULT_VALUE__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.EXPRESSION_DEFAULT_VALUE__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefaultValueAccess().getExpressionSqlExpressionParserRuleCall_1_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literal=LiteralValue
	 */
	protected void sequence_DefaultValue(EObject context, LiteralDefaultValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.LITERAL_DEFAULT_VALUE__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.LITERAL_DEFAULT_VALUE__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefaultValueAccess().getLiteralLiteralValueParserRuleCall_0_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (table=[TableDefinition|ID] expression=SqlExpression?)
	 */
	protected void sequence_DeleteStatement(EObject context, DeleteStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ifExists?='if exists'? index=[CreateIndexStatement|ID])
	 */
	protected void sequence_DropIndexStatement(EObject context, DropIndexStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ifExists?='if exists'? table=[TableDefinition|ID])
	 */
	protected void sequence_DropTableStatement(EObject context, DropTableStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ifExists?='if exists'? trigger=[CreateTriggerStatement|ID])
	 */
	protected void sequence_DropTriggerStatement(EObject context, DropTriggerStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ifExists?='if exists'? view=[CreateViewStatement|ID])
	 */
	protected void sequence_DropViewStatement(EObject context, DropViewStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExprAdd_ExprAdd_1_0 (op='+' | op='-') right=ExprBit)
	 */
	protected void sequence_ExprAdd(EObject context, ExprAdd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExprAnd_ExprAnd_1_0 op='and' right=ExprOr)
	 */
	protected void sequence_ExprAnd(EObject context, ExprAnd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.EXPR_AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.EXPR_AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.EXPR_AND__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.EXPR_AND__OP));
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.EXPR_AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.EXPR_AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExprAndAccess().getOpAndKeyword_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getExprAndAccess().getRightExprOrParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExprBit_ExprBit_1_0 (op='<<' | op='>>' | op='&' | op='|') right=ExprRelate)
	 */
	protected void sequence_ExprBit(EObject context, ExprBit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExprConcat_ExprConcat_1_0 op='||' right=ExprMult)
	 */
	protected void sequence_ExprConcat(EObject context, ExprConcat semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.EXPR_CONCAT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.EXPR_CONCAT__LEFT));
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.EXPR_CONCAT__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.EXPR_CONCAT__OP));
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.EXPR_CONCAT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.EXPR_CONCAT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExprConcatAccess().getOpVerticalLineVerticalLineKeyword_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getExprConcatAccess().getRightExprMultParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         left=ExprEqual_ExprEqual_1_0 
	 *         (
	 *             op='=' | 
	 *             op='==' | 
	 *             op='!=' | 
	 *             op='<>' | 
	 *             op='is' | 
	 *             op='is not' | 
	 *             op='in' | 
	 *             op='not in' | 
	 *             op='like' | 
	 *             op='glob' | 
	 *             op='match' | 
	 *             op='regexp'
	 *         ) 
	 *         right=ExprAnd
	 *     )
	 */
	protected void sequence_ExprEqual(EObject context, ExprEqual semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExprMult_ExprMult_1_0 (op='*' | op='/' | op='%') right=ExprAdd)
	 */
	protected void sequence_ExprMult(EObject context, ExprMult semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExprOr_ExprOr_1_0 op='or' right=NullCheckExpression)
	 */
	protected void sequence_ExprOr(EObject context, ExprOr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.EXPR_OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.EXPR_OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.EXPR_OR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.EXPR_OR__OP));
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.EXPR_OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.EXPR_OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExprOrAccess().getOpOrKeyword_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getExprOrAccess().getRightNullCheckExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExprRelate_ExprRelate_1_0 (op='<' | op='<=' | op='>' | op='>=') right=ExprEqual)
	 */
	protected void sequence_ExprRelate(EObject context, ExprRelate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ColumnType name=ID)
	 */
	protected void sequence_FunctionArg(EObject context, FunctionArg semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.FUNCTION_ARG__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.FUNCTION_ARG__TYPE));
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.FUNCTION_ARG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.FUNCTION_ARG__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionArgAccess().getTypeColumnTypeEnumRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getFunctionArgAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (groupByExpressions+=SqlExpression groupByExpressions+=SqlExpression*)
	 */
	protected void sequence_GroupByExpressions(EObject context, GroupByExpressions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=SqlExpression
	 */
	protected void sequence_HavingExpressions(EObject context, HavingExpressions semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.HAVING_EXPRESSIONS__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.HAVING_EXPRESSIONS__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHavingExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (columnReference=[ColumnDef|ID] collationName=ID? (asc?='asc' | desc?='desc')?)
	 */
	protected void sequence_IndexedColumn(EObject context, IndexedColumn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         conflictResolution=ConflictResolution? 
	 *         table=[TableDefinition|ID] 
	 *         (columnNames+=[ColumnDef|ID] columnNames+=[ColumnDef|ID]*)? 
	 *         ((expressions+=SqlExpression expressions+=SqlExpression*) | selectStatement=SelectStatement)?
	 *     )
	 */
	protected void sequence_InsertStatement(EObject context, InsertStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (source=SingleSource joinStatements+=JoinStatement*)
	 */
	protected void sequence_JoinSource(EObject context, JoinSource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (natural?='natural'? ((left?='left' outer?='outer'?) | inner?='inner' | cross?='cross')? singleSource=SingleSource expression=SqlExpression)
	 */
	protected void sequence_JoinStatement(EObject context, JoinStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     literal='current_date'
	 */
	protected void sequence_LiteralValue(EObject context, CurrentDateLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.CURRENT_DATE_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.CURRENT_DATE_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralValueAccess().getLiteralCurrent_dateKeyword_4_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literal='current_time'
	 */
	protected void sequence_LiteralValue(EObject context, CurrentTimeLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.CURRENT_TIME_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.CURRENT_TIME_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralValueAccess().getLiteralCurrent_timeKeyword_3_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literal='current_timestamp'
	 */
	protected void sequence_LiteralValue(EObject context, CurrentTimeStampLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.CURRENT_TIME_STAMP_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.CURRENT_TIME_STAMP_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralValueAccess().getLiteralCurrent_timestampKeyword_5_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literal='null'
	 */
	protected void sequence_LiteralValue(EObject context, NullLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.NULL_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.NULL_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralValueAccess().getLiteralNullKeyword_2_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     number=SignedNumber
	 */
	protected void sequence_LiteralValue(EObject context, NumericLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.NUMERIC_LITERAL__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.NUMERIC_LITERAL__NUMBER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralValueAccess().getNumberSignedNumberParserRuleCall_0_1_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literal=STRING
	 */
	protected void sequence_LiteralValue(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.STRING_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.STRING_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralValueAccess().getLiteralSTRINGTerminalRuleCall_1_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (databaseName=QualifiedName blocks+=MickeyBlock*)
	 */
	protected void sequence_MickeyFile(EObject context, MickeyFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (args+=FunctionArg args+=FunctionArg*)? type=[TableDefinition|QualifiedName]? statements+=DMLStatement*)
	 */
	protected void sequence_MickeyFunction(EObject context, MickeyFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID from=[MigrationBlock|QualifiedName]? statements+=DDLStatement*)
	 */
	protected void sequence_MigrationBlock(EObject context, MigrationBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=NullCheckExpression_NullCheckExpression_1_0 right=NullExpression)
	 */
	protected void sequence_NullCheckExpression(EObject context, NullCheckExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.NULL_CHECK_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.NULL_CHECK_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.NULL_CHECK_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.NULL_CHECK_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getNullCheckExpressionAccess().getRightNullExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {IsNull}
	 */
	protected void sequence_NullExpression(EObject context, IsNull semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NotNull}
	 */
	protected void sequence_NullExpression(EObject context, NotNull semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (orderingTerms+=OrderingTerm orderingTerms+=OrderingTerm*)
	 */
	protected void sequence_OrderingTermList(EObject context, OrderingTermList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=SqlExpression (asc?='asc' | desc?='desc')?)
	 */
	protected void sequence_OrderingTerm(EObject context, OrderingTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? columns+=IndexedColumn columns+=IndexedColumn* conflictClause=ConflictClause)
	 */
	protected void sequence_PrimaryConstraint(EObject context, PrimaryConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (caseExpression=SqlExpression? cases+=Case+ elseExpression=SqlExpression?)
	 */
	protected void sequence_PrimaryExpression(EObject context, CaseExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=SqlExpression type=SqliteDataType)
	 */
	protected void sequence_PrimaryExpression(EObject context, CastExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.CAST_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.CAST_EXPRESSION__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.CAST_EXPRESSION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.CAST_EXPRESSION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_8_3_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getTypeSqliteDataTypeEnumRuleCall_8_5_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (source=[SelectSource|ID] | (source=[SelectSource|ID] (all?='*' | column=[ColumnSource|ID])) | column=[ColumnSource|ID])
	 */
	protected void sequence_PrimaryExpression(EObject context, ColumnSourceRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (all?='*' | (arguments+=SqlExpression arguments+=SqlExpression*)))
	 */
	protected void sequence_PrimaryExpression(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     arg=[FunctionArg|ID]
	 */
	protected void sequence_PrimaryExpression(EObject context, FunctionArgument semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.FUNCTION_ARGUMENT__ARG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.FUNCTION_ARGUMENT__ARG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getArgFunctionArgIDTerminalRuleCall_9_2_0_1(), semanticObject.getArg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literalValue=LiteralValue
	 */
	protected void sequence_PrimaryExpression(EObject context, Literal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.LITERAL__LITERAL_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.LITERAL__LITERAL_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getLiteralValueLiteralValueParserRuleCall_3_1_0(), semanticObject.getLiteralValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=SqlExpression
	 */
	protected void sequence_PrimaryExpression(EObject context, NestedExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.NESTED_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.NESTED_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_4_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     column=[ColumnSource|ID]
	 */
	protected void sequence_PrimaryExpression(EObject context, NewColumn semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.NEW_COLUMN__COLUMN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.NEW_COLUMN__COLUMN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceIDTerminalRuleCall_0_2_0_1(), semanticObject.getColumn());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     column=[ColumnSource|ID]
	 */
	protected void sequence_PrimaryExpression(EObject context, OldColumn semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.OLD_COLUMN__COLUMN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.OLD_COLUMN__COLUMN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceIDTerminalRuleCall_1_2_0_1(), semanticObject.getColumn());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (not?='not'? exists?='exists'? select=SelectStatement)
	 */
	protected void sequence_PrimaryExpression(EObject context, SelectStatementExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=SqlExpression name=ID?)
	 */
	protected void sequence_ResultColumn(EObject context, ResultColumn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SelectCore_SelectCore_1_0 op=CompoundOperator right=SelectExpression)
	 */
	protected void sequence_SelectCore(EObject context, SelectCore semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.SELECT_CORE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.SELECT_CORE__LEFT));
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.SELECT_CORE__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.SELECT_CORE__OP));
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.SELECT_CORE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.SELECT_CORE__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelectCoreAccess().getSelectCoreLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSelectCoreAccess().getOpCompoundOperatorEnumRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getSelectCoreAccess().getRightSelectExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (distinct?='distinct' | all?='all')? 
	 *         (allColumns?='*' | selectList=SelectList) 
	 *         source=JoinSource? 
	 *         where=WhereExpressions? 
	 *         groupBy=GroupByExpressions? 
	 *         having=HavingExpressions?
	 *     )
	 */
	protected void sequence_SelectExpression(EObject context, SelectExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (resultColumns+=ResultColumn resultColumns+=ResultColumn*)
	 */
	protected void sequence_SelectList(EObject context, SelectList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (core=SelectCore orderby=OrderingTermList? (limit=SqlExpression limitOffset=SqlExpression?)?)
	 */
	protected void sequence_SelectStatement(EObject context, SelectStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     joinSource=JoinSource
	 */
	protected void sequence_SingleSourceJoin(EObject context, SingleSourceJoin semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.SINGLE_SOURCE_JOIN__JOIN_SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.SINGLE_SOURCE_JOIN__JOIN_SOURCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSingleSourceJoinAccess().getJoinSourceJoinSourceParserRuleCall_1_0(), semanticObject.getJoinSource());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (selectStatement=SelectStatement name=ID?)
	 */
	protected void sequence_SingleSourceSelectStatement(EObject context, SingleSourceSelectStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tableReference=[TableDefinition|QualifiedName] name=ID?)
	 */
	protected void sequence_SingleSourceTable(EObject context, SingleSourceTable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? columns+=IndexedColumn columns+=IndexedColumn* conflictClause=ConflictClause)
	 */
	protected void sequence_UniqueTableConstraint(EObject context, UniqueTableConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (columnName=[ColumnDef|ID] expression=SqlExpression)
	 */
	protected void sequence_UpdateColumnExpression(EObject context, UpdateColumnExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.UPDATE_COLUMN_EXPRESSION__COLUMN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.UPDATE_COLUMN_EXPRESSION__COLUMN_NAME));
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.UPDATE_COLUMN_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.UPDATE_COLUMN_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUpdateColumnExpressionAccess().getColumnNameColumnDefIDTerminalRuleCall_0_0_1(), semanticObject.getColumnName());
		feeder.accept(grammarAccess.getUpdateColumnExpressionAccess().getExpressionSqlExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         conflictResolution=ConflictResolution? 
	 *         table=[TableDefinition|ID] 
	 *         updateColumnExpressions+=UpdateColumnExpression 
	 *         updateColumnExpressions+=UpdateColumnExpression* 
	 *         whereExpression=SqlExpression?
	 *     )
	 */
	protected void sequence_UpdateStatement(EObject context, UpdateStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=SqlExpression
	 */
	protected void sequence_WhereExpressions(EObject context, WhereExpressions semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MickeyLangPackage.Literals.WHERE_EXPRESSIONS__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MickeyLangPackage.Literals.WHERE_EXPRESSIONS__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhereExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
}
