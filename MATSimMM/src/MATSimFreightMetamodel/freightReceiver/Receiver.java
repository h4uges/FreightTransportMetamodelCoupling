/**
 */
package MATSimFreightMetamodel.freightReceiver;

import MATSimFreightMetamodel.base.Entity;

import MATSimFreightMetamodel.matsim.core.network.Link;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.Receiver#getPlans <em>Plans</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.Receiver#getProducts <em>Products</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.Receiver#getSelectedPlan <em>Selected Plan</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.Receiver#getMoneyBalance <em>Money Balance</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.freightReceiver.Receiver#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceiver()
 * @model
 * @generated
 */
public interface Receiver extends Entity {
	/**
	 * Returns the value of the '<em><b>Plans</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.freightReceiver.ReceiverPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plans</em>' containment reference list.
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceiver_Plans()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReceiverPlan> getPlans();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.freightReceiver.ReceiverProduct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceiver_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReceiverProduct> getProducts();

	/**
	 * Returns the value of the '<em><b>Selected Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Plan</em>' reference.
	 * @see #setSelectedPlan(ReceiverPlan)
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceiver_SelectedPlan()
	 * @model
	 * @generated
	 */
	ReceiverPlan getSelectedPlan();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightReceiver.Receiver#getSelectedPlan <em>Selected Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Plan</em>' reference.
	 * @see #getSelectedPlan()
	 * @generated
	 */
	void setSelectedPlan(ReceiverPlan value);

	/**
	 * Returns the value of the '<em><b>Money Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Money Balance</em>' attribute.
	 * @see #setMoneyBalance(double)
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceiver_MoneyBalance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getMoneyBalance();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightReceiver.Receiver#getMoneyBalance <em>Money Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Money Balance</em>' attribute.
	 * @see #getMoneyBalance()
	 * @generated
	 */
	void setMoneyBalance(double value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Link)
	 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverPackage#getReceiver_Location()
	 * @model required="true"
	 * @generated
	 */
	Link getLocation();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.freightReceiver.Receiver#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Link value);

} // Receiver
