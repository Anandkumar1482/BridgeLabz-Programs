package com.bridgelabz.algorithm;
/*****
* created by:Anand kumar
* Date 08/11/2019
* Purpose:above program to find the prime numbers that are Anagram and Palindrome
***/

public class PolindromeAnagram{

	public static void main(String[] args) {
		prime(1000);
	}

	public static void prime(int last) {
		int i;
		for (i = 2; i <= last; i++) {
			int count = 1;
			for (int j = 2; j <= (i / 2); j++) {
				if (i % j == 0) {
					count = 0;
					// System.out.println("count value is "+count);
					break;
				}
			}
			if (count == 1) {
				palindrome(i);
			}
		}
	}

	public static void palindrome(int n) {

		/*
		 * A palindrome number is a number that is same after reverse. For example 545,
		 * 151, 34543, 343, 171, 48984 are the palindrome numbers. It can also be a
		 * string like LOL, MADAM etc.
		 */
		int remainder, reversedint = 0, originalint;
		originalint = n;
		while (n != 0) {
			remainder = n % 10;
			reversedint = reversedint * 10 + remainder;
			n = n / 10;
		}
		if (originalint == reversedint) {
			System.out.println(" prime is a polindrome " + originalint);
		}
	}
}
