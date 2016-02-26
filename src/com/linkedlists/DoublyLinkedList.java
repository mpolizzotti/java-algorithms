package com.linkedlists;

import java.util.NoSuchElementException;
import com.nodes.DoublyLinkedNode;

public class DoublyLinkedList {
	private DoublyLinkedNode head;
	
	/**
	 * Constructs an empty list.
	 */
	public DoublyLinkedList() {
		this.head = null;
	}
	
	/**
	 * Method returns true if this list contains no elements.
	 * 
	 * @return true if this list contains no elements
	 */
	public boolean isEmpty() {
		return this.head == null;
	}
	
	/**
	 * Method returns the length of list.
	 * 
	 * @return The length of the list
	 */
	public int length() {
		if (this.head == null ) {
			throw new NoSuchElementException();
		}
		
		DoublyLinkedNode current = this.head;
		int length = 0;
		while (current != null) {
			length = length + 1;
			current = current.getNextNode();
		}
		
		return length;
	}
	
	/**
	 * Method inserts a node at the head of the list.
	 * 
	 * @param data Data to insert
	 */
	public void insertAtHead(int data) {
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		DoublyLinkedNode current = this.head;
		
		if (current == null) {
			this.head = newNode;
			return;
		}
		
		newNode.setNextNode(current);
		current.setPrevNode(newNode);
		this.head = newNode;
	}
	
	/**
	 * Method inserts a new node at the end of the list.
	 * 
	 * @param data Data to insert.
	 */
	public void insert(int data) {
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		DoublyLinkedNode current = this.head;
		
		if (current == null) {
			this.insertAtHead(data);
			return;
		}
		
		int length = this.length();
		DoublyLinkedNode lastNode = this.getNode(length - 1);
		lastNode.setNextNode(newNode);
		newNode.setPrevNode(lastNode);
	}
	
	/**
	 * Method removes the first node in the list.
	 */
	public void deleteAtHead() {
		if (this.head == null ) {
			throw new NoSuchElementException();
		}
		
		DoublyLinkedNode current = this.head;
		this.head = current.getNextNode();
	}
	
	/**
	 * Method removes node from list based upon the past index
	 * position.
	 * 
	 * @param index Position to delete
	 */
	public void delete(int index) {
		if (index < 0) {
			throw new NoSuchElementException();
		}
		
		int count = 0;
		DoublyLinkedNode current = this.head;
		
		if (count == index) {
			this.deleteAtHead();
			return;
		}
		
		while (current != null) {
			if (count == index) {
				DoublyLinkedNode nodeA = current.getPrevNode();
				DoublyLinkedNode nodeC = current.getNextNode();
				
				nodeA.setNextNode(nodeC);
				if (nodeC != null) {
					nodeC.setPrevNode(nodeA);
				} else {
					nodeC = null;
				}
			}
			
			count = count + 1;
			current = current.getNextNode();
		}
		
		if (index > (count - 1)) {
			throw new NoSuchElementException();
		}
	}
	
	/**
	 * Method returns node at the given index position.
	 * 
	 * @param index Position of node
	 * @return Node at index position
	 */
	public DoublyLinkedNode getNode(int index) {
		if (this.head == null ) {
			throw new NoSuchElementException();
		}
		
		if (index < 0) {
			throw new NoSuchElementException();
		}
		
		int count = 0;
		DoublyLinkedNode current = this.head;
		DoublyLinkedNode selectedNode = current;
		
		while (current != null) {
			if (index == count) {
				selectedNode = current;
			}
			
			count = count + 1;
			current = current.getNextNode();
		}
		
		if (index > (count - 1)) {
			throw new NoSuchElementException();
		}
		
		return selectedNode;
	}
	
	/**
	 * Method swaps two nodes in the linked list.
	 * 
	 * @param node1 Node to swap
	 * @param node2 Node to swap
	 */
	private void swapNodes(DoublyLinkedNode node1, DoublyLinkedNode node2) {
		// Nodes cannot be null.
		if (node1 == null || node2 == null) {
			throw new IllegalArgumentException("The nodes couldn't be null.");
		}

		// Nodes cannot be the same.
		if (node1 == node2) {
			return;
		}

		// Make sure node1 is before node2 and swap the nodes.
		if (node1.getPrevNode() == node2) {
			DoublyLinkedNode temp = node2;
			node2 = node1;
			node1 = temp;
		}

		// Reconnect previous and next link references.
		DoublyLinkedNode node1Prev = node1.getPrevNode();	// null
		DoublyLinkedNode node1Next = node1.getNextNode();	// 2
		DoublyLinkedNode node2Prev = node2.getPrevNode();	// 5
		DoublyLinkedNode node2Next = node2.getNextNode();	// 4

		node1.setNextNode(node2Next);
		if (node2Next != null) {
			node2Next.setPrevNode(node1);
		}

		node2.setPrevNode(node1Prev);
		if (node1Prev != null) {
			node1Prev.setNextNode(node2);
		}

		if (node1 == node2Prev) {
			node1.setPrevNode(node2);
			node2.setNextNode(node1);
		} else {
			node1.setPrevNode(node2Prev);
			if (node2Prev != null) {
				node2Prev.setNextNode(node1);
			}

			node2.setNextNode(node1Next);
			if (node1Next != null) {
				node1Next.setNextNode(node2);
			}
		}

		if (node1 == this.head) {
			this.head = node2;
		} else if (node2 == head) {
			this.head = node1;
		}
	}
	
	/**
	 * Method sorts linked list using an insertion sort algorithm.
	 */
	public void sort() {
		if (this.head == null ) {
			throw new NoSuchElementException();
		}
		
		DoublyLinkedNode current = this.head;
		
		while (current != null) {
			DoublyLinkedNode previous = current.getPrevNode();
			
			while (previous != null && previous.getData() >= current.getData()) {
				this.swapNodes(current, previous);
				previous = previous.getPrevNode();
			}
			
			current = current.getNextNode();
		}
	}
	
	/**
	 * Method reverses the order of the list.
	 * 
	 * @return Reversed list
	 */
	public DoublyLinkedList reverse() {
		if (this.head == null ) {
			throw new NoSuchElementException();
		}
		
		DoublyLinkedList list = new DoublyLinkedList();
		DoublyLinkedNode current = this.head;
		DoublyLinkedNode node;
		
		while (current != null) {
			list.insertAtHead(current.getData());
			current = current.getNextNode();
		}
		
		node = list.getNode(0);
		this.head = node;
		
		return list;
	}
	
	/**
	 * Method outputs contents of list.
	 */
	@Override
	public String toString() {
		String result = "{";
		DoublyLinkedNode current = this.head;
		
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