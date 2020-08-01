package com.interview.java8.streams;

import java.util.ArrayList;
import java.util.List;

import com.interview.java8.model.Student;

public class DistinctStudentsCount {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		Student s1 = new Student("Gaurav ", 31);
		Student s2 = new Student("Manoj  ", 32);
		Student s3 = new Student("Vipin  ", 30);
		Student s4 = new Student("Vicky  ", 26);
		Student s5 = new Student("Karan  ", 24);
		Student s6 = new Student("Shubham", 25);
		Student s7 = new Student("Shubham", 25);
		Student s8 = new Student("Shubham", 25);
		Student s9 = new Student("Vicky  ", 26);
		list.add(s1);list.add(s2);list.add(s3);
		list.add(s4);list.add(s5);list.add(s6);
		list.add(s7);list.add(s8);list.add(s9);
	
		long distinctCount = list.stream().distinct().count();
		System.out.println("Distinct Count : "+distinctCount);
	}

}
