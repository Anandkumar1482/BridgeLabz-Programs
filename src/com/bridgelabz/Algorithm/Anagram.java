package com.bridgelabz.algorithm;
/*****
* created by:Anand kumar
* Date 04/11/2019
* Purpose:One string is an anagram of another if the second is simply a rearrangement of the first. 
* For example, 'heart' and 'earth' are anagrams.
*****/

import java.util.Arrays;

class Anagram {
	//An anagram of a string is another string that contains the same character,only the order of characters can be different
	
	public static void main(String[] args) {
		String str1 = "heart";
		String str2 = "earth";
		System.out.println("both strings are " + str1 + " " + str2 + " anagrams " + anagramCheck(str1, str2));
		// System.out.println("the two Strings are Anagrma "+str1+" "+str2);
	}

	public static boolean anagramCheck(String str1, String str2) {
		// if two Strings are equal,then it will return true otherwise false
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
	}
}
