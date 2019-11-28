package com.bridgelabz.logical;
/*
* created by:Anand kumar
* Date 30/10/2019
* Purpose:a StopWatch Program for measuring the time that elapses between the start and end clicks
*/
import java.util.Scanner;

public class StopWatch {
	// stop watch program for measuring the time that elapses between the start and
	// end clicks.
	public static void main(String[] args) {
		double elapsed;
		Scanner scn = new Scanner(System.in);

		// to start the timer

		System.out.println("Start the stop watch:");
		double start = scn.nextDouble();
		start = System.currentTimeMillis();

		// to stop the timer

		System.out.println("Stop the stop watch:");
		double stop = scn.nextDouble();
		stop = System.currentTimeMillis();

		if (stop == 0) {
			double now = System.currentTimeMillis();
			// System.out.println(now + " current time");
			elapsed = now - start;
		} else {
			elapsed = stop - start;
		}

		// in seconds
		double secs = elapsed % 60;
		System.out.println("elapsed time is: " + secs + "secs");
		elapsed = (elapsed - secs) / 60;
		// in minutes
		double minutes = elapsed % 60;
		System.out.println("elapsed time is: " + minutes + "min");
	}
}


