/**
 */
package CommonFreightTransportMetamodel.logisticNetwork.impl;

import CommonFreightTransportMetamodel.logisticNetwork.*;

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
public class LogisticNetworkFactoryImpl extends EFactoryImpl implements LogisticNetworkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogisticNetworkFactory init() {
		try {
			LogisticNetworkFactory theLogisticNetworkFactory = (LogisticNetworkFactory)EPackage.Registry.INSTANCE.getEFactory(LogisticNetworkPackage.eNS_URI);
			if (theLogisticNetworkFactory != null) {
				return theLogisticNetworkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogisticNetworkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogisticNetworkFactoryImpl() {
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
			case LogisticNetworkPackage.CEPSP: return createCEPSP();
			case LogisticNetworkPackage.LOGISTIC_NETWORK: return createLogisticNetwork();
			case LogisticNetworkPackage.PACKSTATION: return createPackstation();
			case LogisticNetworkPackage.SHOP: return createShop();
			case LogisticNetworkPackage.VEHICLE_DEPOT: return createVehicleDepot();
			case LogisticNetworkPackage.LOGISTIC_HUB: return createLogisticHub();
			case LogisticNetworkPackage.USED_PUBLIC_SERVICE_POINT: return createUsedPublicServicePoint();
			case LogisticNetworkPackage.VEHICLE: return createVehicle();
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
	public CEPSP createCEPSP() {
		CEPSPImpl cepsp = new CEPSPImpl();
		return cepsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogisticNetwork createLogisticNetwork() {
		LogisticNetworkImpl logisticNetwork = new LogisticNetworkImpl();
		return logisticNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Packstation createPackstation() {
		PackstationImpl packstation = new PackstationImpl();
		return packstation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shop createShop() {
		ShopImpl shop = new ShopImpl();
		return shop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehicleDepot createVehicleDepot() {
		VehicleDepotImpl vehicleDepot = new VehicleDepotImpl();
		return vehicleDepot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogisticHub createLogisticHub() {
		LogisticHubImpl logisticHub = new LogisticHubImpl();
		return logisticHub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsedPublicServicePoint createUsedPublicServicePoint() {
		UsedPublicServicePointImpl usedPublicServicePoint = new UsedPublicServicePointImpl();
		return usedPublicServicePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vehicle createVehicle() {
		VehicleImpl vehicle = new VehicleImpl();
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogisticNetworkPackage getLogisticNetworkPackage() {
		return (LogisticNetworkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogisticNetworkPackage getPackage() {
		return LogisticNetworkPackage.eINSTANCE;
	}

} //LogisticNetworkFactoryImpl
