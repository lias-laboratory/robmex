/**
 */
package rosModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rosModel.AttributeArray#getSize <em>Size</em>}</li>
 *   <li>{@link rosModel.AttributeArray#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see rosModel.RosModelPackage#getAttributeArray()
 * @model
 * @generated
 */
public interface AttributeArray extends Attribute {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see rosModel.RosModelPackage#getAttributeArray_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link rosModel.AttributeArray#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Attribute)
	 * @see rosModel.RosModelPackage#getAttributeArray_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Attribute getType();

	/**
	 * Sets the value of the '{@link rosModel.AttributeArray#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Attribute value);

} // AttributeArray
