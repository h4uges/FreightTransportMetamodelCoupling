/**
 */
package CommonFreightTransportMetamodel.logisticSolution.impl;

import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage;
import CommonFreightTransportMetamodel.logisticSolution.PickUpEntry;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pick Up Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.PickUpEntryImpl#getPickUpLeg <em>Pick Up Leg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PickUpEntryImpl extends ShipmentEntryImpl implements PickUpEntry {
	/**
	 * The cached value of the '{@link #getPickUpLeg() <em>Pick Up Leg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickUpLeg()
	 * @generated
	 * @ordered
	 */
	protected ShipmentRecordEntry pickUpLeg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PickUpEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticSolutionPackage.Literals.PICK_UP_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentRecordEntry getPickUpLeg() {
		if (pickUpLeg != null && pickUpLeg.eIsProxy()) {
			InternalEObject oldPickUpLeg = (InternalEObject)pickUpLeg;
			pickUpLeg = (ShipmentRecordEntry)eResolveProxy(oldPickUpLeg);
			if (pickUpLeg != oldPickUpLeg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticSolutionPackage.PICK_UP_ENTRY__PICK_UP_LEG, oldPickUpLeg, pickUpLeg));
			}
		}
		return pickUpLeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentRecordEntry basicGetPickUpLeg() {
		return pickUpLeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPickUpLeg(ShipmentRecordEntry newPickUpLeg) {
		ShipmentRecordEntry oldPickUpLeg = pickUpLeg;
		pickUpLeg = newPickUpLeg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.PICK_UP_ENTRY__PICK_UP_LEG, oldPickUpLeg, pickUpLeg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogisticSolutionPackage.PICK_UP_ENTRY__PICK_UP_LEG:
				if (resolve) return getPickUpLeg();
				return basicGetPickUpLeg();
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
			case LogisticSolutionPackage.PICK_UP_ENTRY__PICK_UP_LEG:
				setPickUpLeg((ShipmentRecordEntry)newValue);
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
			case LogisticSolutionPackage.PICK_UP_ENTRY__PICK_UP_LEG:
				setPickUpLeg((ShipmentRecordEntry)null);
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
			case LogisticSolutionPackage.PICK_UP_ENTRY__PICK_UP_LEG:
				return pickUpLeg != null;
		}
		return super.eIsSet(featureID);
	}

} //PickUpEntryImpl
