/**
 */
package lciat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CTT Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.CTTTask#getName <em>Name</em>}</li>
 *   <li>{@link lciat.CTTTask#getCttLinks <em>Ctt Links</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getCTTTask()
 * @model
 * @generated
 */
public interface CTTTask extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"<...>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lciat.LciatPackage#getCTTTask_Name()
	 * @model default="<...>"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lciat.CTTTask#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ctt Links</b></em>' reference list.
	 * The list contents are of type {@link lciat.CTTLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctt Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctt Links</em>' reference list.
	 * @see lciat.LciatPackage#getCTTTask_CttLinks()
	 * @model
	 * @generated
	 */
	EList<CTTLink> getCttLinks();

} // CTTTask
