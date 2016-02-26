package com.sorting;

import java.util.Arrays;

import com.sorting.BubbleSort;
import com.sorting.SelectionSort;

public class AlgorithmTester {

	public static void main(String[] args) {
		// Data.
		int[] bubbleData = {5, 12, 10, 2, 9, 7, 6, 4, 8, 3, 11, 1};
		int[] selectionData = {5, 12, 10, 2, 9, 7, 6, 4, 8, 3, 11, 1};
		int[] insertData = {5, 12, 10, 2, 9, 7, 6, 4, 8, 3, 11, 1};
		int[] insertData2 = {5, 2, 4, 3, 9, 8, 7, 6};
		
		// Test bubble sort.
		int[] bubbleResult;
		BubbleSort bubbleSort = new BubbleSort();
		bubbleResult = bubbleSort.sort(bubbleData);
		
		//System.out.println("Bubble Sort: " + Arrays.toString(bubbleResult));
		
		// Test selection sort.
		int[] selectionResult;
		SelectionSort selectionSort = new SelectionSort();
		selectionResult = selectionSort.sort(selectionData);
		
		//System.out.println("Selection Sort: " + Arrays.toString(selectionResult));
		
		// Test selection sort.
		int[] insertResult;
		InsertionSort insertionSort = new InsertionSort();
		insertResult = insertionSort.sort(insertData2);
		
		System.out.println("Insertion Sort: " + Arrays.toString(insertResult));
	}

}
