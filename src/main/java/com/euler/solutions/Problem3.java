package com.euler.solutions;

public class Problem3 {
	public int calculateLargestPrimeFactorOf(long number) {
		int largestPrimeFactor = 0;

		for (int i = 2; i <= number; i++) {
			if (isPrime(i) && dividesIntoNaturalNumber(number, i)) {
				largestPrimeFactor = i;
				number = number / i;
			}
		}

		return largestPrimeFactor;
	}

	public boolean isPrime(long number) {
		for(long i = number - 1; i >= 2; i--) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}

	private boolean dividesIntoNaturalNumber(long number, int i) {
		return number % i == 0;
	}
}