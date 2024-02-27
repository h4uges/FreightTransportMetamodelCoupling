/**
 */
package MATSimFreightMetamodel.matsim.vehicles.impl;

import MATSimFreightMetamodel.matsim.vehicles.*;

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
public class VehiclesFactoryImpl extends EFactoryImpl implements VehiclesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VehiclesFactory init() {
		try {
			VehiclesFactory theVehiclesFactory = (VehiclesFactory)EPackage.Registry.INSTANCE.getEFactory(VehiclesPackage.eNS_URI);
			if (theVehiclesFactory != null) {
				return theVehiclesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VehiclesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehiclesFactoryImpl() {
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
			case VehiclesPackage.VEHICLE_TYPE: return createVehicleType();
			case VehiclesPackage.VEHICLE_CAPACITY: return createVehicleCapacity();
			case VehiclesPackage.VEHICLE_TYPES: return createVehicleTypes();
			case VehiclesPackage.PERSON_VEHICLE: return createPersonVehicle();
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
	public VehicleType createVehicleType() {
		VehicleTypeImpl vehicleType = new VehicleTypeImpl();
		return vehicleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehicleCapacity createVehicleCapacity() {
		VehicleCapacityImpl vehicleCapacity = new VehicleCapacityImpl();
		return vehicleCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehicleTypes createVehicleTypes() {
		VehicleTypesImpl vehicleTypes = new VehicleTypesImpl();
		return vehicleTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonVehicle createPersonVehicle() {
		PersonVehicleImpl personVehicle = new PersonVehicleImpl();
		return personVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehiclesPackage getVehiclesPackage() {
		return (VehiclesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VehiclesPackage getPackage() {
		return VehiclesPackage.eINSTANCE;
	}

} //VehiclesFactoryImpl
