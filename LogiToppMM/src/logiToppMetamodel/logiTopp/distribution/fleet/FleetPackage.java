/**
 */
package logiToppMetamodel.logiTopp.distribution.fleet;

import logiToppMetamodel.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see logiToppMetamodel.logiTopp.distribution.fleet.FleetFactory
 * @model kind="package"
 * @generated
 */
public interface FleetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fleet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/logiToppMetamodel/logiTopp/distribution/fleet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fleet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FleetPackage eINSTANCE = logiToppMetamodel.logiTopp.distribution.fleet.impl.FleetPackageImpl.init();

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.distribution.fleet.impl.FleetImpl <em>Fleet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.impl.FleetImpl
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.impl.FleetPackageImpl#getFleet()
	 * @generated
	 */
	int FLEET = 0;

	/**
	 * The feature id for the '<em><b>Vehicle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET__VEHICLE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Delivery Vehicles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET__DELIVERY_VEHICLES = 1;

	/**
	 * The number of structural features of the '<em>Fleet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fleet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.distribution.fleet.impl.DeliveryVehicleImpl <em>Delivery Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.impl.DeliveryVehicleImpl
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.impl.FleetPackageImpl#getDeliveryVehicle()
	 * @generated
	 */
	int DELIVERY_VEHICLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_VEHICLE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Vehicle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_VEHICLE__VEHICLE_TYPE = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_VEHICLE__CAPACITY = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Earliest Start Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_VEHICLE__EARLIEST_START_TIME = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Latest End Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_VEHICLE__LATEST_END_TIME = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Delivery Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_VEHICLE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Delivery Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_VEHICLE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.distribution.fleet.VehicleType <em>Vehicle Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.VehicleType
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.impl.FleetPackageImpl#getVehicleType()
	 * @generated
	 */
	int VEHICLE_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.distribution.fleet.Fleet <em>Fleet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fleet</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.Fleet
	 * @generated
	 */
	EClass getFleet();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.distribution.fleet.Fleet#getVehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Type</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.Fleet#getVehicleType()
	 * @see #getFleet()
	 * @generated
	 */
	EAttribute getFleet_VehicleType();

	/**
	 * Returns the meta object for the containment reference list '{@link logiToppMetamodel.logiTopp.distribution.fleet.Fleet#getDeliveryVehicles <em>Delivery Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delivery Vehicles</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.Fleet#getDeliveryVehicles()
	 * @see #getFleet()
	 * @generated
	 */
	EReference getFleet_DeliveryVehicles();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle <em>Delivery Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery Vehicle</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle
	 * @generated
	 */
	EClass getDeliveryVehicle();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle#getVehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Type</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle#getVehicleType()
	 * @see #getDeliveryVehicle()
	 * @generated
	 */
	EAttribute getDeliveryVehicle_VehicleType();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle#getCapacity()
	 * @see #getDeliveryVehicle()
	 * @generated
	 */
	EAttribute getDeliveryVehicle_Capacity();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle#getEarliestStartTime <em>Earliest Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Earliest Start Time</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle#getEarliestStartTime()
	 * @see #getDeliveryVehicle()
	 * @generated
	 */
	EReference getDeliveryVehicle_EarliestStartTime();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle#getLatestEndTime <em>Latest End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Latest End Time</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle#getLatestEndTime()
	 * @see #getDeliveryVehicle()
	 * @generated
	 */
	EReference getDeliveryVehicle_LatestEndTime();

	/**
	 * Returns the meta object for enum '{@link logiToppMetamodel.logiTopp.distribution.fleet.VehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vehicle Type</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.fleet.VehicleType
	 * @generated
	 */
	EEnum getVehicleType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FleetFactory getFleetFactory();

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
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.distribution.fleet.impl.FleetImpl <em>Fleet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.distribution.fleet.impl.FleetImpl
		 * @see logiToppMetamodel.logiTopp.distribution.fleet.impl.FleetPackageImpl#getFleet()
		 * @generated
		 */
		EClass FLEET = eINSTANCE.getFleet();

		/**
		 * The meta object literal for the '<em><b>Vehicle Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLEET__VEHICLE_TYPE = eINSTANCE.getFleet_VehicleType();

		/**
		 * The meta object literal for the '<em><b>Delivery Vehicles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLEET__DELIVERY_VEHICLES = eINSTANCE.getFleet_DeliveryVehicles();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.distribution.fleet.impl.DeliveryVehicleImpl <em>Delivery Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.distribution.fleet.impl.DeliveryVehicleImpl
		 * @see logiToppMetamodel.logiTopp.distribution.fleet.impl.FleetPackageImpl#getDeliveryVehicle()
		 * @generated
		 */
		EClass DELIVERY_VEHICLE = eINSTANCE.getDeliveryVehicle();

		/**
		 * The meta object literal for the '<em><b>Vehicle Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_VEHICLE__VEHICLE_TYPE = eINSTANCE.getDeliveryVehicle_VehicleType();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_VEHICLE__CAPACITY = eINSTANCE.getDeliveryVehicle_Capacity();

		/**
		 * The meta object literal for the '<em><b>Earliest Start Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERY_VEHICLE__EARLIEST_START_TIME = eINSTANCE.getDeliveryVehicle_EarliestStartTime();

		/**
		 * The meta object literal for the '<em><b>Latest End Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERY_VEHICLE__LATEST_END_TIME = eINSTANCE.getDeliveryVehicle_LatestEndTime();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.distribution.fleet.VehicleType <em>Vehicle Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.distribution.fleet.VehicleType
		 * @see logiToppMetamodel.logiTopp.distribution.fleet.impl.FleetPackageImpl#getVehicleType()
		 * @generated
		 */
		EEnum VEHICLE_TYPE = eINSTANCE.getVehicleType();

	}

} //FleetPackage
