/**
 */
package logiToppMetamodel.logiTopp.distribution.chains.util;

import logiToppMetamodel.logiTopp.distribution.chains.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage
 * @generated
 */
public class ChainsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ChainsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ChainsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainsSwitch<Adapter> modelSwitch =
		new ChainsSwitch<Adapter>() {
			@Override
			public Adapter caseTransportChain(TransportChain object) {
				return createTransportChainAdapter();
			}
			@Override
			public Adapter caseTimedTransportChain(TimedTransportChain object) {
				return createTimedTransportChainAdapter();
			}
			@Override
			public Adapter caseHubToDeparture(HubToDeparture object) {
				return createHubToDepartureAdapter();
			}
			@Override
			public Adapter caseHubToDuration(HubToDuration object) {
				return createHubToDurationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link logiToppMetamodel.logiTopp.distribution.chains.TransportChain <em>Transport Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.TransportChain
	 * @generated
	 */
	public Adapter createTransportChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logiToppMetamodel.logiTopp.distribution.chains.TimedTransportChain <em>Timed Transport Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.TimedTransportChain
	 * @generated
	 */
	public Adapter createTimedTransportChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logiToppMetamodel.logiTopp.distribution.chains.HubToDeparture <em>Hub To Departure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.HubToDeparture
	 * @generated
	 */
	public Adapter createHubToDepartureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logiToppMetamodel.logiTopp.distribution.chains.HubToDuration <em>Hub To Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.HubToDuration
	 * @generated
	 */
	public Adapter createHubToDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ChainsAdapterFactory
