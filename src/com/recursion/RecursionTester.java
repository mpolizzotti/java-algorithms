package com.recursion;

import java.util.Arrays;

import com.stacks.DoublyLinkedStack;

public class RecursionTester {

	public static void main(String[] args) {
		FactorialCalculator f = new FactorialCalculator();
		System.out.println("Head Factorial");
		System.out.println("----------------------");
		f.factorial(5);

		System.out.println(" ");

		System.out.println("Tail Factorial");
		System.out.println("----------------------");
		f.factorial(5, 1);

		System.out.println(" ");

		System.out.println("Tower of Hanoi");
		System.out.println("----------------------");
		TowerOfHanoi t = new TowerOfHanoi();
		t.move(3, 'A', 'C', 'B');

		System.out.println(" ");

		System.out.println("Merge Sort");
		System.out.println("----------------------");
		MergeSorter s = new MergeSorter();
		int[] mergeData = {7, 10, 20, 4, 1, 6, 9, 5, 3};
		s.sort(mergeData);
		System.out.println(Arrays.toString(mergeData));
	}

}