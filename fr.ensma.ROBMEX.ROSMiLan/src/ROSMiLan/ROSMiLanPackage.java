/**
 */
package ROSMiLan;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ROSMiLan.ROSMiLanFactory
 * @model kind="package"
 * @generated
 */
public interface ROSMiLanPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ROSMiLan";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ROSMiLan";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ROSMiLan";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ROSMiLanPackage eINSTANCE = ROSMiLan.impl.ROSMiLanPackageImpl.init();

	/**
	 * The meta object id for the '{@link ROSMiLan.impl.BlockOfConnectedFunctionsImpl <em>Block Of Connected Functions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ROSMiLan.impl.BlockOfConnectedFunctionsImpl
	 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getBlockOfConnectedFunctions()
	 * @generated
	 */
	int BLOCK_OF_CONNECTED_FUNCTIONS = 9;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_CONNECTED_FUNCTIONS__STEPS = 0;

	/**
	 * The feature id for the '<em><b>Data Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_CONNECTED_FUNCTIONS__DATA_MODULE = 1;

	/**
	 * The number of structural features of the '<em>Block Of Connected Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_CONNECTED_FUNCTIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Block Of Connected Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_CONNECTED_FUNCTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ROSMiLan.impl.MissionImpl <em>Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ROSMiLan.impl.MissionImpl
	 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getMission()
	 * @generated
	 */
	int MISSION = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__STEPS = BLOCK_OF_CONNECTED_FUNCTIONS__STEPS;

	/**
	 * The feature id for the '<em><b>Data Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__DATA_MODULE = BLOCK_OF_CONNECTED_FUNCTIONS__DATA_MODULE;

	/**
	 * The feature id for the '<em><b>It Starts With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__IT_STARTS_WITH = BLOCK_OF_CONNECTED_FUNCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__NAME = BLOCK_OF_CONNECTED_FUNCTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_FEATURE_COUNT = BLOCK_OF_CONNECTED_FUNCTIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_OPERATION_COUNT = BLOCK_OF_CONNECTED_FUNCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ROSMiLan.impl.MissionMemberImpl <em>Mission Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ROSMiLan.impl.MissionMemberImpl
	 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getMissionMember()
	 * @generated
	 */
	int MISSION_MEMBER = 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_MEMBER__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_MEMBER__NEXT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_MEMBER__NAME = 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_MEMBER__OUTPUTS = 3;

	/**
	 * The number of structural features of the '<em>Mission Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_MEMBER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mission Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ROSMiLan.impl.FunctionalityImpl <em>Functionality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ROSMiLan.impl.FunctionalityImpl
	 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getFunctionality()
	 * @generated
	 */
	int FUNCTIONALITY = 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__INPUTS = MISSION_MEMBER__INPUTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__NEXT = MISSION_MEMBER__NEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__NAME = MISSION_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__OUTPUTS = MISSION_MEMBER__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Servertorpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__SERVERTORPC = MISSION_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clientofrpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__CLIENTOFRPC = MISSION_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__REFERENCE = MISSION_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Functionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_FEATURE_COUNT = MISSION_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Functionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_OPERATION_COUNT = MISSION_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ROSMiLan.impl.MultitaskImpl <em>Multitask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ROSMiLan.impl.MultitaskImpl
	 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getMultitask()
	 * @generated
	 */
	int MULTITASK = 3;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTITASK__INPUTS = MISSION_MEMBER__INPUTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTITASK__NEXT = MISSION_MEMBER__NEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTITASK__NAME = MISSION_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTITASK__OUTPUTS = MISSION_MEMBER__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTITASK__STEPS = MISSION_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTITASK__DATA_MODULE = MISSION_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multitask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTITASK_FEATURE_COUNT = MISSION_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multitask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTITASK_OPERATION_COUNT = MISSION_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ROSMiLan.impl.ServerToRPCImpl <em>Server To RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ROSMiLan.impl.ServerToRPCImpl
	 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getServerToRPC()
	 * @generated
	 */
	int SERVER_TO_RPC = 4;

	/**
	 * The number of structural features of the '<em>Server To RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_TO_RPC_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Server To RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_TO_RPC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ROSMiLan.impl.ClientOfRPCImpl <em>Client Of RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ROSMiLan.impl.ClientOfRPCImpl
	 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getClientOfRPC()
	 * @generated
	 */
	int CLIENT_OF_RPC = 5;

	/**
	 * The feature id for the '<em><b>Servertorpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OF_RPC__SERVERTORPC = 0;

	/**
	 * The number of structural features of the '<em>Client Of RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OF_RPC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Client Of RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OF_RPC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ROSMiLan.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ROSMiLan.impl.LibraryImpl
	 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 6;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__MEMBERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ROSMiLan.impl.DataPortImpl <em>Data Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ROSMiLan.impl.DataPortImpl
	 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getDataPort()
	 * @generated
	 */
	int DATA_PORT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ROSMiLan.impl.DataModuleImpl <em>Data Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ROSMiLan.impl.DataModuleImpl
	 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getDataModule()
	 * @generated
	 */
	int DATA_MODULE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connect</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODULE__CONNECT = 1;

	/**
	 * The number of structural features of the '<em>Data Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ROSMiLan.impl.ExternalTopicImpl <em>External Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ROSMiLan.impl.ExternalTopicImpl
	 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getExternalTopic()
	 * @generated
	 */
	int EXTERNAL_TOPIC = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TOPIC__NAME = DATA_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Connect</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TOPIC__CONNECT = DATA_MODULE__CONNECT;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TOPIC__TOPIC_NAME = DATA_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TOPIC_FEATURE_COUNT = DATA_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>External Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TOPIC_OPERATION_COUNT = DATA_MODULE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ROSMiLan.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission</em>'.
	 * @see ROSMiLan.Mission
	 * @generated
	 */
	EClass getMission();

	/**
	 * Returns the meta object for the reference '{@link ROSMiLan.Mission#getItStartsWith <em>It Starts With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>It Starts With</em>'.
	 * @see ROSMiLan.Mission#getItStartsWith()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_ItStartsWith();

	/**
	 * Returns the meta object for the attribute '{@link ROSMiLan.Mission#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ROSMiLan.Mission#getName()
	 * @see #getMission()
	 * @generated
	 */
	EAttribute getMission_Name();

	/**
	 * Returns the meta object for class '{@link ROSMiLan.MissionMember <em>Mission Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission Member</em>'.
	 * @see ROSMiLan.MissionMember
	 * @generated
	 */
	EClass getMissionMember();

	/**
	 * Returns the meta object for the containment reference list '{@link ROSMiLan.MissionMember#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see ROSMiLan.MissionMember#getInputs()
	 * @see #getMissionMember()
	 * @generated
	 */
	EReference getMissionMember_Inputs();

	/**
	 * Returns the meta object for the reference '{@link ROSMiLan.MissionMember#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see ROSMiLan.MissionMember#getNext()
	 * @see #getMissionMember()
	 * @generated
	 */
	EReference getMissionMember_Next();

	/**
	 * Returns the meta object for the attribute '{@link ROSMiLan.MissionMember#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ROSMiLan.MissionMember#getName()
	 * @see #getMissionMember()
	 * @generated
	 */
	EAttribute getMissionMember_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ROSMiLan.MissionMember#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see ROSMiLan.MissionMember#getOutputs()
	 * @see #getMissionMember()
	 * @generated
	 */
	EReference getMissionMember_Outputs();

	/**
	 * Returns the meta object for class '{@link ROSMiLan.Functionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functionality</em>'.
	 * @see ROSMiLan.Functionality
	 * @generated
	 */
	EClass getFunctionality();

	/**
	 * Returns the meta object for the containment reference list '{@link ROSMiLan.Functionality#getServertorpc <em>Servertorpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servertorpc</em>'.
	 * @see ROSMiLan.Functionality#getServertorpc()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Servertorpc();

	/**
	 * Returns the meta object for the containment reference list '{@link ROSMiLan.Functionality#getClientofrpc <em>Clientofrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clientofrpc</em>'.
	 * @see ROSMiLan.Functionality#getClientofrpc()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Clientofrpc();

	/**
	 * Returns the meta object for the attribute '{@link ROSMiLan.Functionality#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see ROSMiLan.Functionality#getReference()
	 * @see #getFunctionality()
	 * @generated
	 */
	EAttribute getFunctionality_Reference();

	/**
	 * Returns the meta object for class '{@link ROSMiLan.Multitask <em>Multitask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multitask</em>'.
	 * @see ROSMiLan.Multitask
	 * @generated
	 */
	EClass getMultitask();

	/**
	 * Returns the meta object for class '{@link ROSMiLan.ServerToRPC <em>Server To RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server To RPC</em>'.
	 * @see ROSMiLan.ServerToRPC
	 * @generated
	 */
	EClass getServerToRPC();

	/**
	 * Returns the meta object for class '{@link ROSMiLan.ClientOfRPC <em>Client Of RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client Of RPC</em>'.
	 * @see ROSMiLan.ClientOfRPC
	 * @generated
	 */
	EClass getClientOfRPC();

	/**
	 * Returns the meta object for the reference '{@link ROSMiLan.ClientOfRPC#getServertorpc <em>Servertorpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servertorpc</em>'.
	 * @see ROSMiLan.ClientOfRPC#getServertorpc()
	 * @see #getClientOfRPC()
	 * @generated
	 */
	EReference getClientOfRPC_Servertorpc();

	/**
	 * Returns the meta object for class '{@link ROSMiLan.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see ROSMiLan.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link ROSMiLan.Library#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see ROSMiLan.Library#getMembers()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Members();

	/**
	 * Returns the meta object for the attribute '{@link ROSMiLan.Library#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ROSMiLan.Library#getName()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Name();

	/**
	 * Returns the meta object for class '{@link ROSMiLan.DataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Port</em>'.
	 * @see ROSMiLan.DataPort
	 * @generated
	 */
	EClass getDataPort();

	/**
	 * Returns the meta object for the attribute '{@link ROSMiLan.DataPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ROSMiLan.DataPort#getName()
	 * @see #getDataPort()
	 * @generated
	 */
	EAttribute getDataPort_Name();

	/**
	 * Returns the meta object for class '{@link ROSMiLan.DataModule <em>Data Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Module</em>'.
	 * @see ROSMiLan.DataModule
	 * @generated
	 */
	EClass getDataModule();

	/**
	 * Returns the meta object for the attribute '{@link ROSMiLan.DataModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ROSMiLan.DataModule#getName()
	 * @see #getDataModule()
	 * @generated
	 */
	EAttribute getDataModule_Name();

	/**
	 * Returns the meta object for the reference list '{@link ROSMiLan.DataModule#getConnect <em>Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connect</em>'.
	 * @see ROSMiLan.DataModule#getConnect()
	 * @see #getDataModule()
	 * @generated
	 */
	EReference getDataModule_Connect();

	/**
	 * Returns the meta object for class '{@link ROSMiLan.BlockOfConnectedFunctions <em>Block Of Connected Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Of Connected Functions</em>'.
	 * @see ROSMiLan.BlockOfConnectedFunctions
	 * @generated
	 */
	EClass getBlockOfConnectedFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link ROSMiLan.BlockOfConnectedFunctions#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see ROSMiLan.BlockOfConnectedFunctions#getSteps()
	 * @see #getBlockOfConnectedFunctions()
	 * @generated
	 */
	EReference getBlockOfConnectedFunctions_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link ROSMiLan.BlockOfConnectedFunctions#getDataModule <em>Data Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Module</em>'.
	 * @see ROSMiLan.BlockOfConnectedFunctions#getDataModule()
	 * @see #getBlockOfConnectedFunctions()
	 * @generated
	 */
	EReference getBlockOfConnectedFunctions_DataModule();

	/**
	 * Returns the meta object for class '{@link ROSMiLan.ExternalTopic <em>External Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Topic</em>'.
	 * @see ROSMiLan.ExternalTopic
	 * @generated
	 */
	EClass getExternalTopic();

	/**
	 * Returns the meta object for the attribute '{@link ROSMiLan.ExternalTopic#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see ROSMiLan.ExternalTopic#getTopicName()
	 * @see #getExternalTopic()
	 * @generated
	 */
	EAttribute getExternalTopic_TopicName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ROSMiLanFactory getROSMiLanFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ROSMiLan.impl.MissionImpl <em>Mission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ROSMiLan.impl.MissionImpl
		 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getMission()
		 * @generated
		 */
		EClass MISSION = eINSTANCE.getMission();

		/**
		 * The meta object literal for the '<em><b>It Starts With</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__IT_STARTS_WITH = eINSTANCE.getMission_ItStartsWith();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSION__NAME = eINSTANCE.getMission_Name();

		/**
		 * The meta object literal for the '{@link ROSMiLan.impl.MissionMemberImpl <em>Mission Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ROSMiLan.impl.MissionMemberImpl
		 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getMissionMember()
		 * @generated
		 */
		EClass MISSION_MEMBER = eINSTANCE.getMissionMember();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION_MEMBER__INPUTS = eINSTANCE.getMissionMember_Inputs();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION_MEMBER__NEXT = eINSTANCE.getMissionMember_Next();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSION_MEMBER__NAME = eINSTANCE.getMissionMember_Name();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION_MEMBER__OUTPUTS = eINSTANCE.getMissionMember_Outputs();

		/**
		 * The meta object literal for the '{@link ROSMiLan.impl.FunctionalityImpl <em>Functionality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ROSMiLan.impl.FunctionalityImpl
		 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getFunctionality()
		 * @generated
		 */
		EClass FUNCTIONALITY = eINSTANCE.getFunctionality();

		/**
		 * The meta object literal for the '<em><b>Servertorpc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__SERVERTORPC = eINSTANCE.getFunctionality_Servertorpc();

		/**
		 * The meta object literal for the '<em><b>Clientofrpc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__CLIENTOFRPC = eINSTANCE.getFunctionality_Clientofrpc();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONALITY__REFERENCE = eINSTANCE.getFunctionality_Reference();

		/**
		 * The meta object literal for the '{@link ROSMiLan.impl.MultitaskImpl <em>Multitask</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ROSMiLan.impl.MultitaskImpl
		 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getMultitask()
		 * @generated
		 */
		EClass MULTITASK = eINSTANCE.getMultitask();

		/**
		 * The meta object literal for the '{@link ROSMiLan.impl.ServerToRPCImpl <em>Server To RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ROSMiLan.impl.ServerToRPCImpl
		 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getServerToRPC()
		 * @generated
		 */
		EClass SERVER_TO_RPC = eINSTANCE.getServerToRPC();

		/**
		 * The meta object literal for the '{@link ROSMiLan.impl.ClientOfRPCImpl <em>Client Of RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ROSMiLan.impl.ClientOfRPCImpl
		 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getClientOfRPC()
		 * @generated
		 */
		EClass CLIENT_OF_RPC = eINSTANCE.getClientOfRPC();

		/**
		 * The meta object literal for the '<em><b>Servertorpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT_OF_RPC__SERVERTORPC = eINSTANCE.getClientOfRPC_Servertorpc();

		/**
		 * The meta object literal for the '{@link ROSMiLan.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ROSMiLan.impl.LibraryImpl
		 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__MEMBERS = eINSTANCE.getLibrary_Members();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();

		/**
		 * The meta object literal for the '{@link ROSMiLan.impl.DataPortImpl <em>Data Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ROSMiLan.impl.DataPortImpl
		 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getDataPort()
		 * @generated
		 */
		EClass DATA_PORT = eINSTANCE.getDataPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PORT__NAME = eINSTANCE.getDataPort_Name();

		/**
		 * The meta object literal for the '{@link ROSMiLan.impl.DataModuleImpl <em>Data Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ROSMiLan.impl.DataModuleImpl
		 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getDataModule()
		 * @generated
		 */
		EClass DATA_MODULE = eINSTANCE.getDataModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MODULE__NAME = eINSTANCE.getDataModule_Name();

		/**
		 * The meta object literal for the '<em><b>Connect</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODULE__CONNECT = eINSTANCE.getDataModule_Connect();

		/**
		 * The meta object literal for the '{@link ROSMiLan.impl.BlockOfConnectedFunctionsImpl <em>Block Of Connected Functions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ROSMiLan.impl.BlockOfConnectedFunctionsImpl
		 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getBlockOfConnectedFunctions()
		 * @generated
		 */
		EClass BLOCK_OF_CONNECTED_FUNCTIONS = eINSTANCE.getBlockOfConnectedFunctions();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_OF_CONNECTED_FUNCTIONS__STEPS = eINSTANCE.getBlockOfConnectedFunctions_Steps();

		/**
		 * The meta object literal for the '<em><b>Data Module</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_OF_CONNECTED_FUNCTIONS__DATA_MODULE = eINSTANCE.getBlockOfConnectedFunctions_DataModule();

		/**
		 * The meta object literal for the '{@link ROSMiLan.impl.ExternalTopicImpl <em>External Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ROSMiLan.impl.ExternalTopicImpl
		 * @see ROSMiLan.impl.ROSMiLanPackageImpl#getExternalTopic()
		 * @generated
		 */
		EClass EXTERNAL_TOPIC = eINSTANCE.getExternalTopic();

		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_TOPIC__TOPIC_NAME = eINSTANCE.getExternalTopic_TopicName();

	}

} //ROSMiLanPackage
