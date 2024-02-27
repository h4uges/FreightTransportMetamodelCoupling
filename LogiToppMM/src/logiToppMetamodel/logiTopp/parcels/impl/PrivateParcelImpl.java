/**
 */
package logiToppMetamodel.logiTopp.parcels.impl;

import logiToppMetamodel.logiTopp.parcels.ParcelDestinationType;
import logiToppMetamodel.logiTopp.parcels.ParcelsPackage;
import logiToppMetamodel.logiTopp.parcels.PrivateParcel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Private Parcel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.parcels.impl.PrivateParcelImpl#getDestinationType <em>Destination Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivateParcelImpl extends ParcelImpl implements PrivateParcel {
	/**
	 * The default value of the '{@link #getDestinationType() <em>Destination Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationType()
	 * @generated
	 * @ordered
	 */
	protected static final ParcelDestinationType DESTINATION_TYPE_EDEFAULT = ParcelDestinationType.HOME;

	/**
	 * The cached value of the '{@link #getDestinationType() <em>Destination Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationType()
	 * @generated
	 * @ordered
	 */
	protected ParcelDestinationType destinationType = DESTINATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivateParcelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParcelsPackage.Literals.PRIVATE_PARCEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParcelDestinationType getDestinationType() {
		return destinationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationType(ParcelDestinationType newDestinationType) {
		ParcelDestinationType oldDestinationType = destinationType;
		destinationType = newDestinationType == null ? DESTINATION_TYPE_EDEFAULT : newDestinationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParcelsPackage.PRIVATE_PARCEL__DESTINATION_TYPE, oldDestinationType, destinationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParcelsPackage.PRIVATE_PARCEL__DESTINATION_TYPE:
				return getDestinationType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ParcelsPackage.PRIVATE_PARCEL__DESTINATION_TYPE:
				setDestinationType((ParcelDestinationType)newValue);
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
			case ParcelsPackage.PRIVATE_PARCEL__DESTINATION_TYPE:
				setDestinationType(DESTINATION_TYPE_EDEFAULT);
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
			case ParcelsPackage.PRIVATE_PARCEL__DESTINATION_TYPE:
				return destinationType != DESTINATION_TYPE_EDEFAULT;
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
		result.append(" (destinationType: ");
		result.append(destinationType);
		result.append(')');
		return result.toString();
	}

} //PrivateParcelImpl
