/**
 */
package CommonFreightTransportMetamodel.results.impl;

import CommonFreightTransportMetamodel.logisticSolution.Stop;

import CommonFreightTransportMetamodel.results.ResultsPackage;
import CommonFreightTransportMetamodel.results.TourStopMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tour Stop Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.results.impl.TourStopMappingImpl#getPlannedStop <em>Planned Stop</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.results.impl.TourStopMappingImpl#getExecutedStop <em>Executed Stop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TourStopMappingImpl extends MinimalEObjectImpl.Container implements TourStopMapping {
	/**
	 * The cached value of the '{@link #getPlannedStop() <em>Planned Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedStop()
	 * @generated
	 * @ordered
	 */
	protected Stop plannedStop;

	/**
	 * The cached value of the '{@link #getExecutedStop() <em>Executed Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedStop()
	 * @generated
	 * @ordered
	 */
	protected Stop executedStop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TourStopMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.TOUR_STOP_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stop getPlannedStop() {
		if (plannedStop != null && plannedStop.eIsProxy()) {
			InternalEObject oldPlannedStop = (InternalEObject)plannedStop;
			plannedStop = (Stop)eResolveProxy(oldPlannedStop);
			if (plannedStop != oldPlannedStop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultsPackage.TOUR_STOP_MAPPING__PLANNED_STOP, oldPlannedStop, plannedStop));
			}
		}
		return plannedStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stop basicGetPlannedStop() {
		return plannedStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlannedStop(Stop newPlannedStop) {
		Stop oldPlannedStop = plannedStop;
		plannedStop = newPlannedStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TOUR_STOP_MAPPING__PLANNED_STOP, oldPlannedStop, plannedStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stop getExecutedStop() {
		if (executedStop != null && executedStop.eIsProxy()) {
			InternalEObject oldExecutedStop = (InternalEObject)executedStop;
			executedStop = (Stop)eResolveProxy(oldExecutedStop);
			if (executedStop != oldExecutedStop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultsPackage.TOUR_STOP_MAPPING__EXECUTED_STOP, oldExecutedStop, executedStop));
			}
		}
		return executedStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stop basicGetExecutedStop() {
		return executedStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutedStop(Stop newExecutedStop) {
		Stop oldExecutedStop = executedStop;
		executedStop = newExecutedStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TOUR_STOP_MAPPING__EXECUTED_STOP, oldExecutedStop, executedStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultsPackage.TOUR_STOP_MAPPING__PLANNED_STOP:
				if (resolve) return getPlannedStop();
				return basicGetPlannedStop();
			case ResultsPackage.TOUR_STOP_MAPPING__EXECUTED_STOP:
				if (resolve) return getExecutedStop();
				return basicGetExecutedStop();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResultsPackage.TOUR_STOP_MAPPING__PLANNED_STOP:
				setPlannedStop((Stop)newValue);
				return;
			case ResultsPackage.TOUR_STOP_MAPPING__EXECUTED_STOP:
				setExecutedStop((Stop)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ResultsPackage.TOUR_STOP_MAPPING__PLANNED_STOP:
				setPlannedStop((Stop)null);
				return;
			case ResultsPackage.TOUR_STOP_MAPPING__EXECUTED_STOP:
				setExecutedStop((Stop)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ResultsPackage.TOUR_STOP_MAPPING__PLANNED_STOP:
				return plannedStop != null;
			case ResultsPackage.TOUR_STOP_MAPPING__EXECUTED_STOP:
				return executedStop != null;
		}
		return super.eIsSet(featureID);
	}

} //TourStopMappingImpl
