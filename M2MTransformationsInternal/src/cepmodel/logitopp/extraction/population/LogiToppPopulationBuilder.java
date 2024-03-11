package cepmodel.logitopp.extraction.population;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import cepmodel.logitopp.extraction.LogiToppInputFileRegistry;
import cepmodel.logitopp.extraction.network.LogiToppNetworkBuilder;
import cepmodel.logitopp.extraction.transportInfrastructure.LogiToppTransportInfrastructureBuilder;
import logiToppMetamodel.base.Weekday;
import logiToppMetamodel.dataExchange.Population;
import logiToppMetamodel.logiTopp.business.Business;
import logiToppMetamodel.logiTopp.business.OpeningHour;
import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;
import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Zone;
import logiToppMetamodel.mobiTopp.citizens.Employment;
import logiToppMetamodel.mobiTopp.citizens.Gender;
import logiToppMetamodel.mobiTopp.citizens.Household;
import logiToppMetamodel.mobiTopp.citizens.Person;

// TODO: long-term - add work location
public class LogiToppPopulationBuilder {
	private final Map<String, Location> business2location = new HashMap<String, Location>();
	private final Map<String, Business> businesses = new HashMap<String, Business>();
	private final Map<String, Household> households = new HashMap<String, Household>();
	private final Map<String, Person> persons = new HashMap<String, Person>();

	private LogiToppNetworkBuilder networkBuilder;
	private LogiToppTransportInfrastructureBuilder transportInfrastructureBuilder;
	private final LogiToppInputFileRegistry fileRegistry;

	public LogiToppPopulationBuilder(LogiToppInputFileRegistry fileRegisty, LogiToppNetworkBuilder networkBuilder,
			LogiToppTransportInfrastructureBuilder transportInfrastructureBuilder) {
		this.fileRegistry = fileRegisty;
		this.networkBuilder = networkBuilder;
		this.transportInfrastructureBuilder = transportInfrastructureBuilder;
	}

	public Population createPopulation() {
		fileRegistry.businessLocationCSVs.forEach(file -> parseBusinessLocations(file));
		fileRegistry.businessCSVs.forEach(file -> parseBusinessCsv(file));
		fileRegistry.businessRelationsCSVs.forEach(file -> parseBusinessPartnerCsv(file));
		fileRegistry.householdCSVs.forEach(file -> parseHouseholdCsv(file));
		fileRegistry.personCSVs.forEach(file -> parsePersonCsv(file));
		fileRegistry.fixedDestinationCSVs.forEach(file -> parseFixedDestinationCsv(file));

		return LogiToppPopulationUtil.createPopulation(ImmutableSet.copyOf(businesses.values()),
				ImmutableSet.copyOf(households.values()));
	}

	public Business getBusiness(String businessId) {
		return businesses.get(businessId);
	}

	public Person getPerson(String personId) {
		return persons.get(personId);
	}

	private void parseBusinessLocations(String filePath) {
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setAllowMissingColumnNames(true).setHeader()
						.setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				String id = record.get("id");
				double x = Double.valueOf(record.get("x"));
				double y = Double.valueOf(record.get("y"));
				String edgeId = record.get("edge");
				double edgePos = Double.valueOf(record.get("pos"));

				Location location = networkBuilder.createLocation(x, y, edgeId, edgePos);
				this.business2location.put(id, location);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parseBusinessCsv(String filePath) {
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				String id = record.get("id");
				String businessName = record.get("name");
				String zoneId = record.get("zone");
				double area = Double.valueOf(record.get("area"));
				int numEmployees = Integer.valueOf(record.get("employees"));
				int branchNum = Integer.valueOf(record.get("branch"));
				int buildingTypeNum = Integer.valueOf(record.get("building"));

				List<OpeningHour> openingHours = new ArrayList<OpeningHour>();
				for (Weekday weekday : Weekday.VALUES) {
					String value = record.get("open:" + weekday.toString());
					if (!value.isBlank()) {
						OpeningHour openingHour = LogiToppPopulationUtil.createOpeningHour(weekday,
								Integer.valueOf(value.split(",")[0]), Integer.valueOf(value.split(",")[0]));
						openingHours.add(openingHour);
					}
				}

				this.addBusiness(id, businessName, zoneId, area, numEmployees, branchNum, buildingTypeNum,
						ImmutableList.copyOf(openingHours));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void addBusiness(String id, String businessName, String zoneId, double area, int numEmployees, int branch,
			int buildingType, ImmutableList<OpeningHour> openingHours) {
		Zone zone = networkBuilder.getZone(zoneId);
		Location location = business2location.get(id);

		Business business = LogiToppPopulationUtil.createBusiness(id, businessName, zone, location, area, numEmployees,
				branch, buildingType, openingHours);
		businesses.put(id, business);
	}

	private void parseBusinessPartnerCsv(String filePath) {
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setAllowMissingColumnNames(true).setHeader()
						.setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				String businessId = record.get("Business");
				String cepspName = record.get("ServiceProvider");
				String direction = record.get("Tag");

				Business business = businesses.get(businessId);
				CEPServiceProvider cepServiceProvider = transportInfrastructureBuilder.getCEPSP(cepspName);

				if (direction == "consumption") {
					business.getDeliveryPartners().add(cepServiceProvider);
				}
				if (direction == "production") {
					business.getPickUpPartners().add(cepServiceProvider);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parseHouseholdCsv(String filePath) {
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				String householdId = record.get("householdId");
				String locationString = record.get("homeLocation");
				// TODO: major - fix wrong homeZone
				Zone zone = networkBuilder.getZoneByMatrixColum(record.get("homeZone"));
				Location location = networkBuilder.createLocationFromString(locationString);

				Household household = LogiToppPopulationUtil.createHousehold(householdId, zone, location,
						ImmutableSet.of());
				households.put(householdId, household);

				zone.getHouseholds().add(household);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parsePersonCsv(String filePath) {
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				String personId = record.get("personId");
				int age = Integer.valueOf(record.get("age"));
				Gender gender = Gender.valueOf(record.get("gender"));
				Employment employment = Employment.valueOf(record.get("employment"));
				String householdId = record.get("householdId");

				Person person = LogiToppPopulationUtil.createPerson(personId, age, gender, employment);
				persons.put(personId, person);
				households.get(householdId).getMembers().add(person);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parseFixedDestinationCsv(String filePath) {
		try (Reader reader = new FileReader(System.getProperty("user.dir") + "/" + filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			Map<String, Location> person2WorkLocation = new HashMap<String, Location>();
			for (CSVRecord record : csvParser) {
				String personId = record.get("personOid");
				Location location = networkBuilder.createLocationFromString(record.get("location"));
				if (record.get("activityType").startsWith("WORK")) {
					person2WorkLocation.put(personId, location);
				}
			}

			person2WorkLocation
					.forEach((personId, workLocation) -> persons.get(personId).setWorkLocation(workLocation));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
