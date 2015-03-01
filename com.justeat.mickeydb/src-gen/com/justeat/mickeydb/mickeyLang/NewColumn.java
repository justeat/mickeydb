/**
 */
package com.justeat.mickeydb.mickeyLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.NewColumn#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getNewColumn()
 * @model
 * @generated
 */
public interface NewColumn extends Expression
{
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
   * @see com.justeat.mickeydb.mickeyLang.MickeyLangPackage#getNewColumn_Column()
   * @model
   * @generated
   */
  ColumnSource getColumn();

  /**
   * Sets the value of the '{@link com.justeat.mickeydb.mickeyLang.NewColumn#getColumn <em>Column</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' reference.
   * @see #getColumn()
   * @generated
   */
  void setColumn(ColumnSource value);

} // NewColumn
