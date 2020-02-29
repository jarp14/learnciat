/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphical Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.GraphicalEditor#getName <em>Name</em>}</li>
 *   <li>{@link lciat.GraphicalEditor#getTurnTakingTool <em>Turn Taking Tool</em>}</li>
 *   <li>{@link lciat.GraphicalEditor#getTelepointer <em>Telepointer</em>}</li>
 *   <li>{@link lciat.GraphicalEditor#getRadarView <em>Radar View</em>}</li>
 *   <li>{@link lciat.GraphicalEditor#getProperties <em>Properties</em>}</li>
 *   <li>{@link lciat.GraphicalEditor#getProblems <em>Problems</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getGraphicalEditor()
 * @model annotation="gmf.node label='name' tool.name='Graphical Editor' figure='polygon' resizable='false' label.icon='false' polygon.x='0 20 49 69 49 20' polygon.y='20 0 0 20 40 40' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/GraphicalEditor.gif'"
 * @generated
 */
public interface GraphicalEditor extends Tool {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Graph. Editor"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see lciat.LciatPackage#getGraphicalEditor_Name()
	 * @model default="Graph. Editor" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Turn Taking Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turn Taking Tool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turn Taking Tool</em>' reference.
	 * @see #setTurnTakingTool(TurnTakingTool)
	 * @see lciat.LciatPackage#getGraphicalEditor_TurnTakingTool()
	 * @model required="true"
	 * @generated
	 */
	TurnTakingTool getTurnTakingTool();

	/**
	 * Sets the value of the '{@link lciat.GraphicalEditor#getTurnTakingTool <em>Turn Taking Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turn Taking Tool</em>' reference.
	 * @see #getTurnTakingTool()
	 * @generated
	 */
	void setTurnTakingTool(TurnTakingTool value);

	/**
	 * Returns the value of the '<em><b>Telepointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telepointer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telepointer</em>' reference.
	 * @see #setTelepointer(Telepointer)
	 * @see lciat.LciatPackage#getGraphicalEditor_Telepointer()
	 * @model
	 * @generated
	 */
	Telepointer getTelepointer();

	/**
	 * Sets the value of the '{@link lciat.GraphicalEditor#getTelepointer <em>Telepointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telepointer</em>' reference.
	 * @see #getTelepointer()
	 * @generated
	 */
	void setTelepointer(Telepointer value);

	/**
	 * Returns the value of the '<em><b>Radar View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radar View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radar View</em>' reference.
	 * @see #setRadarView(RadarView)
	 * @see lciat.LciatPackage#getGraphicalEditor_RadarView()
	 * @model
	 * @generated
	 */
	RadarView getRadarView();

	/**
	 * Sets the value of the '{@link lciat.GraphicalEditor#getRadarView <em>Radar View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radar View</em>' reference.
	 * @see #getRadarView()
	 * @generated
	 */
	void setRadarView(RadarView value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference.
	 * @see #setProperties(Properties)
	 * @see lciat.LciatPackage#getGraphicalEditor_Properties()
	 * @model
	 * @generated
	 */
	Properties getProperties();

	/**
	 * Sets the value of the '{@link lciat.GraphicalEditor#getProperties <em>Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(Properties value);

	/**
	 * Returns the value of the '<em><b>Problems</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problems</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problems</em>' reference.
	 * @see #setProblems(Problems)
	 * @see lciat.LciatPackage#getGraphicalEditor_Problems()
	 * @model
	 * @generated
	 */
	Problems getProblems();

	/**
	 * Sets the value of the '{@link lciat.GraphicalEditor#getProblems <em>Problems</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problems</em>' reference.
	 * @see #getProblems()
	 * @generated
	 */
	void setProblems(Problems value);

} // GraphicalEditor
