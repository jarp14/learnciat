/**
 */
package lciat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.AbstractTask#getTaskRoles <em>Task Roles</em>}</li>
 *   <li>{@link lciat.AbstractTask#getTaskObjects <em>Task Objects</em>}</li>
 *   <li>{@link lciat.AbstractTask#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link lciat.AbstractTask#getModality <em>Modality</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getAbstractTask()
 * @model annotation="gmf.node label='name' tool.name='Abstract Learning' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/AbstractLearningTask.gif'"
 * @generated
 */
public interface AbstractTask extends LearningActivity {
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
	 * @see lciat.LciatPackage#getAbstractTask_TaskRoles()
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
	 * @see lciat.LciatPackage#getAbstractTask_TaskObjects()
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
	 * @see lciat.LciatPackage#getAbstractTask_Subtype()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	Subtype getSubtype();

	/**
	 * Sets the value of the '{@link lciat.AbstractTask#getSubtype <em>Subtype</em>}' containment reference.
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
	 * @see lciat.LciatPackage#getAbstractTask_Modality()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	Modality getModality();

	/**
	 * Sets the value of the '{@link lciat.AbstractTask#getModality <em>Modality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality</em>' containment reference.
	 * @see #getModality()
	 * @generated
	 */
	void setModality(Modality value);

} // AbstractTask
