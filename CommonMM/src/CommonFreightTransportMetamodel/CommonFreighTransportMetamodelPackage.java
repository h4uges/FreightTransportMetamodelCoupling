/**
 */
package CommonFreightTransportMetamodel;

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
 * @see CommonFreightTransportMetamodel.CommonFreighTransportMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface CommonFreighTransportMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CommonFreightTransportMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/commonFreightTransportMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "commonFreightTransportMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonFreighTransportMetamodelPackage eINSTANCE = CommonFreightTransportMetamodel.impl.CommonFreighTransportMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link CommonFreightTransportMetamodel.impl.CommonFreightTransportMetamodelRootImpl <em>Common Freight Transport Metamodel Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CommonFreightTransportMetamodel.impl.CommonFreightTransportMetamodelRootImpl
	 * @see CommonFreightTransportMetamodel.impl.CommonFreighTransportMetamodelPackageImpl#getCommonFreightTransportMetamodelRoot()
	 * @generated
	 */
	int COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Population</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION = 1;

	/**
	 * The feature id for the '<em><b>Logistic Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK = 2;

	/**
	 * The feature id for the '<em><b>Demand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND = 3;

	/**
	 * The feature id for the '<em><b>Logistic Solution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION = 4;

	/**
	 * The number of structural features of the '<em>Common Freight Transport Metamodel Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Common Freight Transport Metamodel Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link CommonFreightTransportMetamodel.CommonFreightTransportMetamodelRoot <em>Common Freight Transport Metamodel Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Freight Transport Metamodel Root</em>'.
	 * @see CommonFreightTransportMetamodel.CommonFreightTransportMetamodelRoot
	 * @generated
	 */
	EClass getCommonFreightTransportMetamodelRoot();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.CommonFreightTransportMetamodelRoot#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network</em>'.
	 * @see CommonFreightTransportMetamodel.CommonFreightTransportMetamodelRoot#getNetwork()
	 * @see #getCommonFreightTransportMetamodelRoot()
	 * @generated
	 */
	EReference getCommonFreightTransportMetamodelRoot_Network();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.CommonFreightTransportMetamodelRoot#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Population</em>'.
	 * @see CommonFreightTransportMetamodel.CommonFreightTransportMetamodelRoot#getPopulation()
	 * @see #getCommonFreightTransportMetamodelRoot()
	 * @generated
	 */
	EReference getCommonFreightTransportMetamodelRoot_Population();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.CommonFreightTransportMetamodelRoot#getLogisticNetwork <em>Logistic Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logistic Network</em>'.
	 * @see CommonFreightTransportMetamodel.CommonFreightTransportMetamodelRoot#getLogisticNetwork()
	 * @see #getCommonFreightTransportMetamodelRoot()
	 * @generated
	 */
	EReference getCommonFreightTransportMetamodelRoot_LogisticNetwork();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.CommonFreightTransportMetamodelRoot#getDemand <em>Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Demand</em>'.
	 * @see CommonFreightTransportMetamodel.CommonFreightTransportMetamodelRoot#getDemand()
	 * @see #getCommonFreightTransportMetamodelRoot()
	 * @generated
	 */
	EReference getCommonFreightTransportMetamodelRoot_Demand();

	/**
	 * Returns the meta object for the containment reference '{@link CommonFreightTransportMetamodel.CommonFreightTransportMetamodelRoot#getLogisticSolution <em>Logistic Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logistic Solution</em>'.
	 * @see CommonFreightTransportMetamodel.CommonFreightTransportMetamodelRoot#getLogisticSolution()
	 * @see #getCommonFreightTransportMetamodelRoot()
	 * @generated
	 */
	EReference getCommonFreightTransportMetamodelRoot_LogisticSolution();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFreighTransportMetamodelFactory getCommonFreighTransportMetamodelFactory();

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
		 * The meta object literal for the '{@link CommonFreightTransportMetamodel.impl.CommonFreightTransportMetamodelRootImpl <em>Common Freight Transport Metamodel Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CommonFreightTransportMetamodel.impl.CommonFreightTransportMetamodelRootImpl
		 * @see CommonFreightTransportMetamodel.impl.CommonFreighTransportMetamodelPackageImpl#getCommonFreightTransportMetamodelRoot()
		 * @generated
		 */
		EClass COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT = eINSTANCE.getCommonFreightTransportMetamodelRoot();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__NETWORK = eINSTANCE.getCommonFreightTransportMetamodelRoot_Network();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__POPULATION = eINSTANCE.getCommonFreightTransportMetamodelRoot_Population();

		/**
		 * The meta object literal for the '<em><b>Logistic Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_NETWORK = eINSTANCE.getCommonFreightTransportMetamodelRoot_LogisticNetwork();

		/**
		 * The meta object literal for the '<em><b>Demand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__DEMAND = eINSTANCE.getCommonFreightTransportMetamodelRoot_Demand();

		/**
		 * The meta object literal for the '<em><b>Logistic Solution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_FREIGHT_TRANSPORT_METAMODEL_ROOT__LOGISTIC_SOLUTION = eINSTANCE.getCommonFreightTransportMetamodelRoot_LogisticSolution();

	}

} //CommonFreighTransportMetamodelPackage
