/**
 */
package processMaker.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import processMaker.Comparison;
import processMaker.LogicalComparison;
import processMaker.OperationTerm;
import processMaker.ProcessMakerPackage;
import processMaker.TwoTermsOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link processMaker.impl.ComparisonImpl#getFirstTerm <em>First Term</em>}</li>
 *   <li>{@link processMaker.impl.ComparisonImpl#getSecondTerm <em>Second Term</em>}</li>
 *   <li>{@link processMaker.impl.ComparisonImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link processMaker.impl.ComparisonImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonImpl extends BooleanExpressionImpl implements Comparison {
	/**
	 * The cached value of the '{@link #getFirstTerm() <em>First Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstTerm()
	 * @generated
	 * @ordered
	 */
	protected OperationTerm firstTerm;

	/**
	 * The cached value of the '{@link #getSecondTerm() <em>Second Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondTerm()
	 * @generated
	 * @ordered
	 */
	protected OperationTerm secondTerm;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalComparison TYPE_EDEFAULT = LogicalComparison.EQUALS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected LogicalComparison type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessMakerPackage.Literals.COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationTerm getFirstTerm() {
		return firstTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstTerm(OperationTerm newFirstTerm, NotificationChain msgs) {
		OperationTerm oldFirstTerm = firstTerm;
		firstTerm = newFirstTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.COMPARISON__FIRST_TERM, oldFirstTerm, newFirstTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstTerm(OperationTerm newFirstTerm) {
		if (newFirstTerm != firstTerm) {
			NotificationChain msgs = null;
			if (firstTerm != null)
				msgs = ((InternalEObject)firstTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessMakerPackage.COMPARISON__FIRST_TERM, null, msgs);
			if (newFirstTerm != null)
				msgs = ((InternalEObject)newFirstTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessMakerPackage.COMPARISON__FIRST_TERM, null, msgs);
			msgs = basicSetFirstTerm(newFirstTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.COMPARISON__FIRST_TERM, newFirstTerm, newFirstTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationTerm getSecondTerm() {
		return secondTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondTerm(OperationTerm newSecondTerm, NotificationChain msgs) {
		OperationTerm oldSecondTerm = secondTerm;
		secondTerm = newSecondTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.COMPARISON__SECOND_TERM, oldSecondTerm, newSecondTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondTerm(OperationTerm newSecondTerm) {
		if (newSecondTerm != secondTerm) {
			NotificationChain msgs = null;
			if (secondTerm != null)
				msgs = ((InternalEObject)secondTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessMakerPackage.COMPARISON__SECOND_TERM, null, msgs);
			if (newSecondTerm != null)
				msgs = ((InternalEObject)newSecondTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessMakerPackage.COMPARISON__SECOND_TERM, null, msgs);
			msgs = basicSetSecondTerm(newSecondTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.COMPARISON__SECOND_TERM, newSecondTerm, newSecondTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.COMPARISON__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComparison getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(LogicalComparison newType) {
		LogicalComparison oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.COMPARISON__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessMakerPackage.COMPARISON__FIRST_TERM:
				return basicSetFirstTerm(null, msgs);
			case ProcessMakerPackage.COMPARISON__SECOND_TERM:
				return basicSetSecondTerm(null, msgs);
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
			case ProcessMakerPackage.COMPARISON__FIRST_TERM:
				return getFirstTerm();
			case ProcessMakerPackage.COMPARISON__SECOND_TERM:
				return getSecondTerm();
			case ProcessMakerPackage.COMPARISON__DESCRIPTION:
				return getDescription();
			case ProcessMakerPackage.COMPARISON__TYPE:
				return getType();
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
			case ProcessMakerPackage.COMPARISON__FIRST_TERM:
				setFirstTerm((OperationTerm)newValue);
				return;
			case ProcessMakerPackage.COMPARISON__SECOND_TERM:
				setSecondTerm((OperationTerm)newValue);
				return;
			case ProcessMakerPackage.COMPARISON__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProcessMakerPackage.COMPARISON__TYPE:
				setType((LogicalComparison)newValue);
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
			case ProcessMakerPackage.COMPARISON__FIRST_TERM:
				setFirstTerm((OperationTerm)null);
				return;
			case ProcessMakerPackage.COMPARISON__SECOND_TERM:
				setSecondTerm((OperationTerm)null);
				return;
			case ProcessMakerPackage.COMPARISON__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProcessMakerPackage.COMPARISON__TYPE:
				setType(TYPE_EDEFAULT);
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
			case ProcessMakerPackage.COMPARISON__FIRST_TERM:
				return firstTerm != null;
			case ProcessMakerPackage.COMPARISON__SECOND_TERM:
				return secondTerm != null;
			case ProcessMakerPackage.COMPARISON__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ProcessMakerPackage.COMPARISON__TYPE:
				return type != TYPE_EDEFAULT;
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
		if (baseClass == TwoTermsOperation.class) {
			switch (derivedFeatureID) {
				case ProcessMakerPackage.COMPARISON__FIRST_TERM: return ProcessMakerPackage.TWO_TERMS_OPERATION__FIRST_TERM;
				case ProcessMakerPackage.COMPARISON__SECOND_TERM: return ProcessMakerPackage.TWO_TERMS_OPERATION__SECOND_TERM;
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
		if (baseClass == TwoTermsOperation.class) {
			switch (baseFeatureID) {
				case ProcessMakerPackage.TWO_TERMS_OPERATION__FIRST_TERM: return ProcessMakerPackage.COMPARISON__FIRST_TERM;
				case ProcessMakerPackage.TWO_TERMS_OPERATION__SECOND_TERM: return ProcessMakerPackage.COMPARISON__SECOND_TERM;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ComparisonImpl
