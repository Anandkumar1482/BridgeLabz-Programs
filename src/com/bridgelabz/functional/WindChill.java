package com.bridgelabz.functional;

/******
* Created by:Anand kumar
* Date 26/10/2019
* Purpose:WindChill that takes two double command-line arguments t and v and prints the wind chill.
* Use Math.pow(a, b) to compute ab
*****/

	import java.util.Scanner;
	public class WindChill {
		public static void main(String[] args) {
			WindChill wc = new WindChill();// By using object reference to invoke findWindChill()
			wc.findWindChill();
		}

		void findWindChill() {
			double t, v, wc; // to intialize temperature, windspeed and wind chill
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter temperature value : ");
			t = scanner.nextInt();
			System.out.print("Enter windspeed value : ");
			v = scanner.nextInt();
			scanner.close();
			if (t > 50) { // the formula is not valid if t is not greater than 50
				System.out.println("temperature value must be less than 50");
				findWindChill();
				return;
			}
			if ((v > 120) || (v < 3)) { // velocity
				System.out.println("velocity should be greater than 3 and less than 120");
				findWindChill();
				return;
			}
			/*
			 * by using WindChill formula to get the values and aslo to print wc
			 */
			wc = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * (Math.pow(v, 0.16));

			System.out.println("Windchill : " + wc);
		}
	}


