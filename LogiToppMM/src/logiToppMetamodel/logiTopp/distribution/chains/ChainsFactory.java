/**
 */
package logiToppMetamodel.logiTopp.distribution.chains;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage
 * @generated
 */
public interface ChainsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChainsFactory eINSTANCE = logiToppMetamodel.logiTopp.distribution.chains.impl.ChainsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transport Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Chain</em>'.
	 * @generated
	 */
	TransportChain createTransportChain();

	/**
	 * Returns a new object of class '<em>Timed Transport Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Transport Chain</em>'.
	 * @generated
	 */
	TimedTransportChain createTimedTransportChain();

	/**
	 * Returns a new object of class '<em>Hub To Departure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hub To Departure</em>'.
	 * @generated
	 */
	HubToDeparture createHubToDeparture();

	/**
	 * Returns a new object of class '<em>Hub To Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hub To Duration</em>'.
	 * @generated
	 */
	HubToDuration createHubToDuration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ChainsPackage getChainsPackage();

} //ChainsFactory
