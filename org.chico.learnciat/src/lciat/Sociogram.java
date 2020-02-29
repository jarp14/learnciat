/**
 */
package lciat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sociogram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.Sociogram#getName <em>Name</em>}</li>
 *   <li>{@link lciat.Sociogram#getItsSociogramNodes <em>Its Sociogram Nodes</em>}</li>
 *   <li>{@link lciat.Sociogram#getMfContentNodes <em>Mf Content Nodes</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getSociogram()
 * @model annotation="gmf.node label='name' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/Sociogram.gif'"
 * @generated
 */
public interface Sociogram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Sociogram :: "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lciat.LciatPackage#getSociogram_Name()
	 * @model default="Sociogram :: "
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lciat.Sociogram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Its Sociogram Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link lciat.SociogramNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Sociogram Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Sociogram Nodes</em>' containment reference list.
	 * @see lciat.LciatPackage#getSociogram_ItsSociogramNodes()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free' collapsible='false'"
	 * @generated
	 */
	EList<SociogramNode> getItsSociogramNodes();

	/**
	 * Returns the value of the '<em><b>Mf Content Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link lciat.MolefContentNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mf Content Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mf Content Nodes</em>' containment reference list.
	 * @see lciat.LciatPackage#getSociogram_MfContentNodes()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='true'"
	 * @generated
	 */
	EList<MolefContentNode> getMfContentNodes();

} // Sociogram
