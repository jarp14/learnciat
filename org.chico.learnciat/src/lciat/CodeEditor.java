/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.CodeEditor#getName <em>Name</em>}</li>
 *   <li>{@link lciat.CodeEditor#getTurnTakingTool <em>Turn Taking Tool</em>}</li>
 *   <li>{@link lciat.CodeEditor#getRadarView <em>Radar View</em>}</li>
 *   <li>{@link lciat.CodeEditor#getConsole <em>Console</em>}</li>
 *   <li>{@link lciat.CodeEditor#getProblems <em>Problems</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getCodeEditor()
 * @model annotation="gmf.node label='name' tool.name='Code Editor' figure='polygon' resizable='false' label.icon='false' polygon.x='0 20 49 69 49 20' polygon.y='20 0 0 20 40 40' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/CodeEditor.gif'"
 * @generated
 */
public interface CodeEditor extends Tool {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Code Editor"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see lciat.LciatPackage#getCodeEditor_Name()
	 * @model default="Code Editor" changeable="false"
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
	 * @see lciat.LciatPackage#getCodeEditor_TurnTakingTool()
	 * @model required="true"
	 * @generated
	 */
	TurnTakingTool getTurnTakingTool();

	/**
	 * Sets the value of the '{@link lciat.CodeEditor#getTurnTakingTool <em>Turn Taking Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turn Taking Tool</em>' reference.
	 * @see #getTurnTakingTool()
	 * @generated
	 */
	void setTurnTakingTool(TurnTakingTool value);

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
	 * @see lciat.LciatPackage#getCodeEditor_RadarView()
	 * @model
	 * @generated
	 */
	RadarView getRadarView();

	/**
	 * Sets the value of the '{@link lciat.CodeEditor#getRadarView <em>Radar View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radar View</em>' reference.
	 * @see #getRadarView()
	 * @generated
	 */
	void setRadarView(RadarView value);

	/**
	 * Returns the value of the '<em><b>Console</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Console</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Console</em>' reference.
	 * @see #setConsole(Console)
	 * @see lciat.LciatPackage#getCodeEditor_Console()
	 * @model
	 * @generated
	 */
	Console getConsole();

	/**
	 * Sets the value of the '{@link lciat.CodeEditor#getConsole <em>Console</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Console</em>' reference.
	 * @see #getConsole()
	 * @generated
	 */
	void setConsole(Console value);

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
	 * @see lciat.LciatPackage#getCodeEditor_Problems()
	 * @model
	 * @generated
	 */
	Problems getProblems();

	/**
	 * Sets the value of the '{@link lciat.CodeEditor#getProblems <em>Problems</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problems</em>' reference.
	 * @see #getProblems()
	 * @generated
	 */
	void setProblems(Problems value);

} // CodeEditor
