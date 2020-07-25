package com.interview.java8.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.interview.java8.iface.MyInterface;
import com.interview.java8.model.Student;

public class MyInterfaceImple implements MyInterface{
	
	public static void main (String [] args) {
		MyInterfaceImple myInterfaceImple = new MyInterfaceImple();
		
		Student s3 = new Student("Corkit", 30);
		Student s1 = new Student("Rajat", 23);
		Student s2 = new Student("Munna", 27);
		
		List <Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Student s = myInterfaceImple.getYoungestStudent(list);
		System.out.println("Youngest Student\nName : "+s.getName()+" ,Age : "+s.getAge());
	}

	@Override
	public Student getYoungestStudent(List<Student> studentList) {
		return Collections.min(studentList); 
	}

}
