/**
 */
package com.justeat.mickeydb.mickeyLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Trigger Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.DropTriggerStatement#isIfExists <em>If Exists</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.DropTriggerStatement#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getDropTriggerStatement()
 * @model
 * @generated
 */
public interface DropTriggerStatement extends DDLStatement
{
  /**
   * Returns the value of the '<em><b>If Exists</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Exists</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Exists</em>' attribute.
   * @see #setIfExists(boolean)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getDropTriggerStatement_IfExists()
   * @model
   * @generated
   */
  boolean isIfExists();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.DropTriggerStatement#isIfExists <em>If Exists</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Exists</em>' attribute.
   * @see #isIfExists()
   * @generated
   */
  void setIfExists(boolean value);

  /**
   * Returns the value of the '<em><b>Trigger</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trigger</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' reference.
   * @see #setTrigger(CreateTriggerStatement)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getDropTriggerStatement_Trigger()
   * @model
   * @generated
   */
  CreateTriggerStatement getTrigger();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.DropTriggerStatement#getTrigger <em>Trigger</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' reference.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(CreateTriggerStatement value);

} // DropTriggerStatement
