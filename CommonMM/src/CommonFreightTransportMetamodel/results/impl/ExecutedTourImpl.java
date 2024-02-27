/**
 */
package CommonFreightTransportMetamodel.results.impl;

import CommonFreightTransportMetamodel.logisticSolution.PlannedTour;

import CommonFreightTransportMetamodel.logisticSolution.impl.TourImpl;

import CommonFreightTransportMetamodel.results.ExecutedTour;
import CommonFreightTransportMetamodel.results.ResultsPackage;
import CommonFreightTransportMetamodel.results.TourStopMapping;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executed Tour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.results.impl.ExecutedTourImpl#getPlannedTour <em>Planned Tour</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.results.impl.ExecutedTourImpl#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutedTourImpl extends TourImpl implements ExecutedTour {
	/**
	 * The cached value of the '{@link #getPlannedTour() <em>Planned Tour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedTour()
	 * @generated
	 * @ordered
	 */
	protected PlannedTour plannedTour;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<TourStopMapping> mappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutedTourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.EXECUTED_TOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedTour getPlannedTour() {
		if (plannedTour != null && plannedTour.eIsProxy()) {
			InternalEObject oldPlannedTour = (InternalEObject)plannedTour;
			plannedTour = (PlannedTour)eResolveProxy(oldPlannedTour);
			if (plannedTour != oldPlannedTour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultsPackage.EXECUTED_TOUR__PLANNED_TOUR, oldPlannedTour, plannedTour));
			}
		}
		return plannedTour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedTour basicGetPlannedTour() {
		return plannedTour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlannedTour(PlannedTour newPlannedTour) {
		PlannedTour oldPlannedTour = plannedTour;
		plannedTour = newPlannedTour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.EXECUTED_TOUR__PLANNED_TOUR, oldPlannedTour, plannedTour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TourStopMapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList<TourStopMapping>(TourStopMapping.class, this, ResultsPackage.EXECUTED_TOUR__MAPPINGS);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultsPackage.EXECUTED_TOUR__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultsPackage.EXECUTED_TOUR__PLANNED_TOUR:
				if (resolve) return getPlannedTour();
				return basicGetPlannedTour();
			case ResultsPackage.EXECUTED_TOUR__MAPPINGS:
				return getMappings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResultsPackage.EXECUTED_TOUR__PLANNED_TOUR:
				setPlannedTour((PlannedTour)newValue);
				return;
			case ResultsPackage.EXECUTED_TOUR__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends TourStopMapping>)newValue);
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
			case ResultsPackage.EXECUTED_TOUR__PLANNED_TOUR:
				setPlannedTour((PlannedTour)null);
				return;
			case ResultsPackage.EXECUTED_TOUR__MAPPINGS:
				getMappings().clear();
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
			case ResultsPackage.EXECUTED_TOUR__PLANNED_TOUR:
				return plannedTour != null;
			case ResultsPackage.EXECUTED_TOUR__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExecutedTourImpl
