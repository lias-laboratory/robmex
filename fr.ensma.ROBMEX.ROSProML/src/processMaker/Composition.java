/**
 */
package processMaker;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link processMaker.Composition#getBooleanexpression <em>Booleanexpression</em>}</li>
 * </ul>
 *
 * @see processMaker.ProcessMakerPackage#getComposition()
 * @model abstract="true"
 * @generated
 */
public interface Composition extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Booleanexpression</b></em>' containment reference list.
	 * The list contents are of type {@link processMaker.BooleanExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booleanexpression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booleanexpression</em>' containment reference list.
	 * @see processMaker.ProcessMakerPackage#getComposition_Booleanexpression()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<BooleanExpression> getBooleanexpression();

} // Composition
