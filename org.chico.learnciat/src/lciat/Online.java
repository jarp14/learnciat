/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Online</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.Online#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getOnline()
 * @model annotation="gmf.node figure='figures.OnlineFigure' tool.name='Online' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/Online.gif' label='name' label.icon='false' label.placement='external' resizable='false' size='16,16'"
 * @generated
 */
public interface Online extends Modality {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"Online"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see lciat.LciatPackage#getOnline_Kind()
	 * @model default="Online" changeable="false"
	 * @generated
	 */
	String getKind();

} // Online
