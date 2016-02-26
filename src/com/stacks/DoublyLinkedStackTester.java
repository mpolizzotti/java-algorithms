package com.stacks;

public class DoublyLinkedStackTester {

	public static void main(String[] args) {
		// Initialize a new stack.
		DoublyLinkedStack stack = new DoublyLinkedStack();
		
		// Empty.
		System.out.println("Empty: " + stack.empty());
		
		// Push.
		stack.push(5);
		stack.push(6);
		stack.push(7);
		System.out.println("push(): " + stack);
		
		// Empty.
		System.out.println("empty(): " + stack.empty());
		
		// Peek.
		System.out.println("peek(): " + stack.peek());
		
		// Pop.
		System.out.println("pop(): " + stack.pop());
		System.out.println("pop() " + stack.pop());
		
		// Empty.
		System.out.println("Empty: " + stack.empty());
		
		// Output stack.
		System.out.println(stack);
	}

}