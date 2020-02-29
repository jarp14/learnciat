/**
 */
package lciat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Learning Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.LearningDiagram#getName <em>Name</em>}</li>
 *   <li>{@link lciat.LearningDiagram#getMolefLearningNodes <em>Molef Learning Nodes</em>}</li>
 *   <li>{@link lciat.LearningDiagram#getLearningNodes <em>Learning Nodes</em>}</li>
 *   <li>{@link lciat.LearningDiagram#getMfLearningNodes <em>Mf Learning Nodes</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getLearningDiagram()
 * @model annotation="gmf.node label='name' tool.name='Learning Diagram' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/LearningDesignDiagram.gif'"
 * @generated
 */
public interface LearningDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Learning-Design :: "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lciat.LciatPackage#getLearningDiagram_Name()
	 * @model default="Learning-Design :: "
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lciat.LearningDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Molef Learning Nodes</b></em>' reference list.
	 * The list contents are of type {@link lciat.MolefLearningNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Molef Learning Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Molef Learning Nodes</em>' reference list.
	 * @see lciat.LciatPackage#getLearningDiagram_MolefLearningNodes()
	 * @model
	 * @generated
	 */
	EList<MolefLearningNode> getMolefLearningNodes();

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
	 * @see lciat.LciatPackage#getLearningDiagram_LearningNodes()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free' collapsible='true'"
	 * @generated
	 */
	EList<LearningNode> getLearningNodes();

	/**
	 * Returns the value of the '<em><b>Mf Learning Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link lciat.MolefLearningNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mf Learning Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mf Learning Nodes</em>' containment reference list.
	 * @see lciat.LciatPackage#getLearningDiagram_MfLearningNodes()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true'"
	 * @generated
	 */
	EList<MolefLearningNode> getMfLearningNodes();

} // LearningDiagram
