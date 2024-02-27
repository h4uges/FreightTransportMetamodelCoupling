/**
 */
package logiToppMetamodel.logiTopp.distribution.region;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.distribution.region.RegionFactory
 * @model kind="package"
 * @generated
 */
public interface RegionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "region";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/logiToppMetamodel/logiTopp/distribution/region";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "region";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RegionPackage eINSTANCE = logiToppMetamodel.logiTopp.distribution.region.impl.RegionPackageImpl.init();

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.distribution.region.impl.RegionalReachImpl <em>Regional Reach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.distribution.region.impl.RegionalReachImpl
	 * @see logiToppMetamodel.logiTopp.distribution.region.impl.RegionPackageImpl#getRegionalReach()
	 * @generated
	 */
	int REGIONAL_REACH = 0;

	/**
	 * The feature id for the '<em><b>Service Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_REACH__SERVICE_AREA = 0;

	/**
	 * The feature id for the '<em><b>Related Delivery Hubs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_REACH__RELATED_DELIVERY_HUBS = 1;

	/**
	 * The feature id for the '<em><b>Related Pick Up Hubs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_REACH__RELATED_PICK_UP_HUBS = 2;

	/**
	 * The number of structural features of the '<em>Regional Reach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_REACH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Regional Reach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_REACH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.distribution.region.impl.ServiceAreaImpl <em>Service Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.distribution.region.impl.ServiceAreaImpl
	 * @see logiToppMetamodel.logiTopp.distribution.region.impl.RegionPackageImpl#getServiceArea()
	 * @generated
	 */
	int SERVICE_AREA = 1;

	/**
	 * The feature id for the '<em><b>Zones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_AREA__ZONES = 0;

	/**
	 * The number of structural features of the '<em>Service Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_AREA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_AREA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.distribution.region.RegionalReach <em>Regional Reach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regional Reach</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.region.RegionalReach
	 * @generated
	 */
	EClass getRegionalReach();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.logiTopp.distribution.region.RegionalReach#getServiceArea <em>Service Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Area</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.region.RegionalReach#getServiceArea()
	 * @see #getRegionalReach()
	 * @generated
	 */
	EReference getRegionalReach_ServiceArea();

	/**
	 * Returns the meta object for the reference list '{@link logiToppMetamodel.logiTopp.distribution.region.RegionalReach#getRelatedDeliveryHubs <em>Related Delivery Hubs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Delivery Hubs</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.region.RegionalReach#getRelatedDeliveryHubs()
	 * @see #getRegionalReach()
	 * @generated
	 */
	EReference getRegionalReach_RelatedDeliveryHubs();

	/**
	 * Returns the meta object for the reference list '{@link logiToppMetamodel.logiTopp.distribution.region.RegionalReach#getRelatedPickUpHubs <em>Related Pick Up Hubs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Pick Up Hubs</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.region.RegionalReach#getRelatedPickUpHubs()
	 * @see #getRegionalReach()
	 * @generated
	 */
	EReference getRegionalReach_RelatedPickUpHubs();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.distribution.region.ServiceArea <em>Service Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Area</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.region.ServiceArea
	 * @generated
	 */
	EClass getServiceArea();

	/**
	 * Returns the meta object for the reference list '{@link logiToppMetamodel.logiTopp.distribution.region.ServiceArea#getZones <em>Zones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Zones</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.region.ServiceArea#getZones()
	 * @see #getServiceArea()
	 * @generated
	 */
	EReference getServiceArea_Zones();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RegionFactory getRegionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.distribution.region.impl.RegionalReachImpl <em>Regional Reach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.distribution.region.impl.RegionalReachImpl
		 * @see logiToppMetamodel.logiTopp.distribution.region.impl.RegionPackageImpl#getRegionalReach()
		 * @generated
		 */
		EClass REGIONAL_REACH = eINSTANCE.getRegionalReach();

		/**
		 * The meta object literal for the '<em><b>Service Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_REACH__SERVICE_AREA = eINSTANCE.getRegionalReach_ServiceArea();

		/**
		 * The meta object literal for the '<em><b>Related Delivery Hubs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_REACH__RELATED_DELIVERY_HUBS = eINSTANCE.getRegionalReach_RelatedDeliveryHubs();

		/**
		 * The meta object literal for the '<em><b>Related Pick Up Hubs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_REACH__RELATED_PICK_UP_HUBS = eINSTANCE.getRegionalReach_RelatedPickUpHubs();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.distribution.region.impl.ServiceAreaImpl <em>Service Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.distribution.region.impl.ServiceAreaImpl
		 * @see logiToppMetamodel.logiTopp.distribution.region.impl.RegionPackageImpl#getServiceArea()
		 * @generated
		 */
		EClass SERVICE_AREA = eINSTANCE.getServiceArea();

		/**
		 * The meta object literal for the '<em><b>Zones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_AREA__ZONES = eINSTANCE.getServiceArea_Zones();

	}

} //RegionPackage
