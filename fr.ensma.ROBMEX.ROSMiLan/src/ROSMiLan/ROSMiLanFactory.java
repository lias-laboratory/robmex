/**
 */
package ROSMiLan;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ROSMiLan.ROSMiLanPackage
 * @generated
 */
public interface ROSMiLanFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ROSMiLanFactory eINSTANCE = ROSMiLan.impl.ROSMiLanFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mission</em>'.
	 * @generated
	 */
	Mission createMission();

	/**
	 * Returns a new object of class '<em>Functionality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functionality</em>'.
	 * @generated
	 */
	Functionality createFunctionality();

	/**
	 * Returns a new object of class '<em>Multitask</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multitask</em>'.
	 * @generated
	 */
	Multitask createMultitask();

	/**
	 * Returns a new object of class '<em>Server To RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server To RPC</em>'.
	 * @generated
	 */
	ServerToRPC createServerToRPC();

	/**
	 * Returns a new object of class '<em>Client Of RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client Of RPC</em>'.
	 * @generated
	 */
	ClientOfRPC createClientOfRPC();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Port</em>'.
	 * @generated
	 */
	DataPort createDataPort();

	/**
	 * Returns a new object of class '<em>Data Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Module</em>'.
	 * @generated
	 */
	DataModule createDataModule();

	/**
	 * Returns a new object of class '<em>External Topic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Topic</em>'.
	 * @generated
	 */
	ExternalTopic createExternalTopic();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ROSMiLanPackage getROSMiLanPackage();

} //ROSMiLanFactory
