package com.analysis;


/**
 * Big O Analysis gives us a basis for measuring the efficiency of an
 * algorithm. It measures the efficiency of an algorithm based on the
 * time it takes for the algorithm to run as a function of the input size.
 * 
 * Big O will want to express how many times the 'n' (i.e., input items)
 * are touched. The word 'touched', in our below example, refers to the
 * number of times an array value is compared to another value. 
 */
public class BigOAnalysis {

	/**
	 * Method returns the first value within the
	 * passed dataSet array.
	 * 
	 * O(1)
	 * 
	 * Note: This function runs in O(1) time (or "constant time") relative
	 * to its input. The dataSet array could be 1 item or 10,000 items.
	 * Either way this function will always require a single step and
	 * execute in a single unit of time.
	 * 
	 * @param dataSet Array of numbers
	 * @return
	 */
	public int getFirstItem(int[] dataSet) {
		return dataSet[0];
	}
	
	/**
	 * Method iterates through array to find the
	 * smallest value.
	 * 
	 * O(n)
	 * 
	 * Notes: This solution uses a single loop. The dataSet array
	 * is 'touched' only once when compared to the minimum value.
	 * The Big O would be written as O(n), which is known as
	 * linear time. Linear time means that the time taken to run
	 * the algorithm increases in direct proportion to the number
	 * of input items. So, 80 items would take longer to run than
	 * 79 items. Another way to phrase this is to say that the
	 * algorithm being used in the getMiniumNumber function has
	 * an "Order of n time complexity".
	 * 
	 * @param dataSet Array of numbers
	 * @return
	 */
	public int getMiniumNumber(int[] dataSet) {
		int min = dataSet[0];
		
		for (int i = 1; i < dataSet.length; i++) {
			if (min > dataSet[i]) {
				min = dataSet[i];
			}
		}
		
		return min;
	}
	
	
	/**
	 * Method iterates through array and compares itself against all the numbers
	 * within the array. The dataSet array is looped through twice without any breaks.
	 * 
	 * O(n²)
	 * 
	 * Notes: This solution uses a nested loop to compare the numbers
	 * without any breaks in the loops. Since we are taking each element
	 * in the array and comparing it to every other element in the array,
	 * that means we will be doing 100 comparisons, assuming, that our
	 * input size is 10 (i.e., 10 * 10 = 100). If we use the variable "n"
	 * to represent the input size, that will be n squared 'touches' of
	 * the input. Thus, this function uses a O(n²) or "quadratic time"
	 * algorithm.
	 * 
	 * @param dataSet Array of numbers
	 * @return
	 */
	public int compareToAllNumbers (int[] dataSet) {
		int min = dataSet[0];
		int previous = dataSet[0];
		
		for (int x = 0; x < (dataSet.length); x++) {
			int compare = dataSet[x];
			
			for (int y = 0; y < (dataSet.length); y++) {
				int against = dataSet[y];
				
				if (compare <= previous) {
					if (compare < against) {
						min = compare;
						previous = compare;
					}
				}
			}
			
			min = previous;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		BigOAnalysis bigo = new BigOAnalysis();
		int[] dataSet = {45, 12, 5, 15, 10, 6, 9, 20, 3, 2};
		
		int getFirstItem = bigo.getFirstItem(dataSet);
		int getMiniumNumber = bigo.getMiniumNumber(dataSet);
		int compareToAllNumbers = bigo.compareToAllNumbers(dataSet);
		
		System.out.println("O(1) Constant Time: " + getFirstItem);
		System.out.println("O(n) Linear Time: " + getMiniumNumber);
		System.out.println("O(n\u00B2): " + compareToAllNumbers);
	}
}
