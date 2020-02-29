/**
 */
package lciat.impl;

import lciat.LciatPackage;
import lciat.OrderIndependence;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Independence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.OrderIndependenceImpl#getOiLabel <em>Oi Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderIndependenceImpl extends CTTLinkImpl implements OrderIndependence {
	/**
	 * The default value of the '{@link #getOiLabel() <em>Oi Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOiLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String OI_LABEL_EDEFAULT = "|=|";

	/**
	 * The cached value of the '{@link #getOiLabel() <em>Oi Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOiLabel()
	 * @generated
	 * @ordered
	 */
	protected String oiLabel = OI_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderIndependenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.ORDER_INDEPENDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOiLabel() {
		return oiLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LciatPackage.ORDER_INDEPENDENCE__OI_LABEL:
				return getOiLabel();
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
			case LciatPackage.ORDER_INDEPENDENCE__OI_LABEL:
				return OI_LABEL_EDEFAULT == null ? oiLabel != null : !OI_LABEL_EDEFAULT.equals(oiLabel);
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
		result.append(" (oiLabel: ");
		result.append(oiLabel);
		result.append(')');
		return result.toString();
	}

} //OrderIndependenceImpl
