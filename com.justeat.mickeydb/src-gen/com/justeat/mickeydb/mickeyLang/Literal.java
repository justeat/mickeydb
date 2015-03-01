/**
 */
package com.justeat.mickeydb.mickeyLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.Literal#getLiteralValue <em>Literal Value</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends Expression
{
  /**
   * Returns the value of the '<em><b>Literal Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal Value</em>' containment reference.
   * @see #setLiteralValue(LiteralValue)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getLiteral_LiteralValue()
   * @model containment="true"
   * @generated
   */
  LiteralValue getLiteralValue();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.Literal#getLiteralValue <em>Literal Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal Value</em>' containment reference.
   * @see #getLiteralValue()
   * @generated
   */
  void setLiteralValue(LiteralValue value);

} // Literal
