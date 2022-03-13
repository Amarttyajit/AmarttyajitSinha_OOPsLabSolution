package com.credentials.model;

public class Employee {
	private String firstname;
	private String lastname;
	public Employee(String firstname, String lastname) {
		super();
		this.firstname=firstname;
		this.lastname=lastname;
	}
 public String getFirstName( ) {
	 
	 return firstname;
 }
 public void setFirstName(String firstname) {
	 this.firstname=firstname;
 }
 public String getLastName() {
	 return lastname;
 }
 public void setLastName(String lastname) {
	 this.lastname=lastname;
 }
	 
}
