/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.Properties#getName <em>Name</em>}</li>
 *   <li>{@link lciat.Properties#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getProperties()
 * @model annotation="gmf.node label='name' tool.name='Properties' figure='ellipse' resizable='false' label.icon='false' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/Properties.gif'"
 * @generated
 */
public interface Properties extends Awareness {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Properties"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see lciat.LciatPackage#getProperties_Name()
	 * @model default="Properties" changeable="false"
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
	 * @see lciat.LciatPackage#getProperties_Position()
	 * @model
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link lciat.Properties#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see lciat.Position
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

} // Properties
