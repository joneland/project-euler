package com.euler.solutions;

import static com.google.common.base.Splitter.fixedLength;
import static java.lang.Integer.parseInt;

import java.util.List;

import com.google.common.math.IntMath;

public class Problem8 {
	private static final int START_OF_FIVE_NUMBERS = 0;
	private static final int END_OF_FIVE_NUMBERS = 5;
	
	public int calculateLargestProductOfFiveConsecutiveNumbersIn(String seriesOfNumbers) {
		int largestProductOfFiveConsecutiveNumbers = 0;

		while (seriesOfNumbers.length() > 5) {
			String fiveConsecutiveNumbers = seriesOfNumbers.substring(START_OF_FIVE_NUMBERS, END_OF_FIVE_NUMBERS);

			int product = multiply(fiveConsecutiveNumbers);

			if (product > largestProductOfFiveConsecutiveNumbers) {
				largestProductOfFiveConsecutiveNumbers = product;
			}

			seriesOfNumbers = dropFirstNumberFrom(seriesOfNumbers);
		}

		return largestProductOfFiveConsecutiveNumbers;
	}

	private String dropFirstNumberFrom(String number) {
		return number.substring(2);
	}

	private int multiply(String numbers) {
		int total = 1;
		List<String> individualNumbers = fixedLength(1).splitToList(numbers);
		for(String number : individualNumbers) {
			total = IntMath.checkedMultiply(total, parseInt(number));
		}
		return total;
	}
}