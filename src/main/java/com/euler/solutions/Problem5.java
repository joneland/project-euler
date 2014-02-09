package com.euler.solutions;

import static com.google.common.math.IntMath.mod;

public class Problem5 {
	public int calculateSmallestNumberEvenlyDivisibleByAllNumbersBetween(int lowerBoundary, int upperBoundary) {
		int smallestNumber = upperBoundary;

		for (int divisor = lowerBoundary; divisor <= upperBoundary; divisor++) {
			if (mod(smallestNumber, divisor) == 0 && divisor == upperBoundary) {
				break;
			}

			if (mod(smallestNumber, divisor) == 0 && divisor < upperBoundary) {
				continue;
			}

			if (mod(smallestNumber, divisor) != 0) {
				smallestNumber++;
				divisor = lowerBoundary;
			}
		}

		return smallestNumber;
	}
}