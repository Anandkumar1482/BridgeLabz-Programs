package com.bridgelabz.functional;
/*
* created by: BridgeLabz
* Date 25/10/2019
* Purpose:  Write a program ​ Quadratic.java to find the roots of the equation a*x*x + b*x + c.
* Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
* can be found using a formula (Note: Take a, b and c as input values)
* delta = b*b - 4*a*c
* Root 1 of x = (-b + sqrt(delta))/(2*a)
* Root 2 of x = (-b - sqrt(delta))/(2*a)
**/
import java.util.Scanner;
class Quadratic
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value");
double a=sc.nextDouble();
System.out.println("Enter b value");
double b=sc.nextDouble();
System.out.println("Enter c value");
double c=sc.nextDouble();
double discriminant=(b * b)-(4 * a * c);
double root1=0,root2=0,imaginary;
/*Quadratic equation can have two roots, they are completely depending on the discriminent value.
//the term  b*b-4*a*c is also called  discriminant value of quadratic equation.it tells the nature of roots.
//if discriminent >= o,the roots are real and different*/
	if(discriminant > 0)
	{
	root1=(-b + Math.sqrt(discriminant)/(2 * a));
	root2=(-b-Math.sqrt(discriminant)/(2 * a));
	System.out.println("\n Two Distinct Real Roots Exists: root1 = " + root1 + " and root2 = " + root2);
//System.out.println("the root elements are:" and root2"+root2);
	}
	else if(discriminant==0)
	{	
	root1=root2=-b/(2 * a);
	System.out.println("\n Two Distinct Real Roots are equal: root1 = " + root1 + " and root2 = " + root2);
	}
	 else if(discriminant < 0)
	{
        root1=root2=-b/(2 * a);
	imaginary=Math.sqrt(-discriminant)/(2 * a);
	System.out.println("\n Two Distinct imaginary Roots and different: root1 = " + root1 + " and root2 = " + root2);
}
}
}
