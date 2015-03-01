/**
 */
package com.justeat.mickeydb.mickeyLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.CaseExpression#getCaseExpression <em>Case Expression</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.CaseExpression#getCases <em>Cases</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.CaseExpression#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCaseExpression()
 * @model
 * @generated
 */
public interface CaseExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Case Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Expression</em>' containment reference.
   * @see #setCaseExpression(Expression)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCaseExpression_CaseExpression()
   * @model containment="true"
   * @generated
   */
  Expression getCaseExpression();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.CaseExpression#getCaseExpression <em>Case Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case Expression</em>' containment reference.
   * @see #getCaseExpression()
   * @generated
   */
  void setCaseExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link com.justeat.mickeydb.mickeyLang.Case}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCaseExpression_Cases()
   * @model containment="true"
   * @generated
   */
  EList<Case> getCases();

  /**
   * Returns the value of the '<em><b>Else Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Expression</em>' containment reference.
   * @see #setElseExpression(Expression)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getCaseExpression_ElseExpression()
   * @model containment="true"
   * @generated
   */
  Expression getElseExpression();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.CaseExpression#getElseExpression <em>Else Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Expression</em>' containment reference.
   * @see #getElseExpression()
   * @generated
   */
  void setElseExpression(Expression value);

} // CaseExpression
