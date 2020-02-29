/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enabling WO Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.EnablingWOInformation#getELabel <em>ELabel</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getEnablingWOInformation()
 * @model annotation="gmf.link label='eLabel' source='source' target='target' style='solid' width='1' color='0,0,0' tool.name='Enabling w/o Information' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/EnablingTransition.gif' source.constraint='self <> oppositeEnd' target.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface EnablingWOInformation extends LearningLink {
	/**
	 * Returns the value of the '<em><b>ELabel</b></em>' attribute.
	 * The default value is <code>">>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELabel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELabel</em>' attribute.
	 * @see lciat.LciatPackage#getEnablingWOInformation_ELabel()
	 * @model default=">>" changeable="false"
	 * @generated
	 */
	String getELabel();

} // EnablingWOInformation
