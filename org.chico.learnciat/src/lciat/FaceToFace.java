/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Face To Face</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.FaceToFace#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getFaceToFace()
 * @model annotation="gmf.node figure='figures.FaceToFaceFigure' tool.name='Face-to-face' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/FaceToFace.gif' label='name' label.icon='false' label.placement='external' resizable='false' size='16,16'"
 * @generated
 */
public interface FaceToFace extends Modality {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"FaceToFace"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see lciat.LciatPackage#getFaceToFace_Kind()
	 * @model default="FaceToFace" changeable="false"
	 * @generated
	 */
	String getKind();

} // FaceToFace
