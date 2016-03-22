package com.recursion;

public class Sum {
	/**
	 * Constructor for Sum class.
	 */
	public Sum() {}
	
	/**
	 * Recursive function to take the sum of two positive numbers.
	 * 
	 * @param a a positive number
	 * @param b a positive number
	 * @return the sum of two positive numbers.
	 */
	public int add(int a, int b) {
		if (b == 0) {
			return a;
		}
		
		return add(a + 1, b - 1);
	}
	
	/**
	 * Recursive method to calculate the sum of squares.
	 * 
	 * @param n a positive number
	 * @return the sum of squares
	 */
	public int sumOfSquares(int n) {
		if (n == 1) {
			return 1;
		}
		
		return n * n + sumOfSquares(n - 1);
	}
}