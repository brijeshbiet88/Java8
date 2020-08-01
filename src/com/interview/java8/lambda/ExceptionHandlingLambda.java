package com.interview.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandlingLambda {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(10 ,20 , 0 , null ,50);
		numList.forEach(lambdaWrapper(i-> System.out.println(100/i), Exception.class));

	}

	private static <T , E extends Exception> Consumer<T> lambdaWrapper (Consumer<T> consumer , Class<E> cls){
		
		return i->{
			try {
				consumer.accept(i);
			} catch (Exception e) {
				System.out.println("Exception has Occured : "+e.getMessage());
			}
		};
	}
}
