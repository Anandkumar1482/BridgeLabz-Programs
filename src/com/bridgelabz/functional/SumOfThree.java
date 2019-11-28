package com.bridgelabz.functional;

/*
* created by:Anand kumar
* Date 26/10/2019
* Purpose:A program with cubic running time. Read in N integers and counts the
* number of triples that sum to exactly 0.
* I/P -> N number of integer, and N integer input array
* Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0

**/
public class SumOfThree {

    public static void find(int [] a){
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                for (int l = j+1; l <a.length ; l++) {
                    if(a[i]+a[j]+a[l]==0){
                        System.out.println("Found 3 elements whose sum is = 0");
                        System.out.println("Elements are " + a[i] + " " + a[j]+ " " + a[l]);
                        return;
                    }
                }
            }
        }
        System.out.println("Did not find 3 elements whose sum is = 0");
    }
    public static void main(String[] args) {
        int a [] = { 3,-1,-7,-4,-5,9,10};
        find(a);
    }
}
