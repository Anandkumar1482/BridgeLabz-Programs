package com.bridgelabz.ds;


/*
* Created by:Anand Dandi
* Date :12/11/2019
* Purpose:Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. Store the prime numbers in a 2D Array, the first dimension represents the range 0-100, 100-200, and so on.
*  While the second dimension represents the prime numbers in that range
*  ******/

public class PrimeNumbers {

public static void main(String[] args) {
prime2DArray();//calling the method
		}
	public static void prime2DArray() {
	int array[][]=new int[10][100];
	int prime[][]=new int[10][100];
	int temp=1;
	for (int i = 0; i< 10; i++) {
	for (int j = 0; j < 100; j++) {
	array[i][j]=temp;
	temp++;
	}
	}
			for (int i = 0; i <10; i++) {
				for (int j = 0; j < 100; j++) {
					if(checkPrime(array[i][j]))
					{
						prime[i][j]=array[i][j];
					}
					else
					{
						prime[i][j]=-1;
					}
				}
			}
			for (int i = 0; i < 10; i++) {
				for (int j = 1; j < 100; j++) {
					if(prime[i][j]!=-1)
					{
						System.out.print(prime[i][j]+" ");
					}
				}
				System.out.println("\n");
			}
		}
		/**
		 * @param number
		 * @return beelean value
		 */
		public static boolean checkPrime(int number)
		{
			int count=0;
			for (int i = 2; i <=number/2; i++) {
				if(number%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

}

