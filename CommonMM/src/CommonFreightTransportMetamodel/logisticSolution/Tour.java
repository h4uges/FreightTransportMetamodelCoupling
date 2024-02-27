/**
 */
package CommonFreightTransportMetamodel.logisticSolution;

import CommonFreightTransportMetamodel.logisticNetwork.Vehicle;

import CommonFreightTransportMetamodel.utils.HasId_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.Tour#getStops <em>Stops</em>}</li>
 *   <li>{@link CommonFreightTransportMetamodel.logisticSolution.Tour#getVehicle <em>Vehicle</em>}</li>
 * </ul>
 *
 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getTour()
 * @model abstract="true"
 * @generated
 */
public interface Tour extends HasId_ {
	/**
	 * Returns the value of the '<em><b>Stops</b></em>' containment reference list.
	 * The list contents are of type {@link CommonFreightTransportMetamodel.logisticSolution.Stop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stops</em>' containment reference list.
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getTour_Stops()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stop> getStops();

	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' reference.
	 * @see #setVehicle(Vehicle)
	 * @see CommonFreightTransportMetamodel.logisticSolution.LogisticSolutionPackage#getTour_Vehicle()
	 * @model required="true"
	 * @generated
	 */
	Vehicle getVehicle();

	/**
	 * Sets the value of the '{@link CommonFreightTransportMetamodel.logisticSolution.Tour#getVehicle <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle</em>' reference.
	 * @see #getVehicle()
	 * @generated
	 */
	void setVehicle(Vehicle value);

} // Tour
