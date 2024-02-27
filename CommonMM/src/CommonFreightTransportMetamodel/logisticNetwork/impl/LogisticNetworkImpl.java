/**
 */
package CommonFreightTransportMetamodel.logisticNetwork.impl;

import CommonFreightTransportMetamodel.logisticNetwork.CEPSP;
import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetwork;
import CommonFreightTransportMetamodel.logisticNetwork.LogisticNetworkPackage;
import CommonFreightTransportMetamodel.logisticNetwork.PublicServicePoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logistic Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkImpl#getCEPSPs <em>CEPS Ps</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticNetwork.impl.LogisticNetworkImpl#getPublicServicePoints <em>Public Service Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogisticNetworkImpl extends MinimalEObjectImpl.Container implements LogisticNetwork {
	/**
	 * The cached value of the '{@link #getCEPSPs() <em>CEPS Ps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCEPSPs()
	 * @generated
	 * @ordered
	 */
	protected EList<CEPSP> cepsPs;

	/**
	 * The cached value of the '{@link #getPublicServicePoints() <em>Public Service Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicServicePoints()
	 * @generated
	 * @ordered
	 */
	protected EList<PublicServicePoint> publicServicePoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogisticNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticNetworkPackage.Literals.LOGISTIC_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CEPSP> getCEPSPs() {
		if (cepsPs == null) {
			cepsPs = new EObjectContainmentEList<CEPSP>(CEPSP.class, this, LogisticNetworkPackage.LOGISTIC_NETWORK__CEPS_PS);
		}
		return cepsPs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublicServicePoint> getPublicServicePoints() {
		if (publicServicePoints == null) {
			publicServicePoints = new EObjectContainmentEList<PublicServicePoint>(PublicServicePoint.class, this, LogisticNetworkPackage.LOGISTIC_NETWORK__PUBLIC_SERVICE_POINTS);
		}
		return publicServicePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticNetworkPackage.LOGISTIC_NETWORK__CEPS_PS:
				return ((InternalEList<?>)getCEPSPs()).basicRemove(otherEnd, msgs);
			case LogisticNetworkPackage.LOGISTIC_NETWORK__PUBLIC_SERVICE_POINTS:
				return ((InternalEList<?>)getPublicServicePoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogisticNetworkPackage.LOGISTIC_NETWORK__CEPS_PS:
				return getCEPSPs();
			case LogisticNetworkPackage.LOGISTIC_NETWORK__PUBLIC_SERVICE_POINTS:
				return getPublicServicePoints();
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
			case LogisticNetworkPackage.LOGISTIC_NETWORK__CEPS_PS:
				getCEPSPs().clear();
				getCEPSPs().addAll((Collection<? extends CEPSP>)newValue);
				return;
			case LogisticNetworkPackage.LOGISTIC_NETWORK__PUBLIC_SERVICE_POINTS:
				getPublicServicePoints().clear();
				getPublicServicePoints().addAll((Collection<? extends PublicServicePoint>)newValue);
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
			case LogisticNetworkPackage.LOGISTIC_NETWORK__CEPS_PS:
				getCEPSPs().clear();
				return;
			case LogisticNetworkPackage.LOGISTIC_NETWORK__PUBLIC_SERVICE_POINTS:
				getPublicServicePoints().clear();
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
			case LogisticNetworkPackage.LOGISTIC_NETWORK__CEPS_PS:
				return cepsPs != null && !cepsPs.isEmpty();
			case LogisticNetworkPackage.LOGISTIC_NETWORK__PUBLIC_SERVICE_POINTS:
				return publicServicePoints != null && !publicServicePoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogisticNetworkImpl
