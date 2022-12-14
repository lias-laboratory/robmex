/**
 */
package processMaker.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import processMaker.AffectVariable;
import processMaker.OperationTerm;
import processMaker.ProcessMakerPackage;
import processMaker.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affect Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link processMaker.impl.AffectVariableImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link processMaker.impl.AffectVariableImpl#getValueOf <em>Value Of</em>}</li>
 *   <li>{@link processMaker.impl.AffectVariableImpl#getConstantValue <em>Constant Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AffectVariableImpl extends InstructionsImpl implements AffectVariable {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The cached value of the '{@link #getValueOf() <em>Value Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueOf()
	 * @generated
	 * @ordered
	 */
	protected OperationTerm valueOf;

	/**
	 * The default value of the '{@link #getConstantValue() <em>Constant Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstantValue() <em>Constant Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantValue()
	 * @generated
	 * @ordered
	 */
	protected String constantValue = CONSTANT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffectVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessMakerPackage.Literals.AFFECT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessMakerPackage.AFFECT_VARIABLE__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.AFFECT_VARIABLE__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationTerm getValueOf() {
		return valueOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueOf(OperationTerm newValueOf, NotificationChain msgs) {
		OperationTerm oldValueOf = valueOf;
		valueOf = newValueOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.AFFECT_VARIABLE__VALUE_OF, oldValueOf, newValueOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueOf(OperationTerm newValueOf) {
		if (newValueOf != valueOf) {
			NotificationChain msgs = null;
			if (valueOf != null)
				msgs = ((InternalEObject)valueOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessMakerPackage.AFFECT_VARIABLE__VALUE_OF, null, msgs);
			if (newValueOf != null)
				msgs = ((InternalEObject)newValueOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessMakerPackage.AFFECT_VARIABLE__VALUE_OF, null, msgs);
			msgs = basicSetValueOf(newValueOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.AFFECT_VARIABLE__VALUE_OF, newValueOf, newValueOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstantValue() {
		return constantValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstantValue(String newConstantValue) {
		String oldConstantValue = constantValue;
		constantValue = newConstantValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.AFFECT_VARIABLE__CONSTANT_VALUE, oldConstantValue, constantValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessMakerPackage.AFFECT_VARIABLE__VALUE_OF:
				return basicSetValueOf(null, msgs);
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
			case ProcessMakerPackage.AFFECT_VARIABLE__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case ProcessMakerPackage.AFFECT_VARIABLE__VALUE_OF:
				return getValueOf();
			case ProcessMakerPackage.AFFECT_VARIABLE__CONSTANT_VALUE:
				return getConstantValue();
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
			case ProcessMakerPackage.AFFECT_VARIABLE__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case ProcessMakerPackage.AFFECT_VARIABLE__VALUE_OF:
				setValueOf((OperationTerm)newValue);
				return;
			case ProcessMakerPackage.AFFECT_VARIABLE__CONSTANT_VALUE:
				setConstantValue((String)newValue);
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
			case ProcessMakerPackage.AFFECT_VARIABLE__VARIABLE:
				setVariable((Variable)null);
				return;
			case ProcessMakerPackage.AFFECT_VARIABLE__VALUE_OF:
				setValueOf((OperationTerm)null);
				return;
			case ProcessMakerPackage.AFFECT_VARIABLE__CONSTANT_VALUE:
				setConstantValue(CONSTANT_VALUE_EDEFAULT);
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
			case ProcessMakerPackage.AFFECT_VARIABLE__VARIABLE:
				return variable != null;
			case ProcessMakerPackage.AFFECT_VARIABLE__VALUE_OF:
				return valueOf != null;
			case ProcessMakerPackage.AFFECT_VARIABLE__CONSTANT_VALUE:
				return CONSTANT_VALUE_EDEFAULT == null ? constantValue != null : !CONSTANT_VALUE_EDEFAULT.equals(constantValue);
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
		result.append(" (constantValue: ");
		result.append(constantValue);
		result.append(')');
		return result.toString();
	}

} //AffectVariableImpl
