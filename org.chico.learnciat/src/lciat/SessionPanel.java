/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.SessionPanel#getName <em>Name</em>}</li>
 *   <li>{@link lciat.SessionPanel#getPosition <em>Position</em>}</li>
 *   <li>{@link lciat.SessionPanel#getLanguage <em>Language</em>}</li>
 *   <li>{@link lciat.SessionPanel#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getSessionPanel()
 * @model annotation="gmf.node label='name' tool.name='Session Panel' figure='ellipse' resizable='false' label.icon='false' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/SessionPanel.gif'"
 * @generated
 */
public interface SessionPanel extends Awareness {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Session"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see lciat.LciatPackage#getSessionPanel_Name()
	 * @model default="Session" changeable="false"
	 * @generated
	 */
	String getName();

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
	 * @see lciat.LciatPackage#getSessionPanel_Position()
	 * @model
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link lciat.SessionPanel#getPosition <em>Position</em>}' attribute.
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
	 * @see lciat.LciatPackage#getSessionPanel_Language()
	 * @model
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link lciat.SessionPanel#getLanguage <em>Language</em>}' attribute.
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
	 * @see lciat.LciatPackage#getSessionPanel_Size()
	 * @model
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link lciat.SessionPanel#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see lciat.Size
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

} // SessionPanel
