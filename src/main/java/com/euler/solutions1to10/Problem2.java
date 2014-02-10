package com.euler.solutions1to10;

import static com.euler.common.DivisibilityChecker.isEvenlyDivisible;
import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.math.IntMath.checkedAdd;

import java.util.List;

public class Problem2 {
	public int calculateSumOfEvenValuedTermsThatDoNotExceed(int upperBoundary) {
		List<Integer> fibonacciSequence = newArrayList(1, 2);

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

	private int sumOfEvenValuedTermsIn(List<Integer> fibonacciSequence) {
		int result = 0;
		for (int term : fibonacciSequence) {
			if (isEvenlyDivisible(term, 2)) {
				result = checkedAdd(result, term);
			}
		}
		return result;
	}
}