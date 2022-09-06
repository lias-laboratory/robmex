/**
 */
package rosModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rosModel.Node#getSubscribeTo <em>Subscribe To</em>}</li>
 *   <li>{@link rosModel.Node#getPublishTo <em>Publish To</em>}</li>
 *   <li>{@link rosModel.Node#getClientOf <em>Client Of</em>}</li>
 *   <li>{@link rosModel.Node#getName <em>Name</em>}</li>
 *   <li>{@link rosModel.Node#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link rosModel.Node#getServerOf <em>Server Of</em>}</li>
 *   <li>{@link rosModel.Node#getDescription <em>Description</em>}</li>
 *   <li>{@link rosModel.Node#getCodeReference <em>Code Reference</em>}</li>
 * </ul>
 *
 * @see rosModel.RosModelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Subscribe To</b></em>' reference list.
	 * The list contents are of type {@link rosModel.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribe To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe To</em>' reference list.
	 * @see rosModel.RosModelPackage#getNode_SubscribeTo()
	 * @model
	 * @generated
	 */
	EList<Topic> getSubscribeTo();

	/**
	 * Returns the value of the '<em><b>Publish To</b></em>' reference list.
	 * The list contents are of type {@link rosModel.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publish To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish To</em>' reference list.
	 * @see rosModel.RosModelPackage#getNode_PublishTo()
	 * @model
	 * @generated
	 */
	EList<Topic> getPublishTo();

	/**
	 * Returns the value of the '<em><b>Client Of</b></em>' reference list.
	 * The list contents are of type {@link rosModel.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Of</em>' reference list.
	 * @see rosModel.RosModelPackage#getNode_ClientOf()
	 * @model
	 * @generated
	 */
	EList<Service> getClientOf();

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
	 * @see rosModel.RosModelPackage#getNode_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rosModel.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(float)
	 * @see rosModel.RosModelPackage#getNode_Frequency()
	 * @model
	 * @generated
	 */
	float getFrequency();

	/**
	 * Sets the value of the '{@link rosModel.Node#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(float value);

	/**
	 * Returns the value of the '<em><b>Server Of</b></em>' reference list.
	 * The list contents are of type {@link rosModel.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Of</em>' reference list.
	 * @see rosModel.RosModelPackage#getNode_ServerOf()
	 * @model
	 * @generated
	 */
	EList<Service> getServerOf();

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
	 * @see rosModel.RosModelPackage#getNode_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link rosModel.Node#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Code Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Reference</em>' attribute.
	 * @see #setCodeReference(String)
	 * @see rosModel.RosModelPackage#getNode_CodeReference()
	 * @model
	 * @generated
	 */
	String getCodeReference();

	/**
	 * Sets the value of the '{@link rosModel.Node#getCodeReference <em>Code Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Reference</em>' attribute.
	 * @see #getCodeReference()
	 * @generated
	 */
	void setCodeReference(String value);

} // Node
