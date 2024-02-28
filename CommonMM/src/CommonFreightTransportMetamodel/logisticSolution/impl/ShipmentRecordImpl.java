/**
 */
package CommonFreightTransportMetamodel.logisticSolution.impl;

import CommonFreightTransportMetamodel.logisticDemand.Shipment;

import CommonFreightTransportMetamodel.logisticNetwork.CEPSP;

import CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentEntry;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentExit;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecord;
import CommonFreightTransportMetamodel.logisticSolution.ShipmentRecordEntry;

import CommonFreightTransportMetamodel.utils.impl.HasId_Impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordImpl#getShipment <em>Shipment</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordImpl#getRepsonsibleCEPSP <em>Repsonsible CEPSP</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.impl.ShipmentRecordImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentRecordImpl extends HasId_Impl implements ShipmentRecord {
	/**
	 * The cached value of the '{@link #getShipment() <em>Shipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipment()
	 * @generated
	 * @ordered
	 */
	protected Shipment shipment;

	/**
	 * The cached value of the '{@link #getRepsonsibleCEPSP() <em>Repsonsible CEPSP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepsonsibleCEPSP()
	 * @generated
	 * @ordered
	 */
	protected CEPSP repsonsibleCEPSP;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected ShipmentEntry entry;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected ShipmentExit exit;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ShipmentRecordEntry> entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogisticSolutionPackage.Literals.SHIPMENT_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shipment getShipment() {
		if (shipment != null && shipment.eIsProxy()) {
			InternalEObject oldShipment = (InternalEObject)shipment;
			shipment = (Shipment)eResolveProxy(oldShipment);
			if (shipment != oldShipment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticSolutionPackage.SHIPMENT_RECORD__SHIPMENT, oldShipment, shipment));
			}
		}
		return shipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipment basicGetShipment() {
		return shipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipment(Shipment newShipment) {
		Shipment oldShipment = shipment;
		shipment = newShipment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.SHIPMENT_RECORD__SHIPMENT, oldShipment, shipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ShipmentRecordEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentWithInverseEList<ShipmentRecordEntry>(ShipmentRecordEntry.class, this, LogisticSolutionPackage.SHIPMENT_RECORD__ENTRIES, LogisticSolutionPackage.SHIPMENT_RECORD_ENTRY__RECORD);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticSolutionPackage.SHIPMENT_RECORD__ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntries()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CEPSP getRepsonsibleCEPSP() {
		if (repsonsibleCEPSP != null && repsonsibleCEPSP.eIsProxy()) {
			InternalEObject oldRepsonsibleCEPSP = (InternalEObject)repsonsibleCEPSP;
			repsonsibleCEPSP = (CEPSP)eResolveProxy(oldRepsonsibleCEPSP);
			if (repsonsibleCEPSP != oldRepsonsibleCEPSP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogisticSolutionPackage.SHIPMENT_RECORD__REPSONSIBLE_CEPSP, oldRepsonsibleCEPSP, repsonsibleCEPSP));
			}
		}
		return repsonsibleCEPSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEPSP basicGetRepsonsibleCEPSP() {
		return repsonsibleCEPSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepsonsibleCEPSP(CEPSP newRepsonsibleCEPSP) {
		CEPSP oldRepsonsibleCEPSP = repsonsibleCEPSP;
		repsonsibleCEPSP = newRepsonsibleCEPSP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.SHIPMENT_RECORD__REPSONSIBLE_CEPSP, oldRepsonsibleCEPSP, repsonsibleCEPSP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentEntry getEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry(ShipmentEntry newEntry, NotificationChain msgs) {
		ShipmentEntry oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.SHIPMENT_RECORD__ENTRY, oldEntry, newEntry);
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
	public void setEntry(ShipmentEntry newEntry) {
		if (newEntry != entry) {
			NotificationChain msgs = null;
			if (entry != null)
				msgs = ((InternalEObject)entry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticSolutionPackage.SHIPMENT_RECORD__ENTRY, null, msgs);
			if (newEntry != null)
				msgs = ((InternalEObject)newEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticSolutionPackage.SHIPMENT_RECORD__ENTRY, null, msgs);
			msgs = basicSetEntry(newEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.SHIPMENT_RECORD__ENTRY, newEntry, newEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentExit getExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExit(ShipmentExit newExit, NotificationChain msgs) {
		ShipmentExit oldExit = exit;
		exit = newExit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.SHIPMENT_RECORD__EXIT, oldExit, newExit);
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
	public void setExit(ShipmentExit newExit) {
		if (newExit != exit) {
			NotificationChain msgs = null;
			if (exit != null)
				msgs = ((InternalEObject)exit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogisticSolutionPackage.SHIPMENT_RECORD__EXIT, null, msgs);
			if (newExit != null)
				msgs = ((InternalEObject)newExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogisticSolutionPackage.SHIPMENT_RECORD__EXIT, null, msgs);
			msgs = basicSetExit(newExit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogisticSolutionPackage.SHIPMENT_RECORD__EXIT, newExit, newExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogisticSolutionPackage.SHIPMENT_RECORD__ENTRY:
				return basicSetEntry(null, msgs);
			case LogisticSolutionPackage.SHIPMENT_RECORD__EXIT:
				return basicSetExit(null, msgs);
			case LogisticSolutionPackage.SHIPMENT_RECORD__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
			case LogisticSolutionPackage.SHIPMENT_RECORD__SHIPMENT:
				if (resolve) return getShipment();
				return basicGetShipment();
			case LogisticSolutionPackage.SHIPMENT_RECORD__REPSONSIBLE_CEPSP:
				if (resolve) return getRepsonsibleCEPSP();
				return basicGetRepsonsibleCEPSP();
			case LogisticSolutionPackage.SHIPMENT_RECORD__ENTRY:
				return getEntry();
			case LogisticSolutionPackage.SHIPMENT_RECORD__EXIT:
				return getExit();
			case LogisticSolutionPackage.SHIPMENT_RECORD__ENTRIES:
				return getEntries();
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
			case LogisticSolutionPackage.SHIPMENT_RECORD__SHIPMENT:
				setShipment((Shipment)newValue);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD__REPSONSIBLE_CEPSP:
				setRepsonsibleCEPSP((CEPSP)newValue);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD__ENTRY:
				setEntry((ShipmentEntry)newValue);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD__EXIT:
				setExit((ShipmentExit)newValue);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends ShipmentRecordEntry>)newValue);
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
			case LogisticSolutionPackage.SHIPMENT_RECORD__SHIPMENT:
				setShipment((Shipment)null);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD__REPSONSIBLE_CEPSP:
				setRepsonsibleCEPSP((CEPSP)null);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD__ENTRY:
				setEntry((ShipmentEntry)null);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD__EXIT:
				setExit((ShipmentExit)null);
				return;
			case LogisticSolutionPackage.SHIPMENT_RECORD__ENTRIES:
				getEntries().clear();
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
			case LogisticSolutionPackage.SHIPMENT_RECORD__SHIPMENT:
				return shipment != null;
			case LogisticSolutionPackage.SHIPMENT_RECORD__REPSONSIBLE_CEPSP:
				return repsonsibleCEPSP != null;
			case LogisticSolutionPackage.SHIPMENT_RECORD__ENTRY:
				return entry != null;
			case LogisticSolutionPackage.SHIPMENT_RECORD__EXIT:
				return exit != null;
			case LogisticSolutionPackage.SHIPMENT_RECORD__ENTRIES:
				return entries != null && !entries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShipmentRecordImpl
