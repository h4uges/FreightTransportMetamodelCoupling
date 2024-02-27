/**
 */
package logiToppMetamodel;

import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;

import logiToppMetamodel.logiTopp.distribution.timetable.TimeTable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.TransportInfrastructure#getTimetable <em>Timetable</em>}</li>
 *   <li>{@link logiToppMetamodel.TransportInfrastructure#getCepServiceProviders <em>Cep Service Providers</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.LogiToppMetamodelPackage#getTransportInfrastructure()
 * @model
 * @generated
 */
public interface TransportInfrastructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Timetable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timetable</em>' containment reference.
	 * @see #setTimetable(TimeTable)
	 * @see logiToppMetamodel.LogiToppMetamodelPackage#getTransportInfrastructure_Timetable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeTable getTimetable();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.TransportInfrastructure#getTimetable <em>Timetable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timetable</em>' containment reference.
	 * @see #getTimetable()
	 * @generated
	 */
	void setTimetable(TimeTable value);

	/**
	 * Returns the value of the '<em><b>Cep Service Providers</b></em>' containment reference list.
	 * The list contents are of type {@link logiToppMetamodel.logiTopp.distribution.CEPServiceProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cep Service Providers</em>' containment reference list.
	 * @see logiToppMetamodel.LogiToppMetamodelPackage#getTransportInfrastructure_CepServiceProviders()
	 * @model containment="true"
	 * @generated
	 */
	EList<CEPServiceProvider> getCepServiceProviders();

} // TransportInfrastructure
