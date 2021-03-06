package com.euler.solutions1to10;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.euler.solutions1to10.Problem2;

public class Problem2Test {
	private Problem2 problem2 = new Problem2();

	@Test public void
	calculates_the_sum_of_even_valed_terms_that_do_not_exceed_100_to_be_44() {
		int result = problem2.calculateSumOfEvenValuedTermsThatDoNotExceed(100);

		assertThat(result, is(44));
	}
}