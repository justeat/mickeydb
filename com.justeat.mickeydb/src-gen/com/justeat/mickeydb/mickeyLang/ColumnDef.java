/**
 */
package com.justeat.mickeydb.mickeyLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.ColumnDef#getType <em>Type</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.ColumnDef#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getColumnDef()
 * @model
 * @generated
 */
public interface ColumnDef extends ColumnSource
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.justeat.mickeydb.mickeyLang.ColumnType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.justeat.mickeydb.mickeyLang.ColumnType
   * @see #setType(ColumnType)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getColumnDef_Type()
   * @model
   * @generated
   */
  ColumnType getType();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.ColumnDef#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.justeat.mickeydb.mickeyLang.ColumnType
   * @see #getType()
   * @generated
   */
  void setType(ColumnType value);

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link com.justeat.mickeydb.mickeyLang.ColumnConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getColumnDef_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<ColumnConstraint> getConstraints();

} // ColumnDef
