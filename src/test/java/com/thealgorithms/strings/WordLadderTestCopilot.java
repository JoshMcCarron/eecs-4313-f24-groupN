package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class WordLadderTestCopilot {
	
	/*
	 * given this java code implementing the wordladder algorithm, I want you to write a minimal set of test cases giving 100% test coverage using jacoco. 
	 * I want you to use a specific technique based on the problem and specify what technique you used and the steps you took.
	 */

	@Test
	public void testLadderLength_found() {
		assertEquals(5, WordLadder.ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log", "cog")));
	}

	@Test
	public void testLadderLength_notFound() {
		assertEquals(0, WordLadder.ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log")));
	}

	@Test
	public void testLadderLength_noEndWord() {
		assertEquals(0, WordLadder.ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log")));
	}

	@Test
	public void testLadderLength_singleLetterDifference() {
		assertEquals(2, WordLadder.ladderLength("a", "b", Arrays.asList("a", "b", "c")));
	}

	@Test
	public void testLadderLength_emptyWordList() {
		assertEquals(0, WordLadder.ladderLength("hit", "cog", Arrays.asList()));
	}

}
