package com.bridgelabz.functional;
import java.util.Scanner;
import java.io.*;
/*
* created by:Anand kumar
* Date 26/10/2019
* Purpose:Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
* standard input and printing them out to standard output.
* I/P -> M rows, N Cols, and M * N inputs for 2D Array.
**/

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row Size :");
		int m = sc.nextInt();
		System.out.println("Enter Column Size :");
		int n = sc.nextInt();

//Create array for integers element
		int[][] a = new int[m][n];
		System.out.println("Enter Integers elements :");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
//Inserting elements into a
				a[i][j] = sc.nextInt();
			}
		}

//Create array for doubles element
		double[][] b = new double[m][n];
		System.out.println("Enter Doubles elements :");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
//Inserting elements into b
				b[i][j] = sc.nextDouble();
				sc.close();
			}
		}

//Create array for boolean
		boolean ba[][] = new boolean[m][n];
		System.out.println("Enter Boolean value :");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
//Inserting boolean value
				ba[i][j] = sc.nextBoolean();
			}
		}
		display(a, b, ba);
	}

	public static void display(int[][] a, double[][] b, boolean[][] ba) {
		PrintWriter pw = new PrintWriter(System.out, true);

//Display Integers
		System.out.println();
		pw.println("2D Array of Integers");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				pw.print(a[i][j] + " ");
			}
			pw.println("\t");
		}

//Display Doubles
		System.out.println();
		pw.println("\n2D Array of Doubles");

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				pw.print(b[i][j] + " ");
			}
			pw.println("\t");
		}

//Display Boolean
		System.out.println();
		pw.println("\n2D Array of Boolean ");
		for (int i = 0; i < ba.length; i++) {
			for (int j = 0; j < ba[i].length; j++) {
				pw.print(ba[i][j] + " ");
			}
			pw.println("\t");
		}
	}
}
