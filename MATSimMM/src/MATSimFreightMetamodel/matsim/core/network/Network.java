/**
 */
package MATSimFreightMetamodel.matsim.core.network;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.Network#getNodes <em>Nodes</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.Network#getLinks <em>Links</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.Network#getCapacityPeriod <em>Capacity Period</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.Network#getEffectiveCellSize <em>Effective Cell Size</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.Network#getEffectiveLaneWidht <em>Effective Lane Widht</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.matsim.core.network.NetworkPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.matsim.core.network.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see MATSimFreightMetamodel.matsim.core.network.NetworkPackage#getNetwork_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link MATSimFreightMetamodel.matsim.core.network.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see MATSimFreightMetamodel.matsim.core.network.NetworkPackage#getNetwork_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Capacity Period</b></em>' attribute.
	 * The default value is <code>"3600"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Period</em>' attribute.
	 * @see #setCapacityPeriod(double)
	 * @see MATSimFreightMetamodel.matsim.core.network.NetworkPackage#getNetwork_CapacityPeriod()
	 * @model default="3600" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getCapacityPeriod();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.core.network.Network#getCapacityPeriod <em>Capacity Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity Period</em>' attribute.
	 * @see #getCapacityPeriod()
	 * @generated
	 */
	void setCapacityPeriod(double value);

	/**
	 * Returns the value of the '<em><b>Effective Cell Size</b></em>' attribute.
	 * The default value is <code>"7.5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Cell Size</em>' attribute.
	 * @see #setEffectiveCellSize(double)
	 * @see MATSimFreightMetamodel.matsim.core.network.NetworkPackage#getNetwork_EffectiveCellSize()
	 * @model default="7.5" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getEffectiveCellSize();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.core.network.Network#getEffectiveCellSize <em>Effective Cell Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Cell Size</em>' attribute.
	 * @see #getEffectiveCellSize()
	 * @generated
	 */
	void setEffectiveCellSize(double value);

	/**
	 * Returns the value of the '<em><b>Effective Lane Widht</b></em>' attribute.
	 * The default value is <code>"3.75"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Lane Widht</em>' attribute.
	 * @see #setEffectiveLaneWidht(double)
	 * @see MATSimFreightMetamodel.matsim.core.network.NetworkPackage#getNetwork_EffectiveLaneWidht()
	 * @model default="3.75" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getEffectiveLaneWidht();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.core.network.Network#getEffectiveLaneWidht <em>Effective Lane Widht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Lane Widht</em>' attribute.
	 * @see #getEffectiveLaneWidht()
	 * @generated
	 */
	void setEffectiveLaneWidht(double value);

} // Network
