/**
 */
package lciat.impl;

import lciat.Chat;
import lciat.LciatPackage;
import lciat.SessionPanel;
import lciat.Tool;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.ToolImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link lciat.impl.ToolImpl#getChat <em>Chat</em>}</li>
 *   <li>{@link lciat.impl.ToolImpl#getSessionPanel <em>Session Panel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToolImpl extends EObjectImpl implements Tool {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = "Tool";

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChat() <em>Chat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChat()
	 * @generated
	 * @ordered
	 */
	protected Chat chat;

	/**
	 * The cached value of the '{@link #getSessionPanel() <em>Session Panel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionPanel()
	 * @generated
	 * @ordered
	 */
	protected SessionPanel sessionPanel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.TOOL__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chat getChat() {
		if (chat != null && chat.eIsProxy()) {
			InternalEObject oldChat = (InternalEObject)chat;
			chat = (Chat)eResolveProxy(oldChat);
			if (chat != oldChat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LciatPackage.TOOL__CHAT, oldChat, chat));
			}
		}
		return chat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chat basicGetChat() {
		return chat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChat(Chat newChat) {
		Chat oldChat = chat;
		chat = newChat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.TOOL__CHAT, oldChat, chat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionPanel getSessionPanel() {
		if (sessionPanel != null && sessionPanel.eIsProxy()) {
			InternalEObject oldSessionPanel = (InternalEObject)sessionPanel;
			sessionPanel = (SessionPanel)eResolveProxy(oldSessionPanel);
			if (sessionPanel != oldSessionPanel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LciatPackage.TOOL__SESSION_PANEL, oldSessionPanel, sessionPanel));
			}
		}
		return sessionPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionPanel basicGetSessionPanel() {
		return sessionPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionPanel(SessionPanel newSessionPanel) {
		SessionPanel oldSessionPanel = sessionPanel;
		sessionPanel = newSessionPanel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LciatPackage.TOOL__SESSION_PANEL, oldSessionPanel, sessionPanel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LciatPackage.TOOL__KIND:
				return getKind();
			case LciatPackage.TOOL__CHAT:
				if (resolve) return getChat();
				return basicGetChat();
			case LciatPackage.TOOL__SESSION_PANEL:
				if (resolve) return getSessionPanel();
				return basicGetSessionPanel();
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
			case LciatPackage.TOOL__KIND:
				setKind((String)newValue);
				return;
			case LciatPackage.TOOL__CHAT:
				setChat((Chat)newValue);
				return;
			case LciatPackage.TOOL__SESSION_PANEL:
				setSessionPanel((SessionPanel)newValue);
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
			case LciatPackage.TOOL__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case LciatPackage.TOOL__CHAT:
				setChat((Chat)null);
				return;
			case LciatPackage.TOOL__SESSION_PANEL:
				setSessionPanel((SessionPanel)null);
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
			case LciatPackage.TOOL__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case LciatPackage.TOOL__CHAT:
				return chat != null;
			case LciatPackage.TOOL__SESSION_PANEL:
				return sessionPanel != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //ToolImpl
