/**
 */
package logiToppMetamodel.logiTopp.parcels;

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
 * @see logiToppMetamodel.logiTopp.parcels.ParcelsFactory
 * @model kind="package"
 * @generated
 */
public interface ParcelsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "parcels";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/logiToppMetamodel/logiTopp/parcels";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "parcels";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParcelsPackage eINSTANCE = logiToppMetamodel.logiTopp.parcels.impl.ParcelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.parcels.impl.ParcelImpl <em>Parcel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.parcels.impl.ParcelImpl
	 * @see logiToppMetamodel.logiTopp.parcels.impl.ParcelsPackageImpl#getParcel()
	 * @generated
	 */
	int PARCEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Planned Arrival Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL__PLANNED_ARRIVAL_DATE = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Producer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL__PRODUCER = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Zone And Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL__ZONE_AND_LOCATION = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Shipment Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL__SHIPMENT_SIZE = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Pickup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL__IS_PICKUP = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL__CONSUMER = BasePackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Responsible CEPSP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL__RESPONSIBLE_CEPSP = BasePackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Parcel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Parcel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.parcels.impl.PrivateParcelImpl <em>Private Parcel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.parcels.impl.PrivateParcelImpl
	 * @see logiToppMetamodel.logiTopp.parcels.impl.ParcelsPackageImpl#getPrivateParcel()
	 * @generated
	 */
	int PRIVATE_PARCEL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PARCEL__ID = PARCEL__ID;

	/**
	 * The feature id for the '<em><b>Planned Arrival Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PARCEL__PLANNED_ARRIVAL_DATE = PARCEL__PLANNED_ARRIVAL_DATE;

	/**
	 * The feature id for the '<em><b>Producer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PARCEL__PRODUCER = PARCEL__PRODUCER;

	/**
	 * The feature id for the '<em><b>Zone And Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PARCEL__ZONE_AND_LOCATION = PARCEL__ZONE_AND_LOCATION;

	/**
	 * The feature id for the '<em><b>Shipment Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PARCEL__SHIPMENT_SIZE = PARCEL__SHIPMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Is Pickup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PARCEL__IS_PICKUP = PARCEL__IS_PICKUP;

	/**
	 * The feature id for the '<em><b>Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PARCEL__CONSUMER = PARCEL__CONSUMER;

	/**
	 * The feature id for the '<em><b>Responsible CEPSP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PARCEL__RESPONSIBLE_CEPSP = PARCEL__RESPONSIBLE_CEPSP;

	/**
	 * The feature id for the '<em><b>Destination Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PARCEL__DESTINATION_TYPE = PARCEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Private Parcel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PARCEL_FEATURE_COUNT = PARCEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Private Parcel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PARCEL_OPERATION_COUNT = PARCEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.parcels.impl.BusinessParcelImpl <em>Business Parcel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.parcels.impl.BusinessParcelImpl
	 * @see logiToppMetamodel.logiTopp.parcels.impl.ParcelsPackageImpl#getBusinessParcel()
	 * @generated
	 */
	int BUSINESS_PARCEL = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PARCEL__ID = PARCEL__ID;

	/**
	 * The feature id for the '<em><b>Planned Arrival Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PARCEL__PLANNED_ARRIVAL_DATE = PARCEL__PLANNED_ARRIVAL_DATE;

	/**
	 * The feature id for the '<em><b>Producer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PARCEL__PRODUCER = PARCEL__PRODUCER;

	/**
	 * The feature id for the '<em><b>Zone And Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PARCEL__ZONE_AND_LOCATION = PARCEL__ZONE_AND_LOCATION;

	/**
	 * The feature id for the '<em><b>Shipment Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PARCEL__SHIPMENT_SIZE = PARCEL__SHIPMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Is Pickup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PARCEL__IS_PICKUP = PARCEL__IS_PICKUP;

	/**
	 * The feature id for the '<em><b>Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PARCEL__CONSUMER = PARCEL__CONSUMER;

	/**
	 * The feature id for the '<em><b>Responsible CEPSP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PARCEL__RESPONSIBLE_CEPSP = PARCEL__RESPONSIBLE_CEPSP;

	/**
	 * The number of structural features of the '<em>Business Parcel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PARCEL_FEATURE_COUNT = PARCEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Business Parcel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PARCEL_OPERATION_COUNT = PARCEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.parcels.ShipmentSize <em>Shipment Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.parcels.ShipmentSize
	 * @see logiToppMetamodel.logiTopp.parcels.impl.ParcelsPackageImpl#getShipmentSize()
	 * @generated
	 */
	int SHIPMENT_SIZE = 3;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.parcels.ParcelState <em>Parcel State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.parcels.ParcelState
	 * @see logiToppMetamodel.logiTopp.parcels.impl.ParcelsPackageImpl#getParcelState()
	 * @generated
	 */
	int PARCEL_STATE = 4;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.parcels.ParcelDestinationType <em>Parcel Destination Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.parcels.ParcelDestinationType
	 * @see logiToppMetamodel.logiTopp.parcels.impl.ParcelsPackageImpl#getParcelDestinationType()
	 * @generated
	 */
	int PARCEL_DESTINATION_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.parcels.Parcel <em>Parcel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parcel</em>'.
	 * @see logiToppMetamodel.logiTopp.parcels.Parcel
	 * @generated
	 */
	EClass getParcel();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.parcels.Parcel#getPlannedArrivalDate <em>Planned Arrival Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Planned Arrival Date</em>'.
	 * @see logiToppMetamodel.logiTopp.parcels.Parcel#getPlannedArrivalDate()
	 * @see #getParcel()
	 * @generated
	 */
	EReference getParcel_PlannedArrivalDate();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.parcels.Parcel#getProducer <em>Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Producer</em>'.
	 * @see logiToppMetamodel.logiTopp.parcels.Parcel#getProducer()
	 * @see #getParcel()
	 * @generated
	 */
	EReference getParcel_Producer();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.logiTopp.parcels.Parcel#getZoneAndLocation <em>Zone And Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zone And Location</em>'.
	 * @see logiToppMetamodel.logiTopp.parcels.Parcel#getZoneAndLocation()
	 * @see #getParcel()
	 * @generated
	 */
	EReference getParcel_ZoneAndLocation();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.parcels.Parcel#getShipmentSize <em>Shipment Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Size</em>'.
	 * @see logiToppMetamodel.logiTopp.parcels.Parcel#getShipmentSize()
	 * @see #getParcel()
	 * @generated
	 */
	EAttribute getParcel_ShipmentSize();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.parcels.Parcel#isIsPickup <em>Is Pickup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Pickup</em>'.
	 * @see logiToppMetamodel.logiTopp.parcels.Parcel#isIsPickup()
	 * @see #getParcel()
	 * @generated
	 */
	EAttribute getParcel_IsPickup();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.parcels.Parcel#getConsumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consumer</em>'.
	 * @see logiToppMetamodel.logiTopp.parcels.Parcel#getConsumer()
	 * @see #getParcel()
	 * @generated
	 */
	EReference getParcel_Consumer();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.parcels.Parcel#getResponsibleCEPSP <em>Responsible CEPSP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible CEPSP</em>'.
	 * @see logiToppMetamodel.logiTopp.parcels.Parcel#getResponsibleCEPSP()
	 * @see #getParcel()
	 * @generated
	 */
	EReference getParcel_ResponsibleCEPSP();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.parcels.PrivateParcel <em>Private Parcel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Parcel</em>'.
	 * @see logiToppMetamodel.logiTopp.parcels.PrivateParcel
	 * @generated
	 */
	EClass getPrivateParcel();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.parcels.PrivateParcel#getDestinationType <em>Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Type</em>'.
	 * @see logiToppMetamodel.logiTopp.parcels.PrivateParcel#getDestinationType()
	 * @see #getPrivateParcel()
	 * @generated
	 */
	EAttribute getPrivateParcel_DestinationType();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.parcels.BusinessParcel <em>Business Parcel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Parcel</em>'.
	 * @see logiToppMetamodel.logiTopp.parcels.BusinessParcel
	 * @generated
	 */
	EClass getBusinessParcel();

	/**
	 * Returns the meta object for enum '{@link logiToppMetamodel.logiTopp.parcels.ShipmentSize <em>Shipment Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shipment Size</em>'.
	 * @see logiToppMetamodel.logiTopp.parcels.ShipmentSize
	 * @generated
	 */
	EEnum getShipmentSize();

	/**
	 * Returns the meta object for enum '{@link logiToppMetamodel.logiTopp.parcels.ParcelState <em>Parcel State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parcel State</em>'.
	 * @see logiToppMetamodel.logiTopp.parcels.ParcelState
	 * @generated
	 */
	EEnum getParcelState();

	/**
	 * Returns the meta object for enum '{@link logiToppMetamodel.logiTopp.parcels.ParcelDestinationType <em>Parcel Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parcel Destination Type</em>'.
	 * @see logiToppMetamodel.logiTopp.parcels.ParcelDestinationType
	 * @generated
	 */
	EEnum getParcelDestinationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParcelsFactory getParcelsFactory();

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
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.parcels.impl.ParcelImpl <em>Parcel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.parcels.impl.ParcelImpl
		 * @see logiToppMetamodel.logiTopp.parcels.impl.ParcelsPackageImpl#getParcel()
		 * @generated
		 */
		EClass PARCEL = eINSTANCE.getParcel();

		/**
		 * The meta object literal for the '<em><b>Planned Arrival Date</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCEL__PLANNED_ARRIVAL_DATE = eINSTANCE.getParcel_PlannedArrivalDate();

		/**
		 * The meta object literal for the '<em><b>Producer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCEL__PRODUCER = eINSTANCE.getParcel_Producer();

		/**
		 * The meta object literal for the '<em><b>Zone And Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCEL__ZONE_AND_LOCATION = eINSTANCE.getParcel_ZoneAndLocation();

		/**
		 * The meta object literal for the '<em><b>Shipment Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCEL__SHIPMENT_SIZE = eINSTANCE.getParcel_ShipmentSize();

		/**
		 * The meta object literal for the '<em><b>Is Pickup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCEL__IS_PICKUP = eINSTANCE.getParcel_IsPickup();

		/**
		 * The meta object literal for the '<em><b>Consumer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCEL__CONSUMER = eINSTANCE.getParcel_Consumer();

		/**
		 * The meta object literal for the '<em><b>Responsible CEPSP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCEL__RESPONSIBLE_CEPSP = eINSTANCE.getParcel_ResponsibleCEPSP();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.parcels.impl.PrivateParcelImpl <em>Private Parcel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.parcels.impl.PrivateParcelImpl
		 * @see logiToppMetamodel.logiTopp.parcels.impl.ParcelsPackageImpl#getPrivateParcel()
		 * @generated
		 */
		EClass PRIVATE_PARCEL = eINSTANCE.getPrivateParcel();

		/**
		 * The meta object literal for the '<em><b>Destination Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_PARCEL__DESTINATION_TYPE = eINSTANCE.getPrivateParcel_DestinationType();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.parcels.impl.BusinessParcelImpl <em>Business Parcel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.parcels.impl.BusinessParcelImpl
		 * @see logiToppMetamodel.logiTopp.parcels.impl.ParcelsPackageImpl#getBusinessParcel()
		 * @generated
		 */
		EClass BUSINESS_PARCEL = eINSTANCE.getBusinessParcel();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.parcels.ShipmentSize <em>Shipment Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.parcels.ShipmentSize
		 * @see logiToppMetamodel.logiTopp.parcels.impl.ParcelsPackageImpl#getShipmentSize()
		 * @generated
		 */
		EEnum SHIPMENT_SIZE = eINSTANCE.getShipmentSize();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.parcels.ParcelState <em>Parcel State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.parcels.ParcelState
		 * @see logiToppMetamodel.logiTopp.parcels.impl.ParcelsPackageImpl#getParcelState()
		 * @generated
		 */
		EEnum PARCEL_STATE = eINSTANCE.getParcelState();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.parcels.ParcelDestinationType <em>Parcel Destination Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.parcels.ParcelDestinationType
		 * @see logiToppMetamodel.logiTopp.parcels.impl.ParcelsPackageImpl#getParcelDestinationType()
		 * @generated
		 */
		EEnum PARCEL_DESTINATION_TYPE = eINSTANCE.getParcelDestinationType();

	}

} //ParcelsPackage
