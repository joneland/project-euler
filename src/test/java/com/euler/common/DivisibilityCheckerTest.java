package com.euler.common;

import static com.euler.common.DivisibilityChecker.isEvenlyDivisible;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DivisibilityCheckerTest {
	@Test public void
	determines_that_3_is_not_divisible_by_2() {
		assertThat(isEvenlyDivisible(3, 2), is(false));
	}

	@Test public void
	determines_that_4_is_divisilbe_by_2() {
		assertThat(isEvenlyDivisible(4, 2), is(true));
	}
}