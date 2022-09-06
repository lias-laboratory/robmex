/**
 */
package processMaker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link processMaker.Loop#getWhile <em>While</em>}</li>
 *   <li>{@link processMaker.Loop#getLoop <em>Loop</em>}</li>
 * </ul>
 *
 * @see processMaker.ProcessMakerPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Instructions {
	/**
	 * Returns the value of the '<em><b>While</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While</em>' containment reference.
	 * @see #setWhile(BooleanExpression)
	 * @see processMaker.ProcessMakerPackage#getLoop_While()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getWhile();

	/**
	 * Sets the value of the '{@link processMaker.Loop#getWhile <em>While</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While</em>' containment reference.
	 * @see #getWhile()
	 * @generated
	 */
	void setWhile(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop</em>' containment reference.
	 * @see #setLoop(InternalBlock)
	 * @see processMaker.ProcessMakerPackage#getLoop_Loop()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InternalBlock getLoop();

	/**
	 * Sets the value of the '{@link processMaker.Loop#getLoop <em>Loop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop</em>' containment reference.
	 * @see #getLoop()
	 * @generated
	 */
	void setLoop(InternalBlock value);

} // Loop
