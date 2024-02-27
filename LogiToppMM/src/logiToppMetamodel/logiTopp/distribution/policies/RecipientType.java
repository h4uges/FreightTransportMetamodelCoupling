/**
 */
package logiToppMetamodel.logiTopp.distribution.policies;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Recipient Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.distribution.policies.PoliciesPackage#getRecipientType()
 * @model
 * @generated
 */
public enum RecipientType implements Enumerator {
	/**
	 * The '<em><b>PERSONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSONAL_VALUE
	 * @generated
	 * @ordered
	 */
	PERSONAL(0, "PERSONAL", "PERSONAL"),

	/**
	 * The '<em><b>HOUSEHOLDMEMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUSEHOLDMEMBER_VALUE
	 * @generated
	 * @ordered
	 */
	HOUSEHOLDMEMBER(1, "HOUSEHOLDMEMBER", "HOUSEHOLDMEMBER"),

	/**
	 * The '<em><b>NEIGHBOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEIGHBOR_VALUE
	 * @generated
	 * @ordered
	 */
	NEIGHBOR(2, "NEIGHBOR", "NEIGHBOR"),

	/**
	 * The '<em><b>PACKSTATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKSTATION_VALUE
	 * @generated
	 * @ordered
	 */
	PACKSTATION(3, "PACKSTATION", "PACKSTATION"),

	/**
	 * The '<em><b>BUSINESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS(4, "BUSINESS", "BUSINESS"),

	/**
	 * The '<em><b>DISTRIBUTION CENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTION_CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	DISTRIBUTION_CENTER(5, "DISTRIBUTION_CENTER", "DISTRIBUTION_CENTER");

	/**
	 * The '<em><b>PERSONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERSONAL_VALUE = 0;

	/**
	 * The '<em><b>HOUSEHOLDMEMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUSEHOLDMEMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOUSEHOLDMEMBER_VALUE = 1;

	/**
	 * The '<em><b>NEIGHBOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEIGHBOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEIGHBOR_VALUE = 2;

	/**
	 * The '<em><b>PACKSTATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKSTATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PACKSTATION_VALUE = 3;

	/**
	 * The '<em><b>BUSINESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_VALUE = 4;

	/**
	 * The '<em><b>DISTRIBUTION CENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTION_CENTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTION_CENTER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Recipient Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RecipientType[] VALUES_ARRAY =
		new RecipientType[] {
			PERSONAL,
			HOUSEHOLDMEMBER,
			NEIGHBOR,
			PACKSTATION,
			BUSINESS,
			DISTRIBUTION_CENTER,
		};

	/**
	 * A public read-only list of all the '<em><b>Recipient Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RecipientType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Recipient Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RecipientType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecipientType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Recipient Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RecipientType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecipientType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Recipient Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RecipientType get(int value) {
		switch (value) {
			case PERSONAL_VALUE: return PERSONAL;
			case HOUSEHOLDMEMBER_VALUE: return HOUSEHOLDMEMBER;
			case NEIGHBOR_VALUE: return NEIGHBOR;
			case PACKSTATION_VALUE: return PACKSTATION;
			case BUSINESS_VALUE: return BUSINESS;
			case DISTRIBUTION_CENTER_VALUE: return DISTRIBUTION_CENTER;
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
	private RecipientType(int value, String name, String literal) {
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
	
} //RecipientType
