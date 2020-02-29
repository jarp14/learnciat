/**
 */
package lciat.impl;

import java.util.Collection;

import lciat.LciatPackage;
import lciat.MolefContentNode;
import lciat.Sociogram;
import lciat.SociogramNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sociogram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.SociogramImpl#getName <em>Name</em>}</li>
 *   <li>{@link lciat.impl.SociogramImpl#getItsSociogramNodes <em>Its Sociogram Nodes</em>}</li>
 *   <li>{@link lciat.impl.SociogramImpl#getMfContentNodes <em>Mf Content Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SociogramImpl extends EObjectImpl implements Sociogram {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Sociogram :: ";

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
	 * The cached value of the '{@link #getItsSociogramNodes() <em>Its Sociogram Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsSociogramNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<SociogramNode> itsSociogramNodes;

	/**
	 * The cached value of the '{@link #getMfContentNodes() <em>Mf Content Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMfContentNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<MolefContentNode> mfContentNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SociogramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.SOCIOGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.SOCIOGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SociogramNode> getItsSociogramNodes() {
		if (itsSociogramNodes == null) {
			itsSociogramNodes = new EObjectContainmentEList<SociogramNode>(SociogramNode.class, this, LciatPackage.SOCIOGRAM__ITS_SOCIOGRAM_NODES);
		}
		return itsSociogramNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MolefContentNode> getMfContentNodes() {
		if (mfContentNodes == null) {
			mfContentNodes = new EObjectContainmentEList<MolefContentNode>(MolefContentNode.class, this, LciatPackage.SOCIOGRAM__MF_CONTENT_NODES);
		}
		return mfContentNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LciatPackage.SOCIOGRAM__ITS_SOCIOGRAM_NODES:
				return ((InternalEList<?>)getItsSociogramNodes()).basicRemove(otherEnd, msgs);
			case LciatPackage.SOCIOGRAM__MF_CONTENT_NODES:
				return ((InternalEList<?>)getMfContentNodes()).basicRemove(otherEnd, msgs);
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
			case LciatPackage.SOCIOGRAM__NAME:
				return getName();
			case LciatPackage.SOCIOGRAM__ITS_SOCIOGRAM_NODES:
				return getItsSociogramNodes();
			case LciatPackage.SOCIOGRAM__MF_CONTENT_NODES:
				return getMfContentNodes();
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
			case LciatPackage.SOCIOGRAM__NAME:
				setName((String)newValue);
				return;
			case LciatPackage.SOCIOGRAM__ITS_SOCIOGRAM_NODES:
				getItsSociogramNodes().clear();
				getItsSociogramNodes().addAll((Collection<? extends SociogramNode>)newValue);
				return;
			case LciatPackage.SOCIOGRAM__MF_CONTENT_NODES:
				getMfContentNodes().clear();
				getMfContentNodes().addAll((Collection<? extends MolefContentNode>)newValue);
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
			case LciatPackage.SOCIOGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LciatPackage.SOCIOGRAM__ITS_SOCIOGRAM_NODES:
				getItsSociogramNodes().clear();
				return;
			case LciatPackage.SOCIOGRAM__MF_CONTENT_NODES:
				getMfContentNodes().clear();
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
			case LciatPackage.SOCIOGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LciatPackage.SOCIOGRAM__ITS_SOCIOGRAM_NODES:
				return itsSociogramNodes != null && !itsSociogramNodes.isEmpty();
			case LciatPackage.SOCIOGRAM__MF_CONTENT_NODES:
				return mfContentNodes != null && !mfContentNodes.isEmpty();
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

} //SociogramImpl
