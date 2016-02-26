package com.linkedlists;

public class DoublyLinkedListTester {

	public static void main(String[] args) {
		// Create empty list.
		DoublyLinkedList list = new DoublyLinkedList();
		
		// Insert at head.
		list.insertAtHead(1);
		list.insertAtHead(4);
		list.insertAtHead(80);
		list.insertAtHead(20);
		list.insertAtHead(16);
		list.insertAtHead(6);
		list.insertAtHead(2);
		list.insertAtHead(8);
		System.out.println("insertAtHead(): " + list);
		
		// Insert.
		list.insert(10);
		System.out.println("insert(): " + list);
		
		// Get node.
		System.out.println("getNode(0): " + list.getNode(0));
		
		// Length.
		System.out.println("length(): " + list.length());
		
		// Sort.
		list.sort();
		System.out.println("sort(): " + list);
		
		// Reverse.
		list.reverse();
		System.out.println("reverse(): " + list);
		
		// Delete.
		list.delete(3);
		System.out.println("delete(3): " + list);
	}

}
