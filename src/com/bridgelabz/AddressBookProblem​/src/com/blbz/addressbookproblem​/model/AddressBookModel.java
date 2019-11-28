package com.blbz.addressbookproblem​.model;

public class AddressBookModel{
private static String fileName;
private String firstname;
private String lastname;
private String city;
private String state;
private double zip;
private long phonenumber;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Double getZip() {
	return zip;
}
public void setZip(double zip) {
	this.zip = zip;
}
public long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(long phonenumber) {
	this.phonenumber = phonenumber;
}
public static String getFileName() {
	return fileName;
}
public static void setFileName(String fileName) {
	AddressBookModel.fileName = fileName;
}
}
