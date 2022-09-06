/**
 */
package ROSMiLan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Of Connected Functions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ROSMiLan.BlockOfConnectedFunctions#getSteps <em>Steps</em>}</li>
 *   <li>{@link ROSMiLan.BlockOfConnectedFunctions#getDataModule <em>Data Module</em>}</li>
 * </ul>
 *
 * @see ROSMiLan.ROSMiLanPackage#getBlockOfConnectedFunctions()
 * @model abstract="true"
 * @generated
 */
public interface BlockOfConnectedFunctions extends EObject {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link ROSMiLan.MissionMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see ROSMiLan.ROSMiLanPackage#getBlockOfConnectedFunctions_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MissionMember> getSteps();

	/**
	 * Returns the value of the '<em><b>Data Module</b></em>' containment reference list.
	 * The list contents are of type {@link ROSMiLan.DataModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Module</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Module</em>' containment reference list.
	 * @see ROSMiLan.ROSMiLanPackage#getBlockOfConnectedFunctions_DataModule()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataModule> getDataModule();

} // BlockOfConnectedFunctions
