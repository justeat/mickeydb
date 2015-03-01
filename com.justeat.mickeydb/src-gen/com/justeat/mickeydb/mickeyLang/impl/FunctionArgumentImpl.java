/**
 */
package com.justeat.mickeydb.mickeyLang.impl;

import com.justeat.mickeydb.mickeyLang.FunctionArg;
import com.justeat.mickeydb.mickeyLang.FunctionArgument;
import com.justeat.mickeydb.mickeyLang.MickeyLangPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.FunctionArgumentImpl#getArg <em>Arg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionArgumentImpl extends ExpressionImpl implements FunctionArgument
{
  /**
   * The cached value of the '{@link #getArg() <em>Arg</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg()
   * @generated
   * @ordered
   */
  protected FunctionArg arg;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionArgumentImpl()
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
    return MickeyLangPackage.Literals.FUNCTION_ARGUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionArg getArg()
  {
    if (arg != null && arg.eIsProxy())
    {
      InternalEObject oldArg = (InternalEObject)arg;
      arg = (FunctionArg)eResolveProxy(oldArg);
      if (arg != oldArg)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MickeyLangPackage.FUNCTION_ARGUMENT__ARG, oldArg, arg));
      }
    }
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionArg basicGetArg()
  {
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg(FunctionArg newArg)
  {
    FunctionArg oldArg = arg;
    arg = newArg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MickeyLangPackage.FUNCTION_ARGUMENT__ARG, oldArg, arg));
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
      case MickeyLangPackage.FUNCTION_ARGUMENT__ARG:
        if (resolve) return getArg();
        return basicGetArg();
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
      case MickeyLangPackage.FUNCTION_ARGUMENT__ARG:
        setArg((FunctionArg)newValue);
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
      case MickeyLangPackage.FUNCTION_ARGUMENT__ARG:
        setArg((FunctionArg)null);
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
      case MickeyLangPackage.FUNCTION_ARGUMENT__ARG:
        return arg != null;
    }
    return super.eIsSet(featureID);
  }

} //FunctionArgumentImpl
