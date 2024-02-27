/**
 */
package MATSimFreightMetamodel.matsim.vehicles.impl;

import MATSimFreightMetamodel.base.impl.EntityImpl;

import MATSimFreightMetamodel.matsim.TransportMode;

import MATSimFreightMetamodel.matsim.vehicles.VehicleCapacity;
import MATSimFreightMetamodel.matsim.vehicles.VehicleType;
import MATSimFreightMetamodel.matsim.vehicles.VehiclesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleTypeImpl#getMaxVelocity <em>Max Velocity</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleTypeImpl#getPcuEquivalents <em>Pcu Equivalents</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleTypeImpl#getFlowEfficiencyFactor <em>Flow Efficiency Factor</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleTypeImpl#getNetworkMode <em>Network Mode</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.vehicles.impl.VehicleTypeImpl#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleTypeImpl extends EntityImpl implements VehicleType {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxVelocity() <em>Max Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_VELOCITY_EDEFAULT = 9999.0;

	/**
	 * The cached value of the '{@link #getMaxVelocity() <em>Max Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVelocity()
	 * @generated
	 * @ordered
	 */
	protected double maxVelocity = MAX_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final double LENGTH_EDEFAULT = 7.5;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected double length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPcuEquivalents() <em>Pcu Equivalents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcuEquivalents()
	 * @generated
	 * @ordered
	 */
	protected static final double PCU_EQUIVALENTS_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getPcuEquivalents() <em>Pcu Equivalents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcuEquivalents()
	 * @generated
	 * @ordered
	 */
	protected double pcuEquivalents = PCU_EQUIVALENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlowEfficiencyFactor() <em>Flow Efficiency Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowEfficiencyFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double FLOW_EFFICIENCY_FACTOR_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getFlowEfficiencyFactor() <em>Flow Efficiency Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowEfficiencyFactor()
	 * @generated
	 * @ordered
	 */
	protected double flowEfficiencyFactor = FLOW_EFFICIENCY_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkMode() <em>Network Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkMode()
	 * @generated
	 * @ordered
	 */
	protected static final TransportMode NETWORK_MODE_EDEFAULT = TransportMode.CAR;

	/**
	 * The cached value of the '{@link #getNetworkMode() <em>Network Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkMode()
	 * @generated
	 * @ordered
	 */
	protected TransportMode networkMode = NETWORK_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected VehicleCapacity capacity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VehiclesPackage.Literals.VEHICLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclesPackage.VEHICLE_TYPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxVelocity() {
		return maxVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxVelocity(double newMaxVelocity) {
		double oldMaxVelocity = maxVelocity;
		maxVelocity = newMaxVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclesPackage.VEHICLE_TYPE__MAX_VELOCITY, oldMaxVelocity, maxVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(double newLength) {
		double oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclesPackage.VEHICLE_TYPE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPcuEquivalents() {
		return pcuEquivalents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPcuEquivalents(double newPcuEquivalents) {
		double oldPcuEquivalents = pcuEquivalents;
		pcuEquivalents = newPcuEquivalents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclesPackage.VEHICLE_TYPE__PCU_EQUIVALENTS, oldPcuEquivalents, pcuEquivalents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFlowEfficiencyFactor() {
		return flowEfficiencyFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlowEfficiencyFactor(double newFlowEfficiencyFactor) {
		double oldFlowEfficiencyFactor = flowEfficiencyFactor;
		flowEfficiencyFactor = newFlowEfficiencyFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclesPackage.VEHICLE_TYPE__FLOW_EFFICIENCY_FACTOR, oldFlowEfficiencyFactor, flowEfficiencyFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclesPackage.VEHICLE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransportMode getNetworkMode() {
		return networkMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkMode(TransportMode newNetworkMode) {
		TransportMode oldNetworkMode = networkMode;
		networkMode = newNetworkMode == null ? NETWORK_MODE_EDEFAULT : newNetworkMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclesPackage.VEHICLE_TYPE__NETWORK_MODE, oldNetworkMode, networkMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VehicleCapacity getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapacity(VehicleCapacity newCapacity, NotificationChain msgs) {
		VehicleCapacity oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VehiclesPackage.VEHICLE_TYPE__CAPACITY, oldCapacity, newCapacity);
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
	public void setCapacity(VehicleCapacity newCapacity) {
		if (newCapacity != capacity) {
			NotificationChain msgs = null;
			if (capacity != null)
				msgs = ((InternalEObject)capacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VehiclesPackage.VEHICLE_TYPE__CAPACITY, null, msgs);
			if (newCapacity != null)
				msgs = ((InternalEObject)newCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VehiclesPackage.VEHICLE_TYPE__CAPACITY, null, msgs);
			msgs = basicSetCapacity(newCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclesPackage.VEHICLE_TYPE__CAPACITY, newCapacity, newCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VehiclesPackage.VEHICLE_TYPE__CAPACITY:
				return basicSetCapacity(null, msgs);
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
			case VehiclesPackage.VEHICLE_TYPE__WIDTH:
				return getWidth();
			case VehiclesPackage.VEHICLE_TYPE__MAX_VELOCITY:
				return getMaxVelocity();
			case VehiclesPackage.VEHICLE_TYPE__LENGTH:
				return getLength();
			case VehiclesPackage.VEHICLE_TYPE__PCU_EQUIVALENTS:
				return getPcuEquivalents();
			case VehiclesPackage.VEHICLE_TYPE__FLOW_EFFICIENCY_FACTOR:
				return getFlowEfficiencyFactor();
			case VehiclesPackage.VEHICLE_TYPE__DESCRIPTION:
				return getDescription();
			case VehiclesPackage.VEHICLE_TYPE__NETWORK_MODE:
				return getNetworkMode();
			case VehiclesPackage.VEHICLE_TYPE__CAPACITY:
				return getCapacity();
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
			case VehiclesPackage.VEHICLE_TYPE__WIDTH:
				setWidth((Double)newValue);
				return;
			case VehiclesPackage.VEHICLE_TYPE__MAX_VELOCITY:
				setMaxVelocity((Double)newValue);
				return;
			case VehiclesPackage.VEHICLE_TYPE__LENGTH:
				setLength((Double)newValue);
				return;
			case VehiclesPackage.VEHICLE_TYPE__PCU_EQUIVALENTS:
				setPcuEquivalents((Double)newValue);
				return;
			case VehiclesPackage.VEHICLE_TYPE__FLOW_EFFICIENCY_FACTOR:
				setFlowEfficiencyFactor((Double)newValue);
				return;
			case VehiclesPackage.VEHICLE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case VehiclesPackage.VEHICLE_TYPE__NETWORK_MODE:
				setNetworkMode((TransportMode)newValue);
				return;
			case VehiclesPackage.VEHICLE_TYPE__CAPACITY:
				setCapacity((VehicleCapacity)newValue);
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
			case VehiclesPackage.VEHICLE_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case VehiclesPackage.VEHICLE_TYPE__MAX_VELOCITY:
				setMaxVelocity(MAX_VELOCITY_EDEFAULT);
				return;
			case VehiclesPackage.VEHICLE_TYPE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case VehiclesPackage.VEHICLE_TYPE__PCU_EQUIVALENTS:
				setPcuEquivalents(PCU_EQUIVALENTS_EDEFAULT);
				return;
			case VehiclesPackage.VEHICLE_TYPE__FLOW_EFFICIENCY_FACTOR:
				setFlowEfficiencyFactor(FLOW_EFFICIENCY_FACTOR_EDEFAULT);
				return;
			case VehiclesPackage.VEHICLE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case VehiclesPackage.VEHICLE_TYPE__NETWORK_MODE:
				setNetworkMode(NETWORK_MODE_EDEFAULT);
				return;
			case VehiclesPackage.VEHICLE_TYPE__CAPACITY:
				setCapacity((VehicleCapacity)null);
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
			case VehiclesPackage.VEHICLE_TYPE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case VehiclesPackage.VEHICLE_TYPE__MAX_VELOCITY:
				return maxVelocity != MAX_VELOCITY_EDEFAULT;
			case VehiclesPackage.VEHICLE_TYPE__LENGTH:
				return length != LENGTH_EDEFAULT;
			case VehiclesPackage.VEHICLE_TYPE__PCU_EQUIVALENTS:
				return pcuEquivalents != PCU_EQUIVALENTS_EDEFAULT;
			case VehiclesPackage.VEHICLE_TYPE__FLOW_EFFICIENCY_FACTOR:
				return flowEfficiencyFactor != FLOW_EFFICIENCY_FACTOR_EDEFAULT;
			case VehiclesPackage.VEHICLE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case VehiclesPackage.VEHICLE_TYPE__NETWORK_MODE:
				return networkMode != NETWORK_MODE_EDEFAULT;
			case VehiclesPackage.VEHICLE_TYPE__CAPACITY:
				return capacity != null;
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
		result.append(" (width: ");
		result.append(width);
		result.append(", maxVelocity: ");
		result.append(maxVelocity);
		result.append(", length: ");
		result.append(length);
		result.append(", pcuEquivalents: ");
		result.append(pcuEquivalents);
		result.append(", flowEfficiencyFactor: ");
		result.append(flowEfficiencyFactor);
		result.append(", description: ");
		result.append(description);
		result.append(", networkMode: ");
		result.append(networkMode);
		result.append(')');
		return result.toString();
	}

} //VehicleTypeImpl
