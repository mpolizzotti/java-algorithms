package com.stacks;

public interface Stack {
	/**
	 * Method used to push data to the top of the stack.
	 * 
	 * @param data The data to be pushed onto this stack.
	 * @return The data argument
	 */
	public int push(int data);
	
	/**
	 * Method used to peek at the value on the top of the stack.
	 * 
	 * @return The object at the top of this stack.
	 */
	public int peek();
	
	/**
	 * Method used to pop the value from the top of the stack.
	 * 
	 * @return The object at the top of this stack.
	 */
	public int pop();
	
	/**
	 * Method tests if this stack is empty.
	 * 
	 * @return true if and only if this stack contains no items; false otherwise.
	 */
	public boolean empty();
}
