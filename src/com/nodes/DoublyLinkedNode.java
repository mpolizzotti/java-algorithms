package com.nodes;

public class DoublyLinkedNode {
	private int data;
	private DoublyLinkedNode prevNode;
	private DoublyLinkedNode nextNode;
	
	/**
	 * Construct a new node.
	 * 
	 * @param data Data to be stored
	 */
	public DoublyLinkedNode (int data) {
		prevNode = null;
		nextNode = null;
		this.data = data;
	}

	/**
	 * Return stored data.
	 * 
	 * @return Stored data
	 */
	public int getData() {
		return data;
	}

	/**
	 * Set data to be stored.
	 * 
	 * @param data Data to be stored
	 */
	public void setData(int data) {
		this.data = data;
	}
	
	/**
	 * Returns a reference to the previous node.
	 * 
	 * @return Previous node
	 */
	public DoublyLinkedNode getPrevNode() {
		return prevNode;
	}

	/**
	 * Set reference to the previous node.
	 * 
	 * @param prevNode Node to be set
	 */
	public void setPrevNode(DoublyLinkedNode prevNode) {
		this.prevNode = prevNode;
	}

	/**
	 * Returns a reference to the next node.
	 * 
	 * @return Next node
	 */
	public DoublyLinkedNode getNextNode() {
		return nextNode;
	}

	/**
	 * Set reference to the next node.
	 * 
	 * @param nextNode Node to be set
	 */
	public void setNextNode(DoublyLinkedNode nextNode) {
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString() {
		return "Data: " + this.data;
	}

}