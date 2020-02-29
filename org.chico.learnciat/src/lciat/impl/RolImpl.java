/**
 */
package lciat.impl;

import java.util.Collection;

import lciat.Group;
import lciat.LciatPackage;
import lciat.Rol;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.RolImpl#getItsGroup <em>Its Group</em>}</li>
 *   <li>{@link lciat.impl.RolImpl#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link lciat.impl.RolImpl#getSubtype <em>Subtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RolImpl extends SociogramNodeImpl implements Rol {
	/**
	 * The cached value of the '{@link #getItsGroup() <em>Its Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> itsGroup;

	/**
	 * The cached value of the '{@link #getSupertype() <em>Supertype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertype()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> supertype;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected EList<Rol> subtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.ROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getItsGroup() {
		if (itsGroup == null) {
			itsGroup = new EObjectResolvingEList<Group>(Group.class, this, LciatPackage.ROL__ITS_GROUP);
		}
		return itsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rol> getSupertype() {
		if (supertype == null) {
			supertype = new EObjectResolvingEList<Rol>(Rol.class, this, LciatPackage.ROL__SUPERTYPE);
		}
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rol> getSubtype() {
		if (subtype == null) {
			subtype = new EObjectResolvingEList<Rol>(Rol.class, this, LciatPackage.ROL__SUBTYPE);
		}
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LciatPackage.ROL__ITS_GROUP:
				return getItsGroup();
			case LciatPackage.ROL__SUPERTYPE:
				return getSupertype();
			case LciatPackage.ROL__SUBTYPE:
				return getSubtype();
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
			case LciatPackage.ROL__ITS_GROUP:
				getItsGroup().clear();
				getItsGroup().addAll((Collection<? extends Group>)newValue);
				return;
			case LciatPackage.ROL__SUPERTYPE:
				getSupertype().clear();
				getSupertype().addAll((Collection<? extends Rol>)newValue);
				return;
			case LciatPackage.ROL__SUBTYPE:
				getSubtype().clear();
				getSubtype().addAll((Collection<? extends Rol>)newValue);
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
			case LciatPackage.ROL__ITS_GROUP:
				getItsGroup().clear();
				return;
			case LciatPackage.ROL__SUPERTYPE:
				getSupertype().clear();
				return;
			case LciatPackage.ROL__SUBTYPE:
				getSubtype().clear();
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
			case LciatPackage.ROL__ITS_GROUP:
				return itsGroup != null && !itsGroup.isEmpty();
			case LciatPackage.ROL__SUPERTYPE:
				return supertype != null && !supertype.isEmpty();
			case LciatPackage.ROL__SUBTYPE:
				return subtype != null && !subtype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RolImpl
