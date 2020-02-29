/**
 */
package lciat.impl;

import lciat.EnablingWithInformationPassing;
import lciat.LciatPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enabling With Information Passing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.EnablingWithInformationPassingImpl#getEwLabel <em>Ew Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnablingWithInformationPassingImpl extends CTTLinkImpl implements EnablingWithInformationPassing {
	/**
	 * The default value of the '{@link #getEwLabel() <em>Ew Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEwLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String EW_LABEL_EDEFAULT = "[]>>";

	/**
	 * The cached value of the '{@link #getEwLabel() <em>Ew Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEwLabel()
	 * @generated
	 * @ordered
	 */
	protected String ewLabel = EW_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnablingWithInformationPassingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.ENABLING_WITH_INFORMATION_PASSING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEwLabel() {
		return ewLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEwLabel(String newEwLabel) {
		String oldEwLabel = ewLabel;
		ewLabel = newEwLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.ENABLING_WITH_INFORMATION_PASSING__EW_LABEL, oldEwLabel, ewLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LciatPackage.ENABLING_WITH_INFORMATION_PASSING__EW_LABEL:
				return getEwLabel();
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
			case LciatPackage.ENABLING_WITH_INFORMATION_PASSING__EW_LABEL:
				setEwLabel((String)newValue);
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
			case LciatPackage.ENABLING_WITH_INFORMATION_PASSING__EW_LABEL:
				setEwLabel(EW_LABEL_EDEFAULT);
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
			case LciatPackage.ENABLING_WITH_INFORMATION_PASSING__EW_LABEL:
				return EW_LABEL_EDEFAULT == null ? ewLabel != null : !EW_LABEL_EDEFAULT.equals(ewLabel);
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
		result.append(" (ewLabel: ");
		result.append(ewLabel);
		result.append(')');
		return result.toString();
	}

} //EnablingWithInformationPassingImpl
