package com.justeat.mickeydb.generator;


import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import com.google.inject.Inject;
import com.justeat.mickeydb.MickeyDatabaseModel;
import com.justeat.mickeydb.mickeyLang.AlterTableAddColumnStatement;
import com.justeat.mickeydb.mickeyLang.AlterTableRenameStatement;
import com.justeat.mickeydb.mickeyLang.ColumnDef;
import com.justeat.mickeydb.mickeyLang.ColumnSource;
import com.justeat.mickeydb.mickeyLang.CreateIndexStatement;
import com.justeat.mickeydb.mickeyLang.CreateTableStatement;
import com.justeat.mickeydb.mickeyLang.CreateTriggerStatement;
import com.justeat.mickeydb.mickeyLang.CreateViewStatement;
import com.justeat.mickeydb.mickeyLang.DDLStatement;
import com.justeat.mickeydb.mickeyLang.DropIndexStatement;
import com.justeat.mickeydb.mickeyLang.DropTableStatement;
import com.justeat.mickeydb.mickeyLang.DropTriggerStatement;
import com.justeat.mickeydb.mickeyLang.DropViewStatement;
import com.justeat.mickeydb.mickeyLang.IndexedColumn;
import com.justeat.mickeydb.mickeyLang.MickeyFile;
import com.justeat.mickeydb.mickeyLang.MickeyLangFactory;
import com.justeat.mickeydb.mickeyLang.MigrationBlock;
import com.justeat.mickeydb.mickeyLang.MickeyFile;
import com.justeat.mickeydb.mickeyLang.PrimaryConstraint;
import com.justeat.mickeydb.mickeyLang.TableConstraint;
import com.justeat.mickeydb.mickeyLang.TableDefinition;
import com.justeat.mickeydb.mickeyLang.UniqueTableConstraint;


public class SqliteDatabaseSnapshot {
	
	public static class Builder {
		@Inject XtextResourceSet mSnapshotResourceSet;
		
		private LinkedHashMap<String, CreateTableStatement> mTables = new LinkedHashMap<String, CreateTableStatement>();
		private LinkedHashMap<String, CreateViewStatement> mViews = new LinkedHashMap<String, CreateViewStatement>();
		private LinkedHashMap<String, CreateTriggerStatement> mTriggers = new LinkedHashMap<String, CreateTriggerStatement>();
		private LinkedHashMap<String, CreateIndexStatement> mIndexes = new LinkedHashMap<String, CreateIndexStatement>();
		private MickeyFile mSnapshotModel;
	
		private MickeyDatabaseModel mSourceModel;
		
		private void buildSnapshot(MickeyDatabaseModel model) {
			for(MigrationBlock migration : model.migrations) {
				EList<DDLStatement> statements = migration.getStatements();
				
				for(DDLStatement statement : statements) {
					if(statement instanceof CreateTableStatement) {
						
						CreateTableStatement createTableStmt = (CreateTableStatement) statement;
						
						CreateTableStatement copy = EcoreUtil2.copy(createTableStmt);
						mTables.put(createTableStmt.getName(), copy);
						
					} else if (statement instanceof CreateViewStatement) {
						
						CreateViewStatement createViewStmt = (CreateViewStatement) statement;
						
						mViews.put(createViewStmt.getName(), createViewStmt);
						
					} else if(statement instanceof AlterTableRenameStatement) {
						
						AlterTableRenameStatement renameStmt = (AlterTableRenameStatement) statement;
						
						CreateTableStatement tableToAlter = mTables.get(renameStmt.getTable().getName());
						
						tableToAlter.setName(renameStmt.getName());
						
						mTables.put(renameStmt.getName(), tableToAlter);
						mTables.remove(renameStmt.getTable().getName());
					} 
					else if (statement instanceof AlterTableAddColumnStatement) {
						AlterTableAddColumnStatement addColumnStmt = (AlterTableAddColumnStatement) statement;

						CreateTableStatement tableToAlter = mTables.get(addColumnStmt.getTable().getName());
						
						tableToAlter.getColumnDefs().add(EcoreUtil.copy(addColumnStmt.getColumnDef()));	
					}
					else if (statement instanceof CreateTriggerStatement) {
						CreateTriggerStatement createTriggerStmt = (CreateTriggerStatement) statement;
						
						mTriggers.put(createTriggerStmt.getName(), createTriggerStmt);
						
					}
					else if (statement instanceof CreateIndexStatement) {
                        CreateIndexStatement createIndexStmt = (CreateIndexStatement) statement;
                        
                        mIndexes.put(createIndexStmt.getName(), createIndexStmt);
                        
                    }
					else if (statement instanceof DropTableStatement) {
						DropTableStatement dropTableStmt = (DropTableStatement) statement;
						mTables.remove(dropTableStmt.getTable().getName());
					} 
					else if (statement instanceof DropViewStatement) {
						DropViewStatement dropViewStmt = (DropViewStatement) statement;
						mViews.remove(dropViewStmt.getView().getName());
					} 
					else if (statement instanceof DropTriggerStatement) {
						DropTriggerStatement dropTriggerStmt = (DropTriggerStatement) statement;
						mTriggers.remove(dropTriggerStmt.getTrigger().getName());					
					} 
					else if(statement instanceof DropIndexStatement) {
					    DropIndexStatement dropIndexStmt = (DropIndexStatement) statement;
					    mIndexes.remove(dropIndexStmt.getIndex().getName());					
					}
				}
			}
		}

		private void buildSnapshotModel() {
			XtextResource resource = (XtextResource) mSnapshotResourceSet.createResource(URI.createURI("platform:/resource/app1/temp.mickey"));
			
			mSnapshotModel = (MickeyFile) MickeyLangFactory.eINSTANCE.createMickeyFile();
			mSnapshotModel.setDatabaseName(mSourceModel.getDatabaseName());
			
			resource.getContents().add(mSnapshotModel);
		
			MigrationBlock migration = (MigrationBlock) MickeyLangFactory.eINSTANCE.createMigrationBlock();
			mSnapshotModel.getBlocks().add(migration);
					
			for(CreateTableStatement stmt : mTables.values()) {
				migration.getStatements().add(stmt);
				resolveIndexedColumnReferences(stmt);
			}	
			
			EcoreUtil2.resolveAll(mSnapshotResourceSet);
		}
		
		private void resolveIndexedColumnReferences(CreateTableStatement stmt) {
			Iterable<IndexedColumn> columns = null;
			
			for(TableConstraint c : stmt.getConstraints()) {
				if(c instanceof UniqueTableConstraint) {
					UniqueTableConstraint uc = (UniqueTableConstraint) c;
					
					columns = uc.getColumns();
				} else if (c instanceof PrimaryConstraint) {
					PrimaryConstraint pc = (PrimaryConstraint) c;
					
					columns = pc.getColumns();
				}
				
				if(columns == null) {
					return;
				}
				
				for(final IndexedColumn col : columns) {
					ColumnSource source = IterableExtensions.findFirst(stmt.getColumnDefs(), new Function1<ColumnSource, Boolean>(){
						public Boolean apply(ColumnSource p) {
							if(p.getName().equals(col.getColumnReference().getName())) {
								return true;
							}
							
							return false;
						}
					});
					
					col.setColumnReference((ColumnDef) source);
				}
			}
		}

		public SqliteDatabaseSnapshot build(MickeyDatabaseModel model) {
			mSourceModel = model;
			
			//buildSnapshot(model);
			
			try {
				buildSnapshot(model);
					
			} catch(Exception e) {
				e.printStackTrace();
				throw e;
			}
			
			buildSnapshotModel();
			
			return new SqliteDatabaseSnapshot(mTables, mViews, mTriggers, mIndexes);
		}
	}
	
	private ArrayList<CreateTableStatement> mTables = new ArrayList<>();
	private ArrayList<CreateViewStatement> mViews= new ArrayList<>();
	private ArrayList<CreateTriggerStatement> mTriggers= new ArrayList<>();
	private ArrayList<CreateIndexStatement> mIndexes= new ArrayList<>();
	private LinkedHashMap<String, CreateTableStatement> mTableMap;
	private LinkedHashMap<String, CreateViewStatement> mViewMap;
	private LinkedHashMap<String, CreateTriggerStatement> mTriggerMap;
	private LinkedHashMap<String, CreateIndexStatement> mCreateIndexMap;
	
	public SqliteDatabaseSnapshot(
			LinkedHashMap<String, CreateTableStatement> tables,
			LinkedHashMap<String, CreateViewStatement> views,
			LinkedHashMap<String, CreateTriggerStatement> triggers,
			LinkedHashMap<String, CreateIndexStatement> indexes) {
		
		mTableMap = tables;
		mViewMap = views;
		mTriggerMap = triggers;
		mCreateIndexMap = indexes;
		
		mTables.addAll(tables.values());
		mViews.addAll(views.values());
		mTriggers.addAll(triggers.values());
		mIndexes.addAll(indexes.values());
	}

	public ArrayList<CreateTableStatement> getTables() {
		return mTables;
	}
	
	public ArrayList<CreateViewStatement> getViews() {
		return mViews;
	}
	
	public ArrayList<CreateTriggerStatement> getTriggers() {
		return mTriggers;
	}
	
	public ArrayList<CreateIndexStatement> getIndexes() {
	    return mIndexes;
	}
	
    public boolean containsDefinition(final String name) {
        CreateTableStatement tableStmt = IterableExtensions.findFirst(mTables, new Function1<CreateTableStatement, Boolean>() {
            @Override
            public Boolean apply(CreateTableStatement p) {
                return p.getName().equals(name);
            }
        });
        
        if(tableStmt != null) {
            return true;
        }
        
        CreateViewStatement viewStmt = IterableExtensions.findFirst(mViews, new Function1<CreateViewStatement, Boolean>() {
            @Override
            public Boolean apply(CreateViewStatement p) {
                return p.getName().equals(name);
            }
        });
        
        if(viewStmt != null) {
            return true;
        }
        
        return false;
    }
    
    public TableDefinition getTableDefinition(String name) {
    	TableDefinition tbl =  mTableMap.get(name);
    	if(tbl == null) {
    		tbl = mViewMap.get(name);
    	}
    	
    	return tbl;
    }
}
