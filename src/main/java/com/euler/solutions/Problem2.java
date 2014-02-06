package com.euler.solutions;

import static com.google.common.math.IntMath.checkedAdd;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
	public int calculateSumOfEvenValuedTermsThatDoNotExceed(int upperBoundary) {
		List<Integer> fibonacciSequence = initialiseFibonacciSequence();

		while (true) {
			int nextTerm = calculateNextTermIn(fibonacciSequence);

			if (nextTerm < upperBoundary) {
				fibonacciSequence.add(nextTerm);
			}

			if (nextTerm >= upperBoundary) {
				break;
			}
		}

		return sumOfEvenValuedTermsIn(fibonacciSequence);
	}

	private int calculateNextTermIn(List<Integer> fibonacciSequence) {
		int secondToLastTermInSequence = fibonacciSequence.get(secondToLastTermIn(fibonacciSequence));
		int lastTermInSequence = fibonacciSequence.get(lastTermIn(fibonacciSequence));
		return checkedAdd(secondToLastTermInSequence, lastTermInSequence);
	}

	private int lastTermIn(List<Integer> fibonacciSequence) {
		return fibonacciSequence.size() - 1;
	}

	private int secondToLastTermIn(List<Integer> fibonacciSequence) {
		return fibonacciSequence.size() - 2;
	}

	private List<Integer> initialiseFibonacciSequence() {
		List<Integer> fibonacciSequence = new ArrayList<Integer>();
		fibonacciSequence.add(1);
		fibonacciSequence.add(2);
		return fibonacciSequence;
	}

	private int sumOfEvenValuedTermsIn(List<Integer> fibonacciSequence) {
		int result = 0;
		for (int term : fibonacciSequence) {
			if (term % 2 == 0) {
				result = checkedAdd(result, term);
			}
		}
		return result;
	}
}