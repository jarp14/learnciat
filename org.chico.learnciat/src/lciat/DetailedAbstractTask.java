/**
 */
package lciat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detailed Abstract Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.DetailedAbstractTask#getLearningNodes <em>Learning Nodes</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getDetailedAbstractTask()
 * @model annotation="gmf.node label='name' tool.name='Detailed Abstract Learning' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/AbstractLearningTask.gif'"
 * @generated
 */
public interface DetailedAbstractTask extends LearningActivity {
	/**
	 * Returns the value of the '<em><b>Learning Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link lciat.LearningNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Learning Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learning Nodes</em>' containment reference list.
	 * @see lciat.LciatPackage#getDetailedAbstractTask_LearningNodes()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free' collapsible='true'"
	 * @generated
	 */
	EList<LearningNode> getLearningNodes();

} // DetailedAbstractTask
