/**
 */
package lciat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.Group#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getGroup()
 * @model annotation="gmf.node label='name' tool.name='Group' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/Group.gif'"
 * @generated
 */
public interface Group extends SociogramNode, LeftSideLearningNode {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link lciat.Rol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see lciat.LciatPackage#getGroup_Contains()
	 * @model
	 * @generated
	 */
	EList<Rol> getContains();

} // Group
