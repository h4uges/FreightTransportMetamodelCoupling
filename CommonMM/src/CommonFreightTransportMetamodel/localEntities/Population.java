/**
 */
package CommonFreightTransportMetamodel.localEntities;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Population</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.localEntities.Population#getHouseholds <em>Households</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.localEntities.Population#getBusinesses <em>Businesses</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage#getPopulation()
 * @model
 * @generated
 */
public interface Population extends EObject {
	/**
	 * Returns the value of the '<em><b>Households</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.localEntities.Household}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Households</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage#getPopulation_Households()
	 * @model containment="true"
	 * @generated
	 */
	EList<Household> getHouseholds();

	/**
	 * Returns the value of the '<em><b>Businesses</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.localEntities.Business}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Businesses</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage#getPopulation_Businesses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Business> getBusinesses();

} // Population
