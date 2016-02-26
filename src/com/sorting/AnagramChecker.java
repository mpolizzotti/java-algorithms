package com.sorting;

import java.util.Arrays;

public class AnagramChecker {

	/**
	 * Constructs a new AnagramChecker Object.
	 */
	public AnagramChecker() {}
	
	/**
	 * Method to determine whether or not two strings are anagrams.
	 * 
	 * Note: The time complexity for this method is ?.
	 * 
	 * @param str1 String to be compared
	 * @param str2 String to be compared
	 * @return
	 */
	public boolean isAnagram(String str1, String str2) {
		// Remove any whitespaces or hypens.
		String stripString1 = str1.replaceAll("\\s+", "").replace("-", "").toLowerCase();
		String stripString2 = str2.replaceAll("\\s+", "").replace("-", "").toLowerCase();
		
		// To be anagrams each string should use the same number of characters.
		// If they don't we know automatically that they are not anagrams.
		if (stripString1.length() != stripString2.length()) {
			return false;
		}
		
		// Create character arrays.
		char[] chars1 = stripString1.toCharArray();
		char[] chars2 = stripString2.toCharArray();
		
		// Sort arrays.
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		
		// The strings are sorted alphabetically. If any of the characters within
		// each string don't match, we don't have an anagram.
		for (int i = 0; i < chars1.length; i++) {
			if (chars1[i] != chars2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Method to determine whether or not two strings are anagrams.
	 * 
	 * Note: The time complexity for this method is n squared.
	 * 
	 * @param str1 String to be compared
	 * @param str2 String to be compared
	 * @return
	 */
	public boolean isAnagram2(String str1, String str2) {
		// Remove any whitespaces or hypens.
		String stripString1 = str1.replaceAll("\\s+", "").replace("-", "").toLowerCase();
		String stripString2 = str2.replaceAll("\\s+", "").replace("-", "").toLowerCase();
		
		// If the lengths are not equal, they definitely cannot be anagrams.
		if (stripString1.length() != stripString2.length()) {
			return false;
		}
		
		
		
		int[] charSet = new int[128];
		int numOfUniqueChars = 0;
		int numCompletedInString2 = 0;
		char[] chars = stripString1.toCharArray();
		
		// Count the number of unique characters for the first string.
		for (char c : chars) {
			if (charSet[c] == 0) {
				++numOfUniqueChars;
			}
			++charSet[c];
		}
		
		for (int i = 0; i < stripString2.length(); i++) {
			// Obtain ASCII character value.
			int c = (int) stripString2.charAt(i);
			
			// Look up the ASCII value in the charSet[] array.
			// When this value is zero, we don't have an anagram.
			if (charSet[c] == 0) {
				return false;
			}
			
			// Reduce count in charSet[] array for the ASCII character value.
			--charSet[c];
			if (charSet[c] == 0) {
				++numCompletedInString2;
				if (numCompletedInString2 == numOfUniqueChars) {
					// it's a match if str2 has been processed completely.
					return i == stripString2.length() - 1;
				}
			}
		}
		
		return false;
	}
}
