package com.blbz.addressbookproblem​.controller;


import com.blbz.addressbookproblem.serviceimp.AddressBookImple;
import com.blbz.addressbookproblem​.service.AddressBookService;
import com.blbz.addressbookproblem​.util.Utility;

public class AddressBook {
	public static void main(String[] args) {
		AddressBookService abs = new AddressBookImple();
		Utility utility=new Utility();
		System.out.println("you can choose. \n1.Address Book Person Management .\n2.Address Book Manager");
		switch (utility.inputStringLine()) {
		case "1":
			System.out.println("choose any one option \n1.To add a new person to an address book."
					+ " \n2.To edit existing information about a person." + "\n3.To delete a person."
					+ " \n4.To save as address book." + "\n5.Search a user");
			switch (utility.inputStringLine()) {
			case "1":
				//System.out.println("To see Address book");
				
				//abs.selectJson();
				System.out.println("Enter a Person Name");
				String person =utility.inputStringLine();
				System.out.println("Enter a Person First Name");
				String first = utility.inputStringLine();
				System.out.println("Enter a Person Second Name");
				String last = utility.inputStringLine();
				System.out.println("city");
				String city = utility.inputStringLine();
				System.out.println("state");
				String state = utility.inputStringLine();
				System.out.println("Zip");
				long zip =utility.inputLong();
				System.out.println("phone number");
				long Phonenumber = utility.inputLong();
				// System.out.println("Exit");
				abs.addUser(person, first, last, city, state, zip, Phonenumber);
				break;
			case "2":
				System.out.println("edit");
				String edit = utility.inputStringLine();
				abs.editUser(edit);
				//System.out.println("Exit");
				break;
			case "3":
				System.out.println(" delete");
				String delete = utility.inputStringLine();
				// System.out.println("Exit");
				abs.deleteUser(delete);
				// System.out.println("after deleting where it is saved?");
				// String save1=sc.nextLine();

				break;
			case "4":
				System.out.println("where it can be saved?  ");
				System.out.println("enter a new filename.");
				String save = utility.inputStringLine();
				abs.saveAs(save);
				System.out.println("Exit");
				break;
			case "5":
				System.out.println("search");
				String search = utility.inputStringLine();
				// System.out.println("Exit");
				boolean temp = abs.search(search);
				if (!temp) {
					System.out.println("No data found");
				}
				break;
				System.out.println("do you want to operation on stock data again");
				ch=utility.inputCharector();
			}while(ch=='y'||ch=='Y');
			}
			break;
		case "2":
			System.out.println("choose any one option.\n1.adding a new json file into address book "
					+ "\n2.delete a json file into address book"
					+ " \n3.select a json file from address book");
			switch (utility.inputStringLine()) {
			case "1":
				System.out.println("write a file name here");
				String addjson = utility.inputStringLine();
				abs.addJson(addjson);
				break;
			case "2":
				System.out.println(" U can choose which file is deleted from json file");
				String deletejson = utility.inputStringLine();
				abs.deleteJson(deletejson);
				break;
			case "3":
				System.out.println("select ajson file ");
				abs.selectJson();
				break;
			}

	
		}
		}
	
}


	


