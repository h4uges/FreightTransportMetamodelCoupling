package cepmodel.logitopp.extraction.demand;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.google.common.collect.ImmutableList;

import cepmodel.logitopp.extraction.LogiToppBuilderBase;
import cepmodel.logitopp.extraction.LogiToppExtractionUtil;
import cepmodel.logitopp.extraction.LogiToppInputFileRegistry;
import cepmodel.logitopp.extraction.network.LogiToppNetworkBuilder;
import cepmodel.logitopp.extraction.network.LogiToppNetworkUtil;
import cepmodel.logitopp.extraction.population.LogiToppPopulationBuilder;
import cepmodel.logitopp.extraction.transportinfrastructure.LogiToppTransportInfrastructureBuilder;
import logiToppMetamodel.base.Time;
import logiToppMetamodel.base.Weekday;
import logiToppMetamodel.dataExchange.Demand;
import logiToppMetamodel.logiTopp.ParcelConsumer;
import logiToppMetamodel.logiTopp.ParcelProducer;
import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;
import logiToppMetamodel.logiTopp.parcels.Parcel;
import logiToppMetamodel.logiTopp.parcels.ParcelDestinationType;
import logiToppMetamodel.logiTopp.parcels.ShipmentSize;
import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Zone;
import logiToppMetamodel.mobiTopp.network.ZoneAndLocation;

//builds logiTopp demand view type by parsing corresponding input files
public class LogiToppDemandBuilder extends LogiToppBuilderBase {
	private final Map<String, Parcel> parcels = new HashMap<>();

	private final LogiToppNetworkBuilder networkBuilder;
	private final LogiToppTransportInfrastructureBuilder transportInfrastructureBuilder;
	private final LogiToppPopulationBuilder populationBuilder;
	private final LogiToppInputFileRegistry fileRegisty;

	public LogiToppDemandBuilder(LogiToppInputFileRegistry fileRegisty, LogiToppNetworkBuilder networkBuilder,
			LogiToppTransportInfrastructureBuilder transportInfrastructureBuilder,
			LogiToppPopulationBuilder populationBuilder) {
		this.fileRegisty = fileRegisty;
		this.networkBuilder = networkBuilder;
		this.transportInfrastructureBuilder = transportInfrastructureBuilder;
		this.populationBuilder = populationBuilder;
	}

	public Demand createDemand() {
		fileRegisty.parcelOrderBusinessCSVs.forEach(this::parseParcelOrderBusiness);
		fileRegisty.parcelOrdersPrivateCSVs.forEach(this::parseParcelOrdersPrivate);
		fileRegisty.parcelProductionBusinessCSVs.forEach(this::parseParcelProductionBusiness);

		return LogiToppDemandUtil.createDemand(ImmutableList.copyOf(parcels.values()));
	}

	private void parseParcelOrderBusiness(String filePath) {
		parseParcels(filePath, ParcelType.BUSINESS);
	}

	private void parseParcelOrdersPrivate(String filePath) {
		parseParcels(filePath, ParcelType.PRIVATE);
	}

	private void parseParcelProductionBusiness(String filePath) {
		parseParcels(filePath, ParcelType.PRODUCTION_BUSINESS);
	}

	private void parseParcels(String filePath, ParcelType parcelType) {
		try (CSVParser csvParser = getCSVParser(filePath)) {
			for (CSVRecord csvEntry : csvParser) {
				Parcel parcel = parseParcel(csvEntry, parcelType);
				parcels.put(parcel.getId(), parcel);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Parcel parseParcel(CSVRecord csvEntry, ParcelType parcelType) {
		String parcelId = csvEntry.get("ParcelID");

		String producingId = csvEntry.get(parcelType.getProducingIdHeader());
		String consumingId = csvEntry.get(parcelType.getConsumingIdHeader());
		ParcelProducer parcelProducer = getParcelProducer(parcelType, producingId);
		ParcelConsumer parcelConsumer = getParcelConsumer(parcelType, consumingId);
		CEPServiceProvider responsibleCEPSP = getResponsibleCEPSP(parcelType, producingId, consumingId);

		double destinationX = Double
				.parseDouble(csvEntry.get(parcelType.getUsesDestinationLocation() ? "DestinationX" : "ToLocationX"));
		double destinationY = Double
				.parseDouble(csvEntry.get(parcelType.getUsesDestinationLocation() ? "DestinationY" : "ToLocationY"));
		String destinationEdgeId = csvEntry.get(parcelType.getUsesDestinationLocation() ? "DestinationEdge" : "ToEdge");
		double destinationEdgePosition = Double.parseDouble(
				csvEntry.get(parcelType.getUsesDestinationLocation() ? "DestinationEdgePos" : "ToEdgePos"));
		String destinationZoneId = csvEntry
				.get(parcelType.getUsesDestinationLocation() ? "DestinationZone" : "ToZoneId");
		ZoneAndLocation destination = createZoneAndLocation(destinationX, destinationY, destinationEdgeId,
				destinationEdgePosition, destinationZoneId);

		ShipmentSize size = ShipmentSize.valueOf(csvEntry.get("Size"));
		boolean isPickup = parcelType.isPickup();
		Time arrivalAtOrigin = parseArrivalTime(csvEntry);

		Parcel parcel;
		if (parcelType == ParcelType.PRIVATE) {
			ParcelDestinationType destinationType = ParcelDestinationType.get(csvEntry.get("DestinationType"));
			parcel = LogiToppDemandUtil.createPrivateParcel(parcelId, responsibleCEPSP, parcelProducer, parcelConsumer,
					destination, size, destinationType, isPickup, arrivalAtOrigin);
		} else {
			parcel = LogiToppDemandUtil.createBusinessParcel(parcelId, responsibleCEPSP, parcelProducer, parcelConsumer,
					destination, size, isPickup, arrivalAtOrigin);
		}
		return parcel;
	}

	private Time parseArrivalTime(CSVRecord csvEntry) {
		String arrivalAtOriginTimeString = csvEntry.get("ArrivalTime").substring(8);
		Weekday arrivalAtOriginDay = Weekday.get(Integer.valueOf(csvEntry.get("ArrivalDay")));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime localTime = LocalTime.parse(arrivalAtOriginTimeString, formatter);
		return LogiToppExtractionUtil.createTime(arrivalAtOriginDay, localTime.getHour(), localTime.getMinute(),
				localTime.getSecond());
	}

	private ZoneAndLocation createZoneAndLocation(double x, double y, String edgeId, double edgePosition,
			String zoneId) {
		Location location = networkBuilder.createLocation(x, y, edgeId, edgePosition);
		Zone zone = networkBuilder.getZone(zoneId);
		return LogiToppNetworkUtil.createZoneAndLocation(zone, location);
	}

	// determine responsibleCEPSP based on parcel type and consumer/producer id
	private CEPServiceProvider getResponsibleCEPSP(ParcelType parcelType, String producingId, String consumingId) {
		switch (parcelType) {
		case PRIVATE: {
			return transportInfrastructureBuilder.getDistributionCenter(producingId).getCEPSP();
		}
		case BUSINESS: {
			return transportInfrastructureBuilder.getDistributionCenter(producingId).getCEPSP();
		}
		case PRODUCTION_BUSINESS: {
			return transportInfrastructureBuilder.getDistributionCenter(consumingId).getCEPSP();
		}
		}
		return null;
	}

	// determine parcel consumer based on parcel type and consumer id
	private ParcelConsumer getParcelConsumer(ParcelType parcelType, String consumingId) {
		switch (parcelType) {
		case PRIVATE: {
			return populationBuilder.getPerson(consumingId);
		}
		case BUSINESS: {
			return populationBuilder.getBusiness(consumingId);
		}
		case PRODUCTION_BUSINESS: {
			return transportInfrastructureBuilder.getDistributionCenter(consumingId);
		}
		}
		return null;
	}

	// determine parcel producer based on parcel type and producer id
	private ParcelProducer getParcelProducer(ParcelType parcelType, String producingDcId) {
		switch (parcelType) {
		case PRIVATE: {
			return transportInfrastructureBuilder.getDistributionCenter(producingDcId);
		}
		case BUSINESS: {
			return transportInfrastructureBuilder.getDistributionCenter(producingDcId);
		}
		case PRODUCTION_BUSINESS: {
			return populationBuilder.getBusiness(producingDcId);
		}
		}
		return null;
	}

	public Parcel getParcel(String parcelId) {
		return parcels.get(parcelId);
	}
}

enum ParcelType {
	// stores information about standard values and different header rows of each
	// parcel types csv
	BUSINESS("FromId", "ToId", false, false), PRIVATE("DistributionCenterID", "RecipientID", false, true),
	PRODUCTION_BUSINESS("FromId", "ToId", true, false);

	private final String producingIdHeader;
	private final String consumingIdHeader;
	private final boolean isPickup;
	private final boolean usesDestinationNotation;

	ParcelType(String producingIdHeader, String consumingIdHeader, boolean isPickup, boolean usesDestinationNotation) {
		this.producingIdHeader = producingIdHeader;
		this.consumingIdHeader = consumingIdHeader;
		this.isPickup = isPickup;
		this.usesDestinationNotation = usesDestinationNotation;
	}

	public String getProducingIdHeader() {
		return producingIdHeader;
	}

	public String getConsumingIdHeader() {
		return consumingIdHeader;
	}

	public boolean isPickup() {
		return isPickup;
	}

	public boolean getUsesDestinationLocation() {
		return usesDestinationNotation;
	}
}