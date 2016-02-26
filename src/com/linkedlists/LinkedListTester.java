package com.linkedlists;

public class LinkedListTester {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertAtHead(20);
		list.insertAtHead(19);
		list.insertAtHead(14);
		list.insertAtHead(12);
		list.insertAtHead(10);
		list.insertAtHead(5);
		
		//System.out.println("insertAtHead(): " + list);
		
		list.insert(3);
		list.insert(9);
		
		//System.out.println("insert(): " + list);
		
		list.insert(2, 4);
		list.insert(4, 25);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.insert(60);
		list.insert(3, 30);
		list.insert(4, 50);
		list.insert(4, 40);
		
		//System.out.println("insert(): " + list);
		
		list.deleteAtHead();
		
		//System.out.println("deleteAtHead(): " + list);
		
		list.sort();
		
		System.out.println("sort(): " + list);
		
		list.appendToFrontOfList(10);
		
		System.out.println("appendToFrontOfList(): " + list);
		
		//System.out.println("length(): " + list.length());
		//System.out.println("Found: " + list.find(12));
		//System.out.println("Found: " + list.find(50));
		
		list.delete(1);
		list.delete(9);
		//list.delete(50);
		System.out.println("delete(index): " + list);
		
		list.deleteDuplicates();
		System.out.println("deleteDuplicates: " + list);
		list.sort();
		System.out.println("sort(): " + list);
	}

}
