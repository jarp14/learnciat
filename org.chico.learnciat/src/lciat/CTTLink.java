/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CTT Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.CTTLink#getSource <em>Source</em>}</li>
 *   <li>{@link lciat.CTTLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getCTTLink()
 * @model
 * @generated
 */
public interface CTTLink extends Link {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(CTTTask)
	 * @see lciat.LciatPackage#getCTTLink_Source()
	 * @model required="true"
	 * @generated
	 */
	CTTTask getSource();

	/**
	 * Sets the value of the '{@link lciat.CTTLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(CTTTask value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(CTTTask)
	 * @see lciat.LciatPackage#getCTTLink_Target()
	 * @model required="true"
	 * @generated
	 */
	CTTTask getTarget();

	/**
	 * Sets the value of the '{@link lciat.CTTLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CTTTask value);

} // CTTLink
