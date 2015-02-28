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
import com.justeat.mickeydb.mickeyLang.CreateViewStatement;
import com.justeat.mickeydb.mickeyLang.MickeyBlock;
import com.justeat.mickeydb.mickeyLang.MickeyFunction;
import com.justeat.mickeydb.mickeyLang.MickeyLangPackage;
import com.justeat.mickeydb.mickeyLang.MigrationBlock;
import com.justeat.mickeydb.mickeyLang.Model;
import com.justeat.mickeydb.mickeyLang.ResultColumn;
import com.justeat.mickeydb.mickeyLang.TableDefinition;

public class MickeyNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	protected QualifiedName qualifiedName(Model ele){
		return QualifiedName.create(
				ele.getDatabaseName());
	}
	
	protected QualifiedName qualifiedName(MickeyBlock ele){
		Model model = getModel(ele);
		return QualifiedName.create(
				model.getDatabaseName());
	}
	
	protected QualifiedName qualifiedName(MigrationBlock ele){
		Model model = getModel(ele);
		return QualifiedName.create(
				model.getDatabaseName());
	}
	
	protected QualifiedName qualifiedName(ColumnDef def) {
		Model model = getModel(def);
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
		Model model = getModel(ele);
		return QualifiedName.create(
				model.getDatabaseName(),
				ele.getName());
	}
	
	protected QualifiedName qualifiedName(MickeyFunction ele){
		Model model = getModel(ele);
		return QualifiedName.create(
				model.getDatabaseName(),
				ele.getName());
	}
	
	protected QualifiedName qualifiedName(AlterTableAddColumnStatement ele){
		Model model = getModel(ele);
		return QualifiedName.create(
				model.getDatabaseName());
	}
	
	protected QualifiedName qualifiedName(ResultColumn e) {
		Model model = getContainerOfType(e, Model.class);
		CreateViewStatement s = getContainerOfType(e, CreateViewStatement.class);
		if(s != null) {
			return QualifiedName.create(
					model.getDatabaseName(),
					s.getName(),
					e.getName());
		}
		
		return null;
	}

	private Model getModel(EObject ele) {
		do {
			ele = ele.eContainer();
		} while (!(ele instanceof Model));
		
		return (Model) ele;
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
