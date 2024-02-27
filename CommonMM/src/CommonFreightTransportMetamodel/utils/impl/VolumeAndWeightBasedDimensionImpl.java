/**
 */
package CommonFreightTransportMetamodel.utils.impl;

import CommonFreightTransportMetamodel.utils.UtilsPackage;
import CommonFreightTransportMetamodel.utils.VolumeAndWeightBasedDimension;
import CommonFreightTransportMetamodel.utils.VolumeBasedDimension;
import CommonFreightTransportMetamodel.utils.WeightBasedDimension;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume And Weight Based Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.utils.impl.VolumeAndWeightBasedDimensionImpl#getVolumeDimension <em>Volume Dimension</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.utils.impl.VolumeAndWeightBasedDimensionImpl#getWeightDimension <em>Weight Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeAndWeightBasedDimensionImpl extends DimensionImpl implements VolumeAndWeightBasedDimension {
	/**
	 * The cached value of the '{@link #getVolumeDimension() <em>Volume Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeDimension()
	 * @generated
	 * @ordered
	 */
	protected VolumeBasedDimension volumeDimension;

	/**
	 * The cached value of the '{@link #getWeightDimension() <em>Weight Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightDimension()
	 * @generated
	 * @ordered
	 */
	protected WeightBasedDimension weightDimension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeAndWeightBasedDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilsPackage.Literals.VOLUME_AND_WEIGHT_BASED_DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeBasedDimension getVolumeDimension() {
		return volumeDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolumeDimension(VolumeBasedDimension newVolumeDimension, NotificationChain msgs) {
		VolumeBasedDimension oldVolumeDimension = volumeDimension;
		volumeDimension = newVolumeDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION__VOLUME_DIMENSION, oldVolumeDimension, newVolumeDimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolumeDimension(VolumeBasedDimension newVolumeDimension) {
		if (newVolumeDimension != volumeDimension) {
			NotificationChain msgs = null;
			if (volumeDimension != null)
				msgs = ((InternalEObject)volumeDimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION__VOLUME_DIMENSION, null, msgs);
			if (newVolumeDimension != null)
				msgs = ((InternalEObject)newVolumeDimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION__VOLUME_DIMENSION, null, msgs);
			msgs = basicSetVolumeDimension(newVolumeDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION__VOLUME_DIMENSION, newVolumeDimension, newVolumeDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeightBasedDimension getWeightDimension() {
		return weightDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeightDimension(WeightBasedDimension newWeightDimension, NotificationChain msgs) {
		WeightBasedDimension oldWeightDimension = weightDimension;
		weightDimension = newWeightDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION__WEIGHT_DIMENSION, oldWeightDimension, newWeightDimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightDimension(WeightBasedDimension newWeightDimension) {
		if (newWeightDimension != weightDimension) {
			NotificationChain msgs = null;
			if (weightDimension != null)
				msgs = ((InternalEObject)weightDimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION__WEIGHT_DIMENSION, null, msgs);
			if (newWeightDimension != null)
				msgs = ((InternalEObject)newWeightDimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION__WEIGHT_DIMENSION, null, msgs);
			msgs = basicSetWeightDimension(newWeightDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION__WEIGHT_DIMENSION, newWeightDimension, newWeightDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION__VOLUME_DIMENSION:
				return basicSetVolumeDimension(null, msgs);
			case UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION__WEIGHT_DIMENSION:
				return basicSetWeightDimension(null, msgs);
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
			case UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION__VOLUME_DIMENSION:
				return getVolumeDimension();
			case UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION__WEIGHT_DIMENSION:
				return getWeightDimension();
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
			case UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION__VOLUME_DIMENSION:
				setVolumeDimension((VolumeBasedDimension)newValue);
				return;
			case UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION__WEIGHT_DIMENSION:
				setWeightDimension((WeightBasedDimension)newValue);
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
			case UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION__VOLUME_DIMENSION:
				setVolumeDimension((VolumeBasedDimension)null);
				return;
			case UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION__WEIGHT_DIMENSION:
				setWeightDimension((WeightBasedDimension)null);
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
			case UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION__VOLUME_DIMENSION:
				return volumeDimension != null;
			case UtilsPackage.VOLUME_AND_WEIGHT_BASED_DIMENSION__WEIGHT_DIMENSION:
				return weightDimension != null;
		}
		return super.eIsSet(featureID);
	}

} //VolumeAndWeightBasedDimensionImpl
