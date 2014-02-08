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

		for (int i = 1; i <= upperBoundary; i++) {
			total = checkedAdd(total, checkedMultiply(i, i));
		}

		return total;
	}

	private int calculateSquareOfSumsUpTo(int upperBoundary) {
		int total = 0;

		for(int i = 1; i <= upperBoundary; i++) {
			total = checkedAdd(total, i);
		}

		return checkedMultiply(total, total);
	}
}