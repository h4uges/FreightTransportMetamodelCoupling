/**
 */
package MATSimFreightMetamodel.matsim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transport Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MATSimFreightMetamodel.matsim.MatsimPackage#getTransportMode()
 * @model
 * @generated
 */
public enum TransportMode implements Enumerator {
	/**
	 * The '<em><b>Car</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR_VALUE
	 * @generated
	 * @ordered
	 */
	CAR(0, "car", "car"),

	/**
	 * The '<em><b>Ride</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIDE_VALUE
	 * @generated
	 * @ordered
	 */
	RIDE(1, "ride", "ride"),

	/**
	 * The '<em><b>Bike</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIKE_VALUE
	 * @generated
	 * @ordered
	 */
	BIKE(2, "bike", "bike"),

	/**
	 * The '<em><b>Motorcycle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTORCYCLE_VALUE
	 * @generated
	 * @ordered
	 */
	MOTORCYCLE(3, "motorcycle", "motorcycle"),

	/**
	 * The '<em><b>Truck</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUCK_VALUE
	 * @generated
	 * @ordered
	 */
	TRUCK(4, "truck", "truck"),

	/**
	 * The '<em><b>Pt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PT_VALUE
	 * @generated
	 * @ordered
	 */
	PT(5, "pt", "pt"),

	/**
	 * The '<em><b>Drt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRT_VALUE
	 * @generated
	 * @ordered
	 */
	DRT(6, "drt", "drt"),

	/**
	 * The '<em><b>Taxi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAXI_VALUE
	 * @generated
	 * @ordered
	 */
	TAXI(7, "taxi", "taxi"),

	/**
	 * The '<em><b>Walk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WALK_VALUE
	 * @generated
	 * @ordered
	 */
	WALK(8, "walk", "walk"),

	/**
	 * The '<em><b>Transit walk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSIT_WALK_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSIT_WALK(9, "transit_walk", "transit_walk"),

	/**
	 * The '<em><b>Train</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIN_VALUE
	 * @generated
	 * @ordered
	 */
	TRAIN(10, "train", "train"),

	/**
	 * The '<em><b>Ship</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHIP_VALUE
	 * @generated
	 * @ordered
	 */
	SHIP(11, "ship", "ship"),

	/**
	 * The '<em><b>Airplane</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRPLANE_VALUE
	 * @generated
	 * @ordered
	 */
	AIRPLANE(12, "airplane", "airplane"),

	/**
	 * The '<em><b>Non network walk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_NETWORK_WALK_VALUE
	 * @generated
	 * @ordered
	 */
	NON_NETWORK_WALK(13, "non_network_walk", "non_network_walk"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(14, "other", "other");

	/**
	 * The '<em><b>Car</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR
	 * @model name="car"
	 * @generated
	 * @ordered
	 */
	public static final int CAR_VALUE = 0;

	/**
	 * The '<em><b>Ride</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIDE
	 * @model name="ride"
	 * @generated
	 * @ordered
	 */
	public static final int RIDE_VALUE = 1;

	/**
	 * The '<em><b>Bike</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIKE
	 * @model name="bike"
	 * @generated
	 * @ordered
	 */
	public static final int BIKE_VALUE = 2;

	/**
	 * The '<em><b>Motorcycle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTORCYCLE
	 * @model name="motorcycle"
	 * @generated
	 * @ordered
	 */
	public static final int MOTORCYCLE_VALUE = 3;

	/**
	 * The '<em><b>Truck</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUCK
	 * @model name="truck"
	 * @generated
	 * @ordered
	 */
	public static final int TRUCK_VALUE = 4;

	/**
	 * The '<em><b>Pt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PT
	 * @model name="pt"
	 * @generated
	 * @ordered
	 */
	public static final int PT_VALUE = 5;

	/**
	 * The '<em><b>Drt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRT
	 * @model name="drt"
	 * @generated
	 * @ordered
	 */
	public static final int DRT_VALUE = 6;

	/**
	 * The '<em><b>Taxi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAXI
	 * @model name="taxi"
	 * @generated
	 * @ordered
	 */
	public static final int TAXI_VALUE = 7;

	/**
	 * The '<em><b>Walk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WALK
	 * @model name="walk"
	 * @generated
	 * @ordered
	 */
	public static final int WALK_VALUE = 8;

	/**
	 * The '<em><b>Transit walk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSIT_WALK
	 * @model name="transit_walk"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSIT_WALK_VALUE = 9;

	/**
	 * The '<em><b>Train</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIN
	 * @model name="train"
	 * @generated
	 * @ordered
	 */
	public static final int TRAIN_VALUE = 10;

	/**
	 * The '<em><b>Ship</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHIP
	 * @model name="ship"
	 * @generated
	 * @ordered
	 */
	public static final int SHIP_VALUE = 11;

	/**
	 * The '<em><b>Airplane</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRPLANE
	 * @model name="airplane"
	 * @generated
	 * @ordered
	 */
	public static final int AIRPLANE_VALUE = 12;

	/**
	 * The '<em><b>Non network walk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_NETWORK_WALK
	 * @model name="non_network_walk"
	 * @generated
	 * @ordered
	 */
	public static final int NON_NETWORK_WALK_VALUE = 13;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 14;

	/**
	 * An array of all the '<em><b>Transport Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransportMode[] VALUES_ARRAY =
		new TransportMode[] {
			CAR,
			RIDE,
			BIKE,
			MOTORCYCLE,
			TRUCK,
			PT,
			DRT,
			TAXI,
			WALK,
			TRANSIT_WALK,
			TRAIN,
			SHIP,
			AIRPLANE,
			NON_NETWORK_WALK,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Transport Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransportMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transport Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransportMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransportMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transport Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransportMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransportMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transport Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransportMode get(int value) {
		switch (value) {
			case CAR_VALUE: return CAR;
			case RIDE_VALUE: return RIDE;
			case BIKE_VALUE: return BIKE;
			case MOTORCYCLE_VALUE: return MOTORCYCLE;
			case TRUCK_VALUE: return TRUCK;
			case PT_VALUE: return PT;
			case DRT_VALUE: return DRT;
			case TAXI_VALUE: return TAXI;
			case WALK_VALUE: return WALK;
			case TRANSIT_WALK_VALUE: return TRANSIT_WALK;
			case TRAIN_VALUE: return TRAIN;
			case SHIP_VALUE: return SHIP;
			case AIRPLANE_VALUE: return AIRPLANE;
			case NON_NETWORK_WALK_VALUE: return NON_NETWORK_WALK;
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
	private TransportMode(int value, String name, String literal) {
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
	
} //TransportMode
