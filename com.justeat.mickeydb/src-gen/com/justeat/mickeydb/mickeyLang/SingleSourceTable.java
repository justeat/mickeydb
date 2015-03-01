/**
 */
package com.justeat.mickeydb.mickeyLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Source Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.SingleSourceTable#getTableReference <em>Table Reference</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getSingleSourceTable()
 * @model
 * @generated
 */
public interface SingleSourceTable extends SelectSource
{
  /**
   * Returns the value of the '<em><b>Table Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Reference</em>' reference.
   * @see #setTableReference(TableDefinition)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getSingleSourceTable_TableReference()
   * @model
   * @generated
   */
  TableDefinition getTableReference();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.SingleSourceTable#getTableReference <em>Table Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table Reference</em>' reference.
   * @see #getTableReference()
   * @generated
   */
  void setTableReference(TableDefinition value);

} // SingleSourceTable
