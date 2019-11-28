package com.blbz.InventoryDataManagement.controller;

import java.util.Scanner;

import com.blbz.InventoryDataManagement.service.Service;
import com.blbz.InventoryDataManagement.serviceimp.ServiceImplementation;

public class InventoryDataManagement {
	public static void main(String[] args) {
//inventory management main() method
		Service ser = new ServiceImplementation();
		Scanner sc = new Scanner(System.in);
		long total=0;
		// String name="";
		System.out.println("please enter option.\n1. add value \n2. caculate");
		switch (sc.nextLine()) {
		case "1":
			System.out.println("please enter option.\n1.rice \n2. wheat \n3.pulses ");
			switch (sc.nextLine()) {
			case "1":
				System.out.println("enter rice name");
				String name = sc.nextLine();
				System.out.println("enter weight");
				int weight = sc.nextInt();
				System.out.println("enter price ");
				int price = sc.nextInt();
				ser.add("Rice", name, price, weight);
				break;
			case "2":
				System.out.println("enter wheat name");
				String name1 = sc.nextLine();
				System.out.println("enter weight");
				int weight1 = sc.nextInt();
				System.out.println("enter price");
				int price1 = sc.nextInt();
				ser.add("Wheat", name1, price1, weight1);
				break;
			case "3":
				System.out.println("enter pulse name");
				String name2 = sc.nextLine();
				System.out.println("enter weight");
				int weight2 = sc.nextInt();
				System.out.println("enter price");
				int price2 = sc.nextInt();
				ser.add("Pulses", name2, price2, weight2);
				break;
			case "4":
				System.out.println("choose correct option");
			}

		case "2":
			total=0;
			System.out.println("please enter calculate  option.\n1.rice \n2.wheat \n3.pulses \n4.All");
			switch (sc.nextInt()) {
			case 1:
				total=ser.calculateInventory("Rice");
				System.out.println(total);
				break;
			case 2:
				total=ser.calculateInventory("Wheat");
				System.out.println(total);
				break;
			case 3:
				total=ser.calculateInventory("Pulses");
				System.out.println(total);
				break;
			case 4:
				total=ser.calculateInventory("Rice");
				total=total+ser.calculateInventory("Wheat");
				total=total+ser.calculateInventory("Pulses");
				System.out.println(total);
				break;

			}
		
		}
	}
}
