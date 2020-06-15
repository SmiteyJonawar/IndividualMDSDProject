/**
 * generated by Xtext 2.21.0
 */
package smitey.rpgindividual.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smitey.rpgindividual.EntityMoveModifier;
import smitey.rpgindividual.EntityMoves;
import smitey.rpgindividual.RpgindividualPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Moves</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smitey.rpgindividual.impl.EntityMovesImpl#getMove <em>Move</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityMovesImpl extends MinimalEObjectImpl.Container implements EntityMoves
{
  /**
   * The cached value of the '{@link #getMove() <em>Move</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMove()
   * @generated
   * @ordered
   */
  protected EList<EntityMoveModifier> move;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityMovesImpl()
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
    return RpgindividualPackage.Literals.ENTITY_MOVES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EntityMoveModifier> getMove()
  {
    if (move == null)
    {
      move = new EObjectContainmentEList<EntityMoveModifier>(EntityMoveModifier.class, this, RpgindividualPackage.ENTITY_MOVES__MOVE);
    }
    return move;
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
      case RpgindividualPackage.ENTITY_MOVES__MOVE:
        return ((InternalEList<?>)getMove()).basicRemove(otherEnd, msgs);
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
      case RpgindividualPackage.ENTITY_MOVES__MOVE:
        return getMove();
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
      case RpgindividualPackage.ENTITY_MOVES__MOVE:
        getMove().clear();
        getMove().addAll((Collection<? extends EntityMoveModifier>)newValue);
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
      case RpgindividualPackage.ENTITY_MOVES__MOVE:
        getMove().clear();
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
      case RpgindividualPackage.ENTITY_MOVES__MOVE:
        return move != null && !move.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EntityMovesImpl