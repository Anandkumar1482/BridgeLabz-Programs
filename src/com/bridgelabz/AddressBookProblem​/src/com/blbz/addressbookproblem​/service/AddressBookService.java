package com.blbz.addressbookproblem​.service;

public interface AddressBookService {
public void addUser(String person,String first,String last,String city, String state,long zip,long phone);
public void editUser (String person );
public void deleteUser(String person);
boolean search(String person);
public void saveAs(String fileName);
public void addJson(String fileName);
public void deleteJson(String fileName);
public void selectJson();
}

