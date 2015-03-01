/**
 */
package com.justeat.mickeydb.mickeyLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Uri</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.ContentUri#getType <em>Type</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.ContentUri#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getContentUri()
 * @model
 * @generated
 */
public interface ContentUri extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getContentUri_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.ContentUri#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
   * The list contents are of type {@link com.justeat.mickeydb.mickeyLang.ContentUriSegment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Segments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Segments</em>' containment reference list.
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getContentUri_Segments()
   * @model containment="true"
   * @generated
   */
  EList<ContentUriSegment> getSegments();

} // ContentUri
