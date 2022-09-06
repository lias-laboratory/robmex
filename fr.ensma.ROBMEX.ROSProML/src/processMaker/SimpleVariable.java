/**
 */
package processMaker;

import rosModel.RosDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link processMaker.SimpleVariable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see processMaker.ProcessMakerPackage#getSimpleVariable()
 * @model
 * @generated
 */
public interface SimpleVariable extends GlobalVariable {
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
	 * @see processMaker.ProcessMakerPackage#getSimpleVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	RosDataType getType();

	/**
	 * Sets the value of the '{@link processMaker.SimpleVariable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see rosModel.RosDataType
	 * @see #getType()
	 * @generated
	 */
	void setType(RosDataType value);

} // SimpleVariable
