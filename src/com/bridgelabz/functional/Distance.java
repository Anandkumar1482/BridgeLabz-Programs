package com.bridgelabz.functional;
/*
* Created by:Anand kumar
* Date 25/10/2019
* Purpose:Write a program ​ Distance.java t ​ hat takes two integer command-line arguments x
* and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
* formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
**/

public class Distance {
	public static void main(String[] args)
	{
	int x=Integer.parseInt(args[0]);
	int y=Integer.parseInt(args[1]);
	double distance=Math.pow(x*x,y*y);
	//double d=Math.pow(4,16);
	System.out.println("the distance from the point of "+x+" "+y+ "from(0,0)"+"is"+distance);
	//System.out.println("d value is"+d);
	}
	}
