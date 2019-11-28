package com.bridgelabz.ds;

import com.bridgelabz.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


/*
* Created by:Anand Dandi
* Date :07/11/2019
* Purpose:Create a Unordered Linked List. The Basic Building Block is the Node Object.
*  Each node object must hold at least two pieces of information.
*  One ref to the data field and  second the ref to the next node object.
**/

//an Ordered Linked List having Numbers in ascending order.
public class OrderedList {

	public static void main(String[] args) throws IOException {
		MyLinkedList list = new MyLinkedList();
		File file = new File("/home/anand/Documents/numbers.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		System.out.println("line " + line);
		// split it into words
		String[] array = line.split(" ");
		int[] nums = new int[array.length];
		// for converting any String type in file to integer type
		int i = 0;
		for (i = 0; i < array.length; i++) {
			nums[i] = Integer.parseInt(array[i]);
			// list.insert(array[i]);
			// System.out.println("string "+ nums[i]);
		}
		System.out.println(Arrays.toString(nums));
		Utility.bubbleSort(nums);// to arrange the data in ascending order

		for (int number : nums) // for adding the element to the linkedList
		{
			list.insert(number);
		}
		System.out.println();
		// System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide a number ");
		int num = sc.nextInt();
		int temp = list.search(num);
		if (temp != -1) {
			list.delete(num);
		} else {
			list.appropriatePosition(num);
		}
		list.show();
	}

}
