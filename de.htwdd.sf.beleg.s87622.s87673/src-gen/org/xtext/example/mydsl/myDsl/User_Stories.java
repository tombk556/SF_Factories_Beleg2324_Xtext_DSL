/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Stories</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.User_Stories#getUser_story <em>User story</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getUser_Stories()
 * @model
 * @generated
 */
public interface User_Stories extends EObject
{
  /**
   * Returns the value of the '<em><b>User story</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.User_Story}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>User story</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getUser_Stories_User_story()
   * @model containment="true"
   * @generated
   */
  EList<User_Story> getUser_story();

} // User_Stories