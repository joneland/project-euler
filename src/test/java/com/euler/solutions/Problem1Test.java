package com.euler.solutions;

import static com.euler.solutions.Problem1.calculate;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Problem1Test {
	@Test public void
	should_calculate_the_sum_of_all_multiples_of_3_and_5_below_1000() {
		assertThat(calculate(1000, 3, 5), is(0));
	}
}