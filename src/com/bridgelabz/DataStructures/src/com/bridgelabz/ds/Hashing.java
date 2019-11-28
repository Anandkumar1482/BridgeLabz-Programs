package com.bridgelabz.ds;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Hashing {
	public static void main(String[] args) throws IOException {
		MyStack utility = new MyStack();
		File file = new File("/home/anand/Documents/numbers.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		System.out.println("line "+line);
		String[] array=line.split(" ");
		//String array is converted into int
		for(int i=0;i<array.length;i++)
		{
			int n=Integer.parseInt(array[i]);
			
			utility.push(n);
			//System.out.println(n);
		}
		utility.display();
		System.out.println();
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int reminder=n%11;
		int temp=utility.search(n);
		int reminder=n%11;
	}
}

