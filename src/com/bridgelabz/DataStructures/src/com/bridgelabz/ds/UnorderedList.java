package com.bridgelabz.ds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
* Created by:Anand Dandi
* Date :08/11/2019
* Purpose:Read .a List of Numbers from a file and arrange it ascending Order in a Linked List. Take user input for a number, 
* if found then pop the number out of the list else insert the number in appropriate position
**/

public class UnorderedList {
public static void main(String[] args) throws IOException
{
	MyLinkedList list=new MyLinkedList();
	File file=new File("/home/anand/Documents/abc.txt");
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	String line=br.readLine();
	System.out.println("line "+line);
	//split it into words
	String[] array=line.split(" ");
	//String array is converted into int
	for(int i=0;i<array.length;i++)
	{
		int n=Integer.parseInt(array[i]);
		list.insert(n);
		//list.insert(array[i]);
	}
	list.show();
	System.out.println();
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=list.search(n);
	//System.out.println(temp+"temp");
   // int value=list.search(temp);
    //System.out.println("VALUE from search method:"+temp);
    if(temp == -1)
    	list.insert(n);
    else
    	list.delete(temp);
	//list.delete(temp);
	//System.out.println(n);
	list.show();
	
	
	
	
	
}
}
	

