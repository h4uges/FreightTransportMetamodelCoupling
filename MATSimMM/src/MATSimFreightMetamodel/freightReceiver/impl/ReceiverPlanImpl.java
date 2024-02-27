/**
 */
package MATSimFreightMetamodel.freightReceiver.impl;

import MATSimFreightMetamodel.freightContrib.TimeWindow;

import MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage;
import MATSimFreightMetamodel.freightReceiver.ReceiverOrder;
import MATSimFreightMetamodel.freightReceiver.ReceiverPlan;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receiver Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverPlanImpl#getScore <em>Score</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverPlanImpl#getTimeWindows <em>Time Windows</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverPlanImpl#getOrders <em>Orders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceiverPlanImpl extends MinimalEObjectImpl.Container implements ReceiverPlan {
	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final double SCORE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected double score = SCORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeWindows() <em>Time Windows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeWindows()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeWindow> timeWindows;

	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<ReceiverOrder> orders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiverPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreightReceiverPackage.Literals.RECEIVER_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScore(double newScore) {
		double oldScore = score;
		score = newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreightReceiverPackage.RECEIVER_PLAN__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimeWindow> getTimeWindows() {
		if (timeWindows == null) {
			timeWindows = new EObjectContainmentEList<TimeWindow>(TimeWindow.class, this, FreightReceiverPackage.RECEIVER_PLAN__TIME_WINDOWS);
		}
		return timeWindows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReceiverOrder> getOrders() {
		if (orders == null) {
			orders = new EObjectContainmentEList<ReceiverOrder>(ReceiverOrder.class, this, FreightReceiverPackage.RECEIVER_PLAN__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreightReceiverPackage.RECEIVER_PLAN__TIME_WINDOWS:
				return ((InternalEList<?>)getTimeWindows()).basicRemove(otherEnd, msgs);
			case FreightReceiverPackage.RECEIVER_PLAN__ORDERS:
				return ((InternalEList<?>)getOrders()).basicRemove(otherEnd, msgs);
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
			case FreightReceiverPackage.RECEIVER_PLAN__SCORE:
				return getScore();
			case FreightReceiverPackage.RECEIVER_PLAN__TIME_WINDOWS:
				return getTimeWindows();
			case FreightReceiverPackage.RECEIVER_PLAN__ORDERS:
				return getOrders();
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
			case FreightReceiverPackage.RECEIVER_PLAN__SCORE:
				setScore((Double)newValue);
				return;
			case FreightReceiverPackage.RECEIVER_PLAN__TIME_WINDOWS:
				getTimeWindows().clear();
				getTimeWindows().addAll((Collection<? extends TimeWindow>)newValue);
				return;
			case FreightReceiverPackage.RECEIVER_PLAN__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends ReceiverOrder>)newValue);
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
			case FreightReceiverPackage.RECEIVER_PLAN__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case FreightReceiverPackage.RECEIVER_PLAN__TIME_WINDOWS:
				getTimeWindows().clear();
				return;
			case FreightReceiverPackage.RECEIVER_PLAN__ORDERS:
				getOrders().clear();
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
			case FreightReceiverPackage.RECEIVER_PLAN__SCORE:
				return score != SCORE_EDEFAULT;
			case FreightReceiverPackage.RECEIVER_PLAN__TIME_WINDOWS:
				return timeWindows != null && !timeWindows.isEmpty();
			case FreightReceiverPackage.RECEIVER_PLAN__ORDERS:
				return orders != null && !orders.isEmpty();
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
		result.append(" (score: ");
		result.append(score);
		result.append(')');
		return result.toString();
	}

} //ReceiverPlanImpl
