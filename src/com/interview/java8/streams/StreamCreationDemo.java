package com.interview.java8.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreationDemo {

	public static void main(String[] args) {
		String [] arr = {"Santosh" , "Sonu" , "Ravindra"};
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(System.out::println);
		System.out.println("-------------------------------------------");
		Stream<String> stream2 = Stream.of(arr);
		stream2.forEach(System.out::println);
		System.out.println("-------------------------------------------");
		Stream<String> stream3 = Stream.of("Rahul" , "Shiv" , "Vijay");
		stream3.forEach(System.out::println);
	}

}
