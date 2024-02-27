/**
 */
package logiToppMetamodel.mobiTopp.network.impl;

import logiToppMetamodel.mobiTopp.network.Edge;
import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.NetworkPackage;
import logiToppMetamodel.mobiTopp.network.Point2D;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.impl.LocationImpl#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.impl.LocationImpl#getRoadPosition <em>Road Position</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.impl.LocationImpl#getRoadAccessEdge <em>Road Access Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
	/**
	 * The cached value of the '{@link #getCoordinate() <em>Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinate()
	 * @generated
	 * @ordered
	 */
	protected Point2D coordinate;

	/**
	 * The default value of the '{@link #getRoadPosition() <em>Road Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoadPosition()
	 * @generated
	 * @ordered
	 */
	protected static final double ROAD_POSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRoadPosition() <em>Road Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoadPosition()
	 * @generated
	 * @ordered
	 */
	protected double roadPosition = ROAD_POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoadAccessEdge() <em>Road Access Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoadAccessEdge()
	 * @generated
	 * @ordered
	 */
	protected Edge roadAccessEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point2D getCoordinate() {
		return coordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinate(Point2D newCoordinate, NotificationChain msgs) {
		Point2D oldCoordinate = coordinate;
		coordinate = newCoordinate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetworkPackage.LOCATION__COORDINATE, oldCoordinate, newCoordinate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinate(Point2D newCoordinate) {
		if (newCoordinate != coordinate) {
			NotificationChain msgs = null;
			if (coordinate != null)
				msgs = ((InternalEObject)coordinate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetworkPackage.LOCATION__COORDINATE, null, msgs);
			if (newCoordinate != null)
				msgs = ((InternalEObject)newCoordinate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetworkPackage.LOCATION__COORDINATE, null, msgs);
			msgs = basicSetCoordinate(newCoordinate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LOCATION__COORDINATE, newCoordinate, newCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRoadPosition() {
		return roadPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoadPosition(double newRoadPosition) {
		double oldRoadPosition = roadPosition;
		roadPosition = newRoadPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LOCATION__ROAD_POSITION, oldRoadPosition, roadPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Edge getRoadAccessEdge() {
		if (roadAccessEdge != null && roadAccessEdge.eIsProxy()) {
			InternalEObject oldRoadAccessEdge = (InternalEObject)roadAccessEdge;
			roadAccessEdge = (Edge)eResolveProxy(oldRoadAccessEdge);
			if (roadAccessEdge != oldRoadAccessEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkPackage.LOCATION__ROAD_ACCESS_EDGE, oldRoadAccessEdge, roadAccessEdge));
			}
		}
		return roadAccessEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge basicGetRoadAccessEdge() {
		return roadAccessEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoadAccessEdge(Edge newRoadAccessEdge) {
		Edge oldRoadAccessEdge = roadAccessEdge;
		roadAccessEdge = newRoadAccessEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LOCATION__ROAD_ACCESS_EDGE, oldRoadAccessEdge, roadAccessEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkPackage.LOCATION__COORDINATE:
				return basicSetCoordinate(null, msgs);
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
			case NetworkPackage.LOCATION__COORDINATE:
				return getCoordinate();
			case NetworkPackage.LOCATION__ROAD_POSITION:
				return getRoadPosition();
			case NetworkPackage.LOCATION__ROAD_ACCESS_EDGE:
				if (resolve) return getRoadAccessEdge();
				return basicGetRoadAccessEdge();
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
			case NetworkPackage.LOCATION__COORDINATE:
				setCoordinate((Point2D)newValue);
				return;
			case NetworkPackage.LOCATION__ROAD_POSITION:
				setRoadPosition((Double)newValue);
				return;
			case NetworkPackage.LOCATION__ROAD_ACCESS_EDGE:
				setRoadAccessEdge((Edge)newValue);
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
			case NetworkPackage.LOCATION__COORDINATE:
				setCoordinate((Point2D)null);
				return;
			case NetworkPackage.LOCATION__ROAD_POSITION:
				setRoadPosition(ROAD_POSITION_EDEFAULT);
				return;
			case NetworkPackage.LOCATION__ROAD_ACCESS_EDGE:
				setRoadAccessEdge((Edge)null);
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
			case NetworkPackage.LOCATION__COORDINATE:
				return coordinate != null;
			case NetworkPackage.LOCATION__ROAD_POSITION:
				return roadPosition != ROAD_POSITION_EDEFAULT;
			case NetworkPackage.LOCATION__ROAD_ACCESS_EDGE:
				return roadAccessEdge != null;
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
		result.append(" (roadPosition: ");
		result.append(roadPosition);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
