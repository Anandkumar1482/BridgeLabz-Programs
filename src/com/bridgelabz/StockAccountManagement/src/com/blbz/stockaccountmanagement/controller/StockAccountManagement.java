package com.blbz.stockaccountmanagement.controller;

import java.util.Scanner;

import com.blbz.stockaccountmanagement.service.StockInterface;
import com.blbz.stockaccountmanagement.serviceimp.ServiceImp;

public class StockAccountManagement {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		StockInterface si=new ServiceImp();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter option.\n1. add stock \n2. caculate stock");
		switch (sc.nextLine()) {
		case "1":

			System.out.println("enter name");
			String Name = sc.nextLine();
			System.out.println("enter number of shares");
			int Share= sc.nextInt();
			System.out.println("enter share price ");
			int Price = sc.nextInt();
			si.add(Name, Price, Share);
			break;
		case "2":
	
			System.out.println("stock report");
			si.stockreport();
			break;
		}
	}

}
    	
    