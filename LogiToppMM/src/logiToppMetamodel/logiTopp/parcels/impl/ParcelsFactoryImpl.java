/**
 */
package logiToppMetamodel.logiTopp.parcels.impl;

import logiToppMetamodel.logiTopp.parcels.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ParcelsFactoryImpl extends EFactoryImpl implements ParcelsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParcelsFactory init() {
		try {
			ParcelsFactory theParcelsFactory = (ParcelsFactory)EPackage.Registry.INSTANCE.getEFactory(ParcelsPackage.eNS_URI);
			if (theParcelsFactory != null) {
				return theParcelsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ParcelsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParcelsFactoryImpl() {
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
			case ParcelsPackage.PRIVATE_PARCEL: return createPrivateParcel();
			case ParcelsPackage.BUSINESS_PARCEL: return createBusinessParcel();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ParcelsPackage.SHIPMENT_SIZE:
				return createShipmentSizeFromString(eDataType, initialValue);
			case ParcelsPackage.PARCEL_STATE:
				return createParcelStateFromString(eDataType, initialValue);
			case ParcelsPackage.PARCEL_DESTINATION_TYPE:
				return createParcelDestinationTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ParcelsPackage.SHIPMENT_SIZE:
				return convertShipmentSizeToString(eDataType, instanceValue);
			case ParcelsPackage.PARCEL_STATE:
				return convertParcelStateToString(eDataType, instanceValue);
			case ParcelsPackage.PARCEL_DESTINATION_TYPE:
				return convertParcelDestinationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivateParcel createPrivateParcel() {
		PrivateParcelImpl privateParcel = new PrivateParcelImpl();
		return privateParcel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessParcel createBusinessParcel() {
		BusinessParcelImpl businessParcel = new BusinessParcelImpl();
		return businessParcel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentSize createShipmentSizeFromString(EDataType eDataType, String initialValue) {
		ShipmentSize result = ShipmentSize.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShipmentSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParcelState createParcelStateFromString(EDataType eDataType, String initialValue) {
		ParcelState result = ParcelState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParcelStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParcelDestinationType createParcelDestinationTypeFromString(EDataType eDataType, String initialValue) {
		ParcelDestinationType result = ParcelDestinationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParcelDestinationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParcelsPackage getParcelsPackage() {
		return (ParcelsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ParcelsPackage getPackage() {
		return ParcelsPackage.eINSTANCE;
	}

} //ParcelsFactoryImpl
