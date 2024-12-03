package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class WordLadderTestChatGPT {
	
	/*
	 * given this java code implementing the wordladder algorithm, I want you to write a minimal set of test cases giving 100% test coverage using jacoco. 
	 * I want you to use a specific technique based on the problem and specify what technique you used and the steps you took.
	 */

    @Test
    void testLadderLength_NoEndWordInWordList() {
        assertEquals(0, WordLadder.ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog")));
    }

    @Test
    void testLadderLength_ShortestPathExists() {
        assertEquals(5, WordLadder.ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log", "cog")));
    }

    @Test
    void testLadderLength_BeginWordEqualsEndWord() {
        assertEquals(0, WordLadder.ladderLength("hit", "hit", Arrays.asList("hot", "dot", "dog")));
    }

    @Test
    void testLadderLength_EmptyWordList() {
        assertEquals(0, WordLadder.ladderLength("hit", "cog", Collections.emptyList()));
    }

    @Test
    void testLadderLength_SingleCharacterTransformation() {
        assertEquals(2, WordLadder.ladderLength("a", "c", Arrays.asList("b", "c")));
    }

    @Test
    void testLadderLength_NoValidTransformation() {
        assertEquals(0, WordLadder.ladderLength("hit", "xyz", Arrays.asList("hot", "dot", "dog", "lot", "log")));
    }

    @Test
    void testLadderLength_LargeWordList() {
        assertEquals(0, WordLadder.ladderLength("hit", "cog", Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee")));
    }

}
