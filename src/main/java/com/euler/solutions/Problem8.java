package com.euler.solutions;

import static com.google.common.base.Splitter.fixedLength;
import static com.google.common.math.IntMath.checkedMultiply;
import static java.lang.Integer.parseInt;

public class Problem8 {
	private static final int START_INDEX_OF_FIVE_NUMBERS = 0;
	private static final int END_INDEX_OF_FIVE_NUMBERS = 5;
	
	public int calculateLargestProductOfFiveConsecutiveNumbersIn(String seriesOfNumbers) {
		int largestProductOfFiveConsecutiveNumbers = 0;

		while (seriesOfNumbers.length() > END_INDEX_OF_FIVE_NUMBERS) {
			String fiveConsecutiveNumbers = seriesOfNumbers.substring(START_INDEX_OF_FIVE_NUMBERS, END_INDEX_OF_FIVE_NUMBERS);

			int product = multiply(fiveConsecutiveNumbers);

			if (product > largestProductOfFiveConsecutiveNumbers) {
				largestProductOfFiveConsecutiveNumbers = product;
			}

			seriesOfNumbers = dropFirstNumberFrom(seriesOfNumbers);
		}

		return largestProductOfFiveConsecutiveNumbers;
	}

	private int multiply(String numbers) {
		int total = 1;

		for(String number : fixedLength(1).splitToList(numbers)) {
			total = checkedMultiply(total, parseInt(number));
		}

		return total;
	}

	private String dropFirstNumberFrom(String number) {
		return number.substring(2);
	}
}