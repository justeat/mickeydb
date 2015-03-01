/**
 */
package com.justeat.mickeydb.mickeyLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Default Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.LiteralDefaultValue#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getLiteralDefaultValue()
 * @model
 * @generated
 */
public interface LiteralDefaultValue extends DefaultValue
{
  /**
   * Returns the value of the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' containment reference.
   * @see #setLiteral(LiteralValue)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getLiteralDefaultValue_Literal()
   * @model containment="true"
   * @generated
   */
  LiteralValue getLiteral();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.LiteralDefaultValue#getLiteral <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' containment reference.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(LiteralValue value);

} // LiteralDefaultValue
