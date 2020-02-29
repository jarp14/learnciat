/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.Association#getName <em>Name</em>}</li>
 *   <li>{@link lciat.Association#getN <em>N</em>}</li>
 *   <li>{@link lciat.Association#getM <em>M</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getAssociation()
 * @model annotation="gmf.link label='name' source='source' target='target' style='solid' width='1' color='0,0,0' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/Association.gif' source.constraint='self <> oppositeEnd' target.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface Association extends SociogramLink {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"(n..m)"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lciat.LciatPackage#getAssociation_Name()
	 * @model default="(n..m)"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lciat.Association#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>N</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>N</em>' attribute.
	 * @see #setN(int)
	 * @see lciat.LciatPackage#getAssociation_N()
	 * @model
	 * @generated
	 */
	int getN();

	/**
	 * Sets the value of the '{@link lciat.Association#getN <em>N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>N</em>' attribute.
	 * @see #getN()
	 * @generated
	 */
	void setN(int value);

	/**
	 * Returns the value of the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M</em>' attribute.
	 * @see #setM(int)
	 * @see lciat.LciatPackage#getAssociation_M()
	 * @model
	 * @generated
	 */
	int getM();

	/**
	 * Sets the value of the '{@link lciat.Association#getM <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M</em>' attribute.
	 * @see #getM()
	 * @generated
	 */
	void setM(int value);

} // Association
