package com.bridgelabz.ds;

import java.util.Scanner;
/*
* Created by:Anand Dandi
* Date :08/11/2019
* Purpose:Write a Stack Class to push open parenthesis “(“ and pop closed parenthesis “)”. At the End of the Expression if the Stack is Empty then the Arithmetic Expression is Balanced. 
* Stack Class Methods are Stack(), push(), pop(), peak(), isEmpty(), size()
***/

//Implementation class to check whether the String with parenthesis is balanced or no	public class BalancedBrackets {
class SimpleBalancedParentheses {

	public static void main(String[] args) {
		MyStack utility = new MyStack();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Expression");
		String input = sc.nextLine();
		//String input = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		char[] inputArray = input.toCharArray();
		// Stack stack = new Stack();
	
		for (int i = 0; i < inputArray.length; i++) {
			//System.out.println("length "+inputArray[i]);
			if (inputArray[i] == '(') {
				utility.push(inputArray[i]);
				//System.out.println("Size :"+utility.size());
			} 
			else if (inputArray[i] == ')')
			{
				//System.out.println(inputArray[i]);
				utility.pop();
			}
		}

		int size = utility.size();
		if (size==0) {
			System.out.println("Balanced Stack");
		} else {
			System.out.println("Un-Balanced Stack");
		}
	
	}

}
