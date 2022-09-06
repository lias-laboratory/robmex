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

import processMaker.CodeBlock;
import processMaker.Instructions;
import processMaker.LocalVariable;
import processMaker.ProcessMakerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link processMaker.impl.CodeBlockImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link processMaker.impl.CodeBlockImpl#getFirst <em>First</em>}</li>
 *   <li>{@link processMaker.impl.CodeBlockImpl#getName <em>Name</em>}</li>
 *   <li>{@link processMaker.impl.CodeBlockImpl#getInternalVariable <em>Internal Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CodeBlockImpl extends MinimalEObjectImpl.Container implements CodeBlock {
	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<Instructions> instructions;

	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected Instructions first;

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
	 * The cached value of the '{@link #getInternalVariable() <em>Internal Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalVariable> internalVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessMakerPackage.Literals.CODE_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instructions> getInstructions() {
		if (instructions == null) {
			instructions = new EObjectContainmentEList<Instructions>(Instructions.class, this, ProcessMakerPackage.CODE_BLOCK__INSTRUCTIONS);
		}
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getFirst() {
		if (first != null && first.eIsProxy()) {
			InternalEObject oldFirst = (InternalEObject)first;
			first = (Instructions)eResolveProxy(oldFirst);
			if (first != oldFirst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessMakerPackage.CODE_BLOCK__FIRST, oldFirst, first));
			}
		}
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions basicGetFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(Instructions newFirst) {
		Instructions oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.CODE_BLOCK__FIRST, oldFirst, first));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessMakerPackage.CODE_BLOCK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalVariable> getInternalVariable() {
		if (internalVariable == null) {
			internalVariable = new EObjectContainmentEList<LocalVariable>(LocalVariable.class, this, ProcessMakerPackage.CODE_BLOCK__INTERNAL_VARIABLE);
		}
		return internalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessMakerPackage.CODE_BLOCK__INSTRUCTIONS:
				return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
			case ProcessMakerPackage.CODE_BLOCK__INTERNAL_VARIABLE:
				return ((InternalEList<?>)getInternalVariable()).basicRemove(otherEnd, msgs);
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
			case ProcessMakerPackage.CODE_BLOCK__INSTRUCTIONS:
				return getInstructions();
			case ProcessMakerPackage.CODE_BLOCK__FIRST:
				if (resolve) return getFirst();
				return basicGetFirst();
			case ProcessMakerPackage.CODE_BLOCK__NAME:
				return getName();
			case ProcessMakerPackage.CODE_BLOCK__INTERNAL_VARIABLE:
				return getInternalVariable();
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
			case ProcessMakerPackage.CODE_BLOCK__INSTRUCTIONS:
				getInstructions().clear();
				getInstructions().addAll((Collection<? extends Instructions>)newValue);
				return;
			case ProcessMakerPackage.CODE_BLOCK__FIRST:
				setFirst((Instructions)newValue);
				return;
			case ProcessMakerPackage.CODE_BLOCK__NAME:
				setName((String)newValue);
				return;
			case ProcessMakerPackage.CODE_BLOCK__INTERNAL_VARIABLE:
				getInternalVariable().clear();
				getInternalVariable().addAll((Collection<? extends LocalVariable>)newValue);
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
			case ProcessMakerPackage.CODE_BLOCK__INSTRUCTIONS:
				getInstructions().clear();
				return;
			case ProcessMakerPackage.CODE_BLOCK__FIRST:
				setFirst((Instructions)null);
				return;
			case ProcessMakerPackage.CODE_BLOCK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessMakerPackage.CODE_BLOCK__INTERNAL_VARIABLE:
				getInternalVariable().clear();
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
			case ProcessMakerPackage.CODE_BLOCK__INSTRUCTIONS:
				return instructions != null && !instructions.isEmpty();
			case ProcessMakerPackage.CODE_BLOCK__FIRST:
				return first != null;
			case ProcessMakerPackage.CODE_BLOCK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessMakerPackage.CODE_BLOCK__INTERNAL_VARIABLE:
				return internalVariable != null && !internalVariable.isEmpty();
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

} //CodeBlockImpl
