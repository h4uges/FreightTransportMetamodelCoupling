/**
 */
package CommonFreightTransportMetamodel.logisticNetwork;

import CommonFreightTransportMetamodel.utils.TimeWindow_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.Shop#getOpeningHours <em>Opening Hours</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getShop()
 * @model
 * @generated
 */
public interface Shop extends PublicServicePoint {
	/**
	 * Returns the value of the '<em><b>Opening Hours</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.utils.TimeWindow_}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening Hours</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage#getShop_OpeningHours()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TimeWindow_> getOpeningHours();

} // Shop
