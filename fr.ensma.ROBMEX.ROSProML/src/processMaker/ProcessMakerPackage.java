/**
 */
package processMaker;

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
 * @see processMaker.ProcessMakerFactory
 * @model kind="package"
 * @generated
 */
public interface ProcessMakerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "processMaker";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/processMaker";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "processMaker";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessMakerPackage eINSTANCE = processMaker.impl.ProcessMakerPackageImpl.init();

	/**
	 * The meta object id for the '{@link processMaker.impl.InstructionsImpl <em>Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.InstructionsImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getInstructions()
	 * @generated
	 */
	int INSTRUCTIONS = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS__NEXT = 0;

	/**
	 * The number of structural features of the '<em>Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.LoopImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__NEXT = INSTRUCTIONS__NEXT;

	/**
	 * The feature id for the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__WHILE = INSTRUCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__LOOP = INSTRUCTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = INSTRUCTIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = INSTRUCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.IfImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getIf()
	 * @generated
	 */
	int IF = 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__NEXT = INSTRUCTIONS__NEXT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = INSTRUCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__IF_BLOCK = INSTRUCTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE_BLOCK = INSTRUCTIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = INSTRUCTIONS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = INSTRUCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.BooleanExpressionImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.CompositionImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 4;

	/**
	 * The feature id for the '<em><b>Booleanexpression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__BOOLEANEXPRESSION = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.ComparisonImpl <em>Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.ComparisonImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 5;

	/**
	 * The feature id for the '<em><b>First Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__FIRST_TERM = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__SECOND_TERM = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__DESCRIPTION = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__TYPE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.NotImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 6;

	/**
	 * The feature id for the '<em><b>Booleanexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__BOOLEANEXPRESSION = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.AndImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 7;

	/**
	 * The feature id for the '<em><b>Booleanexpression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__BOOLEANEXPRESSION = COMPOSITION__BOOLEANEXPRESSION;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = COMPOSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = COMPOSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.OrImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getOr()
	 * @generated
	 */
	int OR = 8;

	/**
	 * The feature id for the '<em><b>Booleanexpression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__BOOLEANEXPRESSION = COMPOSITION__BOOLEANEXPRESSION;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = COMPOSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = COMPOSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.TwoTermsOperationImpl <em>Two Terms Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.TwoTermsOperationImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getTwoTermsOperation()
	 * @generated
	 */
	int TWO_TERMS_OPERATION = 19;

	/**
	 * The feature id for the '<em><b>First Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_TERMS_OPERATION__FIRST_TERM = 0;

	/**
	 * The feature id for the '<em><b>Second Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_TERMS_OPERATION__SECOND_TERM = 1;

	/**
	 * The number of structural features of the '<em>Two Terms Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_TERMS_OPERATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Two Terms Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_TERMS_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.OperationImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 9;

	/**
	 * The feature id for the '<em><b>First Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__FIRST_TERM = TWO_TERMS_OPERATION__FIRST_TERM;

	/**
	 * The feature id for the '<em><b>Second Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SECOND_TERM = TWO_TERMS_OPERATION__SECOND_TERM;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NEXT = TWO_TERMS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE = TWO_TERMS_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = TWO_TERMS_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = TWO_TERMS_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.CodeBlockImpl <em>Code Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.CodeBlockImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getCodeBlock()
	 * @generated
	 */
	int CODE_BLOCK = 10;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__INSTRUCTIONS = 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__FIRST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__NAME = 2;

	/**
	 * The feature id for the '<em><b>Internal Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__INTERNAL_VARIABLE = 3;

	/**
	 * The number of structural features of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.HardcodedImpl <em>Hardcoded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.HardcodedImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getHardcoded()
	 * @generated
	 */
	int HARDCODED = 11;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDCODED__NEXT = INSTRUCTIONS__NEXT;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDCODED__INSTRUCTION = INSTRUCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardcoded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDCODED_FEATURE_COUNT = INSTRUCTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hardcoded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDCODED_OPERATION_COUNT = INSTRUCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.BooleanVariableImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getBooleanVariable()
	 * @generated
	 */
	int BOOLEAN_VARIABLE = 12;

	/**
	 * The number of structural features of the '<em>Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.ServiceBlockImpl <em>Service Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.ServiceBlockImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getServiceBlock()
	 * @generated
	 */
	int SERVICE_BLOCK = 13;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLOCK__INSTRUCTIONS = CODE_BLOCK__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLOCK__FIRST = CODE_BLOCK__FIRST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLOCK__NAME = CODE_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Internal Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLOCK__INTERNAL_VARIABLE = CODE_BLOCK__INTERNAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLOCK__REQUEST = CODE_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLOCK__RESPONSE = CODE_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLOCK_FEATURE_COUNT = CODE_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BLOCK_OPERATION_COUNT = CODE_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.VariableImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 14;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.AffectVariableImpl <em>Affect Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.AffectVariableImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getAffectVariable()
	 * @generated
	 */
	int AFFECT_VARIABLE = 15;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_VARIABLE__NEXT = INSTRUCTIONS__NEXT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_VARIABLE__VARIABLE = INSTRUCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_VARIABLE__VALUE_OF = INSTRUCTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constant Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_VARIABLE__CONSTANT_VALUE = INSTRUCTIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Affect Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_VARIABLE_FEATURE_COUNT = INSTRUCTIONS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Affect Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_VARIABLE_OPERATION_COUNT = INSTRUCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.LocalVariableImpl <em>Local Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.LocalVariableImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getLocalVariable()
	 * @generated
	 */
	int LOCAL_VARIABLE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__NAME = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constant Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__CONSTANT_VALUE = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.RequestServiceImpl <em>Request Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.RequestServiceImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getRequestService()
	 * @generated
	 */
	int REQUEST_SERVICE = 17;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SERVICE__NEXT = INSTRUCTIONS__NEXT;

	/**
	 * The number of structural features of the '<em>Request Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SERVICE_FEATURE_COUNT = INSTRUCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Request Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_SERVICE_OPERATION_COUNT = INSTRUCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.InternalBlockImpl <em>Internal Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.InternalBlockImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getInternalBlock()
	 * @generated
	 */
	int INTERNAL_BLOCK = 18;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BLOCK__INSTRUCTIONS = CODE_BLOCK__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BLOCK__FIRST = CODE_BLOCK__FIRST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BLOCK__NAME = CODE_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Internal Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BLOCK__INTERNAL_VARIABLE = CODE_BLOCK__INTERNAL_VARIABLE;

	/**
	 * The number of structural features of the '<em>Internal Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BLOCK_FEATURE_COUNT = CODE_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_BLOCK_OPERATION_COUNT = CODE_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.UpdateGlobalVariableImpl <em>Update Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.UpdateGlobalVariableImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getUpdateGlobalVariable()
	 * @generated
	 */
	int UPDATE_GLOBAL_VARIABLE = 20;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_GLOBAL_VARIABLE__NEXT = INSTRUCTIONS__NEXT;

	/**
	 * The feature id for the '<em><b>Dataport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_GLOBAL_VARIABLE__DATAPORT = INSTRUCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_GLOBAL_VARIABLE_FEATURE_COUNT = INSTRUCTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_GLOBAL_VARIABLE_OPERATION_COUNT = INSTRUCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.FunctionalityImpl <em>Functionality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.FunctionalityImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getFunctionality()
	 * @generated
	 */
	int FUNCTIONALITY = 21;

	/**
	 * The feature id for the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__MAIN = 0;

	/**
	 * The feature id for the '<em><b>Serviceblock</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__SERVICEBLOCK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__INPUTS = 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__OUTPUTS = 4;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__FREQUENCY = 5;

	/**
	 * The number of structural features of the '<em>Functionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Functionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.MainBlockImpl <em>Main Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.MainBlockImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getMainBlock()
	 * @generated
	 */
	int MAIN_BLOCK = 22;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BLOCK__INSTRUCTIONS = CODE_BLOCK__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BLOCK__FIRST = CODE_BLOCK__FIRST;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BLOCK__NAME = CODE_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Internal Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BLOCK__INTERNAL_VARIABLE = CODE_BLOCK__INTERNAL_VARIABLE;

	/**
	 * The number of structural features of the '<em>Main Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BLOCK_FEATURE_COUNT = CODE_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Main Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_BLOCK_OPERATION_COUNT = CODE_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.GlobalVariableImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getGlobalVariable()
	 * @generated
	 */
	int GLOBAL_VARIABLE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__NAME = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.StructImpl <em>Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.StructImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getStruct()
	 * @generated
	 */
	int STRUCT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__NAME = GLOBAL_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__MEMBERS = GLOBAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FEATURE_COUNT = GLOBAL_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_OPERATION_COUNT = GLOBAL_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.SimpleVariableImpl <em>Simple Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.SimpleVariableImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getSimpleVariable()
	 * @generated
	 */
	int SIMPLE_VARIABLE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VARIABLE__NAME = GLOBAL_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VARIABLE__TYPE = GLOBAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VARIABLE_FEATURE_COUNT = GLOBAL_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VARIABLE_OPERATION_COUNT = GLOBAL_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.DataPortImpl <em>Data Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.DataPortImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getDataPort()
	 * @generated
	 */
	int DATA_PORT = 25;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.OperationTermImpl <em>Operation Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.OperationTermImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getOperationTerm()
	 * @generated
	 */
	int OPERATION_TERM = 27;

	/**
	 * The number of structural features of the '<em>Operation Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TERM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operation Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link processMaker.impl.ReferenceVariableImpl <em>Reference Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.impl.ReferenceVariableImpl
	 * @see processMaker.impl.ProcessMakerPackageImpl#getReferenceVariable()
	 * @generated
	 */
	int REFERENCE_VARIABLE = 28;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VARIABLE__VARIABLE = OPERATION_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VARIABLE_FEATURE_COUNT = OPERATION_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VARIABLE_OPERATION_COUNT = OPERATION_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link processMaker.ECalculations <em>ECalculations</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.ECalculations
	 * @see processMaker.impl.ProcessMakerPackageImpl#getECalculations()
	 * @generated
	 */
	int ECALCULATIONS = 29;

	/**
	 * The meta object id for the '{@link processMaker.LogicalComparison <em>Logical Comparison</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see processMaker.LogicalComparison
	 * @see processMaker.impl.ProcessMakerPackageImpl#getLogicalComparison()
	 * @generated
	 */
	int LOGICAL_COMPARISON = 30;


	/**
	 * Returns the meta object for class '{@link processMaker.Instructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instructions</em>'.
	 * @see processMaker.Instructions
	 * @generated
	 */
	EClass getInstructions();

	/**
	 * Returns the meta object for the reference '{@link processMaker.Instructions#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see processMaker.Instructions#getNext()
	 * @see #getInstructions()
	 * @generated
	 */
	EReference getInstructions_Next();

	/**
	 * Returns the meta object for class '{@link processMaker.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see processMaker.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference '{@link processMaker.Loop#getWhile <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While</em>'.
	 * @see processMaker.Loop#getWhile()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_While();

	/**
	 * Returns the meta object for the containment reference '{@link processMaker.Loop#getLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop</em>'.
	 * @see processMaker.Loop#getLoop()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Loop();

	/**
	 * Returns the meta object for class '{@link processMaker.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see processMaker.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link processMaker.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see processMaker.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link processMaker.If#getIfBlock <em>If Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Block</em>'.
	 * @see processMaker.If#getIfBlock()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_IfBlock();

	/**
	 * Returns the meta object for the containment reference '{@link processMaker.If#getElseBlock <em>Else Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Block</em>'.
	 * @see processMaker.If#getElseBlock()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ElseBlock();

	/**
	 * Returns the meta object for class '{@link processMaker.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see processMaker.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for class '{@link processMaker.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see processMaker.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the containment reference list '{@link processMaker.Composition#getBooleanexpression <em>Booleanexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Booleanexpression</em>'.
	 * @see processMaker.Composition#getBooleanexpression()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Booleanexpression();

	/**
	 * Returns the meta object for class '{@link processMaker.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison</em>'.
	 * @see processMaker.Comparison
	 * @generated
	 */
	EClass getComparison();

	/**
	 * Returns the meta object for the attribute '{@link processMaker.Comparison#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see processMaker.Comparison#getDescription()
	 * @see #getComparison()
	 * @generated
	 */
	EAttribute getComparison_Description();

	/**
	 * Returns the meta object for the attribute '{@link processMaker.Comparison#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see processMaker.Comparison#getType()
	 * @see #getComparison()
	 * @generated
	 */
	EAttribute getComparison_Type();

	/**
	 * Returns the meta object for class '{@link processMaker.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see processMaker.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link processMaker.Not#getBooleanexpression <em>Booleanexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Booleanexpression</em>'.
	 * @see processMaker.Not#getBooleanexpression()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Booleanexpression();

	/**
	 * Returns the meta object for class '{@link processMaker.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see processMaker.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link processMaker.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see processMaker.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link processMaker.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see processMaker.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link processMaker.Operation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see processMaker.Operation#getType()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Type();

	/**
	 * Returns the meta object for class '{@link processMaker.CodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Block</em>'.
	 * @see processMaker.CodeBlock
	 * @generated
	 */
	EClass getCodeBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link processMaker.CodeBlock#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see processMaker.CodeBlock#getInstructions()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EReference getCodeBlock_Instructions();

	/**
	 * Returns the meta object for the reference '{@link processMaker.CodeBlock#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see processMaker.CodeBlock#getFirst()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EReference getCodeBlock_First();

	/**
	 * Returns the meta object for the attribute '{@link processMaker.CodeBlock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see processMaker.CodeBlock#getName()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EAttribute getCodeBlock_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link processMaker.CodeBlock#getInternalVariable <em>Internal Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Variable</em>'.
	 * @see processMaker.CodeBlock#getInternalVariable()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EReference getCodeBlock_InternalVariable();

	/**
	 * Returns the meta object for class '{@link processMaker.Hardcoded <em>Hardcoded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardcoded</em>'.
	 * @see processMaker.Hardcoded
	 * @generated
	 */
	EClass getHardcoded();

	/**
	 * Returns the meta object for the attribute '{@link processMaker.Hardcoded#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instruction</em>'.
	 * @see processMaker.Hardcoded#getInstruction()
	 * @see #getHardcoded()
	 * @generated
	 */
	EAttribute getHardcoded_Instruction();

	/**
	 * Returns the meta object for class '{@link processMaker.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable</em>'.
	 * @see processMaker.BooleanVariable
	 * @generated
	 */
	EClass getBooleanVariable();

	/**
	 * Returns the meta object for class '{@link processMaker.ServiceBlock <em>Service Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Block</em>'.
	 * @see processMaker.ServiceBlock
	 * @generated
	 */
	EClass getServiceBlock();

	/**
	 * Returns the meta object for the containment reference '{@link processMaker.ServiceBlock#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see processMaker.ServiceBlock#getRequest()
	 * @see #getServiceBlock()
	 * @generated
	 */
	EReference getServiceBlock_Request();

	/**
	 * Returns the meta object for the containment reference '{@link processMaker.ServiceBlock#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response</em>'.
	 * @see processMaker.ServiceBlock#getResponse()
	 * @see #getServiceBlock()
	 * @generated
	 */
	EReference getServiceBlock_Response();

	/**
	 * Returns the meta object for class '{@link processMaker.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see processMaker.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '{@link processMaker.AffectVariable <em>Affect Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affect Variable</em>'.
	 * @see processMaker.AffectVariable
	 * @generated
	 */
	EClass getAffectVariable();

	/**
	 * Returns the meta object for the reference '{@link processMaker.AffectVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see processMaker.AffectVariable#getVariable()
	 * @see #getAffectVariable()
	 * @generated
	 */
	EReference getAffectVariable_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link processMaker.AffectVariable#getValueOf <em>Value Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Of</em>'.
	 * @see processMaker.AffectVariable#getValueOf()
	 * @see #getAffectVariable()
	 * @generated
	 */
	EReference getAffectVariable_ValueOf();

	/**
	 * Returns the meta object for the attribute '{@link processMaker.AffectVariable#getConstantValue <em>Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant Value</em>'.
	 * @see processMaker.AffectVariable#getConstantValue()
	 * @see #getAffectVariable()
	 * @generated
	 */
	EAttribute getAffectVariable_ConstantValue();

	/**
	 * Returns the meta object for class '{@link processMaker.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variable</em>'.
	 * @see processMaker.LocalVariable
	 * @generated
	 */
	EClass getLocalVariable();

	/**
	 * Returns the meta object for the attribute '{@link processMaker.LocalVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see processMaker.LocalVariable#getName()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EAttribute getLocalVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link processMaker.LocalVariable#getConstantValue <em>Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant Value</em>'.
	 * @see processMaker.LocalVariable#getConstantValue()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EAttribute getLocalVariable_ConstantValue();

	/**
	 * Returns the meta object for class '{@link processMaker.RequestService <em>Request Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Service</em>'.
	 * @see processMaker.RequestService
	 * @generated
	 */
	EClass getRequestService();

	/**
	 * Returns the meta object for class '{@link processMaker.InternalBlock <em>Internal Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Block</em>'.
	 * @see processMaker.InternalBlock
	 * @generated
	 */
	EClass getInternalBlock();

	/**
	 * Returns the meta object for class '{@link processMaker.TwoTermsOperation <em>Two Terms Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two Terms Operation</em>'.
	 * @see processMaker.TwoTermsOperation
	 * @generated
	 */
	EClass getTwoTermsOperation();

	/**
	 * Returns the meta object for the containment reference '{@link processMaker.TwoTermsOperation#getFirstTerm <em>First Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Term</em>'.
	 * @see processMaker.TwoTermsOperation#getFirstTerm()
	 * @see #getTwoTermsOperation()
	 * @generated
	 */
	EReference getTwoTermsOperation_FirstTerm();

	/**
	 * Returns the meta object for the containment reference '{@link processMaker.TwoTermsOperation#getSecondTerm <em>Second Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second Term</em>'.
	 * @see processMaker.TwoTermsOperation#getSecondTerm()
	 * @see #getTwoTermsOperation()
	 * @generated
	 */
	EReference getTwoTermsOperation_SecondTerm();

	/**
	 * Returns the meta object for class '{@link processMaker.UpdateGlobalVariable <em>Update Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Global Variable</em>'.
	 * @see processMaker.UpdateGlobalVariable
	 * @generated
	 */
	EClass getUpdateGlobalVariable();

	/**
	 * Returns the meta object for the reference '{@link processMaker.UpdateGlobalVariable#getDataport <em>Dataport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dataport</em>'.
	 * @see processMaker.UpdateGlobalVariable#getDataport()
	 * @see #getUpdateGlobalVariable()
	 * @generated
	 */
	EReference getUpdateGlobalVariable_Dataport();

	/**
	 * Returns the meta object for class '{@link processMaker.Functionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functionality</em>'.
	 * @see processMaker.Functionality
	 * @generated
	 */
	EClass getFunctionality();

	/**
	 * Returns the meta object for the containment reference '{@link processMaker.Functionality#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main</em>'.
	 * @see processMaker.Functionality#getMain()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Main();

	/**
	 * Returns the meta object for the containment reference list '{@link processMaker.Functionality#getServiceblock <em>Serviceblock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serviceblock</em>'.
	 * @see processMaker.Functionality#getServiceblock()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Serviceblock();

	/**
	 * Returns the meta object for the attribute '{@link processMaker.Functionality#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see processMaker.Functionality#getName()
	 * @see #getFunctionality()
	 * @generated
	 */
	EAttribute getFunctionality_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link processMaker.Functionality#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see processMaker.Functionality#getInputs()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link processMaker.Functionality#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see processMaker.Functionality#getOutputs()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link processMaker.Functionality#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see processMaker.Functionality#getFrequency()
	 * @see #getFunctionality()
	 * @generated
	 */
	EAttribute getFunctionality_Frequency();

	/**
	 * Returns the meta object for class '{@link processMaker.MainBlock <em>Main Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Block</em>'.
	 * @see processMaker.MainBlock
	 * @generated
	 */
	EClass getMainBlock();

	/**
	 * Returns the meta object for class '{@link processMaker.Struct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct</em>'.
	 * @see processMaker.Struct
	 * @generated
	 */
	EClass getStruct();

	/**
	 * Returns the meta object for the containment reference list '{@link processMaker.Struct#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see processMaker.Struct#getMembers()
	 * @see #getStruct()
	 * @generated
	 */
	EReference getStruct_Members();

	/**
	 * Returns the meta object for class '{@link processMaker.SimpleVariable <em>Simple Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Variable</em>'.
	 * @see processMaker.SimpleVariable
	 * @generated
	 */
	EClass getSimpleVariable();

	/**
	 * Returns the meta object for the attribute '{@link processMaker.SimpleVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see processMaker.SimpleVariable#getType()
	 * @see #getSimpleVariable()
	 * @generated
	 */
	EAttribute getSimpleVariable_Type();

	/**
	 * Returns the meta object for class '{@link processMaker.DataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Port</em>'.
	 * @see processMaker.DataPort
	 * @generated
	 */
	EClass getDataPort();

	/**
	 * Returns the meta object for the containment reference '{@link processMaker.DataPort#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see processMaker.DataPort#getVariable()
	 * @see #getDataPort()
	 * @generated
	 */
	EReference getDataPort_Variable();

	/**
	 * Returns the meta object for the attribute '{@link processMaker.DataPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see processMaker.DataPort#getName()
	 * @see #getDataPort()
	 * @generated
	 */
	EAttribute getDataPort_Name();

	/**
	 * Returns the meta object for class '{@link processMaker.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable</em>'.
	 * @see processMaker.GlobalVariable
	 * @generated
	 */
	EClass getGlobalVariable();

	/**
	 * Returns the meta object for the attribute '{@link processMaker.GlobalVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see processMaker.GlobalVariable#getName()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_Name();

	/**
	 * Returns the meta object for class '{@link processMaker.OperationTerm <em>Operation Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Term</em>'.
	 * @see processMaker.OperationTerm
	 * @generated
	 */
	EClass getOperationTerm();

	/**
	 * Returns the meta object for class '{@link processMaker.ReferenceVariable <em>Reference Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Variable</em>'.
	 * @see processMaker.ReferenceVariable
	 * @generated
	 */
	EClass getReferenceVariable();

	/**
	 * Returns the meta object for the reference '{@link processMaker.ReferenceVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see processMaker.ReferenceVariable#getVariable()
	 * @see #getReferenceVariable()
	 * @generated
	 */
	EReference getReferenceVariable_Variable();

	/**
	 * Returns the meta object for enum '{@link processMaker.ECalculations <em>ECalculations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ECalculations</em>'.
	 * @see processMaker.ECalculations
	 * @generated
	 */
	EEnum getECalculations();

	/**
	 * Returns the meta object for enum '{@link processMaker.LogicalComparison <em>Logical Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Comparison</em>'.
	 * @see processMaker.LogicalComparison
	 * @generated
	 */
	EEnum getLogicalComparison();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcessMakerFactory getProcessMakerFactory();

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
		 * The meta object literal for the '{@link processMaker.impl.InstructionsImpl <em>Instructions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.InstructionsImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getInstructions()
		 * @generated
		 */
		EClass INSTRUCTIONS = eINSTANCE.getInstructions();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTIONS__NEXT = eINSTANCE.getInstructions_Next();

		/**
		 * The meta object literal for the '{@link processMaker.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.LoopImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>While</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__WHILE = eINSTANCE.getLoop_While();

		/**
		 * The meta object literal for the '<em><b>Loop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__LOOP = eINSTANCE.getLoop_Loop();

		/**
		 * The meta object literal for the '{@link processMaker.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.IfImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '<em><b>If Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__IF_BLOCK = eINSTANCE.getIf_IfBlock();

		/**
		 * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE_BLOCK = eINSTANCE.getIf_ElseBlock();

		/**
		 * The meta object literal for the '{@link processMaker.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.BooleanExpressionImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '{@link processMaker.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.CompositionImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '<em><b>Booleanexpression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__BOOLEANEXPRESSION = eINSTANCE.getComposition_Booleanexpression();

		/**
		 * The meta object literal for the '{@link processMaker.impl.ComparisonImpl <em>Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.ComparisonImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getComparison()
		 * @generated
		 */
		EClass COMPARISON = eINSTANCE.getComparison();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON__DESCRIPTION = eINSTANCE.getComparison_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON__TYPE = eINSTANCE.getComparison_Type();

		/**
		 * The meta object literal for the '{@link processMaker.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.NotImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Booleanexpression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__BOOLEANEXPRESSION = eINSTANCE.getNot_Booleanexpression();

		/**
		 * The meta object literal for the '{@link processMaker.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.AndImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link processMaker.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.OrImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link processMaker.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.OperationImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__TYPE = eINSTANCE.getOperation_Type();

		/**
		 * The meta object literal for the '{@link processMaker.impl.CodeBlockImpl <em>Code Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.CodeBlockImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getCodeBlock()
		 * @generated
		 */
		EClass CODE_BLOCK = eINSTANCE.getCodeBlock();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_BLOCK__INSTRUCTIONS = eINSTANCE.getCodeBlock_Instructions();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_BLOCK__FIRST = eINSTANCE.getCodeBlock_First();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_BLOCK__NAME = eINSTANCE.getCodeBlock_Name();

		/**
		 * The meta object literal for the '<em><b>Internal Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_BLOCK__INTERNAL_VARIABLE = eINSTANCE.getCodeBlock_InternalVariable();

		/**
		 * The meta object literal for the '{@link processMaker.impl.HardcodedImpl <em>Hardcoded</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.HardcodedImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getHardcoded()
		 * @generated
		 */
		EClass HARDCODED = eINSTANCE.getHardcoded();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDCODED__INSTRUCTION = eINSTANCE.getHardcoded_Instruction();

		/**
		 * The meta object literal for the '{@link processMaker.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.BooleanVariableImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getBooleanVariable()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE = eINSTANCE.getBooleanVariable();

		/**
		 * The meta object literal for the '{@link processMaker.impl.ServiceBlockImpl <em>Service Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.ServiceBlockImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getServiceBlock()
		 * @generated
		 */
		EClass SERVICE_BLOCK = eINSTANCE.getServiceBlock();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BLOCK__REQUEST = eINSTANCE.getServiceBlock_Request();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BLOCK__RESPONSE = eINSTANCE.getServiceBlock_Response();

		/**
		 * The meta object literal for the '{@link processMaker.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.VariableImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link processMaker.impl.AffectVariableImpl <em>Affect Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.AffectVariableImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getAffectVariable()
		 * @generated
		 */
		EClass AFFECT_VARIABLE = eINSTANCE.getAffectVariable();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFECT_VARIABLE__VARIABLE = eINSTANCE.getAffectVariable_Variable();

		/**
		 * The meta object literal for the '<em><b>Value Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFECT_VARIABLE__VALUE_OF = eINSTANCE.getAffectVariable_ValueOf();

		/**
		 * The meta object literal for the '<em><b>Constant Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECT_VARIABLE__CONSTANT_VALUE = eINSTANCE.getAffectVariable_ConstantValue();

		/**
		 * The meta object literal for the '{@link processMaker.impl.LocalVariableImpl <em>Local Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.LocalVariableImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getLocalVariable()
		 * @generated
		 */
		EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_VARIABLE__NAME = eINSTANCE.getLocalVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Constant Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_VARIABLE__CONSTANT_VALUE = eINSTANCE.getLocalVariable_ConstantValue();

		/**
		 * The meta object literal for the '{@link processMaker.impl.RequestServiceImpl <em>Request Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.RequestServiceImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getRequestService()
		 * @generated
		 */
		EClass REQUEST_SERVICE = eINSTANCE.getRequestService();

		/**
		 * The meta object literal for the '{@link processMaker.impl.InternalBlockImpl <em>Internal Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.InternalBlockImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getInternalBlock()
		 * @generated
		 */
		EClass INTERNAL_BLOCK = eINSTANCE.getInternalBlock();

		/**
		 * The meta object literal for the '{@link processMaker.impl.TwoTermsOperationImpl <em>Two Terms Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.TwoTermsOperationImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getTwoTermsOperation()
		 * @generated
		 */
		EClass TWO_TERMS_OPERATION = eINSTANCE.getTwoTermsOperation();

		/**
		 * The meta object literal for the '<em><b>First Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWO_TERMS_OPERATION__FIRST_TERM = eINSTANCE.getTwoTermsOperation_FirstTerm();

		/**
		 * The meta object literal for the '<em><b>Second Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWO_TERMS_OPERATION__SECOND_TERM = eINSTANCE.getTwoTermsOperation_SecondTerm();

		/**
		 * The meta object literal for the '{@link processMaker.impl.UpdateGlobalVariableImpl <em>Update Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.UpdateGlobalVariableImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getUpdateGlobalVariable()
		 * @generated
		 */
		EClass UPDATE_GLOBAL_VARIABLE = eINSTANCE.getUpdateGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Dataport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_GLOBAL_VARIABLE__DATAPORT = eINSTANCE.getUpdateGlobalVariable_Dataport();

		/**
		 * The meta object literal for the '{@link processMaker.impl.FunctionalityImpl <em>Functionality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.FunctionalityImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getFunctionality()
		 * @generated
		 */
		EClass FUNCTIONALITY = eINSTANCE.getFunctionality();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__MAIN = eINSTANCE.getFunctionality_Main();

		/**
		 * The meta object literal for the '<em><b>Serviceblock</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__SERVICEBLOCK = eINSTANCE.getFunctionality_Serviceblock();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONALITY__NAME = eINSTANCE.getFunctionality_Name();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__INPUTS = eINSTANCE.getFunctionality_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__OUTPUTS = eINSTANCE.getFunctionality_Outputs();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONALITY__FREQUENCY = eINSTANCE.getFunctionality_Frequency();

		/**
		 * The meta object literal for the '{@link processMaker.impl.MainBlockImpl <em>Main Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.MainBlockImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getMainBlock()
		 * @generated
		 */
		EClass MAIN_BLOCK = eINSTANCE.getMainBlock();

		/**
		 * The meta object literal for the '{@link processMaker.impl.StructImpl <em>Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.StructImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getStruct()
		 * @generated
		 */
		EClass STRUCT = eINSTANCE.getStruct();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT__MEMBERS = eINSTANCE.getStruct_Members();

		/**
		 * The meta object literal for the '{@link processMaker.impl.SimpleVariableImpl <em>Simple Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.SimpleVariableImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getSimpleVariable()
		 * @generated
		 */
		EClass SIMPLE_VARIABLE = eINSTANCE.getSimpleVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_VARIABLE__TYPE = eINSTANCE.getSimpleVariable_Type();

		/**
		 * The meta object literal for the '{@link processMaker.impl.DataPortImpl <em>Data Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.DataPortImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getDataPort()
		 * @generated
		 */
		EClass DATA_PORT = eINSTANCE.getDataPort();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PORT__VARIABLE = eINSTANCE.getDataPort_Variable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PORT__NAME = eINSTANCE.getDataPort_Name();

		/**
		 * The meta object literal for the '{@link processMaker.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.GlobalVariableImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getGlobalVariable()
		 * @generated
		 */
		EClass GLOBAL_VARIABLE = eINSTANCE.getGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VARIABLE__NAME = eINSTANCE.getGlobalVariable_Name();

		/**
		 * The meta object literal for the '{@link processMaker.impl.OperationTermImpl <em>Operation Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.OperationTermImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getOperationTerm()
		 * @generated
		 */
		EClass OPERATION_TERM = eINSTANCE.getOperationTerm();

		/**
		 * The meta object literal for the '{@link processMaker.impl.ReferenceVariableImpl <em>Reference Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.impl.ReferenceVariableImpl
		 * @see processMaker.impl.ProcessMakerPackageImpl#getReferenceVariable()
		 * @generated
		 */
		EClass REFERENCE_VARIABLE = eINSTANCE.getReferenceVariable();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_VARIABLE__VARIABLE = eINSTANCE.getReferenceVariable_Variable();

		/**
		 * The meta object literal for the '{@link processMaker.ECalculations <em>ECalculations</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.ECalculations
		 * @see processMaker.impl.ProcessMakerPackageImpl#getECalculations()
		 * @generated
		 */
		EEnum ECALCULATIONS = eINSTANCE.getECalculations();

		/**
		 * The meta object literal for the '{@link processMaker.LogicalComparison <em>Logical Comparison</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see processMaker.LogicalComparison
		 * @see processMaker.impl.ProcessMakerPackageImpl#getLogicalComparison()
		 * @generated
		 */
		EEnum LOGICAL_COMPARISON = eINSTANCE.getLogicalComparison();

	}

} //ProcessMakerPackage
