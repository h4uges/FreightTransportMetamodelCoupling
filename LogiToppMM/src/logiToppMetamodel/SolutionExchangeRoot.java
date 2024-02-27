/**
 */
package logiToppMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Exchange Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.SolutionExchangeRoot#getSolution <em>Solution</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.LogiToppMetamodelPackage#getSolutionExchangeRoot()
 * @model
 * @generated
 */
public interface SolutionExchangeRoot extends DemandExchangeRoot {
	/**
	 * Returns the value of the '<em><b>Solution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' containment reference.
	 * @see #setSolution(Solution)
	 * @see logiToppMetamodel.LogiToppMetamodelPackage#getSolutionExchangeRoot_Solution()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Solution getSolution();

	/**
	 * Sets the value of the '{@link logiToppMetamodel.SolutionExchangeRoot#getSolution <em>Solution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution</em>' containment reference.
	 * @see #getSolution()
	 * @generated
	 */
	void setSolution(Solution value);

} // SolutionExchangeRoot
