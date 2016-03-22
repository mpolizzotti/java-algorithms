package com.recursion;

public class TriangleNumbers {
	
	/**
	 * Example of recursive calculation.
	 * 
	 * @param n Number
	 * @return The sum of all recursive operations
	 */
	public int triangleNumber(int n) {
		if (n == 0) {
			return 0;
		}
		return n + triangleNumber(n - 1);
	}
}