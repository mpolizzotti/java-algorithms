package com.recursion;

public class Recursion {
	/**
	 * Constructor for Recursion class.
	 */
	public Recursion() {}
	
	/**
	 * Method is an example of a head recursion.
	 * 
	 * @param n Number
	 * @return
	 */
	public int factorial(int n) {
		// If we forget the breaking condition,
		// we will get a stack overflow exception.
		// A stack overflow exception can also be
		// thrown if the number passed into this
		// method is too high.
		if (n == 0) {
			return 1;
		}
		System.out.println("factorial: " + n);
		
		return n * factorial(n - 1);
	}
	
	/**
	 * Method is an example of using tail recursion. Tail recursion
	 * is typically used to avoid stack overflow errors. The result parameter
	 * accumulates the value of the previous operation. As such, in some
	 * other programming languages a stack is not needed since the value
	 * of the result is known.
	 * 
	 * Note:
	 * Java does not support tail recursion optimization.
	 * 
	 * @param n Number
	 * @param result Result of previous operation
	 * @return
	 */
	public int factorial(int n, int result) {
		if (n == 0) {
			return result;
		}
		System.out.println("factorial: " + n);
		
		return factorial(n - 1, n * result);
	}
}
