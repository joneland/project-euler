package com.euler.solutions1to10;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.euler.solutions1to10.Problem5;

public class Problem5Test {
	private Problem5 problem5 = new Problem5();

	@Test public void
	calculates_smallest_number_evenly_divisible_by_all_numbers_between_1_and_10_to_be_2520() {
		int result = problem5.calculateSmallestNumberEvenlyDivisibleByAllNumbersBetween(1, 10);

		assertThat(result, is(2520));
	}
}