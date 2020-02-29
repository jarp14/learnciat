/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.Chat#getName <em>Name</em>}</li>
 *   <li>{@link lciat.Chat#isIsStructured <em>Is Structured</em>}</li>
 *   <li>{@link lciat.Chat#getPosition <em>Position</em>}</li>
 *   <li>{@link lciat.Chat#getLanguage <em>Language</em>}</li>
 *   <li>{@link lciat.Chat#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getChat()
 * @model annotation="gmf.node label='name' tool.name='Chat' figure='ellipse' resizable='false' label.icon='false' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/Chat.gif'"
 * @generated
 */
public interface Chat extends Awareness {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Chat"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see lciat.LciatPackage#getChat_Name()
	 * @model default="Chat" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Is Structured</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Structured</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Structured</em>' attribute.
	 * @see #setIsStructured(boolean)
	 * @see lciat.LciatPackage#getChat_IsStructured()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsStructured();

	/**
	 * Sets the value of the '{@link lciat.Chat#isIsStructured <em>Is Structured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Structured</em>' attribute.
	 * @see #isIsStructured()
	 * @generated
	 */
	void setIsStructured(boolean value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link lciat.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see lciat.Position
	 * @see #setPosition(Position)
	 * @see lciat.LciatPackage#getChat_Position()
	 * @model
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link lciat.Chat#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see lciat.Position
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link lciat.Language}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see lciat.Language
	 * @see #setLanguage(Language)
	 * @see lciat.LciatPackage#getChat_Language()
	 * @model
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link lciat.Chat#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see lciat.Language
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link lciat.Size}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see lciat.Size
	 * @see #setSize(Size)
	 * @see lciat.LciatPackage#getChat_Size()
	 * @model
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link lciat.Chat#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see lciat.Size
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

} // Chat
