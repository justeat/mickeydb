/**
 */
package com.justeat.mickeydb.mickeyLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.ActionStatement#getName <em>Name</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.ActionStatement#getUri <em>Uri</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.ActionStatement#getType <em>Type</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.ActionStatement#isUnique <em>Unique</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.ActionStatement#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getActionStatement()
 * @model
 * @generated
 */
public interface ActionStatement extends MickeyBlock
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getActionStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.ActionStatement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Uri</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' containment reference.
   * @see #setUri(ContentUri)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getActionStatement_Uri()
   * @model containment="true"
   * @generated
   */
  ContentUri getUri();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.ActionStatement#getUri <em>Uri</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' containment reference.
   * @see #getUri()
   * @generated
   */
  void setUri(ContentUri value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(TableDefinition)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getActionStatement_Type()
   * @model
   * @generated
   */
  TableDefinition getType();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.ActionStatement#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(TableDefinition value);

  /**
   * Returns the value of the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unique</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique</em>' attribute.
   * @see #setUnique(boolean)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getActionStatement_Unique()
   * @model
   * @generated
   */
  boolean isUnique();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.ActionStatement#isUnique <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique</em>' attribute.
   * @see #isUnique()
   * @generated
   */
  void setUnique(boolean value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link com.justeat.mickeydb.mickeyLang.ContentUriQueryParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getActionStatement_Params()
   * @model containment="true"
   * @generated
   */
  EList<ContentUriQueryParam> getParams();

} // ActionStatement
