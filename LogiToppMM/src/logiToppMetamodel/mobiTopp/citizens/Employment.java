/**
 */
package logiToppMetamodel.mobiTopp.citizens;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Employment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.mobiTopp.citizens.CitizensPackage#getEmployment()
 * @model
 * @generated
 */
public enum Employment implements Enumerator {
	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(-1, "UNKNOWN", "UNKNOWN"),

	/**
	 * The '<em><b>FULLTIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULLTIME_VALUE
	 * @generated
	 * @ordered
	 */
	FULLTIME(1, "FULLTIME", "FULLTIME"),

	/**
	 * The '<em><b>PARTTIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTTIME_VALUE
	 * @generated
	 * @ordered
	 */
	PARTTIME(2, "PARTTIME", "PARTTIME"),

	/**
	 * The '<em><b>MARGINAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARGINAL_VALUE
	 * @generated
	 * @ordered
	 */
	MARGINAL(22, "MARGINAL", "MARGINAL"),

	/**
	 * The '<em><b>UNEMPLOYED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNEMPLOYED_VALUE
	 * @generated
	 * @ordered
	 */
	UNEMPLOYED(3, "UNEMPLOYED", "UNEMPLOYED"),

	/**
	 * The '<em><b>STUDENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUDENT_VALUE
	 * @generated
	 * @ordered
	 */
	STUDENT(4, "STUDENT", "STUDENT"),

	/**
	 * The '<em><b>STUDENT PRIMARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUDENT_PRIMARY_VALUE
	 * @generated
	 * @ordered
	 */
	STUDENT_PRIMARY(40, "STUDENT_PRIMARY", "STUDENT_PRIMARY"),

	/**
	 * The '<em><b>STUDENT SECONDARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUDENT_SECONDARY_VALUE
	 * @generated
	 * @ordered
	 */
	STUDENT_SECONDARY(41, "STUDENT_SECONDARY", "STUDENT_SECONDARY"),

	/**
	 * The '<em><b>STUDENT TERTIARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUDENT_TERTIARY_VALUE
	 * @generated
	 * @ordered
	 */
	STUDENT_TERTIARY(42, "STUDENT_TERTIARY", "STUDENT_TERTIARY"),

	/**
	 * The '<em><b>EDUCATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDUCATION_VALUE
	 * @generated
	 * @ordered
	 */
	EDUCATION(5, "EDUCATION", "EDUCATION"),

	/**
	 * The '<em><b>HOMEKEEPER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOMEKEEPER_VALUE
	 * @generated
	 * @ordered
	 */
	HOMEKEEPER(6, "HOMEKEEPER", "HOMEKEEPER"),

	/**
	 * The '<em><b>RETIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETIRED_VALUE
	 * @generated
	 * @ordered
	 */
	RETIRED(7, "RETIRED", "RETIRED"),

	/**
	 * The '<em><b>INFANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFANT_VALUE
	 * @generated
	 * @ordered
	 */
	INFANT(8, "INFANT", "INFANT"),

	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(9, "NONE", "NONE");

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = -1;

	/**
	 * The '<em><b>FULLTIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULLTIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FULLTIME_VALUE = 1;

	/**
	 * The '<em><b>PARTTIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTTIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARTTIME_VALUE = 2;

	/**
	 * The '<em><b>MARGINAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARGINAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MARGINAL_VALUE = 22;

	/**
	 * The '<em><b>UNEMPLOYED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNEMPLOYED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNEMPLOYED_VALUE = 3;

	/**
	 * The '<em><b>STUDENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUDENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STUDENT_VALUE = 4;

	/**
	 * The '<em><b>STUDENT PRIMARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUDENT_PRIMARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STUDENT_PRIMARY_VALUE = 40;

	/**
	 * The '<em><b>STUDENT SECONDARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUDENT_SECONDARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STUDENT_SECONDARY_VALUE = 41;

	/**
	 * The '<em><b>STUDENT TERTIARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUDENT_TERTIARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STUDENT_TERTIARY_VALUE = 42;

	/**
	 * The '<em><b>EDUCATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDUCATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EDUCATION_VALUE = 5;

	/**
	 * The '<em><b>HOMEKEEPER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOMEKEEPER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOMEKEEPER_VALUE = 6;

	/**
	 * The '<em><b>RETIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETIRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RETIRED_VALUE = 7;

	/**
	 * The '<em><b>INFANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INFANT_VALUE = 8;

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 9;

	/**
	 * An array of all the '<em><b>Employment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Employment[] VALUES_ARRAY =
		new Employment[] {
			UNKNOWN,
			FULLTIME,
			PARTTIME,
			MARGINAL,
			UNEMPLOYED,
			STUDENT,
			STUDENT_PRIMARY,
			STUDENT_SECONDARY,
			STUDENT_TERTIARY,
			EDUCATION,
			HOMEKEEPER,
			RETIRED,
			INFANT,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Employment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Employment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Employment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Employment get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Employment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Employment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Employment getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Employment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Employment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Employment get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case FULLTIME_VALUE: return FULLTIME;
			case PARTTIME_VALUE: return PARTTIME;
			case MARGINAL_VALUE: return MARGINAL;
			case UNEMPLOYED_VALUE: return UNEMPLOYED;
			case STUDENT_VALUE: return STUDENT;
			case STUDENT_PRIMARY_VALUE: return STUDENT_PRIMARY;
			case STUDENT_SECONDARY_VALUE: return STUDENT_SECONDARY;
			case STUDENT_TERTIARY_VALUE: return STUDENT_TERTIARY;
			case EDUCATION_VALUE: return EDUCATION;
			case HOMEKEEPER_VALUE: return HOMEKEEPER;
			case RETIRED_VALUE: return RETIRED;
			case INFANT_VALUE: return INFANT;
			case NONE_VALUE: return NONE;
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
	private Employment(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //Employment
