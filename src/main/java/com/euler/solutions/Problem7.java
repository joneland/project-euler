package com.euler.solutions;


public class Problem7 {
	private static final int LOWEST_PRIME_NUMBER = 2;

	public int calculatePrimeNumberAtIndex(int index) {
		int currentNumber = LOWEST_PRIME_NUMBER;
		int latestPrimeNumber = 0;
		int primeCount = 0;

		while (primeCount != index) {
			if (isPrime(currentNumber)) {
				latestPrimeNumber = currentNumber;
				primeCount++;
			}
			currentNumber++;
		}

		return latestPrimeNumber;
	}

	public boolean isPrime(int number) {
		for(int currentInteger = number - 1; currentInteger >= 2; currentInteger--) {
			if(dividesWithZeroRemainder(number, currentInteger)) {
				return false;
			}
		}
		return true;
	}

	private boolean dividesWithZeroRemainder(long integer, int divisor) {
		return integer % divisor == 0;
	}
}