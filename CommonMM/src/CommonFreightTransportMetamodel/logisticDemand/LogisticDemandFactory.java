/**
 */
package CommonFreightTransportMetamodel.logisticDemand;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage
 * @generated
 */
public interface LogisticDemandFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogisticDemandFactory eINSTANCE = CommonFreightTransportMetamodel.logisticDemand.impl.LogisticDemandFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Demand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Demand</em>'.
	 * @generated
	 */
	Demand createDemand();

	/**
	 * Returns a new object of class '<em>Outside To Inside Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outside To Inside Shipment</em>'.
	 * @generated
	 */
	OutsideToInsideShipment createOutsideToInsideShipment();

	/**
	 * Returns a new object of class '<em>Inside To Inside Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inside To Inside Shipment</em>'.
	 * @generated
	 */
	InsideToInsideShipment createInsideToInsideShipment();

	/**
	 * Returns a new object of class '<em>Inside To Outside Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inside To Outside Shipment</em>'.
	 * @generated
	 */
	InsideToOutsideShipment createInsideToOutsideShipment();

	/**
	 * Returns a new object of class '<em>Splitted Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Splitted Shipment</em>'.
	 * @generated
	 */
	SplittedShipment createSplittedShipment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LogisticDemandPackage getLogisticDemandPackage();

} //LogisticDemandFactory
