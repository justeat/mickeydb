/**
 */
package com.justeat.mickeydb.mickeyLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.SelectList#getResultColumns <em>Result Columns</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getSelectList()
 * @model
 * @generated
 */
public interface SelectList extends EObject
{
  /**
   * Returns the value of the '<em><b>Result Columns</b></em>' containment reference list.
   * The list contents are of type {@link com.justeat.mickeydb.mickeyLang.ColumnSource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result Columns</em>' containment reference list.
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getSelectList_ResultColumns()
   * @model containment="true"
   * @generated
   */
  EList<ColumnSource> getResultColumns();

} // SelectList
