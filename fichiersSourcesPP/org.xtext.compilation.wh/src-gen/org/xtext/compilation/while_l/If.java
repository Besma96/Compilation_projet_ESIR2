/**
 * generated by Xtext 2.15.0
 */
package org.xtext.compilation.while_l;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compilation.while_l.If#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.compilation.while_l.If#getCommands1 <em>Commands1</em>}</li>
 *   <li>{@link org.xtext.compilation.while_l.If#getCommands2 <em>Commands2</em>}</li>
 * </ul>
 *
 * @see org.xtext.compilation.while_l.While_lPackage#getIf()
 * @model
 * @generated
 */
public interface If extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see org.xtext.compilation.while_l.While_lPackage#getIf_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link org.xtext.compilation.while_l.If#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

  /**
   * Returns the value of the '<em><b>Commands1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands1</em>' containment reference.
   * @see #setCommands1(Commands)
   * @see org.xtext.compilation.while_l.While_lPackage#getIf_Commands1()
   * @model containment="true"
   * @generated
   */
  Commands getCommands1();

  /**
   * Sets the value of the '{@link org.xtext.compilation.while_l.If#getCommands1 <em>Commands1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Commands1</em>' containment reference.
   * @see #getCommands1()
   * @generated
   */
  void setCommands1(Commands value);

  /**
   * Returns the value of the '<em><b>Commands2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands2</em>' containment reference.
   * @see #setCommands2(Commands)
   * @see org.xtext.compilation.while_l.While_lPackage#getIf_Commands2()
   * @model containment="true"
   * @generated
   */
  Commands getCommands2();

  /**
   * Sets the value of the '{@link org.xtext.compilation.while_l.If#getCommands2 <em>Commands2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Commands2</em>' containment reference.
   * @see #getCommands2()
   * @generated
   */
  void setCommands2(Commands value);

} // If