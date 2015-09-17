/**
 */
package com.justeat.mickeydb.mickeyLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Uri Query Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.ContentUriQueryParam#isLike <em>Like</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.ContentUriQueryParam#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getContentUriQueryParam()
 * @model
 * @generated
 */
public interface ContentUriQueryParam extends EObject
{
  /**
   * Returns the value of the '<em><b>Like</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Like</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Like</em>' attribute.
   * @see #setLike(boolean)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getContentUriQueryParam_Like()
   * @model
   * @generated
   */
  boolean isLike();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.ContentUriQueryParam#isLike <em>Like</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Like</em>' attribute.
   * @see #isLike()
   * @generated
   */
  void setLike(boolean value);

  /**
   * Returns the value of the '<em><b>Column</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' reference.
   * @see #setColumn(ColumnSource)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getContentUriQueryParam_Column()
   * @model
   * @generated
   */
  ColumnSource getColumn();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.ContentUriQueryParam#getColumn <em>Column</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' reference.
   * @see #getColumn()
   * @generated
   */
  void setColumn(ColumnSource value);

} // ContentUriQueryParam
