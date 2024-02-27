/**
 */
package MATSimFreightMetamodel.freightContrib.events.impl;

import MATSimFreightMetamodel.freightContrib.events.CarrierTourStartEvent;
import MATSimFreightMetamodel.freightContrib.events.EventsPackage;

import MATSimFreightMetamodel.freightContrib.tour.Tour;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carrier Tour Start Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.events.impl.CarrierTourStartEventImpl#getTour <em>Tour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarrierTourStartEventImpl extends CarrierEventImpl implements CarrierTourStartEvent {
	/**
	 * The cached value of the '{@link #getTour() <em>Tour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTour()
	 * @generated
	 * @ordered
	 */
	protected Tour tour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarrierTourStartEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.CARRIER_TOUR_START_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tour getTour() {
		if (tour != null && tour.eIsProxy()) {
			InternalEObject oldTour = (InternalEObject)tour;
			tour = (Tour)eResolveProxy(oldTour);
			if (tour != oldTour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventsPackage.CARRIER_TOUR_START_EVENT__TOUR, oldTour, tour));
			}
		}
		return tour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tour basicGetTour() {
		return tour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTour(Tour newTour) {
		Tour oldTour = tour;
		tour = newTour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.CARRIER_TOUR_START_EVENT__TOUR, oldTour, tour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.CARRIER_TOUR_START_EVENT__TOUR:
				if (resolve) return getTour();
				return basicGetTour();
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
			case EventsPackage.CARRIER_TOUR_START_EVENT__TOUR:
				setTour((Tour)newValue);
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
			case EventsPackage.CARRIER_TOUR_START_EVENT__TOUR:
				setTour((Tour)null);
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
			case EventsPackage.CARRIER_TOUR_START_EVENT__TOUR:
				return tour != null;
		}
		return super.eIsSet(featureID);
	}

} //CarrierTourStartEventImpl
