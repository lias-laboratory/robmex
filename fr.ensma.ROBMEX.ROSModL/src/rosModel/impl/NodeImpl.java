/**
 */
package rosModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import rosModel.Node;
import rosModel.RosModelPackage;
import rosModel.Service;
import rosModel.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rosModel.impl.NodeImpl#getSubscribeTo <em>Subscribe To</em>}</li>
 *   <li>{@link rosModel.impl.NodeImpl#getPublishTo <em>Publish To</em>}</li>
 *   <li>{@link rosModel.impl.NodeImpl#getClientOf <em>Client Of</em>}</li>
 *   <li>{@link rosModel.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link rosModel.impl.NodeImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link rosModel.impl.NodeImpl#getServerOf <em>Server Of</em>}</li>
 *   <li>{@link rosModel.impl.NodeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rosModel.impl.NodeImpl#getCodeReference <em>Code Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The cached value of the '{@link #getSubscribeTo() <em>Subscribe To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribeTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> subscribeTo;

	/**
	 * The cached value of the '{@link #getPublishTo() <em>Publish To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> publishTo;

	/**
	 * The cached value of the '{@link #getClientOf() <em>Client Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> clientOf;

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
	 * The cached value of the '{@link #getServerOf() <em>Server Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> serverOf;

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
	 * The default value of the '{@link #getCodeReference() <em>Code Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeReference() <em>Code Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeReference()
	 * @generated
	 * @ordered
	 */
	protected String codeReference = CODE_REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosModelPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Topic> getSubscribeTo() {
		if (subscribeTo == null) {
			subscribeTo = new EObjectResolvingEList<Topic>(Topic.class, this, RosModelPackage.NODE__SUBSCRIBE_TO);
		}
		return subscribeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Topic> getPublishTo() {
		if (publishTo == null) {
			publishTo = new EObjectResolvingEList<Topic>(Topic.class, this, RosModelPackage.NODE__PUBLISH_TO);
		}
		return publishTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getClientOf() {
		if (clientOf == null) {
			clientOf = new EObjectResolvingEList<Service>(Service.class, this, RosModelPackage.NODE__CLIENT_OF);
		}
		return clientOf;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RosModelPackage.NODE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RosModelPackage.NODE__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServerOf() {
		if (serverOf == null) {
			serverOf = new EObjectResolvingEList<Service>(Service.class, this, RosModelPackage.NODE__SERVER_OF);
		}
		return serverOf;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RosModelPackage.NODE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeReference() {
		return codeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeReference(String newCodeReference) {
		String oldCodeReference = codeReference;
		codeReference = newCodeReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosModelPackage.NODE__CODE_REFERENCE, oldCodeReference, codeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RosModelPackage.NODE__SUBSCRIBE_TO:
				return getSubscribeTo();
			case RosModelPackage.NODE__PUBLISH_TO:
				return getPublishTo();
			case RosModelPackage.NODE__CLIENT_OF:
				return getClientOf();
			case RosModelPackage.NODE__NAME:
				return getName();
			case RosModelPackage.NODE__FREQUENCY:
				return getFrequency();
			case RosModelPackage.NODE__SERVER_OF:
				return getServerOf();
			case RosModelPackage.NODE__DESCRIPTION:
				return getDescription();
			case RosModelPackage.NODE__CODE_REFERENCE:
				return getCodeReference();
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
			case RosModelPackage.NODE__SUBSCRIBE_TO:
				getSubscribeTo().clear();
				getSubscribeTo().addAll((Collection<? extends Topic>)newValue);
				return;
			case RosModelPackage.NODE__PUBLISH_TO:
				getPublishTo().clear();
				getPublishTo().addAll((Collection<? extends Topic>)newValue);
				return;
			case RosModelPackage.NODE__CLIENT_OF:
				getClientOf().clear();
				getClientOf().addAll((Collection<? extends Service>)newValue);
				return;
			case RosModelPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case RosModelPackage.NODE__FREQUENCY:
				setFrequency((Float)newValue);
				return;
			case RosModelPackage.NODE__SERVER_OF:
				getServerOf().clear();
				getServerOf().addAll((Collection<? extends Service>)newValue);
				return;
			case RosModelPackage.NODE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RosModelPackage.NODE__CODE_REFERENCE:
				setCodeReference((String)newValue);
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
			case RosModelPackage.NODE__SUBSCRIBE_TO:
				getSubscribeTo().clear();
				return;
			case RosModelPackage.NODE__PUBLISH_TO:
				getPublishTo().clear();
				return;
			case RosModelPackage.NODE__CLIENT_OF:
				getClientOf().clear();
				return;
			case RosModelPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RosModelPackage.NODE__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case RosModelPackage.NODE__SERVER_OF:
				getServerOf().clear();
				return;
			case RosModelPackage.NODE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RosModelPackage.NODE__CODE_REFERENCE:
				setCodeReference(CODE_REFERENCE_EDEFAULT);
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
			case RosModelPackage.NODE__SUBSCRIBE_TO:
				return subscribeTo != null && !subscribeTo.isEmpty();
			case RosModelPackage.NODE__PUBLISH_TO:
				return publishTo != null && !publishTo.isEmpty();
			case RosModelPackage.NODE__CLIENT_OF:
				return clientOf != null && !clientOf.isEmpty();
			case RosModelPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RosModelPackage.NODE__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case RosModelPackage.NODE__SERVER_OF:
				return serverOf != null && !serverOf.isEmpty();
			case RosModelPackage.NODE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RosModelPackage.NODE__CODE_REFERENCE:
				return CODE_REFERENCE_EDEFAULT == null ? codeReference != null : !CODE_REFERENCE_EDEFAULT.equals(codeReference);
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
		result.append(", description: ");
		result.append(description);
		result.append(", codeReference: ");
		result.append(codeReference);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
