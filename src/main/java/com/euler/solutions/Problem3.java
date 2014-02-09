package com.euler.solutions;

import com.euler.common.PrimeNumbers;

public class Problem3 {
	private PrimeNumbers primeNumbers = new PrimeNumbers();

	public int calculateLargestPrimeFactorOf(long number) {
		int largestPrimeFactor = 0;

		for (int currentInteger = 2; currentInteger <= number; currentInteger++) {
			if (primeNumbers.isPrime(currentInteger) && dividesIntoNaturalNumber(number, currentInteger)) {
				largestPrimeFactor = currentInteger;
				number = number / currentInteger;
			}
		}

		return largestPrimeFactor;
	}

	private boolean dividesIntoNaturalNumber(long integer, int divisor) {
		return integer % divisor == 0;
	}
}