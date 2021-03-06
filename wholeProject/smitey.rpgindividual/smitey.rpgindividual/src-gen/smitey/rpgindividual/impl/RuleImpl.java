/**
 * generated by Xtext 2.21.0
 */
package smitey.rpgindividual.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import smitey.rpgindividual.Attribute;
import smitey.rpgindividual.Proposition;
import smitey.rpgindividual.RpgindividualPackage;
import smitey.rpgindividual.Rule;
import smitey.rpgindividual.Sum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smitey.rpgindividual.impl.RuleImpl#getOr <em>Or</em>}</li>
 *   <li>{@link smitey.rpgindividual.impl.RuleImpl#getTargetThen <em>Target Then</em>}</li>
 *   <li>{@link smitey.rpgindividual.impl.RuleImpl#getTargetAtt <em>Target Att</em>}</li>
 *   <li>{@link smitey.rpgindividual.impl.RuleImpl#getChange <em>Change</em>}</li>
 *   <li>{@link smitey.rpgindividual.impl.RuleImpl#getSum <em>Sum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule
{
  /**
   * The cached value of the '{@link #getOr() <em>Or</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOr()
   * @generated
   * @ordered
   */
  protected Proposition or;

  /**
   * The default value of the '{@link #getTargetThen() <em>Target Then</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetThen()
   * @generated
   * @ordered
   */
  protected static final String TARGET_THEN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetThen() <em>Target Then</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetThen()
   * @generated
   * @ordered
   */
  protected String targetThen = TARGET_THEN_EDEFAULT;

  /**
   * The cached value of the '{@link #getTargetAtt() <em>Target Att</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetAtt()
   * @generated
   * @ordered
   */
  protected Attribute targetAtt;

  /**
   * The default value of the '{@link #getChange() <em>Change</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChange()
   * @generated
   * @ordered
   */
  protected static final String CHANGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getChange() <em>Change</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChange()
   * @generated
   * @ordered
   */
  protected String change = CHANGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSum() <em>Sum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSum()
   * @generated
   * @ordered
   */
  protected Sum sum;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleImpl()
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
    return RpgindividualPackage.Literals.RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Proposition getOr()
  {
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOr(Proposition newOr, NotificationChain msgs)
  {
    Proposition oldOr = or;
    or = newOr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RpgindividualPackage.RULE__OR, oldOr, newOr);
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
  public void setOr(Proposition newOr)
  {
    if (newOr != or)
    {
      NotificationChain msgs = null;
      if (or != null)
        msgs = ((InternalEObject)or).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RpgindividualPackage.RULE__OR, null, msgs);
      if (newOr != null)
        msgs = ((InternalEObject)newOr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RpgindividualPackage.RULE__OR, null, msgs);
      msgs = basicSetOr(newOr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RpgindividualPackage.RULE__OR, newOr, newOr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTargetThen()
  {
    return targetThen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTargetThen(String newTargetThen)
  {
    String oldTargetThen = targetThen;
    targetThen = newTargetThen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RpgindividualPackage.RULE__TARGET_THEN, oldTargetThen, targetThen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute getTargetAtt()
  {
    if (targetAtt != null && targetAtt.eIsProxy())
    {
      InternalEObject oldTargetAtt = (InternalEObject)targetAtt;
      targetAtt = (Attribute)eResolveProxy(oldTargetAtt);
      if (targetAtt != oldTargetAtt)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RpgindividualPackage.RULE__TARGET_ATT, oldTargetAtt, targetAtt));
      }
    }
    return targetAtt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetTargetAtt()
  {
    return targetAtt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTargetAtt(Attribute newTargetAtt)
  {
    Attribute oldTargetAtt = targetAtt;
    targetAtt = newTargetAtt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RpgindividualPackage.RULE__TARGET_ATT, oldTargetAtt, targetAtt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getChange()
  {
    return change;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setChange(String newChange)
  {
    String oldChange = change;
    change = newChange;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RpgindividualPackage.RULE__CHANGE, oldChange, change));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sum getSum()
  {
    return sum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSum(Sum newSum, NotificationChain msgs)
  {
    Sum oldSum = sum;
    sum = newSum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RpgindividualPackage.RULE__SUM, oldSum, newSum);
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
  public void setSum(Sum newSum)
  {
    if (newSum != sum)
    {
      NotificationChain msgs = null;
      if (sum != null)
        msgs = ((InternalEObject)sum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RpgindividualPackage.RULE__SUM, null, msgs);
      if (newSum != null)
        msgs = ((InternalEObject)newSum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RpgindividualPackage.RULE__SUM, null, msgs);
      msgs = basicSetSum(newSum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RpgindividualPackage.RULE__SUM, newSum, newSum));
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
      case RpgindividualPackage.RULE__OR:
        return basicSetOr(null, msgs);
      case RpgindividualPackage.RULE__SUM:
        return basicSetSum(null, msgs);
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
      case RpgindividualPackage.RULE__OR:
        return getOr();
      case RpgindividualPackage.RULE__TARGET_THEN:
        return getTargetThen();
      case RpgindividualPackage.RULE__TARGET_ATT:
        if (resolve) return getTargetAtt();
        return basicGetTargetAtt();
      case RpgindividualPackage.RULE__CHANGE:
        return getChange();
      case RpgindividualPackage.RULE__SUM:
        return getSum();
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
      case RpgindividualPackage.RULE__OR:
        setOr((Proposition)newValue);
        return;
      case RpgindividualPackage.RULE__TARGET_THEN:
        setTargetThen((String)newValue);
        return;
      case RpgindividualPackage.RULE__TARGET_ATT:
        setTargetAtt((Attribute)newValue);
        return;
      case RpgindividualPackage.RULE__CHANGE:
        setChange((String)newValue);
        return;
      case RpgindividualPackage.RULE__SUM:
        setSum((Sum)newValue);
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
      case RpgindividualPackage.RULE__OR:
        setOr((Proposition)null);
        return;
      case RpgindividualPackage.RULE__TARGET_THEN:
        setTargetThen(TARGET_THEN_EDEFAULT);
        return;
      case RpgindividualPackage.RULE__TARGET_ATT:
        setTargetAtt((Attribute)null);
        return;
      case RpgindividualPackage.RULE__CHANGE:
        setChange(CHANGE_EDEFAULT);
        return;
      case RpgindividualPackage.RULE__SUM:
        setSum((Sum)null);
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
      case RpgindividualPackage.RULE__OR:
        return or != null;
      case RpgindividualPackage.RULE__TARGET_THEN:
        return TARGET_THEN_EDEFAULT == null ? targetThen != null : !TARGET_THEN_EDEFAULT.equals(targetThen);
      case RpgindividualPackage.RULE__TARGET_ATT:
        return targetAtt != null;
      case RpgindividualPackage.RULE__CHANGE:
        return CHANGE_EDEFAULT == null ? change != null : !CHANGE_EDEFAULT.equals(change);
      case RpgindividualPackage.RULE__SUM:
        return sum != null;
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
    result.append(" (targetThen: ");
    result.append(targetThen);
    result.append(", change: ");
    result.append(change);
    result.append(')');
    return result.toString();
  }

} //RuleImpl
