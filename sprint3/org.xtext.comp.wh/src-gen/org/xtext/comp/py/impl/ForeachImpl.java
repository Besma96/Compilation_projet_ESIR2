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

import org.xtext.comp.py.Commands;
import org.xtext.comp.py.Expr;
import org.xtext.comp.py.Foreach;
import org.xtext.comp.py.PyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.comp.py.impl.ForeachImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.comp.py.impl.ForeachImpl#getExpr2 <em>Expr2</em>}</li>
 *   <li>{@link org.xtext.comp.py.impl.ForeachImpl#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeachImpl extends MinimalEObjectImpl.Container implements Foreach
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expr expr;

  /**
   * The cached value of the '{@link #getExpr2() <em>Expr2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr2()
   * @generated
   * @ordered
   */
  protected Expr expr2;

  /**
   * The cached value of the '{@link #getCmd() <em>Cmd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmd()
   * @generated
   * @ordered
   */
  protected Commands cmd;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForeachImpl()
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
    return PyPackage.Literals.FOREACH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expr newExpr, NotificationChain msgs)
  {
    Expr oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PyPackage.FOREACH__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expr newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PyPackage.FOREACH__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PyPackage.FOREACH__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PyPackage.FOREACH__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExpr2()
  {
    return expr2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr2(Expr newExpr2, NotificationChain msgs)
  {
    Expr oldExpr2 = expr2;
    expr2 = newExpr2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PyPackage.FOREACH__EXPR2, oldExpr2, newExpr2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr2(Expr newExpr2)
  {
    if (newExpr2 != expr2)
    {
      NotificationChain msgs = null;
      if (expr2 != null)
        msgs = ((InternalEObject)expr2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PyPackage.FOREACH__EXPR2, null, msgs);
      if (newExpr2 != null)
        msgs = ((InternalEObject)newExpr2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PyPackage.FOREACH__EXPR2, null, msgs);
      msgs = basicSetExpr2(newExpr2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PyPackage.FOREACH__EXPR2, newExpr2, newExpr2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getCmd()
  {
    return cmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCmd(Commands newCmd, NotificationChain msgs)
  {
    Commands oldCmd = cmd;
    cmd = newCmd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PyPackage.FOREACH__CMD, oldCmd, newCmd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmd(Commands newCmd)
  {
    if (newCmd != cmd)
    {
      NotificationChain msgs = null;
      if (cmd != null)
        msgs = ((InternalEObject)cmd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PyPackage.FOREACH__CMD, null, msgs);
      if (newCmd != null)
        msgs = ((InternalEObject)newCmd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PyPackage.FOREACH__CMD, null, msgs);
      msgs = basicSetCmd(newCmd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PyPackage.FOREACH__CMD, newCmd, newCmd));
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
      case PyPackage.FOREACH__EXPR:
        return basicSetExpr(null, msgs);
      case PyPackage.FOREACH__EXPR2:
        return basicSetExpr2(null, msgs);
      case PyPackage.FOREACH__CMD:
        return basicSetCmd(null, msgs);
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
      case PyPackage.FOREACH__EXPR:
        return getExpr();
      case PyPackage.FOREACH__EXPR2:
        return getExpr2();
      case PyPackage.FOREACH__CMD:
        return getCmd();
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
      case PyPackage.FOREACH__EXPR:
        setExpr((Expr)newValue);
        return;
      case PyPackage.FOREACH__EXPR2:
        setExpr2((Expr)newValue);
        return;
      case PyPackage.FOREACH__CMD:
        setCmd((Commands)newValue);
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
      case PyPackage.FOREACH__EXPR:
        setExpr((Expr)null);
        return;
      case PyPackage.FOREACH__EXPR2:
        setExpr2((Expr)null);
        return;
      case PyPackage.FOREACH__CMD:
        setCmd((Commands)null);
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
      case PyPackage.FOREACH__EXPR:
        return expr != null;
      case PyPackage.FOREACH__EXPR2:
        return expr2 != null;
      case PyPackage.FOREACH__CMD:
        return cmd != null;
    }
    return super.eIsSet(featureID);
  }

} //ForeachImpl
