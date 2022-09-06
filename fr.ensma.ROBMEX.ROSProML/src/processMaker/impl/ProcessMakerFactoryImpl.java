/**
 */
package processMaker.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import processMaker.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessMakerFactoryImpl extends EFactoryImpl implements ProcessMakerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessMakerFactory init() {
		try {
			ProcessMakerFactory theProcessMakerFactory = (ProcessMakerFactory)EPackage.Registry.INSTANCE.getEFactory(ProcessMakerPackage.eNS_URI);
			if (theProcessMakerFactory != null) {
				return theProcessMakerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProcessMakerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessMakerFactoryImpl() {
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
			case ProcessMakerPackage.LOOP: return createLoop();
			case ProcessMakerPackage.IF: return createIf();
			case ProcessMakerPackage.COMPARISON: return createComparison();
			case ProcessMakerPackage.NOT: return createNot();
			case ProcessMakerPackage.AND: return createAnd();
			case ProcessMakerPackage.OR: return createOr();
			case ProcessMakerPackage.OPERATION: return createOperation();
			case ProcessMakerPackage.HARDCODED: return createHardcoded();
			case ProcessMakerPackage.BOOLEAN_VARIABLE: return createBooleanVariable();
			case ProcessMakerPackage.SERVICE_BLOCK: return createServiceBlock();
			case ProcessMakerPackage.AFFECT_VARIABLE: return createAffectVariable();
			case ProcessMakerPackage.LOCAL_VARIABLE: return createLocalVariable();
			case ProcessMakerPackage.REQUEST_SERVICE: return createRequestService();
			case ProcessMakerPackage.INTERNAL_BLOCK: return createInternalBlock();
			case ProcessMakerPackage.UPDATE_GLOBAL_VARIABLE: return createUpdateGlobalVariable();
			case ProcessMakerPackage.FUNCTIONALITY: return createFunctionality();
			case ProcessMakerPackage.MAIN_BLOCK: return createMainBlock();
			case ProcessMakerPackage.STRUCT: return createStruct();
			case ProcessMakerPackage.SIMPLE_VARIABLE: return createSimpleVariable();
			case ProcessMakerPackage.DATA_PORT: return createDataPort();
			case ProcessMakerPackage.REFERENCE_VARIABLE: return createReferenceVariable();
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
			case ProcessMakerPackage.ECALCULATIONS:
				return createECalculationsFromString(eDataType, initialValue);
			case ProcessMakerPackage.LOGICAL_COMPARISON:
				return createLogicalComparisonFromString(eDataType, initialValue);
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
			case ProcessMakerPackage.ECALCULATIONS:
				return convertECalculationsToString(eDataType, instanceValue);
			case ProcessMakerPackage.LOGICAL_COMPARISON:
				return convertLogicalComparisonToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparison createComparison() {
		ComparisonImpl comparison = new ComparisonImpl();
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardcoded createHardcoded() {
		HardcodedImpl hardcoded = new HardcodedImpl();
		return hardcoded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable createBooleanVariable() {
		BooleanVariableImpl booleanVariable = new BooleanVariableImpl();
		return booleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBlock createServiceBlock() {
		ServiceBlockImpl serviceBlock = new ServiceBlockImpl();
		return serviceBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffectVariable createAffectVariable() {
		AffectVariableImpl affectVariable = new AffectVariableImpl();
		return affectVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable createLocalVariable() {
		LocalVariableImpl localVariable = new LocalVariableImpl();
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestService createRequestService() {
		RequestServiceImpl requestService = new RequestServiceImpl();
		return requestService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalBlock createInternalBlock() {
		InternalBlockImpl internalBlock = new InternalBlockImpl();
		return internalBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateGlobalVariable createUpdateGlobalVariable() {
		UpdateGlobalVariableImpl updateGlobalVariable = new UpdateGlobalVariableImpl();
		return updateGlobalVariable;
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
	public MainBlock createMainBlock() {
		MainBlockImpl mainBlock = new MainBlockImpl();
		return mainBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct createStruct() {
		StructImpl struct = new StructImpl();
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleVariable createSimpleVariable() {
		SimpleVariableImpl simpleVariable = new SimpleVariableImpl();
		return simpleVariable;
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
	public ReferenceVariable createReferenceVariable() {
		ReferenceVariableImpl referenceVariable = new ReferenceVariableImpl();
		return referenceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECalculations createECalculationsFromString(EDataType eDataType, String initialValue) {
		ECalculations result = ECalculations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECalculationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComparison createLogicalComparisonFromString(EDataType eDataType, String initialValue) {
		LogicalComparison result = LogicalComparison.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalComparisonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessMakerPackage getProcessMakerPackage() {
		return (ProcessMakerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProcessMakerPackage getPackage() {
		return ProcessMakerPackage.eINSTANCE;
	}

} //ProcessMakerFactoryImpl
