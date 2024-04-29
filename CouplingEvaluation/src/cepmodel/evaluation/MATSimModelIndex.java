package cepmodel.evaluation;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import MATSimFreightMetamodel.dataExchange.DataExchangeRoot;
import MATSimFreightMetamodel.freightContrib.CarrierShipment;
import MATSimFreightMetamodel.freightContrib.ScheduledTour;

class MATSimModelIndex {
	private DataExchangeRoot matSimRoot;

	private Optional<TreeMap<String, CarrierShipment>> id2CarrierShipment;
	private Optional<Map<String, ScheduledTour>> id2Tour;

	public MATSimModelIndex(DataExchangeRoot matSimRoot) {
		this.matSimRoot = matSimRoot;

		id2CarrierShipment = Optional.empty();
		id2Tour = Optional.empty();
	}

	public ScheduledTour getScheduledTour(String id) {
		if (id2Tour.isEmpty()) {
			buildId2Tour();
		}
	
		return id2Tour.get().get(id);
	}

	public CarrierShipment getCarrierShipmentById(String id) {
		return getCarrierShipmentsWhereIdStartsWith(id).stream().filter(shipment -> shipment.getId().equals(id))
				.collect(AssertionHelper.toSingleton());
	}

	public Collection<CarrierShipment> getCarrierShipmentsFromOriginatingId(String originalId) {
		return getCarrierShipmentsWhereIdStartsWith(originalId).stream()
				.filter(carrierShipment -> carrierShipment.getId().equals(originalId)
						|| carrierShipment.getId().startsWith(originalId + "_"))
				.toList();
	}

	private Collection<CarrierShipment> getCarrierShipmentsWhereIdStartsWith(String idPrefix) {
		if (id2CarrierShipment.isEmpty()) {
			buildId2CarrierShipment();
		}
	
		return id2CarrierShipment.get().subMap(idPrefix, idPrefix + Character.MAX_VALUE).values();
	}

	private void buildId2Tour() {
		id2Tour = Optional.of(matSimRoot.getCarriers().stream().flatMap(carrier -> {
			if (carrier.getPlan() == null) {
				return Stream.empty();
			}
			return carrier.getPlan().getScheduledTours().stream();
		}).collect(Collectors.toMap(tour -> tour.getTour().getId(), tour -> tour)));
	
	}

	private void buildId2CarrierShipment() {
		TreeMap<String, CarrierShipment> newMap = matSimRoot.getCarriers().stream()
				.flatMap(carrier -> carrier.getShipments().stream())
				.collect(TreeMap::new, (map, shipment) -> map.put(shipment.getId(), shipment), TreeMap::putAll);
	
		id2CarrierShipment = Optional.of(newMap);
	}

}