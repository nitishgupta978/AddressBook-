package com.bridgelabz.model;

public class Student {

	public static char[] getAllStudets;
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String mobileNumber ;
	private String address;
	private String zip;
	private String email;
	
	public  int getId() {
	return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getMiddleName() {
		return middleName;
		
	}
	public void setMiddleName(String middleName) {
		this.middleName=middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
		
	}
	public void setMobileName( String mobileNumber) {
		this.mobileNumber=mobileNumber;
	}

public String getAddress() {
	return address;
 }	
public void setAddress(String address) {
	this.address=address;
}
public String getZip() {
	return zip;
 }	
public void setzip(String zip) {
	this.zip=zip;
}
public String getEmail() {
	return email;
 }	
public void setEmail(String email) {
	this.email=email;
}
public String toString() {
	return" Student[id="+id+" ,firstName="+firstName+" ,middleName=," +middleName+", lastName=,"+ lastName+ " ,mobileNumber=,"+mobileNumber+" ,address=,"+address+", zip=,"+zip+" ,email=,"+email+"]";
	
}
//public static char[] getAllStudets() {
//	// TODO Auto-generated method stub
//	return getAllStudets;
//}
public static char[] getAllStudets() {
	// TODO Auto-generated method stub
	return null;
}
}
