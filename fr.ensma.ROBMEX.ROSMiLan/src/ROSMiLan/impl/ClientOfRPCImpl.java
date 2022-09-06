/**
 */
package ROSMiLan.impl;

import ROSMiLan.ClientOfRPC;
import ROSMiLan.ROSMiLanPackage;
import ROSMiLan.ServerToRPC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client Of RPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ROSMiLan.impl.ClientOfRPCImpl#getServertorpc <em>Servertorpc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientOfRPCImpl extends MinimalEObjectImpl.Container implements ClientOfRPC {
	/**
	 * The cached value of the '{@link #getServertorpc() <em>Servertorpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServertorpc()
	 * @generated
	 * @ordered
	 */
	protected ServerToRPC servertorpc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientOfRPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ROSMiLanPackage.Literals.CLIENT_OF_RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerToRPC getServertorpc() {
		if (servertorpc != null && servertorpc.eIsProxy()) {
			InternalEObject oldServertorpc = (InternalEObject)servertorpc;
			servertorpc = (ServerToRPC)eResolveProxy(oldServertorpc);
			if (servertorpc != oldServertorpc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ROSMiLanPackage.CLIENT_OF_RPC__SERVERTORPC, oldServertorpc, servertorpc));
			}
		}
		return servertorpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerToRPC basicGetServertorpc() {
		return servertorpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServertorpc(ServerToRPC newServertorpc) {
		ServerToRPC oldServertorpc = servertorpc;
		servertorpc = newServertorpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROSMiLanPackage.CLIENT_OF_RPC__SERVERTORPC, oldServertorpc, servertorpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ROSMiLanPackage.CLIENT_OF_RPC__SERVERTORPC:
				if (resolve) return getServertorpc();
				return basicGetServertorpc();
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
			case ROSMiLanPackage.CLIENT_OF_RPC__SERVERTORPC:
				setServertorpc((ServerToRPC)newValue);
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
			case ROSMiLanPackage.CLIENT_OF_RPC__SERVERTORPC:
				setServertorpc((ServerToRPC)null);
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
			case ROSMiLanPackage.CLIENT_OF_RPC__SERVERTORPC:
				return servertorpc != null;
		}
		return super.eIsSet(featureID);
	}

} //ClientOfRPCImpl
