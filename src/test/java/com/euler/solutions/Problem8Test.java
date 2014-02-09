package com.euler.solutions;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Problem8Test {
	private Problem8 problem8 = new Problem8();

	@Test public void
	calculates_x() {
		int result = problem8.calculateLargestProductOfFiveConsecutiveNumbersIn("1234567890");

		assertThat(result, is(15120));
	}
}