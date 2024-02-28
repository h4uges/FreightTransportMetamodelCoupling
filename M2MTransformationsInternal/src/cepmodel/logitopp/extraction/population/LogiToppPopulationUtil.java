package cepmodel.logitopp.extraction.population;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import logiToppMetamodel.LogiToppMetamodelFactory;
import logiToppMetamodel.Population;
import logiToppMetamodel.base.BaseFactory;
import logiToppMetamodel.base.Time;
import logiToppMetamodel.base.Weekday;
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

public class LogiToppPopulationUtil {

	public static Population createPopulation(ImmutableSet<Business> businesses, ImmutableSet<Household> households) {
		Population population = LogiToppMetamodelFactory.eINSTANCE.createPopulation();
		
		population.getBusinesses();
		
		population.getBusinesses().addAll(businesses);
		population.getHouseholds().addAll(households);
		
		return population;
	}
	
	public static Business createBusiness(int id, String businessName, Zone zone, Location location, double area,
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
		
		result.setDayOfWeek(weekday);
		
		int startSeconds = (weekday.getValue() * 24 + startHour) * 60 * 60;
		Time start = BaseFactory.eINSTANCE.createTime();
		start.setSeconds(startSeconds);
		result.setStart(start);
		
		int endSeconds = (weekday.getValue() * 24 + endHour) * 60 * 60;
		Time end = BaseFactory.eINSTANCE.createTime();
		end.setSeconds(endSeconds);
		result.setEnd(end);
		
		return result;
	}
	
	public static Household createHousehold(int id, Zone zone, Location location, ImmutableSet<Person> members) {
		Household result = CitizensFactory.eINSTANCE.createHousehold();
		
		result.setId(id);
		result.setLocation(location);
		result.setZone(zone);
		result.getMembers().addAll(members);
		
		return result;
	}
	
	public static Person createPerson(int id, int age, Gender gender, Employment emplyment) {
		Person result = CitizensFactory.eINSTANCE.createPerson();
		
		result.setId(id);
		result.setAge(age);
		result.setGender(gender);
		result.setEmployment(emplyment);
		
		return result;
	}
}
