package com.stacks;

public class StackTester {

	public static void main(String[] args) {
		System.out.println("DoublyLinkedStack");
		System.out.println("----------------------");
		
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
		
		System.out.println(" ");
		System.out.println("----------------------");
		
		System.out.println("Array Stack");
		System.out.println("----------------------");
		ArrayStack stack2 = new ArrayStack(5);
		
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		stack2.push(4);
		stack2.push(5);
		stack2.push(6);
		stack2.push(7);
		
		System.out.println("push(): " + stack2);
		
		System.out.println("peek(): " + stack2.peek());
		
		System.out.println("pop(): " + stack2.pop());
		System.out.println("pop(): " + stack2.pop());
		System.out.println("pop(): " + stack2.pop());
		
		System.out.println(stack2);
	}
}