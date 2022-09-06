/**
 */
package rosModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rosModel.RosPackage#getNode <em>Node</em>}</li>
 *   <li>{@link rosModel.RosPackage#getTopic <em>Topic</em>}</li>
 *   <li>{@link rosModel.RosPackage#getMsg <em>Msg</em>}</li>
 *   <li>{@link rosModel.RosPackage#getSrv <em>Srv</em>}</li>
 *   <li>{@link rosModel.RosPackage#getName <em>Name</em>}</li>
 *   <li>{@link rosModel.RosPackage#getService <em>Service</em>}</li>
 *   <li>{@link rosModel.RosPackage#getPath <em>Path</em>}</li>
 *   <li>{@link rosModel.RosPackage#getSubpackage <em>Subpackage</em>}</li>
 *   <li>{@link rosModel.RosPackage#isExists <em>Exists</em>}</li>
 * </ul>
 *
 * @see rosModel.RosModelPackage#getRosPackage()
 * @model
 * @generated
 */
public interface RosPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link rosModel.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see rosModel.RosModelPackage#getRosPackage_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' containment reference list.
	 * The list contents are of type {@link rosModel.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' containment reference list.
	 * @see rosModel.RosModelPackage#getRosPackage_Topic()
	 * @model containment="true"
	 * @generated
	 */
	EList<Topic> getTopic();

	/**
	 * Returns the value of the '<em><b>Msg</b></em>' containment reference list.
	 * The list contents are of type {@link rosModel.MsgDataStruct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' containment reference list.
	 * @see rosModel.RosModelPackage#getRosPackage_Msg()
	 * @model containment="true"
	 * @generated
	 */
	EList<MsgDataStruct> getMsg();

	/**
	 * Returns the value of the '<em><b>Srv</b></em>' containment reference list.
	 * The list contents are of type {@link rosModel.SrvDataStruct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv</em>' containment reference list.
	 * @see rosModel.RosModelPackage#getRosPackage_Srv()
	 * @model containment="true"
	 * @generated
	 */
	EList<SrvDataStruct> getSrv();

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
	 * @see rosModel.RosModelPackage#getRosPackage_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rosModel.RosPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link rosModel.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see rosModel.RosModelPackage#getRosPackage_Service()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see rosModel.RosModelPackage#getRosPackage_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link rosModel.RosPackage#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Subpackage</b></em>' containment reference list.
	 * The list contents are of type {@link rosModel.RosPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subpackage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpackage</em>' containment reference list.
	 * @see rosModel.RosModelPackage#getRosPackage_Subpackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<RosPackage> getSubpackage();

	/**
	 * Returns the value of the '<em><b>Exists</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exists</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exists</em>' attribute.
	 * @see #setExists(boolean)
	 * @see rosModel.RosModelPackage#getRosPackage_Exists()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isExists();

	/**
	 * Sets the value of the '{@link rosModel.RosPackage#isExists <em>Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exists</em>' attribute.
	 * @see #isExists()
	 * @generated
	 */
	void setExists(boolean value);

} // RosPackage
