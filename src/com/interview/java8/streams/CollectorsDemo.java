package com.interview.java8.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
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
		Student s4 = new Student("Shubham",22);
		Student s5 = new Student("Sharad",19);
		Student s6 = new Student("Prince",19);
		students.add(s1);students.add(s2);students.add(s3);
		students.add(s4);students.add(s5);students.add(s6);
		students.forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		
		IntSummaryStatistics stats = students.stream().collect(Collectors.summarizingInt(s-> s.getAge()));
		System.out.println("Stats : "+stats);
		
		System.out.println("---------------------------------------------");
		Map<Integer , List<Student>> groupBy = students.stream().collect(Collectors.groupingBy(Student:: getAge));
		groupBy.forEach((k , v)->{
			System.out.println(k);
			System.out.println(v);
		});
		
		System.out.println("---------------------------------------------");
		Map<Boolean, List<Student>> partitionBy = students.stream().collect(Collectors.partitioningBy(p->p.getAge() > 20));
		partitionBy.forEach((k , v)->{
			System.out.println(k);
			System.out.println(v);
		});
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
Student [name=Shubham, age=22]
Student [name=Sharad, age=19]
Student [name=Prince, age=19]
---------------------------------------------
Stats : IntSummaryStatistics{count=6, sum=123, min=11, average=20.500000, max=30}
---------------------------------------------
19
[Student [name=Sharad, age=19], Student [name=Prince, age=19]]
22
[Student [name=Rajat, age=22], Student [name=Shubham, age=22]]
11
[Student [name=Prajjval, age=11]]
30
[Student [name=Brijesh, age=30]]
---------------------------------------------
false
[Student [name=Prajjval, age=11], Student [name=Sharad, age=19], Student [name=Prince, age=19]]
true
[Student [name=Brijesh, age=30], Student [name=Rajat, age=22], Student [name=Shubham, age=22]]
---------------------------------------------
Average : 30.0
joining : [Rajat,Sharad,Brijesh]
Sum 90

*/
