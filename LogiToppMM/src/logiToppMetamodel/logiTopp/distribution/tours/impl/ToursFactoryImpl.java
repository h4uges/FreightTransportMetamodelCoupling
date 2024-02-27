/**
 */
package logiToppMetamodel.logiTopp.distribution.tours.impl;

import logiToppMetamodel.logiTopp.distribution.tours.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToursFactoryImpl extends EFactoryImpl implements ToursFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToursFactory init() {
		try {
			ToursFactory theToursFactory = (ToursFactory)EPackage.Registry.INSTANCE.getEFactory(ToursPackage.eNS_URI);
			if (theToursFactory != null) {
				return theToursFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToursFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToursFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ToursPackage.PLANNED_DELIVERY_TOUR: return createPlannedDeliveryTour();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedDeliveryTour createPlannedDeliveryTour() {
		PlannedDeliveryTourImpl plannedDeliveryTour = new PlannedDeliveryTourImpl();
		return plannedDeliveryTour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToursPackage getToursPackage() {
		return (ToursPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToursPackage getPackage() {
		return ToursPackage.eINSTANCE;
	}

} //ToursFactoryImpl
