package com.thealgorithms.datastructures.stacks;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*Chilenski’s Method [MCDC]
 * 1. Every statement must be executed at least once,
 * 2. Every program entry point and exit point must be invoked at least once,
 * 3. All possible outcomes of every control statement are taken at least once [i.e. decision coverage],
 * 4. Every non-constant Boolean expression has been evaluated to both True and False outcomes [condition coverage],
 * 5. Every non-constant condition in a Boolean expression has been evaluated to both True and False outcome, while holding the other conditions constant, and
 * 6. Every non-constant condition in a Boolean expression has been shown to independently affect the outcomes (of the expression).
 */
class StackOfLinkedListTest {
	private LinkedListStack stack;


	@BeforeEach
	void setUp() {
		stack = new LinkedListStack();
	}

	@Test
	void testNodeCreation() {
		Node node1 = new Node(1);
		assertEquals(1,node1.data);
		assertNull(node1.next);
	}

	@Test
	void testLLCreation() {
		assertEquals(0, stack.getSize());
	}
	//--------------------------------------------------------------------------//

	//push method tests
	@Test
	void pushToEmpty() {

		assertTrue(stack.push(1));
		assertEquals(1,stack.peek());
		assertEquals(1,stack.getSize());

	}
	@Test 
	void pushNonEmpty() {

		assertTrue(stack.push(1));
		assertTrue(stack.push(10));
		assertEquals(10,stack.peek());
		assertEquals(2,stack.getSize());
	}
	//--------------------------------------------------------------------------//

	//pop method tests
	@Test
	void popEmpty() {
		assertThrows(NoSuchElementException.class, ()->{
			stack.pop();
		});
	}
	@Test
	void popNonEmpty() {
		stack.push(5);
		stack.push(17);
		assertEquals(17,stack.pop());
		assertEquals(1,stack.getSize());
		assertEquals(5,stack.peek());
	}
	//--------------------------------------------------------------------------//

	//peek method tests
	@Test 
	void peekEmpty() {
		assertThrows(NoSuchElementException.class, ()->{
			stack.peek();
		});
	}
	@Test
	void peekNonEmpty(){
		stack.push(42);
		assertEquals(42,stack.peek());
		assertEquals(1,stack.getSize());
	}
	//--------------------------------------------------------------------------//

	//toString method tests
	@Test
	void toStringEmptyStack() {
		assertEquals("",stack.toString());
	}
	@Test
	void toStringSingleNodeStack() {
		stack.push(65);
		assertEquals("65",stack.toString());
	}
	@Test
	void toStringMultiNodeStack() {
		stack.push(54);
		stack.push(87);
		assertEquals("87->54",stack.toString());
	}
	@Test
	void toStringPostPop() {
		stack.push(66);
		stack.push(33);
		stack.push(99);
		stack.pop();
		assertEquals("33->66",stack.toString());
	}
	//--------------------------------------------------------------------------//

	//isEmpty method tests
	@Test
	void emptyStack() {
		assertTrue(stack.isEmpty());
	}
	@Test
	void nonEmptyStack() {
		stack.push(33);
		assertFalse(stack.isEmpty());
	}
	//--------------------------------------------------------------------------//

	//makeEmpty method tests
	@Test
	void makeEmpty() {
		stack.push(6);
		stack.push(8);
		stack.makeEmpty();
		assertTrue(stack.isEmpty());
		assertEquals(0,stack.getSize());
		assertThrows(NoSuchElementException.class, ()->{
			stack.peek();
		});
	}



}
