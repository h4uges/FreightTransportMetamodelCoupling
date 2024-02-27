/**
 */
package CommonFreightTransportMetamodel.localEntities;

import CommonFreightTransportMetamodel.utils.HasId_;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.localEntities.Person#getHousehold <em>Household</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends ShipmentConsumerProducer, HasId_ {
	/**
	 * Returns the value of the '<em><b>Household</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CommonFreightTransportMetamodel.localEntities.Household#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Household</em>' container reference.
	 * @see #setHousehold(Household)
	 * @see CommonFreightTransportMetamodel.localEntities.LocalEntitiesPackage#getPerson_Household()
	 * @see CommonFreightTransportMetamodel.localEntities.Household#getMember
	 * @model opposite="member" required="true" transient="false"
	 * @generated
	 */
	Household getHousehold();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.localEntities.Person#getHousehold <em>Household</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Household</em>' container reference.
	 * @see #getHousehold()
	 * @generated
	 */
	void setHousehold(Household value);

} // Person
