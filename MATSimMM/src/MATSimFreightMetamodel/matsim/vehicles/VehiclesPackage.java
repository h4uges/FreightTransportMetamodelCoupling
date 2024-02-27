/**
 */
package MATSimFreightMetamodel.matsim.vehicles;

import MATSimFreightMetamodel.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesFactory
 * @model kind="package"
 * @generated
 */
public interface VehiclesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vehicles";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/MATSimFreightMetamodel/matsim/vehicles";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vehicles";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VehiclesPackage eINSTANCE = MATSimFreightMetamodel.matsim.vehicles.impl.VehiclesPackageImpl.init();

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleTypeImpl <em>Vehicle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.matsim.vehicles.impl.VehicleTypeImpl
	 * @see MATSimFreightMetamodel.matsim.vehicles.impl.VehiclesPackageImpl#getVehicleType()
	 * @generated
	 */
	int VEHICLE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__WIDTH = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__MAX_VELOCITY = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__LENGTH = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pcu Equivalents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__PCU_EQUIVALENTS = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Flow Efficiency Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__FLOW_EFFICIENCY_FACTOR = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__DESCRIPTION = BasePackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Network Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__NETWORK_MODE = BasePackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__CAPACITY = BasePackage.ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Vehicle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Vehicle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleCapacityImpl <em>Vehicle Capacity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.matsim.vehicles.impl.VehicleCapacityImpl
	 * @see MATSimFreightMetamodel.matsim.vehicles.impl.VehiclesPackageImpl#getVehicleCapacity()
	 * @generated
	 */
	int VEHICLE_CAPACITY = 1;

	/**
	 * The feature id for the '<em><b>Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_CAPACITY__SEATS = 0;

	/**
	 * The feature id for the '<em><b>Standing Room</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_CAPACITY__STANDING_ROOM = 1;

	/**
	 * The feature id for the '<em><b>Volume In Cubic Meters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_CAPACITY__VOLUME_IN_CUBIC_METERS = 2;

	/**
	 * The feature id for the '<em><b>Weight In Tons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_CAPACITY__WEIGHT_IN_TONS = 3;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_CAPACITY__OTHER = 4;

	/**
	 * The number of structural features of the '<em>Vehicle Capacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_CAPACITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Vehicle Capacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_CAPACITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.matsim.vehicles.impl.VehicleImpl
	 * @see MATSimFreightMetamodel.matsim.vehicles.impl.VehiclesPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__TYPE = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleTypesImpl <em>Vehicle Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.matsim.vehicles.impl.VehicleTypesImpl
	 * @see MATSimFreightMetamodel.matsim.vehicles.impl.VehiclesPackageImpl#getVehicleTypes()
	 * @generated
	 */
	int VEHICLE_TYPES = 3;

	/**
	 * The feature id for the '<em><b>Vehicle Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPES__VEHICLE_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Vehicles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPES__VEHICLES = 1;

	/**
	 * The number of structural features of the '<em>Vehicle Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Vehicle Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.matsim.vehicles.impl.PersonVehicleImpl <em>Person Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.matsim.vehicles.impl.PersonVehicleImpl
	 * @see MATSimFreightMetamodel.matsim.vehicles.impl.VehiclesPackageImpl#getPersonVehicle()
	 * @generated
	 */
	int PERSON_VEHICLE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_VEHICLE__ID = VEHICLE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_VEHICLE__TYPE = VEHICLE__TYPE;

	/**
	 * The number of structural features of the '<em>Person Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_VEHICLE_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Person Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_VEHICLE_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Type</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleType
	 * @generated
	 */
	EClass getVehicleType();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleType#getWidth()
	 * @see #getVehicleType()
	 * @generated
	 */
	EAttribute getVehicleType_Width();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getMaxVelocity <em>Max Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Velocity</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleType#getMaxVelocity()
	 * @see #getVehicleType()
	 * @generated
	 */
	EAttribute getVehicleType_MaxVelocity();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleType#getLength()
	 * @see #getVehicleType()
	 * @generated
	 */
	EAttribute getVehicleType_Length();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getPcuEquivalents <em>Pcu Equivalents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pcu Equivalents</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleType#getPcuEquivalents()
	 * @see #getVehicleType()
	 * @generated
	 */
	EAttribute getVehicleType_PcuEquivalents();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getFlowEfficiencyFactor <em>Flow Efficiency Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Efficiency Factor</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleType#getFlowEfficiencyFactor()
	 * @see #getVehicleType()
	 * @generated
	 */
	EAttribute getVehicleType_FlowEfficiencyFactor();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleType#getDescription()
	 * @see #getVehicleType()
	 * @generated
	 */
	EAttribute getVehicleType_Description();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getNetworkMode <em>Network Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Mode</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleType#getNetworkMode()
	 * @see #getVehicleType()
	 * @generated
	 */
	EAttribute getVehicleType_NetworkMode();

	/**
	 * Returns the meta object for the containment reference '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capacity</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleType#getCapacity()
	 * @see #getVehicleType()
	 * @generated
	 */
	EReference getVehicleType_Capacity();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity <em>Vehicle Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Capacity</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity
	 * @generated
	 */
	EClass getVehicleCapacity();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getSeats <em>Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seats</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getSeats()
	 * @see #getVehicleCapacity()
	 * @generated
	 */
	EAttribute getVehicleCapacity_Seats();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getStandingRoom <em>Standing Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standing Room</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getStandingRoom()
	 * @see #getVehicleCapacity()
	 * @generated
	 */
	EAttribute getVehicleCapacity_StandingRoom();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getVolumeInCubicMeters <em>Volume In Cubic Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume In Cubic Meters</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getVolumeInCubicMeters()
	 * @see #getVehicleCapacity()
	 * @generated
	 */
	EAttribute getVehicleCapacity_VolumeInCubicMeters();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getWeightInTons <em>Weight In Tons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight In Tons</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getWeightInTons()
	 * @see #getVehicleCapacity()
	 * @generated
	 */
	EAttribute getVehicleCapacity_WeightInTons();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity#getOther()
	 * @see #getVehicleCapacity()
	 * @generated
	 */
	EAttribute getVehicleCapacity_Other();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.matsim.vehicles.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.matsim.vehicles.Vehicle#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.Vehicle#getType()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_Type();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleTypes <em>Vehicle Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Types</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleTypes
	 * @generated
	 */
	EClass getVehicleTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleTypes#getVehicleTypes <em>Vehicle Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vehicle Types</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleTypes#getVehicleTypes()
	 * @see #getVehicleTypes()
	 * @generated
	 */
	EReference getVehicleTypes_VehicleTypes();

	/**
	 * Returns the meta object for the reference list '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleTypes#getVehicles <em>Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vehicles</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleTypes#getVehicles()
	 * @see #getVehicleTypes()
	 * @generated
	 */
	EReference getVehicleTypes_Vehicles();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.matsim.vehicles.PersonVehicle <em>Person Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Vehicle</em>'.
	 * @see MATSimFreightMetamodel.matsim.vehicles.PersonVehicle
	 * @generated
	 */
	EClass getPersonVehicle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VehiclesFactory getVehiclesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleTypeImpl <em>Vehicle Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.matsim.vehicles.impl.VehicleTypeImpl
		 * @see MATSimFreightMetamodel.matsim.vehicles.impl.VehiclesPackageImpl#getVehicleType()
		 * @generated
		 */
		EClass VEHICLE_TYPE = eINSTANCE.getVehicleType();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_TYPE__WIDTH = eINSTANCE.getVehicleType_Width();

		/**
		 * The meta object literal for the '<em><b>Max Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_TYPE__MAX_VELOCITY = eINSTANCE.getVehicleType_MaxVelocity();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_TYPE__LENGTH = eINSTANCE.getVehicleType_Length();

		/**
		 * The meta object literal for the '<em><b>Pcu Equivalents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_TYPE__PCU_EQUIVALENTS = eINSTANCE.getVehicleType_PcuEquivalents();

		/**
		 * The meta object literal for the '<em><b>Flow Efficiency Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_TYPE__FLOW_EFFICIENCY_FACTOR = eINSTANCE.getVehicleType_FlowEfficiencyFactor();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_TYPE__DESCRIPTION = eINSTANCE.getVehicleType_Description();

		/**
		 * The meta object literal for the '<em><b>Network Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_TYPE__NETWORK_MODE = eINSTANCE.getVehicleType_NetworkMode();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_TYPE__CAPACITY = eINSTANCE.getVehicleType_Capacity();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleCapacityImpl <em>Vehicle Capacity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.matsim.vehicles.impl.VehicleCapacityImpl
		 * @see MATSimFreightMetamodel.matsim.vehicles.impl.VehiclesPackageImpl#getVehicleCapacity()
		 * @generated
		 */
		EClass VEHICLE_CAPACITY = eINSTANCE.getVehicleCapacity();

		/**
		 * The meta object literal for the '<em><b>Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_CAPACITY__SEATS = eINSTANCE.getVehicleCapacity_Seats();

		/**
		 * The meta object literal for the '<em><b>Standing Room</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_CAPACITY__STANDING_ROOM = eINSTANCE.getVehicleCapacity_StandingRoom();

		/**
		 * The meta object literal for the '<em><b>Volume In Cubic Meters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_CAPACITY__VOLUME_IN_CUBIC_METERS = eINSTANCE.getVehicleCapacity_VolumeInCubicMeters();

		/**
		 * The meta object literal for the '<em><b>Weight In Tons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_CAPACITY__WEIGHT_IN_TONS = eINSTANCE.getVehicleCapacity_WeightInTons();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_CAPACITY__OTHER = eINSTANCE.getVehicleCapacity_Other();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.matsim.vehicles.impl.VehicleImpl
		 * @see MATSimFreightMetamodel.matsim.vehicles.impl.VehiclesPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__TYPE = eINSTANCE.getVehicle_Type();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleTypesImpl <em>Vehicle Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.matsim.vehicles.impl.VehicleTypesImpl
		 * @see MATSimFreightMetamodel.matsim.vehicles.impl.VehiclesPackageImpl#getVehicleTypes()
		 * @generated
		 */
		EClass VEHICLE_TYPES = eINSTANCE.getVehicleTypes();

		/**
		 * The meta object literal for the '<em><b>Vehicle Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_TYPES__VEHICLE_TYPES = eINSTANCE.getVehicleTypes_VehicleTypes();

		/**
		 * The meta object literal for the '<em><b>Vehicles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_TYPES__VEHICLES = eINSTANCE.getVehicleTypes_Vehicles();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.matsim.vehicles.impl.PersonVehicleImpl <em>Person Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.matsim.vehicles.impl.PersonVehicleImpl
		 * @see MATSimFreightMetamodel.matsim.vehicles.impl.VehiclesPackageImpl#getPersonVehicle()
		 * @generated
		 */
		EClass PERSON_VEHICLE = eINSTANCE.getPersonVehicle();

	}

} //VehiclesPackage
