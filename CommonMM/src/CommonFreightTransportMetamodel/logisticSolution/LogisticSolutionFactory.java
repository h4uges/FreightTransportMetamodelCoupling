/**
 */
package CommonFreightTransportMetamodel.logisticSolution;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage
 * @generated
 */
public interface LogisticSolutionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogisticSolutionFactory eINSTANCE = CommonFreightTransportMetamodel.logisticSolution.impl.LogisticSolutionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Shipment Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Record</em>'.
	 * @generated
	 */
	ShipmentRecord createShipmentRecord();

	/**
	 * Returns a new object of class '<em>Start End Stop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start End Stop</em>'.
	 * @generated
	 */
	StartEndStop createStartEndStop();

	/**
	 * Returns a new object of class '<em>Logistic Facility Stop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logistic Facility Stop</em>'.
	 * @generated
	 */
	LogisticFacilityStop createLogisticFacilityStop();

	/**
	 * Returns a new object of class '<em>Normal Stop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Stop</em>'.
	 * @generated
	 */
	NormalStop createNormalStop();

	/**
	 * Returns a new object of class '<em>Shipment Record Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Record Entry</em>'.
	 * @generated
	 */
	ShipmentRecordEntry createShipmentRecordEntry();

	/**
	 * Returns a new object of class '<em>Logistic Hub Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logistic Hub Entry</em>'.
	 * @generated
	 */
	LogisticHubEntry createLogisticHubEntry();

	/**
	 * Returns a new object of class '<em>Pick Up Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pick Up Entry</em>'.
	 * @generated
	 */
	PickUpEntry createPickUpEntry();

	/**
	 * Returns a new object of class '<em>Logistic Hub Exit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logistic Hub Exit</em>'.
	 * @generated
	 */
	LogisticHubExit createLogisticHubExit();

	/**
	 * Returns a new object of class '<em>Delivery Exit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delivery Exit</em>'.
	 * @generated
	 */
	DeliveryExit createDeliveryExit();

	/**
	 * Returns a new object of class '<em>Planned Tour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planned Tour</em>'.
	 * @generated
	 */
	PlannedTour createPlannedTour();

	/**
	 * Returns a new object of class '<em>Reference Stop Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Stop Location</em>'.
	 * @generated
	 */
	ReferenceStopLocation createReferenceStopLocation();

	/**
	 * Returns a new object of class '<em>Custom Stop Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Stop Location</em>'.
	 * @generated
	 */
	CustomStopLocation createCustomStopLocation();

	/**
	 * Returns a new object of class '<em>Logistic Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logistic Solution</em>'.
	 * @generated
	 */
	LogisticSolution createLogisticSolution();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LogisticSolutionPackage getLogisticSolutionPackage();

} //LogisticSolutionFactory
