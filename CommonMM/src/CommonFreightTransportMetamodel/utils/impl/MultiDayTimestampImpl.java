/**
 */
package CommonFreightTransportMetamodel.utils.impl;

import CommonFreightTransportMetamodel.utils.MultiDayTimestamp;
import CommonFreightTransportMetamodel.utils.UtilsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Day Timestamp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.utils.impl.MultiDayTimestampImpl#getSimulationDay <em>Simulation Day</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.utils.impl.MultiDayTimestampImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.utils.impl.MultiDayTimestampImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.utils.impl.MultiDayTimestampImpl#getMinute <em>Minute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiDayTimestampImpl extends Timestamp_Impl implements MultiDayTimestamp {
	/**
	 * The default value of the '{@link #getSimulationDay() <em>Simulation Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationDay()
	 * @generated
	 * @ordered
	 */
	protected static final int SIMULATION_DAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSimulationDay() <em>Simulation Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationDay()
	 * @generated
	 * @ordered
	 */
	protected int simulationDay = SIMULATION_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected static final int HOUR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected int hour = HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected static final int SECOND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected int second = SECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected int minute = MINUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiDayTimestampImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilsPackage.Literals.MULTI_DAY_TIMESTAMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSimulationDay() {
		return simulationDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimulationDay(int newSimulationDay) {
		int oldSimulationDay = simulationDay;
		simulationDay = newSimulationDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.MULTI_DAY_TIMESTAMP__SIMULATION_DAY, oldSimulationDay, simulationDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHour() {
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHour(int newHour) {
		int oldHour = hour;
		hour = newHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.MULTI_DAY_TIMESTAMP__HOUR, oldHour, hour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecond(int newSecond) {
		int oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.MULTI_DAY_TIMESTAMP__SECOND, oldSecond, second));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinute() {
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinute(int newMinute) {
		int oldMinute = minute;
		minute = newMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.MULTI_DAY_TIMESTAMP__MINUTE, oldMinute, minute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UtilsPackage.MULTI_DAY_TIMESTAMP__SIMULATION_DAY:
				return getSimulationDay();
			case UtilsPackage.MULTI_DAY_TIMESTAMP__HOUR:
				return getHour();
			case UtilsPackage.MULTI_DAY_TIMESTAMP__SECOND:
				return getSecond();
			case UtilsPackage.MULTI_DAY_TIMESTAMP__MINUTE:
				return getMinute();
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
			case UtilsPackage.MULTI_DAY_TIMESTAMP__SIMULATION_DAY:
				setSimulationDay((Integer)newValue);
				return;
			case UtilsPackage.MULTI_DAY_TIMESTAMP__HOUR:
				setHour((Integer)newValue);
				return;
			case UtilsPackage.MULTI_DAY_TIMESTAMP__SECOND:
				setSecond((Integer)newValue);
				return;
			case UtilsPackage.MULTI_DAY_TIMESTAMP__MINUTE:
				setMinute((Integer)newValue);
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
			case UtilsPackage.MULTI_DAY_TIMESTAMP__SIMULATION_DAY:
				setSimulationDay(SIMULATION_DAY_EDEFAULT);
				return;
			case UtilsPackage.MULTI_DAY_TIMESTAMP__HOUR:
				setHour(HOUR_EDEFAULT);
				return;
			case UtilsPackage.MULTI_DAY_TIMESTAMP__SECOND:
				setSecond(SECOND_EDEFAULT);
				return;
			case UtilsPackage.MULTI_DAY_TIMESTAMP__MINUTE:
				setMinute(MINUTE_EDEFAULT);
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
			case UtilsPackage.MULTI_DAY_TIMESTAMP__SIMULATION_DAY:
				return simulationDay != SIMULATION_DAY_EDEFAULT;
			case UtilsPackage.MULTI_DAY_TIMESTAMP__HOUR:
				return hour != HOUR_EDEFAULT;
			case UtilsPackage.MULTI_DAY_TIMESTAMP__SECOND:
				return second != SECOND_EDEFAULT;
			case UtilsPackage.MULTI_DAY_TIMESTAMP__MINUTE:
				return minute != MINUTE_EDEFAULT;
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
		result.append(" (simulationDay: ");
		result.append(simulationDay);
		result.append(", hour: ");
		result.append(hour);
		result.append(", second: ");
		result.append(second);
		result.append(", minute: ");
		result.append(minute);
		result.append(')');
		return result.toString();
	}

} //MultiDayTimestampImpl
