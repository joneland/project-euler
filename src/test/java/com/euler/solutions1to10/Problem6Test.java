package com.euler.solutions1to10;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.euler.solutions1to10.Problem6;

public class Problem6Test {
	private Problem6 problem6 = new Problem6();

	@Test public void
	calculates_the_sum_square_difference_of_the_1_to_10_to_be_2640() {
		int result = problem6.calculateSumSquareDifferenceOfOneTo(10);

		assertThat(result, is(2640));
	}
}