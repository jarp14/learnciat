/**
 */
package lciat.impl;

import java.util.Collection;

import lciat.LciatPackage;
import lciat.LearningActivity;
import lciat.Modalities;
import lciat.Subtypes;
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
 * An implementation of the model object '<em><b>Learning Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.LearningActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link lciat.impl.LearningActivityImpl#getItsModality <em>Its Modality</em>}</li>
 *   <li>{@link lciat.impl.LearningActivityImpl#getItsSubtype <em>Its Subtype</em>}</li>
 *   <li>{@link lciat.impl.LearningActivityImpl#getTools <em>Tools</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LearningActivityImpl extends LearningNodeImpl implements LearningActivity {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "<...>";

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
	 * The default value of the '{@link #getItsModality() <em>Its Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsModality()
	 * @generated
	 * @ordered
	 */
	protected static final Modalities ITS_MODALITY_EDEFAULT = Modalities.NONE;

	/**
	 * The cached value of the '{@link #getItsModality() <em>Its Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsModality()
	 * @generated
	 * @ordered
	 */
	protected Modalities itsModality = ITS_MODALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getItsSubtype() <em>Its Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final Subtypes ITS_SUBTYPE_EDEFAULT = Subtypes.NONE;

	/**
	 * The cached value of the '{@link #getItsSubtype() <em>Its Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsSubtype()
	 * @generated
	 * @ordered
	 */
	protected Subtypes itsSubtype = ITS_SUBTYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTools() <em>Tools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTools()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool> tools;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LearningActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.LEARNING_ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.LEARNING_ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modalities getItsModality() {
		return itsModality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsModality(Modalities newItsModality) {
		Modalities oldItsModality = itsModality;
		itsModality = newItsModality == null ? ITS_MODALITY_EDEFAULT : newItsModality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.LEARNING_ACTIVITY__ITS_MODALITY, oldItsModality, itsModality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtypes getItsSubtype() {
		return itsSubtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsSubtype(Subtypes newItsSubtype) {
		Subtypes oldItsSubtype = itsSubtype;
		itsSubtype = newItsSubtype == null ? ITS_SUBTYPE_EDEFAULT : newItsSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.LEARNING_ACTIVITY__ITS_SUBTYPE, oldItsSubtype, itsSubtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tool> getTools() {
		if (tools == null) {
			tools = new EObjectContainmentEList<Tool>(Tool.class, this, LciatPackage.LEARNING_ACTIVITY__TOOLS);
		}
		return tools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LciatPackage.LEARNING_ACTIVITY__TOOLS:
				return ((InternalEList<?>)getTools()).basicRemove(otherEnd, msgs);
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
			case LciatPackage.LEARNING_ACTIVITY__NAME:
				return getName();
			case LciatPackage.LEARNING_ACTIVITY__ITS_MODALITY:
				return getItsModality();
			case LciatPackage.LEARNING_ACTIVITY__ITS_SUBTYPE:
				return getItsSubtype();
			case LciatPackage.LEARNING_ACTIVITY__TOOLS:
				return getTools();
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
			case LciatPackage.LEARNING_ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case LciatPackage.LEARNING_ACTIVITY__ITS_MODALITY:
				setItsModality((Modalities)newValue);
				return;
			case LciatPackage.LEARNING_ACTIVITY__ITS_SUBTYPE:
				setItsSubtype((Subtypes)newValue);
				return;
			case LciatPackage.LEARNING_ACTIVITY__TOOLS:
				getTools().clear();
				getTools().addAll((Collection<? extends Tool>)newValue);
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
			case LciatPackage.LEARNING_ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LciatPackage.LEARNING_ACTIVITY__ITS_MODALITY:
				setItsModality(ITS_MODALITY_EDEFAULT);
				return;
			case LciatPackage.LEARNING_ACTIVITY__ITS_SUBTYPE:
				setItsSubtype(ITS_SUBTYPE_EDEFAULT);
				return;
			case LciatPackage.LEARNING_ACTIVITY__TOOLS:
				getTools().clear();
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
			case LciatPackage.LEARNING_ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LciatPackage.LEARNING_ACTIVITY__ITS_MODALITY:
				return itsModality != ITS_MODALITY_EDEFAULT;
			case LciatPackage.LEARNING_ACTIVITY__ITS_SUBTYPE:
				return itsSubtype != ITS_SUBTYPE_EDEFAULT;
			case LciatPackage.LEARNING_ACTIVITY__TOOLS:
				return tools != null && !tools.isEmpty();
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
		result.append(", itsModality: ");
		result.append(itsModality);
		result.append(", itsSubtype: ");
		result.append(itsSubtype);
		result.append(')');
		return result.toString();
	}

} //LearningActivityImpl
