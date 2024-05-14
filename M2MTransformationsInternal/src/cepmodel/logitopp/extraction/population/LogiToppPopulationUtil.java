package cepmodel.logitopp.extraction.population;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import cepmodel.logitopp.extraction.LogiToppExtractionUtil;
import logiToppMetamodel.base.Weekday;
import logiToppMetamodel.dataExchange.DataExchangeFactory;
import logiToppMetamodel.dataExchange.Population;
import logiToppMetamodel.logiTopp.business.Branch;
import logiToppMetamodel.logiTopp.business.BuildingType;
import logiToppMetamodel.logiTopp.business.Business;
import logiToppMetamodel.logiTopp.business.BusinessFactory;
import logiToppMetamodel.logiTopp.business.OpeningHour;
import logiToppMetamodel.mobiTopp.citizens.CitizensFactory;
import logiToppMetamodel.mobiTopp.citizens.Employment;
import logiToppMetamodel.mobiTopp.citizens.Gender;
import logiToppMetamodel.mobiTopp.citizens.Household;
import logiToppMetamodel.mobiTopp.citizens.Person;
import logiToppMetamodel.mobiTopp.network.Location;
import logiToppMetamodel.mobiTopp.network.Zone;

//constructor methods for LogiTopp elements related to the population view type
public class LogiToppPopulationUtil {

	private LogiToppPopulationUtil() {
	}

	public static Population createPopulation(ImmutableSet<Business> businesses, ImmutableSet<Household> households) {
		Population population = DataExchangeFactory.eINSTANCE.createPopulation();

		population.getBusinesses();

		population.getBusinesses().addAll(businesses);
		population.getHouseholds().addAll(households);

		return population;
	}

	public static Business createBusiness(String id, String businessName, Zone zone, Location location, double area,
			int numEmployees, int branch, int buildingType, ImmutableList<OpeningHour> openingHours) {
		Business business = BusinessFactory.eINSTANCE.createBusiness();

		business.setId(id);
		business.setName(businessName);

		business.setZone(zone);
		business.setLocation(location);

		business.setArea(area);
		business.setEmplyees(numEmployees);

		business.setBranch(Branch.get(branch));
		business.setBuildingType(BuildingType.get(buildingType));

		business.getOpeningHours().addAll(openingHours);

		return business;
	}

	public static OpeningHour createOpeningHour(Weekday weekday, int startHour, int endHour) {
		OpeningHour result = BusinessFactory.eINSTANCE.createOpeningHour();

		result.setStart(LogiToppExtractionUtil.createTime(weekday, startHour, 0, 0));
		result.setStart(LogiToppExtractionUtil.createTime(weekday, endHour, 0, 0));
		return result;
	}

	public static Household createHousehold(String id, Zone zone, Location location, ImmutableSet<Person> members) {
		Household result = CitizensFactory.eINSTANCE.createHousehold();

		result.setId(id);
		result.setLocation(location);
		result.setZone(zone);
		result.getMembers().addAll(members);

		return result;
	}

	public static Person createPerson(String id, int age, Gender gender, Employment emplyment) {
		Person result = CitizensFactory.eINSTANCE.createPerson();

		result.setId(id);
		result.setAge(age);
		result.setGender(gender);
		result.setEmployment(emplyment);

		return result;
	}
}
