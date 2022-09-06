/**
 */
package rosModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rosModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RosModelFactoryImpl extends EFactoryImpl implements RosModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RosModelFactory init() {
		try {
			RosModelFactory theRosModelFactory = (RosModelFactory)EPackage.Registry.INSTANCE.getEFactory(RosModelPackage.eNS_URI);
			if (theRosModelFactory != null) {
				return theRosModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RosModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosModelFactoryImpl() {
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
			case RosModelPackage.ROS_PACKAGE: return createRosPackage();
			case RosModelPackage.TOPIC: return createTopic();
			case RosModelPackage.NODE: return createNode();
			case RosModelPackage.MSG_DATA_STRUCT: return createMsgDataStruct();
			case RosModelPackage.SRV_DATA_STRUCT: return createSrvDataStruct();
			case RosModelPackage.SERVICE: return createService();
			case RosModelPackage.ROS_SYSTEM: return createRosSystem();
			case RosModelPackage.SIMPLE_ATTRIBUTE: return createSimpleAttribute();
			case RosModelPackage.COMPOSED_ATTRIBUTE: return createComposedAttribute();
			case RosModelPackage.ATTRIBUTE_ARRAY: return createAttributeArray();
			case RosModelPackage.CONSTANT: return createConstant();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RosModelPackage.ROS_DATA_TYPE:
				return createRosDataTypeFromString(eDataType, initialValue);
			case RosModelPackage.ROS_VERSION:
				return createRosVersionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RosModelPackage.ROS_DATA_TYPE:
				return convertRosDataTypeToString(eDataType, instanceValue);
			case RosModelPackage.ROS_VERSION:
				return convertRosVersionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosPackage createRosPackage() {
		RosPackageImpl rosPackage = new RosPackageImpl();
		return rosPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic createTopic() {
		TopicImpl topic = new TopicImpl();
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgDataStruct createMsgDataStruct() {
		MsgDataStructImpl msgDataStruct = new MsgDataStructImpl();
		return msgDataStruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvDataStruct createSrvDataStruct() {
		SrvDataStructImpl srvDataStruct = new SrvDataStructImpl();
		return srvDataStruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosSystem createRosSystem() {
		RosSystemImpl rosSystem = new RosSystemImpl();
		return rosSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAttribute createSimpleAttribute() {
		SimpleAttributeImpl simpleAttribute = new SimpleAttributeImpl();
		return simpleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedAttribute createComposedAttribute() {
		ComposedAttributeImpl composedAttribute = new ComposedAttributeImpl();
		return composedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeArray createAttributeArray() {
		AttributeArrayImpl attributeArray = new AttributeArrayImpl();
		return attributeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosDataType createRosDataTypeFromString(EDataType eDataType, String initialValue) {
		RosDataType result = RosDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRosDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosVersion createRosVersionFromString(EDataType eDataType, String initialValue) {
		RosVersion result = RosVersion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRosVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosModelPackage getRosModelPackage() {
		return (RosModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RosModelPackage getPackage() {
		return RosModelPackage.eINSTANCE;
	}

} //RosModelFactoryImpl
