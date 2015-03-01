/**
 */
package com.justeat.mickeydb.mickeyLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Arg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.FunctionArg#getType <em>Type</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.FunctionArg#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getFunctionArg()
 * @model
 * @generated
 */
public interface FunctionArg extends EObject
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
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getFunctionArg_Type()
   * @model
   * @generated
   */
  ColumnType getType();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.FunctionArg#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.justeat.mickeydb.mickeyLang.ColumnType
   * @see #getType()
   * @generated
   */
  void setType(ColumnType value);

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
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getFunctionArg_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.FunctionArg#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // FunctionArg
