/**
 */
package CommonFreightTransportMetamodel.network;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Vehicle Type </b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CommonFreightTransportMetamodel.network.NetworkPackage#getVehicleType_()
 * @model
 * @generated
 */
public enum VehicleType_ implements Enumerator {
	/**
	 * The '<em><b>TRUCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUCK_VALUE
	 * @generated
	 * @ordered
	 */
	TRUCK(0, "TRUCK", "TRUCK"),

	/**
	 * The '<em><b>TRAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAM_VALUE
	 * @generated
	 * @ordered
	 */
	TRAM(1, "TRAM", "TRAM"),

	/**
	 * The '<em><b>CAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR_VALUE
	 * @generated
	 * @ordered
	 */
	CAR(2, "CAR", "CAR"),

	/**
	 * The '<em><b>BIKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIKE_VALUE
	 * @generated
	 * @ordered
	 */
	BIKE(3, "BIKE", "BIKE"),

	/**
	 * The '<em><b>WALKING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WALKING_VALUE
	 * @generated
	 * @ordered
	 */
	WALKING(4, "WALKING", "WALKING"),

	/**
	 * The '<em><b>DELIVERY VEHICLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELIVERY_VEHICLE_VALUE
	 * @generated
	 * @ordered
	 */
	DELIVERY_VEHICLE(5, "DELIVERY_VEHICLE", "DELIVERY_VEHICLE"),

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
	 * The '<em><b>TRUCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRUCK_VALUE = 0;

	/**
	 * The '<em><b>TRAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAM_VALUE = 1;

	/**
	 * The '<em><b>CAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAR_VALUE = 2;

	/**
	 * The '<em><b>BIKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIKE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIKE_VALUE = 3;

	/**
	 * The '<em><b>WALKING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WALKING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WALKING_VALUE = 4;

	/**
	 * The '<em><b>DELIVERY VEHICLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELIVERY_VEHICLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELIVERY_VEHICLE_VALUE = 5;

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
	 * An array of all the '<em><b>Vehicle Type </b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VehicleType_[] VALUES_ARRAY =
		new VehicleType_[] {
			TRUCK,
			TRAM,
			CAR,
			BIKE,
			WALKING,
			DELIVERY_VEHICLE,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Vehicle Type </b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VehicleType_> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Vehicle Type </b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VehicleType_ get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VehicleType_ result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vehicle Type </b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VehicleType_ getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VehicleType_ result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vehicle Type </b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VehicleType_ get(int value) {
		switch (value) {
			case TRUCK_VALUE: return TRUCK;
			case TRAM_VALUE: return TRAM;
			case CAR_VALUE: return CAR;
			case BIKE_VALUE: return BIKE;
			case WALKING_VALUE: return WALKING;
			case DELIVERY_VEHICLE_VALUE: return DELIVERY_VEHICLE;
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
	private VehicleType_(int value, String name, String literal) {
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
	
} //VehicleType_
