/**
 */
package lciat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.Rol#getItsGroup <em>Its Group</em>}</li>
 *   <li>{@link lciat.Rol#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link lciat.Rol#getSubtype <em>Subtype</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getRol()
 * @model annotation="gmf.node label='name' tool.name='Rol' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/Rol.gif'"
 * @generated
 */
public interface Rol extends SociogramNode, LeftSideLearningNode {
	/**
	 * Returns the value of the '<em><b>Its Group</b></em>' reference list.
	 * The list contents are of type {@link lciat.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Group</em>' reference list.
	 * @see lciat.LciatPackage#getRol_ItsGroup()
	 * @model
	 * @generated
	 */
	EList<Group> getItsGroup();

	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' reference list.
	 * The list contents are of type {@link lciat.Rol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype</em>' reference list.
	 * @see lciat.LciatPackage#getRol_Supertype()
	 * @model
	 * @generated
	 */
	EList<Rol> getSupertype();

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' reference list.
	 * The list contents are of type {@link lciat.Rol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' reference list.
	 * @see lciat.LciatPackage#getRol_Subtype()
	 * @model
	 * @generated
	 */
	EList<Rol> getSubtype();

} // Rol
