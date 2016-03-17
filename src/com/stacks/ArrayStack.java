package com.stacks;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack implements Stack {
	private int[] stack;
	private int top;
	
	/**
	 * Construct a stack with a size of 50.
	 */
	public ArrayStack() {
		this.top = -1;
		this.stack = new int[50];
	}
	
	/**
	 * Construct a stack based upon the passed size.
	 * 
	 * @param size The size of the stack
	 */
	public ArrayStack(int size) {
		this.top = -1;
		this.stack = new int[size];
	}
	
	/**
	 * Method used to push data to the top of the stack.
	 * 
	 * @param data The data to be pushed onto this stack.
	 * @return The data argument
	 */
	public int push(int data) {
		this.top = (this.top + 1);
		if (this.top >= this.stack.length) {
			this.top = 0;
		}
		
		this.stack[this.top] = data;
		
		return data;
	};
	
	/**
	 * Method used to peek at the value on the top of the stack.
	 * 
	 * @return The object at the top of this stack.
	 */
	public int peek() {
		if (this.top == -1) {
			throw new EmptyStackException();
		}
		
		int data = this.stack[this.top];
		return data;
	};
	
	/**
	 * Method used to pop the value from the top of the stack.
	 * 
	 * @return The data at the top of this stack.
	 */
	public int pop() {
		
		/*
		if (this.top == -1) {
			throw new EmptyStackException();
		}
		
		int data = this.stack[this.top];
		this.stack[this.top] = 0;
		*/
		
		return 0;
	}
	
	/**
	 * Method tests if this stack is empty.
	 * 
	 * @return true if and only if this stack contains no items; false otherwise.
	 */
	public boolean empty() {
		boolean isEmpty = false;
		
		if (this.top == -1) {
			isEmpty = true;
		}
		
		return isEmpty;
	}
	
	public int getTop() {
		return this.top;
	}
	
	@Override
	public String toString() {
		String result = Arrays.toString(this.stack);
		return result;
	}
}