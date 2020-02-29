/**
 */
package lciat.impl;

import lciat.ConcurrencyWithInformationPassing;
import lciat.LciatPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concurrency With Information Passing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.ConcurrencyWithInformationPassingImpl#getCLabel <em>CLabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcurrencyWithInformationPassingImpl extends CTTLinkImpl implements ConcurrencyWithInformationPassing {
	/**
	 * The default value of the '{@link #getCLabel() <em>CLabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String CLABEL_EDEFAULT = "|[]|";

	/**
	 * The cached value of the '{@link #getCLabel() <em>CLabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCLabel()
	 * @generated
	 * @ordered
	 */
	protected String cLabel = CLABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcurrencyWithInformationPassingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.CONCURRENCY_WITH_INFORMATION_PASSING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCLabel() {
		return cLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LciatPackage.CONCURRENCY_WITH_INFORMATION_PASSING__CLABEL:
				return getCLabel();
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
			case LciatPackage.CONCURRENCY_WITH_INFORMATION_PASSING__CLABEL:
				return CLABEL_EDEFAULT == null ? cLabel != null : !CLABEL_EDEFAULT.equals(cLabel);
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
		result.append(" (cLabel: ");
		result.append(cLabel);
		result.append(')');
		return result.toString();
	}

} //ConcurrencyWithInformationPassingImpl
