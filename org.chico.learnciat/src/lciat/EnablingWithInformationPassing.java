/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enabling With Information Passing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.EnablingWithInformationPassing#getEwLabel <em>Ew Label</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getEnablingWithInformationPassing()
 * @model annotation="gmf.link label='ewLabel' source='source' target='target' style='solid' width='1' color='0,0,0' tool.name='Enabling With Information Passing' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/EnablingWithInformationPassingTransition.gif' source.constraint='self <> oppositeEnd' target.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface EnablingWithInformationPassing extends CTTLink {
	/**
	 * Returns the value of the '<em><b>Ew Label</b></em>' attribute.
	 * The default value is <code>"[]>>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ew Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ew Label</em>' attribute.
	 * @see #setEwLabel(String)
	 * @see lciat.LciatPackage#getEnablingWithInformationPassing_EwLabel()
	 * @model default="[]>>"
	 * @generated
	 */
	String getEwLabel();

	/**
	 * Sets the value of the '{@link lciat.EnablingWithInformationPassing#getEwLabel <em>Ew Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ew Label</em>' attribute.
	 * @see #getEwLabel()
	 * @generated
	 */
	void setEwLabel(String value);

} // EnablingWithInformationPassing
