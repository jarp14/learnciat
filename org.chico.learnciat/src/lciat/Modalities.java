/**
 */
package lciat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Modalities</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lciat.LciatPackage#getModalities()
 * @model
 * @generated
 */
public enum Modalities implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"),

	/**
	 * The '<em><b>Face To Face</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACE_TO_FACE_VALUE
	 * @generated
	 * @ordered
	 */
	FACE_TO_FACE(1, "FaceToFace", "FaceToFace"),

	/**
	 * The '<em><b>Computer Supported</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTER_SUPPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTER_SUPPORTED(2, "ComputerSupported", "ComputerSupported"),

	/**
	 * The '<em><b>Online</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONLINE_VALUE
	 * @generated
	 * @ordered
	 */
	ONLINE(3, "Online", "Online");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Face To Face</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Face To Face</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FACE_TO_FACE
	 * @model name="FaceToFace"
	 * @generated
	 * @ordered
	 */
	public static final int FACE_TO_FACE_VALUE = 1;

	/**
	 * The '<em><b>Computer Supported</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Computer Supported</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPUTER_SUPPORTED
	 * @model name="ComputerSupported"
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTER_SUPPORTED_VALUE = 2;

	/**
	 * The '<em><b>Online</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Online</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONLINE
	 * @model name="Online"
	 * @generated
	 * @ordered
	 */
	public static final int ONLINE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Modalities</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Modalities[] VALUES_ARRAY =
		new Modalities[] {
			NONE,
			FACE_TO_FACE,
			COMPUTER_SUPPORTED,
			ONLINE,
		};

	/**
	 * A public read-only list of all the '<em><b>Modalities</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Modalities> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Modalities</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Modalities get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Modalities result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Modalities</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Modalities getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Modalities result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Modalities</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Modalities get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case FACE_TO_FACE_VALUE: return FACE_TO_FACE;
			case COMPUTER_SUPPORTED_VALUE: return COMPUTER_SUPPORTED;
			case ONLINE_VALUE: return ONLINE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Modalities(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Modalities
