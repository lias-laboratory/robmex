/**
 */
package rosModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rosModel.ComposedAttribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see rosModel.RosModelPackage#getComposedAttribute()
 * @model
 * @generated
 */
public interface ComposedAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(MsgDataStruct)
	 * @see rosModel.RosModelPackage#getComposedAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	MsgDataStruct getType();

	/**
	 * Sets the value of the '{@link rosModel.ComposedAttribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MsgDataStruct value);

} // ComposedAttribute
