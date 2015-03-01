/**
 */
package com.justeat.mickeydb.mickeyLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conflict Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.ConflictClause#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getConflictClause()
 * @model
 * @generated
 */
public interface ConflictClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Resolution</b></em>' attribute.
   * The literals are from the enumeration {@link com.justeat.mickeydb.mickeyLang.ConflictResolution}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resolution</em>' attribute.
   * @see com.justeat.mickeydb.mickeyLang.ConflictResolution
   * @see #setResolution(ConflictResolution)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getConflictClause_Resolution()
   * @model
   * @generated
   */
  ConflictResolution getResolution();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.ConflictClause#getResolution <em>Resolution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resolution</em>' attribute.
   * @see com.justeat.mickeydb.mickeyLang.ConflictResolution
   * @see #getResolution()
   * @generated
   */
  void setResolution(ConflictResolution value);

} // ConflictClause
