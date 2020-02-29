/**
 */
package lciat.impl;

import java.util.Collection;

import lciat.AbstractTask;
import lciat.LciatPackage;
import lciat.LeftSideLearningNode;
import lciat.Modality;
import lciat.Subtype;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.AbstractTaskImpl#getTaskRoles <em>Task Roles</em>}</li>
 *   <li>{@link lciat.impl.AbstractTaskImpl#getTaskObjects <em>Task Objects</em>}</li>
 *   <li>{@link lciat.impl.AbstractTaskImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link lciat.impl.AbstractTaskImpl#getModality <em>Modality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractTaskImpl extends LearningActivityImpl implements AbstractTask {
	/**
	 * The cached value of the '{@link #getTaskRoles() <em>Task Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<LeftSideLearningNode> taskRoles;

	/**
	 * The cached value of the '{@link #getTaskObjects() <em>Task Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<lciat.Object> taskObjects;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected Subtype subtype;

	/**
	 * The cached value of the '{@link #getModality() <em>Modality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected Modality modality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.ABSTRACT_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LeftSideLearningNode> getTaskRoles() {
		if (taskRoles == null) {
			taskRoles = new EObjectContainmentEList<LeftSideLearningNode>(LeftSideLearningNode.class, this, LciatPackage.ABSTRACT_TASK__TASK_ROLES);
		}
		return taskRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<lciat.Object> getTaskObjects() {
		if (taskObjects == null) {
			taskObjects = new EObjectContainmentEList<lciat.Object>(lciat.Object.class, this, LciatPackage.ABSTRACT_TASK__TASK_OBJECTS);
		}
		return taskObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtype getSubtype() {
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtype(Subtype newSubtype, NotificationChain msgs) {
		Subtype oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LciatPackage.ABSTRACT_TASK__SUBTYPE, oldSubtype, newSubtype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(Subtype newSubtype) {
		if (newSubtype != subtype) {
			NotificationChain msgs = null;
			if (subtype != null)
				msgs = ((InternalEObject)subtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LciatPackage.ABSTRACT_TASK__SUBTYPE, null, msgs);
			if (newSubtype != null)
				msgs = ((InternalEObject)newSubtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LciatPackage.ABSTRACT_TASK__SUBTYPE, null, msgs);
			msgs = basicSetSubtype(newSubtype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.ABSTRACT_TASK__SUBTYPE, newSubtype, newSubtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modality getModality() {
		return modality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModality(Modality newModality, NotificationChain msgs) {
		Modality oldModality = modality;
		modality = newModality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LciatPackage.ABSTRACT_TASK__MODALITY, oldModality, newModality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModality(Modality newModality) {
		if (newModality != modality) {
			NotificationChain msgs = null;
			if (modality != null)
				msgs = ((InternalEObject)modality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LciatPackage.ABSTRACT_TASK__MODALITY, null, msgs);
			if (newModality != null)
				msgs = ((InternalEObject)newModality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LciatPackage.ABSTRACT_TASK__MODALITY, null, msgs);
			msgs = basicSetModality(newModality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.ABSTRACT_TASK__MODALITY, newModality, newModality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LciatPackage.ABSTRACT_TASK__TASK_ROLES:
				return ((InternalEList<?>)getTaskRoles()).basicRemove(otherEnd, msgs);
			case LciatPackage.ABSTRACT_TASK__TASK_OBJECTS:
				return ((InternalEList<?>)getTaskObjects()).basicRemove(otherEnd, msgs);
			case LciatPackage.ABSTRACT_TASK__SUBTYPE:
				return basicSetSubtype(null, msgs);
			case LciatPackage.ABSTRACT_TASK__MODALITY:
				return basicSetModality(null, msgs);
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
			case LciatPackage.ABSTRACT_TASK__TASK_ROLES:
				return getTaskRoles();
			case LciatPackage.ABSTRACT_TASK__TASK_OBJECTS:
				return getTaskObjects();
			case LciatPackage.ABSTRACT_TASK__SUBTYPE:
				return getSubtype();
			case LciatPackage.ABSTRACT_TASK__MODALITY:
				return getModality();
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
			case LciatPackage.ABSTRACT_TASK__TASK_ROLES:
				getTaskRoles().clear();
				getTaskRoles().addAll((Collection<? extends LeftSideLearningNode>)newValue);
				return;
			case LciatPackage.ABSTRACT_TASK__TASK_OBJECTS:
				getTaskObjects().clear();
				getTaskObjects().addAll((Collection<? extends lciat.Object>)newValue);
				return;
			case LciatPackage.ABSTRACT_TASK__SUBTYPE:
				setSubtype((Subtype)newValue);
				return;
			case LciatPackage.ABSTRACT_TASK__MODALITY:
				setModality((Modality)newValue);
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
			case LciatPackage.ABSTRACT_TASK__TASK_ROLES:
				getTaskRoles().clear();
				return;
			case LciatPackage.ABSTRACT_TASK__TASK_OBJECTS:
				getTaskObjects().clear();
				return;
			case LciatPackage.ABSTRACT_TASK__SUBTYPE:
				setSubtype((Subtype)null);
				return;
			case LciatPackage.ABSTRACT_TASK__MODALITY:
				setModality((Modality)null);
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
			case LciatPackage.ABSTRACT_TASK__TASK_ROLES:
				return taskRoles != null && !taskRoles.isEmpty();
			case LciatPackage.ABSTRACT_TASK__TASK_OBJECTS:
				return taskObjects != null && !taskObjects.isEmpty();
			case LciatPackage.ABSTRACT_TASK__SUBTYPE:
				return subtype != null;
			case LciatPackage.ABSTRACT_TASK__MODALITY:
				return modality != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractTaskImpl
