package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HorspoolSearchTestChatGPT {
	
	/*
	 * given this java code implementing the horsepool algorithm, I want you to write a minimal set of test cases giving 100% test coverage using jacoco. 
	 * I want you to use a specific technique based on the problem and specify what technique you used and the steps you took.
	 */


    @BeforeEach
    void setUp() {
        HorspoolSearch.getLastComparisons(); // Reset state before each test
    }

    @Test
    void testFindFirst_EmptyPattern() {
        assertEquals(-1, HorspoolSearch.findFirst("", "text"));
    }

    @Test
    void testFindFirst_EmptyText() {
        assertEquals(-1, HorspoolSearch.findFirst("pattern", ""));
    }

    @Test
    void testFindFirst_SingleCharacterMatch() {
        assertEquals(2, HorspoolSearch.findFirst("a", "cba"));
    }

    @Test
    void testFindFirst_MultiCharacterMatch() {
        assertEquals(3, HorspoolSearch.findFirst("test", "abctestxyz"));
    }

    @Test
    void testFindFirst_NoMatch() {
        assertEquals(-1, HorspoolSearch.findFirst("xyz", "abcdef"));
    }

    @Test
    void testFindFirstInsensitive_Match() {
        assertEquals(2, HorspoolSearch.findFirstInsensitive("A", "cba"));
    }

    @Test
    void testFindFirstInsensitive_NoMatch() {
        assertEquals(-1, HorspoolSearch.findFirstInsensitive("A", "xyz"));
    }

    @Test
    void testGetLastComparisons() {
        HorspoolSearch.findFirst("a", "aaa");
        assertTrue(HorspoolSearch.getLastComparisons() > 0);
    }

    @Test
    void testShiftValuesCalculation() {
        assertEquals(1, HorspoolSearch.findFirst("abc", "abcabc"));
    }

    @Test
    void testGetShiftValue() {
        // Testing an internal method indirectly
        assertEquals(3, HorspoolSearch.findFirst("xy", "abcdexy"));
    }

    @Test
    void testMultiCharacterWithBadCharacters() {
        assertEquals(-1, HorspoolSearch.findFirst("test", "invalidtext"));
    }
}
