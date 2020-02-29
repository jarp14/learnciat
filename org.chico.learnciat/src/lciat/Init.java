/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.Init#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getInit()
 * @model annotation="gmf.node figure='figures.InitialFigure' tool.name='Initial' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/Initial.gif' label='name' label.icon='false' label.placement='external' resizable='false' size='16,16'"
 * @generated
 */
public interface Init extends LearningNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see lciat.LciatPackage#getInit_Name()
	 * @model default=" " changeable="false"
	 * @generated
	 */
	String getName();

} // Init
