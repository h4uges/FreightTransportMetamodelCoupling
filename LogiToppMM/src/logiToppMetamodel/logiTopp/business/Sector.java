/**
 */
package logiToppMetamodel.logiTopp.business;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sector</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.business.BusinessPackage#getSector()
 * @model
 * @generated
 */
public enum Sector implements Enumerator {
	/**
	 * The '<em><b>HOSPITALITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOSPITALITY_VALUE
	 * @generated
	 * @ordered
	 */
	HOSPITALITY(0, "HOSPITALITY", "HOSPITALITY"),

	/**
	 * The '<em><b>SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE(1, "SERVICE", "SERVICE"),

	/**
	 * The '<em><b>ADMINISTRATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATION_VALUE
	 * @generated
	 * @ordered
	 */
	ADMINISTRATION(2, "ADMINISTRATION", "ADMINISTRATION"),

	/**
	 * The '<em><b>INDUSTRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDUSTRY_VALUE
	 * @generated
	 * @ordered
	 */
	INDUSTRY(3, "INDUSTRY", "INDUSTRY"),

	/**
	 * The '<em><b>RETAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETAIL_VALUE
	 * @generated
	 * @ordered
	 */
	RETAIL(4, "RETAIL", "RETAIL"),

	/**
	 * The '<em><b>LEISURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEISURE_VALUE
	 * @generated
	 * @ordered
	 */
	LEISURE(5, "LEISURE", "LEISURE"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(6, "OTHER", "OTHER");

	/**
	 * The '<em><b>HOSPITALITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOSPITALITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOSPITALITY_VALUE = 0;

	/**
	 * The '<em><b>SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_VALUE = 1;

	/**
	 * The '<em><b>ADMINISTRATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADMINISTRATION_VALUE = 2;

	/**
	 * The '<em><b>INDUSTRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDUSTRY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INDUSTRY_VALUE = 3;

	/**
	 * The '<em><b>RETAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETAIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RETAIL_VALUE = 4;

	/**
	 * The '<em><b>LEISURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEISURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEISURE_VALUE = 5;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 6;

	/**
	 * An array of all the '<em><b>Sector</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Sector[] VALUES_ARRAY =
		new Sector[] {
			HOSPITALITY,
			SERVICE,
			ADMINISTRATION,
			INDUSTRY,
			RETAIL,
			LEISURE,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Sector</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Sector> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sector</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Sector get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Sector result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sector</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Sector getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Sector result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sector</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Sector get(int value) {
		switch (value) {
			case HOSPITALITY_VALUE: return HOSPITALITY;
			case SERVICE_VALUE: return SERVICE;
			case ADMINISTRATION_VALUE: return ADMINISTRATION;
			case INDUSTRY_VALUE: return INDUSTRY;
			case RETAIL_VALUE: return RETAIL;
			case LEISURE_VALUE: return LEISURE;
			case OTHER_VALUE: return OTHER;
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
	private Sector(int value, String name, String literal) {
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
	
} //Sector
