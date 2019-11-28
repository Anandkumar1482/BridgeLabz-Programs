package com.bridgelabz.ds;

import java.util.Scanner;
/*
* Created by:Anand Dandi
* Date :09/11/2019
* Purpose:he solution to this problem will use a deque to store the characters of the string.
*  We will process the string from left to right and add each character to the rear of the deque
****/


public class PolindromChecker {
	public static void main(String[] args)
	{
		MyDeQueue utility=new MyDeQueue();
		Scanner sc=new Scanner(System.in);
		String temp="";
		//String str=sc.nextLine();
		System.out.println("Enter a String");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			utility.addrear(ch[i]);
		}
        utility.display();	
         
         for(int i=0;i<ch.length;i++)
         {
        	temp+=utility.removefront(ch[i]);
         }
         System.out.println("Reverse :"+temp);
         if(str.equals(temp))
        	 System.out.println("String is pallindrome");
         else
        	 System.out.println("String is not pallindrome");
       // 
}

}