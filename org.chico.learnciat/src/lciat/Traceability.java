/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traceability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.Traceability#getAwarelement <em>Awarelement</em>}</li>
 *   <li>{@link lciat.Traceability#getToolelement <em>Toolelement</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getTraceability()
 * @model annotation="gmf.link source='awarelement' target='toolelement' style='dash' width='1' color='0,0,0' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/traceability.gif' target.decoration='arrow' source.constraint='self <> oppositeEnd' target.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface Traceability extends Link {
	/**
	 * Returns the value of the '<em><b>Awarelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Awarelement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Awarelement</em>' reference.
	 * @see #setAwarelement(Awareness)
	 * @see lciat.LciatPackage#getTraceability_Awarelement()
	 * @model required="true"
	 * @generated
	 */
	Awareness getAwarelement();

	/**
	 * Sets the value of the '{@link lciat.Traceability#getAwarelement <em>Awarelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Awarelement</em>' reference.
	 * @see #getAwarelement()
	 * @generated
	 */
	void setAwarelement(Awareness value);

	/**
	 * Returns the value of the '<em><b>Toolelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toolelement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toolelement</em>' reference.
	 * @see #setToolelement(Tool)
	 * @see lciat.LciatPackage#getTraceability_Toolelement()
	 * @model required="true"
	 * @generated
	 */
	Tool getToolelement();

	/**
	 * Sets the value of the '{@link lciat.Traceability#getToolelement <em>Toolelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toolelement</em>' reference.
	 * @see #getToolelement()
	 * @generated
	 */
	void setToolelement(Tool value);

} // Traceability
