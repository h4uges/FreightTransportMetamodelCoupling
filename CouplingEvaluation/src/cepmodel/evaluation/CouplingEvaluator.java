package cepmodel.evaluation;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.hamcrest.number.OrderingComparison.lessThanOrEqualTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import com.google.common.collect.ImmutableList;

import MATSimFreightMetamodel.base.Entity;
import MATSimFreightMetamodel.dataExchange.DataExchangeRoot;
import MATSimFreightMetamodel.freightContrib.Carrier;
import MATSimFreightMetamodel.freightContrib.CarrierService;
import MATSimFreightMetamodel.freightContrib.CarrierShipment;
import MATSimFreightMetamodel.freightContrib.CarrierVehicle;
import MATSimFreightMetamodel.freightContrib.ScheduledTour;
import MATSimFreightMetamodel.freightContrib.tour.Delivery;
import MATSimFreightMetamodel.freightContrib.tour.Leg;
import MATSimFreightMetamodel.freightContrib.tour.Pickup;
import MATSimFreightMetamodel.freightContrib.tour.Tour;
import MATSimFreightMetamodel.matsim.TransportMode;
import MATSimFreightMetamodel.matsim.core.network.Link;
import logiToppMetamodel.base.Weekday;
import logiToppMetamodel.dataExchange.SolutionExchangeRoot;
import logiToppMetamodel.logiTopp.business.Business;
import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;
import logiToppMetamodel.logiTopp.distribution.DistributionCenter;
import logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity;
import logiToppMetamodel.logiTopp.distribution.fleet.DeliveryVehicle;
import logiToppMetamodel.logiTopp.distribution.fleet.VehicleType;
import logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour;
import logiToppMetamodel.logiTopp.parcels.BusinessParcel;
import logiToppMetamodel.logiTopp.parcels.Parcel;
import logiToppMetamodel.logiTopp.parcels.ParcelDestinationType;
import logiToppMetamodel.logiTopp.parcels.ParcelsFactory;
import logiToppMetamodel.logiTopp.parcels.PrivateParcel;
import logiToppMetamodel.logiTopp.parcels.ShipmentSize;
import logiToppMetamodel.mobiTopp.citizens.Person;
import logiToppMetamodel.mobiTopp.network.Edge;
import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Node;

// evaluation of relations between logiToppMetamodel (source) and MATSimMetamodel (target)
// assumption: source and target model are consistent regarding their 
// assumption: order of common transformations "split transport chains" before "to single day"
public class CouplingEvaluator {
	private static double coordinatePrecission = 0.0000001;
	private static double edgeLengthPrecission = 0.0000001;
	private static double timePrecission = 0.0000001;

	private static Weekday requestedSimulationDay;
	private static SolutionExchangeRoot logiToppRoot;
	private static LogiToppModelIndex logiToppModelIndex;
	private static DataExchangeRoot matSimRoot;
	private static MATSimModelIndex matSimModelIndex;

	@Rule
	public ErrorCollector collector = new ErrorCollector();

	/*
	 * input models are in data directory
	 * LogiTopp model file name: MODELNAME_logiTopp.xmi
	 * MATSim model file name: MODELNAME_day_REQUESTEDSIMULATIONDAY_matsim.xmi
	 * (REQUESTEDSIMULATIONDAY as integer)
	 */
	@BeforeClass
	public static void init() {
		String mainPath = System.getProperty("user.dir") + "/data/";
		String modelName = "rastatt";
		requestedSimulationDay = Weekday.THURSDAY;

		logiToppRoot = HandelModelService
				.loadLogiToppModel(Path.of(mainPath, modelName, modelName + "_logitopp.xmi").toString());
		matSimRoot = HandelModelService.loadMATSimModel(
				Path.of(mainPath, modelName, modelName + "_day_" + requestedSimulationDay.ordinal() + "_matsim.xmi")
						.toString());

		matSimModelIndex = new MATSimModelIndex(matSimRoot);
		logiToppModelIndex = new LogiToppModelIndex(logiToppRoot);
	}

	/*
	 * C1
	 */
	@Test
	public void testNetworkNodes() {
		Collection<Node> logiToppNodes = ImmutableList.copyOf(logiToppRoot.getNetwork().getNodes());
		Map<String, MATSimFreightMetamodel.matsim.core.network.Node> matSimNodes = matSimRoot.getNetwork().getNodes()
				.stream().collect(Collectors.toUnmodifiableMap(Entity::getId, node -> node));

		logiToppNodes.forEach(logiToppNode -> {
			// check corresponding node exists
			assertTrue(matSimNodes.containsKey(logiToppNode.getId()),
					"Missing node %s in MATSim".formatted(logiToppNode.getId()));
			MATSimFreightMetamodel.matsim.core.network.Node matSimNode = matSimNodes.get(logiToppNode.getId());

			// check coordinate
			assertEquals(logiToppNode.getCoord().getX(), matSimNode.getCoord().getX(), coordinatePrecission);
			assertEquals(logiToppNode.getCoord().getY(), matSimNode.getCoord().getY(), coordinatePrecission);

		});

		// check no additional nodes exist
		assertIdSetEquality(logiToppNodes, matSimRoot.getNetwork().getNodes(), "nodes");
	}

	/*
	 * C2
	 */
	@Test
	public void testNetworkEdges() {
		Collection<Edge> logiToppEdges = logiToppRoot.getNetwork().getEdges();
		Map<String, Link> matSimLinks = matSimRoot.getNetwork().getLinks().stream()
				.collect(Collectors.toUnmodifiableMap(Entity::getId, link -> link));

		logiToppEdges.forEach(logiToppEdge -> {
			// check corresponding edge exists
			assertTrue(matSimLinks.containsKey(logiToppEdge.getId()),
					"Missing link %s in MATSim".formatted(logiToppEdge.getId()));
			Link matSimLink = matSimLinks.get(logiToppEdge.getId());

			// check to, from, length
			assertEquals(logiToppEdge.getFrom().getId(), matSimLink.getFrom().getId());
			assertEquals(logiToppEdge.getTo().getId(), matSimLink.getTo().getId());
			assertEquals(logiToppEdge.getLength(), matSimLink.getLength(), edgeLengthPrecission);
		});

		// check no additional edges exist
		assertIdSetEquality(logiToppEdges, matSimRoot.getNetwork().getLinks(), "edges");
	}

	/*
	 * C3
	 */
	@Test
	public void testPopulationLocationOfReceivingBusiness() {
		List<BusinessParcel> relevantLogiToppParcels = logiToppRoot.getDemand().getParcels().stream()
				.filter(BusinessParcel.class::isInstance).map(BusinessParcel.class::cast)
				.filter(businessParcel -> !businessParcel.isIsPickup())
				.filter(this::logiToppParcelArrivesAtRequestedSimulationDay).toList();

		relevantLogiToppParcels.forEach(logiToppBusinesssParcel -> {
			Business receivingBusiness = (Business) logiToppBusinesssParcel.getConsumer();
			String receivingBusinessEdgeId = receivingBusiness.getLocation().getRoadAccessEdge().getId();

			CarrierShipment correspondingMATSimDeliveryShipment = getLastCorrespondingMatSimCarrierShipment(
					logiToppBusinesssParcel);

			String matSimDestinationId = correspondingMATSimDeliveryShipment.getTo().getId();
			assertEquals(receivingBusinessEdgeId, matSimDestinationId,
					"failed for logiToppParcel with id %s".formatted(logiToppBusinesssParcel.getId()));
		});
	}

	/*
	 * C4
	 */
	@Test
	public void testPopulationLocationOfProducingBusiness() {
		List<BusinessParcel> relevantLogiToppParcels = logiToppRoot.getDemand().getParcels().stream()
				.filter(BusinessParcel.class::isInstance).map(BusinessParcel.class::cast).filter(Parcel::isIsPickup)
				.filter(this::logiToppParcelDepartesAtRequestedSimulationDay).toList();

		relevantLogiToppParcels.forEach(logiToppBusinesssParcel -> {
			Business producingBusiness = (Business) logiToppBusinesssParcel.getProducer();
			String producingBusinessEdgeId = producingBusiness.getLocation().getRoadAccessEdge().getId();

			CarrierShipment correspondingMATSimDeliveryShipment = getFirstCorrespondingMatSimCharrierShipment(
					logiToppBusinesssParcel);

			String matSimOriginId = correspondingMATSimDeliveryShipment.getFrom().getId();
			assertEquals(producingBusinessEdgeId, matSimOriginId,
					"failed for logiToppParcel with id %s".formatted(logiToppBusinesssParcel.getId()));
		});
	}

	/*
	 * C5
	 */
	@Test
	public void testPopulationLocationOfReceivingPerson() {
		List<PrivateParcel> relevantLogiToppParcels = logiToppRoot.getDemand().getParcels().stream()
				.filter(PrivateParcel.class::isInstance).map(PrivateParcel.class::cast)
				.filter(privateParcel -> privateParcel.getDestinationType() == ParcelDestinationType.HOME)
				.filter(this::logiToppParcelArrivesAtRequestedSimulationDay).toList();

		// map that assigns a consumer a packstation location if known
		// reason: due to a bug LogiTopp sometimes clusters destinations wrongly
		Map<logiToppMetamodel.logiTopp.ParcelConsumer, String> personToPackstationLocation = logiToppRoot.getDemand()
				.getParcels().stream().filter(PrivateParcel.class::isInstance).map(PrivateParcel.class::cast)
				.filter(privateParcel -> privateParcel.getDestinationType() == ParcelDestinationType.PACK_STATION)
				.filter(this::logiToppParcelArrivesAtRequestedSimulationDay)
				.collect(Collectors.toMap(Parcel::getConsumer,
						privateParcel -> privateParcel.getZoneAndLocation().getLocation().getRoadAccessEdge().getId(),
						(existingValue, newValue) -> {
							if (existingValue.equals(newValue)) {
								return existingValue;
							}
							throw new IllegalStateException(
									"two packstation locations found: %s and %s".formatted(newValue, existingValue));
						}

				));
		// map that assigns a consumer a work location location if known
		// reason: due to a bug LogiTopp sometimes clusters destinations wrongly
		Map<logiToppMetamodel.logiTopp.ParcelConsumer, String> personToWorkLocation = logiToppRoot.getDemand()
				.getParcels().stream().filter(PrivateParcel.class::isInstance).map(PrivateParcel.class::cast)
				.filter(privateParcel -> privateParcel.getDestinationType() == ParcelDestinationType.WORK)
				.filter(this::logiToppParcelArrivesAtRequestedSimulationDay)
				.collect(Collectors.toMap(Parcel::getConsumer,
						privateParcel -> privateParcel.getZoneAndLocation().getLocation().getRoadAccessEdge().getId(),
						(existingValue, newValue) -> {
							if (existingValue.equals(newValue)) {
								return existingValue;
							}
							throw new IllegalStateException(
									"two packstation locations found: %s and %s".formatted(newValue, existingValue));
						}

				));

		relevantLogiToppParcels.forEach(logiToppPrivateParcel -> {
			Person receivingPerson = (Person) logiToppPrivateParcel.getConsumer();
			String receivingPersonEdgeId = receivingPerson.getHousehold().getLocation().getRoadAccessEdge().getId();

			CarrierShipment correspondingMATSimDeliveryShipment = getLastCorrespondingMatSimCarrierShipment(
					logiToppPrivateParcel);
			String matSimDestinationId = correspondingMATSimDeliveryShipment.getTo().getId();

			// ignore failures due to wrong stop location clustering in logiTopp and also
			// allow packstation and work location as valid destination
			String optionalPackstationLocation = personToPackstationLocation
					.containsKey(logiToppPrivateParcel.getConsumer())
							? personToPackstationLocation.get(logiToppPrivateParcel.getConsumer())
							: "invalidId";
			String optionalWorkLocation = personToWorkLocation.containsKey(logiToppPrivateParcel.getConsumer())
					? personToWorkLocation.get(logiToppPrivateParcel.getConsumer())
					: "invalidId";
			collector.checkThat("failed for logiToppParcel with id %s".formatted(logiToppPrivateParcel.getId()),
					matSimDestinationId, anyOf(equalTo(receivingPersonEdgeId), equalTo(optionalPackstationLocation),
							equalTo(optionalWorkLocation)));
		});
	}

	/*
	 * C6
	 */
	@Test
	public void testCEPSPs() {
		Collection<CEPServiceProvider> logiToppCEPSPs = logiToppRoot.getTransportNetwork().getCepServiceProviders();
		Map<String, Carrier> matSimCarriers = matSimRoot.getCarriers().stream()
				.collect(Collectors.toMap(Entity::getId, carrier -> carrier));

		logiToppCEPSPs.forEach(logiToppCEPSP -> {
			// check corresponding CEPSPs exists
			assertTrue(matSimCarriers.containsKey(logiToppCEPSP.getId()),
					"Missing carrier %s in MATSim".formatted(logiToppCEPSP.getId()));
			Carrier matSimCarrier = matSimCarriers.get(logiToppCEPSP.getId());

			assertEquals(logiToppCEPSP.getName(), matSimCarrier.getId());
		});

		// check no additional CEPSP exists
		assertIdSetEquality(logiToppCEPSPs, matSimRoot.getCarriers(), "CEPSPs");
	}

	/*
	 * C7
	 */
	@Test
	public void testLogisticNetworkVehicles() {
		Collection<DeliveryVehicle> allLogiToppDeliveryVehicles = getAllSubelementsElementsOfType(DeliveryVehicle.class,
				logiToppRoot);
		Map<String, CarrierVehicle> allMatSimCarrierVehicles = getAllSubelementsElementsOfType(CarrierVehicle.class,
				matSimRoot).stream().collect(Collectors.toMap(Entity::getId, v -> v));

		allLogiToppDeliveryVehicles.forEach(logiToppDeliveryVehicle -> {
			// check correspondent vehicle exists
			assertTrue(allMatSimCarrierVehicles.containsKey(logiToppDeliveryVehicle.getId()),
					"Missing carrier vehicle %s in MATSim".formatted(logiToppDeliveryVehicle.getId()));
			CarrierVehicle correspondingCarrierVehicle = allMatSimCarrierVehicles.get(logiToppDeliveryVehicle.getId());

			DistributionCenter logiToppDistributionCenter = (DistributionCenter) logiToppDeliveryVehicle.eContainer()
					.eContainer();
			CEPServiceProvider logiToppCEPSP = logiToppDistributionCenter.getCEPSP();
			VehicleType logiToppVehicleType = logiToppDeliveryVehicle.getVehicleType();

			// check capacity
			// we ignore this property for TRAMs due to changes in LogiTopp during our
			// implementation (introduction of boxes with capacities instead of TRAMs that
			// have a capacity)
			if (logiToppVehicleType != VehicleType.TRAM) {
				assertEquals(correspondingVehicleCapacity(logiToppVehicleType),
						correspondingCarrierVehicle.getType().getCapacity().getOther(),
						"capacity.other: failed for logiTopp delivery vehicle with id %s"
								.formatted(logiToppDeliveryVehicle.getId()));
			}

			// check vehicle type
			assertEquals(correspondingTransportMode(logiToppVehicleType),
					correspondingCarrierVehicle.getType().getNetworkMode(),
					"transport mode: failed for logiTopp delivery vehicle with id %s"
							.formatted(logiToppDeliveryVehicle.getId()));

			// check start time
			assertEquals(LogiToppHelper.timeToSecondWithinDay(logiToppDeliveryVehicle.getEarliestStartTime()),
					correspondingCarrierVehicle.getEarliestStartTime(), timePrecission,
					"earliest start time: failed for logiTopp deliveriy vehicle with id %s"
							.formatted(logiToppDeliveryVehicle.getId()));

			// check end time
			assertEquals(LogiToppHelper.timeToSecondWithinDay(logiToppDeliveryVehicle.getLatestEndTime()),
					correspondingCarrierVehicle.getLatestEndTime(), timePrecission,
					"earliest start time: failed for logiTopp deliveriy vehicle with id %s"
							.formatted(logiToppDeliveryVehicle.getId()));

			// check location
			assertEquals(logiToppDistributionCenter.getLocation().getRoadAccessEdge().getId(),
					correspondingCarrierVehicle.getLocation().getId(),
					"location: failed for logiTopp delivery vehicle with id %s"
							.formatted(logiToppDeliveryVehicle.getId()));

			// check CEPSP
			assertEquals(logiToppCEPSP.getId(),
					((Carrier) correspondingCarrierVehicle.eContainer().eContainer()).getId(),
					"correct CEPSP: failed for logiTopp delivery vehicle with id %s"
							.formatted(logiToppDeliveryVehicle.getId()));
		});

		// check no additional carrier vehicle exists
		assertIdSetEquality(allLogiToppDeliveryVehicles,
				getAllSubelementsElementsOfType(CarrierVehicle.class, matSimRoot), "delivery vehicles");
	}

	/*
	 * C8
	 * TODO: fix description of road access edge in Thesis
	 */
	@Test
	public void testShipments() {
		Collection<ParcelRecordEntry> relevantParcelRecordEntries = logiToppModelIndex.getAllParcelRecordEntries()
				.stream().filter(parcelRecordEntry -> parcelRecordEntry.inSlice(requestedSimulationDay)).toList();

		relevantParcelRecordEntries.forEach(parcelRecordEntry -> {
			Parcel parcel = parcelRecordEntry.getRecord().getParcel();
			String matSimShipmentId = parcelRecordEntry.getRecord().getEntries().size() > 1
					? parcel.getId() + "_" + parcelRecordEntry.getNo()
					: parcel.getId();

			// check corresponding shipment exists
			CarrierShipment correspondingCarrierShipment = matSimModelIndex.getCarrierShipmentById(matSimShipmentId);
			assertNotNull(correspondingCarrierShipment,
					"missing MATSim CarrierShipment with id %s".formatted(matSimShipmentId));

			// check size
			collector.checkThat(
					"size not mapped correctly for LogiTopp Parcel with id %s and corresponding MATSim CarrierShipment %s"
							.formatted(parcel.getId(), correspondingCarrierShipment.getId()),
					correspondingCarrierShipment.getSize(),
					equalTo(correspondingShipmentSize(parcel.getShipmentSize())));

			// check pickup stop location
			collector.checkThat(
					"from id not correct for LogiTopp Parcel with id %s and corresponding MATSim CarrierShipment %s"
							.formatted(parcel.getId(), correspondingCarrierShipment.getId()),
					correspondingCarrierShipment.getFrom().getId(),
					equalTo(parcelRecordEntry.getPickUp().getStopLocation().getLocation().getRoadAccessEdge().getId()));

			// check delivery stop location
			collector.checkThat(
					"to id not correct for LogiTopp Parcel with id %s and corresponding MATSim CarrierShipment %s"
							.formatted(parcel.getId(), correspondingCarrierShipment.getId()),
					correspondingCarrierShipment.getTo().getId(), equalTo(parcelRecordEntry.getDelivery()
							.getStopLocation().getLocation().getRoadAccessEdge().getId()));

			// check carrier
			collector.checkThat(
					"responsible CEPS not correct for LogiTopp Parcel with id %s and corresponding MATSim CarrierShipment %s"
							.formatted(parcel.getId(), correspondingCarrierShipment.getId()),
					((Carrier) correspondingCarrierShipment.eContainer()).getId(),
					equalTo(parcelRecordEntry.getTour().getDistributionCenter().getCEPSP().getId()));

			// check pickup time window
			if (parcelRecordEntry.getPrevious().isPresent()) {
				collector.checkThat(
						"MATSim CarrierShipment %s has previous leg and pickupTimeWindow.start not >= previous arrival"
								.formatted(correspondingCarrierShipment.getId()),
						secondsInSimulationDayContext(correspondingCarrierShipment.getPickupTimeWindow().getStart(),
								requestedSimulationDay),
						greaterThanOrEqualTo(
								LogiToppHelper.timeToSeconds(parcelRecordEntry.getPrevious().get().getEnd())));
			} else {
				double expectedArrivalAtOrigin = parcelRecordEntry.getRecord().getParcel().getArrivalAtOrigin()
						.getDay() == requestedSimulationDay
								? LogiToppHelper.timeToSecondWithinDay(
										parcelRecordEntry.getRecord().getParcel().getArrivalAtOrigin())
								: 0;
				collector.checkThat(
						"arrival at origin inconsistent for MATSimCarrierShipment %s"
								.formatted(correspondingCarrierShipment.getId()),
						correspondingCarrierShipment.getPickupTimeWindow().getStart(),
						equalTo(expectedArrivalAtOrigin));
			}

			// check delivery time window
			if (parcelRecordEntry.getNext().isPresent()) {
				collector.checkThat(
						"MATSim CarrierShipment %s as subsequent leg and deliveryTimeWindo.end not <= next departure"
								.formatted(correspondingCarrierShipment.getId()),
						secondsInSimulationDayContext(correspondingCarrierShipment.getDeliveryTimeWindow().getEnd(),
								requestedSimulationDay),
						// add a tolerance by the delivery duration + minimal default transhipment time
						// (1 minute) as LogiTopp has a bug and does not consider the delivery duration
						// properly
						lessThanOrEqualTo(LogiToppHelper.timeToSeconds(
								LogiToppHelper.addMinutesToTime(parcelRecordEntry.getNext().get().getStart(),
										parcelRecordEntry.getDelivery().getDeliveryDuration() + 1))));

			} else {
				collector.checkThat(
						"deliveryTimeWindow ends at/before end of pickup time window in MATSim CarrierShipment %s"
								.formatted(correspondingCarrierShipment.getId()),
						correspondingCarrierShipment.getDeliveryTimeWindow().getEnd(),
						greaterThan(correspondingCarrierShipment.getPickupTimeWindow().getStart()));
			}
		});

		// check no additional carrier shipment exists
		Collection<CarrierShipment> allMATSimCarrierShipments = getAllSubelementsElementsOfType(CarrierShipment.class,
				matSimRoot);
		Collection<Parcel> allRelevantLogiToppDummySplitParcels = relevantParcelRecordEntries.stream()
				.map(parcelRecordEntry -> parcelRecordEntry.getRecord().getEntries().size() > 1
						? parcelRecordEntry.getRecord().getParcel().getId() + "_" + parcelRecordEntry.getNo()
						: parcelRecordEntry.getRecord().getParcel().getId())
				.map(id -> {
					Parcel dummySplitParcel = ParcelsFactory.eINSTANCE.createPrivateParcel();
					dummySplitParcel.setId(id);
					return dummySplitParcel;
				}).toList();
		assertIdSetEquality(allRelevantLogiToppDummySplitParcels, allMATSimCarrierShipments, "parcels");
	}

	/*
	 * C9
	 */
	@Test
	public void testNoServices() {
		assertTrue(getAllSubelementsElementsOfType(CarrierService.class, matSimRoot).isEmpty(),
				"expect no Carrier Services in MATSim model");
	}

	/*
	 * C10
	 */
	@Test
	public void testTours() {
		Collection<PlannedDeliveryTour> allRelevantLogiToppTours = logiToppModelIndex.getAllParcelRecordEntries()
				.stream().filter(parcelRecordEntry -> parcelRecordEntry.inSlice(requestedSimulationDay))
				.map(ParcelRecordEntry::getTour).toList();
		Collection<Tour> allMATSimTours = getAllSubelementsElementsOfType(Tour.class, matSimRoot);

		allRelevantLogiToppTours.forEach(logiToppTour -> {
			// check corresponding tour exists
			ScheduledTour correspondingMATSimTour = matSimModelIndex.getScheduledTour(logiToppTour.getId());
			assertNotNull(correspondingMATSimTour,
					"no corresponing tour for LogiTopp tour %s".formatted(logiToppTour.getId()));

			// check vehicle
			assertEquals(logiToppTour.getStops().getFirst().getVehicle().getId(),
					correspondingMATSimTour.getVehicle().getId(),
					"wrong vehicle for tour with id %s".formatted(logiToppTour.getId()));
		});

		// check no additional tour exists
		assertIdSetEquality(allRelevantLogiToppTours, allMATSimTours, "tours");
	}

	/*
	 * C11
	 */
	@Test
	public void testPickUpStops() {
		Collection<ParcelRecordEntry> allRelevantParcelRecordEntries = logiToppModelIndex.getAllParcelRecordEntries()
				.stream().filter(parcelRecordEntry -> parcelRecordEntry.inSlice(requestedSimulationDay)).toList();
		Map<String, Pickup> id2Pickup = getAllSubelementsElementsOfType(Pickup.class, matSimRoot).stream()
				.collect(Collectors.toMap(pickup -> pickup.getShipment().getId(), pickup -> pickup));

		allRelevantParcelRecordEntries.forEach(parcelRecordEntry -> {
			ParcelActivity logiToppPickUp = parcelRecordEntry.getPickUp();
			Parcel parcel = parcelRecordEntry.getRecord().getParcel();
			String matSimShipmentId = parcelRecordEntry.getRecord().getEntries().size() > 1
					? parcel.getId() + "_" + parcelRecordEntry.getNo()
					: parcel.getId();

			// check corresponding pickup stop exists
			Pickup correspondingPickup = id2Pickup.get(matSimShipmentId);
			assertNotNull(correspondingPickup,
					"missing MATSim PickUp with for shipment with id %s".formatted(matSimShipmentId));
			Tour correspondingTour = (Tour) correspondingPickup.eContainer();

			// check tour
			assertEquals(parcelRecordEntry.getTour().getId(), correspondingTour.getId(),
					"wrong tour for pickup of shipment %s".formatted(matSimShipmentId));

			// check arrivalTime
			assertTrue(
					LogiToppHelper.timeToSecondWithinDay(logiToppPickUp.getPlannedTime()) <= correspondingPickup
							.getExpectedArrivalTime()
							&& correspondingPickup.getExpectedArrivalTime() <= LogiToppHelper.timeToSecondWithinDay(
									LogiToppHelper.addMinutesToTime(logiToppPickUp.getPlannedTime(),
											logiToppPickUp.getDeliveryDuration())),
					"wrong arrival time for pickup of shipment %s".formatted(matSimShipmentId));

			// check departureTime
			int pickupIndex = correspondingTour.getTourElements().indexOf(correspondingPickup);
			Leg subsequentLeg = correspondingTour.getTourElements().stream().skip(pickupIndex)
					.filter(Leg.class::isInstance).map(Leg.class::cast).findFirst().get();
			assertTrue(
					subsequentLeg.getExpectedDepartureTime() <= LogiToppHelper.timeToSecondWithinDay(LogiToppHelper
							.addMinutesToTime(logiToppPickUp.getPlannedTime(), logiToppPickUp.getDeliveryDuration())),
					"wrong departure time for pickup of shipment %s".formatted(matSimShipmentId));
		});

		Collection<Pickup> allMATSimPickups = getAllSubelementsElementsOfType(Pickup.class, matSimRoot);
		// check only one pickup per carrier shipment
		allMATSimPickups.stream().map(pickup -> pickup.getShipment().getId())
				.collect(assertToSetWithoutDuplicates("pickedup shipments"));
		// check "vice versa"
		assertEquals(allRelevantParcelRecordEntries.size(), allMATSimPickups.size(), "additional pickup in MATSim");
	}

	/*
	 * C12
	 */
	@Test
	public void testDeliveryStops() {
		Set<ParcelRecordEntry> allRelevantParcelRecordEntries = logiToppModelIndex.getAllParcelRecordEntries().stream()
				.filter(parcelRecordEntry -> parcelRecordEntry.inSlice(requestedSimulationDay))
				.collect(Collectors.toSet());
		Map<String, Delivery> id2Delivery = getAllSubelementsElementsOfType(Delivery.class, matSimRoot).stream()
				.collect(Collectors.toMap(delivery -> delivery.getShipment().getId(), pickup -> pickup));

		allRelevantParcelRecordEntries.forEach(parcelRecordEntry -> {
			ParcelActivity logiToppDelivery = parcelRecordEntry.getDelivery();
			Parcel parcel = parcelRecordEntry.getRecord().getParcel();
			String matSimShipmentId = parcelRecordEntry.getRecord().getEntries().size() > 1
					? parcel.getId() + "_" + parcelRecordEntry.getNo()
					: parcel.getId();

			// check corresponding delivery stop exists
			Delivery correspondingDelivery = id2Delivery.get(matSimShipmentId);
			assertNotNull(correspondingDelivery,
					"missing MATSim Delivery with for shipment with id %s".formatted(matSimShipmentId));
			Tour correspondingTour = (Tour) correspondingDelivery.eContainer();

			// check tour
			assertEquals(parcelRecordEntry.getTour().getId(), correspondingTour.getId(),
					"wrong tour for delivery of shipment %s".formatted(matSimShipmentId));

			// check arrivalTime
			assertTrue(
					LogiToppHelper.timeToSecondWithinDay(logiToppDelivery.getPlannedTime()) <= correspondingDelivery
							.getExpectedArrivalTime()
							&& correspondingDelivery.getExpectedArrivalTime() <= LogiToppHelper.timeToSecondWithinDay(
									LogiToppHelper.addMinutesToTime(logiToppDelivery.getPlannedTime(),
											logiToppDelivery.getDeliveryDuration())),
					"wrong arrival time for delivery of shipment %s".formatted(matSimShipmentId));

			// check departureTime
			int deliveryIndey = correspondingTour.getTourElements().indexOf(correspondingDelivery);
			Leg subsequentLeg = correspondingTour.getTourElements().stream().skip(deliveryIndey)
					.filter(Leg.class::isInstance).map(Leg.class::cast).findFirst().get();
			assertTrue(
					subsequentLeg.getExpectedDepartureTime() <= LogiToppHelper
							.timeToSecondWithinDay(LogiToppHelper.addMinutesToTime(logiToppDelivery.getPlannedTime(),
									logiToppDelivery.getDeliveryDuration())),
					"wrong departure time for pickup of shipment %s".formatted(matSimShipmentId));
		});

		Collection<Delivery> allMATSimDeliviers = getAllSubelementsElementsOfType(Delivery.class, matSimRoot);
		// check only one delivery per carrier shipment
		allMATSimDeliviers.stream().map(delivery -> delivery.getShipment().getId())
				.collect(assertToSetWithoutDuplicates("delivered shipments"));
		// check "vice versa"
		assertEquals(allRelevantParcelRecordEntries.size(), allMATSimDeliviers.size(), "additional delivery in MATSim");
	}

	// --- helper: MATSim ---

	private double secondsInSimulationDayContext(double seconds, Weekday requestedSimulationDay) {
		return seconds + requestedSimulationDay.getValue() * 24 * 60 * 60;
	}

	private CarrierShipment getLastCorrespondingMatSimCarrierShipment(Parcel logiToppParcel) {
		Optional<CarrierShipment> lastCorresponding = matSimModelIndex
				.getCarrierShipmentsFromOriginatingId(logiToppParcel.getId()).stream().max((o1, o2) -> Double
						.compare(o1.getPickupTimeWindow().getStart(), o2.getPickupTimeWindow().getStart()));

		if (lastCorresponding.isPresent()) {
			return lastCorresponding.get();
		}

		fail("expected at least one corresponding carrier shipment for logiTopp parcel %s"
				.formatted(logiToppParcel.getId()));
		return null;

	}

	private CarrierShipment getFirstCorrespondingMatSimCharrierShipment(Parcel logiToppParcel) {
		Optional<CarrierShipment> firstCorresponding = matSimModelIndex
				.getCarrierShipmentsFromOriginatingId(logiToppParcel.getId()).stream().min((o1, o2) -> Double
						.compare(o1.getPickupTimeWindow().getStart(), o2.getPickupTimeWindow().getStart()));

		if (firstCorresponding.isPresent()) {
			return firstCorresponding.get();

		}

		fail("expected at least one corresponding carrier shipment for logiTopp parcel %s"
				.formatted(logiToppParcel.getId()));
		return null;
	}

	// --- helper: logiTopp ---

	private boolean logiToppParcelArrivesAtRequestedSimulationDay(Parcel parcel) {
		ParcelRecord parcelRecord = logiToppModelIndex.getParcelRecordForParcel(parcel);
		ParcelRecordEntry lastEntry = parcelRecord.getEntries().getLast();

		// parcel not transported at all
		if (parcelRecord.getEntries().isEmpty()) {
			return false;
		}

		Location finalParcelDestinationLocation = lastEntry.getDelivery().getStopLocation().getLocation();
		Collection<DistributionCenter> allLogiToppDistributionCenters = logiToppModelIndex.getDistributionCenters();
		boolean arrivesAtDistributionCenter = allLogiToppDistributionCenters.stream().anyMatch(dc -> {
			Location dcLocation = dc.getLocation();
			return dcLocation.getRoadAccessEdge().getId()
					.equals(finalParcelDestinationLocation.getRoadAccessEdge().getId())
					&& Math.abs(
							dcLocation.getRoadPosition() - finalParcelDestinationLocation.getRoadPosition()) < 0.00001;
		});
		// parcels transport terminates at a distribution center thus is not transported
		// to the receiver
		if (arrivesAtDistributionCenter && !parcel.isIsPickup()) {
			return false;
		}

		// parcel does not arrive within requested simulation day
		return lastEntry.inSlice(requestedSimulationDay);
	}

	private boolean logiToppParcelDepartesAtRequestedSimulationDay(Parcel parcel) {
		ParcelRecord parcelRecord = logiToppModelIndex.getParcelRecordForParcel(parcel);

		if (parcelRecord.getEntries().isEmpty()) {
			return false;
		}

		ParcelRecordEntry firstEntry = parcelRecord.getEntries().getFirst();

		return firstEntry.inSlice(requestedSimulationDay);
	}

	// --- helper equivalences

	private TransportMode correspondingTransportMode(VehicleType logiToppVehicleType) {
		switch (logiToppVehicleType) {
		case BIKE: {
			return TransportMode.BIKE;
		}
		case TRUCK: {
			return TransportMode.TRUCK;
		}
		case TRAM: {
			return TransportMode.PT;
		}
		default:
			throw new IllegalArgumentException("Unexpected/Unhandled value: " + logiToppVehicleType);
		}
	}

	private double correspondingVehicleCapacity(VehicleType logiToppVehicleType) {
		switch (logiToppVehicleType) {
		case BIKE: {
			return 120 * 80 * 940.0;
		}
		case TRUCK: {
			return 12 * 100 * 100 * 100.0;
		}
		default:
			throw new IllegalArgumentException("Unexpected/Unhandled value: " + logiToppVehicleType);
		}
	}

	private int correspondingShipmentSize(ShipmentSize size) {
		switch (size) {
		case SMALL: {
			return 420 + (18240 - 420) / 2;
		}
		case MEDIUM: {
			return 18240 + (38760 - 18240) / 2;
		}
		case LARGE: {
			return 38760 + (82080 - 38760) / 2;
		}
		case EXTRA_LARGE: {
			return 820080 + (171000 - 820080) / 2;
		}
		case PALLET: {
			return 0;
		}
		case CONTAINER: {
			return 0;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + size);
		}
	}

	// --- helper assert ---

	private static <T1 extends logiToppMetamodel.base.Entity, T2 extends MATSimFreightMetamodel.base.Entity> void assertIdSetEquality(
			Collection<T1> logiToppCollection, Collection<T2> matSimCollection, String setName) {

		Set<String> logiToppSet = logiToppCollection.stream().map(logiToppMetamodel.base.Entity::getId)
				.collect(assertToSetWithoutDuplicates("LogiTopp " + setName));
		Set<String> matSimSet = matSimCollection.stream().map(MATSimFreightMetamodel.base.Entity::getId)
				.collect(assertToSetWithoutDuplicates("MATSim " + setName));

		assertEquals(logiToppSet.size(), matSimSet.size(), "%s are not equal".formatted(setName));
		assertTrue(logiToppSet.containsAll(matSimSet) && matSimSet.containsAll(logiToppSet),
				"%s are not equal".formatted(setName));
	}

	private static <T> Collector<T, ?, Set<T>> assertToSetWithoutDuplicates(String setName) {
		return Collectors.collectingAndThen(Collectors.toSet(), set -> {
			Set<T> finalSet = new HashSet<>();
			for (T element : set) {
				boolean noDuplicateFound = finalSet.add(element);
				assertTrue(noDuplicateFound, "Duplicate element %s found in %s".formatted(element, setName));
			}
			return Collections.unmodifiableSet(finalSet);
		});
	}

	// --- helper model querying ---

	private static <T extends EObject> Collection<T> getAllSubelementsElementsOfType(Class<T> type, EObject root) {
		List<T> result = new ArrayList<>();

		Iterator<EObject> modelIterator = root.eAllContents();
		while (modelIterator.hasNext()) {
			EObject current = modelIterator.next();

			if (type.isInstance(current)) {
				result.add(type.cast(current));
			}
		}
		return result;
	}
}