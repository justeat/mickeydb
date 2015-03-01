/**
 */
package com.justeat.mickeydb.mickeyLang.impl;

import com.justeat.mickeydb.mickeyLang.MickeyBlock;
import com.justeat.mickeydb.mickeyLang.MickeyLangPackage;
import com.justeat.mickeydb.mickeyLang.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.ModelImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.ModelImpl#getBlocks <em>Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The default value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabaseName()
   * @generated
   * @ordered
   */
  protected static final String DATABASE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabaseName()
   * @generated
   * @ordered
   */
  protected String databaseName = DATABASE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocks()
   * @generated
   * @ordered
   */
  protected EList<MickeyBlock> blocks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return MickeyLangPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDatabaseName()
  {
    return databaseName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatabaseName(String newDatabaseName)
  {
    String oldDatabaseName = databaseName;
    databaseName = newDatabaseName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MickeyLangPackage.MODEL__DATABASE_NAME, oldDatabaseName, databaseName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MickeyBlock> getBlocks()
  {
    if (blocks == null)
    {
      blocks = new EObjectContainmentEList<MickeyBlock>(MickeyBlock.class, this, MickeyLangPackage.MODEL__BLOCKS);
    }
    return blocks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MickeyLangPackage.MODEL__BLOCKS:
        return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MickeyLangPackage.MODEL__DATABASE_NAME:
        return getDatabaseName();
      case MickeyLangPackage.MODEL__BLOCKS:
        return getBlocks();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MickeyLangPackage.MODEL__DATABASE_NAME:
        setDatabaseName((String)newValue);
        return;
      case MickeyLangPackage.MODEL__BLOCKS:
        getBlocks().clear();
        getBlocks().addAll((Collection<? extends MickeyBlock>)newValue);
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
      case MickeyLangPackage.MODEL__DATABASE_NAME:
        setDatabaseName(DATABASE_NAME_EDEFAULT);
        return;
      case MickeyLangPackage.MODEL__BLOCKS:
        getBlocks().clear();
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
      case MickeyLangPackage.MODEL__DATABASE_NAME:
        return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
      case MickeyLangPackage.MODEL__BLOCKS:
        return blocks != null && !blocks.isEmpty();
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
    result.append(" (databaseName: ");
    result.append(databaseName);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
