/**
 */
package CommonFreightTransportMetamodel.logisticNetwork.impl;

import CommonFreightTransportMetamodel.logisticNetwork.LogisticFacility;
import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage;

import CommonFreightTransportMetamodel.utils.impl.ShipmentlLegStartEndPointImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logistic Facility</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class LogisticFacilityImpl extends ShipmentlLegStartEndPointImpl implements LogisticFacility {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogisticFacilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticNetworkPackage.Literals.LOGISTIC_FACILITY;
	}

} //LogisticFacilityImpl
