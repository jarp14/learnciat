/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Independence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.OrderIndependence#getOiLabel <em>Oi Label</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getOrderIndependence()
 * @model annotation="gmf.link label='oiLabel' source='source' target='target' style='solid' width='1' color='0,0,0' tool.name='Order Independence' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/OrderIndependenceTransition.gif' source.constraint='self <> oppositeEnd' target.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface OrderIndependence extends CTTLink {
	/**
	 * Returns the value of the '<em><b>Oi Label</b></em>' attribute.
	 * The default value is <code>"|=|"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oi Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oi Label</em>' attribute.
	 * @see lciat.LciatPackage#getOrderIndependence_OiLabel()
	 * @model default="|=|" changeable="false"
	 * @generated
	 */
	String getOiLabel();

} // OrderIndependence
