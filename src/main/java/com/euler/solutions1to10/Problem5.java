package com.euler.solutions1to10;

import static com.euler.common.DivisibilityChecker.isEvenlyDivisible;

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
}