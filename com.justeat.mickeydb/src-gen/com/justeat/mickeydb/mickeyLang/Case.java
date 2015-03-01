/**
 */
package com.justeat.mickeydb.mickeyLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.Case#getWhenExpression <em>When Expression</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.Case#getThenExpression <em>Then Expression</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCase()
 * @model
 * @generated
 */
public interface Case extends EObject
{
  /**
   * Returns the value of the '<em><b>When Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When Expression</em>' containment reference.
   * @see #setWhenExpression(Expression)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCase_WhenExpression()
   * @model containment="true"
   * @generated
   */
  Expression getWhenExpression();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.Case#getWhenExpression <em>When Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When Expression</em>' containment reference.
   * @see #getWhenExpression()
   * @generated
   */
  void setWhenExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Then Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Expression</em>' containment reference.
   * @see #setThenExpression(Expression)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCase_ThenExpression()
   * @model containment="true"
   * @generated
   */
  Expression getThenExpression();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.Case#getThenExpression <em>Then Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Expression</em>' containment reference.
   * @see #getThenExpression()
   * @generated
   */
  void setThenExpression(Expression value);

} // Case
