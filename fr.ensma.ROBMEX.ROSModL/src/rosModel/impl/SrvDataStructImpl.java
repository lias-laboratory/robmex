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

import rosModel.Attribute;
import rosModel.RosModelPackage;
import rosModel.SrvDataStruct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Srv Data Struct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rosModel.impl.SrvDataStructImpl#getName <em>Name</em>}</li>
 *   <li>{@link rosModel.impl.SrvDataStructImpl#getRequestAttributes <em>Request Attributes</em>}</li>
 *   <li>{@link rosModel.impl.SrvDataStructImpl#getResponseAttributes <em>Response Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrvDataStructImpl extends MinimalEObjectImpl.Container implements SrvDataStruct {
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
	 * The cached value of the '{@link #getRequestAttributes() <em>Request Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> requestAttributes;

	/**
	 * The cached value of the '{@link #getResponseAttributes() <em>Response Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> responseAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrvDataStructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosModelPackage.Literals.SRV_DATA_STRUCT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RosModelPackage.SRV_DATA_STRUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getRequestAttributes() {
		if (requestAttributes == null) {
			requestAttributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, RosModelPackage.SRV_DATA_STRUCT__REQUEST_ATTRIBUTES);
		}
		return requestAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getResponseAttributes() {
		if (responseAttributes == null) {
			responseAttributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, RosModelPackage.SRV_DATA_STRUCT__RESPONSE_ATTRIBUTES);
		}
		return responseAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RosModelPackage.SRV_DATA_STRUCT__REQUEST_ATTRIBUTES:
				return ((InternalEList<?>)getRequestAttributes()).basicRemove(otherEnd, msgs);
			case RosModelPackage.SRV_DATA_STRUCT__RESPONSE_ATTRIBUTES:
				return ((InternalEList<?>)getResponseAttributes()).basicRemove(otherEnd, msgs);
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
			case RosModelPackage.SRV_DATA_STRUCT__NAME:
				return getName();
			case RosModelPackage.SRV_DATA_STRUCT__REQUEST_ATTRIBUTES:
				return getRequestAttributes();
			case RosModelPackage.SRV_DATA_STRUCT__RESPONSE_ATTRIBUTES:
				return getResponseAttributes();
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
			case RosModelPackage.SRV_DATA_STRUCT__NAME:
				setName((String)newValue);
				return;
			case RosModelPackage.SRV_DATA_STRUCT__REQUEST_ATTRIBUTES:
				getRequestAttributes().clear();
				getRequestAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case RosModelPackage.SRV_DATA_STRUCT__RESPONSE_ATTRIBUTES:
				getResponseAttributes().clear();
				getResponseAttributes().addAll((Collection<? extends Attribute>)newValue);
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
			case RosModelPackage.SRV_DATA_STRUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RosModelPackage.SRV_DATA_STRUCT__REQUEST_ATTRIBUTES:
				getRequestAttributes().clear();
				return;
			case RosModelPackage.SRV_DATA_STRUCT__RESPONSE_ATTRIBUTES:
				getResponseAttributes().clear();
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
			case RosModelPackage.SRV_DATA_STRUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RosModelPackage.SRV_DATA_STRUCT__REQUEST_ATTRIBUTES:
				return requestAttributes != null && !requestAttributes.isEmpty();
			case RosModelPackage.SRV_DATA_STRUCT__RESPONSE_ATTRIBUTES:
				return responseAttributes != null && !responseAttributes.isEmpty();
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

} //SrvDataStructImpl
