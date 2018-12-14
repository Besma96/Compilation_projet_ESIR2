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

import org.xtext.comp.py.ExprSimple;
import org.xtext.comp.py.Input;
import org.xtext.comp.py.PyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.comp.py.impl.ExprSimpleImpl#getStr <em>Str</em>}</li>
 *   <li>{@link org.xtext.comp.py.impl.ExprSimpleImpl#getVarSimple <em>Var Simple</em>}</li>
 *   <li>{@link org.xtext.comp.py.impl.ExprSimpleImpl#getSym <em>Sym</em>}</li>
 *   <li>{@link org.xtext.comp.py.impl.ExprSimpleImpl#getNameFunction <em>Name Function</em>}</li>
 *   <li>{@link org.xtext.comp.py.impl.ExprSimpleImpl#getVars <em>Vars</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprSimpleImpl extends MinimalEObjectImpl.Container implements ExprSimple
{
  /**
   * The default value of the '{@link #getStr() <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr()
   * @generated
   * @ordered
   */
  protected static final String STR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStr() <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr()
   * @generated
   * @ordered
   */
  protected String str = STR_EDEFAULT;

  /**
   * The default value of the '{@link #getVarSimple() <em>Var Simple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarSimple()
   * @generated
   * @ordered
   */
  protected static final String VAR_SIMPLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVarSimple() <em>Var Simple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarSimple()
   * @generated
   * @ordered
   */
  protected String varSimple = VAR_SIMPLE_EDEFAULT;

  /**
   * The default value of the '{@link #getSym() <em>Sym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSym()
   * @generated
   * @ordered
   */
  protected static final String SYM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSym() <em>Sym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSym()
   * @generated
   * @ordered
   */
  protected String sym = SYM_EDEFAULT;

  /**
   * The default value of the '{@link #getNameFunction() <em>Name Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameFunction()
   * @generated
   * @ordered
   */
  protected static final String NAME_FUNCTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameFunction() <em>Name Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameFunction()
   * @generated
   * @ordered
   */
  protected String nameFunction = NAME_FUNCTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected Input vars;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprSimpleImpl()
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
    return PyPackage.Literals.EXPR_SIMPLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStr()
  {
    return str;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStr(String newStr)
  {
    String oldStr = str;
    str = newStr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PyPackage.EXPR_SIMPLE__STR, oldStr, str));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVarSimple()
  {
    return varSimple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarSimple(String newVarSimple)
  {
    String oldVarSimple = varSimple;
    varSimple = newVarSimple;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PyPackage.EXPR_SIMPLE__VAR_SIMPLE, oldVarSimple, varSimple));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSym()
  {
    return sym;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSym(String newSym)
  {
    String oldSym = sym;
    sym = newSym;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PyPackage.EXPR_SIMPLE__SYM, oldSym, sym));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameFunction()
  {
    return nameFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameFunction(String newNameFunction)
  {
    String oldNameFunction = nameFunction;
    nameFunction = newNameFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PyPackage.EXPR_SIMPLE__NAME_FUNCTION, oldNameFunction, nameFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input getVars()
  {
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVars(Input newVars, NotificationChain msgs)
  {
    Input oldVars = vars;
    vars = newVars;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PyPackage.EXPR_SIMPLE__VARS, oldVars, newVars);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVars(Input newVars)
  {
    if (newVars != vars)
    {
      NotificationChain msgs = null;
      if (vars != null)
        msgs = ((InternalEObject)vars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PyPackage.EXPR_SIMPLE__VARS, null, msgs);
      if (newVars != null)
        msgs = ((InternalEObject)newVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PyPackage.EXPR_SIMPLE__VARS, null, msgs);
      msgs = basicSetVars(newVars, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PyPackage.EXPR_SIMPLE__VARS, newVars, newVars));
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
      case PyPackage.EXPR_SIMPLE__VARS:
        return basicSetVars(null, msgs);
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
      case PyPackage.EXPR_SIMPLE__STR:
        return getStr();
      case PyPackage.EXPR_SIMPLE__VAR_SIMPLE:
        return getVarSimple();
      case PyPackage.EXPR_SIMPLE__SYM:
        return getSym();
      case PyPackage.EXPR_SIMPLE__NAME_FUNCTION:
        return getNameFunction();
      case PyPackage.EXPR_SIMPLE__VARS:
        return getVars();
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
      case PyPackage.EXPR_SIMPLE__STR:
        setStr((String)newValue);
        return;
      case PyPackage.EXPR_SIMPLE__VAR_SIMPLE:
        setVarSimple((String)newValue);
        return;
      case PyPackage.EXPR_SIMPLE__SYM:
        setSym((String)newValue);
        return;
      case PyPackage.EXPR_SIMPLE__NAME_FUNCTION:
        setNameFunction((String)newValue);
        return;
      case PyPackage.EXPR_SIMPLE__VARS:
        setVars((Input)newValue);
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
      case PyPackage.EXPR_SIMPLE__STR:
        setStr(STR_EDEFAULT);
        return;
      case PyPackage.EXPR_SIMPLE__VAR_SIMPLE:
        setVarSimple(VAR_SIMPLE_EDEFAULT);
        return;
      case PyPackage.EXPR_SIMPLE__SYM:
        setSym(SYM_EDEFAULT);
        return;
      case PyPackage.EXPR_SIMPLE__NAME_FUNCTION:
        setNameFunction(NAME_FUNCTION_EDEFAULT);
        return;
      case PyPackage.EXPR_SIMPLE__VARS:
        setVars((Input)null);
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
      case PyPackage.EXPR_SIMPLE__STR:
        return STR_EDEFAULT == null ? str != null : !STR_EDEFAULT.equals(str);
      case PyPackage.EXPR_SIMPLE__VAR_SIMPLE:
        return VAR_SIMPLE_EDEFAULT == null ? varSimple != null : !VAR_SIMPLE_EDEFAULT.equals(varSimple);
      case PyPackage.EXPR_SIMPLE__SYM:
        return SYM_EDEFAULT == null ? sym != null : !SYM_EDEFAULT.equals(sym);
      case PyPackage.EXPR_SIMPLE__NAME_FUNCTION:
        return NAME_FUNCTION_EDEFAULT == null ? nameFunction != null : !NAME_FUNCTION_EDEFAULT.equals(nameFunction);
      case PyPackage.EXPR_SIMPLE__VARS:
        return vars != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (str: ");
    result.append(str);
    result.append(", varSimple: ");
    result.append(varSimple);
    result.append(", sym: ");
    result.append(sym);
    result.append(", nameFunction: ");
    result.append(nameFunction);
    result.append(')');
    return result.toString();
  }

} //ExprSimpleImpl