/**
 */
package logiToppMetamodel.logiTopp.distribution.region;

import logiToppMetamodel.mobiTopp.network.Zone;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.region.ServiceArea#getZones <em>Zones</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.logiTopp.distribution.region.RegionPackage#getServiceArea()
 * @model
 * @generated
 */
public interface ServiceArea extends EObject {
	/**
	 * Returns the value of the '<em><b>Zones</b></em>' reference list.
	 * The list contents are of type {@link logiToppMetamodel.mobiTopp.network.Zone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zones</em>' reference list.
	 * @see logiToppMetamodel.logiTopp.distribution.region.RegionPackage#getServiceArea_Zones()
	 * @model
	 * @generated
	 */
	EList<Zone> getZones();

} // ServiceArea
