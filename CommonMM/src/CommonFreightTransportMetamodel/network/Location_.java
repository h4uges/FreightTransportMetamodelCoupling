/**
 */
package CommonFreightTransportMetamodel.network;

import CommonFreightTransportMetamodel.utils.Coordinate;
import CommonFreightTransportMetamodel.utils.HasId_;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.network.Location_#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.network.Location_#getNetworkAccess <em>Network Access</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.network.NetworkPackage#getLocation_()
 * @model
 * @generated
 */
public interface Location_ extends HasId_ {
	/**
	 * Returns the value of the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate</em>' containment reference.
	 * @see #setCoordinate(Coordinate)
	 * @see CommonFreightTransportMetamodel.network.NetworkPackage#getLocation__Coordinate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coordinate getCoordinate();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.network.Location_#getCoordinate <em>Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate</em>' containment reference.
	 * @see #getCoordinate()
	 * @generated
	 */
	void setCoordinate(Coordinate value);

	/**
	 * Returns the value of the '<em><b>Network Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Access</em>' containment reference.
	 * @see #setNetworkAccess(NetworkAccess)
	 * @see CommonFreightTransportMetamodel.network.NetworkPackage#getLocation__NetworkAccess()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NetworkAccess getNetworkAccess();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.network.Location_#getNetworkAccess <em>Network Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Access</em>' containment reference.
	 * @see #getNetworkAccess()
	 * @generated
	 */
	void setNetworkAccess(NetworkAccess value);

} // Location_
