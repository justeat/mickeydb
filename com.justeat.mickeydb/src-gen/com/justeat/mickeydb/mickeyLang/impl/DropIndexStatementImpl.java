/**
 */
package com.justeat.mickeydb.mickeyLang.impl;

import com.justeat.mickeydb.mickeyLang.CreateIndexStatement;
import com.justeat.mickeydb.mickeyLang.DropIndexStatement;
import com.justeat.mickeydb.mickeyLang.MickeyLangPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Index Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.DropIndexStatementImpl#isIfExists <em>If Exists</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.DropIndexStatementImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropIndexStatementImpl extends DDLStatementImpl implements DropIndexStatement
{
  /**
   * The default value of the '{@link #isIfExists() <em>If Exists</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIfExists()
   * @generated
   * @ordered
   */
  protected static final boolean IF_EXISTS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIfExists() <em>If Exists</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIfExists()
   * @generated
   * @ordered
   */
  protected boolean ifExists = IF_EXISTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected CreateIndexStatement index;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DropIndexStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MickeyLangPackage.Literals.DROP_INDEX_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIfExists()
  {
    return ifExists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfExists(boolean newIfExists)
  {
    boolean oldIfExists = ifExists;
    ifExists = newIfExists;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MickeyLangPackage.DROP_INDEX_STATEMENT__IF_EXISTS, oldIfExists, ifExists));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateIndexStatement getIndex()
  {
    if (index != null && index.eIsProxy())
    {
      InternalEObject oldIndex = (InternalEObject)index;
      index = (CreateIndexStatement)eResolveProxy(oldIndex);
      if (index != oldIndex)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MickeyLangPackage.DROP_INDEX_STATEMENT__INDEX, oldIndex, index));
      }
    }
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateIndexStatement basicGetIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(CreateIndexStatement newIndex)
  {
    CreateIndexStatement oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MickeyLangPackage.DROP_INDEX_STATEMENT__INDEX, oldIndex, index));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MickeyLangPackage.DROP_INDEX_STATEMENT__IF_EXISTS:
        return isIfExists();
      case MickeyLangPackage.DROP_INDEX_STATEMENT__INDEX:
        if (resolve) return getIndex();
        return basicGetIndex();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MickeyLangPackage.DROP_INDEX_STATEMENT__IF_EXISTS:
        setIfExists((Boolean)newValue);
        return;
      case MickeyLangPackage.DROP_INDEX_STATEMENT__INDEX:
        setIndex((CreateIndexStatement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MickeyLangPackage.DROP_INDEX_STATEMENT__IF_EXISTS:
        setIfExists(IF_EXISTS_EDEFAULT);
        return;
      case MickeyLangPackage.DROP_INDEX_STATEMENT__INDEX:
        setIndex((CreateIndexStatement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MickeyLangPackage.DROP_INDEX_STATEMENT__IF_EXISTS:
        return ifExists != IF_EXISTS_EDEFAULT;
      case MickeyLangPackage.DROP_INDEX_STATEMENT__INDEX:
        return index != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (ifExists: ");
    result.append(ifExists);
    result.append(')');
    return result.toString();
  }

} //DropIndexStatementImpl
