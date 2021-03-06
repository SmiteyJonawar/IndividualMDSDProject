/**
 * generated by Xtext 2.21.0
 */
package smitey.rpgindividual.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smitey.rpgindividual.Loc;
import smitey.rpgindividual.Locations;
import smitey.rpgindividual.RpgindividualPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Locations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smitey.rpgindividual.impl.LocationsImpl#getLoc <em>Loc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationsImpl extends DeclarationImpl implements Locations
{
  /**
   * The cached value of the '{@link #getLoc() <em>Loc</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoc()
   * @generated
   * @ordered
   */
  protected EList<Loc> loc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocationsImpl()
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
    return RpgindividualPackage.Literals.LOCATIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Loc> getLoc()
  {
    if (loc == null)
    {
      loc = new EObjectContainmentEList<Loc>(Loc.class, this, RpgindividualPackage.LOCATIONS__LOC);
    }
    return loc;
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
      case RpgindividualPackage.LOCATIONS__LOC:
        return ((InternalEList<?>)getLoc()).basicRemove(otherEnd, msgs);
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
      case RpgindividualPackage.LOCATIONS__LOC:
        return getLoc();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RpgindividualPackage.LOCATIONS__LOC:
        getLoc().clear();
        getLoc().addAll((Collection<? extends Loc>)newValue);
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
      case RpgindividualPackage.LOCATIONS__LOC:
        getLoc().clear();
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
      case RpgindividualPackage.LOCATIONS__LOC:
        return loc != null && !loc.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LocationsImpl
