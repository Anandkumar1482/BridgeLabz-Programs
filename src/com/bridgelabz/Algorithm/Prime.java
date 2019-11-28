package com.bridgelabz.algorithm;
/*****
* created by:Anand kumar
* Date 09/11/2019
* Purpose:a range of 0 - 1000 Numbers and find the Prime numbers in that range
* */

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value");// prime number should start with m value
		int m = sc.nextInt();
		System.out.println("Enter n value");// prime number end vale 1000
		int n = sc.nextInt();
		for (int i = m; i < n; i++) {
			if (isPrime(i))
				;// to call isprime() method
			System.out.println(i);
		}
		// if(isPrime(i));
		// System.out.println(i);
	}

	public static boolean isPrime(int n) {
		int count = 0;
		for (int i = 2; i < n / 2; i++)// prime number should start with 2 and 0 and 1 are not prime numbers
		{
			if (n % i == 0) {
				count++;
				break;
			}
		}

		if (count == 0)
			return true;
		else
			return false;
	}
}
