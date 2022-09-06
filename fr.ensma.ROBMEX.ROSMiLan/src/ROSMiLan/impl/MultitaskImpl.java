/**
 */
package ROSMiLan.impl;

import ROSMiLan.BlockOfConnectedFunctions;
import ROSMiLan.DataModule;
import ROSMiLan.MissionMember;
import ROSMiLan.Multitask;
import ROSMiLan.ROSMiLanPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multitask</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ROSMiLan.impl.MultitaskImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link ROSMiLan.impl.MultitaskImpl#getDataModule <em>Data Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultitaskImpl extends MissionMemberImpl implements Multitask {
	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<MissionMember> steps;

	/**
	 * The cached value of the '{@link #getDataModule() <em>Data Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataModule()
	 * @generated
	 * @ordered
	 */
	protected EList<DataModule> dataModule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultitaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ROSMiLanPackage.Literals.MULTITASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MissionMember> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<MissionMember>(MissionMember.class, this, ROSMiLanPackage.MULTITASK__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataModule> getDataModule() {
		if (dataModule == null) {
			dataModule = new EObjectContainmentEList<DataModule>(DataModule.class, this, ROSMiLanPackage.MULTITASK__DATA_MODULE);
		}
		return dataModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ROSMiLanPackage.MULTITASK__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
			case ROSMiLanPackage.MULTITASK__DATA_MODULE:
				return ((InternalEList<?>)getDataModule()).basicRemove(otherEnd, msgs);
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
			case ROSMiLanPackage.MULTITASK__STEPS:
				return getSteps();
			case ROSMiLanPackage.MULTITASK__DATA_MODULE:
				return getDataModule();
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
			case ROSMiLanPackage.MULTITASK__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends MissionMember>)newValue);
				return;
			case ROSMiLanPackage.MULTITASK__DATA_MODULE:
				getDataModule().clear();
				getDataModule().addAll((Collection<? extends DataModule>)newValue);
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
			case ROSMiLanPackage.MULTITASK__STEPS:
				getSteps().clear();
				return;
			case ROSMiLanPackage.MULTITASK__DATA_MODULE:
				getDataModule().clear();
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
			case ROSMiLanPackage.MULTITASK__STEPS:
				return steps != null && !steps.isEmpty();
			case ROSMiLanPackage.MULTITASK__DATA_MODULE:
				return dataModule != null && !dataModule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BlockOfConnectedFunctions.class) {
			switch (derivedFeatureID) {
				case ROSMiLanPackage.MULTITASK__STEPS: return ROSMiLanPackage.BLOCK_OF_CONNECTED_FUNCTIONS__STEPS;
				case ROSMiLanPackage.MULTITASK__DATA_MODULE: return ROSMiLanPackage.BLOCK_OF_CONNECTED_FUNCTIONS__DATA_MODULE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BlockOfConnectedFunctions.class) {
			switch (baseFeatureID) {
				case ROSMiLanPackage.BLOCK_OF_CONNECTED_FUNCTIONS__STEPS: return ROSMiLanPackage.MULTITASK__STEPS;
				case ROSMiLanPackage.BLOCK_OF_CONNECTED_FUNCTIONS__DATA_MODULE: return ROSMiLanPackage.MULTITASK__DATA_MODULE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MultitaskImpl
