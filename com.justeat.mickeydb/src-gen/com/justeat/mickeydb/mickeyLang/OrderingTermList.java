/**
 */
package com.justeat.mickeydb.mickeyLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordering Term List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.OrderingTermList#getOrderingTerms <em>Ordering Terms</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getOrderingTermList()
 * @model
 * @generated
 */
public interface OrderingTermList extends EObject
{
  /**
   * Returns the value of the '<em><b>Ordering Terms</b></em>' containment reference list.
   * The list contents are of type {@link com.justeat.mickeydb.mickeyLang.OrderingTerm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ordering Terms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordering Terms</em>' containment reference list.
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getOrderingTermList_OrderingTerms()
   * @model containment="true"
   * @generated
   */
  EList<OrderingTerm> getOrderingTerms();

} // OrderingTermList
