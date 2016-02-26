package com.linkedlists;

import com.nodes.Node;

public class LinkedList {
	private Node head;
	
	/**
	 * Method inserts a node at the head of the list.
	 * 
	 * @param data Numerical data
	 */
	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}
	
	/**
	 * Method inserts a node at the end of the list.
	 * 
	 * @param data Numerical data
	 */
	public void insert(int data) {
		Node current = this.head;
		if (current == null) {
			this.insertAtHead(data);
			return;
		}
		
		while (current != null) {
			Node nextNode = current.getNextNode();
			if (nextNode == null) {
				Node newNode = new Node(data);
				current.setNextNode(newNode);
				break;
			}
			
			current = current.getNextNode();
		}
	}
	
	/**
	 * Method inserts a node at a specific index position.
	 * 
	 * @param index Index position
	 * @param data Numerical data
	 */
	public void insert(int index, int data) {
		Node newNode = new Node(data);
		Node current = this.head;
		int count = 0;
		
		if (current == null) {
			this.insertAtHead(data);
			return;
		}
		
		int length = this.length();
		if (index > length) {
			throw new IllegalArgumentException("Error: invalid index value passed.");
		}
		
		while (current != null) {
			if (index == 0) {
				this.insertAtHead(data);
				break;
			}
			
			count = (count + 1);
			if (count == index) {
				Node nextNode = current.getNextNode();
				current.setNextNode(newNode);
				newNode.setNextNode(nextNode);
			}
			
			current = current.getNextNode();
		}
	}
	
	/**
	 * Method deletes a node in the list based upon the index (position) parameter.
	 * 
	 * @param index Position of the node to delete
	 */
	public void delete(int index) {
		Node current = this.head;
		Node previous = this.head;
		int count = 0;
		
		if (index < 0) {
			throw new IllegalArgumentException("Error: Invalid index position passed.");
		}
		
		if (count == index) {
			this.deleteAtHead();
			return;
		}
		
		while (current != null) {
			if (count == index) {
				previous.setNextNode(current.getNextNode());
			}
			
			count = count + 1;
			previous = current;
			current = current.getNextNode();
		}
		
		if (index > (count - 1)) {
			throw new IllegalArgumentException("Error: Invalid index position passed.");
		}
	}
	
	/**
	 * Method removes duplicates from the linked list.
	 */
	public void deleteDuplicates() {
		Node current = this.head;
		int count = 0;
		
		while (current != null) {
			Node next = current.getNextNode();
			
			while (next != null) {
				if (current.getData() == next.getData()) {
					this.delete(count);
				}
				
				next = next.getNextNode();
			}
			
			count = count + 1;
			current = current.getNextNode();
		}
	}
	
	/**
	 * Method moves the placement of nodes from the end of the list
	 * to the front of the list based upon the numberOfNodes parameter.
	 * 
	 * @param numberOfNodes Number of nodes to reposition
	 * @return Re-positioned list
	 */
	public LinkedList appendToFrontOfList(int numberOfNodes) {
		LinkedList list = new LinkedList();
		Node current = this.head;
		
		if (current == null) {
			throw new IllegalStateException("Error: The list is empty.");
		}
		
		int length = (this.length() - 1);
		int countFromEnd = (length - numberOfNodes);
		
		if (numberOfNodes > length) {
			throw new IllegalArgumentException("Error: Invalid number of nodes passed.");
		}
		
		int count = 0;
		int nodeCount = 0;
		boolean hasAppended = false;
		
		while (current != null) {
			if (count > countFromEnd) {
				if (!hasAppended) {
					list.insertAtHead(current.getData());
					hasAppended = true;
					nodeCount = nodeCount + 1;
				} else {
					list.insert(nodeCount, current.getData());
					nodeCount = nodeCount + 1;
				}
			} else {
				list.insert(current.getData());
			}
			
			count = count + 1;
			current = current.getNextNode();
		}
		
		this.head = list.getHead();
		return list;
	}
	
	/**
	 * Method sorts list using the insertion sort algorithm.
	 * 
	 * @return Sorted list
	 */
	public LinkedList sort() {
		LinkedList list = new LinkedList();
		Node current = this.head;
		int count = 0;
		
		if (current == null) {
			return list;
		}
		
		while (current != null) {
			Node nextNode = current.getNextNode();
			
			while (nextNode != null) {
				if (current.getData() > nextNode.getData()) {
					int currentValue = current.getData();
					int nextValue = nextNode.getData();
					current.setData(nextValue);
					nextNode.setData(currentValue);
				}
				
				nextNode = nextNode.getNextNode();
			}
			
			count = count + 1;
			list.insert(current.getData());
			current = current.getNextNode();
		}
		
		return list;
	}
	
	/**
	 * Method deletes node at the head of the list.
	 */
	public void deleteAtHead() {
		Node current = this.head;
		this.head = current.getNextNode();
	}
	
	/**
	 * Method returns the length of the list.
	 * 
	 * @return Length of list.
	 */
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
	
	/**
	 * Method returns node based upon the provided data.
	 * 
	 * @param data Data to search
	 * @return Node
	 */
	public Node find(int data) {
		Node current = this.head;
		
		while (current != null) {
			if (current.getData() == data) {
				return current;
			}
			current = current.getNextNode();
		}
		
		return null;
	}
	
	public Node getHead() {
		return this.head;
	}
	
	/**
	 * Method provides toString() output for the list.
	 * 
	 * @return String
	 */
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
