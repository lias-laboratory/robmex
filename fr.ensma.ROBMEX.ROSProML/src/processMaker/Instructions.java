/**
 */
package processMaker;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instructions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link processMaker.Instructions#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see processMaker.ProcessMakerPackage#getInstructions()
 * @model abstract="true"
 * @generated
 */
public interface Instructions extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Instructions)
	 * @see processMaker.ProcessMakerPackage#getInstructions_Next()
	 * @model
	 * @generated
	 */
	Instructions getNext();

	/**
	 * Sets the value of the '{@link processMaker.Instructions#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Instructions value);

} // Instructions
