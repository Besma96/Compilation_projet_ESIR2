/**
 * generated by Xtext 2.15.0
 */
package org.xtext.compilation.while_l;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commands</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compilation.while_l.Commands#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see org.xtext.compilation.while_l.While_lPackage#getCommands()
 * @model
 * @generated
 */
public interface Commands extends EObject
{
  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compilation.while_l.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see org.xtext.compilation.while_l.While_lPackage#getCommands_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

} // Commands
