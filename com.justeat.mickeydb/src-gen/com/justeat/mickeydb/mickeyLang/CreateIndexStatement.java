/**
 */
package com.justeat.mickeydb.mickeyLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Index Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.CreateIndexStatement#isUnique <em>Unique</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.CreateIndexStatement#getName <em>Name</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.CreateIndexStatement#getTable <em>Table</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.CreateIndexStatement#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCreateIndexStatement()
 * @model
 * @generated
 */
public interface CreateIndexStatement extends DDLStatement
{
  /**
   * Returns the value of the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unique</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique</em>' attribute.
   * @see #setUnique(boolean)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCreateIndexStatement_Unique()
   * @model
   * @generated
   */
  boolean isUnique();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.CreateIndexStatement#isUnique <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique</em>' attribute.
   * @see #isUnique()
   * @generated
   */
  void setUnique(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCreateIndexStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.CreateIndexStatement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' reference.
   * @see #setTable(TableDefinition)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCreateIndexStatement_Table()
   * @model
   * @generated
   */
  TableDefinition getTable();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.CreateIndexStatement#getTable <em>Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' reference.
   * @see #getTable()
   * @generated
   */
  void setTable(TableDefinition value);

  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link com.justeat.mickeydb.mickeyLang.IndexedColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCreateIndexStatement_Columns()
   * @model containment="true"
   * @generated
   */
  EList<IndexedColumn> getColumns();

} // CreateIndexStatement
