/**
 */
package com.justeat.mickeydb.mickeyLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Table Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.CheckTableConstraint#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCheckTableConstraint()
 * @model
 * @generated
 */
public interface CheckTableConstraint extends TableConstraint
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCheckTableConstraint_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.CheckTableConstraint#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // CheckTableConstraint
