/**
 */
package lciat.impl;

import lciat.DisablingWithInformationPassing;
import lciat.LciatPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disabling With Information Passing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.DisablingWithInformationPassingImpl#getDwLabel <em>Dw Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisablingWithInformationPassingImpl extends CTTLinkImpl implements DisablingWithInformationPassing {
	/**
	 * The default value of the '{@link #getDwLabel() <em>Dw Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDwLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String DW_LABEL_EDEFAULT = "[]|>";

	/**
	 * The cached value of the '{@link #getDwLabel() <em>Dw Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDwLabel()
	 * @generated
	 * @ordered
	 */
	protected String dwLabel = DW_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisablingWithInformationPassingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.DISABLING_WITH_INFORMATION_PASSING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDwLabel() {
		return dwLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LciatPackage.DISABLING_WITH_INFORMATION_PASSING__DW_LABEL:
				return getDwLabel();
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
			case LciatPackage.DISABLING_WITH_INFORMATION_PASSING__DW_LABEL:
				return DW_LABEL_EDEFAULT == null ? dwLabel != null : !DW_LABEL_EDEFAULT.equals(dwLabel);
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
		result.append(" (dwLabel: ");
		result.append(dwLabel);
		result.append(')');
		return result.toString();
	}

} //DisablingWithInformationPassingImpl
