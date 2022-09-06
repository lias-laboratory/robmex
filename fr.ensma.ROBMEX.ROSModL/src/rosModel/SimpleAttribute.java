/**
 */
package rosModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rosModel.SimpleAttribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see rosModel.RosModelPackage#getSimpleAttribute()
 * @model
 * @generated
 */
public interface SimpleAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rosModel.RosDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see rosModel.RosDataType
	 * @see #setType(RosDataType)
	 * @see rosModel.RosModelPackage#getSimpleAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	RosDataType getType();

	/**
	 * Sets the value of the '{@link rosModel.SimpleAttribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see rosModel.RosDataType
	 * @see #getType()
	 * @generated
	 */
	void setType(RosDataType value);

} // SimpleAttribute
