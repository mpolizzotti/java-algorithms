package com.sorting;

import com.sorting.Employee;

public class AssignmentTester {

	public static void main(String[] args) {
		//----------------
		// Assignment 1
		//----------------
		
		// Create insertion sort object.
		InsertionSort insertionSort = new InsertionSort();
		
		// Create multiple employee objects.
		Employee employee1 = new Employee(200000000, "Matt", "Polizzotti", "matt.polizzotti@gmail.com");
		Employee employee2 = new Employee(100000000, "Brian", "Polizzotti", "brian.polizzotti@gmail.com");
		Employee employee3 = new Employee(500000000, "David", "Polizzotti", "david.polizzotti@gmail.com");
		Employee employee4 = new Employee(300000000, "Amy", "Polizzotti", "amy.polizzotti@gmail.com");
		Employee employee5 = new Employee(350000000, "Tina", "Polizzotti", "tina.polizzotti@gmail.com");

		// Sort employee array.
		Employee[] employeeArray = {employee1, employee2, employee3, employee4, employee5};
		Employee[] sortedEmployeeArray = insertionSort.sortByEmployeeNumber(employeeArray);
		
		// Output sorted array.
		for (int i = 0; i < sortedEmployeeArray.length; i++) {
			System.out.println(sortedEmployeeArray[i].getEmployeeNumber() + " " + sortedEmployeeArray[i].getFirstName() + " " + sortedEmployeeArray[i].getLastName());
		}
		
		System.out.println(" ");
		
		//----------------
		// Assignment 2
		//----------------
		
		// Duplicate characters.
		DuplicateChecker duplicateChecker = new DuplicateChecker();
		System.out.println("Does 'anaconda' have duplicate characters: " + duplicateChecker.hasDuplicateChars("anaconda"));
		System.out.println("Does 'great' have duplicate characters: " + duplicateChecker.hasDuplicateChars("great"));
		
		// Duplicate characters (2nd method).
		System.out.println("Does 'anaconda' have duplicate characters: " + duplicateChecker.hasDuplicateCharacters("anaconda"));
		
		// Duplicate characters (3rd method).
		System.out.println("Does 'abracadabra' have duplicate characters (ASCII): " + duplicateChecker.hasDuplicateASCIICharacters("Mat"));
		
		System.out.println(" ");
		
		//----------------
		// Assignment 3
		//----------------
		AnagramChecker anagram = new AnagramChecker();
		
		// Check for anagram.
		System.out.println("Anagram Test #1: " + anagram.isAnagram("Mother-in-law", "Woman Hitler"));
		System.out.println("Anagram Test #2: " + anagram.isAnagram("matt", "bill"));
		System.out.println("Anagram Test #3: " + anagram.isAnagram("sam", "mom"));
		
		// Check for anagram (2nd method).
		System.out.println("Anagram Test #4: " + anagram.isAnagram2("Mother-in-law", "Woman Hitler"));
		System.out.println("Anagram Test #5: " + anagram.isAnagram2("sam", "mom"));
	}

}
