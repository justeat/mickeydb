package com.justeat.mickeydb.generator;

import com.google.inject.Inject;
import com.justeat.mickeydb.mickeyLang.CreateIndexStatement;
import com.justeat.mickeydb.mickeyLang.CreateTableStatement;
import com.justeat.mickeydb.mickeyLang.CreateTriggerStatement;
import com.justeat.mickeydb.mickeyLang.CreateViewStatement;
import com.justeat.mickeydb.mickeyLang.DDLStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class SqliteDatabaseStatementGenerator {
  @Inject
  @Extension
  private ISerializer _iSerializer;
  
  private SaveOptions saveOptions;
  
  private final Pattern stripCommentsExpr = Pattern.compile("\\/\\/[^\\r\\n]+|\\/\\*.*?\\*\\/", Pattern.DOTALL);
  
  public SqliteDatabaseStatementGenerator() {
    SaveOptions.Builder _newBuilder = SaveOptions.newBuilder();
    SaveOptions.Builder _noValidation = _newBuilder.noValidation();
    SaveOptions _options = _noValidation.getOptions();
    this.saveOptions = _options;
  }
  
  public CharSequence generateStatements(final Iterable<DDLStatement> statements) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final DDLStatement stmt : statements) {
        CharSequence _generateStatement = this.generateStatement(stmt);
        _builder.append(_generateStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateTableStatements(final Iterable<CreateTableStatement> statements) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final CreateTableStatement stmt : statements) {
        CharSequence _generateStatement = this.generateStatement(stmt);
        _builder.append(_generateStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateViewStatements(final Iterable<CreateViewStatement> statements) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final CreateViewStatement stmt : statements) {
        CharSequence _generateStatement = this.generateStatement(stmt);
        _builder.append(_generateStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateTriggerStatements(final Iterable<CreateTriggerStatement> statements) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final CreateTriggerStatement stmt : statements) {
        CharSequence _generateStatement = this.generateStatement(stmt);
        _builder.append(_generateStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateIndexStatements(final Iterable<CreateIndexStatement> statements) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final CreateIndexStatement stmt : statements) {
        CharSequence _generateStatement = this.generateStatement(stmt);
        _builder.append(_generateStatement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateStatement(final DDLStatement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("db.execSQL(");
    _builder.newLine();
    {
      String _serialize = this._iSerializer.serialize(stmt, this.saveOptions);
      String _stripComments = this.stripComments(_serialize);
      String _trim = _stripComments.trim();
      String[] _split = _trim.split("\\r?\\n");
      boolean _hasElements = false;
      for(final String line : _split) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" +", "\t");
        }
        _builder.append("\t");
        _builder.append("\"");
        String _trim_1 = line.trim();
        String _replaceAll = _trim_1.replaceAll("\\\"", "\\\\\"");
        _builder.append(_replaceAll, "\t");
        _builder.append(" \"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(");\t");
    _builder.newLine();
    return _builder;
  }
  
  public String stripComments(final String s) {
    Matcher _matcher = this.stripCommentsExpr.matcher(s);
    return _matcher.replaceAll("");
  }
}
