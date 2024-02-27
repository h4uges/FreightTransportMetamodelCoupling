/**
 */
package logiToppMetamodel.logiTopp.distribution.delivery.impl;

import logiToppMetamodel.logiTopp.distribution.delivery.*;

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
public class DeliveryFactoryImpl extends EFactoryImpl implements DeliveryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeliveryFactory init() {
		try {
			DeliveryFactory theDeliveryFactory = (DeliveryFactory)EPackage.Registry.INSTANCE.getEFactory(DeliveryPackage.eNS_URI);
			if (theDeliveryFactory != null) {
				return theDeliveryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeliveryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryFactoryImpl() {
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
			case DeliveryPackage.PARCEL_ACTIVITY: return createParcelActivity();
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
	public ParcelActivity createParcelActivity() {
		ParcelActivityImpl parcelActivity = new ParcelActivityImpl();
		return parcelActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeliveryPackage getDeliveryPackage() {
		return (DeliveryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeliveryPackage getPackage() {
		return DeliveryPackage.eINSTANCE;
	}

} //DeliveryFactoryImpl
