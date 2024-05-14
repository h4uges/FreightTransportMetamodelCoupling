package cepmodel.evaluation;

import logiToppMetamodel.base.BaseFactory;
import logiToppMetamodel.base.Time;
import logiToppMetamodel.base.Weekday;

// utility class for handling LogiTopp elements
public class LogiToppHelper {

	private LogiToppHelper() {
	}

	public static int compareTimes(Time time1, Time time2) {
		return Double.compare(timeToSeconds(time1), timeToSeconds(time2));
	}

	public static double timeToSeconds(Time time) {
		return time.getDay().getValue() * 24 * 60 * 60 + time.getHour() * 60 * 60 + time.getMinute() * 60
				+ time.getSecond();
	}

	public static double timeToSecondWithinDay(Time time) {
		return time.getHour() * 60 * 60 + time.getMinute() * 60 + time.getSecond();
	}

	public static Time secondsToTime(double seconds) {
		int roundedSeconds = Double.valueOf(seconds).intValue();

		Time result = BaseFactory.eINSTANCE.createTime();
		result.setDay(intToEnum(Weekday.class, roundedSeconds / (60 * 60 * 24)));
		result.setHour((roundedSeconds % (60 * 60 * 24)) / (60 * 60));
		result.setMinute((roundedSeconds % (60 * 60)) / 60);
		result.setSecond(roundedSeconds % 60);
		return result;
	}

	public static Time addMinutesToTime(Time time, int numMinutes) {
		return secondsToTime(timeToSeconds(time) + 60 * numMinutes);
	}

	private static <T extends Enum<T>> T intToEnum(Class<T> enumClass, int value) {
		T[] enumConstants = enumClass.getEnumConstants();
		for (T enumConstant : enumConstants) {
			if (enumConstant.ordinal() == value) {
				return enumConstant;
			}
		}
		throw new IllegalArgumentException("No enum constant with ordinal " + value);
	}
}
