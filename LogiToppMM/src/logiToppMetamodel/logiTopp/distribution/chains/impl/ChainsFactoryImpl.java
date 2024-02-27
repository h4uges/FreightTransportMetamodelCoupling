/**
 */
package logiToppMetamodel.logiTopp.distribution.chains.impl;

import logiToppMetamodel.logiTopp.distribution.chains.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChainsFactoryImpl extends EFactoryImpl implements ChainsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChainsFactory init() {
		try {
			ChainsFactory theChainsFactory = (ChainsFactory)EPackage.Registry.INSTANCE.getEFactory(ChainsPackage.eNS_URI);
			if (theChainsFactory != null) {
				return theChainsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChainsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ChainsPackage.TRANSPORT_CHAIN: return createTransportChain();
			case ChainsPackage.TIMED_TRANSPORT_CHAIN: return createTimedTransportChain();
			case ChainsPackage.HUB_TO_DEPARTURE: return createHubToDeparture();
			case ChainsPackage.HUB_TO_DURATION: return createHubToDuration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransportChain createTransportChain() {
		TransportChainImpl transportChain = new TransportChainImpl();
		return transportChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimedTransportChain createTimedTransportChain() {
		TimedTransportChainImpl timedTransportChain = new TimedTransportChainImpl();
		return timedTransportChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HubToDeparture createHubToDeparture() {
		HubToDepartureImpl hubToDeparture = new HubToDepartureImpl();
		return hubToDeparture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HubToDuration createHubToDuration() {
		HubToDurationImpl hubToDuration = new HubToDurationImpl();
		return hubToDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChainsPackage getChainsPackage() {
		return (ChainsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChainsPackage getPackage() {
		return ChainsPackage.eINSTANCE;
	}

} //ChainsFactoryImpl
