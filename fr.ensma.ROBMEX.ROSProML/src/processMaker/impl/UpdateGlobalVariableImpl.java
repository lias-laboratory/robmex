/**
 */
package processMaker.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import processMaker.DataPort;
import processMaker.ProcessMakerPackage;
import processMaker.UpdateGlobalVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Global Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link processMaker.impl.UpdateGlobalVariableImpl#getDataport <em>Dataport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateGlobalVariableImpl extends InstructionsImpl implements UpdateGlobalVariable {
	/**
	 * The cached value of the '{@link #getDataport() <em>Dataport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataport()
	 * @generated
	 * @ordered
	 */
	protected DataPort dataport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateGlobalVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessMakerPackage.Literals.UPDATE_GLOBAL_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPort getDataport() {
		if (dataport != null && dataport.eIsProxy()) {
			InternalEObject oldDataport = (InternalEObject)dataport;
			dataport = (DataPort)eResolveProxy(oldDataport);
			if (dataport != oldDataport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessMakerPackage.UPDATE_GLOBAL_VARIABLE__DATAPORT, oldDataport, dataport));
			}
		}
		return dataport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPort basicGetDataport() {
		return dataport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataport(DataPort newDataport) {
		DataPort oldDataport = dataport;
		dataport = newDataport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.UPDATE_GLOBAL_VARIABLE__DATAPORT, oldDataport, dataport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessMakerPackage.UPDATE_GLOBAL_VARIABLE__DATAPORT:
				if (resolve) return getDataport();
				return basicGetDataport();
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
			case ProcessMakerPackage.UPDATE_GLOBAL_VARIABLE__DATAPORT:
				setDataport((DataPort)newValue);
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
			case ProcessMakerPackage.UPDATE_GLOBAL_VARIABLE__DATAPORT:
				setDataport((DataPort)null);
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
			case ProcessMakerPackage.UPDATE_GLOBAL_VARIABLE__DATAPORT:
				return dataport != null;
		}
		return super.eIsSet(featureID);
	}

} //UpdateGlobalVariableImpl
