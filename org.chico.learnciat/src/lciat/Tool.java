/**
 */
package lciat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.Tool#getKind <em>Kind</em>}</li>
 *   <li>{@link lciat.Tool#getChat <em>Chat</em>}</li>
 *   <li>{@link lciat.Tool#getSessionPanel <em>Session Panel</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getTool()
 * @model annotation="gmf.node label='kind' tool.name='Tool' figure='polygon' resizable='false' label.icon='false' polygon.x='0 20 49 69 49 20' polygon.y='20 0 0 20 40 40' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/Tool.gif'"
 * @generated
 */
public interface Tool extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"Tool"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see lciat.LciatPackage#getTool_Kind()
	 * @model default="Tool"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link lciat.Tool#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Chat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chat</em>' reference.
	 * @see #setChat(Chat)
	 * @see lciat.LciatPackage#getTool_Chat()
	 * @model
	 * @generated
	 */
	Chat getChat();

	/**
	 * Sets the value of the '{@link lciat.Tool#getChat <em>Chat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chat</em>' reference.
	 * @see #getChat()
	 * @generated
	 */
	void setChat(Chat value);

	/**
	 * Returns the value of the '<em><b>Session Panel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Panel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Panel</em>' reference.
	 * @see #setSessionPanel(SessionPanel)
	 * @see lciat.LciatPackage#getTool_SessionPanel()
	 * @model
	 * @generated
	 */
	SessionPanel getSessionPanel();

	/**
	 * Sets the value of the '{@link lciat.Tool#getSessionPanel <em>Session Panel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Panel</em>' reference.
	 * @see #getSessionPanel()
	 * @generated
	 */
	void setSessionPanel(SessionPanel value);

} // Tool
