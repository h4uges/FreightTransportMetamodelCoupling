package cepmodel.evaluation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AssertionHelper {

	private AssertionHelper() {
	}

	public static <T> Collector<T, ?, T> toSingleton() {
		return Collectors.collectingAndThen(Collectors.toList(), list -> {
			assertTrue(list.size() == 1, "expected exactly one element");
			return list.get(0);
		});
	}

	public static <T> Collector<T, ?, T> toSingleton(String specification) {
		return Collectors.collectingAndThen(Collectors.toList(), list -> {
			assertTrue(list.size() == 1, "expected exactly one element of %s".formatted(specification));
			return list.get(0);
		});
	}
}
