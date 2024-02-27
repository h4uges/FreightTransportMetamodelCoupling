/**
 */
package CommonFreightTransportMetamodel.results;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CommonFreightTransportMetamodel.results.ResultsPackage
 * @generated
 */
public interface ResultsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultsFactory eINSTANCE = CommonFreightTransportMetamodel.results.impl.ResultsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Failed Pickup Attempt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failed Pickup Attempt</em>'.
	 * @generated
	 */
	FailedPickupAttempt createFailedPickupAttempt();

	/**
	 * Returns a new object of class '<em>Failed Delivery Attempt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failed Delivery Attempt</em>'.
	 * @generated
	 */
	FailedDeliveryAttempt createFailedDeliveryAttempt();

	/**
	 * Returns a new object of class '<em>Initial Failed Delivery Attempt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Failed Delivery Attempt</em>'.
	 * @generated
	 */
	InitialFailedDeliveryAttempt createInitialFailedDeliveryAttempt();

	/**
	 * Returns a new object of class '<em>Result Delivery Exit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Delivery Exit</em>'.
	 * @generated
	 */
	ResultDeliveryExit createResultDeliveryExit();

	/**
	 * Returns a new object of class '<em>Result Pick Up Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Pick Up Entry</em>'.
	 * @generated
	 */
	ResultPickUpEntry createResultPickUpEntry();

	/**
	 * Returns a new object of class '<em>Executed Tour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executed Tour</em>'.
	 * @generated
	 */
	ExecutedTour createExecutedTour();

	/**
	 * Returns a new object of class '<em>Tour Stop Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tour Stop Mapping</em>'.
	 * @generated
	 */
	TourStopMapping createTourStopMapping();

	/**
	 * Returns a new object of class '<em>Results</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Results</em>'.
	 * @generated
	 */
	Results createResults();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResultsPackage getResultsPackage();

} //ResultsFactory
