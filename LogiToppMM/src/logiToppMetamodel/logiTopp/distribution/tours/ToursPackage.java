/**
 */
package logiToppMetamodel.logiTopp.distribution.tours;

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
 * @see logiToppMetamodel.logiTopp.distribution.tours.ToursFactory
 * @model kind="package"
 * @generated
 */
public interface ToursPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tours";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/logiToppMetamodel/logiTopp/distribution/tours";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tours";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToursPackage eINSTANCE = logiToppMetamodel.logiTopp.distribution.tours.impl.ToursPackageImpl.init();

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.distribution.tours.impl.PlannedDeliveryTourImpl <em>Planned Delivery Tour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.distribution.tours.impl.PlannedDeliveryTourImpl
	 * @see logiToppMetamodel.logiTopp.distribution.tours.impl.ToursPackageImpl#getPlannedDeliveryTour()
	 * @generated
	 */
	int PLANNED_DELIVERY_TOUR = 0;

	/**
	 * The feature id for the '<em><b>Stops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_DELIVERY_TOUR__STOPS = 0;

	/**
	 * The feature id for the '<em><b>Vehicle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_DELIVERY_TOUR__VEHICLE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Planned Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_DELIVERY_TOUR__PLANNED_DURATION = 2;

	/**
	 * The feature id for the '<em><b>Planned At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_DELIVERY_TOUR__PLANNED_AT = 3;

	/**
	 * The feature id for the '<em><b>Executing CEPSP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_DELIVERY_TOUR__EXECUTING_CEPSP = 4;

	/**
	 * The number of structural features of the '<em>Planned Delivery Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_DELIVERY_TOUR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Planned Delivery Tour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNED_DELIVERY_TOUR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour <em>Planned Delivery Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planned Delivery Tour</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour
	 * @generated
	 */
	EClass getPlannedDeliveryTour();

	/**
	 * Returns the meta object for the containment reference list '{@link logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getStops <em>Stops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stops</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getStops()
	 * @see #getPlannedDeliveryTour()
	 * @generated
	 */
	EReference getPlannedDeliveryTour_Stops();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getVehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Type</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getVehicleType()
	 * @see #getPlannedDeliveryTour()
	 * @generated
	 */
	EAttribute getPlannedDeliveryTour_VehicleType();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getPlannedDuration <em>Planned Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Planned Duration</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getPlannedDuration()
	 * @see #getPlannedDeliveryTour()
	 * @generated
	 */
	EReference getPlannedDeliveryTour_PlannedDuration();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getPlannedAt <em>Planned At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Planned At</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getPlannedAt()
	 * @see #getPlannedDeliveryTour()
	 * @generated
	 */
	EReference getPlannedDeliveryTour_PlannedAt();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getExecutingCEPSP <em>Executing CEPSP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executing CEPSP</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour#getExecutingCEPSP()
	 * @see #getPlannedDeliveryTour()
	 * @generated
	 */
	EReference getPlannedDeliveryTour_ExecutingCEPSP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToursFactory getToursFactory();

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
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.distribution.tours.impl.PlannedDeliveryTourImpl <em>Planned Delivery Tour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.distribution.tours.impl.PlannedDeliveryTourImpl
		 * @see logiToppMetamodel.logiTopp.distribution.tours.impl.ToursPackageImpl#getPlannedDeliveryTour()
		 * @generated
		 */
		EClass PLANNED_DELIVERY_TOUR = eINSTANCE.getPlannedDeliveryTour();

		/**
		 * The meta object literal for the '<em><b>Stops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANNED_DELIVERY_TOUR__STOPS = eINSTANCE.getPlannedDeliveryTour_Stops();

		/**
		 * The meta object literal for the '<em><b>Vehicle Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANNED_DELIVERY_TOUR__VEHICLE_TYPE = eINSTANCE.getPlannedDeliveryTour_VehicleType();

		/**
		 * The meta object literal for the '<em><b>Planned Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANNED_DELIVERY_TOUR__PLANNED_DURATION = eINSTANCE.getPlannedDeliveryTour_PlannedDuration();

		/**
		 * The meta object literal for the '<em><b>Planned At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANNED_DELIVERY_TOUR__PLANNED_AT = eINSTANCE.getPlannedDeliveryTour_PlannedAt();

		/**
		 * The meta object literal for the '<em><b>Executing CEPSP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANNED_DELIVERY_TOUR__EXECUTING_CEPSP = eINSTANCE.getPlannedDeliveryTour_ExecutingCEPSP();

	}

} //ToursPackage
