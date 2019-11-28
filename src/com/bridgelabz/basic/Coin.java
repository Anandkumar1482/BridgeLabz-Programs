package com.bridgelabz.basic;

public class Coin {
	/*
	* created by:Anand kumar
	* Date 23/10/2019
	* Purpose:Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
	**/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (Math.random() > 0) {
			System.out.println("head");
		} else {
			System.out.println("tail");
		}
	}

}
