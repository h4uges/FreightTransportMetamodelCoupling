/**
 */
package MATSimFreightMetamodel.freightReceiver.impl;

import MATSimFreightMetamodel.freightReceiver.*;

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
public class FreightReceiverFactoryImpl extends EFactoryImpl implements FreightReceiverFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FreightReceiverFactory init() {
		try {
			FreightReceiverFactory theFreightReceiverFactory = (FreightReceiverFactory)EPackage.Registry.INSTANCE.getEFactory(FreightReceiverPackage.eNS_URI);
			if (theFreightReceiverFactory != null) {
				return theFreightReceiverFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FreightReceiverFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreightReceiverFactoryImpl() {
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
			case FreightReceiverPackage.RECEIVERS: return createReceivers();
			case FreightReceiverPackage.RECEIVER: return createReceiver();
			case FreightReceiverPackage.PRODUCT_TYPE: return createProductType();
			case FreightReceiverPackage.RECEIVER_PLAN: return createReceiverPlan();
			case FreightReceiverPackage.RECEIVER_PRODUCT: return createReceiverProduct();
			case FreightReceiverPackage.RECEIVER_ORDER: return createReceiverOrder();
			case FreightReceiverPackage.ORDER: return createOrder();
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
	public Receivers createReceivers() {
		ReceiversImpl receivers = new ReceiversImpl();
		return receivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Receiver createReceiver() {
		ReceiverImpl receiver = new ReceiverImpl();
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductType createProductType() {
		ProductTypeImpl productType = new ProductTypeImpl();
		return productType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReceiverPlan createReceiverPlan() {
		ReceiverPlanImpl receiverPlan = new ReceiverPlanImpl();
		return receiverPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReceiverProduct createReceiverProduct() {
		ReceiverProductImpl receiverProduct = new ReceiverProductImpl();
		return receiverProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReceiverOrder createReceiverOrder() {
		ReceiverOrderImpl receiverOrder = new ReceiverOrderImpl();
		return receiverOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreightReceiverPackage getFreightReceiverPackage() {
		return (FreightReceiverPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FreightReceiverPackage getPackage() {
		return FreightReceiverPackage.eINSTANCE;
	}

} //FreightReceiverFactoryImpl
