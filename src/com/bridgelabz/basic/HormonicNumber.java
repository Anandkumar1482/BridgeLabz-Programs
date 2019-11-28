package com.bridgelabz.basic;

/**************
* created by:Anand kumar
* Date 23/10/2019
* Purpose:Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N. Print the Nth Harmonic Value.
****************/


import java.util.Scanner;

public class HormonicNumber {
	public static void main(String[] args) {
//hormonic number is the sum of reciprocal of positive integer upto n hormonic
//number =1+1/2+1/3+1/4......+1/N.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		double sum = 0.0;
		for (int i = 1; i < n; i++) {
			sum = sum + (double) 1 / i;
		}
		System.out.println("sum " + sum);
	}
}
