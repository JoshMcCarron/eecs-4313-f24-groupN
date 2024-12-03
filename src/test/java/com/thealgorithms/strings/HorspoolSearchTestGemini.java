package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HorspoolSearchTestGemini {
	
	/*
	 * given this java code implementing the horsepool algorithm, I want you to write a minimal set of test cases giving 100% test coverage using jacoco. 
	 * I want you to use a specific technique based on the problem and specify what technique you used and the steps you took.
	 */

    @Test
    public void testFindFirstEmptyPattern() {
        String pattern = "";
        String text = "This is a test string";
        assertEquals(-1, HorspoolSearch.findFirst(pattern, text));
    }

    @Test
    public void testFindFirstEmptyText() {
        String pattern = "test";
        String text = "";
        assertEquals(-1, HorspoolSearch.findFirst(pattern, text));
    }

    @Test
    public void testFindFirstSingleCharPatternMatch() {
        String pattern = "a";
        String text = "This is a test string";
        assertEquals(10, HorspoolSearch.findFirst(pattern, text));
    }

    @Test
    public void testFindFirstSingleCharPatternNoMatch() {
        String pattern = "z";
        String text = "This is a test string";
        assertEquals(-1, HorspoolSearch.findFirst(pattern, text));
    }

    @Test
    public void testFindFirstPatternEqualToTextMatch() {
        String pattern = "test";
        String text = "test";
        assertEquals(0, HorspoolSearch.findFirst(pattern, text));
    }

    @Test
    public void testFindFirstPatternEqualToTextNoMatch() {
        String pattern = "test";
        String text = "test1";
        assertEquals(-1, HorspoolSearch.findFirst(pattern, text));
    }

    @Test
    public void testFindFirstPatternLongerThanText() {
        String pattern = "This is a long pattern";
        String text = "This is a test string";
        assertEquals(-1, HorspoolSearch.findFirst(pattern, text));
    }

    @Test
    public void testFindFirstCaseSensitiveMatch() {
        String pattern = "Test";
        String text = "This is a Test string";
        assertEquals(10, HorspoolSearch.findFirst(pattern, text));
    }

    @Test
    public void testFindFirstCaseSensitiveNoMatch() {
        String pattern = "test";
        String text = "This is a Test string";
        assertEquals(-1, HorspoolSearch.findFirst(pattern, text));
    }

    @Test
    public void testFindFirstCaseInsensitiveMatch() {
        String pattern = "test";
        String text = "This is a Test string";
        assertEquals(10, HorspoolSearch.findFirstInsensitive(pattern, text));
    }

    @Test
    public void testFindFirstWithMultipleMatches() {
        String pattern = "ab";
        String text = "abababab";
        assertEquals(0, HorspoolSearch.findFirst(pattern, text));
    }

    @Test
    public void testFindFirstWithPartialMatch() {
        String pattern = "abc";
        String text = "abxabc";
        assertEquals(3, HorspoolSearch.findFirst(pattern, text));
    }

}
