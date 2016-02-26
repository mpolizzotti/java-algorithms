package com.nodes;

public class Node {
	private int data;
	private Node nextNode;
	
	/**
	 * Construct a new Node object.
	 * @param data Data to be stored
	 */
	public Node (int data) {
		this.data = data;
	}
	
	/**
	 * Return stored data.
	 * @return
	 */
	public int getData() {
		return this.data;
	}
	
	/**
	 * Set data to be stored.
	 * @param data Data to be stored
	 */
	public void setData(int data) {
		this.data = data;
	}
	
	/**
	 * Return reference to the next node.
	 * @return
	 */
	public Node getNextNode() {
		return this.nextNode;
	}
	
	/**
	 * Set reference to the next node.
	 * @param nextNode Node to be set
	 */
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString() {
		return "Data: " + this.data;
	}
}
