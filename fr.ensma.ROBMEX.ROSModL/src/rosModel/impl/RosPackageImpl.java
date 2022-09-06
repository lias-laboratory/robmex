/**
 */
package rosModel.impl;

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

import rosModel.MsgDataStruct;
import rosModel.Node;
import rosModel.RosModelPackage;
import rosModel.RosPackage;
import rosModel.Service;
import rosModel.SrvDataStruct;
import rosModel.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rosModel.impl.RosPackageImpl#getNode <em>Node</em>}</li>
 *   <li>{@link rosModel.impl.RosPackageImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link rosModel.impl.RosPackageImpl#getMsg <em>Msg</em>}</li>
 *   <li>{@link rosModel.impl.RosPackageImpl#getSrv <em>Srv</em>}</li>
 *   <li>{@link rosModel.impl.RosPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link rosModel.impl.RosPackageImpl#getService <em>Service</em>}</li>
 *   <li>{@link rosModel.impl.RosPackageImpl#getPath <em>Path</em>}</li>
 *   <li>{@link rosModel.impl.RosPackageImpl#getSubpackage <em>Subpackage</em>}</li>
 *   <li>{@link rosModel.impl.RosPackageImpl#isExists <em>Exists</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosPackageImpl extends MinimalEObjectImpl.Container implements RosPackage {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> topic;

	/**
	 * The cached value of the '{@link #getMsg() <em>Msg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsg()
	 * @generated
	 * @ordered
	 */
	protected EList<MsgDataStruct> msg;

	/**
	 * The cached value of the '{@link #getSrv() <em>Srv</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrv()
	 * @generated
	 * @ordered
	 */
	protected EList<SrvDataStruct> srv;

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
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubpackage() <em>Subpackage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpackage()
	 * @generated
	 * @ordered
	 */
	protected EList<RosPackage> subpackage;

	/**
	 * The default value of the '{@link #isExists() <em>Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExists()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXISTS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isExists() <em>Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExists()
	 * @generated
	 * @ordered
	 */
	protected boolean exists = EXISTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosModelPackage.Literals.ROS_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<Node>(Node.class, this, RosModelPackage.ROS_PACKAGE__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Topic> getTopic() {
		if (topic == null) {
			topic = new EObjectContainmentEList<Topic>(Topic.class, this, RosModelPackage.ROS_PACKAGE__TOPIC);
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MsgDataStruct> getMsg() {
		if (msg == null) {
			msg = new EObjectContainmentEList<MsgDataStruct>(MsgDataStruct.class, this, RosModelPackage.ROS_PACKAGE__MSG);
		}
		return msg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrvDataStruct> getSrv() {
		if (srv == null) {
			srv = new EObjectContainmentEList<SrvDataStruct>(SrvDataStruct.class, this, RosModelPackage.ROS_PACKAGE__SRV);
		}
		return srv;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RosModelPackage.ROS_PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<Service>(Service.class, this, RosModelPackage.ROS_PACKAGE__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosModelPackage.ROS_PACKAGE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RosPackage> getSubpackage() {
		if (subpackage == null) {
			subpackage = new EObjectContainmentEList<RosPackage>(RosPackage.class, this, RosModelPackage.ROS_PACKAGE__SUBPACKAGE);
		}
		return subpackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExists() {
		return exists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExists(boolean newExists) {
		boolean oldExists = exists;
		exists = newExists;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosModelPackage.ROS_PACKAGE__EXISTS, oldExists, exists));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RosModelPackage.ROS_PACKAGE__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case RosModelPackage.ROS_PACKAGE__TOPIC:
				return ((InternalEList<?>)getTopic()).basicRemove(otherEnd, msgs);
			case RosModelPackage.ROS_PACKAGE__MSG:
				return ((InternalEList<?>)getMsg()).basicRemove(otherEnd, msgs);
			case RosModelPackage.ROS_PACKAGE__SRV:
				return ((InternalEList<?>)getSrv()).basicRemove(otherEnd, msgs);
			case RosModelPackage.ROS_PACKAGE__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case RosModelPackage.ROS_PACKAGE__SUBPACKAGE:
				return ((InternalEList<?>)getSubpackage()).basicRemove(otherEnd, msgs);
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
			case RosModelPackage.ROS_PACKAGE__NODE:
				return getNode();
			case RosModelPackage.ROS_PACKAGE__TOPIC:
				return getTopic();
			case RosModelPackage.ROS_PACKAGE__MSG:
				return getMsg();
			case RosModelPackage.ROS_PACKAGE__SRV:
				return getSrv();
			case RosModelPackage.ROS_PACKAGE__NAME:
				return getName();
			case RosModelPackage.ROS_PACKAGE__SERVICE:
				return getService();
			case RosModelPackage.ROS_PACKAGE__PATH:
				return getPath();
			case RosModelPackage.ROS_PACKAGE__SUBPACKAGE:
				return getSubpackage();
			case RosModelPackage.ROS_PACKAGE__EXISTS:
				return isExists();
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
			case RosModelPackage.ROS_PACKAGE__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends Node>)newValue);
				return;
			case RosModelPackage.ROS_PACKAGE__TOPIC:
				getTopic().clear();
				getTopic().addAll((Collection<? extends Topic>)newValue);
				return;
			case RosModelPackage.ROS_PACKAGE__MSG:
				getMsg().clear();
				getMsg().addAll((Collection<? extends MsgDataStruct>)newValue);
				return;
			case RosModelPackage.ROS_PACKAGE__SRV:
				getSrv().clear();
				getSrv().addAll((Collection<? extends SrvDataStruct>)newValue);
				return;
			case RosModelPackage.ROS_PACKAGE__NAME:
				setName((String)newValue);
				return;
			case RosModelPackage.ROS_PACKAGE__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends Service>)newValue);
				return;
			case RosModelPackage.ROS_PACKAGE__PATH:
				setPath((String)newValue);
				return;
			case RosModelPackage.ROS_PACKAGE__SUBPACKAGE:
				getSubpackage().clear();
				getSubpackage().addAll((Collection<? extends RosPackage>)newValue);
				return;
			case RosModelPackage.ROS_PACKAGE__EXISTS:
				setExists((Boolean)newValue);
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
			case RosModelPackage.ROS_PACKAGE__NODE:
				getNode().clear();
				return;
			case RosModelPackage.ROS_PACKAGE__TOPIC:
				getTopic().clear();
				return;
			case RosModelPackage.ROS_PACKAGE__MSG:
				getMsg().clear();
				return;
			case RosModelPackage.ROS_PACKAGE__SRV:
				getSrv().clear();
				return;
			case RosModelPackage.ROS_PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RosModelPackage.ROS_PACKAGE__SERVICE:
				getService().clear();
				return;
			case RosModelPackage.ROS_PACKAGE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case RosModelPackage.ROS_PACKAGE__SUBPACKAGE:
				getSubpackage().clear();
				return;
			case RosModelPackage.ROS_PACKAGE__EXISTS:
				setExists(EXISTS_EDEFAULT);
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
			case RosModelPackage.ROS_PACKAGE__NODE:
				return node != null && !node.isEmpty();
			case RosModelPackage.ROS_PACKAGE__TOPIC:
				return topic != null && !topic.isEmpty();
			case RosModelPackage.ROS_PACKAGE__MSG:
				return msg != null && !msg.isEmpty();
			case RosModelPackage.ROS_PACKAGE__SRV:
				return srv != null && !srv.isEmpty();
			case RosModelPackage.ROS_PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RosModelPackage.ROS_PACKAGE__SERVICE:
				return service != null && !service.isEmpty();
			case RosModelPackage.ROS_PACKAGE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case RosModelPackage.ROS_PACKAGE__SUBPACKAGE:
				return subpackage != null && !subpackage.isEmpty();
			case RosModelPackage.ROS_PACKAGE__EXISTS:
				return exists != EXISTS_EDEFAULT;
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
		result.append(", path: ");
		result.append(path);
		result.append(", exists: ");
		result.append(exists);
		result.append(')');
		return result.toString();
	}

} //RosPackageImpl
