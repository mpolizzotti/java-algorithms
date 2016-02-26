package com.sorting;

public class BubbleSort {
	
	/**
	 * Constructs a new BubbleSort.
	 */
	public BubbleSort(){}

	/**
	 * Method executes a bubble sort algorithm.
	 * This algorithm has a time complexity of O(n²).
	 * 
	 * This is the most inefficient algorithm and is only
	 * studied. This algorithm really shouldn't be implemented
	 * in production code.
	 * 
	 * @param data Array to be sorted
	 * @return
	 */
	public int[] sort(int[] data) {
		for (int i = 0; i < (data.length - 1); i++) {
			for (int j = 0; j < (data.length - 1 - i); j++) {
				if (data[j] > data[j + 1]) {
					int bin = data[j];
					data[j] = data[j + 1];
					data[j + 1] = bin;
				}
			}
			
			
		}
		
		return data;
	}
}
