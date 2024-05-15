package cepmodel.logitopp.extraction.population;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import cepmodel.logitopp.extraction.LogiToppBuilderBase;
import cepmodel.logitopp.extraction.LogiToppInputFileRegistry;
import cepmodel.logitopp.extraction.network.LogiToppNetworkBuilder;
import cepmodel.logitopp.extraction.transportinfrastructure.LogiToppTransportInfrastructureBuilder;
import logiToppMetamodel.base.Weekday;
import logiToppMetamodel.dataExchange.Population;
import logiToppMetamodel.logiTopp.business.Business;
import logiToppMetamodel.logiTopp.business.OpeningHour;
import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;
import logiToppMetamodel.mobiTopp.citizens.Employment;
import logiToppMetamodel.mobiTopp.citizens.Gender;
import logiToppMetamodel.mobiTopp.citizens.Household;
import logiToppMetamodel.mobiTopp.citizens.Person;
import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Zone;

//builds logiTopp population view type by parsing corresponding input files
public class LogiToppPopulationBuilder extends LogiToppBuilderBase {
	private final Map<String, Location> business2location = new HashMap<>();
	private final Map<String, Business> businesses = new HashMap<>();
	private final Map<String, Household> households = new HashMap<>();
	private final Map<String, Person> persons = new HashMap<>();

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
		fileRegistry.businessLocationCSVs.forEach(this::parseBusinessLocations);
		fileRegistry.businessCSVs.forEach(this::parseBusinessCsv);
		fileRegistry.businessRelationsCSVs.forEach(this::parseBusinessPartnerCsv);
		fileRegistry.householdCSVs.forEach(this::parseHouseholdCsv);
		fileRegistry.personCSVs.forEach(this::parsePersonCsv);
		fileRegistry.fixedDestinationCSVs.forEach(this::parseFixedDestinationCsv);

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
		try (CSVParser csvParser = getCSVParser(filePath)) {

			for (CSVRecord csvEntry : csvParser) {
				String id = csvEntry.get("id");
				double x = Double.parseDouble(csvEntry.get("x"));
				double y = Double.parseDouble(csvEntry.get("y"));
				String edgeId = csvEntry.get("edge");
				double edgePos = Double.parseDouble(csvEntry.get("pos"));

				Location location = networkBuilder.createLocation(x, y, edgeId, edgePos);
				this.business2location.put(id, location);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parseBusinessCsv(String filePath) {
		try (CSVParser csvParser = getCSVParser(filePath)) {

			for (CSVRecord csvEntry : csvParser) {
				String id = csvEntry.get("id");
				String businessName = csvEntry.get("name");
				String zoneId = csvEntry.get("zone");
				double area = Double.parseDouble(csvEntry.get("area"));
				int numEmployees = Integer.parseInt(csvEntry.get("employees"));
				int branchNum = Integer.parseInt(csvEntry.get("branch"));
				int buildingTypeNum = Integer.parseInt(csvEntry.get("building"));

				List<OpeningHour> openingHours = new ArrayList<>();
				for (Weekday weekday : Weekday.VALUES) {
					String value = csvEntry.get("open:" + weekday.toString());
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
		try (CSVParser csvParser = getCSVParser(filePath)) {

			for (CSVRecord csvEntry : csvParser) {
				String businessId = csvEntry.get("Business");
				String cepspName = csvEntry.get("ServiceProvider");
				String direction = csvEntry.get("Tag");

				Business business = businesses.get(businessId);
				CEPServiceProvider cepServiceProvider = transportInfrastructureBuilder.getCEPSP(cepspName);

				if ("consumption".equals(direction)) {
					business.getDeliveryPartners().add(cepServiceProvider);
				}
				if ("production".equals(direction)) {
					business.getPickUpPartners().add(cepServiceProvider);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parseHouseholdCsv(String filePath) {
		try (CSVParser csvParser = getCSVParser(filePath)) {

			for (CSVRecord csvEntry : csvParser) {
				String householdId = csvEntry.get("householdId");
				String locationString = csvEntry.get("homeLocation");
				Zone zone = networkBuilder.getZoneByMatrixColum(csvEntry.get("homeZone"));
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
		try (CSVParser csvParser = getCSVParser(filePath)) {
			for (CSVRecord csvEntry : csvParser) {
				String personId = csvEntry.get("personId");
				int age = Integer.parseInt(csvEntry.get("age"));
				Gender gender = Gender.valueOf(csvEntry.get("gender"));
				Employment employment = Employment.valueOf(csvEntry.get("employment"));
				String householdId = csvEntry.get("householdId");

				Person person = LogiToppPopulationUtil.createPerson(personId, age, gender, employment);
				persons.put(personId, person);
				households.get(householdId).getMembers().add(person);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parseFixedDestinationCsv(String filePath) {
		try (CSVParser csvParser = getCSVParser(filePath)) {
			Map<String, Location> person2WorkLocation = new HashMap<>();
			for (CSVRecord csvEntry : csvParser) {
				String personId = csvEntry.get("personOid");
				Location location = networkBuilder.createLocationFromString(csvEntry.get("location"));
				if (csvEntry.get("activityType").startsWith("WORK")) {
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
