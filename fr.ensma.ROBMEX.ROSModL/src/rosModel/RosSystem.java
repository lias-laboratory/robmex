/**
 */
package rosModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rosModel.RosSystem#getRospackage <em>Rospackage</em>}</li>
 *   <li>{@link rosModel.RosSystem#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see rosModel.RosModelPackage#getRosSystem()
 * @model
 * @generated
 */
public interface RosSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Rospackage</b></em>' containment reference list.
	 * The list contents are of type {@link rosModel.RosPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rospackage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rospackage</em>' containment reference list.
	 * @see rosModel.RosModelPackage#getRosSystem_Rospackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<RosPackage> getRospackage();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"indigo"</code>.
	 * The literals are from the enumeration {@link rosModel.RosVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see rosModel.RosVersion
	 * @see #setVersion(RosVersion)
	 * @see rosModel.RosModelPackage#getRosSystem_Version()
	 * @model default="indigo" required="true"
	 * @generated
	 */
	RosVersion getVersion();

	/**
	 * Sets the value of the '{@link rosModel.RosSystem#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see rosModel.RosVersion
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(RosVersion value);

} // RosSystem
