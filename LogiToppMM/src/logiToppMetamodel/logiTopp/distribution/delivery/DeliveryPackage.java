/**
 */
package logiToppMetamodel.logiTopp.distribution.delivery;

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
 * @see logiToppMetamodel.logiTopp.distribution.delivery.DeliveryFactory
 * @model kind="package"
 * @generated
 */
public interface DeliveryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "delivery";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/logiToppMetamodel/logiTopp/distribution/delivery";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "delivery";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeliveryPackage eINSTANCE = logiToppMetamodel.logiTopp.distribution.delivery.impl.DeliveryPackageImpl.init();

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.distribution.delivery.impl.ParcelActivityImpl <em>Parcel Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.impl.ParcelActivityImpl
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.impl.DeliveryPackageImpl#getParcelActivity()
	 * @generated
	 */
	int PARCEL_ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_ACTIVITY__NO = 0;

	/**
	 * The feature id for the '<em><b>Parcels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_ACTIVITY__PARCELS = 1;

	/**
	 * The feature id for the '<em><b>Pick Ups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_ACTIVITY__PICK_UPS = 2;

	/**
	 * The feature id for the '<em><b>Stop Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_ACTIVITY__STOP_LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Planned Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_ACTIVITY__PLANNED_TIME = 4;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_ACTIVITY__DISTANCE = 5;

	/**
	 * The feature id for the '<em><b>Trip Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_ACTIVITY__TRIP_DURATION = 6;

	/**
	 * The feature id for the '<em><b>Delivery Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_ACTIVITY__DELIVERY_DURATION = 7;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_ACTIVITY__VEHICLE = 8;

	/**
	 * The number of structural features of the '<em>Parcel Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_ACTIVITY_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Parcel Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_ACTIVITY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity <em>Parcel Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parcel Activity</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity
	 * @generated
	 */
	EClass getParcelActivity();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getNo <em>No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getNo()
	 * @see #getParcelActivity()
	 * @generated
	 */
	EAttribute getParcelActivity_No();

	/**
	 * Returns the meta object for the reference list '{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getParcels <em>Parcels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parcels</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getParcels()
	 * @see #getParcelActivity()
	 * @generated
	 */
	EReference getParcelActivity_Parcels();

	/**
	 * Returns the meta object for the reference list '{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getPickUps <em>Pick Ups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pick Ups</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getPickUps()
	 * @see #getParcelActivity()
	 * @generated
	 */
	EReference getParcelActivity_PickUps();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getStopLocation <em>Stop Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Location</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getStopLocation()
	 * @see #getParcelActivity()
	 * @generated
	 */
	EReference getParcelActivity_StopLocation();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getPlannedTime <em>Planned Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Planned Time</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getPlannedTime()
	 * @see #getParcelActivity()
	 * @generated
	 */
	EReference getParcelActivity_PlannedTime();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getDistance()
	 * @see #getParcelActivity()
	 * @generated
	 */
	EAttribute getParcelActivity_Distance();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getTripDuration <em>Trip Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trip Duration</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getTripDuration()
	 * @see #getParcelActivity()
	 * @generated
	 */
	EAttribute getParcelActivity_TripDuration();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getDeliveryDuration <em>Delivery Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Duration</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getDeliveryDuration()
	 * @see #getParcelActivity()
	 * @generated
	 */
	EAttribute getParcelActivity_DeliveryDuration();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity#getVehicle()
	 * @see #getParcelActivity()
	 * @generated
	 */
	EReference getParcelActivity_Vehicle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeliveryFactory getDeliveryFactory();

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
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.distribution.delivery.impl.ParcelActivityImpl <em>Parcel Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.distribution.delivery.impl.ParcelActivityImpl
		 * @see logiToppMetamodel.logiTopp.distribution.delivery.impl.DeliveryPackageImpl#getParcelActivity()
		 * @generated
		 */
		EClass PARCEL_ACTIVITY = eINSTANCE.getParcelActivity();

		/**
		 * The meta object literal for the '<em><b>No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCEL_ACTIVITY__NO = eINSTANCE.getParcelActivity_No();

		/**
		 * The meta object literal for the '<em><b>Parcels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCEL_ACTIVITY__PARCELS = eINSTANCE.getParcelActivity_Parcels();

		/**
		 * The meta object literal for the '<em><b>Pick Ups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCEL_ACTIVITY__PICK_UPS = eINSTANCE.getParcelActivity_PickUps();

		/**
		 * The meta object literal for the '<em><b>Stop Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCEL_ACTIVITY__STOP_LOCATION = eINSTANCE.getParcelActivity_StopLocation();

		/**
		 * The meta object literal for the '<em><b>Planned Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCEL_ACTIVITY__PLANNED_TIME = eINSTANCE.getParcelActivity_PlannedTime();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCEL_ACTIVITY__DISTANCE = eINSTANCE.getParcelActivity_Distance();

		/**
		 * The meta object literal for the '<em><b>Trip Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCEL_ACTIVITY__TRIP_DURATION = eINSTANCE.getParcelActivity_TripDuration();

		/**
		 * The meta object literal for the '<em><b>Delivery Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCEL_ACTIVITY__DELIVERY_DURATION = eINSTANCE.getParcelActivity_DeliveryDuration();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCEL_ACTIVITY__VEHICLE = eINSTANCE.getParcelActivity_Vehicle();

	}

} //DeliveryPackage
