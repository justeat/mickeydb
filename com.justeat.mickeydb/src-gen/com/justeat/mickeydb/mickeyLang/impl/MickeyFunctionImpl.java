/**
 */
package com.justeat.mickeydb.mickeyLang.impl;

import com.justeat.mickeydb.mickeyLang.DMLStatement;
import com.justeat.mickeydb.mickeyLang.FunctionArg;
import com.justeat.mickeydb.mickeyLang.MickeyFunction;
import com.justeat.mickeydb.mickeyLang.MickeyLangPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mickey Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.MickeyFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.MickeyFunctionImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.MickeyFunctionImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MickeyFunctionImpl extends MickeyBlockImpl implements MickeyFunction
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<FunctionArg> args;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<DMLStatement> statements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MickeyFunctionImpl()
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
    return MickeyLangPackage.Literals.MICKEY_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MickeyLangPackage.MICKEY_FUNCTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionArg> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<FunctionArg>(FunctionArg.class, this, MickeyLangPackage.MICKEY_FUNCTION__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DMLStatement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<DMLStatement>(DMLStatement.class, this, MickeyLangPackage.MICKEY_FUNCTION__STATEMENTS);
    }
    return statements;
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
      case MickeyLangPackage.MICKEY_FUNCTION__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
      case MickeyLangPackage.MICKEY_FUNCTION__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
      case MickeyLangPackage.MICKEY_FUNCTION__NAME:
        return getName();
      case MickeyLangPackage.MICKEY_FUNCTION__ARGS:
        return getArgs();
      case MickeyLangPackage.MICKEY_FUNCTION__STATEMENTS:
        return getStatements();
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
      case MickeyLangPackage.MICKEY_FUNCTION__NAME:
        setName((String)newValue);
        return;
      case MickeyLangPackage.MICKEY_FUNCTION__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends FunctionArg>)newValue);
        return;
      case MickeyLangPackage.MICKEY_FUNCTION__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends DMLStatement>)newValue);
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
      case MickeyLangPackage.MICKEY_FUNCTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MickeyLangPackage.MICKEY_FUNCTION__ARGS:
        getArgs().clear();
        return;
      case MickeyLangPackage.MICKEY_FUNCTION__STATEMENTS:
        getStatements().clear();
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
      case MickeyLangPackage.MICKEY_FUNCTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MickeyLangPackage.MICKEY_FUNCTION__ARGS:
        return args != null && !args.isEmpty();
      case MickeyLangPackage.MICKEY_FUNCTION__STATEMENTS:
        return statements != null && !statements.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MickeyFunctionImpl
