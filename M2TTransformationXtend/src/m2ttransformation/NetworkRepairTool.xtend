package m2ttransformation

import MATSimFreightMetamodel.matsim.core.network.Network
import org.jgrapht.graph.DefaultEdge
import org.jgrapht.graph.SimpleGraph

class NetworkRepairTool {
	
	def static void repairNetwork(Network network) {
		repairConnectivity(network)
	}
	
	def private static repairConnectivity(Network network) {
		val graph = new SimpleGraph<Integer, DefaultEdge>(DefaultEdge)
		
		network.nodes.forEach[node |
			graph.addVertex(Integer.parseInt(node.id))
		]
		network.links.forEach[link |
			graph.addEdge(Integer.parseInt(link.from.id), Integer.parseInt(link.to.id))
		]
		
		// TODO: fix
	}
}