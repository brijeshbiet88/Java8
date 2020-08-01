package com.interview.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
Average : 30.0
joining : [Rajat,Sharad,Brijesh]
Sum 90
 
*/
