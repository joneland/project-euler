package com.euler.common;

import static com.google.common.math.IntMath.mod;
import static com.google.common.math.LongMath.mod;

public class DivisibilityChecker {
	public static boolean isDivisible(int integer, int divisor) {
		return mod(integer, divisor) == 0;
	}

	public static boolean isEvenlyDivisible(long integer, int divisor) {
		return mod(integer, divisor) == 0;
	}
}