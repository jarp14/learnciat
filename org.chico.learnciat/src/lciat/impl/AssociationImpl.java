/**
 */
package lciat.impl;

import lciat.Association;
import lciat.LciatPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.AssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link lciat.impl.AssociationImpl#getN <em>N</em>}</li>
 *   <li>{@link lciat.impl.AssociationImpl#getM <em>M</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends SociogramLinkImpl implements Association {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "(n..m)";

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
	 * The default value of the '{@link #getN() <em>N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN()
	 * @generated
	 * @ordered
	 */
	protected static final int N_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getN() <em>N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN()
	 * @generated
	 * @ordered
	 */
	protected int n = N_EDEFAULT;

	/**
	 * The default value of the '{@link #getM() <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM()
	 * @generated
	 * @ordered
	 */
	protected static final int M_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getM() <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM()
	 * @generated
	 * @ordered
	 */
	protected int m = M_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.ASSOCIATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.ASSOCIATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getN() {
		return n;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setN(int newN) {
		int oldN = n;
		n = newN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.ASSOCIATION__N, oldN, n));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getM() {
		return m;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM(int newM) {
		int oldM = m;
		m = newM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.ASSOCIATION__M, oldM, m));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LciatPackage.ASSOCIATION__NAME:
				return getName();
			case LciatPackage.ASSOCIATION__N:
				return getN();
			case LciatPackage.ASSOCIATION__M:
				return getM();
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
			case LciatPackage.ASSOCIATION__NAME:
				setName((String)newValue);
				return;
			case LciatPackage.ASSOCIATION__N:
				setN((Integer)newValue);
				return;
			case LciatPackage.ASSOCIATION__M:
				setM((Integer)newValue);
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
			case LciatPackage.ASSOCIATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LciatPackage.ASSOCIATION__N:
				setN(N_EDEFAULT);
				return;
			case LciatPackage.ASSOCIATION__M:
				setM(M_EDEFAULT);
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
			case LciatPackage.ASSOCIATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LciatPackage.ASSOCIATION__N:
				return n != N_EDEFAULT;
			case LciatPackage.ASSOCIATION__M:
				return m != M_EDEFAULT;
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
		result.append(", n: ");
		result.append(n);
		result.append(", m: ");
		result.append(m);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
