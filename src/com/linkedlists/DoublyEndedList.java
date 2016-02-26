package com.linkedlists;

import com.nodes.Node;

public class DoublyEndedList {
	private Node head;
	private Node tail;
	
	public void insertAtTail(int data) {
		Node newNode = new Node(data);
		if (this.head == null) {
			this.head = newNode;
		}
		
		if (this.tail != null) {
			this.tail.setNextNode(newNode);
			this.tail = newNode;
		}
		
		if (this.tail == null) {
			this.tail = newNode;
		}
	}
	
	public int length() {
		if (this.head == null) {
			return 0;
		}
		
		int length = 0;
		Node current = this.head;
		while (current != null) {
			length += 1;
			current = current.getNextNode();
		}
		
		return length;
	}
	
	@Override
	public String toString() {
		String result = "{";
		Node current = this.head;
		
		while (current != null) {
			result += current.toString();
			current = current.getNextNode();
			
			if (current != null) {
				result += ", ";
			}
		}
		
		result += "}";
		
		return result;
	}
}