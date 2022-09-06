/**
 */
package processMaker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Global Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link processMaker.UpdateGlobalVariable#getDataport <em>Dataport</em>}</li>
 * </ul>
 *
 * @see processMaker.ProcessMakerPackage#getUpdateGlobalVariable()
 * @model
 * @generated
 */
public interface UpdateGlobalVariable extends Instructions {
	/**
	 * Returns the value of the '<em><b>Dataport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataport</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataport</em>' reference.
	 * @see #setDataport(DataPort)
	 * @see processMaker.ProcessMakerPackage#getUpdateGlobalVariable_Dataport()
	 * @model required="true"
	 * @generated
	 */
	DataPort getDataport();

	/**
	 * Sets the value of the '{@link processMaker.UpdateGlobalVariable#getDataport <em>Dataport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataport</em>' reference.
	 * @see #getDataport()
	 * @generated
	 */
	void setDataport(DataPort value);

} // UpdateGlobalVariable
