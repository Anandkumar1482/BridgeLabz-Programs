
package com.bridgelabz.clinicmanagement.model;

public class Patients {

	
	private String patientName;
	private String id;
	private long mobile;
	private int age;

	
	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Patients [patientName=" + patientName + ", id=" + id + ", mobile=" + mobile + ", age=" + age + "]";
	}

}
