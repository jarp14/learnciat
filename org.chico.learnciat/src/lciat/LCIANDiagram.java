/**
 */
package lciat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LCIAN Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.LCIANDiagram#getItsSociograms <em>Its Sociograms</em>}</li>
 *   <li>{@link lciat.LCIANDiagram#getItsLearningDiagrams <em>Its Learning Diagrams</em>}</li>
 *   <li>{@link lciat.LCIANDiagram#getItsCttDiagrams <em>Its Ctt Diagrams</em>}</li>
 *   <li>{@link lciat.LCIANDiagram#getItsLinks <em>Its Links</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getLCIANDiagram()
 * @model
 * @generated
 */
public interface LCIANDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Its Sociograms</b></em>' containment reference list.
	 * The list contents are of type {@link lciat.Sociogram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Sociograms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Sociograms</em>' containment reference list.
	 * @see lciat.LciatPackage#getLCIANDiagram_ItsSociograms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sociogram> getItsSociograms();

	/**
	 * Returns the value of the '<em><b>Its Learning Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link lciat.LearningDiagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Learning Diagrams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Learning Diagrams</em>' containment reference list.
	 * @see lciat.LciatPackage#getLCIANDiagram_ItsLearningDiagrams()
	 * @model containment="true"
	 * @generated
	 */
	EList<LearningDiagram> getItsLearningDiagrams();

	/**
	 * Returns the value of the '<em><b>Its Ctt Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link lciat.CTTDiagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Ctt Diagrams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Ctt Diagrams</em>' containment reference list.
	 * @see lciat.LciatPackage#getLCIANDiagram_ItsCttDiagrams()
	 * @model containment="true"
	 * @generated
	 */
	EList<CTTDiagram> getItsCttDiagrams();

	/**
	 * Returns the value of the '<em><b>Its Links</b></em>' containment reference list.
	 * The list contents are of type {@link lciat.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Links</em>' containment reference list.
	 * @see lciat.LciatPackage#getLCIANDiagram_ItsLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getItsLinks();

} // LCIANDiagram
