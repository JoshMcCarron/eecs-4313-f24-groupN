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
	void nonEmptyPattern() {
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
	void patternMatchButWrongCase() {
		assertEquals(-1,HorspoolSearch.findFirst("heLLo","hello"));
	}
	//--------------------------------------------------------------------------//
	
	//Case Insensitive
	@Test
	void caseSensitiveMatch() {
		assertEquals(0,HorspoolSearch.findFirstInsensitive("heLLo","hello"));

	}
	@Test
	void caseSensitiveMisMatch() {
		assertEquals(-1,HorspoolSearch.findFirstInsensitive("heLLo","Checking if same as case sensitive"));
	}
	//--------------------------------------------------------------------------//
	//may need to test for calcShiftValues
	//still need to check getShiftValue (Override method)

}
