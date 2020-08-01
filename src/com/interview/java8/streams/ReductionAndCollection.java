package com.interview.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReductionAndCollection {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(3);
		numList.add(4);
		numList.add(5);
		
		System.out.println("Reduction Demo ");
		System.out.println("----------------------------------");
		Stream<Integer> stream = numList.stream();
		int result = stream.reduce(3, (a ,b)-> a+b);
		System.out.println(result);

		stream = numList.stream();
		int result2 = stream.reduce(2, (a ,b)-> a*b);
		System.out.println(result2);
		
		System.out.println("\nCollection Demo ");
		System.out.println("----------------------------------");
		
		String [] players = {"Santosh" , "Sonu" , "Ravindra" , "Vipin" , "Neeraj"
				 		,"Rupesh" , "Dinesh" , "Rajeev" , "Deepak" , "Vicky"
				 		,"Aslam" , "Rakesh" , "Satendra" , "Rajesh", "Sanjay"};

		Stream<String> playerStream = Stream.of(players);
		List<String> collect = playerStream.map(p->p.toUpperCase()).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
	}

}
