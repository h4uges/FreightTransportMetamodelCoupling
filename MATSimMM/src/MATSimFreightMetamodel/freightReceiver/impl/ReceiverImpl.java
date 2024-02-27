/**
 */
package MATSimFreightMetamodel.freightReceiver.impl;

import MATSimFreightMetamodel.base.impl.EntityImpl;

import MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage;
import MATSimFreightMetamodel.freightReceiver.Receiver;
import MATSimFreightMetamodel.freightReceiver.ReceiverPlan;
import MATSimFreightMetamodel.freightReceiver.ReceiverProduct;

import MATSimFreightMetamodel.matsim.core.network.Link;

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
 * An implementation of the model object '<em><b>Receiver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverImpl#getPlans <em>Plans</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverImpl#getSelectedPlan <em>Selected Plan</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverImpl#getMoneyBalance <em>Money Balance</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceiverImpl extends EntityImpl implements Receiver {
	/**
	 * The cached value of the '{@link #getPlans() <em>Plans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<ReceiverPlan> plans;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<ReceiverProduct> products;

	/**
	 * The cached value of the '{@link #getSelectedPlan() <em>Selected Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedPlan()
	 * @generated
	 * @ordered
	 */
	protected ReceiverPlan selectedPlan;

	/**
	 * The default value of the '{@link #getMoneyBalance() <em>Money Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoneyBalance()
	 * @generated
	 * @ordered
	 */
	protected static final double MONEY_BALANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMoneyBalance() <em>Money Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoneyBalance()
	 * @generated
	 * @ordered
	 */
	protected double moneyBalance = MONEY_BALANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Link location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreightReceiverPackage.Literals.RECEIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReceiverPlan> getPlans() {
		if (plans == null) {
			plans = new EObjectContainmentEList<ReceiverPlan>(ReceiverPlan.class, this, FreightReceiverPackage.RECEIVER__PLANS);
		}
		return plans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReceiverProduct> getProducts() {
		if (products == null) {
			products = new EObjectContainmentEList<ReceiverProduct>(ReceiverProduct.class, this, FreightReceiverPackage.RECEIVER__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReceiverPlan getSelectedPlan() {
		if (selectedPlan != null && selectedPlan.eIsProxy()) {
			InternalEObject oldSelectedPlan = (InternalEObject)selectedPlan;
			selectedPlan = (ReceiverPlan)eResolveProxy(oldSelectedPlan);
			if (selectedPlan != oldSelectedPlan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreightReceiverPackage.RECEIVER__SELECTED_PLAN, oldSelectedPlan, selectedPlan));
			}
		}
		return selectedPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiverPlan basicGetSelectedPlan() {
		return selectedPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectedPlan(ReceiverPlan newSelectedPlan) {
		ReceiverPlan oldSelectedPlan = selectedPlan;
		selectedPlan = newSelectedPlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightReceiverPackage.RECEIVER__SELECTED_PLAN, oldSelectedPlan, selectedPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMoneyBalance() {
		return moneyBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoneyBalance(double newMoneyBalance) {
		double oldMoneyBalance = moneyBalance;
		moneyBalance = newMoneyBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightReceiverPackage.RECEIVER__MONEY_BALANCE, oldMoneyBalance, moneyBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Link)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreightReceiverPackage.RECEIVER__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(Link newLocation) {
		Link oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightReceiverPackage.RECEIVER__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreightReceiverPackage.RECEIVER__PLANS:
				return ((InternalEList<?>)getPlans()).basicRemove(otherEnd, msgs);
			case FreightReceiverPackage.RECEIVER__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
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
			case FreightReceiverPackage.RECEIVER__PLANS:
				return getPlans();
			case FreightReceiverPackage.RECEIVER__PRODUCTS:
				return getProducts();
			case FreightReceiverPackage.RECEIVER__SELECTED_PLAN:
				if (resolve) return getSelectedPlan();
				return basicGetSelectedPlan();
			case FreightReceiverPackage.RECEIVER__MONEY_BALANCE:
				return getMoneyBalance();
			case FreightReceiverPackage.RECEIVER__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
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
			case FreightReceiverPackage.RECEIVER__PLANS:
				getPlans().clear();
				getPlans().addAll((Collection<? extends ReceiverPlan>)newValue);
				return;
			case FreightReceiverPackage.RECEIVER__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends ReceiverProduct>)newValue);
				return;
			case FreightReceiverPackage.RECEIVER__SELECTED_PLAN:
				setSelectedPlan((ReceiverPlan)newValue);
				return;
			case FreightReceiverPackage.RECEIVER__MONEY_BALANCE:
				setMoneyBalance((Double)newValue);
				return;
			case FreightReceiverPackage.RECEIVER__LOCATION:
				setLocation((Link)newValue);
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
			case FreightReceiverPackage.RECEIVER__PLANS:
				getPlans().clear();
				return;
			case FreightReceiverPackage.RECEIVER__PRODUCTS:
				getProducts().clear();
				return;
			case FreightReceiverPackage.RECEIVER__SELECTED_PLAN:
				setSelectedPlan((ReceiverPlan)null);
				return;
			case FreightReceiverPackage.RECEIVER__MONEY_BALANCE:
				setMoneyBalance(MONEY_BALANCE_EDEFAULT);
				return;
			case FreightReceiverPackage.RECEIVER__LOCATION:
				setLocation((Link)null);
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
			case FreightReceiverPackage.RECEIVER__PLANS:
				return plans != null && !plans.isEmpty();
			case FreightReceiverPackage.RECEIVER__PRODUCTS:
				return products != null && !products.isEmpty();
			case FreightReceiverPackage.RECEIVER__SELECTED_PLAN:
				return selectedPlan != null;
			case FreightReceiverPackage.RECEIVER__MONEY_BALANCE:
				return moneyBalance != MONEY_BALANCE_EDEFAULT;
			case FreightReceiverPackage.RECEIVER__LOCATION:
				return location != null;
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
		result.append(" (moneyBalance: ");
		result.append(moneyBalance);
		result.append(')');
		return result.toString();
	}

} //ReceiverImpl
