/**
 */
package CommonFreightTransportMetamodel.results.util;

import CommonFreightTransportMetamodel.logisticSolution.DeliveryExit;
import CommonFreightTransportMetamodel.logisticSolution.PickUpEntry;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentEntry;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentExit;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry;
import CommonFreightTransportMetamodel.logisticSolution.Tour;

import CommonFreightTransportMetamodel.results.*;

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
 * @see CommonFreightTransportMetamodel.results.ResultsPackage
 * @generated
 */
public class ResultsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResultsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ResultsPackage.eINSTANCE;
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
	protected ResultsSwitch<Adapter> modelSwitch =
		new ResultsSwitch<Adapter>() {
			@Override
			public Adapter caseFailedPickupAttempt(FailedPickupAttempt object) {
				return createFailedPickupAttemptAdapter();
			}
			@Override
			public Adapter caseFailedDeliveryAttempt(FailedDeliveryAttempt object) {
				return createFailedDeliveryAttemptAdapter();
			}
			@Override
			public Adapter caseInitialFailedDeliveryAttempt(InitialFailedDeliveryAttempt object) {
				return createInitialFailedDeliveryAttemptAdapter();
			}
			@Override
			public Adapter caseResultDeliveryExit(ResultDeliveryExit object) {
				return createResultDeliveryExitAdapter();
			}
			@Override
			public Adapter caseResultPickUpEntry(ResultPickUpEntry object) {
				return createResultPickUpEntryAdapter();
			}
			@Override
			public Adapter caseExecutedTour(ExecutedTour object) {
				return createExecutedTourAdapter();
			}
			@Override
			public Adapter caseTourStopMapping(TourStopMapping object) {
				return createTourStopMappingAdapter();
			}
			@Override
			public Adapter caseResults(Results object) {
				return createResultsAdapter();
			}
			@Override
			public Adapter caseHasId_(HasId_ object) {
				return createHasId_Adapter();
			}
			@Override
			public Adapter caseShipmentRecordEntry(ShipmentRecordEntry object) {
				return createShipmentRecordEntryAdapter();
			}
			@Override
			public Adapter caseShipmentExit(ShipmentExit object) {
				return createShipmentExitAdapter();
			}
			@Override
			public Adapter caseDeliveryExit(DeliveryExit object) {
				return createDeliveryExitAdapter();
			}
			@Override
			public Adapter caseShipmentEntry(ShipmentEntry object) {
				return createShipmentEntryAdapter();
			}
			@Override
			public Adapter casePickUpEntry(PickUpEntry object) {
				return createPickUpEntryAdapter();
			}
			@Override
			public Adapter caseTour(Tour object) {
				return createTourAdapter();
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
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.results.FailedPickupAttempt <em>Failed Pickup Attempt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.results.FailedPickupAttempt
	 * @generated
	 */
	public Adapter createFailedPickupAttemptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.results.FailedDeliveryAttempt <em>Failed Delivery Attempt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.results.FailedDeliveryAttempt
	 * @generated
	 */
	public Adapter createFailedDeliveryAttemptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.results.InitialFailedDeliveryAttempt <em>Initial Failed Delivery Attempt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.results.InitialFailedDeliveryAttempt
	 * @generated
	 */
	public Adapter createInitialFailedDeliveryAttemptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.results.ResultDeliveryExit <em>Result Delivery Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.results.ResultDeliveryExit
	 * @generated
	 */
	public Adapter createResultDeliveryExitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.results.ResultPickUpEntry <em>Result Pick Up Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.results.ResultPickUpEntry
	 * @generated
	 */
	public Adapter createResultPickUpEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.results.ExecutedTour <em>Executed Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.results.ExecutedTour
	 * @generated
	 */
	public Adapter createExecutedTourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.results.TourStopMapping <em>Tour Stop Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.results.TourStopMapping
	 * @generated
	 */
	public Adapter createTourStopMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.results.Results <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.results.Results
	 * @generated
	 */
	public Adapter createResultsAdapter() {
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

} //ResultsAdapterFactory
