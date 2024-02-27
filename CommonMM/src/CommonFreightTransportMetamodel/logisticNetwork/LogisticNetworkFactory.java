/**
 */
package CommonFreightTransportMetamodel.logisticNetwork;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage
 * @generated
 */
public interface LogisticNetworkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogisticNetworkFactory eINSTANCE = CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CEPSP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CEPSP</em>'.
	 * @generated
	 */
	CEPSP createCEPSP();

	/**
	 * Returns a new object of class '<em>Logistic Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logistic Network</em>'.
	 * @generated
	 */
	LogisticNetwork createLogisticNetwork();

	/**
	 * Returns a new object of class '<em>Packstation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Packstation</em>'.
	 * @generated
	 */
	Packstation createPackstation();

	/**
	 * Returns a new object of class '<em>Shop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shop</em>'.
	 * @generated
	 */
	Shop createShop();

	/**
	 * Returns a new object of class '<em>Vehicle Depot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Depot</em>'.
	 * @generated
	 */
	VehicleDepot createVehicleDepot();

	/**
	 * Returns a new object of class '<em>Logistic Hub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logistic Hub</em>'.
	 * @generated
	 */
	LogisticHub createLogisticHub();

	/**
	 * Returns a new object of class '<em>Used Public Service Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Used Public Service Point</em>'.
	 * @generated
	 */
	UsedPublicServicePoint createUsedPublicServicePoint();

	/**
	 * Returns a new object of class '<em>Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle</em>'.
	 * @generated
	 */
	Vehicle createVehicle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LogisticNetworkPackage getLogisticNetworkPackage();

} //LogisticNetworkFactory
