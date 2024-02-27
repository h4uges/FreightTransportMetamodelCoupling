/**
 */
package MATSimFreightMetamodel.freightContrib;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MATSimFreightMetamodel.freightContrib.FreightContribPackage
 * @generated
 */
public interface FreightContribFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FreightContribFactory eINSTANCE = MATSimFreightMetamodel.freightContrib.impl.FreightContribFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Carrier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier</em>'.
	 * @generated
	 */
	Carrier createCarrier();

	/**
	 * Returns a new object of class '<em>Carrier Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Capabilities</em>'.
	 * @generated
	 */
	CarrierCapabilities createCarrierCapabilities();

	/**
	 * Returns a new object of class '<em>Carrier Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Plan</em>'.
	 * @generated
	 */
	CarrierPlan createCarrierPlan();

	/**
	 * Returns a new object of class '<em>Carrier Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Container</em>'.
	 * @generated
	 */
	CarrierContainer createCarrierContainer();

	/**
	 * Returns a new object of class '<em>Carrier Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Service</em>'.
	 * @generated
	 */
	CarrierService createCarrierService();

	/**
	 * Returns a new object of class '<em>Carrier Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Shipment</em>'.
	 * @generated
	 */
	CarrierShipment createCarrierShipment();

	/**
	 * Returns a new object of class '<em>Scheduled Tour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduled Tour</em>'.
	 * @generated
	 */
	ScheduledTour createScheduledTour();

	/**
	 * Returns a new object of class '<em>Time Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Window</em>'.
	 * @generated
	 */
	TimeWindow createTimeWindow();

	/**
	 * Returns a new object of class '<em>Carrier Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Vehicle</em>'.
	 * @generated
	 */
	CarrierVehicle createCarrierVehicle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FreightContribPackage getFreightContribPackage();

} //FreightContribFactory
