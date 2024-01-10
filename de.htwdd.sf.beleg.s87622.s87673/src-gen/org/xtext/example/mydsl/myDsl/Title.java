/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Title#getSubstantiv <em>Substantiv</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Title#getInfinitiv <em>Infinitiv</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTitle()
 * @model
 * @generated
 */
public interface Title extends EObject
{
  /**
   * Returns the value of the '<em><b>Substantiv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Substantiv</em>' attribute.
   * @see #setSubstantiv(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTitle_Substantiv()
   * @model
   * @generated
   */
  String getSubstantiv();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Title#getSubstantiv <em>Substantiv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Substantiv</em>' attribute.
   * @see #getSubstantiv()
   * @generated
   */
  void setSubstantiv(String value);

  /**
   * Returns the value of the '<em><b>Infinitiv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Infinitiv</em>' containment reference.
   * @see #setInfinitiv(Infinitiv)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTitle_Infinitiv()
   * @model containment="true"
   * @generated
   */
  Infinitiv getInfinitiv();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Title#getInfinitiv <em>Infinitiv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Infinitiv</em>' containment reference.
   * @see #getInfinitiv()
   * @generated
   */
  void setInfinitiv(Infinitiv value);

} // Title
