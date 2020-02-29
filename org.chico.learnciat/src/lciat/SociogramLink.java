/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sociogram Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.SociogramLink#getSource <em>Source</em>}</li>
 *   <li>{@link lciat.SociogramLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getSociogramLink()
 * @model
 * @generated
 */
public interface SociogramLink extends Link {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SociogramNode)
	 * @see lciat.LciatPackage#getSociogramLink_Source()
	 * @model required="true"
	 * @generated
	 */
	SociogramNode getSource();

	/**
	 * Sets the value of the '{@link lciat.SociogramLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SociogramNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SociogramNode)
	 * @see lciat.LciatPackage#getSociogramLink_Target()
	 * @model required="true"
	 * @generated
	 */
	SociogramNode getTarget();

	/**
	 * Sets the value of the '{@link lciat.SociogramLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SociogramNode value);

} // SociogramLink
