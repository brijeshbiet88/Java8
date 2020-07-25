package com.interview.java8.iface;

import java.util.Collections;
import java.util.List;

import com.interview.java8.model.Student;

public interface MyInterface {
	
	default public List<Student> sortStudents(List <Student> studentList){
		Collections.sort(studentList);
		return studentList;
	}
	
	public static void greet (String name) {
		System.out.println("Hi "+name);
	}
	
	public abstract Student getYoungestStudent (List <Student> studentList);
}
