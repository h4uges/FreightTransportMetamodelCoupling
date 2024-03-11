package cepmodel.logitopp.extraction.demand;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.google.common.collect.ImmutableList;

import cepmodel.logitopp.extraction.LogiToppExtractionUtil;
import cepmodel.logitopp.extraction.LogiToppInputFileRegistry;
import cepmodel.logitopp.extraction.network.LogiToppNetworkBuilder;
import cepmodel.logitopp.extraction.network.LogiToppNetworkUtil;
import cepmodel.logitopp.extraction.population.LogiToppPopulationBuilder;
import cepmodel.logitopp.extraction.transportInfrastructure.LogiToppTransportInfrastructureBuilder;
import logiToppMetamodel.base.Time;
import logiToppMetamodel.base.Weekday;
import logiToppMetamodel.dataExchange.Demand;
import logiToppMetamodel.logiTopp.business.Business;
import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;
import logiToppMetamodel.logiTopp.distribution.DistributionCenter;
import logiToppMetamodel.logiTopp.parcels.BusinessParcel;
import logiToppMetamodel.logiTopp.parcels.Parcel;
import logiToppMetamodel.logiTopp.parcels.ParcelDestinationType;
import logiToppMetamodel.logiTopp.parcels.PrivateParcel;
import logiToppMetamodel.logiTopp.parcels.ShipmentSize;
import logiToppMetamodel.mobiTopp.citizens.Person;
import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Zone;
import logiToppMetamodel.mobiTopp.network.ZoneAndLocation;

// TODO: minor - share more code
public class LogiToppDemandBuilder {
	private final Map<String, Parcel> parcels = new HashMap<String, Parcel>();

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
		fileRegisty.parcelOrderBusinessCSVs.forEach(file -> parseParcelOrderBusiness(file));
		fileRegisty.parcelOrdersPrivateCSVs.forEach(file -> parseParcelOrdersPrivate(file));
		fileRegisty.parcelProductionBusinessCSVs.forEach(file -> parseParcelProductionBusiness(file));

		return LogiToppDemandUtil.createDemand(ImmutableList.copyOf(parcels.values()));
	}

	private void parseParcelOrderBusiness(String filePath) {
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setAllowMissingColumnNames(true).setHeader()
						.setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				String parcelId = record.get("ParcelID");

				String producingDcId = record.get("FromId");
				String consumingBusinessId = record.get("ToId");

				double destinationX = Double.valueOf(record.get("ToLocationX"));
				double destinationY = Double.valueOf(record.get("ToLocationY"));
				String destinationEdgeId = record.get("ToEdge");
				double destinationEdgePosition = Double.valueOf(record.get("ToEdgePos"));
				String destinationZoneId = record.get("ToZoneId");

				ShipmentSize size = ShipmentSize.valueOf(record.get("Size"));
				boolean isPickup = false;

				// TODO: MA - change semantic of arrivalDate in MA
				String arrivalAtOriginTimeString = record.get("ArrivalTime").substring(8);
				Weekday arrivalAtOriginDay = Weekday.get(Integer.valueOf(record.get("ArrivalDay")));
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
				LocalTime localTime = LocalTime.parse(arrivalAtOriginTimeString, formatter);
				Time arrivalAtOrigin = LogiToppExtractionUtil.createTime(arrivalAtOriginDay, localTime.getHour(),localTime.getMinute(), localTime.getSecond());

				DistributionCenter producingDistributionCenter = transportInfrastructureBuilder
						.getDistributionCenter(producingDcId);
				CEPServiceProvider responsibleCEPSP = producingDistributionCenter.getCEPSP();
				Business consumingBusiness = populationBuilder.getBusiness(consumingBusinessId);
				Location destinationLocation = networkBuilder.createLocation(destinationX, destinationY,
						destinationEdgeId, destinationEdgePosition);
				Zone destinationZone = networkBuilder.getZone(destinationZoneId);
				ZoneAndLocation destination = LogiToppNetworkUtil.createZoneAndLocation(destinationZone,
						destinationLocation);

				BusinessParcel parcel = LogiToppDemandUtil.createBusinessParcel(parcelId, responsibleCEPSP,
						producingDistributionCenter, consumingBusiness, destination, size, isPickup, arrivalAtOrigin);
				parcels.put(parcelId, parcel);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parseParcelOrdersPrivate(String filePath) {
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setAllowMissingColumnNames(true).setHeader()
						.setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				String parcelId = record.get("ParcelID");

				String producingDcId = record.get("DistributionCenterID");
				String consumerId = record.get("RecipientID");

				double destinationX = Double.valueOf(record.get("DestinationX"));
				double destinationY = Double.valueOf(record.get("DestinationY"));
				String destinationEdgeId = record.get("DestinationEdge");
				double destinationEdgePosition = Double.valueOf(record.get("DestinationEdgePos"));
				String destinationZoneId = record.get("DestinationZone");

				ParcelDestinationType destinationType = ParcelDestinationType.get(record.get("DestinationType"));
				ShipmentSize size = ShipmentSize.valueOf(record.get("Size"));
				boolean isPickup = false;

				// TODO: MA - change semantic of arrivalDate in MA
				String arrivalAtOriginTimeString = record.get("ArrivalTime").substring(8);
				Weekday arrivalAtOriginDay = Weekday.get(Integer.valueOf(record.get("ArrivalDay")));
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
				LocalTime localTime = LocalTime.parse(arrivalAtOriginTimeString, formatter);
				Time arrivalAtOrigin = LogiToppExtractionUtil.createTime(arrivalAtOriginDay, localTime.getHour(),localTime.getMinute(), localTime.getSecond());

				DistributionCenter producingDistributionCenter = transportInfrastructureBuilder
						.getDistributionCenter(producingDcId);
				CEPServiceProvider responsibleCEPSP = producingDistributionCenter.getCEPSP();
				Person consumingPerson = populationBuilder.getPerson(consumerId);
				Location destinationLocation = networkBuilder.createLocation(destinationX, destinationY,
						destinationEdgeId, destinationEdgePosition);
				Zone destinationZone = networkBuilder.getZone(destinationZoneId);
				ZoneAndLocation destination = LogiToppNetworkUtil.createZoneAndLocation(destinationZone,
						destinationLocation);

				PrivateParcel parcel = LogiToppDemandUtil.createPrivateParcel(parcelId, responsibleCEPSP,
						producingDistributionCenter, consumingPerson, destination, size, destinationType, isPickup,
						arrivalAtOrigin);
				parcels.put(parcelId, parcel);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parseParcelProductionBusiness(String filePath) {
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setAllowMissingColumnNames(true).setHeader()
						.setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				String parcelId = record.get("ParcelID");

				String producingBusinessId = record.get("FromId");
				String consumingDistributionCenterId = record.get("ToId");

				double destinationX = Double.valueOf(record.get("ToLocationX"));
				double destinationY = Double.valueOf(record.get("ToLocationY"));
				String destinationEdgeId = record.get("ToEdge");
				double destinationEdgePosition = Double.valueOf(record.get("ToEdgePos"));
				String destinationZoneId = record.get("ToZoneId");

				ShipmentSize size = ShipmentSize.valueOf(record.get("Size"));
				boolean isPickup = true;

				// TODO: MA - change semantic of arrivalDate in MA
				String arrivalAtOriginTimeString = record.get("ArrivalTime").substring(8);
				Weekday arrivalAtOriginDay = Weekday.get(Integer.valueOf(record.get("ArrivalDay")));
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
				LocalTime localTime = LocalTime.parse(arrivalAtOriginTimeString, formatter);
				Time arrivalAtOrigin = LogiToppExtractionUtil.createTime(arrivalAtOriginDay, localTime.getHour(),localTime.getMinute(), localTime.getSecond());

				Business producingBusiness = populationBuilder.getBusiness(producingBusinessId);
				DistributionCenter consumingDistributionCenter = transportInfrastructureBuilder
						.getDistributionCenter(consumingDistributionCenterId);
				CEPServiceProvider responsibleCEPSP = consumingDistributionCenter.getCEPSP();
				Location destinationLocation = networkBuilder.createLocation(destinationX, destinationY,
						destinationEdgeId, destinationEdgePosition);
				Zone destinationZone = networkBuilder.getZone(destinationZoneId);
				ZoneAndLocation destination = LogiToppNetworkUtil.createZoneAndLocation(destinationZone,
						destinationLocation);

				BusinessParcel parcel = LogiToppDemandUtil.createBusinessParcel(parcelId, responsibleCEPSP,
						producingBusiness, consumingDistributionCenter, destination, size, isPickup, arrivalAtOrigin);
				parcels.put(parcelId, parcel);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Parcel getParcel(String parcelId) {
		return parcels.get(parcelId);
	}

}
