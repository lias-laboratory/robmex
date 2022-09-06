/**
 */
package processMaker;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link processMaker.Struct#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see processMaker.ProcessMakerPackage#getStruct()
 * @model
 * @generated
 */
public interface Struct extends GlobalVariable {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link processMaker.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see processMaker.ProcessMakerPackage#getStruct_Members()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GlobalVariable> getMembers();

} // Struct
