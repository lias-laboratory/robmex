/**
 */
package processMaker;

import ROSMiLan.DataPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link processMaker.ServiceBlock#getRequest <em>Request</em>}</li>
 *   <li>{@link processMaker.ServiceBlock#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see processMaker.ProcessMakerPackage#getServiceBlock()
 * @model
 * @generated
 */
public interface ServiceBlock extends CodeBlock {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(DataPort)
	 * @see processMaker.ProcessMakerPackage#getServiceBlock_Request()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataPort getRequest();

	/**
	 * Sets the value of the '{@link processMaker.ServiceBlock#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(DataPort value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(DataPort)
	 * @see processMaker.ProcessMakerPackage#getServiceBlock_Response()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataPort getResponse();

	/**
	 * Sets the value of the '{@link processMaker.ServiceBlock#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(DataPort value);

} // ServiceBlock
