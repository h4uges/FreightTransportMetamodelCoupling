/**
 */
package CommonFreightTransportMetamodel.population.util;

import CommonFreightTransportMetamodel.population.*;

import CommonFreightTransportMetamodel.utils.HasId_;
import CommonFreightTransportMetamodel.utils.ShipmentlLegStartEndPoint;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CommonFreightTransportMetamodel.population.PopulationPackage
 * @generated
 */
public class PopulationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PopulationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PopulationPackage.eINSTANCE;
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
	protected PopulationSwitch<Adapter> modelSwitch =
		new PopulationSwitch<Adapter>() {
			@Override
			public Adapter caseBusinessBranch(BusinessBranch object) {
				return createBusinessBranchAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter casePopulation(Population object) {
				return createPopulationAdapter();
			}
			@Override
			public Adapter caseBusiness(Business object) {
				return createBusinessAdapter();
			}
			@Override
			public Adapter caseShipmentConsumerProducer(ShipmentConsumerProducer object) {
				return createShipmentConsumerProducerAdapter();
			}
			@Override
			public Adapter caseHousehold(Household object) {
				return createHouseholdAdapter();
			}
			@Override
			public Adapter caseHasId_(HasId_ object) {
				return createHasId_Adapter();
			}
			@Override
			public Adapter caseShipmentlLegStartEndPoint(ShipmentlLegStartEndPoint object) {
				return createShipmentlLegStartEndPointAdapter();
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
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.population.BusinessBranch <em>Business Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.population.BusinessBranch
	 * @generated
	 */
	public Adapter createBusinessBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.population.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.population.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.population.Population <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.population.Population
	 * @generated
	 */
	public Adapter createPopulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.population.Business <em>Business</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.population.Business
	 * @generated
	 */
	public Adapter createBusinessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.population.ShipmentConsumerProducer <em>Shipment Consumer Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.population.ShipmentConsumerProducer
	 * @generated
	 */
	public Adapter createShipmentConsumerProducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.population.Household <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.population.Household
	 * @generated
	 */
	public Adapter createHouseholdAdapter() {
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
	 * Creates a new adapter for an object of class '{@link CommonFreightTransportMetamodel.utils.ShipmentlLegStartEndPoint <em>Shipmentl Leg Start End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommonFreightTransportMetamodel.utils.ShipmentlLegStartEndPoint
	 * @generated
	 */
	public Adapter createShipmentlLegStartEndPointAdapter() {
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

} //PopulationAdapterFactory
