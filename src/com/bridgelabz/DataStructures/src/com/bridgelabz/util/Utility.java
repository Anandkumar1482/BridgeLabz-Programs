package com.bridgelabz.util;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	static Scanner scanner;
	Random random;
	
	//constructor
	public Utility() {
		scanner = new Scanner(System.in);
		random = new Random();

	}

	/**
	 * Takes input with the user via Scanner for String
	 * 
	 * @return INPUT STRING
	 */
	public String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	/**
	 * Takes input with the user via Scanner for StringLine
	 * 
	 * @return INPUT STRING LINE
	 */
	public String inputStringLine() {
		try {
			return scanner.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	/**
	 * Takes input with the user via Scanner for Integer
	 * 
	 * @return INPUT INTEGER
	 */
	public static int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * Takes input with the user via Scanner for Double
	 * 
	 * @return INPUT DOUBLE
	 */
	public double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * Takes input with the user via Scanner for Boolean
	 * 
	 * @return INPUT BOOLEAN
	 */
	public boolean inputBoolean() {
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;

	}
	public static void bubbleSort(int[] nums)
	{
	int temp;
	//System.out.println("After sorting Elements");
	for(int i=0;i<nums.length;i++)//
	{
		for(int j=1;j<(nums.length)-i;j++)
		 {
		//To compare Adjacent elements
	            if(nums[j-1] > nums[j])
			{
	          //After comparint to sort the elements based on ascendig order
	            temp=nums[j-1];
		    nums[j-1]=nums[j];
		    nums[j]=temp;
		       }
		 }
	}
	}
	

	}