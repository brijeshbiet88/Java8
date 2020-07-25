package com.interview.java8.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.interview.java8.iface.MyInterface;
import com.interview.java8.model.Student;

public class MyInterfaceImple implements MyInterface{
	
	public static void main (String [] args) {
		MyInterfaceImple myInterfaceImple = new MyInterfaceImple();
		
		Student s1 = new Student("Corkit", 30);
		Student s2 = new Student("Rajat", 23);
		Student s3 = new Student("Munna", 27);
		Student s4 = new Student("Munna", 27);
		
		List <Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		Student s = myInterfaceImple.getYoungestStudent(list);
		System.out.println("Youngest Student\nName : "+s.getName()+" ,Age : "+s.getAge());
		
		System.out.println("Are Equal ? s1 and s2 : "+myInterfaceImple.equals(s1, s2));
		System.out.println("Are Equal ? s3 and s4 : "+myInterfaceImple.equals(s3, s4));
		
		System.out.println("Equals Test s3 : "+myInterfaceImple.equals(s3));
		
		
		System.out.println("----------------Sort Students On Age ---------------");
		
		myInterfaceImple.sortStudents(list);
		list.forEach(student -> 
		System.out.println("Age : " +student.getAge()+" Name : "+student.getName())
		);
	}

	@Override
	public Student getYoungestStudent(List<Student> studentList) {
		return Collections.min(studentList); 
	}
}

/*
 Youngest Student
Name : Rajat ,Age : 23
Are Equal ? s1 and s2 : false
Are Equal ? s3 and s4 : true
Equals Test s3 : true
----------------Sort Students On Age ---------------
Age : 23 Name : Rajat
Age : 27 Name : Munna
Age : 27 Name : Munna
Age : 30 Name : Corkit

 * */
