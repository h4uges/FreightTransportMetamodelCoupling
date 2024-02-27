/**
 */
package logiToppMetamodel.logiTopp.distribution.chains.impl;

import java.util.Collection;

import logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage;
import logiToppMetamodel.logiTopp.distribution.chains.HubToDeparture;
import logiToppMetamodel.logiTopp.distribution.chains.HubToDuration;
import logiToppMetamodel.logiTopp.distribution.chains.TimedTransportChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Transport Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.chains.impl.TimedTransportChainImpl#getDepartures <em>Departures</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.chains.impl.TimedTransportChainImpl#getDurations <em>Durations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedTransportChainImpl extends TransportChainImpl implements TimedTransportChain {
	/**
	 * The cached value of the '{@link #getDepartures() <em>Departures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartures()
	 * @generated
	 * @ordered
	 */
	protected EList<HubToDeparture> departures;

	/**
	 * The cached value of the '{@link #getDurations() <em>Durations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurations()
	 * @generated
	 * @ordered
	 */
	protected EList<HubToDuration> durations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedTransportChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChainsPackage.Literals.TIMED_TRANSPORT_CHAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HubToDeparture> getDepartures() {
		if (departures == null) {
			departures = new EObjectResolvingEList<HubToDeparture>(HubToDeparture.class, this, ChainsPackage.TIMED_TRANSPORT_CHAIN__DEPARTURES);
		}
		return departures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HubToDuration> getDurations() {
		if (durations == null) {
			durations = new EObjectResolvingEList<HubToDuration>(HubToDuration.class, this, ChainsPackage.TIMED_TRANSPORT_CHAIN__DURATIONS);
		}
		return durations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChainsPackage.TIMED_TRANSPORT_CHAIN__DEPARTURES:
				return getDepartures();
			case ChainsPackage.TIMED_TRANSPORT_CHAIN__DURATIONS:
				return getDurations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChainsPackage.TIMED_TRANSPORT_CHAIN__DEPARTURES:
				getDepartures().clear();
				getDepartures().addAll((Collection<? extends HubToDeparture>)newValue);
				return;
			case ChainsPackage.TIMED_TRANSPORT_CHAIN__DURATIONS:
				getDurations().clear();
				getDurations().addAll((Collection<? extends HubToDuration>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ChainsPackage.TIMED_TRANSPORT_CHAIN__DEPARTURES:
				getDepartures().clear();
				return;
			case ChainsPackage.TIMED_TRANSPORT_CHAIN__DURATIONS:
				getDurations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ChainsPackage.TIMED_TRANSPORT_CHAIN__DEPARTURES:
				return departures != null && !departures.isEmpty();
			case ChainsPackage.TIMED_TRANSPORT_CHAIN__DURATIONS:
				return durations != null && !durations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimedTransportChainImpl
