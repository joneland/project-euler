package com.euler.solutions;

import com.euler.common.PrimeNumbers;


public class Problem7 {
	private static final int LOWEST_PRIME_NUMBER = 2;

	private PrimeNumbers primeNumbers = new PrimeNumbers();

	public int calculatePrimeNumberAtIndex(int index) {
		int currentNumber = LOWEST_PRIME_NUMBER;
		int latestPrimeNumber = 0;
		int primeCount = 0;

		while (primeCount != index) {
			if (primeNumbers.isPrime(currentNumber)) {
				latestPrimeNumber = currentNumber;
				primeCount++;
			}
			currentNumber++;
		}

		return latestPrimeNumber;
	}
}