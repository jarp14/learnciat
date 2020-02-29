/**
 */
package lciat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.Object#getName <em>Name</em>}</li>
 *   <li>{@link lciat.Object#getObject <em>Object</em>}</li>
 *   <li>{@link lciat.Object#getModifier <em>Modifier</em>}</li>
 *   <li>{@link lciat.Object#getModifiedBy <em>Modified By</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getObject()
 * @model annotation="gmf.node label='name' tool.name='Object' label.icon='false' figure='rectangle' color='154,236,255' size='100,20' border.color='0,179,255' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/Object.gif'"
 * @generated
 */
public interface Object extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"C/R/W: Object"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lciat.LciatPackage#getObject_Name()
	 * @model default="C/R/W: Object"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lciat.Object#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(Object)
	 * @see lciat.LciatPackage#getObject_Object()
	 * @model
	 * @generated
	 */
	Object getObject();

	/**
	 * Sets the value of the '{@link lciat.Object#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Object value);

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' attribute.
	 * @see #setModifier(String)
	 * @see lciat.LciatPackage#getObject_Modifier()
	 * @model
	 * @generated
	 */
	String getModifier();

	/**
	 * Sets the value of the '{@link lciat.Object#getModifier <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' attribute.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(String value);

	/**
	 * Returns the value of the '<em><b>Modified By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified By</em>' reference.
	 * @see #setModifiedBy(LeftSideLearningNode)
	 * @see lciat.LciatPackage#getObject_ModifiedBy()
	 * @model
	 * @generated
	 */
	LeftSideLearningNode getModifiedBy();

	/**
	 * Sets the value of the '{@link lciat.Object#getModifiedBy <em>Modified By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified By</em>' reference.
	 * @see #getModifiedBy()
	 * @generated
	 */
	void setModifiedBy(LeftSideLearningNode value);

} // Object
