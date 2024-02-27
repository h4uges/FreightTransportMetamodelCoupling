/**
 */
package logiToppMetamodel.logiTopp.distribution.chains.impl;

import java.util.Collection;

import logiToppMetamodel.logiTopp.distribution.DistributionCenter;

import logiToppMetamodel.logiTopp.distribution.chains.ChainsPackage;
import logiToppMetamodel.logiTopp.distribution.chains.TransportChain;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.chains.impl.TransportChainImpl#getHubs <em>Hubs</em>}</li>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.chains.impl.TransportChainImpl#isDeliveryDirection <em>Delivery Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransportChainImpl extends MinimalEObjectImpl.Container implements TransportChain {
	/**
	 * The cached value of the '{@link #getHubs() <em>Hubs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHubs()
	 * @generated
	 * @ordered
	 */
	protected EList<DistributionCenter> hubs;

	/**
	 * The default value of the '{@link #isDeliveryDirection() <em>Delivery Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeliveryDirection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELIVERY_DIRECTION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDeliveryDirection() <em>Delivery Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeliveryDirection()
	 * @generated
	 * @ordered
	 */
	protected boolean deliveryDirection = DELIVERY_DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChainsPackage.Literals.TRANSPORT_CHAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DistributionCenter> getHubs() {
		if (hubs == null) {
			hubs = new EObjectResolvingEList<DistributionCenter>(DistributionCenter.class, this, ChainsPackage.TRANSPORT_CHAIN__HUBS);
		}
		return hubs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeliveryDirection() {
		return deliveryDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryDirection(boolean newDeliveryDirection) {
		boolean oldDeliveryDirection = deliveryDirection;
		deliveryDirection = newDeliveryDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChainsPackage.TRANSPORT_CHAIN__DELIVERY_DIRECTION, oldDeliveryDirection, deliveryDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChainsPackage.TRANSPORT_CHAIN__HUBS:
				return getHubs();
			case ChainsPackage.TRANSPORT_CHAIN__DELIVERY_DIRECTION:
				return isDeliveryDirection();
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
			case ChainsPackage.TRANSPORT_CHAIN__HUBS:
				getHubs().clear();
				getHubs().addAll((Collection<? extends DistributionCenter>)newValue);
				return;
			case ChainsPackage.TRANSPORT_CHAIN__DELIVERY_DIRECTION:
				setDeliveryDirection((Boolean)newValue);
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
			case ChainsPackage.TRANSPORT_CHAIN__HUBS:
				getHubs().clear();
				return;
			case ChainsPackage.TRANSPORT_CHAIN__DELIVERY_DIRECTION:
				setDeliveryDirection(DELIVERY_DIRECTION_EDEFAULT);
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
			case ChainsPackage.TRANSPORT_CHAIN__HUBS:
				return hubs != null && !hubs.isEmpty();
			case ChainsPackage.TRANSPORT_CHAIN__DELIVERY_DIRECTION:
				return deliveryDirection != DELIVERY_DIRECTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (deliveryDirection: ");
		result.append(deliveryDirection);
		result.append(')');
		return result.toString();
	}

} //TransportChainImpl
