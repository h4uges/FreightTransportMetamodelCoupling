/**
 */
package logiToppMetamodel.logiTopp.distribution.timetable.impl;

import logiToppMetamodel.base.RelativeTime;
import logiToppMetamodel.base.Time;

import logiToppMetamodel.logiTopp.distribution.DistributionCenter;

import logiToppMetamodel.logiTopp.distribution.timetable.Connection;
import logiToppMetamodel.logiTopp.distribution.timetable.TimetablePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.timetable.impl.ConnectionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.timetable.impl.ConnectionImpl#getTo <em>To</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.timetable.impl.ConnectionImpl#getDeparture <em>Departure</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.timetable.impl.ConnectionImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected DistributionCenter from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected DistributionCenter to;

	/**
	 * The cached value of the '{@link #getDeparture() <em>Departure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeparture()
	 * @generated
	 * @ordered
	 */
	protected Time departure;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected RelativeTime duration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimetablePackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistributionCenter getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (DistributionCenter)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimetablePackage.CONNECTION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionCenter basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(DistributionCenter newFrom) {
		DistributionCenter oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.CONNECTION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistributionCenter getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (DistributionCenter)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimetablePackage.CONNECTION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionCenter basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(DistributionCenter newTo) {
		DistributionCenter oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.CONNECTION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getDeparture() {
		if (departure != null && departure.eIsProxy()) {
			InternalEObject oldDeparture = (InternalEObject)departure;
			departure = (Time)eResolveProxy(oldDeparture);
			if (departure != oldDeparture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimetablePackage.CONNECTION__DEPARTURE, oldDeparture, departure));
			}
		}
		return departure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time basicGetDeparture() {
		return departure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeparture(Time newDeparture) {
		Time oldDeparture = departure;
		departure = newDeparture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.CONNECTION__DEPARTURE, oldDeparture, departure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelativeTime getDuration() {
		if (duration != null && duration.eIsProxy()) {
			InternalEObject oldDuration = (InternalEObject)duration;
			duration = (RelativeTime)eResolveProxy(oldDuration);
			if (duration != oldDuration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimetablePackage.CONNECTION__DURATION, oldDuration, duration));
			}
		}
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeTime basicGetDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(RelativeTime newDuration) {
		RelativeTime oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimetablePackage.CONNECTION__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimetablePackage.CONNECTION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case TimetablePackage.CONNECTION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case TimetablePackage.CONNECTION__DEPARTURE:
				if (resolve) return getDeparture();
				return basicGetDeparture();
			case TimetablePackage.CONNECTION__DURATION:
				if (resolve) return getDuration();
				return basicGetDuration();
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
			case TimetablePackage.CONNECTION__FROM:
				setFrom((DistributionCenter)newValue);
				return;
			case TimetablePackage.CONNECTION__TO:
				setTo((DistributionCenter)newValue);
				return;
			case TimetablePackage.CONNECTION__DEPARTURE:
				setDeparture((Time)newValue);
				return;
			case TimetablePackage.CONNECTION__DURATION:
				setDuration((RelativeTime)newValue);
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
			case TimetablePackage.CONNECTION__FROM:
				setFrom((DistributionCenter)null);
				return;
			case TimetablePackage.CONNECTION__TO:
				setTo((DistributionCenter)null);
				return;
			case TimetablePackage.CONNECTION__DEPARTURE:
				setDeparture((Time)null);
				return;
			case TimetablePackage.CONNECTION__DURATION:
				setDuration((RelativeTime)null);
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
			case TimetablePackage.CONNECTION__FROM:
				return from != null;
			case TimetablePackage.CONNECTION__TO:
				return to != null;
			case TimetablePackage.CONNECTION__DEPARTURE:
				return departure != null;
			case TimetablePackage.CONNECTION__DURATION:
				return duration != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
