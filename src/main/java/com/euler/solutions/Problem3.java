package com.euler.solutions;

public class Problem3 {
	public int calculateLargestPrimeFactorOf(long number) {
		int largestPrimeFactor = 0;

		for (int currentInteger = 2; currentInteger <= number; currentInteger++) {
			if (isPrime(currentInteger) && dividesIntoNaturalNumber(number, currentInteger)) {
				largestPrimeFactor = currentInteger;
				number = number / currentInteger;
			}
		}

		return largestPrimeFactor;
	}

	public boolean isPrime(int number) {
		for(int currentInteger = number - 1; currentInteger >= 2; currentInteger--) {
			if(dividesIntoNaturalNumber(number, currentInteger)) {
				return false;
			}
		}
		return true;
	}

	private boolean dividesIntoNaturalNumber(long integer, int divisor) {
		return integer % divisor == 0;
	}
}