package com.euler.solutions;

import static com.euler.common.PrimeNumbers.isPrime;

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
}