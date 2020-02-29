/**
 */
package lciat.impl;

import lciat.Enabling;
import lciat.LciatPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enabling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.EnablingImpl#getELabel <em>ELabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnablingImpl extends CTTLinkImpl implements Enabling {
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
	protected EnablingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.ENABLING;
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
			case LciatPackage.ENABLING__ELABEL:
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
			case LciatPackage.ENABLING__ELABEL:
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

} //EnablingImpl
