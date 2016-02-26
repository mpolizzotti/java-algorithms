package com.sorting;


public class InsertionSort {

	/**
	 * Constructs a new Insertion Sort Object.
	 */
	public InsertionSort() {}
	
	/**
	 * Method executes an insertion sort algorithm.
	 * This algorithm has a time complexity of O(n²).
	 * 
	 * This algorithm is good for small lists and is
	 * very fast for partially sorted lists.
	 * 
	 * @param data Array to be sorted
	 * @return
	 */
	public int[] sort(int[] data) {
		
		for (int i = 0; i < data.length; i++) {
			int current = data[i];
			int j = i - 1;
			
			while (j >= 0 && data[j] >= current) {
				data[j + 1] = data[j];
				j--;
			}
			
			data[j + 1] = current;
		}
		
		return data;
	}

	/**
	 * Method executes an insertion sort algorithm against an
	 * array of Employee objects and sorts the employee array
	 * based upon the employee's number.
	 * 
	 * This algorithm has a time complexity of O(n²).
	 * 
	 * This algorithm is good for small lists and is
	 * very fast for partially sorted lists.
	 * 
	 * @param employees Array of Employee Objects
	 * @return
	 */
	public Employee[] sortByEmployeeNumber(Employee[] employees) {
		for (int i = 0; i < employees.length; i++) {
			Employee current = employees[i];
			int currentEmployeeNumber = employees[i].getEmployeeNumber();
			int j = i - 1;
			
			while (j >= 0 && employees[j].getEmployeeNumber() >= currentEmployeeNumber) {
				employees[j + 1] = employees[j];
				j--;
			}
			
			employees[j + 1] = current;
			
		}

		return employees;
	}
}
