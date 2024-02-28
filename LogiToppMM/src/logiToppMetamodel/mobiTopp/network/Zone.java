/**
 */
package logiToppMetamodel.mobiTopp.network;

import logiToppMetamodel.base.NamedEntity;

import logiToppMetamodel.mobiTopp.citizens.Household;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TAZ
 * Verkehrszellen
 * 
 * --------------------
 * - AreaType
 * - RegionType
 * - ZoneClassificationType
 * - #parkingPlaces
 * - isDestination
 * - relief
 * - zoneProperties (Map)
 * 
 * - Attractivities: Map<ActivityType, Integer>
 * - ChargingData
 * - CarSharingData
 * - BikeSharingData
 * 
 * - PolulationData (-> List Households, #inhabitants) *
 * - OpportunityData (-> OppertunityLocations)
 * 
 * - totalArea *
 * - zoneAreasByLanduse: Map<String, ZoneArea> *
 * - intersectingEdges: List<Edge>
 * 
 * 
 * 
 * 
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.Zone#getCentroid <em>Centroid</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.Zone#getTotalArea <em>Total Area</em>}</li>
 *   <li>{@link logiToppMetamodel.mobiTopp.network.Zone#getHouseholds <em>Households</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getZone()
 * @model
 * @generated
 */
public interface Zone extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Centroid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centroid</em>' containment reference.
	 * @see #setCentroid(Location)
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getZone_Centroid()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location getCentroid();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.network.Zone#getCentroid <em>Centroid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centroid</em>' containment reference.
	 * @see #getCentroid()
	 * @generated
	 */
	void setCentroid(Location value);

	/**
	 * Returns the value of the '<em><b>Total Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Area</em>' containment reference.
	 * @see #setTotalArea(ZoneArea)
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getZone_TotalArea()
	 * @model containment="true"
	 * @generated
	 */
	ZoneArea getTotalArea();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.mobiTopp.network.Zone#getTotalArea <em>Total Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Area</em>' containment reference.
	 * @see #getTotalArea()
	 * @generated
	 */
	void setTotalArea(ZoneArea value);

	/**
	 * Returns the value of the '<em><b>Households</b></em>' reference list.
	 * The list contents are of type {@link logiToppMetamodel.mobiTopp.citizens.Household}.
	 * It is bidirectional and its opposite is '{@link logiToppMetamodel.mobiTopp.citizens.Household#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Households</em>' reference list.
	 * @see logiToppMetamodel.mobiTopp.network.NetworkPackage#getZone_Households()
	 * @see logiToppMetamodel.mobiTopp.citizens.Household#getZone
	 * @model opposite="zone"
	 * @generated
	 */
	EList<Household> getHouseholds();

} // Zone
