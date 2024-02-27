/**
 */
package MATSimFreightMetamodel.freightReceiver;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage
 * @generated
 */
public interface FreightReceiverFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FreightReceiverFactory eINSTANCE = MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Receivers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receivers</em>'.
	 * @generated
	 */
	Receivers createReceivers();

	/**
	 * Returns a new object of class '<em>Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receiver</em>'.
	 * @generated
	 */
	Receiver createReceiver();

	/**
	 * Returns a new object of class '<em>Product Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Type</em>'.
	 * @generated
	 */
	ProductType createProductType();

	/**
	 * Returns a new object of class '<em>Receiver Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receiver Plan</em>'.
	 * @generated
	 */
	ReceiverPlan createReceiverPlan();

	/**
	 * Returns a new object of class '<em>Receiver Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receiver Product</em>'.
	 * @generated
	 */
	ReceiverProduct createReceiverProduct();

	/**
	 * Returns a new object of class '<em>Receiver Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receiver Order</em>'.
	 * @generated
	 */
	ReceiverOrder createReceiverOrder();

	/**
	 * Returns a new object of class '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order</em>'.
	 * @generated
	 */
	Order createOrder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FreightReceiverPackage getFreightReceiverPackage();

} //FreightReceiverFactory
