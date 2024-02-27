/**
 */
package logiToppMetamodel.logiTopp.distribution.chains;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Transport Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.chains.TimedTransportChain#getDepartures <em>Departures</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.chains.TimedTransportChain#getDurations <em>Durations</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage#getTimedTransportChain()
 * @model
 * @generated
 */
public interface TimedTransportChain extends TransportChain {
	/**
	 * Returns the value of the '<em><b>Departures</b></em>' reference list.
	 * The list contents are of type {@link logiToppMetamodel.logiTopp.distribution.chains.HubToDeparture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departures</em>' reference list.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage#getTimedTransportChain_Departures()
	 * @model
	 * @generated
	 */
	EList<HubToDeparture> getDepartures();

	/**
	 * Returns the value of the '<em><b>Durations</b></em>' reference list.
	 * The list contents are of type {@link logiToppMetamodel.logiTopp.distribution.chains.HubToDuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durations</em>' reference list.
	 * @see logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage#getTimedTransportChain_Durations()
	 * @model
	 * @generated
	 */
	EList<HubToDuration> getDurations();

} // TimedTransportChain
