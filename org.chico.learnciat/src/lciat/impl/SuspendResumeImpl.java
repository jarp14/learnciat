/**
 */
package lciat.impl;

import lciat.LciatPackage;
import lciat.SuspendResume;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Suspend Resume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.SuspendResumeImpl#getSrLabel <em>Sr Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuspendResumeImpl extends CTTLinkImpl implements SuspendResume {
	/**
	 * The default value of the '{@link #getSrLabel() <em>Sr Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String SR_LABEL_EDEFAULT = "|>";

	/**
	 * The cached value of the '{@link #getSrLabel() <em>Sr Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrLabel()
	 * @generated
	 * @ordered
	 */
	protected String srLabel = SR_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuspendResumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.SUSPEND_RESUME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrLabel() {
		return srLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LciatPackage.SUSPEND_RESUME__SR_LABEL:
				return getSrLabel();
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
			case LciatPackage.SUSPEND_RESUME__SR_LABEL:
				return SR_LABEL_EDEFAULT == null ? srLabel != null : !SR_LABEL_EDEFAULT.equals(srLabel);
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
		result.append(" (srLabel: ");
		result.append(srLabel);
		result.append(')');
		return result.toString();
	}

} //SuspendResumeImpl
