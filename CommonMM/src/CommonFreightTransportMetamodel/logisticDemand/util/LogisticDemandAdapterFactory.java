/**
 */
package CommonFreightTransportMetamodel.logisticDemand.util;

import CommonFreightTransportMetamodel.logisticDemand.*;

import CommonFreightTransportMetamodel.utils.HasId_;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage
 * @generated
 */
public class LogisticDemandAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogisticDemandPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogisticDemandAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LogisticDemandPackage.eINSTANCE;
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
	protected LogisticDemandSwitch<Adapter> modelSwitch =
		new LogisticDemandSwitch<Adapter>() {
			@Override
			public Adapter caseDemand(Demand object) {
				return createDemandAdapter();
			}
			@Override
			public Adapter caseFromOutsideStudyAreaShipment(FromOutsideStudyAreaShipment object) {
				return createFromOutsideStudyAreaShipmentAdapter();
			}
			@Override
			public Adapter caseFromInsideStudyAreaShipment(FromInsideStudyAreaShipment object) {
				return createFromInsideStudyAreaShipmentAdapter();
			}
			@Override
			public Adapter caseToOutsideStudyAreaShipment(ToOutsideStudyAreaShipment object) {
				return createToOutsideStudyAreaShipmentAdapter();
			}
			@Override
			public Adapter caseToInsideStudyAreaShipment(ToInsideStudyAreaShipment object) {
				return createToInsideStudyAreaShipmentAdapter();
			}
			@Override
			public Adapter caseOutsideToInsideShipment(OutsideToInsideShipment object) {
				return createOutsideToInsideShipmentAdapter();
			}
			@Override
			public Adapter caseInsideToInsideShipment(InsideToInsideShipment object) {
				return createInsideToInsideShipmentAdapter();
			}
			@Override
			public Adapter caseInsideToOutsideShipment(InsideToOutsideShipment object) {
				return createInsideToOutsideShipmentAdapter();
			}
			@Override
			public Adapter caseShipment(Shipment object) {
				return createShipmentAdapter();
			}
			@Override
			public Adapter caseSplittedShipment(SplittedShipment object) {
				return createSplittedShipmentAdapter();
			}
			@Override
			public Adapter caseFromInsideStudyAreaShipmentBase(FromInsideStudyAreaShipmentBase object) {
				return createFromInsideStudyAreaShipmentBaseAdapter();
			}
			@Override
			public Adapter caseToInsideStudyAreaShipmentBase(ToInsideStudyAreaShipmentBase object) {
				return createToInsideStudyAreaShipmentBaseAdapter();
			}
			@Override
			public Adapter caseHasId_(HasId_ object) {
				return createHasId_Adapter();
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
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticDemand.Demand <em>Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticDemand.Demand
	 * @generated
	 */
	public Adapter createDemandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticDemand.FromOutsideStudyAreaShipment <em>From Outside Study Area Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticDemand.FromOutsideStudyAreaShipment
	 * @generated
	 */
	public Adapter createFromOutsideStudyAreaShipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipment <em>From Inside Study Area Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipment
	 * @generated
	 */
	public Adapter createFromInsideStudyAreaShipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticDemand.ToOutsideStudyAreaShipment <em>To Outside Study Area Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticDemand.ToOutsideStudyAreaShipment
	 * @generated
	 */
	public Adapter createToOutsideStudyAreaShipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipment <em>To Inside Study Area Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipment
	 * @generated
	 */
	public Adapter createToInsideStudyAreaShipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticDemand.OutsideToInsideShipment <em>Outside To Inside Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticDemand.OutsideToInsideShipment
	 * @generated
	 */
	public Adapter createOutsideToInsideShipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticDemand.InsideToInsideShipment <em>Inside To Inside Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticDemand.InsideToInsideShipment
	 * @generated
	 */
	public Adapter createInsideToInsideShipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticDemand.InsideToOutsideShipment <em>Inside To Outside Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticDemand.InsideToOutsideShipment
	 * @generated
	 */
	public Adapter createInsideToOutsideShipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticDemand.Shipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticDemand.Shipment
	 * @generated
	 */
	public Adapter createShipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticDemand.SplittedShipment <em>Splitted Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticDemand.SplittedShipment
	 * @generated
	 */
	public Adapter createSplittedShipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipmentBase <em>From Inside Study Area Shipment Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticDemand.FromInsideStudyAreaShipmentBase
	 * @generated
	 */
	public Adapter createFromInsideStudyAreaShipmentBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipmentBase <em>To Inside Study Area Shipment Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.logisticDemand.ToInsideStudyAreaShipmentBase
	 * @generated
	 */
	public Adapter createToInsideStudyAreaShipmentBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.HasId_ <em>Has Id </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.HasId_
	 * @generated
	 */
	public Adapter createHasId_Adapter() {
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

} //LogisticDemandAdapterFactory
