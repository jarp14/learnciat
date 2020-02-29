/**
 */
package lciat.impl;

import lciat.Awareness;
import lciat.LciatPackage;
import lciat.Tool;
import lciat.Traceability;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traceability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.TraceabilityImpl#getAwarelement <em>Awarelement</em>}</li>
 *   <li>{@link lciat.impl.TraceabilityImpl#getToolelement <em>Toolelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceabilityImpl extends LinkImpl implements Traceability {
	/**
	 * The cached value of the '{@link #getAwarelement() <em>Awarelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwarelement()
	 * @generated
	 * @ordered
	 */
	protected Awareness awarelement;

	/**
	 * The cached value of the '{@link #getToolelement() <em>Toolelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolelement()
	 * @generated
	 * @ordered
	 */
	protected Tool toolelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.TRACEABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Awareness getAwarelement() {
		if (awarelement != null && awarelement.eIsProxy()) {
			InternalEObject oldAwarelement = (InternalEObject)awarelement;
			awarelement = (Awareness)eResolveProxy(oldAwarelement);
			if (awarelement != oldAwarelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LciatPackage.TRACEABILITY__AWARELEMENT, oldAwarelement, awarelement));
			}
		}
		return awarelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Awareness basicGetAwarelement() {
		return awarelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwarelement(Awareness newAwarelement) {
		Awareness oldAwarelement = awarelement;
		awarelement = newAwarelement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.TRACEABILITY__AWARELEMENT, oldAwarelement, awarelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool getToolelement() {
		if (toolelement != null && toolelement.eIsProxy()) {
			InternalEObject oldToolelement = (InternalEObject)toolelement;
			toolelement = (Tool)eResolveProxy(oldToolelement);
			if (toolelement != oldToolelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LciatPackage.TRACEABILITY__TOOLELEMENT, oldToolelement, toolelement));
			}
		}
		return toolelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool basicGetToolelement() {
		return toolelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolelement(Tool newToolelement) {
		Tool oldToolelement = toolelement;
		toolelement = newToolelement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.TRACEABILITY__TOOLELEMENT, oldToolelement, toolelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LciatPackage.TRACEABILITY__AWARELEMENT:
				if (resolve) return getAwarelement();
				return basicGetAwarelement();
			case LciatPackage.TRACEABILITY__TOOLELEMENT:
				if (resolve) return getToolelement();
				return basicGetToolelement();
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
			case LciatPackage.TRACEABILITY__AWARELEMENT:
				setAwarelement((Awareness)newValue);
				return;
			case LciatPackage.TRACEABILITY__TOOLELEMENT:
				setToolelement((Tool)newValue);
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
			case LciatPackage.TRACEABILITY__AWARELEMENT:
				setAwarelement((Awareness)null);
				return;
			case LciatPackage.TRACEABILITY__TOOLELEMENT:
				setToolelement((Tool)null);
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
			case LciatPackage.TRACEABILITY__AWARELEMENT:
				return awarelement != null;
			case LciatPackage.TRACEABILITY__TOOLELEMENT:
				return toolelement != null;
		}
		return super.eIsSet(featureID);
	}

} //TraceabilityImpl
