package com.justeat.mickeydb.generator;

import com.google.common.base.Objects;
import com.justeat.mickeydb.ContentUriInfo;
import com.justeat.mickeydb.ContentUris;
import com.justeat.mickeydb.MickeyDatabaseModel;
import com.justeat.mickeydb.ModelUtil;
import com.justeat.mickeydb.Strings;
import com.justeat.mickeydb.generator.SqliteDatabaseSnapshot;
import com.justeat.mickeydb.mickeyLang.ActionStatement;
import com.justeat.mickeydb.mickeyLang.ColumnSource;
import com.justeat.mickeydb.mickeyLang.ColumnType;
import com.justeat.mickeydb.mickeyLang.ContentUri;
import com.justeat.mickeydb.mickeyLang.ContentUriParamSegment;
import com.justeat.mickeydb.mickeyLang.ContentUriSegment;
import com.justeat.mickeydb.mickeyLang.TableDefinition;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ContentProviderGenerator {
  public CharSequence generate(final MickeyDatabaseModel model, final ContentUris content) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    SqliteDatabaseSnapshot snapshot = model.getSnapshot();
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("/*");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* Generated by Mickey DB");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("package ");
    String _packageName = model.getPackageName();
    _builder.append(_packageName, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import android.content.Context;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import android.content.UriMatcher;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import android.net.Uri;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import java.util.Set;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import com.justeat.mickeydb.MickeyContentProvider;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import com.justeat.mickeydb.MickeyOpenHelper;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import com.justeat.mickeydb.DefaultContentProviderActions;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import com.justeat.mickeydb.ContentProviderActions;");
    _builder.newLine();
    {
      for(final ContentUriInfo uri : content.uris) {
        _builder.append("\t\t");
        _builder.append("import ");
        String _packageName_1 = model.getPackageName();
        _builder.append(_packageName_1, "\t\t");
        _builder.append(".actions.");
        String _name = uri.getName();
        String _pascalize = Strings.pascalize(_name);
        _builder.append(_pascalize, "\t\t");
        _builder.append("Actions;\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public abstract class Abstract");
    String _databaseName = model.getDatabaseName();
    String _pascalize_1 = Strings.pascalize(_databaseName);
    _builder.append(_pascalize_1, "\t\t");
    _builder.append("ContentProvider extends MickeyContentProvider {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    int counter = (-1);
    _builder.newLineIfNotEmpty();
    {
      for(final ContentUriInfo uri_1 : content.uris) {
        _builder.append("\t\t\t");
        _builder.append("public static final int ");
        String _id = uri_1.getId();
        _builder.append(_id, "\t\t\t");
        _builder.append(" = ");
        _builder.append(counter = (counter + 1), "\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("public static final int NUM_URI_MATCHERS = ");
    int _size = content.uris.size();
    _builder.append(_size, "\t\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public Abstract");
    String _databaseName_1 = model.getDatabaseName();
    String _pascalize_2 = Strings.pascalize(_databaseName_1);
    _builder.append(_pascalize_2, "\t\t\t");
    _builder.append("ContentProvider(boolean debug) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("super(debug);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public Abstract");
    String _databaseName_2 = model.getDatabaseName();
    String _pascalize_3 = Strings.pascalize(_databaseName_2);
    _builder.append(_pascalize_3, "\t\t\t");
    _builder.append("ContentProvider() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("super(false);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("protected UriMatcher createUriMatcher() {");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("final UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("final String authority = ");
    String _databaseName_3 = model.getDatabaseName();
    String _pascalize_4 = Strings.pascalize(_databaseName_3);
    _builder.append(_pascalize_4, "\t\t        ");
    _builder.append("Contract.CONTENT_AUTHORITY;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    {
      for(final ContentUriInfo uri_2 : content.uris) {
        _builder.append("\t\t\t\t");
        _builder.append("matcher.addURI(authority, \"");
        String _pathPattern = uri_2.getPathPattern();
        _builder.append(_pathPattern, "\t\t\t\t");
        _builder.append("\", ");
        String _id_1 = uri_2.getId();
        _builder.append(_id_1, "\t\t\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("return matcher;");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("protected String[] createContentTypes() {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("String[] contentTypes = new String[NUM_URI_MATCHERS];");
    _builder.newLine();
    _builder.newLine();
    {
      for(final ContentUriInfo uri_3 : content.uris) {
        {
          boolean _isDirectory = uri_3.isDirectory();
          if (_isDirectory) {
            _builder.append("\t\t\t\t");
            _builder.append("contentTypes[");
            String _id_2 = uri_3.getId();
            _builder.append(_id_2, "\t\t\t\t");
            _builder.append("] = ");
            String _databaseName_4 = model.getDatabaseName();
            String _pascalize_5 = Strings.pascalize(_databaseName_4);
            _builder.append(_pascalize_5, "\t\t\t\t");
            _builder.append("Contract.");
            String _type = uri_3.getType();
            String _pascalize_6 = Strings.pascalize(_type);
            _builder.append(_pascalize_6, "\t\t\t\t");
            _builder.append(".CONTENT_TYPE;");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t\t\t\t");
            _builder.append("contentTypes[");
            String _id_3 = uri_3.getId();
            _builder.append(_id_3, "\t\t\t\t");
            _builder.append("] = ");
            String _databaseName_5 = model.getDatabaseName();
            String _pascalize_7 = Strings.pascalize(_databaseName_5);
            _builder.append(_pascalize_7, "\t\t\t\t");
            _builder.append("Contract.");
            String _type_1 = uri_3.getType();
            String _pascalize_8 = Strings.pascalize(_type_1);
            _builder.append(_pascalize_8, "\t\t\t\t");
            _builder.append(".ITEM_CONTENT_TYPE;");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return contentTypes;");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("protected MickeyOpenHelper createOpenHelper(Context context) {");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("return new ");
    String _databaseName_6 = model.getDatabaseName();
    String _pascalize_9 = Strings.pascalize(_databaseName_6);
    _builder.append(_pascalize_9, "\t\t        ");
    _builder.append("OpenHelper(context);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("protected Set<Uri> getRelatedUris(Uri uri) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return ");
    String _databaseName_7 = model.getDatabaseName();
    String _pascalize_10 = Strings.pascalize(_databaseName_7);
    _builder.append(_pascalize_10, "\t\t\t\t");
    _builder.append("Contract.REFERENCING_VIEWS.get(uri);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("protected ContentProviderActions createActions(int id) {");
    _builder.newLine();
    _builder.append("\t\t    \t");
    _builder.append("switch(id) {");
    _builder.newLine();
    {
      for(final ContentUriInfo uri_4 : content.uris) {
        _builder.append("\t\t    \t\t");
        _builder.append("case ");
        String _id_4 = uri_4.getId();
        _builder.append(_id_4, "\t\t    \t\t");
        _builder.append(":");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t    \t\t");
        _builder.append("\t");
        _builder.append("return create");
        String _name_1 = uri_4.getName();
        String _pascalize_11 = Strings.pascalize(_name_1);
        _builder.append(_pascalize_11, "\t\t    \t\t\t");
        _builder.append("Actions();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t\t");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("throw new UnsupportedOperationException(\"Unknown id: \" + id);");
    _builder.newLine();
    _builder.append("\t\t    \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.newLine();
    {
      for(final ContentUriInfo uri_5 : content.uris) {
        _builder.append("\t\t\t");
        _builder.append("protected ContentProviderActions create");
        String _name_2 = uri_5.getName();
        String _pascalize_12 = Strings.pascalize(_name_2);
        _builder.append(_pascalize_12, "\t\t\t");
        _builder.append("Actions() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("return new ");
        String _name_3 = uri_5.getName();
        String _pascalize_13 = Strings.pascalize(_name_3);
        _builder.append(_pascalize_13, "\t\t\t\t");
        _builder.append("Actions();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("}\t\t\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String asString(final ActionStatement action) {
    StringBuilder builder = new StringBuilder();
    TableDefinition _type = action.getType();
    builder.append(_type);
    ContentUri _uri = action.getUri();
    EList<ContentUriSegment> _segments = _uri.getSegments();
    for (final ContentUriSegment seg : _segments) {
      {
        builder.append("/");
        if ((seg instanceof ContentUriParamSegment)) {
          ColumnSource _param = ((ContentUriParamSegment)seg).getParam();
          ColumnType _inferredColumnType = ModelUtil.getInferredColumnType(_param);
          boolean _equals = Objects.equal(_inferredColumnType, ColumnType.TEXT);
          if (_equals) {
            builder.append("*");
          } else {
            builder.append("#");
          }
        } else {
          String _name = seg.getName();
          builder.append(_name);
        }
      }
    }
    return builder.toString();
  }
  
  public String generateContentTypeConstantReference(final ActionStatement action, final String databaseName) {
    boolean _isUnique = action.isUnique();
    if (_isUnique) {
      String _pascalize = Strings.pascalize(databaseName);
      String _plus = (_pascalize + "Contract.");
      TableDefinition _type = action.getType();
      String _name = _type.getName();
      String _pascalize_1 = Strings.pascalize(_name);
      String _plus_1 = (_plus + _pascalize_1);
      return (_plus_1 + ".ITEM_CONTENT_TYPE");
    } else {
      String _pascalize_2 = Strings.pascalize(databaseName);
      String _plus_2 = (_pascalize_2 + "Contract.");
      TableDefinition _type_1 = action.getType();
      String _name_1 = _type_1.getName();
      String _pascalize_3 = Strings.pascalize(_name_1);
      String _plus_3 = (_plus_2 + _pascalize_3);
      return (_plus_3 + ".CONTENT_TYPE");
    }
  }
  
  public CharSequence generateStub(final MickeyDatabaseModel model, final SqliteDatabaseSnapshot snapshot) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*******************************************************************************");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Copyright (c) 2012, Robotoworks Limited");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* All rights reserved. This program and the accompanying materials");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* are made available under the terms of the Eclipse Public License v1.0");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* which accompanies this distribution, and is available at");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* http://www.eclipse.org/legal/epl-v10.html");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*******************************************************************************/");
    _builder.newLine();
    _builder.append("package ");
    String _packageName = model.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _packageName_1 = model.getPackageName();
    _builder.append(_packageName_1, "");
    _builder.append(".Abstract");
    String _databaseName = model.getDatabaseName();
    String _pascalize = Strings.pascalize(_databaseName);
    _builder.append(_pascalize, "");
    _builder.append("ContentProvider;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _databaseName_1 = model.getDatabaseName();
    String _pascalize_1 = Strings.pascalize(_databaseName_1);
    _builder.append(_pascalize_1, "");
    _builder.append("ContentProvider extends Abstract");
    String _databaseName_2 = model.getDatabaseName();
    String _pascalize_2 = Strings.pascalize(_databaseName_2);
    _builder.append(_pascalize_2, "");
    _builder.append("ContentProvider {}");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
