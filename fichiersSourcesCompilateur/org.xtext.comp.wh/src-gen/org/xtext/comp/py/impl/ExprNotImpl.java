/**
 * generated by Xtext 2.15.0
 */
package org.xtext.comp.py.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.comp.py.Expr;
import org.xtext.comp.py.ExprNot;
import org.xtext.comp.py.PyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Not</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.comp.py.impl.ExprNotImpl#getArg1 <em>Arg1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprNotImpl extends MinimalEObjectImpl.Container implements ExprNot
{
  /**
   * The cached value of the '{@link #getArg1() <em>Arg1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg1()
   * @generated
   * @ordered
   */
  protected Expr arg1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprNotImpl()
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
    return PyPackage.Literals.EXPR_NOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getArg1()
  {
    return arg1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArg1(Expr newArg1, NotificationChain msgs)
  {
    Expr oldArg1 = arg1;
    arg1 = newArg1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PyPackage.EXPR_NOT__ARG1, oldArg1, newArg1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg1(Expr newArg1)
  {
    if (newArg1 != arg1)
    {
      NotificationChain msgs = null;
      if (arg1 != null)
        msgs = ((InternalEObject)arg1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PyPackage.EXPR_NOT__ARG1, null, msgs);
      if (newArg1 != null)
        msgs = ((InternalEObject)newArg1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PyPackage.EXPR_NOT__ARG1, null, msgs);
      msgs = basicSetArg1(newArg1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PyPackage.EXPR_NOT__ARG1, newArg1, newArg1));
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
      case PyPackage.EXPR_NOT__ARG1:
        return basicSetArg1(null, msgs);
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
      case PyPackage.EXPR_NOT__ARG1:
        return getArg1();
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
      case PyPackage.EXPR_NOT__ARG1:
        setArg1((Expr)newValue);
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
      case PyPackage.EXPR_NOT__ARG1:
        setArg1((Expr)null);
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
      case PyPackage.EXPR_NOT__ARG1:
        return arg1 != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprNotImpl