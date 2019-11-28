package com.bridgelabz.ds;

import java.util.Arrays;

/*
* Created by:Anand Dandi
* Date :15/11/2019
* Purpose:Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Queue using the Linked List and Print the Anagrams from the Queue. Note no Collection Library can be used.
****/


public class PrimeAnagramQueue {
	public static void main(String[] args) {
		QueueP queue = new QueueP();
		// MyStack<String> myStack = new MyStack<>();
		String[] primeNumbers = prime(1000);

		// prints prime numbers that are anagrams
		for (int i = 0; i < primeNumbers.length; i++) {
			for (int j = i + 1; j < primeNumbers.length; j++) {
				if (anagram(primeNumbers[i], primeNumbers[j])) {
					queue.enQueue(primeNumbers[i]);
					queue.enQueue(primeNumbers[j]);
				}
			}
		}

		queue.display();
		// System.out.println("display the numbers "+numbers);
	}

	public static String[] prime(int range) {
		String[] array = new String[1000];
		int position = 0;
		for (int i = 2; i <= range; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if ((i % j) == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				array[position] = String.valueOf(i);
				position++;
			}
		}
		String[] returnArray = new String[position];
		for (int k = 0; k < position; k++) {
			returnArray[k] = array[k];
		}
		return returnArray;
	}

	public static boolean anagram(String string1, String string2) {
		if (string1.length() != string2.length()) {
			return false;
		}
		char[] array1 = string1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = string2.toCharArray();
		Arrays.sort(array2);

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}

}
