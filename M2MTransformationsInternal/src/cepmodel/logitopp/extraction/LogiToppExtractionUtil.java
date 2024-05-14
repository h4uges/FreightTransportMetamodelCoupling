package cepmodel.logitopp.extraction;

import logiToppMetamodel.base.BaseFactory;
import logiToppMetamodel.base.RelativeTime;
import logiToppMetamodel.base.Time;
import logiToppMetamodel.base.Weekday;
import logiToppMetamodel.dataExchange.DataExchangeFactory;
import logiToppMetamodel.dataExchange.Demand;
import logiToppMetamodel.dataExchange.DemandExchangeRoot;
import logiToppMetamodel.dataExchange.Population;
import logiToppMetamodel.dataExchange.Solution;
import logiToppMetamodel.dataExchange.SolutionExchangeRoot;
import logiToppMetamodel.dataExchange.TransportInfrastructure;
import logiToppMetamodel.mobiTopp.network.RoadNetwork;

// construction and utility methods for LogiTopp elements related to times (and root elements)
public class LogiToppExtractionUtil {

	private LogiToppExtractionUtil() {
	}

	public static SolutionExchangeRoot createSolutionExchangeRoot(RoadNetwork network,
			TransportInfrastructure transportInfrastructure, Population population, Demand demand, Solution solution) {
		SolutionExchangeRoot result = DataExchangeFactory.eINSTANCE.createSolutionExchangeRoot();
		result.setNetwork(network);
		result.setTransportNetwork(transportInfrastructure);
		result.setPopulation(population);
		result.setDemand(demand);
		result.setSolution(solution);
		return result;
	}

	public static DemandExchangeRoot createDemandExchangeRoot(RoadNetwork network,
			TransportInfrastructure transportInfrastructure, Population population, Demand demand) {
		DemandExchangeRoot result = DataExchangeFactory.eINSTANCE.createDemandExchangeRoot();
		result.setNetwork(network);
		result.setTransportNetwork(transportInfrastructure);
		result.setPopulation(population);
		result.setDemand(demand);
		return result;
	}

	public static Time createTime(int seconds) {
		Weekday day = Weekday.get(seconds / (24 * 60 * 60));
		int hour = (seconds / (60 * 60)) % 24;
		int minute = (seconds / 60) % 60;
		int second = seconds % 60;
		return createTime(day, hour, minute, second);
	}

	public static Time createTime(Weekday day, int hour, int minute, int second) {
		Time result = BaseFactory.eINSTANCE.createTime();
		result.setDay(day);
		result.setHour(hour);
		result.setMinute(minute);
		result.setSecond(second);
		return result;
	}

	public static RelativeTime createRelativeTime(int seconds) {
		int days = seconds / 24 * 60 * 60;
		int hours = (seconds / (60 * 60)) % 24;
		int minutes = (seconds / 60) % 60;
		seconds = seconds % 60;
		return createRelativeTime(days, hours, minutes, seconds);
	}

	public static RelativeTime createRelativeTime(int days, int hours, int minutes, int seconds) {
		RelativeTime result = BaseFactory.eINSTANCE.createRelativeTime();
		result.setDays(days);
		result.setHours(hours);
		result.setMinutes(minutes);
		result.setSeconds(seconds);
		return result;
	}

	public static RelativeTime getDurationBetween(Time first, Time last) {
		int durationSeconds = getSecondRepresentation(last) - getSecondRepresentation(first);
		return createRelativeTime(durationSeconds);
	}

	public static int compareTimes(Time firstTime, Time secondTime) {
		return Integer.compare(getSecondRepresentation(firstTime), getSecondRepresentation(secondTime));
	}

	private static int getSecondRepresentation(Time time) {
		return time.getDay().getValue() * 24 * 60 * 60 + time.getHour() * 60 * 60 + time.getMinute() * 60
				+ time.getSecond();
	}

	private static int getSecondRepresentation(RelativeTime duration) {
		return duration.getDays() * 24 * 60 * 60 + duration.getHours() * 60 * 60 + duration.getMinutes() * 60
				+ duration.getSeconds();
	}

	public static Time addDurationToTime(Time time, RelativeTime duration) {
		return createTime(getSecondRepresentation(time) + getSecondRepresentation(duration));
	}
}
