/**
 */
package com.justeat.mickeydb.mickeyLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Null Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.NotNullConstraint#getConflictClause <em>Conflict Clause</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getNotNullConstraint()
 * @model
 * @generated
 */
public interface NotNullConstraint extends ColumnConstraint
{
  /**
   * Returns the value of the '<em><b>Conflict Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conflict Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conflict Clause</em>' containment reference.
   * @see #setConflictClause(ConflictClause)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getNotNullConstraint_ConflictClause()
   * @model containment="true"
   * @generated
   */
  ConflictClause getConflictClause();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.NotNullConstraint#getConflictClause <em>Conflict Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conflict Clause</em>' containment reference.
   * @see #getConflictClause()
   * @generated
   */
  void setConflictClause(ConflictClause value);

} // NotNullConstraint
