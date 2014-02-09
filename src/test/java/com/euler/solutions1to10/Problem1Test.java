package com.euler.solutions1to10;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.euler.solutions1to10.Problem1;

public class Problem1Test {
	private Problem1 problem1 = new Problem1();

	@Test public void
	calculates_the_sum_of_all_multiples_of_3_and_5_below_10_to_be_23() {
		int result = problem1.calculate(10, 3, 5);

		assertThat(result, is(23));
	}
}