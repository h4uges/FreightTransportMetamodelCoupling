/**
 */
package logiToppMetamodel;

import logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.Solution#getPlannedTours <em>Planned Tours</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.LogiToppMetamodelPackage#getSolution()
 * @model
 * @generated
 */
public interface Solution extends EObject {
	/**
	 * Returns the value of the '<em><b>Planned Tours</b></em>' containment reference list.
	 * The list contents are of type {@link logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Tours</em>' containment reference list.
	 * @see logiToppMetamodel.LogiToppMetamodelPackage#getSolution_PlannedTours()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlannedDeliveryTour> getPlannedTours();

} // Solution
