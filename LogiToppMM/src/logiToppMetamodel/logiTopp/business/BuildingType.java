/**
 */
package logiToppMetamodel.logiTopp.business;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Building Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.business.BusinessPackage#getBuildingType()
 * @model
 * @generated
 */
public enum BuildingType implements Enumerator {
	/**
	 * The '<em><b>LEISURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEISURE_VALUE
	 * @generated
	 * @ordered
	 */
	LEISURE(2, "LEISURE", "LEISURE"),

	/**
	 * The '<em><b>HOSPITAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOSPITAL_VALUE
	 * @generated
	 * @ordered
	 */
	HOSPITAL(7, "HOSPITAL", "HOSPITAL"),

	/**
	 * The '<em><b>STORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORE_VALUE
	 * @generated
	 * @ordered
	 */
	STORE(1, "STORE", "STORE"),

	/**
	 * The '<em><b>HOTEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOTEL_VALUE
	 * @generated
	 * @ordered
	 */
	HOTEL(4, "HOTEL", "HOTEL"),

	/**
	 * The '<em><b>WAREHAUSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAREHAUSE_VALUE
	 * @generated
	 * @ordered
	 */
	WAREHAUSE(8, "WAREHAUSE", "WAREHAUSE"),

	/**
	 * The '<em><b>SCHOOL UNIVERSITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHOOL_UNIVERSITY_VALUE
	 * @generated
	 * @ordered
	 */
	SCHOOL_UNIVERSITY(9, "SCHOOL_UNIVERSITY", "SCHOOL_UNIVERSITY"),

	/**
	 * The '<em><b>RESTAURANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTAURANT_VALUE
	 * @generated
	 * @ordered
	 */
	RESTAURANT(3, "RESTAURANT", "RESTAURANT"),

	/**
	 * The '<em><b>IINDUSTRIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IINDUSTRIAL_VALUE
	 * @generated
	 * @ordered
	 */
	IINDUSTRIAL(6, "IINDUSTRIAL", "IINDUSTRIAL"),

	/**
	 * The '<em><b>OFFICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFICE_VALUE
	 * @generated
	 * @ordered
	 */
	OFFICE(5, "OFFICE", "OFFICE"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(0, "OTHER", "OTHER");

	/**
	 * The '<em><b>LEISURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEISURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEISURE_VALUE = 2;

	/**
	 * The '<em><b>HOSPITAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOSPITAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOSPITAL_VALUE = 7;

	/**
	 * The '<em><b>STORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STORE_VALUE = 1;

	/**
	 * The '<em><b>HOTEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOTEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL_VALUE = 4;

	/**
	 * The '<em><b>WAREHAUSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAREHAUSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAREHAUSE_VALUE = 8;

	/**
	 * The '<em><b>SCHOOL UNIVERSITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHOOL_UNIVERSITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCHOOL_UNIVERSITY_VALUE = 9;

	/**
	 * The '<em><b>RESTAURANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTAURANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESTAURANT_VALUE = 3;

	/**
	 * The '<em><b>IINDUSTRIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IINDUSTRIAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IINDUSTRIAL_VALUE = 6;

	/**
	 * The '<em><b>OFFICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OFFICE_VALUE = 5;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 0;

	/**
	 * An array of all the '<em><b>Building Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BuildingType[] VALUES_ARRAY =
		new BuildingType[] {
			LEISURE,
			HOSPITAL,
			STORE,
			HOTEL,
			WAREHAUSE,
			SCHOOL_UNIVERSITY,
			RESTAURANT,
			IINDUSTRIAL,
			OFFICE,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Building Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BuildingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Building Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BuildingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BuildingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Building Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BuildingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BuildingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Building Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BuildingType get(int value) {
		switch (value) {
			case LEISURE_VALUE: return LEISURE;
			case HOSPITAL_VALUE: return HOSPITAL;
			case STORE_VALUE: return STORE;
			case HOTEL_VALUE: return HOTEL;
			case WAREHAUSE_VALUE: return WAREHAUSE;
			case SCHOOL_UNIVERSITY_VALUE: return SCHOOL_UNIVERSITY;
			case RESTAURANT_VALUE: return RESTAURANT;
			case IINDUSTRIAL_VALUE: return IINDUSTRIAL;
			case OFFICE_VALUE: return OFFICE;
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
	private BuildingType(int value, String name, String literal) {
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
	
} //BuildingType
