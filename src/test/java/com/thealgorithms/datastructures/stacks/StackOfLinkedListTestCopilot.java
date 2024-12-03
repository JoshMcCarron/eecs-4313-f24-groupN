package com.thealgorithms.datastructures.stacks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

public class StackOfLinkedListTestCopilot {
	
	/*
	 * given this java code implementing a stack of linked lists, I want you to write a minimal set of test cases giving 100% test coverage using jacoco. 
	 * I want you to use a specific technique based on the problem and specify what technique you used and the steps you took.
	 */

    @Test
    public void testPush() {
        LinkedListStack stack = new LinkedListStack();
        assertTrue(stack.push(10));
        assertEquals(10, stack.peek());
    }

    @Test
    public void testPop() {
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }

    @Test
    public void testPeek() {
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        assertEquals(10, stack.peek());
        stack.push(20);
        assertEquals(20, stack.peek());
    }

    @Test
    public void testIsEmpty() {
        LinkedListStack stack = new LinkedListStack();
        assertTrue(stack.isEmpty());
        stack.push(10);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testGetSize() {
        LinkedListStack stack = new LinkedListStack();
        assertEquals(0, stack.getSize());
        stack.push(10);
        stack.push(20);
        assertEquals(2, stack.getSize());
    }

    @Test
    public void testMakeEmpty() {
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.makeEmpty();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPopEmptyStack() {
        LinkedListStack stack = new LinkedListStack();
        assertThrows(NoSuchElementException.class, stack::pop);
    }

    @Test
    public void testPeekEmptyStack() {
        LinkedListStack stack = new LinkedListStack();
        assertThrows(NoSuchElementException.class, stack::peek);
    }
}
