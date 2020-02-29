/**
 */
package lciat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Learning Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.LearningActivity#getName <em>Name</em>}</li>
 *   <li>{@link lciat.LearningActivity#getItsModality <em>Its Modality</em>}</li>
 *   <li>{@link lciat.LearningActivity#getItsSubtype <em>Its Subtype</em>}</li>
 *   <li>{@link lciat.LearningActivity#getTools <em>Tools</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getLearningActivity()
 * @model
 * @generated
 */
public interface LearningActivity extends LearningNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"<...>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lciat.LciatPackage#getLearningActivity_Name()
	 * @model default="<...>"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lciat.LearningActivity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Its Modality</b></em>' attribute.
	 * The literals are from the enumeration {@link lciat.Modalities}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Modality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Modality</em>' attribute.
	 * @see lciat.Modalities
	 * @see #setItsModality(Modalities)
	 * @see lciat.LciatPackage#getLearningActivity_ItsModality()
	 * @model required="true"
	 * @generated
	 */
	Modalities getItsModality();

	/**
	 * Sets the value of the '{@link lciat.LearningActivity#getItsModality <em>Its Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its Modality</em>' attribute.
	 * @see lciat.Modalities
	 * @see #getItsModality()
	 * @generated
	 */
	void setItsModality(Modalities value);

	/**
	 * Returns the value of the '<em><b>Its Subtype</b></em>' attribute.
	 * The literals are from the enumeration {@link lciat.Subtypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Subtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Subtype</em>' attribute.
	 * @see lciat.Subtypes
	 * @see #setItsSubtype(Subtypes)
	 * @see lciat.LciatPackage#getLearningActivity_ItsSubtype()
	 * @model required="true"
	 * @generated
	 */
	Subtypes getItsSubtype();

	/**
	 * Sets the value of the '{@link lciat.LearningActivity#getItsSubtype <em>Its Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its Subtype</em>' attribute.
	 * @see lciat.Subtypes
	 * @see #getItsSubtype()
	 * @generated
	 */
	void setItsSubtype(Subtypes value);

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' containment reference list.
	 * The list contents are of type {@link lciat.Tool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' containment reference list.
	 * @see lciat.LciatPackage#getLearningActivity_Tools()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tool> getTools();

} // LearningActivity
