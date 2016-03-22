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
		int[] mergeData = {9, 5, 3, 2};
		s.sort(mergeData);
		System.out.println(Arrays.toString(mergeData));

		System.out.println(" ");

		System.out.println("Triangle Numbers");
		System.out.println("----------------------");
		TriangleNumbers tri = new TriangleNumbers();
		System.out.println("Triangle number 3: " + tri.triangleNumber(5));

		System.out.println(" ");

		System.out.println("Add Numbers");
		System.out.println("----------------------");
		Sum sum = new Sum();
		System.out.println("Calculate the sum of two numbers: " + sum.add(6, 2));
		
		System.out.println(" ");

		System.out.println("Sum of Squares");
		System.out.println("----------------------");
		System.out.println("Calculate the sum of squares: " + sum.sumOfSquares(2));
	}

}