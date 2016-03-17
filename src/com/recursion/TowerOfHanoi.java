package com.recursion;

public class TowerOfHanoi {
	/**
	 * Constructor for TowerOfHanoi class.
	 */
	public TowerOfHanoi() {}
	
	/**
	 * Method solves the TowerOfHanoi problem with recursion.
	 * 
	 * @param numberOfDiscs Number of discs to move
	 * @param from The from tower
	 * @param to The to tower
	 * @param intermediate The intermediate tower
	 */
	public void move(int numberOfDiscs, char from, char to, char intermediate) {
		if (numberOfDiscs == 1) {
			System.out.println("Moving disc 1 from " + from + " to " + to);
		} else {
			move(numberOfDiscs - 1, from, intermediate, to);
			System.out.println("Moving disc " + numberOfDiscs + " from " + from + " to " + to);
			move(numberOfDiscs - 1, intermediate, to, from);
		}
		
	}
}
