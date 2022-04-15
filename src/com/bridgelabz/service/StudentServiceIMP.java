package com.bridgelabz.service;

import java.util.ArrayList;

import com.bridgelabz.model.Student;
import com.bz.interfaces.StudentService;

public class StudentServiceIMP implements StudentService {
private ArrayList<Student> listOfStudents = new ArrayList<Student>();

@Override
public void add(Student student) {
	
	int size = listOfStudents.size();
	int id = 10000+size;
	student.setId(id);
	listOfStudents.add(student);
}

@Override
public void update(Student student) {
	// TODO Auto-generated method stub
	
}

@Override
public Student search(int id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void delete(int id) {
	// TODO Auto-generated method stub
	
}

@Override
public ArrayList<Student> getAllStudents() {
	// TODO Auto-generated method stub
	return listOfStudents ;
	
}
	
	}
	

 