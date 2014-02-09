package com.euler.solutions1to10;

import static com.google.common.base.Strings.repeat;
import static com.google.common.math.IntMath.checkedMultiply;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

public class Problem4 {
	private static final String LARGEST_SINGLE_NUMBER = "9";

	public int calculateLargestPalindromicNumberFromTwoNumbersOfLength(int numberOfDigits) {
		int largestPalindrome = 0;
		int startingValue = generateStartingValuesBasedOn(numberOfDigits);
		
		for (int firstNumber = startingValue; firstNumber > 0; firstNumber--) {
			for (int secondNumber = startingValue; secondNumber > 0; secondNumber--) {
				int product = checkedMultiply(firstNumber, secondNumber);
				if (isPalindrome(product) && product > largestPalindrome) {
					largestPalindrome = product;
				}
			}
		}

		return largestPalindrome;
	}

	private boolean isPalindrome(int number) {
		String reversedNumber = new StringBuilder().append(number).reverse().toString();
		return valueOf(number).equals(reversedNumber);
	}

	private int generateStartingValuesBasedOn(int numberOfDigits) {
		String startingValue = repeat(LARGEST_SINGLE_NUMBER, numberOfDigits);
		return parseInt(startingValue);
	}
}