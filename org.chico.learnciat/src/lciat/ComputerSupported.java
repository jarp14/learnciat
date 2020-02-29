/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computer Supported</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.ComputerSupported#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getComputerSupported()
 * @model annotation="gmf.node figure='figures.ComputerSupportedFigure' tool.name='Computer-Supported' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/ComputerSupported.gif' label='name' label.icon='false' label.placement='external' resizable='false' size='16,16'"
 * @generated
 */
public interface ComputerSupported extends Modality {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"ComputerSupported"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see lciat.LciatPackage#getComputerSupported_Kind()
	 * @model default="ComputerSupported" changeable="false"
	 * @generated
	 */
	String getKind();

} // ComputerSupported
