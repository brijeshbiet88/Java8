package com.interview.java8.streams;

import java.util.stream.Stream;

public class BuilderAndGenerator {

	public static void main(String[] args) {
		Stream<String> builderStream = Stream.<String>builder().add("Brijesh").add("Rajat").add("Sharad").build();
		builderStream.forEach(System.out::println);
		
		Stream <String> streamGenerator = Stream.generate(()-> "Stream Generator").limit(5);
		streamGenerator.forEach(System.out::println);
	}

}
