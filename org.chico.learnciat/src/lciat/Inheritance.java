/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.Inheritance#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getInheritance()
 * @model annotation="gmf.link label='condition' source='source' target='target' target.decoration='closedarrow' style='solid' width='1' color='0,0,0' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/Inheritance.gif' source.constraint='self <> oppositeEnd' target.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface Inheritance extends SociogramLink {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see lciat.LciatPackage#getInheritance_Condition()
	 * @model default=" "
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link lciat.Inheritance#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // Inheritance
