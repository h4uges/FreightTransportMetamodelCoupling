/**
 */
package CommonFreightTransportMetamodel.population;

import CommonFreightTransportMetamodel.utils.HasId_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.population.Business#getBranches <em>Branches</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.population.PopulationPackage#getBusiness()
 * @model
 * @generated
 */
public interface Business extends HasId_ {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.population.BusinessBranch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.population.PopulationPackage#getBusiness_Branches()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusinessBranch> getBranches();

} // Business
