/**
 */
package CommonFreightTransportMetamodel.logisticNetwork.util;

import CommonFreightTransportMetamodel.logisticNetwork.*;

import CommonFreightTransportMetamodel.utils.HasId_;
import CommonFreightTransportMetamodel.utils.ShipmentlLegStartEndPoint;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage
 * @generated
 */
public class LogisticNetworkSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogisticNetworkPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogisticNetworkSwitch() {
		if (modelPackage == null) {
			modelPackage = LogisticNetworkPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LogisticNetworkPackage.CEPSP: {
				CEPSP cepsp = (CEPSP)theEObject;
				T result = caseCEPSP(cepsp);
				if (result == null) result = caseHasId_(cepsp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticNetworkPackage.LOGISTIC_NETWORK: {
				LogisticNetwork logisticNetwork = (LogisticNetwork)theEObject;
				T result = caseLogisticNetwork(logisticNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticNetworkPackage.PUBLIC_SERVICE_POINT: {
				PublicServicePoint publicServicePoint = (PublicServicePoint)theEObject;
				T result = casePublicServicePoint(publicServicePoint);
				if (result == null) result = caseLogisticFacility(publicServicePoint);
				if (result == null) result = caseShipmentlLegStartEndPoint(publicServicePoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticNetworkPackage.PACKSTATION: {
				Packstation packstation = (Packstation)theEObject;
				T result = casePackstation(packstation);
				if (result == null) result = casePublicServicePoint(packstation);
				if (result == null) result = caseLogisticFacility(packstation);
				if (result == null) result = caseShipmentlLegStartEndPoint(packstation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticNetworkPackage.SHOP: {
				Shop shop = (Shop)theEObject;
				T result = caseShop(shop);
				if (result == null) result = casePublicServicePoint(shop);
				if (result == null) result = caseLogisticFacility(shop);
				if (result == null) result = caseShipmentlLegStartEndPoint(shop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticNetworkPackage.VEHICLE_DEPOT: {
				VehicleDepot vehicleDepot = (VehicleDepot)theEObject;
				T result = caseVehicleDepot(vehicleDepot);
				if (result == null) result = caseHasId_(vehicleDepot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticNetworkPackage.LOGISTIC_HUB: {
				LogisticHub logisticHub = (LogisticHub)theEObject;
				T result = caseLogisticHub(logisticHub);
				if (result == null) result = caseLogisticFacility(logisticHub);
				if (result == null) result = caseHasId_(logisticHub);
				if (result == null) result = caseShipmentlLegStartEndPoint(logisticHub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticNetworkPackage.USED_PUBLIC_SERVICE_POINT: {
				UsedPublicServicePoint usedPublicServicePoint = (UsedPublicServicePoint)theEObject;
				T result = caseUsedPublicServicePoint(usedPublicServicePoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticNetworkPackage.VEHICLE: {
				Vehicle vehicle = (Vehicle)theEObject;
				T result = caseVehicle(vehicle);
				if (result == null) result = caseHasId_(vehicle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticNetworkPackage.LOGISTIC_FACILITY: {
				LogisticFacility logisticFacility = (LogisticFacility)theEObject;
				T result = caseLogisticFacility(logisticFacility);
				if (result == null) result = caseShipmentlLegStartEndPoint(logisticFacility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CEPSP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CEPSP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCEPSP(CEPSP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logistic Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logistic Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogisticNetwork(LogisticNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Service Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Service Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicServicePoint(PublicServicePoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packstation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packstation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackstation(Packstation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShop(Shop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle Depot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle Depot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicleDepot(VehicleDepot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logistic Hub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logistic Hub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogisticHub(LogisticHub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Used Public Service Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Used Public Service Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsedPublicServicePoint(UsedPublicServicePoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicle(Vehicle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logistic Facility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logistic Facility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogisticFacility(LogisticFacility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Id </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Id </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasId_(HasId_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipmentl Leg Start End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipmentl Leg Start End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipmentlLegStartEndPoint(ShipmentlLegStartEndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LogisticNetworkSwitch
