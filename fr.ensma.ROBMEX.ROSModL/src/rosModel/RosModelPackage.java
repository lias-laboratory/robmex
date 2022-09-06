/**
 */
package rosModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see rosModel.RosModelFactory
 * @model kind="package"
 * @generated
 */
public interface RosModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rosModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/rosModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rosModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RosModelPackage eINSTANCE = rosModel.impl.RosModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link rosModel.impl.RosPackageImpl <em>Ros Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosModel.impl.RosPackageImpl
	 * @see rosModel.impl.RosModelPackageImpl#getRosPackage()
	 * @generated
	 */
	int ROS_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PACKAGE__NODE = 0;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PACKAGE__TOPIC = 1;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PACKAGE__MSG = 2;

	/**
	 * The feature id for the '<em><b>Srv</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PACKAGE__SRV = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PACKAGE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PACKAGE__SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PACKAGE__PATH = 6;

	/**
	 * The feature id for the '<em><b>Subpackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PACKAGE__SUBPACKAGE = 7;

	/**
	 * The feature id for the '<em><b>Exists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PACKAGE__EXISTS = 8;

	/**
	 * The number of structural features of the '<em>Ros Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PACKAGE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Ros Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rosModel.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosModel.impl.TopicImpl
	 * @see rosModel.impl.RosModelPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 1;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__STRUCT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__NAME = 1;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rosModel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosModel.impl.NodeImpl
	 * @see rosModel.impl.RosModelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>Subscribe To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SUBSCRIBE_TO = 0;

	/**
	 * The feature id for the '<em><b>Publish To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PUBLISH_TO = 1;

	/**
	 * The feature id for the '<em><b>Client Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CLIENT_OF = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FREQUENCY = 4;

	/**
	 * The feature id for the '<em><b>Server Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SERVER_OF = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Code Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CODE_REFERENCE = 7;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rosModel.impl.MsgDataStructImpl <em>Msg Data Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosModel.impl.MsgDataStructImpl
	 * @see rosModel.impl.RosModelPackageImpl#getMsgDataStruct()
	 * @generated
	 */
	int MSG_DATA_STRUCT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_DATA_STRUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_DATA_STRUCT__ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Msg Data Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_DATA_STRUCT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Msg Data Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_DATA_STRUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rosModel.impl.SrvDataStructImpl <em>Srv Data Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosModel.impl.SrvDataStructImpl
	 * @see rosModel.impl.RosModelPackageImpl#getSrvDataStruct()
	 * @generated
	 */
	int SRV_DATA_STRUCT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_DATA_STRUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Request Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_DATA_STRUCT__REQUEST_ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Response Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_DATA_STRUCT__RESPONSE_ATTRIBUTES = 2;

	/**
	 * The number of structural features of the '<em>Srv Data Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_DATA_STRUCT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Srv Data Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_DATA_STRUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rosModel.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosModel.impl.ServiceImpl
	 * @see rosModel.impl.RosModelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Srvdatastruct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SRVDATASTRUCT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rosModel.impl.RosSystemImpl <em>Ros System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosModel.impl.RosSystemImpl
	 * @see rosModel.impl.RosModelPackageImpl#getRosSystem()
	 * @generated
	 */
	int ROS_SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Rospackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__ROSPACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Ros System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ros System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rosModel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosModel.impl.AttributeImpl
	 * @see rosModel.impl.RosModelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rosModel.impl.SimpleAttributeImpl <em>Simple Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosModel.impl.SimpleAttributeImpl
	 * @see rosModel.impl.RosModelPackageImpl#getSimpleAttribute()
	 * @generated
	 */
	int SIMPLE_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE__TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rosModel.impl.ComposedAttributeImpl <em>Composed Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosModel.impl.ComposedAttributeImpl
	 * @see rosModel.impl.RosModelPackageImpl#getComposedAttribute()
	 * @generated
	 */
	int COMPOSED_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ATTRIBUTE__TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composed Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composed Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rosModel.impl.AttributeArrayImpl <em>Attribute Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosModel.impl.AttributeArrayImpl
	 * @see rosModel.impl.RosModelPackageImpl#getAttributeArray()
	 * @generated
	 */
	int ATTRIBUTE_ARRAY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ARRAY__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ARRAY__SIZE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ARRAY__TYPE = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ARRAY_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ARRAY_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rosModel.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosModel.impl.ConstantImpl
	 * @see rosModel.impl.RosModelPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAME = SIMPLE_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__TYPE = SIMPLE_ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = SIMPLE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = SIMPLE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = SIMPLE_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rosModel.RosDataType <em>Ros Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosModel.RosDataType
	 * @see rosModel.impl.RosModelPackageImpl#getRosDataType()
	 * @generated
	 */
	int ROS_DATA_TYPE = 12;

	/**
	 * The meta object id for the '{@link rosModel.RosVersion <em>Ros Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rosModel.RosVersion
	 * @see rosModel.impl.RosModelPackageImpl#getRosVersion()
	 * @generated
	 */
	int ROS_VERSION = 13;


	/**
	 * Returns the meta object for class '{@link rosModel.RosPackage <em>Ros Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Package</em>'.
	 * @see rosModel.RosPackage
	 * @generated
	 */
	EClass getRosPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link rosModel.RosPackage#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see rosModel.RosPackage#getNode()
	 * @see #getRosPackage()
	 * @generated
	 */
	EReference getRosPackage_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link rosModel.RosPackage#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topic</em>'.
	 * @see rosModel.RosPackage#getTopic()
	 * @see #getRosPackage()
	 * @generated
	 */
	EReference getRosPackage_Topic();

	/**
	 * Returns the meta object for the containment reference list '{@link rosModel.RosPackage#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Msg</em>'.
	 * @see rosModel.RosPackage#getMsg()
	 * @see #getRosPackage()
	 * @generated
	 */
	EReference getRosPackage_Msg();

	/**
	 * Returns the meta object for the containment reference list '{@link rosModel.RosPackage#getSrv <em>Srv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Srv</em>'.
	 * @see rosModel.RosPackage#getSrv()
	 * @see #getRosPackage()
	 * @generated
	 */
	EReference getRosPackage_Srv();

	/**
	 * Returns the meta object for the attribute '{@link rosModel.RosPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rosModel.RosPackage#getName()
	 * @see #getRosPackage()
	 * @generated
	 */
	EAttribute getRosPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link rosModel.RosPackage#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see rosModel.RosPackage#getService()
	 * @see #getRosPackage()
	 * @generated
	 */
	EReference getRosPackage_Service();

	/**
	 * Returns the meta object for the attribute '{@link rosModel.RosPackage#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see rosModel.RosPackage#getPath()
	 * @see #getRosPackage()
	 * @generated
	 */
	EAttribute getRosPackage_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link rosModel.RosPackage#getSubpackage <em>Subpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subpackage</em>'.
	 * @see rosModel.RosPackage#getSubpackage()
	 * @see #getRosPackage()
	 * @generated
	 */
	EReference getRosPackage_Subpackage();

	/**
	 * Returns the meta object for the attribute '{@link rosModel.RosPackage#isExists <em>Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exists</em>'.
	 * @see rosModel.RosPackage#isExists()
	 * @see #getRosPackage()
	 * @generated
	 */
	EAttribute getRosPackage_Exists();

	/**
	 * Returns the meta object for class '{@link rosModel.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see rosModel.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the reference '{@link rosModel.Topic#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Struct</em>'.
	 * @see rosModel.Topic#getStruct()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_Struct();

	/**
	 * Returns the meta object for the attribute '{@link rosModel.Topic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rosModel.Topic#getName()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Name();

	/**
	 * Returns the meta object for class '{@link rosModel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see rosModel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link rosModel.Node#getSubscribeTo <em>Subscribe To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscribe To</em>'.
	 * @see rosModel.Node#getSubscribeTo()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_SubscribeTo();

	/**
	 * Returns the meta object for the reference list '{@link rosModel.Node#getPublishTo <em>Publish To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Publish To</em>'.
	 * @see rosModel.Node#getPublishTo()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_PublishTo();

	/**
	 * Returns the meta object for the reference list '{@link rosModel.Node#getClientOf <em>Client Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Client Of</em>'.
	 * @see rosModel.Node#getClientOf()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ClientOf();

	/**
	 * Returns the meta object for the attribute '{@link rosModel.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rosModel.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link rosModel.Node#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see rosModel.Node#getFrequency()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Frequency();

	/**
	 * Returns the meta object for the reference list '{@link rosModel.Node#getServerOf <em>Server Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Server Of</em>'.
	 * @see rosModel.Node#getServerOf()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ServerOf();

	/**
	 * Returns the meta object for the attribute '{@link rosModel.Node#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rosModel.Node#getDescription()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Description();

	/**
	 * Returns the meta object for the attribute '{@link rosModel.Node#getCodeReference <em>Code Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Reference</em>'.
	 * @see rosModel.Node#getCodeReference()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_CodeReference();

	/**
	 * Returns the meta object for class '{@link rosModel.MsgDataStruct <em>Msg Data Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Msg Data Struct</em>'.
	 * @see rosModel.MsgDataStruct
	 * @generated
	 */
	EClass getMsgDataStruct();

	/**
	 * Returns the meta object for the attribute '{@link rosModel.MsgDataStruct#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rosModel.MsgDataStruct#getName()
	 * @see #getMsgDataStruct()
	 * @generated
	 */
	EAttribute getMsgDataStruct_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link rosModel.MsgDataStruct#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see rosModel.MsgDataStruct#getAttribute()
	 * @see #getMsgDataStruct()
	 * @generated
	 */
	EReference getMsgDataStruct_Attribute();

	/**
	 * Returns the meta object for class '{@link rosModel.SrvDataStruct <em>Srv Data Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Srv Data Struct</em>'.
	 * @see rosModel.SrvDataStruct
	 * @generated
	 */
	EClass getSrvDataStruct();

	/**
	 * Returns the meta object for the attribute '{@link rosModel.SrvDataStruct#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rosModel.SrvDataStruct#getName()
	 * @see #getSrvDataStruct()
	 * @generated
	 */
	EAttribute getSrvDataStruct_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link rosModel.SrvDataStruct#getRequestAttributes <em>Request Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request Attributes</em>'.
	 * @see rosModel.SrvDataStruct#getRequestAttributes()
	 * @see #getSrvDataStruct()
	 * @generated
	 */
	EReference getSrvDataStruct_RequestAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link rosModel.SrvDataStruct#getResponseAttributes <em>Response Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response Attributes</em>'.
	 * @see rosModel.SrvDataStruct#getResponseAttributes()
	 * @see #getSrvDataStruct()
	 * @generated
	 */
	EReference getSrvDataStruct_ResponseAttributes();

	/**
	 * Returns the meta object for class '{@link rosModel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see rosModel.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link rosModel.Service#getSrvdatastruct <em>Srvdatastruct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Srvdatastruct</em>'.
	 * @see rosModel.Service#getSrvdatastruct()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Srvdatastruct();

	/**
	 * Returns the meta object for the attribute '{@link rosModel.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rosModel.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for class '{@link rosModel.RosSystem <em>Ros System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros System</em>'.
	 * @see rosModel.RosSystem
	 * @generated
	 */
	EClass getRosSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link rosModel.RosSystem#getRospackage <em>Rospackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rospackage</em>'.
	 * @see rosModel.RosSystem#getRospackage()
	 * @see #getRosSystem()
	 * @generated
	 */
	EReference getRosSystem_Rospackage();

	/**
	 * Returns the meta object for the attribute '{@link rosModel.RosSystem#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see rosModel.RosSystem#getVersion()
	 * @see #getRosSystem()
	 * @generated
	 */
	EAttribute getRosSystem_Version();

	/**
	 * Returns the meta object for class '{@link rosModel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see rosModel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link rosModel.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rosModel.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for class '{@link rosModel.SimpleAttribute <em>Simple Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Attribute</em>'.
	 * @see rosModel.SimpleAttribute
	 * @generated
	 */
	EClass getSimpleAttribute();

	/**
	 * Returns the meta object for the attribute '{@link rosModel.SimpleAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rosModel.SimpleAttribute#getType()
	 * @see #getSimpleAttribute()
	 * @generated
	 */
	EAttribute getSimpleAttribute_Type();

	/**
	 * Returns the meta object for class '{@link rosModel.ComposedAttribute <em>Composed Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Attribute</em>'.
	 * @see rosModel.ComposedAttribute
	 * @generated
	 */
	EClass getComposedAttribute();

	/**
	 * Returns the meta object for the reference '{@link rosModel.ComposedAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see rosModel.ComposedAttribute#getType()
	 * @see #getComposedAttribute()
	 * @generated
	 */
	EReference getComposedAttribute_Type();

	/**
	 * Returns the meta object for class '{@link rosModel.AttributeArray <em>Attribute Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Array</em>'.
	 * @see rosModel.AttributeArray
	 * @generated
	 */
	EClass getAttributeArray();

	/**
	 * Returns the meta object for the attribute '{@link rosModel.AttributeArray#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see rosModel.AttributeArray#getSize()
	 * @see #getAttributeArray()
	 * @generated
	 */
	EAttribute getAttributeArray_Size();

	/**
	 * Returns the meta object for the containment reference '{@link rosModel.AttributeArray#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see rosModel.AttributeArray#getType()
	 * @see #getAttributeArray()
	 * @generated
	 */
	EReference getAttributeArray_Type();

	/**
	 * Returns the meta object for class '{@link rosModel.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see rosModel.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link rosModel.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see rosModel.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Value();

	/**
	 * Returns the meta object for enum '{@link rosModel.RosDataType <em>Ros Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ros Data Type</em>'.
	 * @see rosModel.RosDataType
	 * @generated
	 */
	EEnum getRosDataType();

	/**
	 * Returns the meta object for enum '{@link rosModel.RosVersion <em>Ros Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ros Version</em>'.
	 * @see rosModel.RosVersion
	 * @generated
	 */
	EEnum getRosVersion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RosModelFactory getRosModelFactory();

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
		 * The meta object literal for the '{@link rosModel.impl.RosPackageImpl <em>Ros Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosModel.impl.RosPackageImpl
		 * @see rosModel.impl.RosModelPackageImpl#getRosPackage()
		 * @generated
		 */
		EClass ROS_PACKAGE = eINSTANCE.getRosPackage();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_PACKAGE__NODE = eINSTANCE.getRosPackage_Node();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_PACKAGE__TOPIC = eINSTANCE.getRosPackage_Topic();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_PACKAGE__MSG = eINSTANCE.getRosPackage_Msg();

		/**
		 * The meta object literal for the '<em><b>Srv</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_PACKAGE__SRV = eINSTANCE.getRosPackage_Srv();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_PACKAGE__NAME = eINSTANCE.getRosPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_PACKAGE__SERVICE = eINSTANCE.getRosPackage_Service();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_PACKAGE__PATH = eINSTANCE.getRosPackage_Path();

		/**
		 * The meta object literal for the '<em><b>Subpackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_PACKAGE__SUBPACKAGE = eINSTANCE.getRosPackage_Subpackage();

		/**
		 * The meta object literal for the '<em><b>Exists</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_PACKAGE__EXISTS = eINSTANCE.getRosPackage_Exists();

		/**
		 * The meta object literal for the '{@link rosModel.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosModel.impl.TopicImpl
		 * @see rosModel.impl.RosModelPackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__STRUCT = eINSTANCE.getTopic_Struct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__NAME = eINSTANCE.getTopic_Name();

		/**
		 * The meta object literal for the '{@link rosModel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosModel.impl.NodeImpl
		 * @see rosModel.impl.RosModelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Subscribe To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SUBSCRIBE_TO = eINSTANCE.getNode_SubscribeTo();

		/**
		 * The meta object literal for the '<em><b>Publish To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PUBLISH_TO = eINSTANCE.getNode_PublishTo();

		/**
		 * The meta object literal for the '<em><b>Client Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CLIENT_OF = eINSTANCE.getNode_ClientOf();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__FREQUENCY = eINSTANCE.getNode_Frequency();

		/**
		 * The meta object literal for the '<em><b>Server Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SERVER_OF = eINSTANCE.getNode_ServerOf();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__DESCRIPTION = eINSTANCE.getNode_Description();

		/**
		 * The meta object literal for the '<em><b>Code Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__CODE_REFERENCE = eINSTANCE.getNode_CodeReference();

		/**
		 * The meta object literal for the '{@link rosModel.impl.MsgDataStructImpl <em>Msg Data Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosModel.impl.MsgDataStructImpl
		 * @see rosModel.impl.RosModelPackageImpl#getMsgDataStruct()
		 * @generated
		 */
		EClass MSG_DATA_STRUCT = eINSTANCE.getMsgDataStruct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG_DATA_STRUCT__NAME = eINSTANCE.getMsgDataStruct_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSG_DATA_STRUCT__ATTRIBUTE = eINSTANCE.getMsgDataStruct_Attribute();

		/**
		 * The meta object literal for the '{@link rosModel.impl.SrvDataStructImpl <em>Srv Data Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosModel.impl.SrvDataStructImpl
		 * @see rosModel.impl.RosModelPackageImpl#getSrvDataStruct()
		 * @generated
		 */
		EClass SRV_DATA_STRUCT = eINSTANCE.getSrvDataStruct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRV_DATA_STRUCT__NAME = eINSTANCE.getSrvDataStruct_Name();

		/**
		 * The meta object literal for the '<em><b>Request Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRV_DATA_STRUCT__REQUEST_ATTRIBUTES = eINSTANCE.getSrvDataStruct_RequestAttributes();

		/**
		 * The meta object literal for the '<em><b>Response Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRV_DATA_STRUCT__RESPONSE_ATTRIBUTES = eINSTANCE.getSrvDataStruct_ResponseAttributes();

		/**
		 * The meta object literal for the '{@link rosModel.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosModel.impl.ServiceImpl
		 * @see rosModel.impl.RosModelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Srvdatastruct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SRVDATASTRUCT = eINSTANCE.getService_Srvdatastruct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '{@link rosModel.impl.RosSystemImpl <em>Ros System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosModel.impl.RosSystemImpl
		 * @see rosModel.impl.RosModelPackageImpl#getRosSystem()
		 * @generated
		 */
		EClass ROS_SYSTEM = eINSTANCE.getRosSystem();

		/**
		 * The meta object literal for the '<em><b>Rospackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_SYSTEM__ROSPACKAGE = eINSTANCE.getRosSystem_Rospackage();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SYSTEM__VERSION = eINSTANCE.getRosSystem_Version();

		/**
		 * The meta object literal for the '{@link rosModel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosModel.impl.AttributeImpl
		 * @see rosModel.impl.RosModelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '{@link rosModel.impl.SimpleAttributeImpl <em>Simple Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosModel.impl.SimpleAttributeImpl
		 * @see rosModel.impl.RosModelPackageImpl#getSimpleAttribute()
		 * @generated
		 */
		EClass SIMPLE_ATTRIBUTE = eINSTANCE.getSimpleAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_ATTRIBUTE__TYPE = eINSTANCE.getSimpleAttribute_Type();

		/**
		 * The meta object literal for the '{@link rosModel.impl.ComposedAttributeImpl <em>Composed Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosModel.impl.ComposedAttributeImpl
		 * @see rosModel.impl.RosModelPackageImpl#getComposedAttribute()
		 * @generated
		 */
		EClass COMPOSED_ATTRIBUTE = eINSTANCE.getComposedAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_ATTRIBUTE__TYPE = eINSTANCE.getComposedAttribute_Type();

		/**
		 * The meta object literal for the '{@link rosModel.impl.AttributeArrayImpl <em>Attribute Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosModel.impl.AttributeArrayImpl
		 * @see rosModel.impl.RosModelPackageImpl#getAttributeArray()
		 * @generated
		 */
		EClass ATTRIBUTE_ARRAY = eINSTANCE.getAttributeArray();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_ARRAY__SIZE = eINSTANCE.getAttributeArray_Size();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ARRAY__TYPE = eINSTANCE.getAttributeArray_Type();

		/**
		 * The meta object literal for the '{@link rosModel.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosModel.impl.ConstantImpl
		 * @see rosModel.impl.RosModelPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '{@link rosModel.RosDataType <em>Ros Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosModel.RosDataType
		 * @see rosModel.impl.RosModelPackageImpl#getRosDataType()
		 * @generated
		 */
		EEnum ROS_DATA_TYPE = eINSTANCE.getRosDataType();

		/**
		 * The meta object literal for the '{@link rosModel.RosVersion <em>Ros Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rosModel.RosVersion
		 * @see rosModel.impl.RosModelPackageImpl#getRosVersion()
		 * @generated
		 */
		EEnum ROS_VERSION = eINSTANCE.getRosVersion();

	}

} //RosModelPackage
