/**
 */
package ROSMiLan;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ROSMiLan.Mission#getItStartsWith <em>It Starts With</em>}</li>
 *   <li>{@link ROSMiLan.Mission#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ROSMiLan.ROSMiLanPackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends BlockOfConnectedFunctions {
	/**
	 * Returns the value of the '<em><b>It Starts With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>It Starts With</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>It Starts With</em>' reference.
	 * @see #setItStartsWith(MissionMember)
	 * @see ROSMiLan.ROSMiLanPackage#getMission_ItStartsWith()
	 * @model required="true"
	 * @generated
	 */
	MissionMember getItStartsWith();

	/**
	 * Sets the value of the '{@link ROSMiLan.Mission#getItStartsWith <em>It Starts With</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>It Starts With</em>' reference.
	 * @see #getItStartsWith()
	 * @generated
	 */
	void setItStartsWith(MissionMember value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ROSMiLan.ROSMiLanPackage#getMission_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ROSMiLan.Mission#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Mission
