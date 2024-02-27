/**
 */
package CommonFreightTransportMetamodel.logisticNetwork.util;

import CommonFreightTransportMetamodel.logisticNetwork.*;

import CommonFreightTransportMetamodel.utils.HasId_;
import CommonFreightTransportMetamodel.utils.ShipmentlLegStartEndPoint;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage
 * @generated
 */
public class LogisticNetworkAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogisticNetworkPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogisticNetworkAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LogisticNetworkPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogisticNetworkSwitch<Adapter> modelSwitch =
		new LogisticNetworkSwitch<Adapter>() {
			@Override
			public Adapter caseCEPSP(CEPSP object) {
				return createCEPSPAdapter();
			}
			@Override
			public Adapter caseLogisticNetwork(LogisticNetwork object) {
				return createLogisticNetworkAdapter();
			}
			@Override
			public Adapter casePublicServicePoint(PublicServicePoint object) {
				return createPublicServicePointAdapter();
			}
			@Override
			public Adapter casePackstation(Packstation object) {
				return createPackstationAdapter();
			}
			@Override
			public Adapter caseShop(Shop object) {
				return createShopAdapter();
			}
			@Override
			public Adapter caseVehicleDepot(VehicleDepot object) {
				return createVehicleDepotAdapter();
			}
			@Override
			public Adapter caseLogisticHub(LogisticHub object) {
				return createLogisticHubAdapter();
			}
			@Override
			public Adapter caseUsedPublicServicePoint(UsedPublicServicePoint object) {
				return createUsedPublicServicePointAdapter();
			}
			@Override
			public Adapter caseVehicle(Vehicle object) {
				return createVehicleAdapter();
			}
			@Override
			public Adapter caseLogisticFacility(LogisticFacility object) {
				return createLogisticFacilityAdapter();
			}
			@Override
			public Adapter caseHasId_(HasId_ object) {
				return createHasId_Adapter();
			}
			@Override
			public Adapter caseShipmentlLegStartEndPoint(ShipmentlLegStartEndPoint object) {
				return createShipmentlLegStartEndPointAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticNetwork.CEPSP <em>CEPSP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.CEPSP
	 * @generated
	 */
	public Adapter createCEPSPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticNetwork <em>Logistic Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetwork
	 * @generated
	 */
	public Adapter createLogisticNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticNetwork.PublicServicePoint <em>Public Service Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.PublicServicePoint
	 * @generated
	 */
	public Adapter createPublicServicePointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticNetwork.Packstation <em>Packstation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.Packstation
	 * @generated
	 */
	public Adapter createPackstationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticNetwork.Shop <em>Shop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.Shop
	 * @generated
	 */
	public Adapter createShopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot <em>Vehicle Depot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.VehicleDepot
	 * @generated
	 */
	public Adapter createVehicleDepotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticHub <em>Logistic Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticHub
	 * @generated
	 */
	public Adapter createLogisticHubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticNetwork.UsedPublicServicePoint <em>Used Public Service Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.UsedPublicServicePoint
	 * @generated
	 */
	public Adapter createUsedPublicServicePointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticNetwork.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.Vehicle
	 * @generated
	 */
	public Adapter createVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticNetwork.LogisticFacility <em>Logistic Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticFacility
	 * @generated
	 */
	public Adapter createLogisticFacilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.HasId_ <em>Has Id </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.HasId_
	 * @generated
	 */
	public Adapter createHasId_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.ShipmentlLegStartEndPoint <em>Shipmentl Leg Start End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.ShipmentlLegStartEndPoint
	 * @generated
	 */
	public Adapter createShipmentlLegStartEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LogisticNetworkAdapterFactory
