package com.bridgelabz.basic;

/*
* created by: BridgeLabz
* Date 23/10/2019
* Purpose:  Replace <<userName>>with the proper name
**/
public class ReplaceString {
	public static void main(String[] args) {
		String s1 = "Bridge";
		String s = s1.replace("Bridge", "Labz");// replaces all occurrences of "bridge" to "Labz"
		System.out.println(s);
	}
}
