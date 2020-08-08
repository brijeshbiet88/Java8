package com.interview.java8.lambda;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> squareFunction = (a)-> {
			int result = a*a;
		    return result;
		};
		int a = 10;
		System.out.println("Square of "+a+" is :"+squareFunction.apply(a));
		

	}

}
/*Square of 10 is :100 */