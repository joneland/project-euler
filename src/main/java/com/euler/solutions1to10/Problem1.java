package com.euler.solutions1to10;

import static com.euler.common.DivisibilityChecker.isEvenlyDivisible;
import static com.google.common.collect.Sets.newHashSet;
import static com.google.common.math.IntMath.checkedAdd;

import java.util.Set;

public class Problem1 {
	public int calculate(int upperBoundary, int... targetIntegers) {
		Set<Integer> multiples = newHashSet();

		for (int currentInteger = 1; currentInteger < upperBoundary; currentInteger++) {
			if (currentIntegerIsDivisibleByAnyTargetInteger(currentInteger, targetIntegers)) {
				multiples.add(currentInteger);
			}
		}

		return sumOf(multiples);
	}

	private boolean currentIntegerIsDivisibleByAnyTargetInteger(int currentInteger, int[] targetIntegers) {
		for (int targetInteger : targetIntegers) {
			if (isEvenlyDivisible(currentInteger, targetInteger)) {
				return true;
			}
		}
		return false;
	}

	private int sumOf(Set<Integer> multiples) {
		int result = 0;
		for (int multiple : multiples) {
			result = checkedAdd(result, multiple);
		}
		return result;
	}
}