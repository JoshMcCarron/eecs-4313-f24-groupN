package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HorspoolSearchTestCopilot {
	
	/*
	 * given this java code implementing the horsepool algorithm, I want you to write a minimal set of test cases giving 100% test coverage using jacoco. 
	 * I want you to use a specific technique based on the problem and specify what technique you used and the steps you took.
	 */

	@Test
	public void testFindFirst() {
		assertEquals(8, HorspoolSearch.findFirst("hello", "he said hello"));
		assertEquals(-1, HorspoolSearch.findFirst("world", "he said hello"));
		assertEquals(-1, HorspoolSearch.findFirst("", "he said hello"));
	}

	@Test
	public void testFindFirstInsensitive() {
		assertEquals(8, HorspoolSearch.findFirstInsensitive("HElLo", "he said hello"));
		assertEquals(-1, HorspoolSearch.findFirstInsensitive("WORLD", "he said hello"));
	}

	@Test
	public void testGetLastComparisons() {
		HorspoolSearch.findFirst("hello", "he said hello");
		assertTrue(HorspoolSearch.getLastComparisons() > 0);
	}

	@Test
	public void testEmptyPattern() {
		assertEquals(-1, HorspoolSearch.findFirst("", "he said hello"));
		assertEquals(-1, HorspoolSearch.findFirstInsensitive("", "he said hello"));
	}

	@Test
	public void testEmptyText() {
		assertEquals(-1, HorspoolSearch.findFirst("hello", ""));
		assertEquals(-1, HorspoolSearch.findFirstInsensitive("hello", ""));
	}


}
