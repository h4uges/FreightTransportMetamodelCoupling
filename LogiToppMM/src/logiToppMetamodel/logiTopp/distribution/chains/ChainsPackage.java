/**
 */
package logiToppMetamodel.logiTopp.distribution.chains;

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
 * @see logiToppMetamodel.logiTopp.distribution.chains.ChainsFactory
 * @model kind="package"
 * @generated
 */
public interface ChainsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chains";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/logiToppMetamodel/logiTopp/distribution/chains";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chains";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChainsPackage eINSTANCE = logiToppMetamodel.logiTopp.distribution.chains.impl.ChainsPackageImpl.init();

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.distribution.chains.impl.TransportChainImpl <em>Transport Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.distribution.chains.impl.TransportChainImpl
	 * @see logiToppMetamodel.logiTopp.distribution.chains.impl.ChainsPackageImpl#getTransportChain()
	 * @generated
	 */
	int TRANSPORT_CHAIN = 0;

	/**
	 * The feature id for the '<em><b>Hubs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CHAIN__HUBS = 0;

	/**
	 * The feature id for the '<em><b>Delivery Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CHAIN__DELIVERY_DIRECTION = 1;

	/**
	 * The number of structural features of the '<em>Transport Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CHAIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transport Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_CHAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.distribution.chains.impl.TimedTransportChainImpl <em>Timed Transport Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.distribution.chains.impl.TimedTransportChainImpl
	 * @see logiToppMetamodel.logiTopp.distribution.chains.impl.ChainsPackageImpl#getTimedTransportChain()
	 * @generated
	 */
	int TIMED_TRANSPORT_CHAIN = 1;

	/**
	 * The feature id for the '<em><b>Hubs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSPORT_CHAIN__HUBS = TRANSPORT_CHAIN__HUBS;

	/**
	 * The feature id for the '<em><b>Delivery Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSPORT_CHAIN__DELIVERY_DIRECTION = TRANSPORT_CHAIN__DELIVERY_DIRECTION;

	/**
	 * The feature id for the '<em><b>Departures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSPORT_CHAIN__DEPARTURES = TRANSPORT_CHAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Durations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSPORT_CHAIN__DURATIONS = TRANSPORT_CHAIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timed Transport Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSPORT_CHAIN_FEATURE_COUNT = TRANSPORT_CHAIN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Timed Transport Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSPORT_CHAIN_OPERATION_COUNT = TRANSPORT_CHAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.distribution.chains.impl.HubToDepartureImpl <em>Hub To Departure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.distribution.chains.impl.HubToDepartureImpl
	 * @see logiToppMetamodel.logiTopp.distribution.chains.impl.ChainsPackageImpl#getHubToDeparture()
	 * @generated
	 */
	int HUB_TO_DEPARTURE = 2;

	/**
	 * The feature id for the '<em><b>Hub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB_TO_DEPARTURE__HUB = 0;

	/**
	 * The feature id for the '<em><b>Depature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB_TO_DEPARTURE__DEPATURE = 1;

	/**
	 * The number of structural features of the '<em>Hub To Departure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB_TO_DEPARTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hub To Departure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB_TO_DEPARTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logiToppMetamodel.logiTopp.distribution.chains.impl.HubToDurationImpl <em>Hub To Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logiToppMetamodel.logiTopp.distribution.chains.impl.HubToDurationImpl
	 * @see logiToppMetamodel.logiTopp.distribution.chains.impl.ChainsPackageImpl#getHubToDuration()
	 * @generated
	 */
	int HUB_TO_DURATION = 3;

	/**
	 * The feature id for the '<em><b>Hub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB_TO_DURATION__HUB = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB_TO_DURATION__DURATION = 1;

	/**
	 * The number of structural features of the '<em>Hub To Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB_TO_DURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hub To Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB_TO_DURATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.distribution.chains.TransportChain <em>Transport Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Chain</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.TransportChain
	 * @generated
	 */
	EClass getTransportChain();

	/**
	 * Returns the meta object for the reference list '{@link logiToppMetamodel.logiTopp.distribution.chains.TransportChain#getHubs <em>Hubs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hubs</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.TransportChain#getHubs()
	 * @see #getTransportChain()
	 * @generated
	 */
	EReference getTransportChain_Hubs();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.distribution.chains.TransportChain#isDeliveryDirection <em>Delivery Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Direction</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.TransportChain#isDeliveryDirection()
	 * @see #getTransportChain()
	 * @generated
	 */
	EAttribute getTransportChain_DeliveryDirection();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.distribution.chains.TimedTransportChain <em>Timed Transport Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Transport Chain</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.TimedTransportChain
	 * @generated
	 */
	EClass getTimedTransportChain();

	/**
	 * Returns the meta object for the reference list '{@link logiToppMetamodel.logiTopp.distribution.chains.TimedTransportChain#getDepartures <em>Departures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Departures</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.TimedTransportChain#getDepartures()
	 * @see #getTimedTransportChain()
	 * @generated
	 */
	EReference getTimedTransportChain_Departures();

	/**
	 * Returns the meta object for the reference list '{@link logiToppMetamodel.logiTopp.distribution.chains.TimedTransportChain#getDurations <em>Durations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Durations</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.TimedTransportChain#getDurations()
	 * @see #getTimedTransportChain()
	 * @generated
	 */
	EReference getTimedTransportChain_Durations();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.distribution.chains.HubToDeparture <em>Hub To Departure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hub To Departure</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.HubToDeparture
	 * @generated
	 */
	EClass getHubToDeparture();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.distribution.chains.HubToDeparture#getHub <em>Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hub</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.HubToDeparture#getHub()
	 * @see #getHubToDeparture()
	 * @generated
	 */
	EReference getHubToDeparture_Hub();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.distribution.chains.HubToDeparture#getDepature <em>Depature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depature</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.HubToDeparture#getDepature()
	 * @see #getHubToDeparture()
	 * @generated
	 */
	EReference getHubToDeparture_Depature();

	/**
	 * Returns the meta object for class '{@link logiToppMetamodel.logiTopp.distribution.chains.HubToDuration <em>Hub To Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hub To Duration</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.HubToDuration
	 * @generated
	 */
	EClass getHubToDuration();

	/**
	 * Returns the meta object for the reference '{@link logiToppMetamodel.logiTopp.distribution.chains.HubToDuration#getHub <em>Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hub</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.HubToDuration#getHub()
	 * @see #getHubToDuration()
	 * @generated
	 */
	EReference getHubToDuration_Hub();

	/**
	 * Returns the meta object for the attribute '{@link logiToppMetamodel.logiTopp.distribution.chains.HubToDuration#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.HubToDuration#getDuration()
	 * @see #getHubToDuration()
	 * @generated
	 */
	EAttribute getHubToDuration_Duration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChainsFactory getChainsFactory();

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
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.distribution.chains.impl.TransportChainImpl <em>Transport Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.distribution.chains.impl.TransportChainImpl
		 * @see logiToppMetamodel.logiTopp.distribution.chains.impl.ChainsPackageImpl#getTransportChain()
		 * @generated
		 */
		EClass TRANSPORT_CHAIN = eINSTANCE.getTransportChain();

		/**
		 * The meta object literal for the '<em><b>Hubs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_CHAIN__HUBS = eINSTANCE.getTransportChain_Hubs();

		/**
		 * The meta object literal for the '<em><b>Delivery Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_CHAIN__DELIVERY_DIRECTION = eINSTANCE.getTransportChain_DeliveryDirection();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.distribution.chains.impl.TimedTransportChainImpl <em>Timed Transport Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.distribution.chains.impl.TimedTransportChainImpl
		 * @see logiToppMetamodel.logiTopp.distribution.chains.impl.ChainsPackageImpl#getTimedTransportChain()
		 * @generated
		 */
		EClass TIMED_TRANSPORT_CHAIN = eINSTANCE.getTimedTransportChain();

		/**
		 * The meta object literal for the '<em><b>Departures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_TRANSPORT_CHAIN__DEPARTURES = eINSTANCE.getTimedTransportChain_Departures();

		/**
		 * The meta object literal for the '<em><b>Durations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_TRANSPORT_CHAIN__DURATIONS = eINSTANCE.getTimedTransportChain_Durations();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.distribution.chains.impl.HubToDepartureImpl <em>Hub To Departure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.distribution.chains.impl.HubToDepartureImpl
		 * @see logiToppMetamodel.logiTopp.distribution.chains.impl.ChainsPackageImpl#getHubToDeparture()
		 * @generated
		 */
		EClass HUB_TO_DEPARTURE = eINSTANCE.getHubToDeparture();

		/**
		 * The meta object literal for the '<em><b>Hub</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUB_TO_DEPARTURE__HUB = eINSTANCE.getHubToDeparture_Hub();

		/**
		 * The meta object literal for the '<em><b>Depature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUB_TO_DEPARTURE__DEPATURE = eINSTANCE.getHubToDeparture_Depature();

		/**
		 * The meta object literal for the '{@link logiToppMetamodel.logiTopp.distribution.chains.impl.HubToDurationImpl <em>Hub To Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logiToppMetamodel.logiTopp.distribution.chains.impl.HubToDurationImpl
		 * @see logiToppMetamodel.logiTopp.distribution.chains.impl.ChainsPackageImpl#getHubToDuration()
		 * @generated
		 */
		EClass HUB_TO_DURATION = eINSTANCE.getHubToDuration();

		/**
		 * The meta object literal for the '<em><b>Hub</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUB_TO_DURATION__HUB = eINSTANCE.getHubToDuration_Hub();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUB_TO_DURATION__DURATION = eINSTANCE.getHubToDuration_Duration();

	}

} //ChainsPackage
