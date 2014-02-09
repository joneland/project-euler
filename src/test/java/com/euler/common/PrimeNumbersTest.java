package com.euler.common;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrimeNumbersTest {
	private PrimeNumbers primeNumbers = new PrimeNumbers();

	@Test public void
	determines_that_20_is_not_a_prime_number() {
		assertThat(primeNumbers.isPrime(20), is(false));
	}

	@Test public void
	determines_that_29_is_a_prime_number() {
		assertThat(primeNumbers.isPrime(29), is(true));
	}
}