/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suspend Resume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.SuspendResume#getSrLabel <em>Sr Label</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getSuspendResume()
 * @model annotation="gmf.link label='srLabel' source='source' target='target' style='solid' width='1' color='0,0,0' tool.name='Suspend Resume' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/SuspendResumeTransition.gif' source.constraint='self <> oppositeEnd' target.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface SuspendResume extends CTTLink {
	/**
	 * Returns the value of the '<em><b>Sr Label</b></em>' attribute.
	 * The default value is <code>"|>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Label</em>' attribute.
	 * @see lciat.LciatPackage#getSuspendResume_SrLabel()
	 * @model default="|>" changeable="false"
	 * @generated
	 */
	String getSrLabel();

} // SuspendResume
