package com.interview.java8.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.interview.java8.model.Student;

public class ComparatorInJava8 {
	public static void main(String args[]) {
		Student s1 = new Student("Rajat ", 22);
		Student s2 = new Student("Sharad", 19);
		Student s3 = new Student("Monty ", 27);
		Student s4 = new Student("Corkit", 30);
		
		List<Student> list = new ArrayList<>();
		list.add(s1);list.add(s2);list.add(s3);list.add(s4);
		
		System.out.println("----Iterate Using Anonymous Class----\n");
		Collections.sort(list , new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}			
		});
		
		list.forEach(System.out::println);
		
		System.out.println("----Iterate Using Lambda Expression----\n");
		Collections.sort(list , (a,b)->a.getName().compareTo(b.getName()));
		list.forEach(System.out::println);
	}
	
}
