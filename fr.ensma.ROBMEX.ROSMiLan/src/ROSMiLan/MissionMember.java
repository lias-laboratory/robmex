/**
 */
package ROSMiLan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ROSMiLan.MissionMember#getInputs <em>Inputs</em>}</li>
 *   <li>{@link ROSMiLan.MissionMember#getNext <em>Next</em>}</li>
 *   <li>{@link ROSMiLan.MissionMember#getName <em>Name</em>}</li>
 *   <li>{@link ROSMiLan.MissionMember#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see ROSMiLan.ROSMiLanPackage#getMissionMember()
 * @model abstract="true"
 * @generated
 */
public interface MissionMember extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link ROSMiLan.DataPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see ROSMiLan.ROSMiLanPackage#getMissionMember_Inputs()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<DataPort> getInputs();

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(MissionMember)
	 * @see ROSMiLan.ROSMiLanPackage#getMissionMember_Next()
	 * @model
	 * @generated
	 */
	MissionMember getNext();

	/**
	 * Sets the value of the '{@link ROSMiLan.MissionMember#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(MissionMember value);

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
	 * @see ROSMiLan.ROSMiLanPackage#getMissionMember_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ROSMiLan.MissionMember#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link ROSMiLan.DataPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see ROSMiLan.ROSMiLanPackage#getMissionMember_Outputs()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<DataPort> getOutputs();

} // MissionMember
