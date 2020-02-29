/**
 */
package lciat.impl;

import lciat.DeterministicChoice;
import lciat.LciatPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deterministic Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.DeterministicChoiceImpl#getDtLabel <em>Dt Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeterministicChoiceImpl extends CTTLinkImpl implements DeterministicChoice {
	/**
	 * The default value of the '{@link #getDtLabel() <em>Dt Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String DT_LABEL_EDEFAULT = "[]";

	/**
	 * The cached value of the '{@link #getDtLabel() <em>Dt Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtLabel()
	 * @generated
	 * @ordered
	 */
	protected String dtLabel = DT_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeterministicChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.DETERMINISTIC_CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDtLabel() {
		return dtLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LciatPackage.DETERMINISTIC_CHOICE__DT_LABEL:
				return getDtLabel();
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
			case LciatPackage.DETERMINISTIC_CHOICE__DT_LABEL:
				return DT_LABEL_EDEFAULT == null ? dtLabel != null : !DT_LABEL_EDEFAULT.equals(dtLabel);
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
		result.append(" (dtLabel: ");
		result.append(dtLabel);
		result.append(')');
		return result.toString();
	}

} //DeterministicChoiceImpl
