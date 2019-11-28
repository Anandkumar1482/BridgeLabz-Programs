package com.blbz.addressbookproblem​.util;

	import java.util.Scanner;

	public class Utility {
		static Scanner scanner;
		
		
		//constructor
		public Utility() {
			scanner = new Scanner(System.in);
			

		}

		/**
		 * Takes input with the user via Scanner for String
		 * 
		 * @return INPUT STRING
		 */
		public String inputString() {
			try {
				return scanner.next();
			} catch (Exception e) {
				System.out.println(e);
			}
			return "";
		}

		/**
		 * Takes input with the user via Scanner for StringLine
		 * 
		 * @return INPUT STRING LINE
		 */
		public String inputStringLine() {
			try {
				return scanner.nextLine();
			} catch (Exception e) {
				System.out.println(e);
			}
			return "";
		}

		/**
		 * Takes input with the user via Scanner for Integer
		 * 
		 * @return INPUT INTEGER
		 */
		public int inputInteger() {
			try {
				return scanner.nextInt();
			} catch (Exception e) {
				System.out.println(e);
			}
			return 0;
		}

		/**
		 * Takes input with the user via Scanner for Double
		 * 
		 * @return INPUT DOUBLE
		 */
		public double inputDouble() {
			try {
				return scanner.nextDouble();
			} catch (Exception e) {
				System.out.println(e);
			}
			return 0;
		}

		/**
		 * Takes input with the user via Scanner for Boolean
		 * 
		 * @return INPUT BOOLEAN
		 */
		public boolean inputBoolean() {
			try {
				return scanner.nextBoolean();
			} catch (Exception e) {
				System.out.println(e);
			}
			return false;

		}

		public long inputLong() {
			try {
				return scanner.nextLong();
			} catch (Exception e) {
				System.out.println(e);
			}
			return 0;
		}

		public void reset() {
			
		}

		public String inputCharector() {
			try {
				return scanner.nextChar();
			} catch (Exception e) {
				System.out.println(e);
			}
			return null;
		}

		
}



