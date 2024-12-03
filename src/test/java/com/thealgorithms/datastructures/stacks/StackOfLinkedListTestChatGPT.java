package com.thealgorithms.datastructures.stacks;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackOfLinkedListTestChatGPT {
	
	/*
	 * Prompt given to chatgpt:
	 * given this java code implementing a stack of linked lists, I want you to write a minimal set of test cases giving 
	 * 100% test coverage using jacoco. I want you to use a specific technique based on the problem and specificy what 
	 * technique you used and the steps you took.
	 */

	private LinkedListStack stack;

	@BeforeEach
    void setUp() {
        stack = new LinkedListStack();
    }

    @Test
    void testPushAndGetSize() {
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());

        stack.push(10);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.getSize());
    }

    @Test
    void testPopOnNonEmptyStack() {
        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void testPopOnEmptyStack() {
        assertThrows(NoSuchElementException.class, stack::pop);
    }

    @Test
    void testPeekOnNonEmptyStack() {
        stack.push(10);
        assertEquals(10, stack.peek());
    }

    @Test
    void testPeekOnEmptyStack() {
        assertThrows(NoSuchElementException.class, stack::peek);
    }

    @Test
    void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(10);
        assertFalse(stack.isEmpty());
    }

    @Test
    void testToStringEmptyStack() {
        assertEquals("", stack.toString());
    }

    @Test
    void testToStringSingleElementStack() {
        stack.push(10);
        assertEquals("10", stack.toString());
    }

    @Test
    void testToStringMultipleElements() {
        stack.push(10);
        stack.push(20);
        assertEquals("20->10", stack.toString());
    }

    @Test
    void testMakeEmpty() {
        stack.push(10);
        stack.push(20);
        stack.makeEmpty();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

}
