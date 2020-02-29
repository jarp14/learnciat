/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radar View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.RadarView#getName <em>Name</em>}</li>
 *   <li>{@link lciat.RadarView#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getRadarView()
 * @model annotation="gmf.node label='name' tool.name='Radar View' figure='ellipse' resizable='false' label.icon='false' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/RadarView.gif'"
 * @generated
 */
public interface RadarView extends Awareness {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Radar"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see lciat.LciatPackage#getRadarView_Name()
	 * @model default="Radar" changeable="false"
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
	 * @see lciat.LciatPackage#getRadarView_Position()
	 * @model
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link lciat.RadarView#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see lciat.Position
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

} // RadarView
