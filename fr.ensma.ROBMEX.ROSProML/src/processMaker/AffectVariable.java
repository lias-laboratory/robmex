/**
 */
package processMaker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affect Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link processMaker.AffectVariable#getVariable <em>Variable</em>}</li>
 *   <li>{@link processMaker.AffectVariable#getValueOf <em>Value Of</em>}</li>
 *   <li>{@link processMaker.AffectVariable#getConstantValue <em>Constant Value</em>}</li>
 * </ul>
 *
 * @see processMaker.ProcessMakerPackage#getAffectVariable()
 * @model
 * @generated
 */
public interface AffectVariable extends Instructions {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see processMaker.ProcessMakerPackage#getAffectVariable_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link processMaker.AffectVariable#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Value Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Of</em>' containment reference.
	 * @see #setValueOf(OperationTerm)
	 * @see processMaker.ProcessMakerPackage#getAffectVariable_ValueOf()
	 * @model containment="true"
	 * @generated
	 */
	OperationTerm getValueOf();

	/**
	 * Sets the value of the '{@link processMaker.AffectVariable#getValueOf <em>Value Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Of</em>' containment reference.
	 * @see #getValueOf()
	 * @generated
	 */
	void setValueOf(OperationTerm value);

	/**
	 * Returns the value of the '<em><b>Constant Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Value</em>' attribute.
	 * @see #setConstantValue(String)
	 * @see processMaker.ProcessMakerPackage#getAffectVariable_ConstantValue()
	 * @model
	 * @generated
	 */
	String getConstantValue();

	/**
	 * Sets the value of the '{@link processMaker.AffectVariable#getConstantValue <em>Constant Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Value</em>' attribute.
	 * @see #getConstantValue()
	 * @generated
	 */
	void setConstantValue(String value);

} // AffectVariable
