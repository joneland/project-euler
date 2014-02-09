package com.euler.solutions;

import static com.euler.common.PrimeNumbers.isPrime;
import static com.google.common.math.LongMath.mod;

public class Problem3 {
	private static final int SMALLEST_PRIME_NUMBER = 2;

	public int calculateLargestPrimeFactorOf(long number) {
		int largestPrimeFactor = 0;

		for (int currentInteger = SMALLEST_PRIME_NUMBER; currentInteger <= number; currentInteger++) {
			if (isPrime(currentInteger) && mod(number, currentInteger) == 0) {
				largestPrimeFactor = currentInteger;
				number = number / currentInteger;
			}
		}

		return largestPrimeFactor;
	}
}