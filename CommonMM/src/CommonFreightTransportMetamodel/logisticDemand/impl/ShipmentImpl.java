/**
 */
package CommonFreightTransportMetamodel.logisticDemand.impl;

import CommonFreightTransportMetamodel.logisticDemand.LogisticDemandPackage;
import CommonFreightTransportMetamodel.logisticDemand.Shipment;

import CommonFreightTransportMetamodel.logisticNetwork.CEPSP;

import CommonFreightTransportMetamodel.utils.Dimension;

import CommonFreightTransportMetamodel.utils.impl.HasId_Impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.ShipmentImpl#getResponsibleCEPSP <em>Responsible CEPSP</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticDemand.impl.ShipmentImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ShipmentImpl extends HasId_Impl implements Shipment {
	/**
	 * The cached value of the '{@link #getResponsibleCEPSP() <em>Responsible CEPSP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleCEPSP()
	 * @generated
	 * @ordered
	 */
	protected CEPSP responsibleCEPSP;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Dimension size;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticDemandPackage.Literals.SHIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CEPSP getResponsibleCEPSP() {
		return responsibleCEPSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsibleCEPSP(CEPSP newResponsibleCEPSP, NotificationChain msgs) {
		CEPSP oldResponsibleCEPSP = responsibleCEPSP;
		responsibleCEPSP = newResponsibleCEPSP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.SHIPMENT__RESPONSIBLE_CEPSP, oldResponsibleCEPSP, newResponsibleCEPSP);
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
	public void setResponsibleCEPSP(CEPSP newResponsibleCEPSP) {
		if (newResponsibleCEPSP != responsibleCEPSP) {
			NotificationChain msgs = null;
			if (responsibleCEPSP != null)
				msgs = ((InternalEObject)responsibleCEPSP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.SHIPMENT__RESPONSIBLE_CEPSP, null, msgs);
			if (newResponsibleCEPSP != null)
				msgs = ((InternalEObject)newResponsibleCEPSP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.SHIPMENT__RESPONSIBLE_CEPSP, null, msgs);
			msgs = basicSetResponsibleCEPSP(newResponsibleCEPSP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.SHIPMENT__RESPONSIBLE_CEPSP, newResponsibleCEPSP, newResponsibleCEPSP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dimension getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(Dimension newSize, NotificationChain msgs) {
		Dimension oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.SHIPMENT__SIZE, oldSize, newSize);
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
	public void setSize(Dimension newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.SHIPMENT__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticDemandPackage.SHIPMENT__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticDemandPackage.SHIPMENT__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticDemandPackage.SHIPMENT__RESPONSIBLE_CEPSP:
				return basicSetResponsibleCEPSP(null, msgs);
			case LogisticDemandPackage.SHIPMENT__SIZE:
				return basicSetSize(null, msgs);
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
			case LogisticDemandPackage.SHIPMENT__RESPONSIBLE_CEPSP:
				return getResponsibleCEPSP();
			case LogisticDemandPackage.SHIPMENT__SIZE:
				return getSize();
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
			case LogisticDemandPackage.SHIPMENT__RESPONSIBLE_CEPSP:
				setResponsibleCEPSP((CEPSP)newValue);
				return;
			case LogisticDemandPackage.SHIPMENT__SIZE:
				setSize((Dimension)newValue);
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
			case LogisticDemandPackage.SHIPMENT__RESPONSIBLE_CEPSP:
				setResponsibleCEPSP((CEPSP)null);
				return;
			case LogisticDemandPackage.SHIPMENT__SIZE:
				setSize((Dimension)null);
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
			case LogisticDemandPackage.SHIPMENT__RESPONSIBLE_CEPSP:
				return responsibleCEPSP != null;
			case LogisticDemandPackage.SHIPMENT__SIZE:
				return size != null;
		}
		return super.eIsSet(featureID);
	}

} //ShipmentImpl
