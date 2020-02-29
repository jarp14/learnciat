/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.Condition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getCondition()
 * @model annotation="gmf.node label='name' tool.name='Condition' label.icon='false' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/Condition.gif'"
 * @generated
 */
public interface Condition extends LearningNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"? ..."</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lciat.LciatPackage#getCondition_Name()
	 * @model default="? ..."
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lciat.Condition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Condition
