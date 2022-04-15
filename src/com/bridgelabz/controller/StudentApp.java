package com.bridgelabz.controller;

import java.util.Scanner;

import com.bridgelabz.comman.ValidatoonLogics;
import com.bridgelabz.model.Student;
import com.bridgelabz.service.StudentServiceIMP;
import com.bz.interfaces.StudentService;

public class StudentApp {
	static Scanner scanner= new Scanner(System.in);
	 static StudentService studentService =new StudentServiceIMP();
	 

	private static void RegisterStudent() {
		Student student= new Student();
		
		System.out.println("Enter the FirstName");
		String firstName=scanner.next();
		ValidatoonLogics.CheckUserNameStartWithCap(firstName);
		student.setFirstName(firstName);
		
		System.out.println("Enter the MiddleName");
		String middleName=scanner.next();
		ValidatoonLogics.CheckUserNameStartWithCap(middleName);
		student.setMiddleName(middleName);
		
		System.out.println("Enter the lastName");
		String lastName=scanner.next();
		ValidatoonLogics.CheckpasswordStartWithCapEndDigit(lastName);
		student.setLastName(lastName);
		
		System.out.println("Enter the mobileNumber");
		String mobileNumber=scanner.next();
		ValidatoonLogics.CheckAllDigit(mobileNumber);
		student.setMobileName(mobileNumber);
		
		System.out.println("Enter the address");
		String address=scanner.next();
		ValidatoonLogics.CheckAddressStartWithCap(address);
		student.setAddress(address);
		
		System.out.println("Enter the zip");
		String zip=scanner.next();
		ValidatoonLogics.CheckAllDigit6(zip);
		student.setzip(zip);
		
		System.out.println("Enter the email");
		String email=scanner.next();
		ValidatoonLogics.CheckEmailStartWithCapEndDigit(email);
		student.setEmail(email);
		
		System.out.println("Student Details are"+student);
		studentService.add(student);
		
	}
	private static void ShowAllStudents() {
		// TODO Auto-generated method stub
 System.out.println(studentService.getAllStudents());
}
	public static void main(String[] args) {
		int ch=1;
		do {
			System.out.println("Welcome");
			System.out.println("1 Register the Studets");
			System.out.println("2 Show all Studets");
			System.out.println("Enter your choise...");
			int choise = scanner.nextInt();
			switch(choise) {
			case 1:
				RegisterStudent();
				break;
			case 2:
				ShowAllStudents();
				break;
			default:
				break;
			}
			System.out.println("If you want to countinew this process please press 1....");
			ch = scanner.nextInt();
		}while(ch==1);
			System.out.println("Default value");
		}
	
	}

