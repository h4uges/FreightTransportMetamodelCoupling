/**
 */
package MATSimFreightMetamodel.matsim.core.network;

import MATSimFreightMetamodel.base.Entity;

import MATSimFreightMetamodel.matsim.TransportMode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.Link#getFrom <em>From</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.Link#getTo <em>To</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.Link#getLength <em>Length</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.Link#getFreespeed <em>Freespeed</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.Link#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.Link#getNofLanes <em>Nof Lanes</em>}</li>
 *   <li>{@link MATSimFreightMetamodel.matsim.core.network.Link#getAllowedModes <em>Allowed Modes</em>}</li>
 * </ul>
 *
 * @see MATSimFreightMetamodel.matsim.core.network.NetworkPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends Entity {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Node)
	 * @see MATSimFreightMetamodel.matsim.core.network.NetworkPackage#getLink_From()
	 * @model required="true"
	 * @generated
	 */
	Node getFrom();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.core.network.Link#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Node value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Node)
	 * @see MATSimFreightMetamodel.matsim.core.network.NetworkPackage#getLink_To()
	 * @model required="true"
	 * @generated
	 */
	Node getTo();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.core.network.Link#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Node value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(double)
	 * @see MATSimFreightMetamodel.matsim.core.network.NetworkPackage#getLink_Length()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.core.network.Link#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

	/**
	 * Returns the value of the '<em><b>Freespeed</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freespeed</em>' attribute.
	 * @see #setFreespeed(double)
	 * @see MATSimFreightMetamodel.matsim.core.network.NetworkPackage#getLink_Freespeed()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getFreespeed();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.core.network.Link#getFreespeed <em>Freespeed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freespeed</em>' attribute.
	 * @see #getFreespeed()
	 * @generated
	 */
	void setFreespeed(double value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(double)
	 * @see MATSimFreightMetamodel.matsim.core.network.NetworkPackage#getLink_Capacity()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getCapacity();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.core.network.Link#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(double value);

	/**
	 * Returns the value of the '<em><b>Nof Lanes</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nof Lanes</em>' attribute.
	 * @see #setNofLanes(double)
	 * @see MATSimFreightMetamodel.matsim.core.network.NetworkPackage#getLink_NofLanes()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getNofLanes();

	/**
	 * Sets the value of the '{@link MATSimFreightMetamodel.matsim.core.network.Link#getNofLanes <em>Nof Lanes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nof Lanes</em>' attribute.
	 * @see #getNofLanes()
	 * @generated
	 */
	void setNofLanes(double value);

	/**
	 * Returns the value of the '<em><b>Allowed Modes</b></em>' attribute list.
	 * The list contents are of type {@link MATSimFreightMetamodel.matsim.TransportMode}.
	 * The literals are from the enumeration {@link MATSimFreightMetamodel.matsim.TransportMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Modes</em>' attribute list.
	 * @see MATSimFreightMetamodel.matsim.TransportMode
	 * @see MATSimFreightMetamodel.matsim.core.network.NetworkPackage#getLink_AllowedModes()
	 * @model
	 * @generated
	 */
	EList<TransportMode> getAllowedModes();

} // Link
