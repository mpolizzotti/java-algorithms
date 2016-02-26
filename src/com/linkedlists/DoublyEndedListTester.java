package com.linkedlists;

public class DoublyEndedListTester {

	public static void main(String[] args) {
		DoublyEndedList dList = new DoublyEndedList();
		
		dList.insertAtTail(19);
		dList.insertAtTail(18);
		dList.insertAtTail(17);
		dList.insertAtTail(16);
		dList.insertAtTail(15);
		
		System.out.println(dList);
		System.out.println("Length: " + dList.length());
	}

}
