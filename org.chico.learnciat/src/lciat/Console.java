/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Console</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.Console#getName <em>Name</em>}</li>
 *   <li>{@link lciat.Console#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getConsole()
 * @model annotation="gmf.node label='name' tool.name='Console' figure='ellipse' resizable='false' label.icon='false' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/Console.gif'"
 * @generated
 */
public interface Console extends Awareness {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Console"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see lciat.LciatPackage#getConsole_Name()
	 * @model default="Console" changeable="false"
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
	 * @see lciat.LciatPackage#getConsole_Position()
	 * @model
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link lciat.Console#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see lciat.Position
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

} // Console
