/**
 */
package com.justeat.mickeydb.mickeyLang;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Migration Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.MigrationBlock#getVersion <em>Version</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.MigrationBlock#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getMigrationBlock()
 * @model
 * @generated
 */
public interface MigrationBlock extends MickeyBlock
{
  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(BigDecimal)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getMigrationBlock_Version()
   * @model
   * @generated
   */
  BigDecimal getVersion();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.MigrationBlock#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link com.justeat.mickeydb.mickeyLang.DDLStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getMigrationBlock_Statements()
   * @model containment="true"
   * @generated
   */
  EList<DDLStatement> getStatements();

} // MigrationBlock
