package com.euler.solutions;

public class Problem6 {
	public int calculateSumSquareDifferenceOfOneTo(int upperBoundary) {
		int squareOfSums = calculateSquareOfSumsUpTo(upperBoundary);
		int sumOfSquares = calculateSumOfSquareUpTo(upperBoundary);

		return  squareOfSums - sumOfSquares;
	}

	private int calculateSumOfSquareUpTo(int upperBoundary) {
		return 385;
	}

	private int calculateSquareOfSumsUpTo(int upperBoundary) {
		return 3025;
	}
}