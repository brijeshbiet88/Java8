package com.interview.java8.lambda;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> biPredicateSquareCheck = (a , b) -> (a*a == b);
		System.out.println("-----------Test Case 1-----------");
		int a = 10 , b = 100;
		System.out.println("Is"+b+" Square of "+a+" : "+biPredicateSquareCheck.test(a, b));
		System.out.println("-----------Test Case 2-----------");
		a = 11 ; b = 100;
		System.out.println("Is"+b+" Square of "+a+" : "+biPredicateSquareCheck.test(a, b));

	}

}
/*
-----------Test Case 1-----------
Is100 Square of 10 : true
-----------Test Case 2-----------
Is100 Square of 11 : false 
 * */
