/**
 * generated by Xtext 2.21.0
 */
package smitey.rpgindividual;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smitey.rpgindividual.Attributes#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see smitey.rpgindividual.RpgindividualPackage#getAttributes()
 * @model
 * @generated
 */
public interface Attributes extends Declaration
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link smitey.rpgindividual.Attribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see smitey.rpgindividual.RpgindividualPackage#getAttributes_Attribute()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttribute();

} // Attributes