/**
 */
package ROSMiLan.impl;

import ROSMiLan.Mission;
import ROSMiLan.MissionMember;
import ROSMiLan.ROSMiLanPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ROSMiLan.impl.MissionImpl#getItStartsWith <em>It Starts With</em>}</li>
 *   <li>{@link ROSMiLan.impl.MissionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionImpl extends BlockOfConnectedFunctionsImpl implements Mission {
	/**
	 * The cached value of the '{@link #getItStartsWith() <em>It Starts With</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItStartsWith()
	 * @generated
	 * @ordered
	 */
	protected MissionMember itStartsWith;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ROSMiLanPackage.Literals.MISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissionMember getItStartsWith() {
		if (itStartsWith != null && itStartsWith.eIsProxy()) {
			InternalEObject oldItStartsWith = (InternalEObject)itStartsWith;
			itStartsWith = (MissionMember)eResolveProxy(oldItStartsWith);
			if (itStartsWith != oldItStartsWith) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ROSMiLanPackage.MISSION__IT_STARTS_WITH, oldItStartsWith, itStartsWith));
			}
		}
		return itStartsWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissionMember basicGetItStartsWith() {
		return itStartsWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItStartsWith(MissionMember newItStartsWith) {
		MissionMember oldItStartsWith = itStartsWith;
		itStartsWith = newItStartsWith;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROSMiLanPackage.MISSION__IT_STARTS_WITH, oldItStartsWith, itStartsWith));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROSMiLanPackage.MISSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ROSMiLanPackage.MISSION__IT_STARTS_WITH:
				if (resolve) return getItStartsWith();
				return basicGetItStartsWith();
			case ROSMiLanPackage.MISSION__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ROSMiLanPackage.MISSION__IT_STARTS_WITH:
				setItStartsWith((MissionMember)newValue);
				return;
			case ROSMiLanPackage.MISSION__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ROSMiLanPackage.MISSION__IT_STARTS_WITH:
				setItStartsWith((MissionMember)null);
				return;
			case ROSMiLanPackage.MISSION__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ROSMiLanPackage.MISSION__IT_STARTS_WITH:
				return itStartsWith != null;
			case ROSMiLanPackage.MISSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MissionImpl
