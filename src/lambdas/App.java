package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		// Predicate == conditional
		Predicate<Integer> isEven = num -> num % 2 == 0; // overriding the test method

		System.out.println(isEven.test(22));

		Calculation add = (a, b) -> a + b;

		System.out.println(add.calculate(12, 15));

		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> evenNums = filter(nums, isEven);

		System.out.println(evenNums);

		List<Integer> oddNums = filter(nums, num -> num % 2 != 0);

		System.out.println(oddNums);
	}

	private static List<Integer> filter(List<Integer> listToFilter, Predicate<Integer> condtion) {
		List<Integer> newList = new ArrayList<>();

		for (Integer i : listToFilter) {
			if (condtion.test(i)) {
				newList.add(i);
			}
		}

		return newList;
	}

}
