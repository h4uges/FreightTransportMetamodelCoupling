/**
 */
package logiToppMetamodel.mobiTopp.network;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Road Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.RoadNetwork#getZones <em>Zones</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getRoadNetwork()
 * @model
 * @generated
 */
public interface RoadNetwork extends Graph {
	/**
	 * Returns the value of the '<em><b>Zones</b></em>' containment reference list.
	 * The list contents are of type {@link logiToppMetamodel.mobiTopp.network.Zone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zones</em>' containment reference list.
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getRoadNetwork_Zones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Zone> getZones();

} // RoadNetwork
