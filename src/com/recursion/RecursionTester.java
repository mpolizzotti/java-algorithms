package com.recursion;

import com.stacks.DoublyLinkedStack;

public class RecursionTester {

	public static void main(String[] args) {
		Recursion r = new Recursion();
		System.out.println("Head Factorial");
		System.out.println("----------------------");
		r.factorial(5);
		
		System.out.println(" ");
		
		System.out.println("Tail Factorial");
		System.out.println("----------------------");
		r.factorial(5, 1);
	}

}