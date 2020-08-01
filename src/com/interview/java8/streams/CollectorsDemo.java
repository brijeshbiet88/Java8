package com.interview.java8.streams;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import com.interview.java8.model.Student;

public class CollectorsDemo {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(20);
		numList.add(30);
		numList.add(40);
		numList.forEach(System.out::println);
		System.out.println("---------------------------------------------");
		List<String> nameList = new ArrayList<>();
		nameList.add("Rajat");
		nameList.add("Sharad");
		nameList.add("Brijesh");
		nameList.forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		List<Student> students = new ArrayList<Student>();
		Student s1 = new Student("Brijesh",30);
		Student s2 = new Student("Rajat",22);
		Student s3 = new Student("Prajjval",11);
		students.add(s1);students.add(s2);students.add(s3);
		students.forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		
		IntSummaryStatistics stats = students.stream().collect(Collectors.summarizingInt(s-> s.getAge()));
		System.out.println("Stats : "+stats);
		
		System.out.println("---------------------------------------------");
		
		Double avg = numList.stream().collect(Collectors.averagingDouble(e->e));
		System.out.println("Average : "+avg);
		
		String joining = nameList.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println("joining : "+joining);
		
		int sum = numList.stream().collect(Collectors.summingInt(num-> num));
		System.out.println("Sum "+sum);
		
		
	}

}
/*
20
30
40
---------------------------------------------
Rajat
Sharad
Brijesh
---------------------------------------------
Student [name=Brijesh, age=30]
Student [name=Rajat, age=22]
Student [name=Prajjval, age=11]
---------------------------------------------
Stats : IntSummaryStatistics{count=3, sum=63, min=11, average=21.000000, max=30}
---------------------------------------------
Average : 30.0
joining : [Rajat,Sharad,Brijesh]
Sum 90

 
*/
