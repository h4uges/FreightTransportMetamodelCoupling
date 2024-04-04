package m2ttransformation

import MATSimFreightMetamodel.dataExchange.DataExchangePackage
import MATSimFreightMetamodel.dataExchange.DataExchangeRoot
import MATSimFreightMetamodel.freightContrib.Carrier
import MATSimFreightMetamodel.freightContrib.CarrierPlan
import MATSimFreightMetamodel.freightContrib.CarrierService
import MATSimFreightMetamodel.freightContrib.CarrierShipment
import MATSimFreightMetamodel.freightContrib.CarrierVehicle
import MATSimFreightMetamodel.freightContrib.ScheduledTour
import MATSimFreightMetamodel.freightContrib.tour.Delivery
import MATSimFreightMetamodel.freightContrib.tour.End
import MATSimFreightMetamodel.freightContrib.tour.Leg
import MATSimFreightMetamodel.freightContrib.tour.Pickup
import MATSimFreightMetamodel.freightContrib.tour.ServiceActivity
import MATSimFreightMetamodel.freightContrib.tour.Start
import MATSimFreightMetamodel.matsim.core.network.Link
import MATSimFreightMetamodel.matsim.core.network.Network
import MATSimFreightMetamodel.matsim.core.network.Node
import MATSimFreightMetamodel.matsim.vehicles.VehicleType
import MATSimFreightMetamodel.matsim.vehicles.VehicleTypes
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import java.util.Collection
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.ResourceSet
import java.util.stream.Collectors

class MatSimExport {

	def static void main(String[] args) {
		val modelName = "rastatt"
		val inputFolder = Path.of(System.getProperty("user.dir"), "data", modelName).toString
		val outputFolder = Path.of(System.getProperty("user.dir"), "data", modelName).toString
		
		val matSimDataExchangeRoot = loadMatSimModel(inputFolder, modelName);
		buildNetworkFile(matSimDataExchangeRoot, outputFolder, modelName)
		buildVehicleTypesFile(matSimDataExchangeRoot, outputFolder, modelName)
		buildCarriersFile(matSimDataExchangeRoot, outputFolder, modelName)
	}

	// ---- misc ----
	def static String secondsToTimeStamp(double seconds) {
		val int hours = seconds.intValue / 3600
		val int minutes = (seconds.intValue % 3600) / 60
		val int secondsPart = seconds.intValue % 60

		return String::format("%02d:%02d:%02d", hours, minutes, secondsPart)
	}

	def static DataExchangeRoot loadMatSimModel(String inputFolder, String modelName) {
		val resourceSet = createAndInitializeResourceSet()
		val resource = resourceSet.getResource(
			URI.createFileURI(Path.of(inputFolder, modelName + "_matsim.xmi").toString), true)

		if (resource.errors.empty) {
			return resource.contents.get(0) as DataExchangeRoot
		} else {
			throw new IllegalArgumentException("loading model " + modelName + " caused: " + resource.errors.stream.map( e |
				e.message
			).collect(Collectors.joining(", ")))
		}
	}

	def static ResourceSet createAndInitializeResourceSet() {
		val resourceSet = new ResourceSetImpl
		DataExchangePackage.eINSTANCE.eClass();
		resourceSet.getPackageRegistry().put(DataExchangePackage.eNS_URI, DataExchangePackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("dataExchange",
			new XMIResourceFactoryImpl());

		return resourceSet
	}

	// ---- network ----
	def static buildNetworkFile(DataExchangeRoot root, String outputFolder, String modelName) {
		val fileContent = generateNetwork(root.network)
		var filePath = Path.of(outputFolder, "network_" + modelName + ".xml")
		Files.write(filePath, fileContent.toString.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE,
			StandardOpenOption.TRUNCATE_EXISTING)
	}

	// TOOD: temporary removed capacity period
	def static generateNetwork(Network network) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE network SYSTEM "http://www.matsim.org/files/dtd/network_v1.dtd">
		<network>
			<nodes>
				«FOR node : network.nodes»
					«generateNode(node)»
		    	«ENDFOR»
			</nodes>
			<links capperiod="«network.capacityPeriod»" effectivecellsize="«network.effectiveCellSize»" effectivelanewidth="«network.effectiveLaneWidht»">
				«FOR link : network.links»
					«generateLink(link)»
				«ENDFOR»
			</links>
		</network>
	'''

	def static generateNode(Node node) '''
		<node id="«node.id»" x="«node.coord.x»" y="«node.coord.y»"/>
	'''

	// TODO: temporary allow all used modes
	def static generateLink(Link link) '''
		<link id="«generateLinkId(link.id)»" from="«link.from.id»" to="«link.to.id»" length="«link.length»"
		      freespeed="«link.freespeed»" capacity="«link.capacity»" permlanes="«link.nofLanes»" oneway="1" modes="truck, bike, pt"/>
	'''
	
	def static generateLinkId(String linkId) {
		if (linkId.endsWith(":1")) {
            return linkId.substring(0, linkId.length() - 2)
        } else if (linkId.endsWith(":2")) {
            return "-" + linkId.substring(0, linkId.length() - 2)
        } else {
            throw new IllegalArgumentException("invalid link id " + linkId)
        }
	}

	// ---- vehicle types ----
	def static buildVehicleTypesFile(DataExchangeRoot root, String outputFolder, String modelName) {
		val fileContent = generateVehicleTypes(root.vehicleTypes)
		var filePath = Path.of(outputFolder, "vehicleTypes_" + modelName + ".xml")
		Files.write(filePath, fileContent.toString.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE,
			StandardOpenOption.TRUNCATE_EXISTING)
	}

	def static generateVehicleTypes(VehicleTypes vehicleTypes) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<vehicleDefinitions xmlns="http://www.matsim.org/files/dtd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.matsim.org/files/dtd http://www.matsim.org/files/dtd/vehicleDefinitions_v2.0.xsd">
			«FOR vehicleType : vehicleTypes.vehicleTypes»
				«generateVehicleType(vehicleType)»
			«ENDFOR»
		</vehicleDefinitions>
	'''

	def static generateVehicleType(VehicleType vehicleType) '''
		<vehicleType id="«vehicleType.id»">
			<description>«vehicleType.description»</description>
			   <capacity seats="«vehicleType.capacity.seats»" standingRoomInPersons="«vehicleType.capacity.standingRoom»"
			             volumeInCubicMeters="«vehicleType.capacity.volumeInCubicMeters»" weightInTons="«vehicleType.capacity.weightInTons»"
			             other="«vehicleType.capacity.other»"/>
			   <length meter="«vehicleType.length»"/>
			<width meter="«vehicleType.width»"/>
			«generateDummyCostInformation()»
			<networkMode networkMode="«vehicleType.networkMode»"/>
			<flowEfficiencyFactor factor="«vehicleType.flowEfficiencyFactor»"/>
		</vehicleType>
	'''

	def static generateDummyCostInformation() '''
		<costInformation fixedCostsPerDay="20.0" costsPerMeter="0.35" costsPerSecond="30.0"/>
	'''

	def static generateDummyEngineInformation() '''
		<engineInformation>
				<attributes>
					<attribute name="fuelConsumptionLitersPerMeter" class="java.lang.Double">0.02</attribute>
					<attribute name="fuelType" class="org.matsim.vehicles.EngineInformation$FuelType">gasoline</attribute>
				</attributes>
			</engineInformation>
	'''

	// ---- carriers ----
	def static buildCarriersFile(DataExchangeRoot root, String outputFolder, String modelName) {
		val fileContent = generateMATSimCarriers(root.carriers)
		var filePath = Path.of(outputFolder, "carrierPlans_" + modelName + ".xml")
		Files.write(filePath, fileContent.toString.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE,
			StandardOpenOption.TRUNCATE_EXISTING)
	}

	def static generateMATSimCarriers(Collection<Carrier> carriers) '''
		<?xml version="1.0" encoding="utf-8"?>
		
		<carriers xmlns="http://www.matsim.org/files/dtd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.matsim.org/files/dtd http://www.matsim.org/files/dtd/carriersDefinitions_v2.1.xsd">
		    «FOR carrier : carriers»
		    	«generateCarrier(carrier)»
		    «ENDFOR»
		</carriers>
	'''

	def static generateCarrier(Carrier carrier) '''
		<carrier id="«carrier.id»">
		    <capabilities fleetSize="«carrier.carrierCapabilities.fleetSize»">
				<vehicles>
					«FOR vehicle : carrier.carrierCapabilities.carrierVehicles»
						«generateVehicle(vehicle)»
					«ENDFOR»
				</vehicles>
			</capabilities>
			«IF !carrier.services.empty»
			<services>
				«FOR carrierService : carrier.services»
					«generateCarrierService(carrierService)»
				«ENDFOR»
			</services>
			«ENDIF»
			«IF !carrier.shipments.isEmpty»
			<shipments>
			 	«FOR carrierShipment : carrier.shipments»
			 		«generateCarrierShipment(carrierShipment)»
			«ENDFOR»
			</shipments>
			«ENDIF»
			«IF carrier.plan !== null»
			<plans>
				«generateCarrierPlan(carrier.plan)»
			</plans>
			«ENDIF»
		</carrier>
	'''

	def static generateVehicle(CarrierVehicle vehicle) '''
		<vehicle id="«vehicle.id»" depotLinkId="«generateLinkId(vehicle.location.id)»" typeId="«vehicle.type.id»"
			earliestStart="«secondsToTimeStamp(vehicle.earliestStartTime)»" latestEnd="«secondsToTimeStamp(vehicle.latestEndTime)»"/>
	'''

	def static generateCarrierService(CarrierService carrierService) '''
		<service id="«carrierService.id»" to="«generateLinkId(carrierService.location.id)»" capacityDemand="«carrierService.capacityDemand»"
		         earliestStart="«secondsToTimeStamp(carrierService.timeWindow.start)»" latestEnd="«secondsToTimeStamp(carrierService.timeWindow.end)»"
		         serviceDuration="«secondsToTimeStamp(carrierService.serviceDuration)»">
		</service>
	'''

	def static generateCarrierShipment(CarrierShipment carrierShipment) '''
		<shipment id="«carrierShipment.id»" from="«generateLinkId(carrierShipment.from.id)»" to="«generateLinkId(carrierShipment.to.id)»" size="«carrierShipment.size»"
		          startPickup="«secondsToTimeStamp(carrierShipment.pickupTimeWindow.start)»" endPickup="«secondsToTimeStamp(carrierShipment.pickupTimeWindow.end)»"
		          pickupServiceTime="«secondsToTimeStamp(carrierShipment.pickupServiceTime)»"
		          startDelivery="«secondsToTimeStamp(carrierShipment.deliveryTimeWindow.start)»" endDelivery="«secondsToTimeStamp(carrierShipment.deliveryTimeWindow.end)»"
		          deliveryServiceTime="«secondsToTimeStamp(carrierShipment.deliveryServiceTime)»">
		</shipment>
	'''

	def static generateCarrierPlan(CarrierPlan plan) '''
		<plan score="«plan.score»" selected="true">
			«FOR tour : plan.scheduledTours»
				«generateTour(tour)»
			«ENDFOR»
		</plan>
	'''

	def static generateTour(ScheduledTour tour) '''
		<tour tourId="«tour.tour.id»" vehicleId="«tour.vehicle.id»">
			«FOR tourElement : tour.tour.tourElements»
				«IF tourElement instanceof ServiceActivity»
					«generateServiceActivity(tourElement as ServiceActivity)»
				«ENDIF»
				«IF tourElement instanceof Start»
					«generateStart(tourElement as Start, tour.departureTime)»
				«ENDIF»
				«IF tourElement instanceof End»
					«generateEnd(tourElement as End)»
				«ENDIF»
				«IF tourElement instanceof Pickup»
					«generatePickup(tourElement as Pickup)»
				«ENDIF»
				«IF tourElement instanceof Delivery»
					«generateDelivery(tourElement as Delivery)»
				«ENDIF»
				«IF tourElement instanceof Leg»
					«generateLeg(tourElement as Leg)»
				«ENDIF»
			«ENDFOR»
		</tour>
	'''

	def static generateServiceActivity(ServiceActivity serviceActivity) '''
		<act type="service" serviceId="«serviceActivity.service.id»"/>
	'''

	def static generateStart(Start start, double departureTime) '''
		<act type="start" end_time="«secondsToTimeStamp(departureTime)»"/>
	'''

	def static generateEnd(End end) '''
		<act type="end"/>
	'''

	def static generatePickup(Pickup pickup) '''
		<act type="pickup" shipmentId="«pickup.shipment.id»"/>
	'''

	def static generateDelivery(Delivery delivery) '''
		<act type="delivery" shipmentId="«delivery.shipment.id»"/>
	'''

	def static generateLeg(Leg leg) '''
		<leg expected_dep_time="«secondsToTimeStamp(leg.expectedDepartureTime)»" expected_transp_time="«secondsToTimeStamp(leg.expectedTransportTime)»">
		    <route></route>
		</leg>
	'''
}
