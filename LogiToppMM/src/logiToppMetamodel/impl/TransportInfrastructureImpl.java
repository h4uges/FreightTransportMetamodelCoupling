/**
 */
package logiToppMetamodel.impl;

import java.util.Collection;

import logiToppMetamodel.LogiToppMetamodelPackage;
import logiToppMetamodel.TransportInfrastructure;

import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;

import logiToppMetamodel.logiTopp.distribution.timetable.TimeTable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.impl.TransportInfrastructureImpl#getTimetable <em>Timetable</em>}</li>
 *   <li>{@link logiToppMetamodel.impl.TransportInfrastructureImpl#getCepServiceProviders <em>Cep Service Providers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransportInfrastructureImpl extends MinimalEObjectImpl.Container implements TransportInfrastructure {
	/**
	 * The cached value of the '{@link #getTimetable() <em>Timetable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimetable()
	 * @generated
	 * @ordered
	 */
	protected TimeTable timetable;

	/**
	 * The cached value of the '{@link #getCepServiceProviders() <em>Cep Service Providers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCepServiceProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<CEPServiceProvider> cepServiceProviders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportInfrastructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogiToppMetamodelPackage.Literals.TRANSPORT_INFRASTRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeTable getTimetable() {
		return timetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimetable(TimeTable newTimetable, NotificationChain msgs) {
		TimeTable oldTimetable = timetable;
		timetable = newTimetable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogiToppMetamodelPackage.TRANSPORT_INFRASTRUCTURE__TIMETABLE, oldTimetable, newTimetable);
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
	public void setTimetable(TimeTable newTimetable) {
		if (newTimetable != timetable) {
			NotificationChain msgs = null;
			if (timetable != null)
				msgs = ((InternalEObject)timetable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogiToppMetamodelPackage.TRANSPORT_INFRASTRUCTURE__TIMETABLE, null, msgs);
			if (newTimetable != null)
				msgs = ((InternalEObject)newTimetable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogiToppMetamodelPackage.TRANSPORT_INFRASTRUCTURE__TIMETABLE, null, msgs);
			msgs = basicSetTimetable(newTimetable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogiToppMetamodelPackage.TRANSPORT_INFRASTRUCTURE__TIMETABLE, newTimetable, newTimetable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CEPServiceProvider> getCepServiceProviders() {
		if (cepServiceProviders == null) {
			cepServiceProviders = new EObjectContainmentEList<CEPServiceProvider>(CEPServiceProvider.class, this, LogiToppMetamodelPackage.TRANSPORT_INFRASTRUCTURE__CEP_SERVICE_PROVIDERS);
		}
		return cepServiceProviders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogiToppMetamodelPackage.TRANSPORT_INFRASTRUCTURE__TIMETABLE:
				return basicSetTimetable(null, msgs);
			case LogiToppMetamodelPackage.TRANSPORT_INFRASTRUCTURE__CEP_SERVICE_PROVIDERS:
				return ((InternalEList<?>)getCepServiceProviders()).basicRemove(otherEnd, msgs);
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
			case LogiToppMetamodelPackage.TRANSPORT_INFRASTRUCTURE__TIMETABLE:
				return getTimetable();
			case LogiToppMetamodelPackage.TRANSPORT_INFRASTRUCTURE__CEP_SERVICE_PROVIDERS:
				return getCepServiceProviders();
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
			case LogiToppMetamodelPackage.TRANSPORT_INFRASTRUCTURE__TIMETABLE:
				setTimetable((TimeTable)newValue);
				return;
			case LogiToppMetamodelPackage.TRANSPORT_INFRASTRUCTURE__CEP_SERVICE_PROVIDERS:
				getCepServiceProviders().clear();
				getCepServiceProviders().addAll((Collection<? extends CEPServiceProvider>)newValue);
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
			case LogiToppMetamodelPackage.TRANSPORT_INFRASTRUCTURE__TIMETABLE:
				setTimetable((TimeTable)null);
				return;
			case LogiToppMetamodelPackage.TRANSPORT_INFRASTRUCTURE__CEP_SERVICE_PROVIDERS:
				getCepServiceProviders().clear();
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
			case LogiToppMetamodelPackage.TRANSPORT_INFRASTRUCTURE__TIMETABLE:
				return timetable != null;
			case LogiToppMetamodelPackage.TRANSPORT_INFRASTRUCTURE__CEP_SERVICE_PROVIDERS:
				return cepServiceProviders != null && !cepServiceProviders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransportInfrastructureImpl
