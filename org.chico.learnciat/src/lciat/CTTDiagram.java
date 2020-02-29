/**
 */
package lciat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CTT Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.CTTDiagram#getName <em>Name</em>}</li>
 *   <li>{@link lciat.CTTDiagram#getMolefCttNodes <em>Molef Ctt Nodes</em>}</li>
 *   <li>{@link lciat.CTTDiagram#getCttTasks <em>Ctt Tasks</em>}</li>
 *   <li>{@link lciat.CTTDiagram#getMfCttNodes <em>Mf Ctt Nodes</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getCTTDiagram()
 * @model annotation="gmf.node label='name' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/CTTDiagram.gif'"
 * @generated
 */
public interface CTTDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"CTT :: "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lciat.LciatPackage#getCTTDiagram_Name()
	 * @model default="CTT :: "
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lciat.CTTDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Molef Ctt Nodes</b></em>' reference list.
	 * The list contents are of type {@link lciat.MolefCttNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Molef Ctt Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Molef Ctt Nodes</em>' reference list.
	 * @see lciat.LciatPackage#getCTTDiagram_MolefCttNodes()
	 * @model
	 * @generated
	 */
	EList<MolefCttNode> getMolefCttNodes();

	/**
	 * Returns the value of the '<em><b>Ctt Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link lciat.CTTTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctt Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctt Tasks</em>' containment reference list.
	 * @see lciat.LciatPackage#getCTTDiagram_CttTasks()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free' collapsible='true'"
	 * @generated
	 */
	EList<CTTTask> getCttTasks();

	/**
	 * Returns the value of the '<em><b>Mf Ctt Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link lciat.MolefCttNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mf Ctt Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mf Ctt Nodes</em>' containment reference list.
	 * @see lciat.LciatPackage#getCTTDiagram_MfCttNodes()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true'"
	 * @generated
	 */
	EList<MolefCttNode> getMfCttNodes();

} // CTTDiagram
