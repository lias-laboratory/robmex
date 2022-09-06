/**
 */
package processMaker;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link processMaker.CodeBlock#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link processMaker.CodeBlock#getFirst <em>First</em>}</li>
 *   <li>{@link processMaker.CodeBlock#getName <em>Name</em>}</li>
 *   <li>{@link processMaker.CodeBlock#getInternalVariable <em>Internal Variable</em>}</li>
 * </ul>
 *
 * @see processMaker.ProcessMakerPackage#getCodeBlock()
 * @model abstract="true"
 * @generated
 */
public interface CodeBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link processMaker.Instructions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see processMaker.ProcessMakerPackage#getCodeBlock_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instructions> getInstructions();

	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(Instructions)
	 * @see processMaker.ProcessMakerPackage#getCodeBlock_First()
	 * @model required="true"
	 * @generated
	 */
	Instructions getFirst();

	/**
	 * Sets the value of the '{@link processMaker.CodeBlock#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(Instructions value);

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
	 * @see processMaker.ProcessMakerPackage#getCodeBlock_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link processMaker.CodeBlock#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Internal Variable</b></em>' containment reference list.
	 * The list contents are of type {@link processMaker.LocalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Variable</em>' containment reference list.
	 * @see processMaker.ProcessMakerPackage#getCodeBlock_InternalVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocalVariable> getInternalVariable();

} // CodeBlock
