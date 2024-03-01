package cepmodel.logitopp.extraction.network;

import com.google.common.collect.ImmutableSet;

import logiToppMetamodel.mobiTopp.network.Edge;
import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.NetworkFactory;
import logiToppMetamodel.mobiTopp.network.Node;
import logiToppMetamodel.mobiTopp.network.Point2D;
import logiToppMetamodel.mobiTopp.network.RoadNetwork;
import logiToppMetamodel.mobiTopp.network.Zone;
import logiToppMetamodel.mobiTopp.network.ZoneAndLocation;

public class LogiToppNetworkUtil {
	
	public static Node createNode(String id, double x, double y) {
		Point2D coordinate = NetworkFactory.eINSTANCE.createPoint2D();
		coordinate.setX(x);
		coordinate.setY(y);
		
		Node node = NetworkFactory.eINSTANCE.createNode();
		node.setId(id);
		node.setCoord(coordinate);
		
		return node;
	}
	
	public static Edge createEdge(String id, Node from, Node to, double length) {
		Edge edge = NetworkFactory.eINSTANCE.createEdge();
		edge.setId(id);
		edge.setFrom(from);
		edge.setTo(to);
		edge.setLength(length);
		return edge;
	}
	
	public static RoadNetwork createNetwork(ImmutableSet<Node> nodes, ImmutableSet<Edge> edges, ImmutableSet<Zone> zones) {
		RoadNetwork network = NetworkFactory.eINSTANCE.createRoadNetwork();
		
		network.getNodes().addAll(nodes);
		network.getEdges().addAll(edges);
		network.getZones().addAll(zones);
		return network;
	}
	
	public static Location createLocation(double x, double y, Edge edge, double edgePosition) {
		Location location = NetworkFactory.eINSTANCE.createLocation();
		
		Point2D coordinate = NetworkFactory.eINSTANCE.createPoint2D();
		coordinate.setX(x);
		coordinate.setY(y);
		
		location.setCoordinate(coordinate);
		location.setRoadAccessEdge(edge);
		location.setRoadPosition(edgePosition);
		return location;
	}
	
	public static Zone createZone(String id, String name, Location centroid) {
		Zone zone = NetworkFactory.eINSTANCE.createZone();
		
		zone.setId(id);
		zone.setName(name);
		zone.setCentroid(centroid);
		
		return zone;
	}
	
	public static ZoneAndLocation createZoneAndLocation(Zone zone, Location location) {
		ZoneAndLocation result = NetworkFactory.eINSTANCE.createZoneAndLocation();
		result.setZone(zone);
		result.setLocation(location);
		return result;
	}
}
