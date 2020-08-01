package com.interview.java8.streams;

import java.util.stream.Stream;

public class Matching {
	
	public static void main(String[] args) {
		String [] arr = {"Santosh" , "Sonu" , "Ravindra" , "Vipin" , "Neeraj"
						 ,"Rupesh" , "Dinesh" , "Rajeev" , "Deepak" , "Vicky"
						 ,"Aslam" , "Rakesh" , "Satendra" , "Rajesh", "Sanjay"};
		
		Stream<String> stream = Stream.of(arr);
		
		boolean isAnyMatch = stream.anyMatch(s-> s.startsWith("A"));
		
		stream = Stream.of(arr);
		
		boolean isAllMatch = stream.allMatch(s->s.toLowerCase().contains("a"));
		
		stream = Stream.of(arr);
		
		boolean isNoneMatch = stream.noneMatch(s->s.toLowerCase().contains("z"));
		
		System.out.println("Any Match :"+isAnyMatch+"\nAll Match :"+isAllMatch+"\nNone Match :"+isNoneMatch);
	}
}
