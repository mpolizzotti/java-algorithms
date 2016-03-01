package com.linkedlists;

public class LinkedListsTester {

	public static void main(String[] args) {
		System.out.println("LinkedList");
		System.out.println("--------------------");
		
		LinkedList list = new LinkedList();
		
		list.insertAtHead(20);
		list.insertAtHead(19);
		list.insertAtHead(14);
		list.insertAtHead(12);
		list.insertAtHead(10);
		list.insertAtHead(5);
		
		System.out.println("insertAtHead(): " + list);
		
		list.insert(3);
		list.insert(9);
		
		System.out.println("insert(): " + list);
		
		list.insert(2, 4);
		list.insert(4, 25);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.insert(60);
		list.insert(3, 30);
		list.insert(4, 50);
		list.insert(4, 40);
		
		System.out.println("insert(data, index): " + list);
		
		list.deleteAtHead();
		
		System.out.println("deleteAtHead(): " + list);
		
		list.sort();
		
		System.out.println("sort(): " + list);
		
		list.appendToFrontOfList(10);
		
		System.out.println("appendToFrontOfList(): " + list);
		
		System.out.println("length(): " + list.length());
		
		System.out.println("find(12): " + list.find(12));
		System.out.println("find(50): " + list.find(50));
		
		list.delete(1);
		list.delete(9);
		//list.delete(50); // Will throw exception.
		
		System.out.println("delete(index): " + list);
		
		list.deleteDuplicates();
		
		System.out.println("deleteDuplicates: " + list);
		
		System.out.println("--------------------");
		System.out.println(" ");
		
		
		System.out.println("DoublyLinkedList");
		System.out.println("--------------------");
		
		DoublyLinkedList list2 = new DoublyLinkedList();
		
		list2.insertAtHead(1);
		list2.insertAtHead(4);
		list2.insertAtHead(80);
		list2.insertAtHead(20);
		list2.insertAtHead(16);
		list2.insertAtHead(6);
		list2.insertAtHead(2);
		list2.insertAtHead(8);
		
		System.out.println("insertAtHead(): " + list2);
		
		list2.insert(10);
		
		System.out.println("insert(): " + list2);
		
		System.out.println("getNode(0): " + list2.getNode(0));
		
		// Length.
		System.out.println("length(): " + list2.length());
		
		// Sort.
		list2.sort();
		
		System.out.println("sort(): " + list2);
		
		// Reverse.
		list2.reverse();
		
		System.out.println("reverse(): " + list2);
		
		// Delete.
		list2.delete(3);
		System.out.println("delete(3): " + list2);
		
		System.out.println("--------------------");
		System.out.println(" ");
		
		
		System.out.println("DoublyEndedList");
		System.out.println("--------------------");
		
		DoublyEndedList dList = new DoublyEndedList();
		
		dList.insertAtTail(19);
		dList.insertAtTail(18);
		dList.insertAtTail(17);
		dList.insertAtTail(16);
		dList.insertAtTail(15);
		
		System.out.println("insertAtTail(): " + dList);
		
		System.out.println("length(): " + dList.length());
		
		System.out.println("--------------------");
		System.out.println(" ");
	}

}
