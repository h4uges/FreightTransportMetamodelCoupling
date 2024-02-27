/**
 */
package CommonFreightTransportMetamodel.utils.impl;

import CommonFreightTransportMetamodel.utils.FiniteWeightDimension;
import CommonFreightTransportMetamodel.utils.UtilsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finite Weight Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.utils.impl.FiniteWeightDimensionImpl#getWeightKg <em>Weight Kg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FiniteWeightDimensionImpl extends WeightBasedDimensionImpl implements FiniteWeightDimension {
	/**
	 * The default value of the '{@link #getWeightKg() <em>Weight Kg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightKg()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_KG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeightKg() <em>Weight Kg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightKg()
	 * @generated
	 * @ordered
	 */
	protected double weightKg = WEIGHT_KG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FiniteWeightDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilsPackage.Literals.FINITE_WEIGHT_DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWeightKg() {
		return weightKg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightKg(double newWeightKg) {
		double oldWeightKg = weightKg;
		weightKg = newWeightKg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.FINITE_WEIGHT_DIMENSION__WEIGHT_KG, oldWeightKg, weightKg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UtilsPackage.FINITE_WEIGHT_DIMENSION__WEIGHT_KG:
				return getWeightKg();
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
			case UtilsPackage.FINITE_WEIGHT_DIMENSION__WEIGHT_KG:
				setWeightKg((Double)newValue);
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
			case UtilsPackage.FINITE_WEIGHT_DIMENSION__WEIGHT_KG:
				setWeightKg(WEIGHT_KG_EDEFAULT);
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
			case UtilsPackage.FINITE_WEIGHT_DIMENSION__WEIGHT_KG:
				return weightKg != WEIGHT_KG_EDEFAULT;
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
		result.append(" (weightKg: ");
		result.append(weightKg);
		result.append(')');
		return result.toString();
	}

} //FiniteWeightDimensionImpl
