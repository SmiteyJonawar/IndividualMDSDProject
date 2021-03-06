/**
 * generated by Xtext 2.21.0
 */
package smitey.rpgindividual;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smitey.rpgindividual.Type#getName <em>Name</em>}</li>
 *   <li>{@link smitey.rpgindividual.Type#getTExpression <em>TExpression</em>}</li>
 * </ul>
 *
 * @see smitey.rpgindividual.RpgindividualPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see smitey.rpgindividual.RpgindividualPackage#getType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link smitey.rpgindividual.Type#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>TExpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>TExpression</em>' containment reference.
   * @see #setTExpression(TypeExpression)
   * @see smitey.rpgindividual.RpgindividualPackage#getType_TExpression()
   * @model containment="true"
   * @generated
   */
  TypeExpression getTExpression();

  /**
   * Sets the value of the '{@link smitey.rpgindividual.Type#getTExpression <em>TExpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>TExpression</em>' containment reference.
   * @see #getTExpression()
   * @generated
   */
  void setTExpression(TypeExpression value);

} // Type
