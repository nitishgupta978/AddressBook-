package com.bridgelabz.UC1;

public class AdressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Adress Book Program ");
		AddressBook addressBook=new AddressBook("Nitish kumar","Gupta"," Bettiah","Bettiah"," Bihar",888216005,845438,"gupta@gmail.com");
		addressBook.getFirstName();
		addressBook.getLastName();
	    addressBook.getAddress();
	    addressBook.getCity();
	   // addressBook.getstate();
	    addressBook.getZip();
		addressBook.getEmail();
		addressBook.getPhoneNumber();
		

	    System.out.println("address book "+addressBook);
	    
	    	
	}
}
