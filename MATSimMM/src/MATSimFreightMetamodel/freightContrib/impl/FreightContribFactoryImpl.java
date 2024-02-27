/**
 */
package MATSimFreightMetamodel.freightContrib.impl;

import MATSimFreightMetamodel.freightContrib.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class FreightContribFactoryImpl extends EFactoryImpl implements FreightContribFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FreightContribFactory init() {
		try {
			FreightContribFactory theFreightContribFactory = (FreightContribFactory)EPackage.Registry.INSTANCE.getEFactory(FreightContribPackage.eNS_URI);
			if (theFreightContribFactory != null) {
				return theFreightContribFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FreightContribFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreightContribFactoryImpl() {
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
			case FreightContribPackage.CARRIER: return createCarrier();
			case FreightContribPackage.CARRIER_CAPABILITIES: return createCarrierCapabilities();
			case FreightContribPackage.CARRIER_PLAN: return createCarrierPlan();
			case FreightContribPackage.CARRIER_CONTAINER: return createCarrierContainer();
			case FreightContribPackage.CARRIER_SERVICE: return createCarrierService();
			case FreightContribPackage.CARRIER_SHIPMENT: return createCarrierShipment();
			case FreightContribPackage.SCHEDULED_TOUR: return createScheduledTour();
			case FreightContribPackage.TIME_WINDOW: return createTimeWindow();
			case FreightContribPackage.CARRIER_VEHICLE: return createCarrierVehicle();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FreightContribPackage.FLEET_SIZE:
				return createFleetSizeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FreightContribPackage.FLEET_SIZE:
				return convertFleetSizeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Carrier createCarrier() {
		CarrierImpl carrier = new CarrierImpl();
		return carrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierCapabilities createCarrierCapabilities() {
		CarrierCapabilitiesImpl carrierCapabilities = new CarrierCapabilitiesImpl();
		return carrierCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierPlan createCarrierPlan() {
		CarrierPlanImpl carrierPlan = new CarrierPlanImpl();
		return carrierPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierContainer createCarrierContainer() {
		CarrierContainerImpl carrierContainer = new CarrierContainerImpl();
		return carrierContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierService createCarrierService() {
		CarrierServiceImpl carrierService = new CarrierServiceImpl();
		return carrierService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierShipment createCarrierShipment() {
		CarrierShipmentImpl carrierShipment = new CarrierShipmentImpl();
		return carrierShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScheduledTour createScheduledTour() {
		ScheduledTourImpl scheduledTour = new ScheduledTourImpl();
		return scheduledTour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeWindow createTimeWindow() {
		TimeWindowImpl timeWindow = new TimeWindowImpl();
		return timeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierVehicle createCarrierVehicle() {
		CarrierVehicleImpl carrierVehicle = new CarrierVehicleImpl();
		return carrierVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FleetSize createFleetSizeFromString(EDataType eDataType, String initialValue) {
		FleetSize result = FleetSize.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFleetSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreightContribPackage getFreightContribPackage() {
		return (FreightContribPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FreightContribPackage getPackage() {
		return FreightContribPackage.eINSTANCE;
	}

} //FreightContribFactoryImpl
