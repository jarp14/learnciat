/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disabling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.Disabling#getDLabel <em>DLabel</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getDisabling()
 * @model annotation="gmf.link label='dLabel' source='source' target='target' style='solid' width='1' color='0,0,0' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/DisablingTransition.gif' source.constraint='self <> oppositeEnd' target.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface Disabling extends CTTLink {
	/**
	 * Returns the value of the '<em><b>DLabel</b></em>' attribute.
	 * The default value is <code>"[>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DLabel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DLabel</em>' attribute.
	 * @see lciat.LciatPackage#getDisabling_DLabel()
	 * @model default="[>" changeable="false"
	 * @generated
	 */
	String getDLabel();

} // Disabling
