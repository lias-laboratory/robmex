/**
 */
package rosModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rosModel.Service#getSrvdatastruct <em>Srvdatastruct</em>}</li>
 *   <li>{@link rosModel.Service#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see rosModel.RosModelPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Srvdatastruct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srvdatastruct</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srvdatastruct</em>' reference.
	 * @see #setSrvdatastruct(SrvDataStruct)
	 * @see rosModel.RosModelPackage#getService_Srvdatastruct()
	 * @model required="true"
	 * @generated
	 */
	SrvDataStruct getSrvdatastruct();

	/**
	 * Sets the value of the '{@link rosModel.Service#getSrvdatastruct <em>Srvdatastruct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srvdatastruct</em>' reference.
	 * @see #getSrvdatastruct()
	 * @generated
	 */
	void setSrvdatastruct(SrvDataStruct value);

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
	 * @see rosModel.RosModelPackage#getService_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rosModel.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Service
