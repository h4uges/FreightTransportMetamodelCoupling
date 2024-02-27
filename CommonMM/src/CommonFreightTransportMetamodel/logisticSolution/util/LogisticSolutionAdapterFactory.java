/**
 */
package CommonFreightTransportMetamodel.logisticSolution.util;

import CommonFreightTransportMetamodel.logisticSolution.*;

import CommonFreightTransportMetamodel.utils.HasId_;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage
 * @generated
 */
public class LogisticSolutionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogisticSolutionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogisticSolutionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LogisticSolutionPackage.eINSTANCE;
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
	protected LogisticSolutionSwitch<Adapter> modelSwitch =
		new LogisticSolutionSwitch<Adapter>() {
			@Override
			public Adapter caseTour(Tour object) {
				return createTourAdapter();
			}
			@Override
			public Adapter caseStop(Stop object) {
				return createStopAdapter();
			}
			@Override
			public Adapter caseShipmentRecord(ShipmentRecord object) {
				return createShipmentRecordAdapter();
			}
			@Override
			public Adapter caseStartEndStop(StartEndStop object) {
				return createStartEndStopAdapter();
			}
			@Override
			public Adapter casePickUpDeliveryStop(PickUpDeliveryStop object) {
				return createPickUpDeliveryStopAdapter();
			}
			@Override
			public Adapter caseLogisticFacilityStop(LogisticFacilityStop object) {
				return createLogisticFacilityStopAdapter();
			}
			@Override
			public Adapter caseNormalStop(NormalStop object) {
				return createNormalStopAdapter();
			}
			@Override
			public Adapter caseShipmentRecordEntry(ShipmentRecordEntry object) {
				return createShipmentRecordEntryAdapter();
			}
			@Override
			public Adapter caseShipmentEntry(ShipmentEntry object) {
				return createShipmentEntryAdapter();
			}
			@Override
			public Adapter caseShipmentExit(ShipmentExit object) {
				return createShipmentExitAdapter();
			}
			@Override
			public Adapter caseLogisticHubEntry(LogisticHubEntry object) {
				return createLogisticHubEntryAdapter();
			}
			@Override
			public Adapter casePickUpEntry(PickUpEntry object) {
				return createPickUpEntryAdapter();
			}
			@Override
			public Adapter caseLogisticHubExit(LogisticHubExit object) {
				return createLogisticHubExitAdapter();
			}
			@Override
			public Adapter caseDeliveryExit(DeliveryExit object) {
				return createDeliveryExitAdapter();
			}
			@Override
			public Adapter casePlannedTour(PlannedTour object) {
				return createPlannedTourAdapter();
			}
			@Override
			public Adapter caseStopLocation(StopLocation object) {
				return createStopLocationAdapter();
			}
			@Override
			public Adapter caseReferenceStopLocation(ReferenceStopLocation object) {
				return createReferenceStopLocationAdapter();
			}
			@Override
			public Adapter caseCustomStopLocation(CustomStopLocation object) {
				return createCustomStopLocationAdapter();
			}
			@Override
			public Adapter caseLogisticSolution(LogisticSolution object) {
				return createLogisticSolutionAdapter();
			}
			@Override
			public Adapter caseHasId_(HasId_ object) {
				return createHasId_Adapter();
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
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.Tour <em>Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.Tour
	 * @generated
	 */
	public Adapter createTourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.Stop
	 * @generated
	 */
	public Adapter createStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord <em>Shipment Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord
	 * @generated
	 */
	public Adapter createShipmentRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.StartEndStop <em>Start End Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.StartEndStop
	 * @generated
	 */
	public Adapter createStartEndStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.PickUpDeliveryStop <em>Pick Up Delivery Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.PickUpDeliveryStop
	 * @generated
	 */
	public Adapter createPickUpDeliveryStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.LogisticFacilityStop <em>Logistic Facility Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticFacilityStop
	 * @generated
	 */
	public Adapter createLogisticFacilityStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.NormalStop <em>Normal Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.NormalStop
	 * @generated
	 */
	public Adapter createNormalStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry <em>Shipment Record Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry
	 * @generated
	 */
	public Adapter createShipmentRecordEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentEntry <em>Shipment Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentEntry
	 * @generated
	 */
	public Adapter createShipmentEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.ShipmentExit <em>Shipment Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ShipmentExit
	 * @generated
	 */
	public Adapter createShipmentExitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.LogisticHubEntry <em>Logistic Hub Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticHubEntry
	 * @generated
	 */
	public Adapter createLogisticHubEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.PickUpEntry <em>Pick Up Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.PickUpEntry
	 * @generated
	 */
	public Adapter createPickUpEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.LogisticHubExit <em>Logistic Hub Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticHubExit
	 * @generated
	 */
	public Adapter createLogisticHubExitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.DeliveryExit <em>Delivery Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.DeliveryExit
	 * @generated
	 */
	public Adapter createDeliveryExitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.PlannedTour <em>Planned Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.PlannedTour
	 * @generated
	 */
	public Adapter createPlannedTourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.StopLocation <em>Stop Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.StopLocation
	 * @generated
	 */
	public Adapter createStopLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.ReferenceStopLocation <em>Reference Stop Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.ReferenceStopLocation
	 * @generated
	 */
	public Adapter createReferenceStopLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.CustomStopLocation <em>Custom Stop Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.CustomStopLocation
	 * @generated
	 */
	public Adapter createCustomStopLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticSolution.LogisticSolution <em>Logistic Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolution
	 * @generated
	 */
	public Adapter createLogisticSolutionAdapter() {
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

} //LogisticSolutionAdapterFactory
