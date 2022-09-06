/**
 */
package ROSMiLan;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functionality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ROSMiLan.Functionality#getServertorpc <em>Servertorpc</em>}</li>
 *   <li>{@link ROSMiLan.Functionality#getClientofrpc <em>Clientofrpc</em>}</li>
 *   <li>{@link ROSMiLan.Functionality#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see ROSMiLan.ROSMiLanPackage#getFunctionality()
 * @model
 * @generated
 */
public interface Functionality extends MissionMember {
	/**
	 * Returns the value of the '<em><b>Servertorpc</b></em>' containment reference list.
	 * The list contents are of type {@link ROSMiLan.ServerToRPC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servertorpc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servertorpc</em>' containment reference list.
	 * @see ROSMiLan.ROSMiLanPackage#getFunctionality_Servertorpc()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<ServerToRPC> getServertorpc();

	/**
	 * Returns the value of the '<em><b>Clientofrpc</b></em>' containment reference list.
	 * The list contents are of type {@link ROSMiLan.ClientOfRPC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clientofrpc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clientofrpc</em>' containment reference list.
	 * @see ROSMiLan.ROSMiLanPackage#getFunctionality_Clientofrpc()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<ClientOfRPC> getClientofrpc();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see ROSMiLan.ROSMiLanPackage#getFunctionality_Reference()
	 * @model required="true"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link ROSMiLan.Functionality#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

} // Functionality
