/**
 */
package logiToppMetamodel.logiTopp.distribution.region;

import logiToppMetamodel.logiTopp.distribution.DistributionCenter;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regional Reach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.region.RegionalReach#getServiceArea <em>Service Area</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.region.RegionalReach#getRelatedDeliveryHubs <em>Related Delivery Hubs</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.region.RegionalReach#getRelatedPickUpHubs <em>Related Pick Up Hubs</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.logiTopp.distribution.region.RegionPackage#getRegionalReach()
 * @model
 * @generated
 */
public interface RegionalReach extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Area</em>' containment reference.
	 * @see #setServiceArea(ServiceArea)
	 * @see logiToppMetamodel.logiTopp.distribution.region.RegionPackage#getRegionalReach_ServiceArea()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServiceArea getServiceArea();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.logiTopp.distribution.region.RegionalReach#getServiceArea <em>Service Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Area</em>' containment reference.
	 * @see #getServiceArea()
	 * @generated
	 */
	void setServiceArea(ServiceArea value);

	/**
	 * Returns the value of the '<em><b>Related Delivery Hubs</b></em>' reference list.
	 * The list contents are of type {@link logiToppMetamodel.logiTopp.distribution.DistributionCenter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Delivery Hubs</em>' reference list.
	 * @see logiToppMetamodel.logiTopp.distribution.region.RegionPackage#getRegionalReach_RelatedDeliveryHubs()
	 * @model
	 * @generated
	 */
	EList<DistributionCenter> getRelatedDeliveryHubs();

	/**
	 * Returns the value of the '<em><b>Related Pick Up Hubs</b></em>' reference list.
	 * The list contents are of type {@link logiToppMetamodel.logiTopp.distribution.DistributionCenter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Pick Up Hubs</em>' reference list.
	 * @see logiToppMetamodel.logiTopp.distribution.region.RegionPackage#getRegionalReach_RelatedPickUpHubs()
	 * @model
	 * @generated
	 */
	EList<DistributionCenter> getRelatedPickUpHubs();

} // RegionalReach
