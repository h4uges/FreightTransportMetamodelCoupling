package cepmodel.logitopp.extraction.demand;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.google.common.collect.ImmutableList;

import cepmodel.logitopp.extraction.InputFileRegistry;
import cepmodel.logitopp.extraction.network.LogiToppNetworkBuilder;
import cepmodel.logitopp.extraction.network.LogiToppNetworkUtil;
import cepmodel.logitopp.extraction.population.LogiToppPopulationBuilder;
import logiToppMetamodel.Demand;
import logiToppMetamodel.base.BaseFactory;
import logiToppMetamodel.base.Time;
import logiToppMetamodel.logiTopp.business.Business;
import logiToppMetamodel.logiTopp.parcels.BusinessParcel;
import logiToppMetamodel.logiTopp.parcels.Parcel;
import logiToppMetamodel.logiTopp.parcels.ParcelDestinationType;
import logiToppMetamodel.logiTopp.parcels.PrivateParcel;
import logiToppMetamodel.logiTopp.parcels.ShipmentSize;
import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Zone;
import logiToppMetamodel.mobiTopp.network.ZoneAndLocation;
import logiToppMetamodel.mobiTopp.citizens.Person;

// TODO: share more code
public class LogiToppDemandBuilder {
	private final Map<Integer, Parcel> parcels = new HashMap<Integer, Parcel>();

	private final LogiToppNetworkBuilder networkBuilder;
	private final LogiToppPopulationBuilder populationBuilder;
	private final InputFileRegistry fileRegisty;

	public LogiToppDemandBuilder(InputFileRegistry fileRegisty, LogiToppNetworkBuilder networkBuilder,
			LogiToppPopulationBuilder populationBuilder) {
		this.fileRegisty = fileRegisty;
		this.networkBuilder = networkBuilder;
		this.populationBuilder = populationBuilder;
	}

	public Demand createDemand() {
		fileRegisty.parcelOrderBusinessCSVs.forEach(file -> parseParcelOrderBusiness(file));
		fileRegisty.parcelOrdersPrivateCSVs.forEach(file -> parseParcelOrdersPrivate(file));
		fileRegisty.parcelProductionBusinessCSVs.forEach(file -> parseParcelProductionBusiness(file));

		return LogiToppDemandUtil.createDemand(ImmutableList.copyOf(parcels.values()));
	}

	private void parseParcelOrderBusiness(String filePath) {
		// Format:
		// ParcelID;Size;From;To;FromZoneId;FromLocationX;FromLocationY;ToZoneId;ToLocationX;ToLocationY;ArrivalDay;ArrivalTime;

		try (Reader reader = new FileReader(filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				int parcelId = Integer.valueOf(record.get("ParcelID"));

				// TODO: parcel producer (Distribution Center - only name)
				int consumingBusinessId = Integer.valueOf(record.get("To"));

				double destinationX = Double.valueOf(record.get("ToLocationX"));
				double destinationY = Double.valueOf(record.get("ToLocationY"));
				int destinationZoneId = Integer.valueOf(record.get("ToZoneId"));

				ShipmentSize size = ShipmentSize.valueOf(record.get("Size"));
				boolean isPickup = false;

				// TODO: change semantic of arrivalDate in MA
				String arrivalTimeString = record.get("ArrivalTime");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd HH:mm:ss");
				LocalDateTime localTime = LocalDateTime.parse(arrivalTimeString, formatter);
				Time arrivalTime = BaseFactory.eINSTANCE.createTime();
				arrivalTime.setSeconds(24 * 60 * 60 * (localTime.getDayOfMonth() - 1) + 60 * 60 * localTime.getHour()
						+ 60 * localTime.getMinute() + localTime.getSecond());

				Business consumingBusiness = populationBuilder.getBusiness(consumingBusinessId);
				// TODO: handle edgeId, fixEdgePosition (wait for better input data)
				Location destinationLocation = networkBuilder.createLocation(destinationX, destinationY, 0, 0);
				Zone destinationZone = networkBuilder.getZone(destinationZoneId);
				ZoneAndLocation destination = LogiToppNetworkUtil.createZoneAndLocation(destinationZone,
						destinationLocation);

				BusinessParcel parcel = LogiToppDemandUtil.createBusinessParcel(parcelId, null, consumingBusiness,
						destination, size, isPickup, arrivalTime);
				parcels.put(parcelId, parcel);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parseParcelOrdersPrivate(String filePath) {
		// Format:
		// ParcelID;Size;RecipientID;DestinationType;DestinationZone;DestinationX;DestinationY;ArrivalDay;ArrivalTime;DistributionCenter;DcZone;DcX;DcY;

		try (Reader reader = new FileReader(filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				int parcelId = Integer.valueOf(record.get("ParcelID"));

				// TODO: parcel producer (DistributionCenter - only name)
				int consumerId = Integer.valueOf(record.get("RecipientID"));

				double destinationX = Double.valueOf(record.get("DestinationX"));
				double destinationY = Double.valueOf(record.get("DestinationY"));
				int destinationZoneId = Integer.valueOf(record.get("DestinationZone"));

				ParcelDestinationType destinationType = ParcelDestinationType.get(record.get("DestinationType"));
				ShipmentSize size = ShipmentSize.valueOf(record.get("Size"));
				boolean isPickup = false;

				String arrivalTimeString = record.get("ArrivalTime");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd HH:mm:ss");
				LocalDateTime localTime = LocalDateTime.parse(arrivalTimeString, formatter);
				Time arrivalTime = BaseFactory.eINSTANCE.createTime();
				arrivalTime.setSeconds(24 * 60 * 60 * (localTime.getDayOfMonth() - 1) + 60 * 60 * localTime.getHour()
						+ 60 * localTime.getMinute() + localTime.getSecond());

				Person consumingPerson = populationBuilder.getPerson(consumerId);
				// TODO: handle edgeId, fixEdgePosition (wait for better input data)
				Location destinationLocation = networkBuilder.createLocation(destinationX, destinationY, 0, 0);
				Zone destinationZone = networkBuilder.getZone(destinationZoneId);
				ZoneAndLocation destination = LogiToppNetworkUtil.createZoneAndLocation(destinationZone,
						destinationLocation);

				PrivateParcel parcel = LogiToppDemandUtil.createPrivateParcel(parcelId, null, consumingPerson,
						destination, size, destinationType, isPickup, arrivalTime);
				parcels.put(parcelId, parcel);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parseParcelProductionBusiness(String filePath) {
		// Format:
		// ParcelID;Size;From;To;FromZoneId;FromLocationX;FromLocationY;ToZoneId;ToLocationX;ToLocationY;ArrivalDay;ArrivalTime;

		try (Reader reader = new FileReader(filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				int parcelId = Integer.valueOf(record.get("ParcelID"));

				int producingBusinessId = Integer.valueOf(record.get("From"));
				// TODO: parcel consumer (DistributionCenter - only name)

				double destinationX = Double.valueOf(record.get("ToLocationX"));
				double destinationY = Double.valueOf(record.get("ToLocationY"));
				int destinationZoneId = Integer.valueOf(record.get("ToZoneId"));

				ShipmentSize size = ShipmentSize.valueOf(record.get("Size"));
				boolean isPickup = true;

				String arrivalTimeString = record.get("ArrivalTime");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd HH:mm:ss");
				LocalDateTime localTime = LocalDateTime.parse(arrivalTimeString, formatter);
				Time arrivalTime = BaseFactory.eINSTANCE.createTime();
				arrivalTime.setSeconds(24 * 60 * 60 * (localTime.getDayOfMonth() - 1) + 60 * 60 * localTime.getHour()
						+ 60 * localTime.getMinute() + localTime.getSecond());

				Business producingBusiness = populationBuilder.getBusiness(producingBusinessId);
				// TODO: handle edgeId, fixEdgePosition (wait for better input data)
				Location destinationLocation = networkBuilder.createLocation(destinationX, destinationY, 0, 0);
				Zone destinationZone = networkBuilder.getZone(destinationZoneId);
				ZoneAndLocation destination = LogiToppNetworkUtil.createZoneAndLocation(destinationZone,
						destinationLocation);

				BusinessParcel parcel = LogiToppDemandUtil.createBusinessParcel(parcelId, producingBusiness, null,
						destination, size, isPickup, arrivalTime);
				parcels.put(parcelId, parcel);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
