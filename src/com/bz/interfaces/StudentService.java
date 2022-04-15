package com.bz.interfaces;

import java.util.ArrayList;

import com.bridgelabz.model.Student;

public interface  StudentService {
	
	public void add(Student student);
	public void update(Student student);
	 public Student search(int id);
	public void delete(int id);
	public ArrayList<Student> getAllStudents();
}
