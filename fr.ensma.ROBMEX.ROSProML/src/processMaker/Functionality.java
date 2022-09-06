/**
 */
package processMaker;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functionality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link processMaker.Functionality#getMain <em>Main</em>}</li>
 *   <li>{@link processMaker.Functionality#getServiceblock <em>Serviceblock</em>}</li>
 *   <li>{@link processMaker.Functionality#getName <em>Name</em>}</li>
 *   <li>{@link processMaker.Functionality#getInputs <em>Inputs</em>}</li>
 *   <li>{@link processMaker.Functionality#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link processMaker.Functionality#getFrequency <em>Frequency</em>}</li>
 * </ul>
 *
 * @see processMaker.ProcessMakerPackage#getFunctionality()
 * @model
 * @generated
 */
public interface Functionality extends EObject {
	/**
	 * Returns the value of the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' containment reference.
	 * @see #setMain(MainBlock)
	 * @see processMaker.ProcessMakerPackage#getFunctionality_Main()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MainBlock getMain();

	/**
	 * Sets the value of the '{@link processMaker.Functionality#getMain <em>Main</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' containment reference.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(MainBlock value);

	/**
	 * Returns the value of the '<em><b>Serviceblock</b></em>' containment reference list.
	 * The list contents are of type {@link processMaker.ServiceBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serviceblock</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviceblock</em>' containment reference list.
	 * @see processMaker.ProcessMakerPackage#getFunctionality_Serviceblock()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceBlock> getServiceblock();

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
	 * @see processMaker.ProcessMakerPackage#getFunctionality_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link processMaker.Functionality#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link processMaker.DataPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see processMaker.ProcessMakerPackage#getFunctionality_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataPort> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link processMaker.DataPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see processMaker.ProcessMakerPackage#getFunctionality_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataPort> getOutputs();

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(float)
	 * @see processMaker.ProcessMakerPackage#getFunctionality_Frequency()
	 * @model
	 * @generated
	 */
	float getFrequency();

	/**
	 * Sets the value of the '{@link processMaker.Functionality#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(float value);

} // Functionality
