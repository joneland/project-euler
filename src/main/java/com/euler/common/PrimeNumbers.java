package com.euler.common;

public class PrimeNumbers {
	public boolean isPrime(int number) {
		for(int currentInteger = number - 1; currentInteger >= 2; currentInteger--) {
			if(dividesWithZeroRemainder(number, currentInteger)) {
				return false;
			}
		}
		return true;
	}

	private boolean dividesWithZeroRemainder(long integer, int divisor) {
		return integer % divisor == 0;
	}
}