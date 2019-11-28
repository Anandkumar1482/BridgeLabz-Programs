package com.bridgelabz.algorithm;
/*****
* created by:Anand kumar
* Date 02/11/2019
* Purpose:Reads in strings and prints them in sorted order using insertion sort.read in the list words
**/

public class InsertionSort {
	public static void main(String[] args) {
		int[] a = { 9, 3, 8, 4, 6, 10 };
		System.out.println("Before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("After sorting");
		insertionSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i - 1;
			for (j = i; j > 0 && temp < a[j - 1]; j--) {
				// compare previous element and next element
				// temp=a[i];
				a[j] = a[j - 1];
			} // next element //previous element
			a[j] = temp;
		} // elements will be inserted in desired location
	}
}
