/**
 */
package processMaker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link processMaker.Operation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see processMaker.ProcessMakerPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends TwoTermsOperation, Instructions, OperationTerm {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link processMaker.ECalculations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see processMaker.ECalculations
	 * @see #setType(ECalculations)
	 * @see processMaker.ProcessMakerPackage#getOperation_Type()
	 * @model id="true" required="true"
	 * @generated
	 */
	ECalculations getType();

	/**
	 * Sets the value of the '{@link processMaker.Operation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see processMaker.ECalculations
	 * @see #getType()
	 * @generated
	 */
	void setType(ECalculations value);

} // Operation
