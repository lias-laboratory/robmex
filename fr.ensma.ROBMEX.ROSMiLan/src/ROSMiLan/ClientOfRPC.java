/**
 */
package ROSMiLan;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client Of RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ROSMiLan.ClientOfRPC#getServertorpc <em>Servertorpc</em>}</li>
 * </ul>
 *
 * @see ROSMiLan.ROSMiLanPackage#getClientOfRPC()
 * @model
 * @generated
 */
public interface ClientOfRPC extends EObject {
	/**
	 * Returns the value of the '<em><b>Servertorpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servertorpc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servertorpc</em>' reference.
	 * @see #setServertorpc(ServerToRPC)
	 * @see ROSMiLan.ROSMiLanPackage#getClientOfRPC_Servertorpc()
	 * @model required="true"
	 * @generated
	 */
	ServerToRPC getServertorpc();

	/**
	 * Sets the value of the '{@link ROSMiLan.ClientOfRPC#getServertorpc <em>Servertorpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servertorpc</em>' reference.
	 * @see #getServertorpc()
	 * @generated
	 */
	void setServertorpc(ServerToRPC value);

} // ClientOfRPC
