/**
 */
package logiToppMetamodel.logiTopp.parcels;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parcel State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.parcels.ParcelsPackage#getParcelState()
 * @model
 * @generated
 */
public enum ParcelState implements Enumerator {
	/**
	 * The '<em><b>DELIVERED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELIVERED_VALUE
	 * @generated
	 * @ordered
	 */
	DELIVERED(0, "DELIVERED", "DELIVERED"),

	/**
	 * The '<em><b>RETURNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETURNING_VALUE
	 * @generated
	 * @ordered
	 */
	RETURNING(1, "RETURNING", "RETURNING"),

	/**
	 * The '<em><b>ONDELIVERY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONDELIVERY_VALUE
	 * @generated
	 * @ordered
	 */
	ONDELIVERY(2, "ONDELIVERY", "ONDELIVERY"),

	/**
	 * The '<em><b>UNDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(3, "UNDEFINED", "UNDEFINED");

	/**
	 * The '<em><b>DELIVERED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELIVERED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELIVERED_VALUE = 0;

	/**
	 * The '<em><b>RETURNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETURNING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RETURNING_VALUE = 1;

	/**
	 * The '<em><b>ONDELIVERY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONDELIVERY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONDELIVERY_VALUE = 2;

	/**
	 * The '<em><b>UNDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Parcel State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParcelState[] VALUES_ARRAY =
		new ParcelState[] {
			DELIVERED,
			RETURNING,
			ONDELIVERY,
			UNDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Parcel State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParcelState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parcel State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParcelState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParcelState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parcel State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParcelState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParcelState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parcel State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParcelState get(int value) {
		switch (value) {
			case DELIVERED_VALUE: return DELIVERED;
			case RETURNING_VALUE: return RETURNING;
			case ONDELIVERY_VALUE: return ONDELIVERY;
			case UNDEFINED_VALUE: return UNDEFINED;
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
	private ParcelState(int value, String name, String literal) {
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
	
} //ParcelState
