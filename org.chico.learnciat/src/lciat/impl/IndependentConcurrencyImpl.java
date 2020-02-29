/**
 */
package lciat.impl;

import lciat.IndependentConcurrency;
import lciat.LciatPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Independent Concurrency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.IndependentConcurrencyImpl#getIcLabel <em>Ic Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndependentConcurrencyImpl extends CTTLinkImpl implements IndependentConcurrency {
	/**
	 * The default value of the '{@link #getIcLabel() <em>Ic Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String IC_LABEL_EDEFAULT = "|||";

	/**
	 * The cached value of the '{@link #getIcLabel() <em>Ic Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcLabel()
	 * @generated
	 * @ordered
	 */
	protected String icLabel = IC_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndependentConcurrencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.INDEPENDENT_CONCURRENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcLabel() {
		return icLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LciatPackage.INDEPENDENT_CONCURRENCY__IC_LABEL:
				return getIcLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LciatPackage.INDEPENDENT_CONCURRENCY__IC_LABEL:
				return IC_LABEL_EDEFAULT == null ? icLabel != null : !IC_LABEL_EDEFAULT.equals(icLabel);
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
		result.append(" (icLabel: ");
		result.append(icLabel);
		result.append(')');
		return result.toString();
	}

} //IndependentConcurrencyImpl
