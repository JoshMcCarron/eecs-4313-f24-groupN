package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class HorspoolSearchTest {

	

	//Case sensitive
	@Test
	void emptyPattern() {
		assertEquals(-1,HorspoolSearch.findFirst("","Some text here"));
	}
	@Test
	void emptyText() {
		assertEquals(-1,HorspoolSearch.findFirst("hello",""));

	}
	@Test
	void patternNotFound() {
		assertEquals(-1,HorspoolSearch.findFirst("hello","Some text here"));
	}
	@Test
	void patternLongerThanText() {
		assertEquals(-1,HorspoolSearch.findFirst("long pattern","text"));
	}
	@Test
	void patternEqualsText() {
		assertEquals(0,HorspoolSearch.findFirst("hello","hello"));
	}
	@Test
	void patternAtStart() {
		assertEquals(0,HorspoolSearch.findFirst("hello","hello, how are you"));
	}
	@Test 
	void patternAtEnd() {
		assertEquals(8,HorspoolSearch.findFirst("hello","he said hello"));

	}
	@Test
	void patternFoundMiddle() {
		assertEquals(9,HorspoolSearch.findFirst("hello","she said hello, how are you"));
	}
	@Test
	void patternMatchButWrongCase() {
		assertEquals(-1,HorspoolSearch.findFirst("heLLo","hello"));
	}
	
	@Test 
	void multiOccurrences() {
		assertEquals(4,HorspoolSearch.findFirst("hello","Hi, hello. Everyone said hello."));

	}
	//--------------------------------------------------------------------------//
	
	//Case Insensitive
	@Test
	void caseSensitiveInstantMatch() {
		assertEquals(0,HorspoolSearch.findFirstInsensitive("heLLo","hello"));

	}
	@Test //bug found, should equal 8, but was -1
	void caseSensitiveMatchFound() {
		assertEquals(8,HorspoolSearch.findFirst("HeLLo","he said hello"));

	}
	@Test
	void caseSensitiveMisMatch() {
		assertEquals(-1,HorspoolSearch.findFirstInsensitive("heLLo","Checking if same as case sensitive"));
	}
	//--------------------------------------------------------------------------//
	
	//last comparisons
	@Test
	void getLastComparisons() {
		HorspoolSearch.findFirst("hello","he said hello");
		assertTrue(HorspoolSearch.getLastComparisons() > 0);
	}

}
