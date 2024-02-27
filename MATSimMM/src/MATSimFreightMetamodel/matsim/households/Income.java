/**
 */
package MATSimFreightMetamodel.matsim.households;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Income</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.matsim.households.Income#getPeriod <em>Period</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.households.Income#getIncome <em>Income</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.households.Income#getCurrency <em>Currency</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.matsim.households.HouseholdsPackage#getIncome()
 * @model
 * @generated
 */
public interface Income extends EObject {
	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The literals are from the enumeration {@link MATSimFreightMetamodel.matsim.households.IncomePeriod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see MATSimFreightMetamodel.matsim.households.IncomePeriod
	 * @see #setPeriod(IncomePeriod)
	 * @see MATSimFreightMetamodel.matsim.households.HouseholdsPackage#getIncome_Period()
	 * @model required="true"
	 * @generated
	 */
	IncomePeriod getPeriod();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.households.Income#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see MATSimFreightMetamodel.matsim.households.IncomePeriod
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(IncomePeriod value);

	/**
	 * Returns the value of the '<em><b>Income</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Income</em>' attribute.
	 * @see #setIncome(double)
	 * @see MATSimFreightMetamodel.matsim.households.HouseholdsPackage#getIncome_Income()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getIncome();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.households.Income#getIncome <em>Income</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Income</em>' attribute.
	 * @see #getIncome()
	 * @generated
	 */
	void setIncome(double value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * The literals are from the enumeration {@link MATSimFreightMetamodel.matsim.households.Currency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see MATSimFreightMetamodel.matsim.households.Currency
	 * @see #setCurrency(Currency)
	 * @see MATSimFreightMetamodel.matsim.households.HouseholdsPackage#getIncome_Currency()
	 * @model required="true"
	 * @generated
	 */
	Currency getCurrency();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.households.Income#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see MATSimFreightMetamodel.matsim.households.Currency
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(Currency value);

} // Income
