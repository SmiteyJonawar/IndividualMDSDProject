/**
 * generated by Xtext 2.21.0
 */
package smitey.rpgindividual;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moves</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smitey.rpgindividual.Moves#getMove <em>Move</em>}</li>
 * </ul>
 *
 * @see smitey.rpgindividual.RpgindividualPackage#getMoves()
 * @model
 * @generated
 */
public interface Moves extends Declaration
{
  /**
   * Returns the value of the '<em><b>Move</b></em>' containment reference list.
   * The list contents are of type {@link smitey.rpgindividual.Move}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Move</em>' containment reference list.
   * @see smitey.rpgindividual.RpgindividualPackage#getMoves_Move()
   * @model containment="true"
   * @generated
   */
  EList<Move> getMove();

} // Moves
