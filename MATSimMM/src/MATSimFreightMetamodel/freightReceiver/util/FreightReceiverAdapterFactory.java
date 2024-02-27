/**
 */
package MATSimFreightMetamodel.freightReceiver.util;

import MATSimFreightMetamodel.base.Entity;

import MATSimFreightMetamodel.freightReceiver.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage
 * @generated
 */
public class FreightReceiverAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FreightReceiverPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreightReceiverAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FreightReceiverPackage.eINSTANCE;
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
	protected FreightReceiverSwitch<Adapter> modelSwitch =
		new FreightReceiverSwitch<Adapter>() {
			@Override
			public Adapter caseReceivers(Receivers object) {
				return createReceiversAdapter();
			}
			@Override
			public Adapter caseReceiver(Receiver object) {
				return createReceiverAdapter();
			}
			@Override
			public Adapter caseProductType(ProductType object) {
				return createProductTypeAdapter();
			}
			@Override
			public Adapter caseReceiverPlan(ReceiverPlan object) {
				return createReceiverPlanAdapter();
			}
			@Override
			public Adapter caseReceiverProduct(ReceiverProduct object) {
				return createReceiverProductAdapter();
			}
			@Override
			public Adapter caseReorderPolicy(ReorderPolicy object) {
				return createReorderPolicyAdapter();
			}
			@Override
			public Adapter caseReceiverOrder(ReceiverOrder object) {
				return createReceiverOrderAdapter();
			}
			@Override
			public Adapter caseOrder(Order object) {
				return createOrderAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
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
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightReceiver.Receivers <em>Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightReceiver.Receivers
	 * @generated
	 */
	public Adapter createReceiversAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightReceiver.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightReceiver.Receiver
	 * @generated
	 */
	public Adapter createReceiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightReceiver.ProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightReceiver.ProductType
	 * @generated
	 */
	public Adapter createProductTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightReceiver.ReceiverPlan <em>Receiver Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightReceiver.ReceiverPlan
	 * @generated
	 */
	public Adapter createReceiverPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightReceiver.ReceiverProduct <em>Receiver Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightReceiver.ReceiverProduct
	 * @generated
	 */
	public Adapter createReceiverProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightReceiver.ReorderPolicy <em>Reorder Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightReceiver.ReorderPolicy
	 * @generated
	 */
	public Adapter createReorderPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightReceiver.ReceiverOrder <em>Receiver Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightReceiver.ReceiverOrder
	 * @generated
	 */
	public Adapter createReceiverOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightReceiver.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightReceiver.Order
	 * @generated
	 */
	public Adapter createOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.base.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.base.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
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

} //FreightReceiverAdapterFactory
