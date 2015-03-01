/**
 */
package com.justeat.mickeydb.mickeyLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.Model#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.Model#getBlocks <em>Blocks</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Database Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Database Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Database Name</em>' attribute.
   * @see #setDatabaseName(String)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getModel_DatabaseName()
   * @model
   * @generated
   */
  String getDatabaseName();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.Model#getDatabaseName <em>Database Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Database Name</em>' attribute.
   * @see #getDatabaseName()
   * @generated
   */
  void setDatabaseName(String value);

  /**
   * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
   * The list contents are of type {@link com.justeat.mickeydb.mickeyLang.MickeyBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocks</em>' containment reference list.
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getModel_Blocks()
   * @model containment="true"
   * @generated
   */
  EList<MickeyBlock> getBlocks();

} // Model
