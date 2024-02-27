/**
 */
package MATSimFreightMetamodel.freightReceiver;

import MATSimFreightMetamodel.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MATSimFreightMetamodel.freightReceiver.FreightReceiverFactory
 * @model kind="package"
 * @generated
 */
public interface FreightReceiverPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "freightReceiver";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cep-model-coupling.com/MATSimFreightMetamodel/reightReceiver";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "freightReceiver";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FreightReceiverPackage eINSTANCE = MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverPackageImpl.init();

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiversImpl <em>Receivers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightReceiver.impl.ReceiversImpl
	 * @see MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverPackageImpl#getReceivers()
	 * @generated
	 */
	int RECEIVERS = 0;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVERS__RECEIVERS = 0;

	/**
	 * The feature id for the '<em><b>Product Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVERS__PRODUCT_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVERS__DESC = 2;

	/**
	 * The number of structural features of the '<em>Receivers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVERS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Receivers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverImpl <em>Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightReceiver.impl.ReceiverImpl
	 * @see MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverPackageImpl#getReceiver()
	 * @generated
	 */
	int RECEIVER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__PLANS = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__PRODUCTS = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__SELECTED_PLAN = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Money Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__MONEY_BALANCE = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__LOCATION = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightReceiver.impl.ProductTypeImpl <em>Product Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightReceiver.impl.ProductTypeImpl
	 * @see MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverPackageImpl#getProductType()
	 * @generated
	 */
	int PRODUCT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__DESC = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Req Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__REQ_CAPACITY = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Origin Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__ORIGIN_LINK = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverPlanImpl <em>Receiver Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightReceiver.impl.ReceiverPlanImpl
	 * @see MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverPackageImpl#getReceiverPlan()
	 * @generated
	 */
	int RECEIVER_PLAN = 3;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_PLAN__SCORE = 0;

	/**
	 * The feature id for the '<em><b>Time Windows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_PLAN__TIME_WINDOWS = 1;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_PLAN__ORDERS = 2;

	/**
	 * The number of structural features of the '<em>Receiver Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_PLAN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Receiver Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverProductImpl <em>Receiver Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightReceiver.impl.ReceiverProductImpl
	 * @see MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverPackageImpl#getReceiverProduct()
	 * @generated
	 */
	int RECEIVER_PRODUCT = 4;

	/**
	 * The feature id for the '<em><b>Product Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_PRODUCT__PRODUCT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Stock On Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_PRODUCT__STOCK_ON_HAND = 1;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_PRODUCT__POLICY = 2;

	/**
	 * The number of structural features of the '<em>Receiver Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_PRODUCT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Receiver Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightReceiver.ReorderPolicy <em>Reorder Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightReceiver.ReorderPolicy
	 * @see MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverPackageImpl#getReorderPolicy()
	 * @generated
	 */
	int REORDER_POLICY = 5;

	/**
	 * The number of structural features of the '<em>Reorder Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_POLICY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Policy Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_POLICY___GET_POLICY_NAME = 0;

	/**
	 * The operation id for the '<em>Calculate Order Quantity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_POLICY___CALCULATE_ORDER_QUANTITY = 1;

	/**
	 * The number of operations of the '<em>Reorder Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_POLICY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverOrderImpl <em>Receiver Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightReceiver.impl.ReceiverOrderImpl
	 * @see MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverPackageImpl#getReceiverOrder()
	 * @generated
	 */
	int RECEIVER_ORDER = 6;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_ORDER__COST = 0;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_ORDER__CARRIER = 1;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_ORDER__ORDERS = 2;

	/**
	 * The number of structural features of the '<em>Receiver Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_ORDER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Receiver Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MATSimFreightMetamodel.freightReceiver.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MATSimFreightMetamodel.freightReceiver.impl.OrderImpl
	 * @see MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ID = BasePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Receiver Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__RECEIVER_PRODUCT = BasePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDER_QUANTITY = BasePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Daily Order Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__DAILY_ORDER_QUANTITY = BasePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__SERVICE_TIME = BasePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Number Of Weekley Deliveries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__NUMBER_OF_WEEKLEY_DELIVERIES = BasePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = BasePackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = BasePackage.ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightReceiver.Receivers <em>Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receivers</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.Receivers
	 * @generated
	 */
	EClass getReceivers();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.freightReceiver.Receivers#getReceivers <em>Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Receivers</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.Receivers#getReceivers()
	 * @see #getReceivers()
	 * @generated
	 */
	EReference getReceivers_Receivers();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.freightReceiver.Receivers#getProductTypes <em>Product Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Types</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.Receivers#getProductTypes()
	 * @see #getReceivers()
	 * @generated
	 */
	EReference getReceivers_ProductTypes();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightReceiver.Receivers#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.Receivers#getDesc()
	 * @see #getReceivers()
	 * @generated
	 */
	EAttribute getReceivers_Desc();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightReceiver.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.Receiver
	 * @generated
	 */
	EClass getReceiver();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.freightReceiver.Receiver#getPlans <em>Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plans</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.Receiver#getPlans()
	 * @see #getReceiver()
	 * @generated
	 */
	EReference getReceiver_Plans();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.freightReceiver.Receiver#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.Receiver#getProducts()
	 * @see #getReceiver()
	 * @generated
	 */
	EReference getReceiver_Products();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightReceiver.Receiver#getSelectedPlan <em>Selected Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected Plan</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.Receiver#getSelectedPlan()
	 * @see #getReceiver()
	 * @generated
	 */
	EReference getReceiver_SelectedPlan();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightReceiver.Receiver#getMoneyBalance <em>Money Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Money Balance</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.Receiver#getMoneyBalance()
	 * @see #getReceiver()
	 * @generated
	 */
	EAttribute getReceiver_MoneyBalance();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightReceiver.Receiver#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.Receiver#getLocation()
	 * @see #getReceiver()
	 * @generated
	 */
	EReference getReceiver_Location();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightReceiver.ProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Type</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.ProductType
	 * @generated
	 */
	EClass getProductType();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightReceiver.ProductType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.ProductType#getDesc()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightReceiver.ProductType#getReqCapacity <em>Req Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req Capacity</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.ProductType#getReqCapacity()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_ReqCapacity();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightReceiver.ProductType#getOriginLink <em>Origin Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin Link</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.ProductType#getOriginLink()
	 * @see #getProductType()
	 * @generated
	 */
	EReference getProductType_OriginLink();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightReceiver.ReceiverPlan <em>Receiver Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver Plan</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.ReceiverPlan
	 * @generated
	 */
	EClass getReceiverPlan();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightReceiver.ReceiverPlan#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.ReceiverPlan#getScore()
	 * @see #getReceiverPlan()
	 * @generated
	 */
	EAttribute getReceiverPlan_Score();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.freightReceiver.ReceiverPlan#getTimeWindows <em>Time Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Windows</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.ReceiverPlan#getTimeWindows()
	 * @see #getReceiverPlan()
	 * @generated
	 */
	EReference getReceiverPlan_TimeWindows();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.freightReceiver.ReceiverPlan#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orders</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.ReceiverPlan#getOrders()
	 * @see #getReceiverPlan()
	 * @generated
	 */
	EReference getReceiverPlan_Orders();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightReceiver.ReceiverProduct <em>Receiver Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver Product</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.ReceiverProduct
	 * @generated
	 */
	EClass getReceiverProduct();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightReceiver.ReceiverProduct#getProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Type</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.ReceiverProduct#getProductType()
	 * @see #getReceiverProduct()
	 * @generated
	 */
	EReference getReceiverProduct_ProductType();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightReceiver.ReceiverProduct#getStockOnHand <em>Stock On Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stock On Hand</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.ReceiverProduct#getStockOnHand()
	 * @see #getReceiverProduct()
	 * @generated
	 */
	EAttribute getReceiverProduct_StockOnHand();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightReceiver.ReceiverProduct#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Policy</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.ReceiverProduct#getPolicy()
	 * @see #getReceiverProduct()
	 * @generated
	 */
	EReference getReceiverProduct_Policy();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightReceiver.ReorderPolicy <em>Reorder Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reorder Policy</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.ReorderPolicy
	 * @generated
	 */
	EClass getReorderPolicy();

	/**
	 * Returns the meta object for the '{@link MATSimFreightMetamodel.freightReceiver.ReorderPolicy#getPolicyName() <em>Get Policy Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Policy Name</em>' operation.
	 * @see MATSimFreightMetamodel.freightReceiver.ReorderPolicy#getPolicyName()
	 * @generated
	 */
	EOperation getReorderPolicy__GetPolicyName();

	/**
	 * Returns the meta object for the '{@link MATSimFreightMetamodel.freightReceiver.ReorderPolicy#calculateOrderQuantity() <em>Calculate Order Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Order Quantity</em>' operation.
	 * @see MATSimFreightMetamodel.freightReceiver.ReorderPolicy#calculateOrderQuantity()
	 * @generated
	 */
	EOperation getReorderPolicy__CalculateOrderQuantity();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightReceiver.ReceiverOrder <em>Receiver Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver Order</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.ReceiverOrder
	 * @generated
	 */
	EClass getReceiverOrder();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightReceiver.ReceiverOrder#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.ReceiverOrder#getCost()
	 * @see #getReceiverOrder()
	 * @generated
	 */
	EAttribute getReceiverOrder_Cost();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightReceiver.ReceiverOrder#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.ReceiverOrder#getCarrier()
	 * @see #getReceiverOrder()
	 * @generated
	 */
	EReference getReceiverOrder_Carrier();

	/**
	 * Returns the meta object for the containment reference list '{@link MATSimFreightMetamodel.freightReceiver.ReceiverOrder#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orders</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.ReceiverOrder#getOrders()
	 * @see #getReceiverOrder()
	 * @generated
	 */
	EReference getReceiverOrder_Orders();

	/**
	 * Returns the meta object for class '{@link MATSimFreightMetamodel.freightReceiver.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the reference '{@link MATSimFreightMetamodel.freightReceiver.Order#getReceiverProduct <em>Receiver Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver Product</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.Order#getReceiverProduct()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_ReceiverProduct();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightReceiver.Order#getOrderQuantity <em>Order Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Quantity</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.Order#getOrderQuantity()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_OrderQuantity();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightReceiver.Order#getDailyOrderQuantity <em>Daily Order Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Daily Order Quantity</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.Order#getDailyOrderQuantity()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_DailyOrderQuantity();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightReceiver.Order#getServiceTime <em>Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Time</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.Order#getServiceTime()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_ServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link MATSimFreightMetamodel.freightReceiver.Order#getNumberOfWeekleyDeliveries <em>Number Of Weekley Deliveries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Weekley Deliveries</em>'.
	 * @see MATSimFreightMetamodel.freightReceiver.Order#getNumberOfWeekleyDeliveries()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_NumberOfWeekleyDeliveries();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FreightReceiverFactory getFreightReceiverFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiversImpl <em>Receivers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightReceiver.impl.ReceiversImpl
		 * @see MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverPackageImpl#getReceivers()
		 * @generated
		 */
		EClass RECEIVERS = eINSTANCE.getReceivers();

		/**
		 * The meta object literal for the '<em><b>Receivers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVERS__RECEIVERS = eINSTANCE.getReceivers_Receivers();

		/**
		 * The meta object literal for the '<em><b>Product Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVERS__PRODUCT_TYPES = eINSTANCE.getReceivers_ProductTypes();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVERS__DESC = eINSTANCE.getReceivers_Desc();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverImpl <em>Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightReceiver.impl.ReceiverImpl
		 * @see MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverPackageImpl#getReceiver()
		 * @generated
		 */
		EClass RECEIVER = eINSTANCE.getReceiver();

		/**
		 * The meta object literal for the '<em><b>Plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVER__PLANS = eINSTANCE.getReceiver_Plans();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVER__PRODUCTS = eINSTANCE.getReceiver_Products();

		/**
		 * The meta object literal for the '<em><b>Selected Plan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVER__SELECTED_PLAN = eINSTANCE.getReceiver_SelectedPlan();

		/**
		 * The meta object literal for the '<em><b>Money Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVER__MONEY_BALANCE = eINSTANCE.getReceiver_MoneyBalance();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVER__LOCATION = eINSTANCE.getReceiver_Location();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightReceiver.impl.ProductTypeImpl <em>Product Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightReceiver.impl.ProductTypeImpl
		 * @see MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverPackageImpl#getProductType()
		 * @generated
		 */
		EClass PRODUCT_TYPE = eINSTANCE.getProductType();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE__DESC = eINSTANCE.getProductType_Desc();

		/**
		 * The meta object literal for the '<em><b>Req Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE__REQ_CAPACITY = eINSTANCE.getProductType_ReqCapacity();

		/**
		 * The meta object literal for the '<em><b>Origin Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_TYPE__ORIGIN_LINK = eINSTANCE.getProductType_OriginLink();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverPlanImpl <em>Receiver Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightReceiver.impl.ReceiverPlanImpl
		 * @see MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverPackageImpl#getReceiverPlan()
		 * @generated
		 */
		EClass RECEIVER_PLAN = eINSTANCE.getReceiverPlan();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVER_PLAN__SCORE = eINSTANCE.getReceiverPlan_Score();

		/**
		 * The meta object literal for the '<em><b>Time Windows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVER_PLAN__TIME_WINDOWS = eINSTANCE.getReceiverPlan_TimeWindows();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVER_PLAN__ORDERS = eINSTANCE.getReceiverPlan_Orders();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverProductImpl <em>Receiver Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightReceiver.impl.ReceiverProductImpl
		 * @see MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverPackageImpl#getReceiverProduct()
		 * @generated
		 */
		EClass RECEIVER_PRODUCT = eINSTANCE.getReceiverProduct();

		/**
		 * The meta object literal for the '<em><b>Product Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVER_PRODUCT__PRODUCT_TYPE = eINSTANCE.getReceiverProduct_ProductType();

		/**
		 * The meta object literal for the '<em><b>Stock On Hand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVER_PRODUCT__STOCK_ON_HAND = eINSTANCE.getReceiverProduct_StockOnHand();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVER_PRODUCT__POLICY = eINSTANCE.getReceiverProduct_Policy();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightReceiver.ReorderPolicy <em>Reorder Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightReceiver.ReorderPolicy
		 * @see MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverPackageImpl#getReorderPolicy()
		 * @generated
		 */
		EClass REORDER_POLICY = eINSTANCE.getReorderPolicy();

		/**
		 * The meta object literal for the '<em><b>Get Policy Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REORDER_POLICY___GET_POLICY_NAME = eINSTANCE.getReorderPolicy__GetPolicyName();

		/**
		 * The meta object literal for the '<em><b>Calculate Order Quantity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REORDER_POLICY___CALCULATE_ORDER_QUANTITY = eINSTANCE.getReorderPolicy__CalculateOrderQuantity();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightReceiver.impl.ReceiverOrderImpl <em>Receiver Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightReceiver.impl.ReceiverOrderImpl
		 * @see MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverPackageImpl#getReceiverOrder()
		 * @generated
		 */
		EClass RECEIVER_ORDER = eINSTANCE.getReceiverOrder();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVER_ORDER__COST = eINSTANCE.getReceiverOrder_Cost();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVER_ORDER__CARRIER = eINSTANCE.getReceiverOrder_Carrier();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVER_ORDER__ORDERS = eINSTANCE.getReceiverOrder_Orders();

		/**
		 * The meta object literal for the '{@link MATSimFreightMetamodel.freightReceiver.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MATSimFreightMetamodel.freightReceiver.impl.OrderImpl
		 * @see MATSimFreightMetamodel.freightReceiver.impl.FreightReceiverPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Receiver Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__RECEIVER_PRODUCT = eINSTANCE.getOrder_ReceiverProduct();

		/**
		 * The meta object literal for the '<em><b>Order Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ORDER_QUANTITY = eINSTANCE.getOrder_OrderQuantity();

		/**
		 * The meta object literal for the '<em><b>Daily Order Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__DAILY_ORDER_QUANTITY = eINSTANCE.getOrder_DailyOrderQuantity();

		/**
		 * The meta object literal for the '<em><b>Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__SERVICE_TIME = eINSTANCE.getOrder_ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Number Of Weekley Deliveries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__NUMBER_OF_WEEKLEY_DELIVERIES = eINSTANCE.getOrder_NumberOfWeekleyDeliveries();

	}

} //FreightReceiverPackage
