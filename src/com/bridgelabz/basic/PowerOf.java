package com.bridgelabz.basic;

/*
* created by:Anand kumar
* Date 24/10/2019
* Purpose:This program takes a command-line argument N and prints a table of the
* powers of 2 that are less than or equal to 2^N.
*/

public class PowerOf {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int i = 0;// intial value should start with 0
		int poweroftwo = 1;
		while (i <= n) {
			System.out.println(i + " " + poweroftwo);
			poweroftwo = 2 * poweroftwo;
			i = i + 1;
		}

	}
}
