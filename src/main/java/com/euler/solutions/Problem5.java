package com.euler.solutions;

public class Problem5 {
	public int calculateSmallestNumberEvenlyDivisibleByAllNumbersBetween(int lowerBoundary, int upperBoundary) {
		int smallestNumber = upperBoundary;

		for (int divisor = lowerBoundary; divisor <= upperBoundary; divisor++) {
			if (isEvenlyDivisible(smallestNumber, divisor) && divisor == upperBoundary) {
				break;
			}

			if (isEvenlyDivisible(smallestNumber, divisor) && divisor < upperBoundary) {
				continue;
			}

			if (!isEvenlyDivisible(smallestNumber, divisor)) {
				smallestNumber++;
				divisor = lowerBoundary;
			}
		}

		return smallestNumber;
	}

	private boolean isEvenlyDivisible(int number, int divisor) {
		return number % divisor == 0;
	}
}