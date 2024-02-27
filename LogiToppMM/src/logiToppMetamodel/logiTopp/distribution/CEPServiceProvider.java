/**
 */
package logiToppMetamodel.logiTopp.distribution;

import logiToppMetamodel.base.NamedEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CEP Service Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logiToppMetamodel.logiTopp.distribution.CEPServiceProvider#getDistributionCenters <em>Distribution Centers</em>}</li>
 * </ul>
 *
 * @see logiToppMetamodel.logiTopp.distribution.DistributionPackage#getCEPServiceProvider()
 * @model
 * @generated
 */
public interface CEPServiceProvider extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Distribution Centers</b></em>' containment reference list.
	 * The list contents are of type {@link logiToppMetamodel.logiTopp.distribution.DistributionCenter}.
	 * It is bidirectional and its opposite is '{@link logiToppMetamodel.logiTopp.distribution.DistributionCenter#getCEPSP <em>CEPSP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution Centers</em>' containment reference list.
	 * @see logiToppMetamodel.logiTopp.distribution.DistributionPackage#getCEPServiceProvider_DistributionCenters()
	 * @see logiToppMetamodel.logiTopp.distribution.DistributionCenter#getCEPSP
	 * @model opposite="CEPSP" containment="true"
	 * @generated
	 */
	EList<DistributionCenter> getDistributionCenters();

} // CEPServiceProvider
