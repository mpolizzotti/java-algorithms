package com.sorting;

import java.util.ArrayList;

public class DuplicateChecker {
	
	/**
	 * Constructs a DuplicateChecker Object.
	 */
	public DuplicateChecker() {}
	
	/**
	 * Method tests whether or not the passed string contains duplicate characters.
	 * 
	 * Note: The time complexity for this method is O(n).
	 * 
	 * @param str String to be tested
	 * @return
	 */
	public boolean hasDuplicateChars(String str) {
		// Flag.
		boolean hasDuplicateChars = false;
		
		// List to store unique characters.
		ArrayList<Character> charList = new ArrayList<Character>();
		
		// Break string into a character array.
		int start = 0;
		int end = (str.length());
		char[] chars = new char[str.length()];
		int offset = 0;
		str.getChars(start, end, chars, offset);
		
		// Loop over character array. Only add a specific character
		// to the character array if the character array doesn't
		// already contain the character.
		for (int i = 0; i < chars.length; i++) {
			if (!charList.contains(chars[i])) {
				charList.add(chars[i]);
			}
		}
		
		// When the lengths of the character array and the original
		// string don't match, duplicate characters exist.
		if (str.length() != charList.size()) {
			hasDuplicateChars = true;
		}
		
		return hasDuplicateChars;
	}
	
	/**
	 * Method tests whether or not the passed string contains duplicate characters.
	 * 
	 * Note: The time complexity for this method is O(n²).
	 * 
	 * @param str String to be tested for duplicate characters
	 * @return
	 */
	public boolean hasDuplicateCharacters(String str) {
		// Flag.
		boolean hasDuplicateChars = false;
		
		// Break string into a character array.
		int start = 0;
		int end = (str.length());
		char[] chars = new char[str.length()];
		int offset = 0;
		str.getChars(start, end, chars, offset);
		
		for (int i = 0; i < chars.length; i++) {
			char current = chars[i];
			
			for (int j = (i + 1); j < chars.length; j++) {
				if (current == chars[j]) {
					hasDuplicateChars = true;
					break;
				}
			}
			
			if (hasDuplicateChars) {
				break;
			}
		}
		
		return hasDuplicateChars;
	}
	
	/**
	 * Method tests whether or not the passed string contains duplicate (ASCII) characters.
	 * 
	 * Note: The time complexity for this method is O(n).
	 * 
	 * @param str String to be tested for duplicate characters
	 * @return
	 */
	public boolean hasDuplicateASCIICharacters(String s) {
		boolean hasDuplicateChars = false;
		boolean[] charSet = new boolean[128];
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (charSet[c]) {
				hasDuplicateChars = true;
				return hasDuplicateChars;
			}
			
			charSet[c] = true;
		}
		
		return hasDuplicateChars;
	}
}
