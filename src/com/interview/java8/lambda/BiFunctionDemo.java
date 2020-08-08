package com.interview.java8.lambda;

import java.util.function.BiFunction;

public class BiFunctionDemo {
	
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunctionMultiplication = (a,b)->  a*b;
		System.out.println(biFunctionMultiplication.apply(10, 10));
	}
}
/* 100 */