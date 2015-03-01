/**
 */
package com.justeat.mickeydb.mickeyLang.impl;

import com.justeat.mickeydb.mickeyLang.ColumnDef;
import com.justeat.mickeydb.mickeyLang.Expression;
import com.justeat.mickeydb.mickeyLang.MickeyLangPackage;
import com.justeat.mickeydb.mickeyLang.UpdateColumnExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Column Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.UpdateColumnExpressionImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.UpdateColumnExpressionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateColumnExpressionImpl extends MinimalEObjectImpl.Container implements UpdateColumnExpression
{
  /**
   * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnName()
   * @generated
   * @ordered
   */
  protected ColumnDef columnName;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UpdateColumnExpressionImpl()
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
    return MickeyLangPackage.Literals.UPDATE_COLUMN_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnDef getColumnName()
  {
    if (columnName != null && columnName.eIsProxy())
    {
      InternalEObject oldColumnName = (InternalEObject)columnName;
      columnName = (ColumnDef)eResolveProxy(oldColumnName);
      if (columnName != oldColumnName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MickeyLangPackage.UPDATE_COLUMN_EXPRESSION__COLUMN_NAME, oldColumnName, columnName));
      }
    }
    return columnName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnDef basicGetColumnName()
  {
    return columnName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumnName(ColumnDef newColumnName)
  {
    ColumnDef oldColumnName = columnName;
    columnName = newColumnName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MickeyLangPackage.UPDATE_COLUMN_EXPRESSION__COLUMN_NAME, oldColumnName, columnName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MickeyLangPackage.UPDATE_COLUMN_EXPRESSION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MickeyLangPackage.UPDATE_COLUMN_EXPRESSION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MickeyLangPackage.UPDATE_COLUMN_EXPRESSION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MickeyLangPackage.UPDATE_COLUMN_EXPRESSION__EXPRESSION, newExpression, newExpression));
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
      case MickeyLangPackage.UPDATE_COLUMN_EXPRESSION__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case MickeyLangPackage.UPDATE_COLUMN_EXPRESSION__COLUMN_NAME:
        if (resolve) return getColumnName();
        return basicGetColumnName();
      case MickeyLangPackage.UPDATE_COLUMN_EXPRESSION__EXPRESSION:
        return getExpression();
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
      case MickeyLangPackage.UPDATE_COLUMN_EXPRESSION__COLUMN_NAME:
        setColumnName((ColumnDef)newValue);
        return;
      case MickeyLangPackage.UPDATE_COLUMN_EXPRESSION__EXPRESSION:
        setExpression((Expression)newValue);
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
      case MickeyLangPackage.UPDATE_COLUMN_EXPRESSION__COLUMN_NAME:
        setColumnName((ColumnDef)null);
        return;
      case MickeyLangPackage.UPDATE_COLUMN_EXPRESSION__EXPRESSION:
        setExpression((Expression)null);
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
      case MickeyLangPackage.UPDATE_COLUMN_EXPRESSION__COLUMN_NAME:
        return columnName != null;
      case MickeyLangPackage.UPDATE_COLUMN_EXPRESSION__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

} //UpdateColumnExpressionImpl
