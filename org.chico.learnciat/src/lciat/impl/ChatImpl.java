/**
 */
package lciat.impl;

import lciat.Chat;
import lciat.Language;
import lciat.LciatPackage;
import lciat.Position;
import lciat.Size;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.ChatImpl#getName <em>Name</em>}</li>
 *   <li>{@link lciat.impl.ChatImpl#isIsStructured <em>Is Structured</em>}</li>
 *   <li>{@link lciat.impl.ChatImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link lciat.impl.ChatImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link lciat.impl.ChatImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChatImpl extends AwarenessImpl implements Chat {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Chat";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStructured() <em>Is Structured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStructured()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STRUCTURED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsStructured() <em>Is Structured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStructured()
	 * @generated
	 * @ordered
	 */
	protected boolean isStructured = IS_STRUCTURED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Position POSITION_EDEFAULT = Position.NONE;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final Language LANGUAGE_EDEFAULT = Language.NONE;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Size SIZE_EDEFAULT = Size.NONE;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Size size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.CHAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStructured() {
		return isStructured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStructured(boolean newIsStructured) {
		boolean oldIsStructured = isStructured;
		isStructured = newIsStructured;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.CHAT__IS_STRUCTURED, oldIsStructured, isStructured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		Position oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.CHAT__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Language newLanguage) {
		Language oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.CHAT__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Size newSize) {
		Size oldSize = size;
		size = newSize == null ? SIZE_EDEFAULT : newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.CHAT__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LciatPackage.CHAT__NAME:
				return getName();
			case LciatPackage.CHAT__IS_STRUCTURED:
				return isIsStructured();
			case LciatPackage.CHAT__POSITION:
				return getPosition();
			case LciatPackage.CHAT__LANGUAGE:
				return getLanguage();
			case LciatPackage.CHAT__SIZE:
				return getSize();
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
			case LciatPackage.CHAT__IS_STRUCTURED:
				setIsStructured((Boolean)newValue);
				return;
			case LciatPackage.CHAT__POSITION:
				setPosition((Position)newValue);
				return;
			case LciatPackage.CHAT__LANGUAGE:
				setLanguage((Language)newValue);
				return;
			case LciatPackage.CHAT__SIZE:
				setSize((Size)newValue);
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
			case LciatPackage.CHAT__IS_STRUCTURED:
				setIsStructured(IS_STRUCTURED_EDEFAULT);
				return;
			case LciatPackage.CHAT__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case LciatPackage.CHAT__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case LciatPackage.CHAT__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case LciatPackage.CHAT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LciatPackage.CHAT__IS_STRUCTURED:
				return isStructured != IS_STRUCTURED_EDEFAULT;
			case LciatPackage.CHAT__POSITION:
				return position != POSITION_EDEFAULT;
			case LciatPackage.CHAT__LANGUAGE:
				return language != LANGUAGE_EDEFAULT;
			case LciatPackage.CHAT__SIZE:
				return size != SIZE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isStructured: ");
		result.append(isStructured);
		result.append(", position: ");
		result.append(position);
		result.append(", language: ");
		result.append(language);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //ChatImpl
