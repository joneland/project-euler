package com.euler.solutions;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Problem7Test {
	private Problem7 problem7 = new Problem7();

	@Test public void
	calculates_sixth_prime_number_to_be_13() {
		int result = problem7.calculatePrimeNumberAtIndex(6);

		assertThat(result, is(13));
	}
}