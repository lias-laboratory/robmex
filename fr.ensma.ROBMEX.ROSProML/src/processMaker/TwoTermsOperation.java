/**
 */
package processMaker;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Two Terms Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link processMaker.TwoTermsOperation#getFirstTerm <em>First Term</em>}</li>
 *   <li>{@link processMaker.TwoTermsOperation#getSecondTerm <em>Second Term</em>}</li>
 * </ul>
 *
 * @see processMaker.ProcessMakerPackage#getTwoTermsOperation()
 * @model abstract="true"
 * @generated
 */
public interface TwoTermsOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>First Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Term</em>' containment reference.
	 * @see #setFirstTerm(OperationTerm)
	 * @see processMaker.ProcessMakerPackage#getTwoTermsOperation_FirstTerm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OperationTerm getFirstTerm();

	/**
	 * Sets the value of the '{@link processMaker.TwoTermsOperation#getFirstTerm <em>First Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Term</em>' containment reference.
	 * @see #getFirstTerm()
	 * @generated
	 */
	void setFirstTerm(OperationTerm value);

	/**
	 * Returns the value of the '<em><b>Second Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Term</em>' containment reference.
	 * @see #setSecondTerm(OperationTerm)
	 * @see processMaker.ProcessMakerPackage#getTwoTermsOperation_SecondTerm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OperationTerm getSecondTerm();

	/**
	 * Sets the value of the '{@link processMaker.TwoTermsOperation#getSecondTerm <em>Second Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Term</em>' containment reference.
	 * @see #getSecondTerm()
	 * @generated
	 */
	void setSecondTerm(OperationTerm value);

} // TwoTermsOperation
