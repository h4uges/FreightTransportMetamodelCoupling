/**
 */
package MATSimFreightMetamodel.matsim.vehicles.util;

import MATSimFreightMetamodel.base.Entity;

import MATSimFreightMetamodel.matsim.vehicles.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage
 * @generated
 */
public class VehiclesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VehiclesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehiclesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VehiclesPackage.eINSTANCE;
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
	protected VehiclesSwitch<Adapter> modelSwitch =
		new VehiclesSwitch<Adapter>() {
			@Override
			public Adapter caseVehicleType(VehicleType object) {
				return createVehicleTypeAdapter();
			}
			@Override
			public Adapter caseVehicleCapacity(VehicleCapacity object) {
				return createVehicleCapacityAdapter();
			}
			@Override
			public Adapter caseVehicle(Vehicle object) {
				return createVehicleAdapter();
			}
			@Override
			public Adapter caseVehicleTypes(VehicleTypes object) {
				return createVehicleTypesAdapter();
			}
			@Override
			public Adapter casePersonVehicle(PersonVehicle object) {
				return createPersonVehicleAdapter();
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
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleType
	 * @generated
	 */
	public Adapter createVehicleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity <em>Vehicle Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity
	 * @generated
	 */
	public Adapter createVehicleCapacityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.matsim.vehicles.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.matsim.vehicles.Vehicle
	 * @generated
	 */
	public Adapter createVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.matsim.vehicles.VehicleTypes <em>Vehicle Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.matsim.vehicles.VehicleTypes
	 * @generated
	 */
	public Adapter createVehicleTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MATSimFreightMetamodel.matsim.vehicles.PersonVehicle <em>Person Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MATSimFreightMetamodel.matsim.vehicles.PersonVehicle
	 * @generated
	 */
	public Adapter createPersonVehicleAdapter() {
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

} //VehiclesAdapterFactory
