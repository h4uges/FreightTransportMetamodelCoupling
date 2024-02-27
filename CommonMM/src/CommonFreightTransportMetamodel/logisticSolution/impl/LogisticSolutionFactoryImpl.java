/**
 */
package CommonFreightTransportMetamodel.logisticSolution.impl;

import CommonFreightTransportMetamodel.logisticSolution.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogisticSolutionFactoryImpl extends EFactoryImpl implements LogisticSolutionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogisticSolutionFactory init() {
		try {
			LogisticSolutionFactory theLogisticSolutionFactory = (LogisticSolutionFactory)EPackage.Registry.INSTANCE.getEFactory(LogisticSolutionPackage.eNS_URI);
			if (theLogisticSolutionFactory != null) {
				return theLogisticSolutionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogisticSolutionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogisticSolutionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LogisticSolutionPackage.SHIPMENT_RECORD: return createShipmentRecord();
			case LogisticSolutionPackage.START_END_STOP: return createStartEndStop();
			case LogisticSolutionPackage.LOGISTIC_FACILITY_STOP: return createLogisticFacilityStop();
			case LogisticSolutionPackage.NORMAL_STOP: return createNormalStop();
			case LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY: return createShipmentRecordEntry();
			case LogisticSolutionPackage.LOGISTIC_HUB_ENTRY: return createLogisticHubEntry();
			case LogisticSolutionPackage.PICK_UP_ENTRY: return createPickUpEntry();
			case LogisticSolutionPackage.LOGISTIC_HUB_EXIT: return createLogisticHubExit();
			case LogisticSolutionPackage.DELIVERY_EXIT: return createDeliveryExit();
			case LogisticSolutionPackage.PLANNED_TOUR: return createPlannedTour();
			case LogisticSolutionPackage.REFERENCE_STOP_LOCATION: return createReferenceStopLocation();
			case LogisticSolutionPackage.CUSTOM_STOP_LOCATION: return createCustomStopLocation();
			case LogisticSolutionPackage.LOGISTIC_SOLUTION: return createLogisticSolution();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentRecord createShipmentRecord() {
		ShipmentRecordImpl shipmentRecord = new ShipmentRecordImpl();
		return shipmentRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartEndStop createStartEndStop() {
		StartEndStopImpl startEndStop = new StartEndStopImpl();
		return startEndStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogisticFacilityStop createLogisticFacilityStop() {
		LogisticFacilityStopImpl logisticFacilityStop = new LogisticFacilityStopImpl();
		return logisticFacilityStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalStop createNormalStop() {
		NormalStopImpl normalStop = new NormalStopImpl();
		return normalStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentRecordEntry createShipmentRecordEntry() {
		ShipmentRecordEntryImpl shipmentRecordEntry = new ShipmentRecordEntryImpl();
		return shipmentRecordEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogisticHubEntry createLogisticHubEntry() {
		LogisticHubEntryImpl logisticHubEntry = new LogisticHubEntryImpl();
		return logisticHubEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PickUpEntry createPickUpEntry() {
		PickUpEntryImpl pickUpEntry = new PickUpEntryImpl();
		return pickUpEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogisticHubExit createLogisticHubExit() {
		LogisticHubExitImpl logisticHubExit = new LogisticHubExitImpl();
		return logisticHubExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeliveryExit createDeliveryExit() {
		DeliveryExitImpl deliveryExit = new DeliveryExitImpl();
		return deliveryExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedTour createPlannedTour() {
		PlannedTourImpl plannedTour = new PlannedTourImpl();
		return plannedTour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceStopLocation createReferenceStopLocation() {
		ReferenceStopLocationImpl referenceStopLocation = new ReferenceStopLocationImpl();
		return referenceStopLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomStopLocation createCustomStopLocation() {
		CustomStopLocationImpl customStopLocation = new CustomStopLocationImpl();
		return customStopLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogisticSolution createLogisticSolution() {
		LogisticSolutionImpl logisticSolution = new LogisticSolutionImpl();
		return logisticSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogisticSolutionPackage getLogisticSolutionPackage() {
		return (LogisticSolutionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogisticSolutionPackage getPackage() {
		return LogisticSolutionPackage.eINSTANCE;
	}

} //LogisticSolutionFactoryImpl
