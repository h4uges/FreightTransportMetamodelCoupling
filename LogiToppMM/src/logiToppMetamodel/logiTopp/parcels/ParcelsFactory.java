/**
 */
package logiToppMetamodel.logiTopp.parcels;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see logiToppMetamodel.logiTopp.parcels.ParcelsPackage
 * @generated
 */
public interface ParcelsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParcelsFactory eINSTANCE = logiToppMetamodel.logiTopp.parcels.impl.ParcelsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Private Parcel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Private Parcel</em>'.
	 * @generated
	 */
	PrivateParcel createPrivateParcel();

	/**
	 * Returns a new object of class '<em>Business Parcel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Parcel</em>'.
	 * @generated
	 */
	BusinessParcel createBusinessParcel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ParcelsPackage getParcelsPackage();

} //ParcelsFactory
