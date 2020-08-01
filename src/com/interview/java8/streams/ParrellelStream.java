package com.interview.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.interview.java8.model.Student;

public class ParrellelStream {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		Student s1 = new Student("Gaurav ", 31);
		Student s2 = new Student("Manoj  ", 32);
		Student s3 = new Student("Vipin  ", 30);
		Student s4 = new Student("Vicky  ", 26);
		Student s5 = new Student("Karan  ", 24);
		Student s6 = new Student("Shubham", 25);
		list.add(s1);list.add(s2);list.add(s3);
		list.add(s4);list.add(s5);list.add(s6);
		
		Stream<Student> pStream = list.parallelStream();
		pStream.forEach(s-> System.out.println(s.getName()+" Age :"+s.getAge()));
	}

}
