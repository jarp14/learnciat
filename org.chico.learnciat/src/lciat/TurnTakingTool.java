/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn Taking Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.TurnTakingTool#getName <em>Name</em>}</li>
 *   <li>{@link lciat.TurnTakingTool#getPosition <em>Position</em>}</li>
 *   <li>{@link lciat.TurnTakingTool#getLanguage <em>Language</em>}</li>
 *   <li>{@link lciat.TurnTakingTool#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getTurnTakingTool()
 * @model annotation="gmf.node label='name' tool.name='TurnTaking Panel' figure='ellipse' resizable='false' label.icon='false' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/TurnTaking.gif'"
 * @generated
 */
public interface TurnTakingTool extends Awareness {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"TurnTaking"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see lciat.LciatPackage#getTurnTakingTool_Name()
	 * @model default="TurnTaking" changeable="false"
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
	 * @see lciat.LciatPackage#getTurnTakingTool_Position()
	 * @model
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link lciat.TurnTakingTool#getPosition <em>Position</em>}' attribute.
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
	 * @see lciat.LciatPackage#getTurnTakingTool_Language()
	 * @model
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link lciat.TurnTakingTool#getLanguage <em>Language</em>}' attribute.
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
	 * @see lciat.LciatPackage#getTurnTakingTool_Size()
	 * @model
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link lciat.TurnTakingTool#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see lciat.Size
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

} // TurnTakingTool
