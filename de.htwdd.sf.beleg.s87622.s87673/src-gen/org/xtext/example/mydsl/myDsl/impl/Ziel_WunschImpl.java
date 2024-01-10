/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Infinitiv;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Ziel_Wunsch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ziel Wunsch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Ziel_WunschImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.Ziel_WunschImpl#getInfinitiv <em>Infinitiv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Ziel_WunschImpl extends MinimalEObjectImpl.Container implements Ziel_Wunsch
{
  /**
   * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubject()
   * @generated
   * @ordered
   */
  protected static final String SUBJECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubject()
   * @generated
   * @ordered
   */
  protected String subject = SUBJECT_EDEFAULT;

  /**
   * The cached value of the '{@link #getInfinitiv() <em>Infinitiv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfinitiv()
   * @generated
   * @ordered
   */
  protected Infinitiv infinitiv;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Ziel_WunschImpl()
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
    return MyDslPackage.Literals.ZIEL_WUNSCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSubject()
  {
    return subject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSubject(String newSubject)
  {
    String oldSubject = subject;
    subject = newSubject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ZIEL_WUNSCH__SUBJECT, oldSubject, subject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Infinitiv getInfinitiv()
  {
    return infinitiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInfinitiv(Infinitiv newInfinitiv, NotificationChain msgs)
  {
    Infinitiv oldInfinitiv = infinitiv;
    infinitiv = newInfinitiv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ZIEL_WUNSCH__INFINITIV, oldInfinitiv, newInfinitiv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInfinitiv(Infinitiv newInfinitiv)
  {
    if (newInfinitiv != infinitiv)
    {
      NotificationChain msgs = null;
      if (infinitiv != null)
        msgs = ((InternalEObject)infinitiv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ZIEL_WUNSCH__INFINITIV, null, msgs);
      if (newInfinitiv != null)
        msgs = ((InternalEObject)newInfinitiv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ZIEL_WUNSCH__INFINITIV, null, msgs);
      msgs = basicSetInfinitiv(newInfinitiv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ZIEL_WUNSCH__INFINITIV, newInfinitiv, newInfinitiv));
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
      case MyDslPackage.ZIEL_WUNSCH__INFINITIV:
        return basicSetInfinitiv(null, msgs);
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
      case MyDslPackage.ZIEL_WUNSCH__SUBJECT:
        return getSubject();
      case MyDslPackage.ZIEL_WUNSCH__INFINITIV:
        return getInfinitiv();
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
      case MyDslPackage.ZIEL_WUNSCH__SUBJECT:
        setSubject((String)newValue);
        return;
      case MyDslPackage.ZIEL_WUNSCH__INFINITIV:
        setInfinitiv((Infinitiv)newValue);
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
      case MyDslPackage.ZIEL_WUNSCH__SUBJECT:
        setSubject(SUBJECT_EDEFAULT);
        return;
      case MyDslPackage.ZIEL_WUNSCH__INFINITIV:
        setInfinitiv((Infinitiv)null);
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
      case MyDslPackage.ZIEL_WUNSCH__SUBJECT:
        return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
      case MyDslPackage.ZIEL_WUNSCH__INFINITIV:
        return infinitiv != null;
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
    result.append(" (subject: ");
    result.append(subject);
    result.append(')');
    return result.toString();
  }

} //Ziel_WunschImpl