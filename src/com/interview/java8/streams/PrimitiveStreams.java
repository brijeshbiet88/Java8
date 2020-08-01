package com.interview.java8.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreams {

	public static void main(String[] args) throws IOException {
		IntStream range1 = IntStream.range(1, 3);
		range1.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------");
		
		LongStream range2 = LongStream.rangeClosed(1, 3);
		range2.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------");
		
		Random random = new Random();
		DoubleStream doubleStream = random.doubles().limit(3);
		doubleStream.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------");
		String str = "Rajat";
		IntStream charStream = str.chars();
		charStream.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------");
		
		Stream <String> patternStream = Pattern.compile(",").splitAsStream("I,N,D,I,A");
		patternStream.forEach(System.out::println);
		
		System.out.println("------------------------------------------------------");
		
		Path path = Paths.get("/home/brijesh/programming/ds/Java8/resource/Streams");
		Stream <String> fileStream = Files.lines(path);
		fileStream.forEach(System.out::println);
		
	}

}
