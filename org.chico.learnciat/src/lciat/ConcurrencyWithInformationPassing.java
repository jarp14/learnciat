/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concurrency With Information Passing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.ConcurrencyWithInformationPassing#getCLabel <em>CLabel</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getConcurrencyWithInformationPassing()
 * @model annotation="gmf.link label='cLabel' source='source' target='target' style='solid' width='1' color='0,0,0' tool.name='Concurrency With Information Passing' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/ConcurrencyWithInformationPassingTransition.gif' source.constraint='self <> oppositeEnd' target.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface ConcurrencyWithInformationPassing extends CTTLink {
	/**
	 * Returns the value of the '<em><b>CLabel</b></em>' attribute.
	 * The default value is <code>"|[]|"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CLabel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CLabel</em>' attribute.
	 * @see lciat.LciatPackage#getConcurrencyWithInformationPassing_CLabel()
	 * @model default="|[]|" changeable="false"
	 * @generated
	 */
	String getCLabel();

} // ConcurrencyWithInformationPassing
