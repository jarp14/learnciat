/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disabling With Information Passing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.DisablingWithInformationPassing#getDwLabel <em>Dw Label</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getDisablingWithInformationPassing()
 * @model annotation="gmf.link label='dwLabel' source='source' target='target' style='solid' width='1' color='0,0,0' tool.name='Disabling With Information Passing' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/DisablingWithInformationPassingTransition.gif' source.constraint='self <> oppositeEnd' target.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface DisablingWithInformationPassing extends CTTLink {
	/**
	 * Returns the value of the '<em><b>Dw Label</b></em>' attribute.
	 * The default value is <code>"[]|>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dw Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dw Label</em>' attribute.
	 * @see lciat.LciatPackage#getDisablingWithInformationPassing_DwLabel()
	 * @model default="[]|>" changeable="false"
	 * @generated
	 */
	String getDwLabel();

} // DisablingWithInformationPassing
