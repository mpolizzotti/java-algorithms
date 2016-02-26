package com.stacks;

import java.util.EmptyStackException;
import com.linkedlists.DoublyLinkedList;
import com.nodes.DoublyLinkedNode;

/**
 * The Stack class represents a last-in-first-out (LIFO) stack of objects.
 */
public class DoublyLinkedStack implements Stack {
	private DoublyLinkedList stack;
	private int top;
	
	/**
	 * Creates an empty Stack.
	 */
	public DoublyLinkedStack() {
		this.top = -1;
		stack = new DoublyLinkedList();
		
		System.out.println("starting top: " + this.top);
	}
	
	/**
	 * Method used to push data to the top of the stack.
	 * 
	 * @param data The data to be pushed onto this stack.
	 * @return The data argument
	 */
	public int push(int data) {
		this.top = (this.top + 1);
		this.stack.insert(data);
		
		return data;
	}
	
	/**
	 * Method used to peek at the value on the top of the stack.
	 * 
	 * @return The object at the top of this stack.
	 */
	public int peek() {
		if (this.top == -1) {
			throw new EmptyStackException();
		}
		
		DoublyLinkedNode topNode = this.stack.getNode(this.top);
		return topNode.getData();
	}
	
	/**
	 * Method used to pop the value from the top of the stack.
	 * 
	 * @return The data at the top of this stack.
	 */
	public int pop() {
		if (this.top == -1) {
			throw new EmptyStackException();
		}
		
		DoublyLinkedNode topNode = this.stack.getNode(this.top);
		int data = topNode.getData();
		this.stack.delete(this.top);
		this.top = (this.top - 1);
		
		return data;
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
	};
	
	/**
	 * Method outputs contents of stack.
	 */
	@Override
	public String toString() {
		String result = "{";
		
		if (this.top != -1) {
			DoublyLinkedNode current = this.stack.getNode(0);
			
			while (current != null) {
				result += current.toString();
				current = current.getNextNode();
				
				if (current != null) {
					result += ", ";
				}
			}
		}
		
		result += "}";
		
		return result;
	}
}