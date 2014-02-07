package com.euler.solutions;

public class Problem5 {
	public int calculateSmallestNumberEvenlyDivisibleByAllNumbersBetween(int lowerBoundary, int upperBoundary) {
		int smallestNumber = upperBoundary;
		boolean tryNextNumber = true;

		while (tryNextNumber) {
			for (int divisor = lowerBoundary; divisor <= upperBoundary; divisor++) {
				if (isEvenlyDivisible(smallestNumber, divisor) && divisor == upperBoundary) {
					tryNextNumber = false;
				}

				if (isEvenlyDivisible(smallestNumber, divisor) && divisor < upperBoundary) {
					continue;
				}

				if (!isEvenlyDivisible(smallestNumber, divisor)) {
					smallestNumber++;
					break;
				}
			}
		}

		return smallestNumber;
	}

	private boolean isEvenlyDivisible(int number, int divisor) {
		return number % divisor == 0;
	}
}