/**
 * generated by Xtext 2.21.0
 */
package smitey.rpgindividual;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smitey.rpgindividual.Effects#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @see smitey.rpgindividual.RpgindividualPackage#getEffects()
 * @model
 * @generated
 */
public interface Effects extends Declaration
{
  /**
   * Returns the value of the '<em><b>Effect</b></em>' containment reference list.
   * The list contents are of type {@link smitey.rpgindividual.Effect}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effect</em>' containment reference list.
   * @see smitey.rpgindividual.RpgindividualPackage#getEffects_Effect()
   * @model containment="true"
   * @generated
   */
  EList<Effect> getEffect();

} // Effects
