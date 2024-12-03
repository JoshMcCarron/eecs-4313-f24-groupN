package com.thealgorithms.datastructures.stacks;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

class StackOfLinkedListTestGemini {
	
	/*
	 * given this java code implementing a stack of linked lists, I want you to write a minimal set of test cases giving 100% test coverage using jacoco. 
	 * I want you to use a specific technique based on the problem and specify what technique you used and the steps you took.
	 */

    @Test
    public void testPushEmptyStack() {
        LinkedListStack stack = new LinkedListStack();
        assertTrue(stack.push(10));
        assertEquals(1, stack.getSize());
        assertEquals(10, stack.peek());
    }

    @Test
    public void testPushNonEmptyStack() {
        LinkedListStack stack = new LinkedListStack();
        stack.push(5);
        assertTrue(stack.push(10));
        assertEquals(2, stack.getSize());
        assertEquals(10, stack.peek());
    }

    @Test
    public void testPopEmptyStack() {
        LinkedListStack stack = new LinkedListStack();
        assertThrows(NoSuchElementException.class, () -> stack.pop());
    }

    @Test
    public void testPopNonEmptyStack() {
        LinkedListStack stack = new LinkedListStack();
        stack.push(5);
        stack.push(10);
        assertEquals(10, stack.pop());
        assertEquals(1, stack.getSize());
        assertEquals(5, stack.peek());
    }

    @Test
    public void testPeekEmptyStack() {
        LinkedListStack stack = new LinkedListStack();
        assertThrows(NoSuchElementException.class, () -> stack.peek());
    }

    @Test
    public void testPeekNonEmptyStack() {
        LinkedListStack stack = new LinkedListStack();
        stack.push(5);
        assertEquals(5, stack.peek());
        assertEquals(1, stack.getSize());
    }

    @Test
    public void testIsEmptyEmptyStack() {
        LinkedListStack stack = new LinkedListStack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmptyNonEmptyStack() {
        LinkedListStack stack = new LinkedListStack();
        stack.push(5);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testGetSizeEmptyStack() {
        LinkedListStack stack = new LinkedListStack();
        assertEquals(0, stack.getSize());
    }

    @Test
    public void testGetSizeNonEmptyStack() {
        LinkedListStack stack = new LinkedListStack();
        stack.push(5);
        stack.push(10);
        assertEquals(2, stack.getSize());
    }

    @Test
    public void testMakeEmptyEmptyStack() {
        LinkedListStack stack = new LinkedListStack();
        stack.makeEmpty();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test
    public void testMakeEmptyNonEmptyStack() {
        LinkedListStack stack = new LinkedListStack();
        stack.push(5);
        stack.push(10);
        stack.makeEmpty();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test
    public void testToStringEmptyStack() {
        LinkedListStack stack = new LinkedListStack();
        assertEquals("", stack.toString());
    }

    @Test
    public void testToStringNonEmptyStack() {
        LinkedListStack stack = new LinkedListStack();
        stack.push(5);
        stack.push(10);
        assertEquals("10->5", stack.toString());
    }

}
