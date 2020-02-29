/**
 */
package lciat.impl;

import java.util.Collection;

import lciat.GroupTask;
import lciat.LciatPackage;
import lciat.LeftSideLearningNode;
import lciat.Modality;
import lciat.Subtype;
import lciat.Tool;

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
 * An implementation of the model object '<em><b>Group Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.GroupTaskImpl#getTaskRoles <em>Task Roles</em>}</li>
 *   <li>{@link lciat.impl.GroupTaskImpl#getTaskObjects <em>Task Objects</em>}</li>
 *   <li>{@link lciat.impl.GroupTaskImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link lciat.impl.GroupTaskImpl#getModality <em>Modality</em>}</li>
 *   <li>{@link lciat.impl.GroupTaskImpl#getEGL_Tool <em>EGL Tool</em>}</li>
 *   <li>{@link lciat.impl.GroupTaskImpl#isEGL_Transformation <em>EGL Transformation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupTaskImpl extends LearningActivityImpl implements GroupTask {
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
	 * The cached value of the '{@link #getEGL_Tool() <em>EGL Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEGL_Tool()
	 * @generated
	 * @ordered
	 */
	protected Tool egL_Tool;

	/**
	 * The default value of the '{@link #isEGL_Transformation() <em>EGL Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEGL_Transformation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EGL_TRANSFORMATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEGL_Transformation() <em>EGL Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEGL_Transformation()
	 * @generated
	 * @ordered
	 */
	protected boolean egL_Transformation = EGL_TRANSFORMATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.GROUP_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LeftSideLearningNode> getTaskRoles() {
		if (taskRoles == null) {
			taskRoles = new EObjectContainmentEList<LeftSideLearningNode>(LeftSideLearningNode.class, this, LciatPackage.GROUP_TASK__TASK_ROLES);
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
			taskObjects = new EObjectContainmentEList<lciat.Object>(lciat.Object.class, this, LciatPackage.GROUP_TASK__TASK_OBJECTS);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LciatPackage.GROUP_TASK__SUBTYPE, oldSubtype, newSubtype);
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
				msgs = ((InternalEObject)subtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LciatPackage.GROUP_TASK__SUBTYPE, null, msgs);
			if (newSubtype != null)
				msgs = ((InternalEObject)newSubtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LciatPackage.GROUP_TASK__SUBTYPE, null, msgs);
			msgs = basicSetSubtype(newSubtype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.GROUP_TASK__SUBTYPE, newSubtype, newSubtype));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LciatPackage.GROUP_TASK__MODALITY, oldModality, newModality);
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
				msgs = ((InternalEObject)modality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LciatPackage.GROUP_TASK__MODALITY, null, msgs);
			if (newModality != null)
				msgs = ((InternalEObject)newModality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LciatPackage.GROUP_TASK__MODALITY, null, msgs);
			msgs = basicSetModality(newModality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.GROUP_TASK__MODALITY, newModality, newModality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool getEGL_Tool() {
		if (egL_Tool != null && egL_Tool.eIsProxy()) {
			InternalEObject oldEGL_Tool = (InternalEObject)egL_Tool;
			egL_Tool = (Tool)eResolveProxy(oldEGL_Tool);
			if (egL_Tool != oldEGL_Tool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LciatPackage.GROUP_TASK__EGL_TOOL, oldEGL_Tool, egL_Tool));
			}
		}
		return egL_Tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool basicGetEGL_Tool() {
		return egL_Tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEGL_Tool(Tool newEGL_Tool) {
		Tool oldEGL_Tool = egL_Tool;
		egL_Tool = newEGL_Tool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.GROUP_TASK__EGL_TOOL, oldEGL_Tool, egL_Tool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEGL_Transformation() {
		return egL_Transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEGL_Transformation(boolean newEGL_Transformation) {
		boolean oldEGL_Transformation = egL_Transformation;
		egL_Transformation = newEGL_Transformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.GROUP_TASK__EGL_TRANSFORMATION, oldEGL_Transformation, egL_Transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LciatPackage.GROUP_TASK__TASK_ROLES:
				return ((InternalEList<?>)getTaskRoles()).basicRemove(otherEnd, msgs);
			case LciatPackage.GROUP_TASK__TASK_OBJECTS:
				return ((InternalEList<?>)getTaskObjects()).basicRemove(otherEnd, msgs);
			case LciatPackage.GROUP_TASK__SUBTYPE:
				return basicSetSubtype(null, msgs);
			case LciatPackage.GROUP_TASK__MODALITY:
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
			case LciatPackage.GROUP_TASK__TASK_ROLES:
				return getTaskRoles();
			case LciatPackage.GROUP_TASK__TASK_OBJECTS:
				return getTaskObjects();
			case LciatPackage.GROUP_TASK__SUBTYPE:
				return getSubtype();
			case LciatPackage.GROUP_TASK__MODALITY:
				return getModality();
			case LciatPackage.GROUP_TASK__EGL_TOOL:
				if (resolve) return getEGL_Tool();
				return basicGetEGL_Tool();
			case LciatPackage.GROUP_TASK__EGL_TRANSFORMATION:
				return isEGL_Transformation();
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
			case LciatPackage.GROUP_TASK__TASK_ROLES:
				getTaskRoles().clear();
				getTaskRoles().addAll((Collection<? extends LeftSideLearningNode>)newValue);
				return;
			case LciatPackage.GROUP_TASK__TASK_OBJECTS:
				getTaskObjects().clear();
				getTaskObjects().addAll((Collection<? extends lciat.Object>)newValue);
				return;
			case LciatPackage.GROUP_TASK__SUBTYPE:
				setSubtype((Subtype)newValue);
				return;
			case LciatPackage.GROUP_TASK__MODALITY:
				setModality((Modality)newValue);
				return;
			case LciatPackage.GROUP_TASK__EGL_TOOL:
				setEGL_Tool((Tool)newValue);
				return;
			case LciatPackage.GROUP_TASK__EGL_TRANSFORMATION:
				setEGL_Transformation((Boolean)newValue);
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
			case LciatPackage.GROUP_TASK__TASK_ROLES:
				getTaskRoles().clear();
				return;
			case LciatPackage.GROUP_TASK__TASK_OBJECTS:
				getTaskObjects().clear();
				return;
			case LciatPackage.GROUP_TASK__SUBTYPE:
				setSubtype((Subtype)null);
				return;
			case LciatPackage.GROUP_TASK__MODALITY:
				setModality((Modality)null);
				return;
			case LciatPackage.GROUP_TASK__EGL_TOOL:
				setEGL_Tool((Tool)null);
				return;
			case LciatPackage.GROUP_TASK__EGL_TRANSFORMATION:
				setEGL_Transformation(EGL_TRANSFORMATION_EDEFAULT);
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
			case LciatPackage.GROUP_TASK__TASK_ROLES:
				return taskRoles != null && !taskRoles.isEmpty();
			case LciatPackage.GROUP_TASK__TASK_OBJECTS:
				return taskObjects != null && !taskObjects.isEmpty();
			case LciatPackage.GROUP_TASK__SUBTYPE:
				return subtype != null;
			case LciatPackage.GROUP_TASK__MODALITY:
				return modality != null;
			case LciatPackage.GROUP_TASK__EGL_TOOL:
				return egL_Tool != null;
			case LciatPackage.GROUP_TASK__EGL_TRANSFORMATION:
				return egL_Transformation != EGL_TRANSFORMATION_EDEFAULT;
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
		result.append(" (EGL_Transformation: ");
		result.append(egL_Transformation);
		result.append(')');
		return result.toString();
	}

} //GroupTaskImpl
