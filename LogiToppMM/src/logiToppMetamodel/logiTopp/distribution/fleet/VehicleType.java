/**
 */
package logiToppMetamodel.logiTopp.distribution.fleet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Vehicle Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.distribution.fleet.FleetPackage#getVehicleType()
 * @model
 * @generated
 */
public enum VehicleType implements Enumerator {
	/**
	 * The '<em><b>BIKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIKE_VALUE
	 * @generated
	 * @ordered
	 */
	BIKE(1, "BIKE", "BIKE"),

	/**
	 * The '<em><b>TRUCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUCK_VALUE
	 * @generated
	 * @ordered
	 */
	TRUCK(2, "TRUCK", "TRUCK"),

	/**
	 * The '<em><b>TRAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAM_VALUE
	 * @generated
	 * @ordered
	 */
	TRAM(3, "TRAM", "TRAM"),

	/**
	 * The '<em><b>OTHERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHERS_VALUE
	 * @generated
	 * @ordered
	 */
	OTHERS(0, "OTHERS", "OTHERS");

	/**
	 * The '<em><b>BIKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIKE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIKE_VALUE = 1;

	/**
	 * The '<em><b>TRUCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRUCK_VALUE = 2;

	/**
	 * The '<em><b>TRAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAM_VALUE = 3;

	/**
	 * The '<em><b>OTHERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHERS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHERS_VALUE = 0;

	/**
	 * An array of all the '<em><b>Vehicle Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VehicleType[] VALUES_ARRAY =
		new VehicleType[] {
			BIKE,
			TRUCK,
			TRAM,
			OTHERS,
		};

	/**
	 * A public read-only list of all the '<em><b>Vehicle Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VehicleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Vehicle Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VehicleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VehicleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vehicle Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VehicleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VehicleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vehicle Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VehicleType get(int value) {
		switch (value) {
			case BIKE_VALUE: return BIKE;
			case TRUCK_VALUE: return TRUCK;
			case TRAM_VALUE: return TRAM;
			case OTHERS_VALUE: return OTHERS;
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
	private VehicleType(int value, String name, String literal) {
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
	
} //VehicleType
