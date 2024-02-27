/**
 */
package MATSimFreightMetamodel.matsim.households.impl;

import MATSimFreightMetamodel.matsim.households.Currency;
import MATSimFreightMetamodel.matsim.households.HouseholdsPackage;
import MATSimFreightMetamodel.matsim.households.Income;
import MATSimFreightMetamodel.matsim.households.IncomePeriod;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Income</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.matsim.households.impl.IncomeImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.households.impl.IncomeImpl#getIncome <em>Income</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.households.impl.IncomeImpl#getCurrency <em>Currency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncomeImpl extends MinimalEObjectImpl.Container implements Income {
	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final IncomePeriod PERIOD_EDEFAULT = IncomePeriod.YEAR;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected IncomePeriod period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncome() <em>Income</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncome()
	 * @generated
	 * @ordered
	 */
	protected static final double INCOME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncome() <em>Income</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncome()
	 * @generated
	 * @ordered
	 */
	protected double income = INCOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final Currency CURRENCY_EDEFAULT = Currency.EUR;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected Currency currency = CURRENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HouseholdsPackage.Literals.INCOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IncomePeriod getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriod(IncomePeriod newPeriod) {
		IncomePeriod oldPeriod = period;
		period = newPeriod == null ? PERIOD_EDEFAULT : newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HouseholdsPackage.INCOME__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getIncome() {
		return income;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncome(double newIncome) {
		double oldIncome = income;
		income = newIncome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HouseholdsPackage.INCOME__INCOME, oldIncome, income));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Currency getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrency(Currency newCurrency) {
		Currency oldCurrency = currency;
		currency = newCurrency == null ? CURRENCY_EDEFAULT : newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HouseholdsPackage.INCOME__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HouseholdsPackage.INCOME__PERIOD:
				return getPeriod();
			case HouseholdsPackage.INCOME__INCOME:
				return getIncome();
			case HouseholdsPackage.INCOME__CURRENCY:
				return getCurrency();
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
			case HouseholdsPackage.INCOME__PERIOD:
				setPeriod((IncomePeriod)newValue);
				return;
			case HouseholdsPackage.INCOME__INCOME:
				setIncome((Double)newValue);
				return;
			case HouseholdsPackage.INCOME__CURRENCY:
				setCurrency((Currency)newValue);
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
			case HouseholdsPackage.INCOME__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case HouseholdsPackage.INCOME__INCOME:
				setIncome(INCOME_EDEFAULT);
				return;
			case HouseholdsPackage.INCOME__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
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
			case HouseholdsPackage.INCOME__PERIOD:
				return period != PERIOD_EDEFAULT;
			case HouseholdsPackage.INCOME__INCOME:
				return income != INCOME_EDEFAULT;
			case HouseholdsPackage.INCOME__CURRENCY:
				return currency != CURRENCY_EDEFAULT;
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
		result.append(" (period: ");
		result.append(period);
		result.append(", income: ");
		result.append(income);
		result.append(", currency: ");
		result.append(currency);
		result.append(')');
		return result.toString();
	}

} //IncomeImpl
