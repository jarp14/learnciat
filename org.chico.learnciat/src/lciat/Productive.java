/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Productive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.Productive#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getProductive()
 * @model annotation="gmf.node label='name' tool.name='Productive' label.icon='false' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/Productive.gif'"
 * @generated
 */
public interface Productive extends Subtype {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Productive"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see lciat.LciatPackage#getProductive_Name()
	 * @model default="Productive" changeable="false"
	 * @generated
	 */
	String getName();

} // Productive
