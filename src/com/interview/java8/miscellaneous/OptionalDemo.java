package com.interview.java8.miscellaneous;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Optional<Integer> a = Optional.of(new Integer(7));
		Optional<Integer> b = Optional.ofNullable(null);
		Optional<Integer> c = Optional.empty();

		System.out.println(c+" "+c.orElse(5));
		int sum = add (a , b);
		System.out.println("Sum = "+sum);
	}

	private static int add(Optional<Integer> a, Optional<Integer> b) {
		System.out.println("First Parameter is Present ? "+a.isPresent());
		System.out.println("First Parameter is Present ? "+b.isPresent());
		Integer c = b.orElse(3);
		return c + a.get();
	}

}
/*
Optional.empty 5
First Parameter is Present ? true
First Parameter is Present ? false
Sum = 10 
 */
 