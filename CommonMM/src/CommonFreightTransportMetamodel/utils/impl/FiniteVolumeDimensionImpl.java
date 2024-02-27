/**
 */
package CommonFreightTransportMetamodel.utils.impl;

import CommonFreightTransportMetamodel.utils.FiniteVolumeDimension;
import CommonFreightTransportMetamodel.utils.UtilsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finite Volume Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.utils.impl.FiniteVolumeDimensionImpl#getVolumeCubicMetre <em>Volume Cubic Metre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FiniteVolumeDimensionImpl extends VolumeBasedDimensionImpl implements FiniteVolumeDimension {
	/**
	 * The default value of the '{@link #getVolumeCubicMetre() <em>Volume Cubic Metre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeCubicMetre()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLUME_CUBIC_METRE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVolumeCubicMetre() <em>Volume Cubic Metre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeCubicMetre()
	 * @generated
	 * @ordered
	 */
	protected double volumeCubicMetre = VOLUME_CUBIC_METRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FiniteVolumeDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilsPackage.Literals.FINITE_VOLUME_DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getVolumeCubicMetre() {
		return volumeCubicMetre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolumeCubicMetre(double newVolumeCubicMetre) {
		double oldVolumeCubicMetre = volumeCubicMetre;
		volumeCubicMetre = newVolumeCubicMetre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.FINITE_VOLUME_DIMENSION__VOLUME_CUBIC_METRE, oldVolumeCubicMetre, volumeCubicMetre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UtilsPackage.FINITE_VOLUME_DIMENSION__VOLUME_CUBIC_METRE:
				return getVolumeCubicMetre();
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
			case UtilsPackage.FINITE_VOLUME_DIMENSION__VOLUME_CUBIC_METRE:
				setVolumeCubicMetre((Double)newValue);
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
			case UtilsPackage.FINITE_VOLUME_DIMENSION__VOLUME_CUBIC_METRE:
				setVolumeCubicMetre(VOLUME_CUBIC_METRE_EDEFAULT);
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
			case UtilsPackage.FINITE_VOLUME_DIMENSION__VOLUME_CUBIC_METRE:
				return volumeCubicMetre != VOLUME_CUBIC_METRE_EDEFAULT;
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
		result.append(" (volumeCubicMetre: ");
		result.append(volumeCubicMetre);
		result.append(')');
		return result.toString();
	}

} //FiniteVolumeDimensionImpl
