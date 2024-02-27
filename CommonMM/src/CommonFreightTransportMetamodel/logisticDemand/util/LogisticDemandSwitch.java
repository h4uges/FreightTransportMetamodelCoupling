/**
 */
package CommonFreightTransportMetamodel.logisticDemand.util;

import CommonFreightTransportMetamodel.logisticDemand.*;

import CommonFreightTransportMetamodel.utils.HasId_;

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
 * @see CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage
 * @generated
 */
public class LogisticDemandSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogisticDemandPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogisticDemandSwitch() {
		if (modelPackage == null) {
			modelPackage = LogisticDemandPackage.eINSTANCE;
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
			case LogisticDemandPackage.DEMAND: {
				Demand demand = (Demand)theEObject;
				T result = caseDemand(demand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticDemandPackage.FROM_OUTSIDE_STUDY_AREA_SHIPMENT: {
				FromOutsideStudyAreaShipment fromOutsideStudyAreaShipment = (FromOutsideStudyAreaShipment)theEObject;
				T result = caseFromOutsideStudyAreaShipment(fromOutsideStudyAreaShipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT: {
				FromInsideStudyAreaShipment fromInsideStudyAreaShipment = (FromInsideStudyAreaShipment)theEObject;
				T result = caseFromInsideStudyAreaShipment(fromInsideStudyAreaShipment);
				if (result == null) result = caseFromInsideStudyAreaShipmentBase(fromInsideStudyAreaShipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticDemandPackage.TO_OUTSIDE_STUDY_AREA_SHIPMENT: {
				ToOutsideStudyAreaShipment toOutsideStudyAreaShipment = (ToOutsideStudyAreaShipment)theEObject;
				T result = caseToOutsideStudyAreaShipment(toOutsideStudyAreaShipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT: {
				ToInsideStudyAreaShipment toInsideStudyAreaShipment = (ToInsideStudyAreaShipment)theEObject;
				T result = caseToInsideStudyAreaShipment(toInsideStudyAreaShipment);
				if (result == null) result = caseToInsideStudyAreaShipmentBase(toInsideStudyAreaShipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticDemandPackage.OUTSIDE_TO_INSIDE_SHIPMENT: {
				OutsideToInsideShipment outsideToInsideShipment = (OutsideToInsideShipment)theEObject;
				T result = caseOutsideToInsideShipment(outsideToInsideShipment);
				if (result == null) result = caseFromOutsideStudyAreaShipment(outsideToInsideShipment);
				if (result == null) result = caseToInsideStudyAreaShipment(outsideToInsideShipment);
				if (result == null) result = caseShipment(outsideToInsideShipment);
				if (result == null) result = caseToInsideStudyAreaShipmentBase(outsideToInsideShipment);
				if (result == null) result = caseHasId_(outsideToInsideShipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticDemandPackage.INSIDE_TO_INSIDE_SHIPMENT: {
				InsideToInsideShipment insideToInsideShipment = (InsideToInsideShipment)theEObject;
				T result = caseInsideToInsideShipment(insideToInsideShipment);
				if (result == null) result = caseFromInsideStudyAreaShipment(insideToInsideShipment);
				if (result == null) result = caseToInsideStudyAreaShipment(insideToInsideShipment);
				if (result == null) result = caseShipment(insideToInsideShipment);
				if (result == null) result = caseFromInsideStudyAreaShipmentBase(insideToInsideShipment);
				if (result == null) result = caseToInsideStudyAreaShipmentBase(insideToInsideShipment);
				if (result == null) result = caseHasId_(insideToInsideShipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticDemandPackage.INSIDE_TO_OUTSIDE_SHIPMENT: {
				InsideToOutsideShipment insideToOutsideShipment = (InsideToOutsideShipment)theEObject;
				T result = caseInsideToOutsideShipment(insideToOutsideShipment);
				if (result == null) result = caseFromInsideStudyAreaShipment(insideToOutsideShipment);
				if (result == null) result = caseToOutsideStudyAreaShipment(insideToOutsideShipment);
				if (result == null) result = caseShipment(insideToOutsideShipment);
				if (result == null) result = caseFromInsideStudyAreaShipmentBase(insideToOutsideShipment);
				if (result == null) result = caseHasId_(insideToOutsideShipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticDemandPackage.SHIPMENT: {
				Shipment shipment = (Shipment)theEObject;
				T result = caseShipment(shipment);
				if (result == null) result = caseHasId_(shipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticDemandPackage.SPLITTED_SHIPMENT: {
				SplittedShipment splittedShipment = (SplittedShipment)theEObject;
				T result = caseSplittedShipment(splittedShipment);
				if (result == null) result = caseShipment(splittedShipment);
				if (result == null) result = caseToInsideStudyAreaShipmentBase(splittedShipment);
				if (result == null) result = caseFromInsideStudyAreaShipmentBase(splittedShipment);
				if (result == null) result = caseHasId_(splittedShipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticDemandPackage.FROM_INSIDE_STUDY_AREA_SHIPMENT_BASE: {
				FromInsideStudyAreaShipmentBase fromInsideStudyAreaShipmentBase = (FromInsideStudyAreaShipmentBase)theEObject;
				T result = caseFromInsideStudyAreaShipmentBase(fromInsideStudyAreaShipmentBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogisticDemandPackage.TO_INSIDE_STUDY_AREA_SHIPMENT_BASE: {
				ToInsideStudyAreaShipmentBase toInsideStudyAreaShipmentBase = (ToInsideStudyAreaShipmentBase)theEObject;
				T result = caseToInsideStudyAreaShipmentBase(toInsideStudyAreaShipmentBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Demand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Demand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDemand(Demand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Outside Study Area Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Outside Study Area Shipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromOutsideStudyAreaShipment(FromOutsideStudyAreaShipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Inside Study Area Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Inside Study Area Shipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromInsideStudyAreaShipment(FromInsideStudyAreaShipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Outside Study Area Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Outside Study Area Shipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToOutsideStudyAreaShipment(ToOutsideStudyAreaShipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Inside Study Area Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Inside Study Area Shipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToInsideStudyAreaShipment(ToInsideStudyAreaShipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outside To Inside Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outside To Inside Shipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutsideToInsideShipment(OutsideToInsideShipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inside To Inside Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inside To Inside Shipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsideToInsideShipment(InsideToInsideShipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inside To Outside Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inside To Outside Shipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsideToOutsideShipment(InsideToOutsideShipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipment(Shipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Splitted Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Splitted Shipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplittedShipment(SplittedShipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Inside Study Area Shipment Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Inside Study Area Shipment Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromInsideStudyAreaShipmentBase(FromInsideStudyAreaShipmentBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Inside Study Area Shipment Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Inside Study Area Shipment Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToInsideStudyAreaShipmentBase(ToInsideStudyAreaShipmentBase object) {
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

} //LogisticDemandSwitch
