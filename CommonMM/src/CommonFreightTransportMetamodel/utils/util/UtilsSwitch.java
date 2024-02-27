/**
 */
package CommonFreightTransportMetamodel.utils.util;

import CommonFreightTransportMetamodel.utils.*;

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
 * @see CommonFreightTransportMetamodel.utils.UtilsPackage
 * @generated
 */
public class UtilsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UtilsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilsSwitch() {
		if (modelPackage == null) {
			modelPackage = UtilsPackage.eINSTANCE;
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
			case UtilsPackage.SINGLE_DAY_TIMESTAMP: {
				SingleDayTimestamp singleDayTimestamp = (SingleDayTimestamp)theEObject;
				T result = caseSingleDayTimestamp(singleDayTimestamp);
				if (result == null) result = caseTimestamp_(singleDayTimestamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.TIMESTAMP_: {
				Timestamp_ timestamp_ = (Timestamp_)theEObject;
				T result = caseTimestamp_(timestamp_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.TIME_WINDOW_: {
				TimeWindow_ timeWindow_ = (TimeWindow_)theEObject;
				T result = caseTimeWindow_(timeWindow_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.MULTI_DAY_TIMESTAMP: {
				MultiDayTimestamp multiDayTimestamp = (MultiDayTimestamp)theEObject;
				T result = caseMultiDayTimestamp(multiDayTimestamp);
				if (result == null) result = caseTimestamp_(multiDayTimestamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.SINGLE_DAY_TIME_WINDOW: {
				SingleDayTimeWindow singleDayTimeWindow = (SingleDayTimeWindow)theEObject;
				T result = caseSingleDayTimeWindow(singleDayTimeWindow);
				if (result == null) result = caseTimeWindow_(singleDayTimeWindow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.MULTI_DAY_TIME_WINDOW: {
				MultiDayTimeWindow multiDayTimeWindow = (MultiDayTimeWindow)theEObject;
				T result = caseMultiDayTimeWindow(multiDayTimeWindow);
				if (result == null) result = caseTimeWindow_(multiDayTimeWindow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.HAS_ID_: {
				HasId_ hasId_ = (HasId_)theEObject;
				T result = caseHasId_(hasId_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.DURRATION_: {
				Durration_ durration_ = (Durration_)theEObject;
				T result = caseDurration_(durration_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.COORDINATE: {
				Coordinate coordinate = (Coordinate)theEObject;
				T result = caseCoordinate(coordinate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.VOLUME_BASED_DIMENSION: {
				VolumeBasedDimension volumeBasedDimension = (VolumeBasedDimension)theEObject;
				T result = caseVolumeBasedDimension(volumeBasedDimension);
				if (result == null) result = caseDimension(volumeBasedDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.WEIGHT_BASED_DIMENSION: {
				WeightBasedDimension weightBasedDimension = (WeightBasedDimension)theEObject;
				T result = caseWeightBasedDimension(weightBasedDimension);
				if (result == null) result = caseDimension(weightBasedDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION: {
				VolumeAndWeightBasedDimension volumeAndWeightBasedDimension = (VolumeAndWeightBasedDimension)theEObject;
				T result = caseVolumeAndWeightBasedDimension(volumeAndWeightBasedDimension);
				if (result == null) result = caseDimension(volumeAndWeightBasedDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.DIMENSION: {
				Dimension dimension = (Dimension)theEObject;
				T result = caseDimension(dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.SHIPMENTL_LEG_START_END_POINT: {
				ShipmentlLegStartEndPoint shipmentlLegStartEndPoint = (ShipmentlLegStartEndPoint)theEObject;
				T result = caseShipmentlLegStartEndPoint(shipmentlLegStartEndPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.INFINITE_VOLUME_DIMENSION: {
				InfiniteVolumeDimension infiniteVolumeDimension = (InfiniteVolumeDimension)theEObject;
				T result = caseInfiniteVolumeDimension(infiniteVolumeDimension);
				if (result == null) result = caseVolumeBasedDimension(infiniteVolumeDimension);
				if (result == null) result = caseDimension(infiniteVolumeDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.FINITE_VOLUME_DIMENSION: {
				FiniteVolumeDimension finiteVolumeDimension = (FiniteVolumeDimension)theEObject;
				T result = caseFiniteVolumeDimension(finiteVolumeDimension);
				if (result == null) result = caseVolumeBasedDimension(finiteVolumeDimension);
				if (result == null) result = caseDimension(finiteVolumeDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.FINITE_WEIGHT_DIMENSION: {
				FiniteWeightDimension finiteWeightDimension = (FiniteWeightDimension)theEObject;
				T result = caseFiniteWeightDimension(finiteWeightDimension);
				if (result == null) result = caseWeightBasedDimension(finiteWeightDimension);
				if (result == null) result = caseDimension(finiteWeightDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UtilsPackage.INFINITE_WEIGHT_DIMENSION: {
				InfiniteWeightDimension infiniteWeightDimension = (InfiniteWeightDimension)theEObject;
				T result = caseInfiniteWeightDimension(infiniteWeightDimension);
				if (result == null) result = caseWeightBasedDimension(infiniteWeightDimension);
				if (result == null) result = caseDimension(infiniteWeightDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Day Timestamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Day Timestamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleDayTimestamp(SingleDayTimestamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timestamp </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timestamp </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimestamp_(Timestamp_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Window </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Window </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeWindow_(TimeWindow_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Day Timestamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Day Timestamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiDayTimestamp(MultiDayTimestamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Day Time Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Day Time Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleDayTimeWindow(SingleDayTimeWindow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Day Time Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Day Time Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiDayTimeWindow(MultiDayTimeWindow object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Durration </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Durration </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurration_(Durration_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinate(Coordinate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume Based Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume Based Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolumeBasedDimension(VolumeBasedDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weight Based Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weight Based Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeightBasedDimension(WeightBasedDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume And Weight Based Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume And Weight Based Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolumeAndWeightBasedDimension(VolumeAndWeightBasedDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimension(Dimension object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Infinite Volume Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infinite Volume Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfiniteVolumeDimension(InfiniteVolumeDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finite Volume Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finite Volume Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFiniteVolumeDimension(FiniteVolumeDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finite Weight Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finite Weight Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFiniteWeightDimension(FiniteWeightDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infinite Weight Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infinite Weight Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfiniteWeightDimension(InfiniteWeightDimension object) {
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

} //UtilsSwitch
