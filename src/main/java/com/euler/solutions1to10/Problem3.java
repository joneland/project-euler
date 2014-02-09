package com.euler.solutions1to10;

import static com.euler.common.DivisibilityChecker.isEvenlyDivisible;
import static com.euler.common.PrimeNumbers.isPrime;

public class Problem3 {
	private static final int SMALLEST_PRIME_NUMBER = 2;

	public int calculateLargestPrimeFactorOf(long number) {
		int largestPrimeFactor = 0;

		for (int currentInteger = SMALLEST_PRIME_NUMBER; currentInteger <= number; currentInteger++) {
			if (isPrime(currentInteger) && isEvenlyDivisible(number, currentInteger)) {
				largestPrimeFactor = currentInteger;
				number = number / currentInteger;
			}
		}

		return largestPrimeFactor;
	}
}