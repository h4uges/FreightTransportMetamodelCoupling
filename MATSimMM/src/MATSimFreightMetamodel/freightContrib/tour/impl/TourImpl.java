/**
 */
package MATSimFreightMetamodel.freightContrib.tour.impl;

import MATSimFreightMetamodel.base.impl.EntityImpl;

import MATSimFreightMetamodel.freightContrib.tour.End;
import MATSimFreightMetamodel.freightContrib.tour.Start;
import MATSimFreightMetamodel.freightContrib.tour.Tour;
import MATSimFreightMetamodel.freightContrib.tour.TourElement;
import MATSimFreightMetamodel.freightContrib.tour.TourPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.impl.TourImpl#getTourElements <em>Tour Elements</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.impl.TourImpl#getStart <em>Start</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightContrib.tour.impl.TourImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TourImpl extends EntityImpl implements Tour {
	/**
	 * The cached value of the '{@link #getTourElements() <em>Tour Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTourElements()
	 * @generated
	 * @ordered
	 */
	protected EList<TourElement> tourElements;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Start start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected End end;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TourPackage.Literals.TOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TourElement> getTourElements() {
		if (tourElements == null) {
			tourElements = new EObjectContainmentEList<TourElement>(TourElement.class, this, TourPackage.TOUR__TOUR_ELEMENTS);
		}
		return tourElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (Start)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TourPackage.TOUR__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Start newStart) {
		Start oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TourPackage.TOUR__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public End getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (End)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TourPackage.TOUR__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(End newEnd) {
		End oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TourPackage.TOUR__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TourPackage.TOUR__TOUR_ELEMENTS:
				return ((InternalEList<?>)getTourElements()).basicRemove(otherEnd, msgs);
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
			case TourPackage.TOUR__TOUR_ELEMENTS:
				return getTourElements();
			case TourPackage.TOUR__START:
				if (resolve) return getStart();
				return basicGetStart();
			case TourPackage.TOUR__END:
				if (resolve) return getEnd();
				return basicGetEnd();
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
			case TourPackage.TOUR__TOUR_ELEMENTS:
				getTourElements().clear();
				getTourElements().addAll((Collection<? extends TourElement>)newValue);
				return;
			case TourPackage.TOUR__START:
				setStart((Start)newValue);
				return;
			case TourPackage.TOUR__END:
				setEnd((End)newValue);
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
			case TourPackage.TOUR__TOUR_ELEMENTS:
				getTourElements().clear();
				return;
			case TourPackage.TOUR__START:
				setStart((Start)null);
				return;
			case TourPackage.TOUR__END:
				setEnd((End)null);
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
			case TourPackage.TOUR__TOUR_ELEMENTS:
				return tourElements != null && !tourElements.isEmpty();
			case TourPackage.TOUR__START:
				return start != null;
			case TourPackage.TOUR__END:
				return end != null;
		}
		return super.eIsSet(featureID);
	}

} //TourImpl
