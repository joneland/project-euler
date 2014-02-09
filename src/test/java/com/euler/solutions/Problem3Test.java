package com.euler.solutions;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Problem3Test {
	private Problem3 problem3 = new Problem3();

	@Test public void
	calculates_largest_prime_factor_of_13195_to_be_29() {
		int result = problem3.calculateLargestPrimeFactorOf(13195);

		assertThat(result, is(29));
	}
}