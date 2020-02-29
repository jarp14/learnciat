/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.Choice#getDtLabel <em>Dt Label</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getChoice()
 * @model annotation="gmf.link label='dtLabel' source='source' target='target' style='solid' width='1' color='0,0,0' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/DeterministicChoiceTransition.gif' source.constraint='self <> oppositeEnd' target.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface Choice extends LearningLink {
	/**
	 * Returns the value of the '<em><b>Dt Label</b></em>' attribute.
	 * The default value is <code>"[]"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dt Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dt Label</em>' attribute.
	 * @see lciat.LciatPackage#getChoice_DtLabel()
	 * @model default="[]" changeable="false"
	 * @generated
	 */
	String getDtLabel();

} // Choice
