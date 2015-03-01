/**
 */
package com.justeat.mickeydb.mickeyLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.UpdateStatement#getConflictResolution <em>Conflict Resolution</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.UpdateStatement#getTable <em>Table</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.UpdateStatement#getUpdateColumnExpressions <em>Update Column Expressions</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.UpdateStatement#getWhereExpression <em>Where Expression</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getUpdateStatement()
 * @model
 * @generated
 */
public interface UpdateStatement extends DMLStatement
{
  /**
   * Returns the value of the '<em><b>Conflict Resolution</b></em>' attribute.
   * The literals are from the enumeration {@link com.justeat.mickeydb.mickeyLang.ConflictResolution}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conflict Resolution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conflict Resolution</em>' attribute.
   * @see com.justeat.mickeydb.mickeyLang.ConflictResolution
   * @see #setConflictResolution(ConflictResolution)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getUpdateStatement_ConflictResolution()
   * @model
   * @generated
   */
  ConflictResolution getConflictResolution();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.UpdateStatement#getConflictResolution <em>Conflict Resolution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conflict Resolution</em>' attribute.
   * @see com.justeat.mickeydb.mickeyLang.ConflictResolution
   * @see #getConflictResolution()
   * @generated
   */
  void setConflictResolution(ConflictResolution value);

  /**
   * Returns the value of the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' reference.
   * @see #setTable(TableDefinition)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getUpdateStatement_Table()
   * @model
   * @generated
   */
  TableDefinition getTable();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.UpdateStatement#getTable <em>Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' reference.
   * @see #getTable()
   * @generated
   */
  void setTable(TableDefinition value);

  /**
   * Returns the value of the '<em><b>Update Column Expressions</b></em>' containment reference list.
   * The list contents are of type {@link com.justeat.mickeydb.mickeyLang.UpdateColumnExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Column Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Column Expressions</em>' containment reference list.
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getUpdateStatement_UpdateColumnExpressions()
   * @model containment="true"
   * @generated
   */
  EList<UpdateColumnExpression> getUpdateColumnExpressions();

  /**
   * Returns the value of the '<em><b>Where Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where Expression</em>' containment reference.
   * @see #setWhereExpression(Expression)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getUpdateStatement_WhereExpression()
   * @model containment="true"
   * @generated
   */
  Expression getWhereExpression();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.UpdateStatement#getWhereExpression <em>Where Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where Expression</em>' containment reference.
   * @see #getWhereExpression()
   * @generated
   */
  void setWhereExpression(Expression value);

} // UpdateStatement
