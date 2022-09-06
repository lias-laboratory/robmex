/**
 */
package processMaker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link processMaker.Comparison#getDescription <em>Description</em>}</li>
 *   <li>{@link processMaker.Comparison#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see processMaker.ProcessMakerPackage#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends BooleanExpression, TwoTermsOperation {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see processMaker.ProcessMakerPackage#getComparison_Description()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link processMaker.Comparison#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link processMaker.LogicalComparison}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see processMaker.LogicalComparison
	 * @see #setType(LogicalComparison)
	 * @see processMaker.ProcessMakerPackage#getComparison_Type()
	 * @model required="true"
	 * @generated
	 */
	LogicalComparison getType();

	/**
	 * Sets the value of the '{@link processMaker.Comparison#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see processMaker.LogicalComparison
	 * @see #getType()
	 * @generated
	 */
	void setType(LogicalComparison value);

} // Comparison
