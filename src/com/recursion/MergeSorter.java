package com.recursion;

public class MergeSorter {
	/**
	 * Constructor for MergeSorter class.
	 */
	public MergeSorter() {}
	
	/**
	 * Method calls merge sort on passed data array.
	 * 
	 * @param data The data to sort
	 */
	public void sort(int[] data) {
		mergeSort(data, 0, data.length - 1);
	}
	
	/**
	 * Method breaks data array into smaller arrays and merges them back together (sorted).
	 * 
	 * @param data the data array to sort
	 * @param start the starting index position
	 * @param end the end index position
	 */
	private void mergeSort(int[] data, int start, int end) {
		if (start < end) {
			int mid = (int) Math.floor((start + end)/2);
			mergeSort(data, start, mid);
			mergeSort(data, mid+1, end);
			merge(data, start, mid, end);
		}
	}
	
	/**
	 * Method sorts and merges the left array and the right array into
	 * a single sorted array.
	 * 
	 * @param data the original data array
	 * @param start the starting index position
	 * @param mid the middle index position
	 * @param end the ending index position
	 */
	private void merge(int[] data, int start, int mid, int end) {
		// Calculate size of left array.
		int sizeOfLeft = mid - start + 1;
		
		// Calculate size of right array.
		int sizeOfRight = end - mid;
		
		// Create left array.
		int[] left = new int[sizeOfLeft];
		
		// Create right array.
		int[] right = new int[sizeOfRight];
		
		// Copy data from the original data array
		// into the left array.
		for (int i = 0; i < sizeOfLeft; i++) {
			left[i] = data[start + i];
		}
		
		// Copy data from the original data array
		// into the right array.
		for (int j = 0; j < sizeOfRight; j++) {
			right[j] = data[mid + 1 + j];
		}
		
		// Logic to iterate through the left array and the right array
		// and to copy sorted values to the original data array.
		int i = 0, j = 0;
		for (int k = start; k <= end; k++) {
			if ((j >= sizeOfRight) || (i < sizeOfLeft && left[i] <= right[j])) {
				data[k] = left[i];
				i++;
			} else {
				data[k] = right[j];
				j++;
			}
		}
	}
}
