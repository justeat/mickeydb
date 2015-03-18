package com.justeat.mickeydb

import com.google.inject.Inject
import com.justeat.mickeydb.mickeyLang.AlterTableAddColumnStatement
import com.justeat.mickeydb.mickeyLang.AlterTableRenameStatement
import com.justeat.mickeydb.mickeyLang.ColumnSourceRef
import com.justeat.mickeydb.mickeyLang.CreateTriggerStatement
import com.justeat.mickeydb.mickeyLang.DMLStatement
import com.justeat.mickeydb.mickeyLang.DropTriggerStatement
import com.justeat.mickeydb.mickeyLang.DropViewStatement
import com.justeat.mickeydb.mickeyLang.MickeyLangPackage
import com.justeat.mickeydb.mickeyLang.MickeyFile
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
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

import static extension com.justeat.mickeydb.ModelUtil.*
import org.eclipse.xtext.resource.IEObjectDescription
import com.justeat.mickeydb.mickeyLang.MigrationBlock
import com.justeat.mickeydb.mickeyLang.impl.MigrationBlockImpl
import com.justeat.mickeydb.mickeyLang.MickeyLangFactory

class MickeyScopeProvider extends AbstractDeclarativeScopeProvider {
	
	@Inject IQualifiedNameProvider nameProvider;
	
	override getScope(EObject context, EReference reference) {
//		var scope = delegateGetScope(context, reference)
//		scope.allElements.forEach[element | element.boop]
		super.getScope(context, reference)	
	}
	
//	def void boop(IEObjectDescription description) {
//		var name = description.name
//		var obj = description.EObjectOrProxy
//		var clazz = description.EClass
//		var uri = description.EObjectURI
//		
//		System.out.println(name + ":" + obj.class.name)
//		
//		var qux = 0;
//		qux = qux + 1
//		
//	}
	
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
		var scope = delegateGetScope(context, ref)

		var model = context.model
		var selectExpression = context.getAncestorOfType(SelectExpression)
		var tableName = ""
		if(selectExpression != null) {
			tableName = context.source.getFeatureNodeText(MickeyLangPackage.Literals.SINGLE_SOURCE_TABLE__TABLE_REFERENCE)
		} else {
			var updateStatement = context.getAncestorOfType(UpdateStatement)
			if (updateStatement != null) {
				tableName = updateStatement.getFeatureNodeText(MickeyLangPackage.Literals.UPDATE_STATEMENT__TABLE)
			}
		}
		val name = QualifiedName.create(model.databaseName, tableName)

		var scopedElements = 
					scope.allElements.filter[e|e.name.startsWith(name)]
					.map[e|EcoreUtil.resolve(e.EObjectOrProxy, context)]
					
	    //var migrations = model.getMigrations()
	    
		Scopes.scopeFor(scopedElements, scope)			
	}
	
	def getMigrations(MickeyFile model) {
		var dummy = MickeyLangFactory.eINSTANCE.createMigrationBlock();
		var scope = delegateGetScope(dummy, MickeyLangPackage.Literals.MIGRATION_BLOCK__FROM);
		val name = QualifiedName.create(model.databaseName)

		scope.allElements.filter[e|e.name.startsWith(name)]
					.map[e|e.EObjectOrProxy]
	}
	
	def IScope scope_NewColumn_column(NewColumn context, EReference ref) {
		var scope = delegateGetScope(context, ref)
		var model = context.model
		var statement = context.getAncestorOfType(CreateTriggerStatement)
		var tableName = statement.getFeatureNodeText(MickeyLangPackage.Literals.CREATE_TRIGGER_STATEMENT__TABLE)
		val name = QualifiedName.create(model.databaseName, tableName)

		var scopedElements = 
					scope.allElements.filter[e|e.name.startsWith(name)]
					.map[e|EcoreUtil.resolve(e.EObjectOrProxy, context)]

		Scopes.scopeFor(scopedElements, scope)			
	}
	
	def IScope scope_OldColumn_column(OldColumn context, EReference ref) {
		var scope = delegateGetScope(context, ref)
		var model = context.model
		var statement = context.getAncestorOfType(CreateTriggerStatement)
		var tableName = statement.getFeatureNodeText(MickeyLangPackage.Literals.CREATE_TRIGGER_STATEMENT__TABLE)
		val name = QualifiedName.create(model.databaseName, tableName)
		
		var scopedElements = 
					scope.allElements.filter[e|e.name.startsWith(name)]
					.map[e|EcoreUtil.resolve(e.EObjectOrProxy, context)]

		Scopes.scopeFor(scopedElements, scope)			
	}
	def IScope scope_UpdateColumnExpression_columnName(UpdateColumnExpression context, EReference ref) {
		var scope = delegateGetScope(context, ref)
		var model = context.model
		var statement = context.getAncestorOfType(DMLStatement)
		var tableName = statement.targetTableName
		val name = QualifiedName.create(model.databaseName, tableName)
		
		var scopedElements = 
					scope.allElements.filter[e|e.name.startsWith(name)]
					.map[e|EcoreUtil.resolve(e.EObjectOrProxy, context)]

		Scopes.scopeFor(scopedElements, scope)			
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
}
