package com.bridgelabz.algorithm;
/*****
* created by:Anand kumar
* Date 05/11/2019
* Purpose:Write a program to do Merge Sort of list of Strings. 
***/


public class MergeSort {

	/*
	 * Merge sort is divide and conquer sorting algorithm. It is efficient,
	 * comparison based sorting algorithm.
	 * 
	 * It works on below principle:
	 * 
	 * Divide list into sub list of about half size in each iteration until each
	 * sublist has only one element. Merge each sublist repeatedly to create sorted
	 * list. It will run until we have only 1 sorted list. This will be the sorted
	 * list.
	 */

	public static void mergeSort(int[] a, int[] b, int m, int n, int[] c) {
		int i = 0, j = 0, k = 0;

		// Traverse both array
		while (i < m && j < n) {
			// Check if current element of first
			// array is smaller than current element
			// of second array. If yes, store first
			// array element and increment first array
			// index. Otherwise do same with second array
			if (a[i] < b[j]) // compare two values and smaller value store a[i] will be stored in c[i]
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}

		// Store remaining elements of first array
		while (i < m)
			c[k++] = a[i++];

		// Store remaining elements of second array
		while (j < n)
			c[k++] = b[j++];
	}

	public static void main(String[] args) {
		int[] a = { 20, 10, 40, 10 };
		int m = a.length;

		int[] b = { 60, 30, 100, 80 };
		int n = a.length;

		int[] c = new int[m + n];

		mergeSort(a, b, m, n, c);

		System.out.println("Array after merging");
		for (int i = 0; i < m + n; i++)
			System.out.print(c[i] + " ");
	}
}
