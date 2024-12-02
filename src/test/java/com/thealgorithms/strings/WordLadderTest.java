package com.thealgorithms.strings;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class WordLadderTest {

	//(!wordSet.contains(endWord)) == true
	@Test
	void endWordNotInWordSet() {
		assertEquals(0, WordLadder.ladderLength("cat", "dog", Arrays.asList("dat", "dag", "hag")));
	}
	//test empty strings //should be 2, or throw an exception (ambiguity found)
	@Test
	void emptyTransformation() {
		assertEquals(2, WordLadder.ladderLength("", "", Arrays.asList("")));
	}
	//tests shortest possible transformation (not including beginWord equals endWord
	@Test
	void shortestTransformation() {
		assertEquals(2, WordLadder.ladderLength("a", "c", Arrays.asList("a","b","c")));

	}
	//tests empty word list
	@Test
	void emptyWordListTransformation() {
		assertEquals(0, WordLadder.ladderLength("cat", "dog",  Collections.emptyList()));
	}
	//tests edge case where beginWord equals endWord
	@Test
	void equalTransformation() {
		assertEquals(2, WordLadder.ladderLength("dog", "dog", Arrays.asList("dog")));
	}
	//test instant match with only a -> (!queue.isEmpty()) equals false (should equal two, but error exists in code)
	@Test
	void justATransformation() {
		assertEquals(2, WordLadder.ladderLength("a", "a", Arrays.asList("a")));
	}
	//tests traversal and exit through the !queue.isEmpty() loop and true for newWord.equals(endWord) and wordSet.remove(newWord) if statements
	@Test
	void validTransformation() {
		assertEquals(5, WordLadder.ladderLength("cat", "dog", Arrays.asList("cag","lag","dog","log","rat" )));
	}
	//tests case sensitivity
	@Test
	void caseSensitiveTransformation() {
		assertEquals(0, WordLadder.ladderLength("Cat", "Dog", Arrays.asList("cag","lag","dog","log","rat" )));
	}
	//tests exit of !queue.isEmpty() loop when no path exists, (!wordSet.contains(endWord)) should be false
	@Test
	void invalidTransformation() {
		assertEquals(0, WordLadder.ladderLength("cat", "dog", Arrays.asList("cag","lag","dog","rat" )));
	}
	//tests disjoint word list
	@Test
	void disjointTransformation() {
		assertEquals(0,WordLadder.ladderLength("aa", "zz", Arrays.asList("ab","cd","ef")));
	}

	
}


