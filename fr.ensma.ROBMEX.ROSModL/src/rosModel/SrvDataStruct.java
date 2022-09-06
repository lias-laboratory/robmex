/**
 */
package rosModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Srv Data Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rosModel.SrvDataStruct#getName <em>Name</em>}</li>
 *   <li>{@link rosModel.SrvDataStruct#getRequestAttributes <em>Request Attributes</em>}</li>
 *   <li>{@link rosModel.SrvDataStruct#getResponseAttributes <em>Response Attributes</em>}</li>
 * </ul>
 *
 * @see rosModel.RosModelPackage#getSrvDataStruct()
 * @model
 * @generated
 */
public interface SrvDataStruct extends EObject {
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
	 * @see rosModel.RosModelPackage#getSrvDataStruct_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rosModel.SrvDataStruct#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Request Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link rosModel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Attributes</em>' containment reference list.
	 * @see rosModel.RosModelPackage#getSrvDataStruct_RequestAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getRequestAttributes();

	/**
	 * Returns the value of the '<em><b>Response Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link rosModel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Attributes</em>' containment reference list.
	 * @see rosModel.RosModelPackage#getSrvDataStruct_ResponseAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getResponseAttributes();

} // SrvDataStruct
