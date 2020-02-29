/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Undeterministic Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.UndeterministicChoice#getUcLabel <em>Uc Label</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getUndeterministicChoice()
 * @model annotation="gmf.link label='ucLabel' source='source' target='target' style='solid' width='1' color='0,0,0' tool.name='Undeterministic Choice' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/UndeterministicChoiceTransition.gif' source.constraint='self <> oppositeEnd' target.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface UndeterministicChoice extends CTTLink {
	/**
	 * Returns the value of the '<em><b>Uc Label</b></em>' attribute.
	 * The default value is <code>"\u00c7"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uc Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uc Label</em>' attribute.
	 * @see lciat.LciatPackage#getUndeterministicChoice_UcLabel()
	 * @model default="\u00c7" changeable="false"
	 * @generated
	 */
	String getUcLabel();

} // UndeterministicChoice
