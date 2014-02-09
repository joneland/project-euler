package com.euler.common;

import static com.euler.common.DivisibilityChecker.isEvenlyDivisible;

public class PrimeNumbers {
	public static boolean isPrime(int number) {
		for(int currentInteger = number - 1; currentInteger >= 2; currentInteger--) {
			if(isEvenlyDivisible(number, currentInteger)) {
				return false;
			}
		}
		return true;
	}
}