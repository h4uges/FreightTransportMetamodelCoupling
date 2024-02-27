/**
 */
package MATSimFreightMetamodel.matsim.vehicles.impl;

import MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity;
import MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Capacity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleCapacityImpl#getSeats <em>Seats</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleCapacityImpl#getStandingRoom <em>Standing Room</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleCapacityImpl#getVolumeInCubicMeters <em>Volume In Cubic Meters</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleCapacityImpl#getWeightInTons <em>Weight In Tons</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleCapacityImpl#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleCapacityImpl extends MinimalEObjectImpl.Container implements VehicleCapacity {
	/**
	 * The default value of the '{@link #getSeats() <em>Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeats()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeats() <em>Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeats()
	 * @generated
	 * @ordered
	 */
	protected int seats = SEATS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandingRoom() <em>Standing Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandingRoom()
	 * @generated
	 * @ordered
	 */
	protected static final int STANDING_ROOM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStandingRoom() <em>Standing Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandingRoom()
	 * @generated
	 * @ordered
	 */
	protected int standingRoom = STANDING_ROOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolumeInCubicMeters() <em>Volume In Cubic Meters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeInCubicMeters()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLUME_IN_CUBIC_METERS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVolumeInCubicMeters() <em>Volume In Cubic Meters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeInCubicMeters()
	 * @generated
	 * @ordered
	 */
	protected double volumeInCubicMeters = VOLUME_IN_CUBIC_METERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeightInTons() <em>Weight In Tons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightInTons()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_IN_TONS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeightInTons() <em>Weight In Tons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightInTons()
	 * @generated
	 * @ordered
	 */
	protected double weightInTons = WEIGHT_IN_TONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected static final double OTHER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOther() <em>Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected double other = OTHER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleCapacityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VehiclesPackage.Literals.VEHICLE_CAPACITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSeats() {
		return seats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeats(int newSeats) {
		int oldSeats = seats;
		seats = newSeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclesPackage.VEHICLE_CAPACITY__SEATS, oldSeats, seats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStandingRoom() {
		return standingRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandingRoom(int newStandingRoom) {
		int oldStandingRoom = standingRoom;
		standingRoom = newStandingRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclesPackage.VEHICLE_CAPACITY__STANDING_ROOM, oldStandingRoom, standingRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getVolumeInCubicMeters() {
		return volumeInCubicMeters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolumeInCubicMeters(double newVolumeInCubicMeters) {
		double oldVolumeInCubicMeters = volumeInCubicMeters;
		volumeInCubicMeters = newVolumeInCubicMeters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclesPackage.VEHICLE_CAPACITY__VOLUME_IN_CUBIC_METERS, oldVolumeInCubicMeters, volumeInCubicMeters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWeightInTons() {
		return weightInTons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightInTons(double newWeightInTons) {
		double oldWeightInTons = weightInTons;
		weightInTons = newWeightInTons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclesPackage.VEHICLE_CAPACITY__WEIGHT_IN_TONS, oldWeightInTons, weightInTons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOther() {
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOther(double newOther) {
		double oldOther = other;
		other = newOther;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclesPackage.VEHICLE_CAPACITY__OTHER, oldOther, other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VehiclesPackage.VEHICLE_CAPACITY__SEATS:
				return getSeats();
			case VehiclesPackage.VEHICLE_CAPACITY__STANDING_ROOM:
				return getStandingRoom();
			case VehiclesPackage.VEHICLE_CAPACITY__VOLUME_IN_CUBIC_METERS:
				return getVolumeInCubicMeters();
			case VehiclesPackage.VEHICLE_CAPACITY__WEIGHT_IN_TONS:
				return getWeightInTons();
			case VehiclesPackage.VEHICLE_CAPACITY__OTHER:
				return getOther();
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
			case VehiclesPackage.VEHICLE_CAPACITY__SEATS:
				setSeats((Integer)newValue);
				return;
			case VehiclesPackage.VEHICLE_CAPACITY__STANDING_ROOM:
				setStandingRoom((Integer)newValue);
				return;
			case VehiclesPackage.VEHICLE_CAPACITY__VOLUME_IN_CUBIC_METERS:
				setVolumeInCubicMeters((Double)newValue);
				return;
			case VehiclesPackage.VEHICLE_CAPACITY__WEIGHT_IN_TONS:
				setWeightInTons((Double)newValue);
				return;
			case VehiclesPackage.VEHICLE_CAPACITY__OTHER:
				setOther((Double)newValue);
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
			case VehiclesPackage.VEHICLE_CAPACITY__SEATS:
				setSeats(SEATS_EDEFAULT);
				return;
			case VehiclesPackage.VEHICLE_CAPACITY__STANDING_ROOM:
				setStandingRoom(STANDING_ROOM_EDEFAULT);
				return;
			case VehiclesPackage.VEHICLE_CAPACITY__VOLUME_IN_CUBIC_METERS:
				setVolumeInCubicMeters(VOLUME_IN_CUBIC_METERS_EDEFAULT);
				return;
			case VehiclesPackage.VEHICLE_CAPACITY__WEIGHT_IN_TONS:
				setWeightInTons(WEIGHT_IN_TONS_EDEFAULT);
				return;
			case VehiclesPackage.VEHICLE_CAPACITY__OTHER:
				setOther(OTHER_EDEFAULT);
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
			case VehiclesPackage.VEHICLE_CAPACITY__SEATS:
				return seats != SEATS_EDEFAULT;
			case VehiclesPackage.VEHICLE_CAPACITY__STANDING_ROOM:
				return standingRoom != STANDING_ROOM_EDEFAULT;
			case VehiclesPackage.VEHICLE_CAPACITY__VOLUME_IN_CUBIC_METERS:
				return volumeInCubicMeters != VOLUME_IN_CUBIC_METERS_EDEFAULT;
			case VehiclesPackage.VEHICLE_CAPACITY__WEIGHT_IN_TONS:
				return weightInTons != WEIGHT_IN_TONS_EDEFAULT;
			case VehiclesPackage.VEHICLE_CAPACITY__OTHER:
				return other != OTHER_EDEFAULT;
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
		result.append(" (seats: ");
		result.append(seats);
		result.append(", standingRoom: ");
		result.append(standingRoom);
		result.append(", volumeInCubicMeters: ");
		result.append(volumeInCubicMeters);
		result.append(", weightInTons: ");
		result.append(weightInTons);
		result.append(", other: ");
		result.append(other);
		result.append(')');
		return result.toString();
	}

} //VehicleCapacityImpl
