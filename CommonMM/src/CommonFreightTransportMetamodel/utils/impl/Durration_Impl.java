/**
 */
package CommonFreightTransportMetamodel.utils.impl;

import CommonFreightTransportMetamodel.utils.Durration_;
import CommonFreightTransportMetamodel.utils.UtilsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Durration </b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.utils.impl.Durration_Impl#getHours <em>Hours</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.utils.impl.Durration_Impl#getDays <em>Days</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.utils.impl.Durration_Impl#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.utils.impl.Durration_Impl#getMinutes <em>Minutes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Durration_Impl extends MinimalEObjectImpl.Container implements Durration_ {
	/**
	 * The default value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
	protected static final int HOURS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
	protected int hours = HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDays() <em>Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDays()
	 * @generated
	 * @ordered
	 */
	protected static final int DAYS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDays() <em>Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDays()
	 * @generated
	 * @ordered
	 */
	protected int days = DAYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final int SECONDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeconds()
	 * @generated
	 * @ordered
	 */
	protected int seconds = SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes()
	 * @generated
	 * @ordered
	 */
	protected int minutes = MINUTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Durration_Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilsPackage.Literals.DURRATION_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHours() {
		return hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHours(int newHours) {
		int oldHours = hours;
		hours = newHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.DURRATION___HOURS, oldHours, hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDays() {
		return days;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDays(int newDays) {
		int oldDays = days;
		days = newDays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.DURRATION___DAYS, oldDays, days));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSeconds() {
		return seconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeconds(int newSeconds) {
		int oldSeconds = seconds;
		seconds = newSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.DURRATION___SECONDS, oldSeconds, seconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinutes() {
		return minutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinutes(int newMinutes) {
		int oldMinutes = minutes;
		minutes = newMinutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.DURRATION___MINUTES, oldMinutes, minutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UtilsPackage.DURRATION___HOURS:
				return getHours();
			case UtilsPackage.DURRATION___DAYS:
				return getDays();
			case UtilsPackage.DURRATION___SECONDS:
				return getSeconds();
			case UtilsPackage.DURRATION___MINUTES:
				return getMinutes();
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
			case UtilsPackage.DURRATION___HOURS:
				setHours((Integer)newValue);
				return;
			case UtilsPackage.DURRATION___DAYS:
				setDays((Integer)newValue);
				return;
			case UtilsPackage.DURRATION___SECONDS:
				setSeconds((Integer)newValue);
				return;
			case UtilsPackage.DURRATION___MINUTES:
				setMinutes((Integer)newValue);
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
			case UtilsPackage.DURRATION___HOURS:
				setHours(HOURS_EDEFAULT);
				return;
			case UtilsPackage.DURRATION___DAYS:
				setDays(DAYS_EDEFAULT);
				return;
			case UtilsPackage.DURRATION___SECONDS:
				setSeconds(SECONDS_EDEFAULT);
				return;
			case UtilsPackage.DURRATION___MINUTES:
				setMinutes(MINUTES_EDEFAULT);
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
			case UtilsPackage.DURRATION___HOURS:
				return hours != HOURS_EDEFAULT;
			case UtilsPackage.DURRATION___DAYS:
				return days != DAYS_EDEFAULT;
			case UtilsPackage.DURRATION___SECONDS:
				return seconds != SECONDS_EDEFAULT;
			case UtilsPackage.DURRATION___MINUTES:
				return minutes != MINUTES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (hours: ");
		result.append(hours);
		result.append(", days: ");
		result.append(days);
		result.append(", seconds: ");
		result.append(seconds);
		result.append(", minutes: ");
		result.append(minutes);
		result.append(')');
		return result.toString();
	}

} //Durration_Impl
