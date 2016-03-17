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
		
		System.out.println(" ");
		
		System.out.println("Tower of Hanoi");
		System.out.println("----------------------");
		TowerOfHanoi t = new TowerOfHanoi();
		t.move(3, 'A', 'C', 'B');
	}

}