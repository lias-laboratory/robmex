/**
 */
package ROSMiLan;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ROSMiLan.ExternalTopic#getTopicName <em>Topic Name</em>}</li>
 * </ul>
 *
 * @see ROSMiLan.ROSMiLanPackage#getExternalTopic()
 * @model
 * @generated
 */
public interface ExternalTopic extends DataModule {
	/**
	 * Returns the value of the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Name</em>' attribute.
	 * @see #setTopicName(String)
	 * @see ROSMiLan.ROSMiLanPackage#getExternalTopic_TopicName()
	 * @model required="true"
	 * @generated
	 */
	String getTopicName();

	/**
	 * Sets the value of the '{@link ROSMiLan.ExternalTopic#getTopicName <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Name</em>' attribute.
	 * @see #getTopicName()
	 * @generated
	 */
	void setTopicName(String value);

} // ExternalTopic
