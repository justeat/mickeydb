package com.justeat.mickeydb;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import com.justeat.mickeydb.mickeyLang.AlterTableAddColumnStatement;
import com.justeat.mickeydb.mickeyLang.ColumnDef;
import com.justeat.mickeydb.mickeyLang.CreateTableStatement;
import com.justeat.mickeydb.mickeyLang.CreateTriggerStatement;
import com.justeat.mickeydb.mickeyLang.CreateViewStatement;
import com.justeat.mickeydb.mickeyLang.MickeyBlock;
import com.justeat.mickeydb.mickeyLang.MickeyFunction;
import com.justeat.mickeydb.mickeyLang.MickeyLangPackage;
import com.justeat.mickeydb.mickeyLang.MigrationBlock;
import com.justeat.mickeydb.mickeyLang.MickeyFile;
import com.justeat.mickeydb.mickeyLang.ResultColumn;
import com.justeat.mickeydb.mickeyLang.TableDefinition;

public class MickeyNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	protected QualifiedName qualifiedName(MickeyFile ele){
		return QualifiedName.create(
				ele.getDatabaseName());
	}
	
//	protected QualifiedName qualifiedName(MickeyBlock ele){
//		Model model = getModel(ele);
//		return QualifiedName.create(
//				model.getDatabaseName());
//	}
	
	protected QualifiedName qualifiedName(MigrationBlock ele){
		MickeyFile model = getModel(ele);
		return QualifiedName.create(
				model.getDatabaseName(),
				ele.getName());
	}
	
	protected QualifiedName qualifiedName(ColumnDef def) {
		MickeyFile model = getModel(def);
		if(def.eContainer() instanceof AlterTableAddColumnStatement) {
			List<INode> nodes = NodeModelUtils.findNodesForFeature(def.eContainer(), MickeyLangPackage.Literals.ALTER_TABLE_ADD_COLUMN_STATEMENT__TABLE);
			String tableName = NodeModelUtils.getTokenText(nodes.get(0));
			return QualifiedName.create(
					model.getDatabaseName(),
					tableName,
					def.getName());
		} else {
			CreateTableStatement s = (CreateTableStatement) def.eContainer();
			return QualifiedName.create(
					model.getDatabaseName(),
					s.getName(),
					def.getName());
		}
	}
	
	protected QualifiedName qualifiedName(TableDefinition ele){
		MickeyFile model = getModel(ele);
		return QualifiedName.create(
				model.getDatabaseName(),
				ele.getName());
	}
	
	protected QualifiedName qualifiedName(MickeyFunction ele){
		MickeyFile model = getModel(ele);
		return QualifiedName.create(
				model.getDatabaseName(),
				ele.getName());
	}
	
	protected QualifiedName qualifiedName(AlterTableAddColumnStatement ele){
		MickeyFile model = getModel(ele);
		return QualifiedName.create(
				model.getDatabaseName());
	}
	
	protected QualifiedName qualifiedName(CreateTriggerStatement ele){
		MickeyFile model = getModel(ele);
		return QualifiedName.create(
				model.getDatabaseName(),
				ele.getName());
	}
	
	protected QualifiedName qualifiedName(ResultColumn e) {
		MickeyFile model = getContainerOfType(e, MickeyFile.class);
		CreateViewStatement s = getContainerOfType(e, CreateViewStatement.class);
		if(s != null) {
			return QualifiedName.create(
					model.getDatabaseName(),
					s.getName(),
					e.getName());
		}
		
		return null;
	}

	private MickeyFile getModel(EObject ele) {
		do {
			ele = ele.eContainer();
		} while (!(ele instanceof MickeyFile));
		
		return (MickeyFile) ele;
	}
	
	private <T> T getContainerOfType(EObject ele, Class<T> type) {
		do {
			ele = ele.eContainer();
			if(ele == null) {
				break;
			}
		} while (!type.isAssignableFrom(ele.getClass()));
		
		return (T) ele;
	}
}
