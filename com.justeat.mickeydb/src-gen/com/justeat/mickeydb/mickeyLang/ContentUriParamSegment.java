/**
 */
package com.justeat.mickeydb.mickeyLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Uri Param Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.ContentUriParamSegment#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getContentUriParamSegment()
 * @model
 * @generated
 */
public interface ContentUriParamSegment extends ContentUriSegment
{
  /**
   * Returns the value of the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' reference.
   * @see #setParam(ColumnSource)
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getContentUriParamSegment_Param()
   * @model
   * @generated
   */
  ColumnSource getParam();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.ContentUriParamSegment#getParam <em>Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' reference.
   * @see #getParam()
   * @generated
   */
  void setParam(ColumnSource value);

} // ContentUriParamSegment
