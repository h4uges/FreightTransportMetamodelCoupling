/**
 */
package MATSimFreightMetamodel.freightContrib.impl;

import MATSimFreightMetamodel.freightContrib.CarrierPlan;
import MATSimFreightMetamodel.freightContrib.FreightContribPackage;
import MATSimFreightMetamodel.freightContrib.ScheduledTour;

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
 * An implementation of the model object '<em><b>Carrier Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierPlanImpl#getScheduledTours <em>Scheduled Tours</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.impl.CarrierPlanImpl#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarrierPlanImpl extends MinimalEObjectImpl.Container implements CarrierPlan {
	/**
	 * The cached value of the '{@link #getScheduledTours() <em>Scheduled Tours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledTours()
	 * @generated
	 * @ordered
	 */
	protected EList<ScheduledTour> scheduledTours;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarrierPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FreightContribPackage.Literals.CARRIER_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScheduledTour> getScheduledTours() {
		if (scheduledTours == null) {
			scheduledTours = new EObjectContainmentEList<ScheduledTour>(ScheduledTour.class, this, FreightContribPackage.CARRIER_PLAN__SCHEDULED_TOURS);
		}
		return scheduledTours;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreightContribPackage.CARRIER_PLAN__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreightContribPackage.CARRIER_PLAN__SCHEDULED_TOURS:
				return ((InternalEList<?>)getScheduledTours()).basicRemove(otherEnd, msgs);
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
			case FreightContribPackage.CARRIER_PLAN__SCHEDULED_TOURS:
				return getScheduledTours();
			case FreightContribPackage.CARRIER_PLAN__SCORE:
				return getScore();
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
			case FreightContribPackage.CARRIER_PLAN__SCHEDULED_TOURS:
				getScheduledTours().clear();
				getScheduledTours().addAll((Collection<? extends ScheduledTour>)newValue);
				return;
			case FreightContribPackage.CARRIER_PLAN__SCORE:
				setScore((Double)newValue);
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
			case FreightContribPackage.CARRIER_PLAN__SCHEDULED_TOURS:
				getScheduledTours().clear();
				return;
			case FreightContribPackage.CARRIER_PLAN__SCORE:
				setScore(SCORE_EDEFAULT);
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
			case FreightContribPackage.CARRIER_PLAN__SCHEDULED_TOURS:
				return scheduledTours != null && !scheduledTours.isEmpty();
			case FreightContribPackage.CARRIER_PLAN__SCORE:
				return score != SCORE_EDEFAULT;
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

} //CarrierPlanImpl
