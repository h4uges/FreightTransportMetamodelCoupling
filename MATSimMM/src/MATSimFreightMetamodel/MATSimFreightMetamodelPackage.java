/**
 */
package MATSimFreightMetamodel;

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
 * @see MATSimFreightMetamodel.MATSimFreightMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MATSimFreightMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MATSimFreightMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/MATSimFreightMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MATSimFreightMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MATSimFreightMetamodelPackage eINSTANCE = MATSimFreightMetamodel.impl.MATSimFreightMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.impl.DataExchangeRootImpl <em>Data Exchange Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.impl.DataExchangeRootImpl
	 * @see MATSimFreightMetamodel.impl.MATSimFreightMetamodelPackageImpl#getDataExchangeRoot()
	 * @generated
	 */
	int DATA_EXCHANGE_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Carriers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_ROOT__CARRIERS = 0;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_ROOT__NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Vehicel Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_ROOT__VEHICEL_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_ROOT__POPULATION = 3;

	/**
	 * The number of structural features of the '<em>Data Exchange Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Exchange Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.DataExchangeRoot <em>Data Exchange Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Exchange Root</em>'.
	 * @see MATSimFreightMetamodel.DataExchangeRoot
	 * @generated
	 */
	EClass getDataExchangeRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.DataExchangeRoot#getCarriers <em>Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carriers</em>'.
	 * @see MATSimFreightMetamodel.DataExchangeRoot#getCarriers()
	 * @see #getDataExchangeRoot()
	 * @generated
	 */
	EReference getDataExchangeRoot_Carriers();

	/**
	 * Returns the meta object for the containment reference '{@link MATSimFreightMetamodel.DataExchangeRoot#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network</em>'.
	 * @see MATSimFreightMetamodel.DataExchangeRoot#getNetwork()
	 * @see #getDataExchangeRoot()
	 * @generated
	 */
	EReference getDataExchangeRoot_Network();

	/**
	 * Returns the meta object for the containment reference '{@link MATSimFreightMetamodel.DataExchangeRoot#getVehicelTypes <em>Vehicel Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicel Types</em>'.
	 * @see MATSimFreightMetamodel.DataExchangeRoot#getVehicelTypes()
	 * @see #getDataExchangeRoot()
	 * @generated
	 */
	EReference getDataExchangeRoot_VehicelTypes();

	/**
	 * Returns the meta object for the containment reference '{@link MATSimFreightMetamodel.DataExchangeRoot#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Population</em>'.
	 * @see MATSimFreightMetamodel.DataExchangeRoot#getPopulation()
	 * @see #getDataExchangeRoot()
	 * @generated
	 */
	EReference getDataExchangeRoot_Population();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MATSimFreightMetamodelFactory getMATSimFreightMetamodelFactory();

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
		 * The meta object literal for the '{@link MATSimFreightMetamodel.impl.DataExchangeRootImpl <em>Data Exchange Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.impl.DataExchangeRootImpl
		 * @see MATSimFreightMetamodel.impl.MATSimFreightMetamodelPackageImpl#getDataExchangeRoot()
		 * @generated
		 */
		EClass DATA_EXCHANGE_ROOT = eINSTANCE.getDataExchangeRoot();

		/**
		 * The meta object literal for the '<em><b>Carriers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXCHANGE_ROOT__CARRIERS = eINSTANCE.getDataExchangeRoot_Carriers();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXCHANGE_ROOT__NETWORK = eINSTANCE.getDataExchangeRoot_Network();

		/**
		 * The meta object literal for the '<em><b>Vehicel Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXCHANGE_ROOT__VEHICEL_TYPES = eINSTANCE.getDataExchangeRoot_VehicelTypes();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXCHANGE_ROOT__POPULATION = eINSTANCE.getDataExchangeRoot_Population();

	}

} //MATSimFreightMetamodelPackage
