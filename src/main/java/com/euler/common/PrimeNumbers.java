package com.euler.common;

public class PrimeNumbers {
	public static boolean isPrime(int number) {
		for(int currentInteger = number - 1; currentInteger >= 2; currentInteger--) {
			if(dividesWithZeroRemainder(number, currentInteger)) {
				return false;
			}
		}
		return true;
	}

	private static boolean dividesWithZeroRemainder(long integer, int divisor) {
		return integer % divisor == 0;
	}
}