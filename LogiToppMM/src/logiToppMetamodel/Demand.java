/**
 */
package logiToppMetamodel;

import logiToppMetamodel.logiTopp.parcels.Parcel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Demand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.Demand#getParcels <em>Parcels</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.LogiToppMetamodelPackage#getDemand()
 * @model
 * @generated
 */
public interface Demand extends EObject {
	/**
	 * Returns the value of the '<em><b>Parcels</b></em>' containment reference list.
	 * The list contents are of type {@link logiToppMetamodel.logiTopp.parcels.Parcel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parcels</em>' containment reference list.
	 * @see logiToppMetamodel.LogiToppMetamodelPackage#getDemand_Parcels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parcel> getParcels();

} // Demand
