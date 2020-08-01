package com.interview.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import com.interview.java8.model.Student;

public class ParalleStreamDemo {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		Student s1 = new Student("Brijesh",30);
		Student s2 = new Student("Rajat",22);
		Student s3 = new Student("Prajjval",11);
		Student s4 = new Student("Shubham",22);
		Student s5 = new Student("Sharad",19);
		Student s6 = new Student("Prince",19);
		students.add(s1);students.add(s2);students.add(s3);
		students.add(s4);students.add(s5);students.add(s6);
		students.parallelStream().forEach(s-> System.out.println(s));
		
		System.out.println("---------------------------------------------");
		
		IntStream intStreamParallel = IntStream.range(1, 10).parallel();
		intStreamParallel.forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		intStreamParallel = IntStream.range(1, 10).parallel();
		intStreamParallel.sequential().forEach(System.out::println);
		
		

	}

}
