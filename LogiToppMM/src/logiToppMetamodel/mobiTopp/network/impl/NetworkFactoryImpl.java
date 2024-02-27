/**
 */
package logiToppMetamodel.mobiTopp.network.impl;

import logiToppMetamodel.mobiTopp.network.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkFactoryImpl extends EFactoryImpl implements NetworkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NetworkFactory init() {
		try {
			NetworkFactory theNetworkFactory = (NetworkFactory)EPackage.Registry.INSTANCE.getEFactory(NetworkPackage.eNS_URI);
			if (theNetworkFactory != null) {
				return theNetworkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NetworkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NetworkPackage.NODE: return createNode();
			case NetworkPackage.EDGE: return createEdge();
			case NetworkPackage.ROAD_NETWORK: return createRoadNetwork();
			case NetworkPackage.ZONE: return createZone();
			case NetworkPackage.LOCATION: return createLocation();
			case NetworkPackage.ZONE_AND_LOCATION: return createZoneAndLocation();
			case NetworkPackage.ZONE_AREA: return createZoneArea();
			case NetworkPackage.POINT2_D: return createPoint2D();
			case NetworkPackage.POLYGON: return createPolygon();
			case NetworkPackage.LINE: return createLine();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoadNetwork createRoadNetwork() {
		RoadNetworkImpl roadNetwork = new RoadNetworkImpl();
		return roadNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zone createZone() {
		ZoneImpl zone = new ZoneImpl();
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZoneAndLocation createZoneAndLocation() {
		ZoneAndLocationImpl zoneAndLocation = new ZoneAndLocationImpl();
		return zoneAndLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZoneArea createZoneArea() {
		ZoneAreaImpl zoneArea = new ZoneAreaImpl();
		return zoneArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point2D createPoint2D() {
		Point2DImpl point2D = new Point2DImpl();
		return point2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Polygon createPolygon() {
		PolygonImpl polygon = new PolygonImpl();
		return polygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkPackage getNetworkPackage() {
		return (NetworkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NetworkPackage getPackage() {
		return NetworkPackage.eINSTANCE;
	}

} //NetworkFactoryImpl
