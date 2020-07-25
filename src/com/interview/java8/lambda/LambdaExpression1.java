package com.interview.java8.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpression1 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Rajat");
		names.add("Sharad");
		names.add("Munna");
		names.add("Corkit");
		
		iterateList(names);
	}

	private static void iterateList(ArrayList<String> names) {
	
		System.out.println("Iterate Using foreach Lambda expression");
		names.forEach(name -> System.out.println(name));
		System.out.println("----------------------------------------");
		
		System.out.println("Iterate Using foreach Lambda expression and method reference");
		names.forEach(System.out::println);
		System.out.println("----------------------------------------");
		
		System.out.println("Iterate Using Consumer Functional Interface");
		names.forEach(new Consumer<String>() {
			@Override
			public void accept (String name) {
				System.out.println(name);
			}
		});
		
	}

}

/*
 *Iterate Using foreach Lambda expression
Rajat
Sharad
Munna
Corkit
----------------------------------------
Iterate Using foreach Lambda expression and method reference
Rajat
Sharad
Munna
Corkit
----------------------------------------
Iterate Using Consumer Functional Interface
Rajat
Sharad
Munna
Corkit
 
 * */
