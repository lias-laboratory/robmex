/**
 */
package processMaker.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import processMaker.OperationTerm;
import processMaker.ProcessMakerPackage;
import processMaker.TwoTermsOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Two Terms Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link processMaker.impl.TwoTermsOperationImpl#getFirstTerm <em>First Term</em>}</li>
 *   <li>{@link processMaker.impl.TwoTermsOperationImpl#getSecondTerm <em>Second Term</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TwoTermsOperationImpl extends MinimalEObjectImpl.Container implements TwoTermsOperation {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TwoTermsOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessMakerPackage.Literals.TWO_TERMS_OPERATION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.TWO_TERMS_OPERATION__FIRST_TERM, oldFirstTerm, newFirstTerm);
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
				msgs = ((InternalEObject)firstTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessMakerPackage.TWO_TERMS_OPERATION__FIRST_TERM, null, msgs);
			if (newFirstTerm != null)
				msgs = ((InternalEObject)newFirstTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessMakerPackage.TWO_TERMS_OPERATION__FIRST_TERM, null, msgs);
			msgs = basicSetFirstTerm(newFirstTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.TWO_TERMS_OPERATION__FIRST_TERM, newFirstTerm, newFirstTerm));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.TWO_TERMS_OPERATION__SECOND_TERM, oldSecondTerm, newSecondTerm);
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
				msgs = ((InternalEObject)secondTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessMakerPackage.TWO_TERMS_OPERATION__SECOND_TERM, null, msgs);
			if (newSecondTerm != null)
				msgs = ((InternalEObject)newSecondTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessMakerPackage.TWO_TERMS_OPERATION__SECOND_TERM, null, msgs);
			msgs = basicSetSecondTerm(newSecondTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.TWO_TERMS_OPERATION__SECOND_TERM, newSecondTerm, newSecondTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessMakerPackage.TWO_TERMS_OPERATION__FIRST_TERM:
				return basicSetFirstTerm(null, msgs);
			case ProcessMakerPackage.TWO_TERMS_OPERATION__SECOND_TERM:
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
			case ProcessMakerPackage.TWO_TERMS_OPERATION__FIRST_TERM:
				return getFirstTerm();
			case ProcessMakerPackage.TWO_TERMS_OPERATION__SECOND_TERM:
				return getSecondTerm();
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
			case ProcessMakerPackage.TWO_TERMS_OPERATION__FIRST_TERM:
				setFirstTerm((OperationTerm)newValue);
				return;
			case ProcessMakerPackage.TWO_TERMS_OPERATION__SECOND_TERM:
				setSecondTerm((OperationTerm)newValue);
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
			case ProcessMakerPackage.TWO_TERMS_OPERATION__FIRST_TERM:
				setFirstTerm((OperationTerm)null);
				return;
			case ProcessMakerPackage.TWO_TERMS_OPERATION__SECOND_TERM:
				setSecondTerm((OperationTerm)null);
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
			case ProcessMakerPackage.TWO_TERMS_OPERATION__FIRST_TERM:
				return firstTerm != null;
			case ProcessMakerPackage.TWO_TERMS_OPERATION__SECOND_TERM:
				return secondTerm != null;
		}
		return super.eIsSet(featureID);
	}

} //TwoTermsOperationImpl
