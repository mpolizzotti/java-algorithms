package com.sorting;

public class SelectionSort {

	/**
	 * Constructs a new SelectionSort.
	 */
	public SelectionSort() {}
	

	/**
	 * Method executes a selection sort algorithm.
	 * This algorithm has a time complexity of O(n²).
	 * 
	 * This algorithm is better then the Bubble Sort.
	 * 
	 * @param data Array to be sorted
	 * @return
	 */
	public int[] sort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			int minIndex = i;
			for (int j = i+1; j < data.length; j++) {
				if (data[j] < data[minIndex]) {
					minIndex = j;
				}
			}
			
			int tmp = data[minIndex];
			data[minIndex] = data[i];
			data[i] = tmp;
		}
		
		return data;
	}
	
}
