package com.euler.solutions1to10;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.euler.solutions1to10.Problem4;

public class Problem4Test {
	private Problem4 problem4 = new Problem4();

	@Test public void
	calculate_largest_palindromic_number_from_the_product_of_two_lots_of_two_digit_numbers() {
		int result = problem4.calculateLargestPalindromicNumberFromTwoNumbersOfLength(2);

		assertThat(result, is(9009));
	}
}