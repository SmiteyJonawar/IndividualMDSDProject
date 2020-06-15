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

import smitey.rpgindividual.RpgindividualPackage;
import smitey.rpgindividual.Team;
import smitey.rpgindividual.Teams;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Teams</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smitey.rpgindividual.impl.TeamsImpl#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamsImpl extends DeclarationImpl implements Teams
{
  /**
   * The cached value of the '{@link #getTeam() <em>Team</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeam()
   * @generated
   * @ordered
   */
  protected EList<Team> team;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TeamsImpl()
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
    return RpgindividualPackage.Literals.TEAMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Team> getTeam()
  {
    if (team == null)
    {
      team = new EObjectContainmentEList<Team>(Team.class, this, RpgindividualPackage.TEAMS__TEAM);
    }
    return team;
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
      case RpgindividualPackage.TEAMS__TEAM:
        return ((InternalEList<?>)getTeam()).basicRemove(otherEnd, msgs);
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
      case RpgindividualPackage.TEAMS__TEAM:
        return getTeam();
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
      case RpgindividualPackage.TEAMS__TEAM:
        getTeam().clear();
        getTeam().addAll((Collection<? extends Team>)newValue);
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
      case RpgindividualPackage.TEAMS__TEAM:
        getTeam().clear();
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
      case RpgindividualPackage.TEAMS__TEAM:
        return team != null && !team.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TeamsImpl
