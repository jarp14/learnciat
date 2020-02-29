/**
 */
package lciat.impl;

import lciat.LciatPackage;
import lciat.MolefSocial1;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molef Social1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.MolefSocial1Impl#getCharacteristic <em>Characteristic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MolefSocial1Impl extends MolefSocialNodeImpl implements MolefSocial1 {
	/**
	 * The default value of the '{@link #getCharacteristic() <em>Characteristic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARACTERISTIC_EDEFAULT = "There are opportunities for students to do projects or group work";

	/**
	 * The cached value of the '{@link #getCharacteristic() <em>Characteristic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected String characteristic = CHARACTERISTIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolefSocial1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.MOLEF_SOCIAL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharacteristic() {
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LciatPackage.MOLEF_SOCIAL1__CHARACTERISTIC:
				return getCharacteristic();
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
			case LciatPackage.MOLEF_SOCIAL1__CHARACTERISTIC:
				return CHARACTERISTIC_EDEFAULT == null ? characteristic != null : !CHARACTERISTIC_EDEFAULT.equals(characteristic);
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
		result.append(" (characteristic: ");
		result.append(characteristic);
		result.append(')');
		return result.toString();
	}

} //MolefSocial1Impl
