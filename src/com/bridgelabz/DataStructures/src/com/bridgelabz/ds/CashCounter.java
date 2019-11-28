package com.bridgelabz.ds;
import java.util.Scanner;
/*
* Created by:Anand Dandi
* Date :09/11/2019
* Purpose:Write a Queue Class to enqueue and dequeue people to either deposit or withdraw money and maintain the cash balance
****/

public class CashCounter {
	@SuppressWarnings("resource")
	public static <T> void main(String[] args)
	{
	//MyQueue	queue=new MyQueue();
	MyQueue<T> utility=new MyQueue<T>();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many poeple");
	int number =sc.nextInt();
	for(int i=0;i<number;i++)
	{
	   utility.enQueue(i+1);
		//System.out.println(i);
	}
	utility.display();
	int total=0;
	for(int i=0;i<number;i++)
	{
		System.out.println("person "+utility.deQueue() + " press 1 for deposit money or press 2 for  withdraw");
		int option=sc.nextInt();
		System.out.println("how much?");
		int amount=sc.nextInt();
		total=option==1?total+amount:total-amount;
				/*
				 * if(number1==1) { total=total+amount; } else { total=total-amount; }
				 */
		
	}
	utility.display();
	}


	}



