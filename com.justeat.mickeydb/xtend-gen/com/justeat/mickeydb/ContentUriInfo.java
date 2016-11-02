package com.justeat.mickeydb;

import com.justeat.mickeydb.mickeyLang.ActionStatement;
import com.justeat.mickeydb.mickeyLang.TableDefinition;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class ContentUriInfo {
  @Accessors
  private String id;
  
  @Accessors
  private String name;
  
  @Accessors
  private boolean directory;
  
  @Accessors
  private String type;
  
  @Accessors
  private TableDefinition typeRef;
  
  @Accessors
  private String pathPattern;
  
  @Accessors
  private boolean userDefined;
  
  @Accessors
  private boolean supportsActiveRecord;
  
  @Accessors
  private ActionStatement action;
  
  @Pure
  public String getId() {
    return this.id;
  }
  
  public void setId(final String id) {
    this.id = id;
  }
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  @Pure
  public boolean isDirectory() {
    return this.directory;
  }
  
  public void setDirectory(final boolean directory) {
    this.directory = directory;
  }
  
  @Pure
  public String getType() {
    return this.type;
  }
  
  public void setType(final String type) {
    this.type = type;
  }
  
  @Pure
  public TableDefinition getTypeRef() {
    return this.typeRef;
  }
  
  public void setTypeRef(final TableDefinition typeRef) {
    this.typeRef = typeRef;
  }
  
  @Pure
  public String getPathPattern() {
    return this.pathPattern;
  }
  
  public void setPathPattern(final String pathPattern) {
    this.pathPattern = pathPattern;
  }
  
  @Pure
  public boolean isUserDefined() {
    return this.userDefined;
  }
  
  public void setUserDefined(final boolean userDefined) {
    this.userDefined = userDefined;
  }
  
  @Pure
  public boolean isSupportsActiveRecord() {
    return this.supportsActiveRecord;
  }
  
  public void setSupportsActiveRecord(final boolean supportsActiveRecord) {
    this.supportsActiveRecord = supportsActiveRecord;
  }
  
  @Pure
  public ActionStatement getAction() {
    return this.action;
  }
  
  public void setAction(final ActionStatement action) {
    this.action = action;
  }
}
