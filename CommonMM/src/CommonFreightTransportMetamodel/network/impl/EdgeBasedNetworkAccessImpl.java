/**
 */
package CommonFreightTransportMetamodel.network.impl;

import CommonFreightTransportMetamodel.network.Edge;
import CommonFreightTransportMetamodel.network.EdgeBasedNetworkAccess;
import CommonFreightTransportMetamodel.network.NetworkPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Based Network Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.network.impl.EdgeBasedNetworkAccessImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.network.impl.EdgeBasedNetworkAccessImpl#getEdgePosition <em>Edge Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeBasedNetworkAccessImpl extends NetworkAccessImpl implements EdgeBasedNetworkAccess {
	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected Edge edge;

	/**
	 * The default value of the '{@link #getEdgePosition() <em>Edge Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgePosition()
	 * @generated
	 * @ordered
	 */
	protected static final double EDGE_POSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEdgePosition() <em>Edge Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgePosition()
	 * @generated
	 * @ordered
	 */
	protected double edgePosition = EDGE_POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeBasedNetworkAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkPackage.Literals.EDGE_BASED_NETWORK_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Edge getEdge() {
		if (edge != null && edge.eIsProxy()) {
			InternalEObject oldEdge = (InternalEObject)edge;
			edge = (Edge)eResolveProxy(oldEdge);
			if (edge != oldEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkPackage.EDGE_BASED_NETWORK_ACCESS__EDGE, oldEdge, edge));
			}
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge basicGetEdge() {
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEdge(Edge newEdge) {
		Edge oldEdge = edge;
		edge = newEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.EDGE_BASED_NETWORK_ACCESS__EDGE, oldEdge, edge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEdgePosition() {
		return edgePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEdgePosition(double newEdgePosition) {
		double oldEdgePosition = edgePosition;
		edgePosition = newEdgePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.EDGE_BASED_NETWORK_ACCESS__EDGE_POSITION, oldEdgePosition, edgePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkPackage.EDGE_BASED_NETWORK_ACCESS__EDGE:
				if (resolve) return getEdge();
				return basicGetEdge();
			case NetworkPackage.EDGE_BASED_NETWORK_ACCESS__EDGE_POSITION:
				return getEdgePosition();
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
			case NetworkPackage.EDGE_BASED_NETWORK_ACCESS__EDGE:
				setEdge((Edge)newValue);
				return;
			case NetworkPackage.EDGE_BASED_NETWORK_ACCESS__EDGE_POSITION:
				setEdgePosition((Double)newValue);
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
			case NetworkPackage.EDGE_BASED_NETWORK_ACCESS__EDGE:
				setEdge((Edge)null);
				return;
			case NetworkPackage.EDGE_BASED_NETWORK_ACCESS__EDGE_POSITION:
				setEdgePosition(EDGE_POSITION_EDEFAULT);
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
			case NetworkPackage.EDGE_BASED_NETWORK_ACCESS__EDGE:
				return edge != null;
			case NetworkPackage.EDGE_BASED_NETWORK_ACCESS__EDGE_POSITION:
				return edgePosition != EDGE_POSITION_EDEFAULT;
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
		result.append(" (edgePosition: ");
		result.append(edgePosition);
		result.append(')');
		return result.toString();
	}

} //EdgeBasedNetworkAccessImpl
