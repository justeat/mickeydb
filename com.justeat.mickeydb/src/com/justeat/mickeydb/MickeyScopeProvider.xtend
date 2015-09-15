package com.justeat.mickeydb

import com.google.inject.Inject
import com.justeat.mickeydb.mickeyLang.AlterTableAddColumnStatement
import com.justeat.mickeydb.mickeyLang.AlterTableRenameStatement
import com.justeat.mickeydb.mickeyLang.ColumnSourceRef
import com.justeat.mickeydb.mickeyLang.CreateTableStatement
import com.justeat.mickeydb.mickeyLang.CreateTriggerStatement
import com.justeat.mickeydb.mickeyLang.CreateViewStatement
import com.justeat.mickeydb.mickeyLang.DMLStatement
import com.justeat.mickeydb.mickeyLang.DropTriggerStatement
import com.justeat.mickeydb.mickeyLang.DropViewStatement
import com.justeat.mickeydb.mickeyLang.MickeyFile
import com.justeat.mickeydb.mickeyLang.MickeyLangPackage
import com.justeat.mickeydb.mickeyLang.MigrationBlock
import com.justeat.mickeydb.mickeyLang.NewColumn
import com.justeat.mickeydb.mickeyLang.OldColumn
import com.justeat.mickeydb.mickeyLang.SelectExpression
import com.justeat.mickeydb.mickeyLang.SingleSourceTable
import com.justeat.mickeydb.mickeyLang.UpdateColumnExpression
import com.justeat.mickeydb.mickeyLang.UpdateStatement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

import static extension com.justeat.mickeydb.ModelUtil.*
import org.apache.log4j.Logger
import java.util.List
import com.justeat.mickeydb.mickeyLang.ContentUri
import com.justeat.mickeydb.mickeyLang.ActionStatement

class MickeyScopeProvider extends AbstractDeclarativeScopeProvider {
	
	static final Logger LOG = Logger.getLogger(MickeyScopeProvider);
	
	@Inject IQualifiedNameProvider nameProvider;
	@Inject IResourceDescriptions resourceDescriptions;
	@Inject MickeyAssembler assembler
	
	@Inject MickeyEnvironment mickeyEnvironment
	
	override getScope(EObject context, EReference reference) {
		super.getScope(context, reference)	
	}
	
	def IScope scope_AlterTableAddColumnStatement_table(AlterTableAddColumnStatement context, EReference ref) {
		var scope = delegateGetScope(context, ref)
		var model = context.model
		var tableName = context.getFeatureNodeText(ref)
		var scopedElements = 
					scope.getElements(QualifiedName.create(model.databaseName, tableName))
					.map[e|EcoreUtil.resolve(e.EObjectOrProxy, context)]

		Scopes.scopeFor(scopedElements, scope)
	}
	
	def IScope scope_AlterTableRenameStatement_table(AlterTableRenameStatement context, EReference ref) {
		var scope = delegateGetScope(context, ref)
		var model = context.model
		var tableName = context.getFeatureNodeText(ref)
		var scopedElements = 
					scope.getElements(QualifiedName.create(model.databaseName, tableName))
					.map[e|EcoreUtil.resolve(e.EObjectOrProxy, context)]

		Scopes.scopeFor(scopedElements, scope)
	}
		
	def IScope scope_ActionStatement_type(ActionStatement context, EReference ref) {
		var scope = delegateGetScope(context, ref)
		var model = context.model
		var tableName = context.getFeatureNodeText(ref)
		var scopedElements = 
					scope.getElements(QualifiedName.create(model.databaseName, tableName))
					.map[e|EcoreUtil.resolve(e.EObjectOrProxy, context)]

		Scopes.scopeFor(scopedElements, scope)
	}
	
	def IScope scope_SingleSourceTable_tableReference(SingleSourceTable context, EReference ref) {
		var scope = delegateGetScope(context, ref)
		var model = context.model
		var tableName = context.getFeatureNodeText(ref)
		var scopedElements = 
					scope.getElements(QualifiedName.create(model.databaseName, tableName))
					.map[e|EcoreUtil.resolve(e.EObjectOrProxy, context)]

		Scopes.scopeFor(scopedElements, scope)		
	}
	
	def IScope scope_ColumnSourceRef_column(ColumnSourceRef context, EReference ref) {
		var dbName = context.model.databaseName
		
		var tableName = "";
		if(context.source != null) {
			tableName = context.source.getFeatureNodeText(MickeyLangPackage.Literals.SINGLE_SOURCE_TABLE__TABLE_REFERENCE)
		} else {
			var updateStatement = context.getAncestorOfType(UpdateStatement)
			if (updateStatement != null) {
				tableName = updateStatement.getFeatureNodeText(MickeyLangPackage.Literals.UPDATE_STATEMENT__TABLE)
			}
		}
		
	    scopeTableColumns(context, dbName, tableName)	
	}
		
	def IScope scope_NewColumn_column(NewColumn context, EReference ref) {
		var dbName = context.model.databaseName
		var statement = context.getAncestorOfType(CreateTriggerStatement)
		var tableName = statement.getFeatureNodeText(MickeyLangPackage.Literals.CREATE_TRIGGER_STATEMENT__TABLE)

		scopeTableColumns(context, dbName, tableName)		
	}
	
	def IScope scope_OldColumn_column(OldColumn context, EReference ref) {
		var dbName = context.model.databaseName
		var statement = context.getAncestorOfType(CreateTriggerStatement)
		var tableName = statement.getFeatureNodeText(MickeyLangPackage.Literals.CREATE_TRIGGER_STATEMENT__TABLE)
		
		scopeTableColumns(context, dbName, tableName)
				
	}
	def IScope scope_UpdateColumnExpression_columnName(UpdateColumnExpression context, EReference ref) {
		var dbName = context.model.databaseName
		var statement = context.getAncestorOfType(DMLStatement)
		var tableName = statement.targetTableName
		scopeTableColumns(context, dbName, tableName)	
	}
	
	def IScope scope_ColumnSourceRef_source(ColumnSourceRef context, EReference ref) {
		var scope = delegateGetScope(context, ref)
		var select = context.getAncestorOfType(SelectExpression)

		Scopes.scopeFor(select.findAllSingleSources, scope)			
	}
	
	def IScope scope_DropViewStatement_view(DropViewStatement context, EReference ref) {
		var scope = delegateGetScope(context, ref)
		var model = context.model
		var viewName = context.getFeatureNodeText(ref)
		var scopedElements = 
					scope.getElements(QualifiedName.create(model.databaseName, viewName))
					.map[e|EcoreUtil.resolve(e.EObjectOrProxy, context)]

		Scopes.scopeFor(scopedElements, scope)
	}
	
	def IScope scope_DropTriggerStatement_trigger(DropTriggerStatement context, EReference ref) {
		var scope = delegateGetScope(context, ref)
		var model = context.model
		var triggerName = context.getFeatureNodeText(ref)
		var scopedElements = 
					scope.getElements(QualifiedName.create(model.databaseName, triggerName))
					.map[e|EcoreUtil.resolve(e.EObjectOrProxy, context)]

		Scopes.scopeFor(scopedElements, scope)
	}
	
	def IScope scope_MigrationBlock_from(MigrationBlock context, EReference ref) {
		var scope = delegateGetScope(context, ref)
		var model = context.model
		var migrationName = context.getFeatureNodeText(ref)
		var scopedElements = 
					scope.getElements(QualifiedName.create(model.databaseName, migrationName))
					.map[e|EcoreUtil.resolve(e.EObjectOrProxy, context)]

		Scopes.scopeFor(scopedElements, scope)
	}
	
	def MickeyModel getMickeyModelInScope(EObject context) {
		
		var List<MickeyFile> files;
		
		LOG.debug("[Get Model In Scope] Standalone: " +mickeyEnvironment.isStandalone())
		
		if(mickeyEnvironment.isStandalone()) {
			files = context.eResource.resourceSet.resources.map[it.allContents.head as MickeyFile]
	    } else {
	    	files = resourceDescriptions.getExportedObjectsByType(MickeyLangPackage.Literals.MICKEY_FILE)
				.map[e|EcoreUtil.resolve(e.EObjectOrProxy, context) as MickeyFile].toList	    	
	    }
	    		
	    if(files.size > 0) {
	    	LOG.debug("[Get Model In Scope] Files: " + files.size)
	    	var migration = context.getAncestorOfType(MigrationBlock)
	    	try {
	    		return assembler.assemble(files, migration)
	    	} catch(Exception e) {
	    		LOG.debug("[Get Model In Scope] Failed with error ", e)
	    	}
	    }
	    
	    LOG.debug("[Get Model In Scope] Failed ")
	    
	    return null
	}
	
	def scopeTableColumns(EObject context, String dbName, String tableName) {
		var mickeyModel = context.getMickeyModelInScope
			    
			    if(mickeyModel != null) {
			    	var definition = mickeyModel.databases.get(dbName).snapshot.getTableDefinition(tableName)
			    	if(definition instanceof CreateTableStatement) {
			    		var table = definition as CreateTableStatement
				    	var columnScope = Scopes.scopeFor(table.columnDefs, IScope.NULLSCOPE);
			    		return columnScope    	
			    	} else {
			    		var view = definition as CreateViewStatement
			    		var columnScope = Scopes.scopeFor(view.viewResultColumns, IScope.NULLSCOPE);
			    		return columnScope    
			    	}
			    }
			    
			   	return IScope.NULLSCOPE
	}
}
