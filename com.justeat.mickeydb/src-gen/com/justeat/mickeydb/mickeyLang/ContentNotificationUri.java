/**
 */
package com.justeat.mickeydb.mickeyLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Notification Uri</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.ContentNotificationUri#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getContentNotificationUri()
 * @model
 * @generated
 */
public interface ContentNotificationUri extends EObject
{
  /**
   * Returns the value of the '<em><b>Uri</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' containment reference.
   * @see #setUri(NotifyContentUri)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getContentNotificationUri_Uri()
   * @model containment="true"
   * @generated
   */
  NotifyContentUri getUri();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.ContentNotificationUri#getUri <em>Uri</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' containment reference.
   * @see #getUri()
   * @generated
   */
  void setUri(NotifyContentUri value);

} // ContentNotificationUri
