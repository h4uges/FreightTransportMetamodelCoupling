/**
 */
package MATSimFreightMetamodel.freightContrib.tour.util;

import MATSimFreightMetamodel.base.Entity;

import MATSimFreightMetamodel.freightContrib.tour.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MATSimFreightMetamodel.freightContrib.tour.TourPackage
 * @generated
 */
public class TourAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TourPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TourAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TourPackage.eINSTANCE;
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
	protected TourSwitch<Adapter> modelSwitch =
		new TourSwitch<Adapter>() {
			@Override
			public Adapter caseTour(Tour object) {
				return createTourAdapter();
			}
			@Override
			public Adapter caseTourElement(TourElement object) {
				return createTourElementAdapter();
			}
			@Override
			public Adapter caseLeg(Leg object) {
				return createLegAdapter();
			}
			@Override
			public Adapter caseTourActivity(TourActivity object) {
				return createTourActivityAdapter();
			}
			@Override
			public Adapter caseServiceActivity(ServiceActivity object) {
				return createServiceActivityAdapter();
			}
			@Override
			public Adapter caseStart(Start object) {
				return createStartAdapter();
			}
			@Override
			public Adapter caseEnd(End object) {
				return createEndAdapter();
			}
			@Override
			public Adapter caseShipmentBasedActivity(ShipmentBasedActivity object) {
				return createShipmentBasedActivityAdapter();
			}
			@Override
			public Adapter casePickup(Pickup object) {
				return createPickupAdapter();
			}
			@Override
			public Adapter caseDelivery(Delivery object) {
				return createDeliveryAdapter();
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
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.tour.Tour <em>Tour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.tour.Tour
	 * @generated
	 */
	public Adapter createTourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.tour.TourElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.tour.TourElement
	 * @generated
	 */
	public Adapter createTourElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.tour.Leg <em>Leg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.tour.Leg
	 * @generated
	 */
	public Adapter createLegAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.tour.TourActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.tour.TourActivity
	 * @generated
	 */
	public Adapter createTourActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.tour.ServiceActivity <em>Service Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.tour.ServiceActivity
	 * @generated
	 */
	public Adapter createServiceActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.tour.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.tour.Start
	 * @generated
	 */
	public Adapter createStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.tour.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.tour.End
	 * @generated
	 */
	public Adapter createEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.tour.ShipmentBasedActivity <em>Shipment Based Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.tour.ShipmentBasedActivity
	 * @generated
	 */
	public Adapter createShipmentBasedActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.tour.Pickup <em>Pickup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.tour.Pickup
	 * @generated
	 */
	public Adapter createPickupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.freightContrib.tour.Delivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.freightContrib.tour.Delivery
	 * @generated
	 */
	public Adapter createDeliveryAdapter() {
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

} //TourAdapterFactory
