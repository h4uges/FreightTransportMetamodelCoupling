/**
 */
package logiToppMetamodel.logiTopp;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see logiToppMetamodel.logiTopp.LogiToppFactory
 * @model kind="package"
 * @generated
 */
public interface LogiToppPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logiTopp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/logiToppMetamodel/logiTopp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logiTopp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogiToppPackage eINSTANCE = logiToppMetamodel.logiTopp.impl.LogiToppPackageImpl.init();

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.impl.ParcelAgentImpl <em>Parcel Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.impl.ParcelAgentImpl
	 * @see logiToppMetamodel.logiTopp.impl.LogiToppPackageImpl#getParcelAgent()
	 * @generated
	 */
	int PARCEL_AGENT = 0;

	/**
	 * The number of structural features of the '<em>Parcel Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_AGENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parcel Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.impl.ParcelProducerImpl <em>Parcel Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.impl.ParcelProducerImpl
	 * @see logiToppMetamodel.logiTopp.impl.LogiToppPackageImpl#getParcelProducer()
	 * @generated
	 */
	int PARCEL_PRODUCER = 1;

	/**
	 * The number of structural features of the '<em>Parcel Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_PRODUCER_FEATURE_COUNT = PARCEL_AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parcel Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_PRODUCER_OPERATION_COUNT = PARCEL_AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.impl.ParcelConsumerImpl <em>Parcel Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.impl.ParcelConsumerImpl
	 * @see logiToppMetamodel.logiTopp.impl.LogiToppPackageImpl#getParcelConsumer()
	 * @generated
	 */
	int PARCEL_CONSUMER = 2;

	/**
	 * The number of structural features of the '<em>Parcel Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_CONSUMER_FEATURE_COUNT = PARCEL_AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parcel Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_CONSUMER_OPERATION_COUNT = PARCEL_AGENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.ParcelAgent <em>Parcel Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parcel Agent</em>'.
	 * @see logiToppMetamodel.logiTopp.ParcelAgent
	 * @generated
	 */
	EClass getParcelAgent();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.ParcelProducer <em>Parcel Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parcel Producer</em>'.
	 * @see logiToppMetamodel.logiTopp.ParcelProducer
	 * @generated
	 */
	EClass getParcelProducer();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.ParcelConsumer <em>Parcel Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parcel Consumer</em>'.
	 * @see logiToppMetamodel.logiTopp.ParcelConsumer
	 * @generated
	 */
	EClass getParcelConsumer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogiToppFactory getLogiToppFactory();

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
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.impl.ParcelAgentImpl <em>Parcel Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.impl.ParcelAgentImpl
		 * @see logiToppMetamodel.logiTopp.impl.LogiToppPackageImpl#getParcelAgent()
		 * @generated
		 */
		EClass PARCEL_AGENT = eINSTANCE.getParcelAgent();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.impl.ParcelProducerImpl <em>Parcel Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.impl.ParcelProducerImpl
		 * @see logiToppMetamodel.logiTopp.impl.LogiToppPackageImpl#getParcelProducer()
		 * @generated
		 */
		EClass PARCEL_PRODUCER = eINSTANCE.getParcelProducer();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.impl.ParcelConsumerImpl <em>Parcel Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.impl.ParcelConsumerImpl
		 * @see logiToppMetamodel.logiTopp.impl.LogiToppPackageImpl#getParcelConsumer()
		 * @generated
		 */
		EClass PARCEL_CONSUMER = eINSTANCE.getParcelConsumer();

	}

} //LogiToppPackage
