/**
 */
package com.justeat.mickeydb.mickeyLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.JoinSource#getSource <em>Source</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.JoinSource#getJoinStatements <em>Join Statements</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getJoinSource()
 * @model
 * @generated
 */
public interface JoinSource extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(SingleSource)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getJoinSource_Source()
   * @model containment="true"
   * @generated
   */
  SingleSource getSource();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.JoinSource#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(SingleSource value);

  /**
   * Returns the value of the '<em><b>Join Statements</b></em>' containment reference list.
   * The list contents are of type {@link com.justeat.mickeydb.mickeyLang.JoinStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Statements</em>' containment reference list.
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getJoinSource_JoinStatements()
   * @model containment="true"
   * @generated
   */
  EList<JoinStatement> getJoinStatements();

} // JoinSource
