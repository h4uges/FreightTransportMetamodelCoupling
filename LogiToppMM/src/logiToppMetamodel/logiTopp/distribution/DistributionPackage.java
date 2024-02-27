/**
 */
package logiToppMetamodel.logiTopp.distribution;

import logiToppMetamodel.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see logiToppMetamodel.logiTopp.distribution.DistributionFactory
 * @model kind="package"
 * @generated
 */
public interface DistributionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "distribution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/logiToppMetamodel/logiTopp/distribution";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "distribution";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DistributionPackage eINSTANCE = logiToppMetamodel.logiTopp.distribution.impl.DistributionPackageImpl.init();

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.distribution.impl.CEPServiceProviderImpl <em>CEP Service Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.distribution.impl.CEPServiceProviderImpl
	 * @see logiToppMetamodel.logiTopp.distribution.impl.DistributionPackageImpl#getCEPServiceProvider()
	 * @generated
	 */
	int CEP_SERVICE_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEP_SERVICE_PROVIDER__ID = BasePackage.NAMED_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEP_SERVICE_PROVIDER__NAME = BasePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Distribution Centers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEP_SERVICE_PROVIDER__DISTRIBUTION_CENTERS = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CEP Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEP_SERVICE_PROVIDER_FEATURE_COUNT = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CEP Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEP_SERVICE_PROVIDER_OPERATION_COUNT = BasePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.distribution.impl.DistributionCenterImpl <em>Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.distribution.impl.DistributionCenterImpl
	 * @see logiToppMetamodel.logiTopp.distribution.impl.DistributionPackageImpl#getDistributionCenter()
	 * @generated
	 */
	int DISTRIBUTION_CENTER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_CENTER__ID = BasePackage.NAMED_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_CENTER__NAME = BasePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_CENTER__ZONE = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_CENTER__LOCATION = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_CENTER__ATTEMPTS = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fleet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_CENTER__FLEET = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Regional Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_CENTER__REGIONAL_STRUCTURE = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CEPSP</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_CENTER__CEPSP = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_CENTER_FEATURE_COUNT = BasePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_CENTER_OPERATION_COUNT = BasePackage.NAMED_ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.distribution.CEPServiceProvider <em>CEP Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CEP Service Provider</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.CEPServiceProvider
	 * @generated
	 */
	EClass getCEPServiceProvider();

	/**
	 * Returns the meta object for the containment reference list '{@link logiToppMetamodel.logiTopp.distribution.CEPServiceProvider#getDistributionCenters <em>Distribution Centers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Distribution Centers</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.CEPServiceProvider#getDistributionCenters()
	 * @see #getCEPServiceProvider()
	 * @generated
	 */
	EReference getCEPServiceProvider_DistributionCenters();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Center</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.DistributionCenter
	 * @generated
	 */
	EClass getDistributionCenter();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zone</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.DistributionCenter#getZone()
	 * @see #getDistributionCenter()
	 * @generated
	 */
	EReference getDistributionCenter_Zone();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.DistributionCenter#getLocation()
	 * @see #getDistributionCenter()
	 * @generated
	 */
	EReference getDistributionCenter_Location();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getAttempts <em>Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attempts</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.DistributionCenter#getAttempts()
	 * @see #getDistributionCenter()
	 * @generated
	 */
	EAttribute getDistributionCenter_Attempts();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getFleet <em>Fleet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fleet</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.DistributionCenter#getFleet()
	 * @see #getDistributionCenter()
	 * @generated
	 */
	EReference getDistributionCenter_Fleet();

	/**
	 * Returns the meta object for the containment reference '{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getRegionalStructure <em>Regional Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regional Structure</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.DistributionCenter#getRegionalStructure()
	 * @see #getDistributionCenter()
	 * @generated
	 */
	EReference getDistributionCenter_RegionalStructure();

	/**
	 * Returns the meta object for the container reference '{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getCEPSP <em>CEPSP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>CEPSP</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.DistributionCenter#getCEPSP()
	 * @see #getDistributionCenter()
	 * @generated
	 */
	EReference getDistributionCenter_CEPSP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DistributionFactory getDistributionFactory();

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
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.distribution.impl.CEPServiceProviderImpl <em>CEP Service Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.distribution.impl.CEPServiceProviderImpl
		 * @see logiToppMetamodel.logiTopp.distribution.impl.DistributionPackageImpl#getCEPServiceProvider()
		 * @generated
		 */
		EClass CEP_SERVICE_PROVIDER = eINSTANCE.getCEPServiceProvider();

		/**
		 * The meta object literal for the '<em><b>Distribution Centers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEP_SERVICE_PROVIDER__DISTRIBUTION_CENTERS = eINSTANCE.getCEPServiceProvider_DistributionCenters();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.distribution.impl.DistributionCenterImpl <em>Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.distribution.impl.DistributionCenterImpl
		 * @see logiToppMetamodel.logiTopp.distribution.impl.DistributionPackageImpl#getDistributionCenter()
		 * @generated
		 */
		EClass DISTRIBUTION_CENTER = eINSTANCE.getDistributionCenter();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_CENTER__ZONE = eINSTANCE.getDistributionCenter_Zone();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_CENTER__LOCATION = eINSTANCE.getDistributionCenter_Location();

		/**
		 * The meta object literal for the '<em><b>Attempts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRIBUTION_CENTER__ATTEMPTS = eINSTANCE.getDistributionCenter_Attempts();

		/**
		 * The meta object literal for the '<em><b>Fleet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_CENTER__FLEET = eINSTANCE.getDistributionCenter_Fleet();

		/**
		 * The meta object literal for the '<em><b>Regional Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_CENTER__REGIONAL_STRUCTURE = eINSTANCE.getDistributionCenter_RegionalStructure();

		/**
		 * The meta object literal for the '<em><b>CEPSP</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTRIBUTION_CENTER__CEPSP = eINSTANCE.getDistributionCenter_CEPSP();

	}

} //DistributionPackage
