/**
 */
package lciat.impl;

import lciat.EnablingWOInformation;
import lciat.LciatPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enabling WO Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.EnablingWOInformationImpl#getELabel <em>ELabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnablingWOInformationImpl extends LearningLinkImpl implements EnablingWOInformation {
	/**
	 * The default value of the '{@link #getELabel() <em>ELabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getELabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ELABEL_EDEFAULT = ">>";

	/**
	 * The cached value of the '{@link #getELabel() <em>ELabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getELabel()
	 * @generated
	 * @ordered
	 */
	protected String eLabel = ELABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnablingWOInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.ENABLING_WO_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getELabel() {
		return eLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LciatPackage.ENABLING_WO_INFORMATION__ELABEL:
				return getELabel();
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
			case LciatPackage.ENABLING_WO_INFORMATION__ELABEL:
				return ELABEL_EDEFAULT == null ? eLabel != null : !ELABEL_EDEFAULT.equals(eLabel);
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
		result.append(" (eLabel: ");
		result.append(eLabel);
		result.append(')');
		return result.toString();
	}

} //EnablingWOInformationImpl
