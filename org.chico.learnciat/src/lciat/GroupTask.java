/**
 */
package lciat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.GroupTask#getTaskRoles <em>Task Roles</em>}</li>
 *   <li>{@link lciat.GroupTask#getTaskObjects <em>Task Objects</em>}</li>
 *   <li>{@link lciat.GroupTask#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link lciat.GroupTask#getModality <em>Modality</em>}</li>
 *   <li>{@link lciat.GroupTask#getEGL_Tool <em>EGL Tool</em>}</li>
 *   <li>{@link lciat.GroupTask#isEGL_Transformation <em>EGL Transformation</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getGroupTask()
 * @model annotation="gmf.node label='name' tool.name='Group Learning' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/GroupLearningTask.gif'"
 * @generated
 */
public interface GroupTask extends LearningActivity {
	/**
	 * Returns the value of the '<em><b>Task Roles</b></em>' containment reference list.
	 * The list contents are of type {@link lciat.LeftSideLearningNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Roles</em>' containment reference list.
	 * @see lciat.LciatPackage#getGroupTask_TaskRoles()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true'"
	 * @generated
	 */
	EList<LeftSideLearningNode> getTaskRoles();

	/**
	 * Returns the value of the '<em><b>Task Objects</b></em>' containment reference list.
	 * The list contents are of type {@link lciat.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Objects</em>' containment reference list.
	 * @see lciat.LciatPackage#getGroupTask_TaskObjects()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true'"
	 * @generated
	 */
	EList<lciat.Object> getTaskObjects();

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' containment reference.
	 * @see #setSubtype(Subtype)
	 * @see lciat.LciatPackage#getGroupTask_Subtype()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	Subtype getSubtype();

	/**
	 * Sets the value of the '{@link lciat.GroupTask#getSubtype <em>Subtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' containment reference.
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(Subtype value);

	/**
	 * Returns the value of the '<em><b>Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modality</em>' containment reference.
	 * @see #setModality(Modality)
	 * @see lciat.LciatPackage#getGroupTask_Modality()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	Modality getModality();

	/**
	 * Sets the value of the '{@link lciat.GroupTask#getModality <em>Modality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality</em>' containment reference.
	 * @see #getModality()
	 * @generated
	 */
	void setModality(Modality value);

	/**
	 * Returns the value of the '<em><b>EGL Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EGL Tool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EGL Tool</em>' reference.
	 * @see #setEGL_Tool(Tool)
	 * @see lciat.LciatPackage#getGroupTask_EGL_Tool()
	 * @model
	 * @generated
	 */
	Tool getEGL_Tool();

	/**
	 * Sets the value of the '{@link lciat.GroupTask#getEGL_Tool <em>EGL Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EGL Tool</em>' reference.
	 * @see #getEGL_Tool()
	 * @generated
	 */
	void setEGL_Tool(Tool value);

	/**
	 * Returns the value of the '<em><b>EGL Transformation</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EGL Transformation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EGL Transformation</em>' attribute.
	 * @see #setEGL_Transformation(boolean)
	 * @see lciat.LciatPackage#getGroupTask_EGL_Transformation()
	 * @model default="false"
	 * @generated
	 */
	boolean isEGL_Transformation();

	/**
	 * Sets the value of the '{@link lciat.GroupTask#isEGL_Transformation <em>EGL Transformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EGL Transformation</em>' attribute.
	 * @see #isEGL_Transformation()
	 * @generated
	 */
	void setEGL_Transformation(boolean value);

} // GroupTask
