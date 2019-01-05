/**
 * generated by Xtext 2.15.0
 */
package org.xtext.comp.py;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.comp.py.ExprNot#getArg1 <em>Arg1</em>}</li>
 * </ul>
 *
 * @see org.xtext.comp.py.PyPackage#getExprNot()
 * @model
 * @generated
 */
public interface ExprNot extends EObject
{
  /**
   * Returns the value of the '<em><b>Arg1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg1</em>' containment reference.
   * @see #setArg1(Expr)
   * @see org.xtext.comp.py.PyPackage#getExprNot_Arg1()
   * @model containment="true"
   * @generated
   */
  Expr getArg1();

  /**
   * Sets the value of the '{@link org.xtext.comp.py.ExprNot#getArg1 <em>Arg1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg1</em>' containment reference.
   * @see #getArg1()
   * @generated
   */
  void setArg1(Expr value);

} // ExprNot