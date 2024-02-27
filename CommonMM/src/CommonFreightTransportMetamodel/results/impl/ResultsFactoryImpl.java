/**
 */
package CommonFreightTransportMetamodel.results.impl;

import CommonFreightTransportMetamodel.results.*;

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
public class ResultsFactoryImpl extends EFactoryImpl implements ResultsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResultsFactory init() {
		try {
			ResultsFactory theResultsFactory = (ResultsFactory)EPackage.Registry.INSTANCE.getEFactory(ResultsPackage.eNS_URI);
			if (theResultsFactory != null) {
				return theResultsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResultsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsFactoryImpl() {
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
			case ResultsPackage.FAILED_PICKUP_ATTEMPT: return createFailedPickupAttempt();
			case ResultsPackage.FAILED_DELIVERY_ATTEMPT: return createFailedDeliveryAttempt();
			case ResultsPackage.INITIAL_FAILED_DELIVERY_ATTEMPT: return createInitialFailedDeliveryAttempt();
			case ResultsPackage.RESULT_DELIVERY_EXIT: return createResultDeliveryExit();
			case ResultsPackage.RESULT_PICK_UP_ENTRY: return createResultPickUpEntry();
			case ResultsPackage.EXECUTED_TOUR: return createExecutedTour();
			case ResultsPackage.TOUR_STOP_MAPPING: return createTourStopMapping();
			case ResultsPackage.RESULTS: return createResults();
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
	public FailedPickupAttempt createFailedPickupAttempt() {
		FailedPickupAttemptImpl failedPickupAttempt = new FailedPickupAttemptImpl();
		return failedPickupAttempt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FailedDeliveryAttempt createFailedDeliveryAttempt() {
		FailedDeliveryAttemptImpl failedDeliveryAttempt = new FailedDeliveryAttemptImpl();
		return failedDeliveryAttempt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialFailedDeliveryAttempt createInitialFailedDeliveryAttempt() {
		InitialFailedDeliveryAttemptImpl initialFailedDeliveryAttempt = new InitialFailedDeliveryAttemptImpl();
		return initialFailedDeliveryAttempt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultDeliveryExit createResultDeliveryExit() {
		ResultDeliveryExitImpl resultDeliveryExit = new ResultDeliveryExitImpl();
		return resultDeliveryExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultPickUpEntry createResultPickUpEntry() {
		ResultPickUpEntryImpl resultPickUpEntry = new ResultPickUpEntryImpl();
		return resultPickUpEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutedTour createExecutedTour() {
		ExecutedTourImpl executedTour = new ExecutedTourImpl();
		return executedTour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TourStopMapping createTourStopMapping() {
		TourStopMappingImpl tourStopMapping = new TourStopMappingImpl();
		return tourStopMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Results createResults() {
		ResultsImpl results = new ResultsImpl();
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultsPackage getResultsPackage() {
		return (ResultsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResultsPackage getPackage() {
		return ResultsPackage.eINSTANCE;
	}

} //ResultsFactoryImpl
