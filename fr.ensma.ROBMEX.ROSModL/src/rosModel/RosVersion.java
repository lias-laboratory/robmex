/**
 */
package rosModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ros Version</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rosModel.RosModelPackage#getRosVersion()
 * @model
 * @generated
 */
public enum RosVersion implements Enumerator {
	/**
	 * The '<em><b>Hydro</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYDRO_VALUE
	 * @generated
	 * @ordered
	 */
	HYDRO(4, "hydro", "hydro"),

	/**
	 * The '<em><b>Indigo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDIGO_VALUE
	 * @generated
	 * @ordered
	 */
	INDIGO(0, "indigo", "indigo"),

	/**
	 * The '<em><b>Jade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JADE_VALUE
	 * @generated
	 * @ordered
	 */
	JADE(1, "jade", "jade"),

	/**
	 * The '<em><b>Kinetic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KINETIC_VALUE
	 * @generated
	 * @ordered
	 */
	KINETIC(2, "kinetic", "kinetic"),

	/**
	 * The '<em><b>Luna</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUNA_VALUE
	 * @generated
	 * @ordered
	 */
	LUNA(3, "luna", "luna");

	/**
	 * The '<em><b>Hydro</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hydro</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HYDRO
	 * @model name="hydro"
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_VALUE = 4;

	/**
	 * The '<em><b>Indigo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Indigo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDIGO
	 * @model name="indigo"
	 * @generated
	 * @ordered
	 */
	public static final int INDIGO_VALUE = 0;

	/**
	 * The '<em><b>Jade</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Jade</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JADE
	 * @model name="jade"
	 * @generated
	 * @ordered
	 */
	public static final int JADE_VALUE = 1;

	/**
	 * The '<em><b>Kinetic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kinetic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KINETIC
	 * @model name="kinetic"
	 * @generated
	 * @ordered
	 */
	public static final int KINETIC_VALUE = 2;

	/**
	 * The '<em><b>Luna</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Luna</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LUNA
	 * @model name="luna"
	 * @generated
	 * @ordered
	 */
	public static final int LUNA_VALUE = 3;

	/**
	 * An array of all the '<em><b>Ros Version</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RosVersion[] VALUES_ARRAY =
		new RosVersion[] {
			HYDRO,
			INDIGO,
			JADE,
			KINETIC,
			LUNA,
		};

	/**
	 * A public read-only list of all the '<em><b>Ros Version</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RosVersion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ros Version</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RosVersion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RosVersion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ros Version</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RosVersion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RosVersion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ros Version</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RosVersion get(int value) {
		switch (value) {
			case HYDRO_VALUE: return HYDRO;
			case INDIGO_VALUE: return INDIGO;
			case JADE_VALUE: return JADE;
			case KINETIC_VALUE: return KINETIC;
			case LUNA_VALUE: return LUNA;
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
	private RosVersion(int value, String name, String literal) {
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
	
} //RosVersion
