package com.euler.solutions;

import static com.google.common.math.IntMath.checkedAdd;

import java.util.HashSet;
import java.util.Set;

public class Problem1 {
	public int calculate(int upperBoundary, int... targetIntegers) {
		Set<Integer> multiples = new HashSet<Integer>();

		for (int currentInteger = 1; currentInteger < upperBoundary; currentInteger++) {
			if (currentIntegerIsDivisibleByAnyTargetInteger(currentInteger, targetIntegers)) {
				multiples.add(currentInteger);
			}
		}

		return sumOf(multiples);
	}

	private boolean currentIntegerIsDivisibleByAnyTargetInteger(int currentInteger, int[] targetIntegers) {
		for (int targetInteger : targetIntegers) {
			if (currentInteger % targetInteger == 0) {
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