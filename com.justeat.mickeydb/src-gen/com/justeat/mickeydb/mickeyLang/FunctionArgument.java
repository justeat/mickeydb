/**
 */
package com.justeat.mickeydb.mickeyLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.FunctionArgument#getArg <em>Arg</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getFunctionArgument()
 * @model
 * @generated
 */
public interface FunctionArgument extends Expression
{
  /**
   * Returns the value of the '<em><b>Arg</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' reference.
   * @see #setArg(FunctionArg)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getFunctionArgument_Arg()
   * @model
   * @generated
   */
  FunctionArg getArg();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.FunctionArgument#getArg <em>Arg</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' reference.
   * @see #getArg()
   * @generated
   */
  void setArg(FunctionArg value);

} // FunctionArgument
