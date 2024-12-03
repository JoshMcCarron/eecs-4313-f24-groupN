package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class WordLadderTestGemini {
	
	/*
	 * given this java code implementing the wordladder algorithm, I want you to write a minimal set of test cases giving 100% test coverage using jacoco. 
	 * I want you to use a specific technique based on the problem and specify what technique you used and the steps you took.
	 */

    @Test
    public void testEmptyWordList() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of();
        int expected = 0;
        int actual = WordLadder.ladderLength(beginWord, endWord, wordList);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleWordWordList() {
        String beginWord = "hit";
        String endWord = "hit";
        List<String> wordList = List.of("hit");
        int expected = 1;
        int actual = WordLadder.ladderLength(beginWord, endWord, wordList);
        assertEquals(expected, actual);

        beginWord = "hit";
        endWord = "cog";
        wordList = List.of("hit");
        expected = 0;
        actual = WordLadder.ladderLength(beginWord, endWord, wordList);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultipleWordWordList() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");
        int expected = 5;
        int actual = WordLadder.ladderLength(beginWord, endWord, wordList);
        assertEquals(expected, actual);

        // Test unreachable endWord
        wordList = List.of("hot", "dot", "dog", "lot");
        expected = 0;
        actual = WordLadder.ladderLength(beginWord, endWord, wordList);
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidInput() {
        String nullBeginWord = null;
        String emptyBeginWord = "";
        String endWord = "cog";
        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");

        assertThrows(NullPointerException.class, () -> WordLadder.ladderLength(nullBeginWord, endWord, wordList));
        assertThrows(IllegalArgumentException.class, () -> WordLadder.ladderLength(emptyBeginWord, endWord, wordList));

        String nullEndWord = null;
        String emptyEndWord = "";
        String beginWord = "hit";

        assertThrows(NullPointerException.class, () -> WordLadder.ladderLength(beginWord, nullEndWord, wordList));
        assertThrows(IllegalArgumentException.class, () -> WordLadder.ladderLength(beginWord, emptyEndWord, wordList));

        List<String> nullWordList = List.of(null, "dot", "dog", "lot", "log", "cog");
        List<String> emptyWordList = List.of("", "dot", "dog", "lot", "log", "cog");

        assertThrows(NullPointerException.class, () -> WordLadder.ladderLength(beginWord, endWord, nullWordList));
        assertThrows(IllegalArgumentException.class, () -> WordLadder.ladderLength(beginWord, endWord, emptyWordList));
    }

}
