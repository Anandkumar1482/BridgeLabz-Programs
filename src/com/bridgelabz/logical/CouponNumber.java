package com.bridgelabz.logical;
/*
* Created by:Anand kumar
* Date 29/10/2019
* Purpose:Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number?
*  This program simulates this random process.
**/

import java.util.Random;

class CouponNumber {
	
// a coupon code, or promo code, is a computer-generated code, consisting of
// letters or numbers that consumers can enter into a promotional box on a
//site's shopping cart
	
	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRST0123456789";
		char[] ch = str.toCharArray();
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		// objects of type String are read only and immutable. The StringBuffer class is
		// used to represent characters that can be modified
		int max = 1000;
		for (int i = 0; i < max; i++) {
			char c = ch[random.nextInt(ch.length)];
			sb.append(c);
		}
		String coupon = sb.toString();
		System.out.println("coupon code:  " + coupon);
	}
}
