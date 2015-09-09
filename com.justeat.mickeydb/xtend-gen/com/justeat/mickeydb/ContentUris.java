package com.justeat.mickeydb;

import com.justeat.mickeydb.ContentUriInfo;
import com.justeat.mickeydb.MickeyDatabaseModel;
import com.justeat.mickeydb.ModelUtil;
import com.justeat.mickeydb.Strings;
import com.justeat.mickeydb.generator.SqliteDatabaseSnapshot;
import com.justeat.mickeydb.mickeyLang.ActionStatement;
import com.justeat.mickeydb.mickeyLang.ContentUri;
import com.justeat.mickeydb.mickeyLang.ContentUriParamSegment;
import com.justeat.mickeydb.mickeyLang.ContentUriSegment;
import com.justeat.mickeydb.mickeyLang.CreateTableStatement;
import com.justeat.mickeydb.mickeyLang.CreateViewStatement;
import com.justeat.mickeydb.mickeyLang.MickeyFunction;
import com.justeat.mickeydb.mickeyLang.TableDefinition;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ContentUris {
  public ArrayList<ContentUriInfo> uris = new ArrayList<ContentUriInfo>();
  
  public void init(final MickeyDatabaseModel model) {
    SqliteDatabaseSnapshot _snapshot = model.getSnapshot();
    ArrayList<CreateTableStatement> _tables = _snapshot.getTables();
    for (final CreateTableStatement tbl : _tables) {
      {
        ContentUriInfo info = new ContentUriInfo();
        String _name = tbl.getName();
        String _underscore = Strings.underscore(_name);
        String _upperCase = _underscore.toUpperCase();
        info.setId(_upperCase);
        String _name_1 = tbl.getName();
        info.setPathPattern(_name_1);
        info.setDirectory(true);
        String _name_2 = tbl.getName();
        info.setType(_name_2);
        info.setTypeRef(tbl);
        boolean _hasAndroidPrimaryKey = ModelUtil.hasAndroidPrimaryKey(tbl);
        info.setSupportsActiveRecord(_hasAndroidPrimaryKey);
        this.uris.add(info);
        boolean _hasAndroidPrimaryKey_1 = ModelUtil.hasAndroidPrimaryKey(tbl);
        if (_hasAndroidPrimaryKey_1) {
          ContentUriInfo infoItem = new ContentUriInfo();
          String _name_3 = tbl.getName();
          String _underscore_1 = Strings.underscore(_name_3);
          String _upperCase_1 = _underscore_1.toUpperCase();
          String _plus = (_upperCase_1 + "_ID");
          infoItem.setId(_plus);
          String _name_4 = tbl.getName();
          String _plus_1 = (_name_4 + "/#");
          infoItem.setPathPattern(_plus_1);
          infoItem.setDirectory(false);
          String _name_5 = tbl.getName();
          infoItem.setType(_name_5);
          infoItem.setTypeRef(tbl);
          boolean _hasAndroidPrimaryKey_2 = ModelUtil.hasAndroidPrimaryKey(tbl);
          infoItem.setSupportsActiveRecord(_hasAndroidPrimaryKey_2);
          this.uris.add(infoItem);
        }
      }
    }
    SqliteDatabaseSnapshot _snapshot_1 = model.getSnapshot();
    ArrayList<CreateViewStatement> _views = _snapshot_1.getViews();
    for (final CreateViewStatement vw : _views) {
      {
        ContentUriInfo info = new ContentUriInfo();
        String _name = vw.getName();
        String _underscore = Strings.underscore(_name);
        String _upperCase = _underscore.toUpperCase();
        info.setId(_upperCase);
        String _name_1 = vw.getName();
        info.setPathPattern(_name_1);
        info.setDirectory(true);
        String _name_2 = vw.getName();
        info.setType(_name_2);
        info.setTypeRef(vw);
        boolean _hasAndroidPrimaryKey = ModelUtil.hasAndroidPrimaryKey(vw);
        info.setSupportsActiveRecord(_hasAndroidPrimaryKey);
        this.uris.add(info);
        boolean _hasAndroidPrimaryKey_1 = ModelUtil.hasAndroidPrimaryKey(vw);
        if (_hasAndroidPrimaryKey_1) {
          ContentUriInfo infoItem = new ContentUriInfo();
          String _name_3 = vw.getName();
          String _underscore_1 = Strings.underscore(_name_3);
          String _upperCase_1 = _underscore_1.toUpperCase();
          String _plus = (_upperCase_1 + "_ID");
          infoItem.setId(_plus);
          String _name_4 = vw.getName();
          String _plus_1 = (_name_4 + "/#");
          infoItem.setPathPattern(_plus_1);
          infoItem.setDirectory(false);
          String _name_5 = vw.getName();
          infoItem.setType(_name_5);
          infoItem.setTypeRef(vw);
          boolean _hasAndroidPrimaryKey_2 = ModelUtil.hasAndroidPrimaryKey(vw);
          infoItem.setSupportsActiveRecord(_hasAndroidPrimaryKey_2);
          this.uris.add(infoItem);
        }
      }
    }
    for (final CreateTableStatement tbl_1 : model.initTables) {
      {
        ContentUriInfo info = new ContentUriInfo();
        String _name = tbl_1.getName();
        String _underscore = Strings.underscore(_name);
        String _upperCase = _underscore.toUpperCase();
        info.setId(_upperCase);
        String _name_1 = tbl_1.getName();
        info.setPathPattern(_name_1);
        info.setDirectory(true);
        String _name_2 = tbl_1.getName();
        info.setType(_name_2);
        info.setTypeRef(tbl_1);
        boolean _hasAndroidPrimaryKey = ModelUtil.hasAndroidPrimaryKey(tbl_1);
        info.setSupportsActiveRecord(_hasAndroidPrimaryKey);
        this.uris.add(info);
        boolean _hasAndroidPrimaryKey_1 = ModelUtil.hasAndroidPrimaryKey(tbl_1);
        if (_hasAndroidPrimaryKey_1) {
          ContentUriInfo infoItem = new ContentUriInfo();
          String _name_3 = tbl_1.getName();
          String _underscore_1 = Strings.underscore(_name_3);
          String _upperCase_1 = _underscore_1.toUpperCase();
          String _plus = (_upperCase_1 + "_ID");
          infoItem.setId(_plus);
          String _name_4 = tbl_1.getName();
          String _plus_1 = (_name_4 + "/#");
          infoItem.setPathPattern(_plus_1);
          infoItem.setDirectory(false);
          String _name_5 = tbl_1.getName();
          infoItem.setType(_name_5);
          infoItem.setTypeRef(tbl_1);
          boolean _hasAndroidPrimaryKey_2 = ModelUtil.hasAndroidPrimaryKey(tbl_1);
          infoItem.setSupportsActiveRecord(_hasAndroidPrimaryKey_2);
          this.uris.add(infoItem);
        }
      }
    }
    for (final CreateViewStatement vw_1 : model.initViews) {
      {
        ContentUriInfo info = new ContentUriInfo();
        String _name = vw_1.getName();
        String _underscore = Strings.underscore(_name);
        String _upperCase = _underscore.toUpperCase();
        info.setId(_upperCase);
        String _name_1 = vw_1.getName();
        info.setPathPattern(_name_1);
        info.setDirectory(true);
        String _name_2 = vw_1.getName();
        info.setType(_name_2);
        info.setTypeRef(vw_1);
        boolean _hasAndroidPrimaryKey = ModelUtil.hasAndroidPrimaryKey(vw_1);
        info.setSupportsActiveRecord(_hasAndroidPrimaryKey);
        this.uris.add(info);
        boolean _hasAndroidPrimaryKey_1 = ModelUtil.hasAndroidPrimaryKey(vw_1);
        if (_hasAndroidPrimaryKey_1) {
          ContentUriInfo infoItem = new ContentUriInfo();
          String _name_3 = vw_1.getName();
          String _underscore_1 = Strings.underscore(_name_3);
          String _upperCase_1 = _underscore_1.toUpperCase();
          String _plus = (_upperCase_1 + "_ID");
          infoItem.setId(_plus);
          String _name_4 = vw_1.getName();
          String _plus_1 = (_name_4 + "/#");
          infoItem.setPathPattern(_plus_1);
          infoItem.setDirectory(false);
          String _name_5 = vw_1.getName();
          infoItem.setType(_name_5);
          infoItem.setTypeRef(vw_1);
          boolean _hasAndroidPrimaryKey_2 = ModelUtil.hasAndroidPrimaryKey(vw_1);
          infoItem.setSupportsActiveRecord(_hasAndroidPrimaryKey_2);
          this.uris.add(infoItem);
        }
      }
    }
    for (final ActionStatement a : model.actions) {
      {
        final Function1<ContentUriInfo, Boolean> _function = new Function1<ContentUriInfo, Boolean>() {
          public Boolean apply(final ContentUriInfo item) {
            String _type = item.getType();
            ContentUri _uri = a.getUri();
            TableDefinition _type_1 = _uri.getType();
            String _name = _type_1.getName();
            return Boolean.valueOf(_type.equals(_name));
          }
        };
        Iterable<ContentUriInfo> toRemove = IterableExtensions.<ContentUriInfo>filter(this.uris, _function);
        CollectionExtensions.<ContentUriInfo>removeAll(this.uris, toRemove);
      }
    }
    for (final ActionStatement a_1 : model.actions) {
      {
        ContentUriInfo info = new ContentUriInfo();
        info.setAction(a_1);
        String _name = a_1.getName();
        String _underscore = Strings.underscore(_name);
        String _upperCase = _underscore.toUpperCase();
        info.setId(_upperCase);
        String _name_1 = a_1.getName();
        info.setName(_name_1);
        ContentUri _uri = a_1.getUri();
        String _asString = this.asString(_uri);
        info.setPathPattern(_asString);
        ContentUri _uri_1 = a_1.getUri();
        boolean _isUnique = _uri_1.isUnique();
        boolean _not = (!_isUnique);
        info.setDirectory(_not);
        ContentUri _uri_2 = a_1.getUri();
        TableDefinition _type = _uri_2.getType();
        String _name_2 = _type.getName();
        info.setType(_name_2);
        ContentUri _uri_3 = a_1.getUri();
        TableDefinition _type_1 = _uri_3.getType();
        info.setTypeRef(_type_1);
        info.setUserDefined(true);
        ContentUri _uri_4 = a_1.getUri();
        TableDefinition _type_2 = _uri_4.getType();
        boolean _hasAndroidPrimaryKey = ModelUtil.hasAndroidPrimaryKey(_type_2);
        info.setSupportsActiveRecord(_hasAndroidPrimaryKey);
        this.uris.add(info);
      }
    }
    for (final MickeyFunction f : model.functions) {
      {
        ContentUriInfo info = new ContentUriInfo();
        String _name = f.getName();
        String _underscore = Strings.underscore(_name);
        String _upperCase = _underscore.toUpperCase();
        info.setId(_upperCase);
        String _name_1 = f.getName();
        String _plus = ("_func/" + _name_1);
        info.setPathPattern(_plus);
        info.setDirectory(true);
        TableDefinition _type = f.getType();
        String _name_2 = _type.getName();
        info.setType(_name_2);
        TableDefinition _type_1 = f.getType();
        info.setTypeRef(_type_1);
        this.uris.add(info);
      }
    }
  }
  
  public String asString(final ContentUri uri) {
    StringBuilder builder = new StringBuilder();
    EList<ContentUriSegment> _segments = uri.getSegments();
    for (final ContentUriSegment seg : _segments) {
      {
        builder.append("/");
        if ((seg instanceof ContentUriParamSegment)) {
          ContentUriParamSegment paramSeg = ((ContentUriParamSegment) seg);
          boolean _isNum = paramSeg.isNum();
          if (_isNum) {
            builder.append("#");
          } else {
            builder.append("*");
          }
        } else {
          String _name = seg.getName();
          builder.append(_name);
        }
      }
    }
    return builder.toString();
  }
}
