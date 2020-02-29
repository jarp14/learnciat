/**
 */
package lciat.impl;

import lciat.LciatPackage;
import lciat.UndeterministicChoice;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Undeterministic Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.UndeterministicChoiceImpl#getUcLabel <em>Uc Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UndeterministicChoiceImpl extends CTTLinkImpl implements UndeterministicChoice {
	/**
	 * The default value of the '{@link #getUcLabel() <em>Uc Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUcLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String UC_LABEL_EDEFAULT = "\u00c7";

	/**
	 * The cached value of the '{@link #getUcLabel() <em>Uc Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUcLabel()
	 * @generated
	 * @ordered
	 */
	protected String ucLabel = UC_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UndeterministicChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.UNDETERMINISTIC_CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUcLabel() {
		return ucLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LciatPackage.UNDETERMINISTIC_CHOICE__UC_LABEL:
				return getUcLabel();
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
			case LciatPackage.UNDETERMINISTIC_CHOICE__UC_LABEL:
				return UC_LABEL_EDEFAULT == null ? ucLabel != null : !UC_LABEL_EDEFAULT.equals(ucLabel);
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
		result.append(" (ucLabel: ");
		result.append(ucLabel);
		result.append(')');
		return result.toString();
	}

} //UndeterministicChoiceImpl
