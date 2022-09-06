/**
 */
package processMaker.impl;

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

import processMaker.DataPort;
import processMaker.Functionality;
import processMaker.MainBlock;
import processMaker.ProcessMakerPackage;
import processMaker.ServiceBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functionality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link processMaker.impl.FunctionalityImpl#getMain <em>Main</em>}</li>
 *   <li>{@link processMaker.impl.FunctionalityImpl#getServiceblock <em>Serviceblock</em>}</li>
 *   <li>{@link processMaker.impl.FunctionalityImpl#getName <em>Name</em>}</li>
 *   <li>{@link processMaker.impl.FunctionalityImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link processMaker.impl.FunctionalityImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link processMaker.impl.FunctionalityImpl#getFrequency <em>Frequency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalityImpl extends MinimalEObjectImpl.Container implements Functionality {
	/**
	 * The cached value of the '{@link #getMain() <em>Main</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMain()
	 * @generated
	 * @ordered
	 */
	protected MainBlock main;

	/**
	 * The cached value of the '{@link #getServiceblock() <em>Serviceblock</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceblock()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceBlock> serviceblock;

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
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPort> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPort> outputs;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final float FREQUENCY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected float frequency = FREQUENCY_EDEFAULT;

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
		return ProcessMakerPackage.Literals.FUNCTIONALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainBlock getMain() {
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMain(MainBlock newMain, NotificationChain msgs) {
		MainBlock oldMain = main;
		main = newMain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.FUNCTIONALITY__MAIN, oldMain, newMain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMain(MainBlock newMain) {
		if (newMain != main) {
			NotificationChain msgs = null;
			if (main != null)
				msgs = ((InternalEObject)main).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessMakerPackage.FUNCTIONALITY__MAIN, null, msgs);
			if (newMain != null)
				msgs = ((InternalEObject)newMain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessMakerPackage.FUNCTIONALITY__MAIN, null, msgs);
			msgs = basicSetMain(newMain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.FUNCTIONALITY__MAIN, newMain, newMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceBlock> getServiceblock() {
		if (serviceblock == null) {
			serviceblock = new EObjectContainmentEList<ServiceBlock>(ServiceBlock.class, this, ProcessMakerPackage.FUNCTIONALITY__SERVICEBLOCK);
		}
		return serviceblock;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.FUNCTIONALITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPort> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<DataPort>(DataPort.class, this, ProcessMakerPackage.FUNCTIONALITY__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPort> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<DataPort>(DataPort.class, this, ProcessMakerPackage.FUNCTIONALITY__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(float newFrequency) {
		float oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.FUNCTIONALITY__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessMakerPackage.FUNCTIONALITY__MAIN:
				return basicSetMain(null, msgs);
			case ProcessMakerPackage.FUNCTIONALITY__SERVICEBLOCK:
				return ((InternalEList<?>)getServiceblock()).basicRemove(otherEnd, msgs);
			case ProcessMakerPackage.FUNCTIONALITY__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case ProcessMakerPackage.FUNCTIONALITY__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
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
			case ProcessMakerPackage.FUNCTIONALITY__MAIN:
				return getMain();
			case ProcessMakerPackage.FUNCTIONALITY__SERVICEBLOCK:
				return getServiceblock();
			case ProcessMakerPackage.FUNCTIONALITY__NAME:
				return getName();
			case ProcessMakerPackage.FUNCTIONALITY__INPUTS:
				return getInputs();
			case ProcessMakerPackage.FUNCTIONALITY__OUTPUTS:
				return getOutputs();
			case ProcessMakerPackage.FUNCTIONALITY__FREQUENCY:
				return getFrequency();
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
			case ProcessMakerPackage.FUNCTIONALITY__MAIN:
				setMain((MainBlock)newValue);
				return;
			case ProcessMakerPackage.FUNCTIONALITY__SERVICEBLOCK:
				getServiceblock().clear();
				getServiceblock().addAll((Collection<? extends ServiceBlock>)newValue);
				return;
			case ProcessMakerPackage.FUNCTIONALITY__NAME:
				setName((String)newValue);
				return;
			case ProcessMakerPackage.FUNCTIONALITY__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends DataPort>)newValue);
				return;
			case ProcessMakerPackage.FUNCTIONALITY__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends DataPort>)newValue);
				return;
			case ProcessMakerPackage.FUNCTIONALITY__FREQUENCY:
				setFrequency((Float)newValue);
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
			case ProcessMakerPackage.FUNCTIONALITY__MAIN:
				setMain((MainBlock)null);
				return;
			case ProcessMakerPackage.FUNCTIONALITY__SERVICEBLOCK:
				getServiceblock().clear();
				return;
			case ProcessMakerPackage.FUNCTIONALITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessMakerPackage.FUNCTIONALITY__INPUTS:
				getInputs().clear();
				return;
			case ProcessMakerPackage.FUNCTIONALITY__OUTPUTS:
				getOutputs().clear();
				return;
			case ProcessMakerPackage.FUNCTIONALITY__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
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
			case ProcessMakerPackage.FUNCTIONALITY__MAIN:
				return main != null;
			case ProcessMakerPackage.FUNCTIONALITY__SERVICEBLOCK:
				return serviceblock != null && !serviceblock.isEmpty();
			case ProcessMakerPackage.FUNCTIONALITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessMakerPackage.FUNCTIONALITY__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case ProcessMakerPackage.FUNCTIONALITY__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case ProcessMakerPackage.FUNCTIONALITY__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
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
		result.append(", frequency: ");
		result.append(frequency);
		result.append(')');
		return result.toString();
	}

} //FunctionalityImpl
