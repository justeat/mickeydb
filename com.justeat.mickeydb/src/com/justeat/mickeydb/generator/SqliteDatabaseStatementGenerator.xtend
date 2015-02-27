package com.justeat.mickeydb.generator

import com.google.inject.Inject
import com.justeat.mickeydb.mickeyLang.CreateIndexStatement
import com.justeat.mickeydb.mickeyLang.CreateTableStatement
import com.justeat.mickeydb.mickeyLang.CreateTriggerStatement
import com.justeat.mickeydb.mickeyLang.CreateViewStatement
import com.justeat.mickeydb.mickeyLang.DDLStatement
import java.util.Collection
import java.util.regex.Pattern
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.serializer.ISerializer
import java.util.ArrayList

class SqliteDatabaseStatementGenerator {
	@Inject extension ISerializer
	SaveOptions saveOptions
	
	val stripCommentsExpr = Pattern::compile("\\/\\/[^\\r\\n]+|\\/\\*.*?\\*\\/", Pattern::DOTALL);
	
	new () {
		saveOptions = SaveOptions::newBuilder()
				.noValidation
				.options;
	}
	
	def generateStatements(Iterable<DDLStatement> statements) '''
		«FOR stmt : statements»
		«generateStatement(stmt)»
		«ENDFOR»
	'''
	
	def generateTableStatements(Iterable<CreateTableStatement> statements) '''
		«FOR stmt : statements»
		«generateStatement(stmt)»
		«ENDFOR»
	'''
	
	def generateViewStatements(Iterable<CreateViewStatement> statements) '''
		«FOR stmt : statements»
		«generateStatement(stmt)»
		«ENDFOR»
	'''
	
	def generateTriggerStatements(Iterable<CreateTriggerStatement> statements) '''
		«FOR stmt : statements»
		«generateStatement(stmt)»
		«ENDFOR»
	'''
	
	def generateIndexStatements(Iterable<CreateIndexStatement> statements) '''
		«FOR stmt : statements»
		«generateStatement(stmt)»
		«ENDFOR»
	'''
	
	def generateStatement(DDLStatement stmt) '''
		db.execSQL(
			«FOR line : stmt.serialize(saveOptions).stripComments.trim.split("\\r?\\n") SEPARATOR " +"»
			"«line.trim.replaceAll('\\\"', '\\\\\"')» "
			«ENDFOR»
		);	
	'''
	
	def stripComments(String s) {
	    stripCommentsExpr.matcher(s).replaceAll("")
	}
}