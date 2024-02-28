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

import cepmodel.logitopp.extraction.InputFileRegistry;
import cepmodel.logitopp.extraction.network.LogiToppNetworkBuilder;
import cepmodel.logitopp.extraction.transportInfrastructure.LogiToppTransportInfrastructureBuilder;
import logiToppMetamodel.Population;
import logiToppMetamodel.base.Weekday;
import logiToppMetamodel.logiTopp.business.Business;
import logiToppMetamodel.logiTopp.business.OpeningHour;
import logiToppMetamodel.logiTopp.distribution.CEPServiceProvider;
import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Zone;
import logiToppMetamodel.mobiTopp.citizens.Employment;
import logiToppMetamodel.mobiTopp.citizens.Gender;
import logiToppMetamodel.mobiTopp.citizens.Household;
import logiToppMetamodel.mobiTopp.citizens.Person;

public class LogiToppPopulationBuilder {
	private final Map<Integer, Business> businesses = new HashMap<Integer, Business>();
	private final Map<Integer, Household> households = new HashMap<Integer, Household>();
	private final Map<Integer, Person> persons = new HashMap<Integer, Person>();

	private LogiToppNetworkBuilder networkBuilder;
	private LogiToppTransportInfrastructureBuilder transportInfrastructureBuilder;
	private final InputFileRegistry fileRegistry;
	
	public LogiToppPopulationBuilder(InputFileRegistry fileRegisty, LogiToppNetworkBuilder networkBuilder, LogiToppTransportInfrastructureBuilder transportInfrastructureBuilder) {
		this.fileRegistry = fileRegisty;
		this.networkBuilder = networkBuilder;
		this.transportInfrastructureBuilder = transportInfrastructureBuilder;
	}
	
	public Population createPopulation() {
		fileRegistry.businessCSVs.forEach(file -> parseBusinessCsv(file));
		fileRegistry.businessRelationsCSVs.forEach(file -> parseBusinessPartnerCsv(file));
		fileRegistry.householdCSVs.forEach(file -> parseHouseholdCsv(file));
		fileRegistry.personCSVs.forEach(file -> parsePersonCsv(file));

		return LogiToppPopulationUtil.createPopulation(ImmutableSet.copyOf(businesses.values()),
				ImmutableSet.copyOf(households.values()));
	}
	
	public Business getBusiness(int businessId) {
		return businesses.get(businessId);
	}
	
	public Person getPerson(int personId) {
		return persons.get(personId);
	}

	private void addBusiness(int id, String businessName, int zoneId, double x, double y, double area, int numEmployees,
			int branch, int buildingType, ImmutableList<OpeningHour> openingHours) {
		Zone zone = networkBuilder.getZone(zoneId);
		// TODO: handle edgeId, fixEdgePosition (wait for better input data)
		Location location = networkBuilder.createLocation(x, y, 0, 0);

		Business business = LogiToppPopulationUtil.createBusiness(id, businessName, zone, location, area, numEmployees,
				branch, buildingType, openingHours);
		businesses.put(id, business);
	}

	private void parseBusinessCsv(String filePath) {
		try (Reader reader = new FileReader(filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				int id = Integer.valueOf(record.get("id"));
				String businessName = record.get("name");
				int zoneId = Integer.valueOf(record.get("zone"));
				double x = Double.valueOf(record.get("loc_x"));
				double y = Double.valueOf(record.get("loc_y"));
				double area = Double.valueOf(record.get("area"));
				int numEmployees = Integer.valueOf(record.get("employees"));
				int branchNum = Integer.valueOf(record.get("branch"));
				int buildingTypeNum = Integer.valueOf(record.get("building"));
				
				List<OpeningHour> openingHours = new ArrayList<OpeningHour>();
				for (Weekday weekday : Weekday.VALUES) {
					String value = record.get("open:" + weekday.toString());
					if (value != "") {
						OpeningHour openingHour = LogiToppPopulationUtil.createOpeningHour(weekday,
								Integer.valueOf(value.split(",")[0]), Integer.valueOf(value.split(",")[0]));
						openingHours.add(openingHour);
					} else {
						// TODO: handle empty
					}
				}

				this.addBusiness(id, businessName, zoneId, x, y, area, numEmployees, branchNum, buildingTypeNum,
						ImmutableList.copyOf(openingHours));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private void parseBusinessPartnerCsv(String filePath) {
		try (Reader reader = new FileReader(filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				int businessId = Integer.valueOf(record.get("id"));
				String cepspName = record.get("DistributionCenter");
				String direction = record.get("Tag");
				
				Business business = businesses.get(businessId);
				CEPServiceProvider cepServiceProvider = transportInfrastructureBuilder.getCEPSP(cepspName);
				
				if(direction == "consumption") {
					business.getDeliveryPartners().add(cepServiceProvider);
				}
				if(direction == "production") {
					business.getPickUpPartners().add(cepServiceProvider);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// TODO: check quotes ""
	private void parseHouseholdCsv(String filePath) {
		// format: "householdId";"year";"householdNumber";"nominalSize";"domCode";"type";"homeZone";"homeLocation";"homeX";"homeY";"numberOfMinors";"numberOfNotSimulatedChildren";"totalNumberOfCars";"income";"incomeClass";"economicalStatus";"canChargePrivately"
		
		try (Reader reader = new FileReader(filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				int householdId = Integer.valueOf(record.get("householdId"));
				double x = Double.valueOf(record.get("homeX"));
				double y = Double.valueOf(record.get("homeY"));
				Zone zone = networkBuilder.getZone(Integer.valueOf(record.get("homeZone")));
				// TODO: handle edgeId, fixEdgePosition (wait for better input data)
				Location location = networkBuilder.createLocation(x, y, 0, 0);
				
				
				Household household = LogiToppPopulationUtil.createHousehold(householdId, zone, location, ImmutableSet.of());
				households.put(householdId, household);
				zone.getHouseholds().add(household);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// TODO: check quotes ""
	private void parsePersonCsv(String filePath) {
		// format: "personId";"personNumber";"householdId";"age";"employment";"gender";"graduation";"income";"hasBike";"hasAccessToCar";"hasPersonalCar";"hasCommuterTicket";"hasLicense";"preferencesSurvey";"preferencesSimulation";"eMobilityAcceptance";"chargingInfluencesDestinationChoice";"mobilityProviderCustomership"
		try (Reader reader = new FileReader(filePath);
				CSVParser csvParser = CSVFormat.DEFAULT.builder().setHeader().setDelimiter(';').build().parse(reader)) {

			for (CSVRecord record : csvParser) {
				int personId = Integer.valueOf(record.get("personId"));
				int age = Integer.valueOf(record.get("age"));
				Gender gender = Gender.valueOf(record.get("gender"));
				Employment employment = Employment.valueOf(record.get("employment"));
				int householdId = Integer.valueOf(record.get("householdId"));
				
				Person person = LogiToppPopulationUtil.createPerson(personId, age, gender, employment);
				persons.put(personId, person);
				households.get(householdId).getMembers().add(person);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
