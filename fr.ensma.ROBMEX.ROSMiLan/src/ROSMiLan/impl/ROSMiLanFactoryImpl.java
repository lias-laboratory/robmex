/**
 */
package ROSMiLan.impl;

import ROSMiLan.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ROSMiLanFactoryImpl extends EFactoryImpl implements ROSMiLanFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ROSMiLanFactory init() {
		try {
			ROSMiLanFactory theROSMiLanFactory = (ROSMiLanFactory)EPackage.Registry.INSTANCE.getEFactory(ROSMiLanPackage.eNS_URI);
			if (theROSMiLanFactory != null) {
				return theROSMiLanFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ROSMiLanFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSMiLanFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ROSMiLanPackage.MISSION: return createMission();
			case ROSMiLanPackage.FUNCTIONALITY: return createFunctionality();
			case ROSMiLanPackage.MULTITASK: return createMultitask();
			case ROSMiLanPackage.SERVER_TO_RPC: return createServerToRPC();
			case ROSMiLanPackage.CLIENT_OF_RPC: return createClientOfRPC();
			case ROSMiLanPackage.LIBRARY: return createLibrary();
			case ROSMiLanPackage.DATA_PORT: return createDataPort();
			case ROSMiLanPackage.DATA_MODULE: return createDataModule();
			case ROSMiLanPackage.EXTERNAL_TOPIC: return createExternalTopic();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mission createMission() {
		MissionImpl mission = new MissionImpl();
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functionality createFunctionality() {
		FunctionalityImpl functionality = new FunctionalityImpl();
		return functionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multitask createMultitask() {
		MultitaskImpl multitask = new MultitaskImpl();
		return multitask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerToRPC createServerToRPC() {
		ServerToRPCImpl serverToRPC = new ServerToRPCImpl();
		return serverToRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientOfRPC createClientOfRPC() {
		ClientOfRPCImpl clientOfRPC = new ClientOfRPCImpl();
		return clientOfRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPort createDataPort() {
		DataPortImpl dataPort = new DataPortImpl();
		return dataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModule createDataModule() {
		DataModuleImpl dataModule = new DataModuleImpl();
		return dataModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalTopic createExternalTopic() {
		ExternalTopicImpl externalTopic = new ExternalTopicImpl();
		return externalTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSMiLanPackage getROSMiLanPackage() {
		return (ROSMiLanPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ROSMiLanPackage getPackage() {
		return ROSMiLanPackage.eINSTANCE;
	}

} //ROSMiLanFactoryImpl
