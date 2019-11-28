package com.bridgelabz.logical;

/*****
* created by:Anand kumar
* Date 29/10/2019
* Purpose:Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results, and prints them out.
* I/P -> $Stake, $Goal and Number of times
* Logic -> Play till the gambler is broke or has won
* O/P -> Print Number of Wins and Percentage of Win and Loss.
***********/

import java.util.Scanner;

public class Gambler {
	public static void main(String[] args) {
// take three inputs by using Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cash");
		int invest = sc.nextInt();
		System.out.println("Enter goal");
		int goal = sc.nextInt();
		System.out.println("Enter number of trails ");
		int trails = sc.nextInt();
		//start the game invester means stake to invest the cash based on cash, we can
		// play the game
		int cash = invest;
		// first we can intialize
		int win = 0;
		int bets = 0;
		// trails should be 0 to n
		for (int t = 0; t < trails; t++) {
			// based on condition we start the game
			while (cash > 0 && cash < goal) {
				if (Math.random() < 0.5)
					cash++;// win $1
				else
					cash--; // lose $1
			}
			if (cash == goal)
				win++;
			{
				System.out.println(win + " wins of" + trails);
				System.out.println("percentage of game won =" + 100.0 * win / trails);
				System.out.println("avarage =" + 1.0 * bets / trails);
			}

		}
	}
}
