package com.euler.solutions;

import static com.google.common.math.IntMath.checkedAdd;
import static com.google.common.math.IntMath.checkedMultiply;

public class Problem6 {
	public int calculateSumSquareDifferenceOfOneTo(int upperBoundary) {
		int squareOfSums = calculateSquareOfSumsUpTo(upperBoundary);
		int sumOfSquares = calculateSumOfSquareUpTo(upperBoundary);

		return  squareOfSums - sumOfSquares;
	}

	private int calculateSumOfSquareUpTo(int upperBoundary) {
		int total = 0;

		for (int number = 1; number <= upperBoundary; number++) {
			total = checkedAdd(total, checkedMultiply(number, number));
		}

		return total;
	}

	private int calculateSquareOfSumsUpTo(int upperBoundary) {
		int total = 0;

		for(int number = 1; number <= upperBoundary; number++) {
			total = checkedAdd(total, number);
		}

		return checkedMultiply(total, total);
	}
}