/**
 */
package MATSimFreightMetamodel.freightContrib.util;

import MATSimFreightMetamodel.base.Entity;

import MATSimFreightMetamodel.freightContrib.*;

import MATSimFreightMetamodel.matsim.vehicles.Vehicle;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage
 * @generated
 */
public class FreightContribAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FreightContribPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreightContribAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FreightContribPackage.eINSTANCE;
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
	protected FreightContribSwitch<Adapter> modelSwitch =
		new FreightContribSwitch<Adapter>() {
			@Override
			public Adapter caseCarrier(Carrier object) {
				return createCarrierAdapter();
			}
			@Override
			public Adapter caseCarrierCapabilities(CarrierCapabilities object) {
				return createCarrierCapabilitiesAdapter();
			}
			@Override
			public Adapter caseCarrierPlan(CarrierPlan object) {
				return createCarrierPlanAdapter();
			}
			@Override
			public Adapter caseCarrierContainer(CarrierContainer object) {
				return createCarrierContainerAdapter();
			}
			@Override
			public Adapter caseCarrierService(CarrierService object) {
				return createCarrierServiceAdapter();
			}
			@Override
			public Adapter caseCarrierShipment(CarrierShipment object) {
				return createCarrierShipmentAdapter();
			}
			@Override
			public Adapter caseScheduledTour(ScheduledTour object) {
				return createScheduledTourAdapter();
			}
			@Override
			public Adapter caseTimeWindow(TimeWindow object) {
				return createTimeWindowAdapter();
			}
			@Override
			public Adapter caseCarrierVehicle(CarrierVehicle object) {
				return createCarrierVehicleAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseVehicle(Vehicle object) {
				return createVehicleAdapter();
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
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.Carrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.Carrier
	 * @generated
	 */
	public Adapter createCarrierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.CarrierCapabilities <em>Carrier Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierCapabilities
	 * @generated
	 */
	public Adapter createCarrierCapabilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.CarrierPlan <em>Carrier Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierPlan
	 * @generated
	 */
	public Adapter createCarrierPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.CarrierContainer <em>Carrier Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierContainer
	 * @generated
	 */
	public Adapter createCarrierContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.CarrierService <em>Carrier Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierService
	 * @generated
	 */
	public Adapter createCarrierServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.CarrierShipment <em>Carrier Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierShipment
	 * @generated
	 */
	public Adapter createCarrierShipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.ScheduledTour <em>Scheduled Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.ScheduledTour
	 * @generated
	 */
	public Adapter createScheduledTourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.TimeWindow <em>Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.TimeWindow
	 * @generated
	 */
	public Adapter createTimeWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.CarrierVehicle <em>Carrier Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.CarrierVehicle
	 * @generated
	 */
	public Adapter createCarrierVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.base.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.base.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.matsim.vehicles.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.matsim.vehicles.Vehicle
	 * @generated
	 */
	public Adapter createVehicleAdapter() {
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

} //FreightContribAdapterFactory
