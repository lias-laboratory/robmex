/**
 */
package ROSMiLan.impl;

import ROSMiLan.ClientOfRPC;
import ROSMiLan.Functionality;
import ROSMiLan.ROSMiLanPackage;
import ROSMiLan.ServerToRPC;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functionality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ROSMiLan.impl.FunctionalityImpl#getServertorpc <em>Servertorpc</em>}</li>
 *   <li>{@link ROSMiLan.impl.FunctionalityImpl#getClientofrpc <em>Clientofrpc</em>}</li>
 *   <li>{@link ROSMiLan.impl.FunctionalityImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalityImpl extends MissionMemberImpl implements Functionality {
	/**
	 * The cached value of the '{@link #getServertorpc() <em>Servertorpc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServertorpc()
	 * @generated
	 * @ordered
	 */
	protected EList<ServerToRPC> servertorpc;

	/**
	 * The cached value of the '{@link #getClientofrpc() <em>Clientofrpc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientofrpc()
	 * @generated
	 * @ordered
	 */
	protected EList<ClientOfRPC> clientofrpc;

	/**
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected String reference = REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ROSMiLanPackage.Literals.FUNCTIONALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServerToRPC> getServertorpc() {
		if (servertorpc == null) {
			servertorpc = new EObjectContainmentEList<ServerToRPC>(ServerToRPC.class, this, ROSMiLanPackage.FUNCTIONALITY__SERVERTORPC);
		}
		return servertorpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClientOfRPC> getClientofrpc() {
		if (clientofrpc == null) {
			clientofrpc = new EObjectContainmentEList<ClientOfRPC>(ClientOfRPC.class, this, ROSMiLanPackage.FUNCTIONALITY__CLIENTOFRPC);
		}
		return clientofrpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(String newReference) {
		String oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROSMiLanPackage.FUNCTIONALITY__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ROSMiLanPackage.FUNCTIONALITY__SERVERTORPC:
				return ((InternalEList<?>)getServertorpc()).basicRemove(otherEnd, msgs);
			case ROSMiLanPackage.FUNCTIONALITY__CLIENTOFRPC:
				return ((InternalEList<?>)getClientofrpc()).basicRemove(otherEnd, msgs);
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
			case ROSMiLanPackage.FUNCTIONALITY__SERVERTORPC:
				return getServertorpc();
			case ROSMiLanPackage.FUNCTIONALITY__CLIENTOFRPC:
				return getClientofrpc();
			case ROSMiLanPackage.FUNCTIONALITY__REFERENCE:
				return getReference();
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
			case ROSMiLanPackage.FUNCTIONALITY__SERVERTORPC:
				getServertorpc().clear();
				getServertorpc().addAll((Collection<? extends ServerToRPC>)newValue);
				return;
			case ROSMiLanPackage.FUNCTIONALITY__CLIENTOFRPC:
				getClientofrpc().clear();
				getClientofrpc().addAll((Collection<? extends ClientOfRPC>)newValue);
				return;
			case ROSMiLanPackage.FUNCTIONALITY__REFERENCE:
				setReference((String)newValue);
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
			case ROSMiLanPackage.FUNCTIONALITY__SERVERTORPC:
				getServertorpc().clear();
				return;
			case ROSMiLanPackage.FUNCTIONALITY__CLIENTOFRPC:
				getClientofrpc().clear();
				return;
			case ROSMiLanPackage.FUNCTIONALITY__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
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
			case ROSMiLanPackage.FUNCTIONALITY__SERVERTORPC:
				return servertorpc != null && !servertorpc.isEmpty();
			case ROSMiLanPackage.FUNCTIONALITY__CLIENTOFRPC:
				return clientofrpc != null && !clientofrpc.isEmpty();
			case ROSMiLanPackage.FUNCTIONALITY__REFERENCE:
				return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
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
		result.append(" (reference: ");
		result.append(reference);
		result.append(')');
		return result.toString();
	}

} //FunctionalityImpl
