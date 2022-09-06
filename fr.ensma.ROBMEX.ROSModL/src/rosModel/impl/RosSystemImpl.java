/**
 */
package rosModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rosModel.RosModelPackage;
import rosModel.RosPackage;
import rosModel.RosSystem;
import rosModel.RosVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rosModel.impl.RosSystemImpl#getRospackage <em>Rospackage</em>}</li>
 *   <li>{@link rosModel.impl.RosSystemImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosSystemImpl extends MinimalEObjectImpl.Container implements RosSystem {
	/**
	 * The cached value of the '{@link #getRospackage() <em>Rospackage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRospackage()
	 * @generated
	 * @ordered
	 */
	protected EList<RosPackage> rospackage;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final RosVersion VERSION_EDEFAULT = RosVersion.INDIGO;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected RosVersion version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosModelPackage.Literals.ROS_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RosPackage> getRospackage() {
		if (rospackage == null) {
			rospackage = new EObjectContainmentEList<RosPackage>(RosPackage.class, this, RosModelPackage.ROS_SYSTEM__ROSPACKAGE);
		}
		return rospackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosVersion getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(RosVersion newVersion) {
		RosVersion oldVersion = version;
		version = newVersion == null ? VERSION_EDEFAULT : newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosModelPackage.ROS_SYSTEM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RosModelPackage.ROS_SYSTEM__ROSPACKAGE:
				return ((InternalEList<?>)getRospackage()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RosModelPackage.ROS_SYSTEM__ROSPACKAGE:
				return getRospackage();
			case RosModelPackage.ROS_SYSTEM__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RosModelPackage.ROS_SYSTEM__ROSPACKAGE:
				getRospackage().clear();
				getRospackage().addAll((Collection<? extends RosPackage>)newValue);
				return;
			case RosModelPackage.ROS_SYSTEM__VERSION:
				setVersion((RosVersion)newValue);
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
			case RosModelPackage.ROS_SYSTEM__ROSPACKAGE:
				getRospackage().clear();
				return;
			case RosModelPackage.ROS_SYSTEM__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case RosModelPackage.ROS_SYSTEM__ROSPACKAGE:
				return rospackage != null && !rospackage.isEmpty();
			case RosModelPackage.ROS_SYSTEM__VERSION:
				return version != VERSION_EDEFAULT;
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
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //RosSystemImpl
