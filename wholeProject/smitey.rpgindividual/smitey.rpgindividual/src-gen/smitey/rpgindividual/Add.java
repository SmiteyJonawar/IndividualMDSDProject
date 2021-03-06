/**
 * generated by Xtext 2.21.0
 */
package smitey.rpgindividual;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smitey.rpgindividual.Add#getLeft <em>Left</em>}</li>
 *   <li>{@link smitey.rpgindividual.Add#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see smitey.rpgindividual.RpgindividualPackage#getAdd()
 * @model
 * @generated
 */
public interface Add extends Sum
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Sum)
   * @see smitey.rpgindividual.RpgindividualPackage#getAdd_Left()
   * @model containment="true"
   * @generated
   */
  Sum getLeft();

  /**
   * Sets the value of the '{@link smitey.rpgindividual.Add#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Sum value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Multiply)
   * @see smitey.rpgindividual.RpgindividualPackage#getAdd_Right()
   * @model containment="true"
   * @generated
   */
  Multiply getRight();

  /**
   * Sets the value of the '{@link smitey.rpgindividual.Add#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Multiply value);

} // Add
