package com.interview.java8.lambda;

import java.util.function.BooleanSupplier;

public class BooleanSupplierDemo {

	public static void main(String[] args) {
		BooleanSupplier bs = ()-> true;
		System.out.println(bs.getAsBoolean());
		
		int x = 2;
		
		bs = ()-> x%2==0;
		System.out.println(bs.getAsBoolean());
		int y = 3;
		
		bs = ()-> y%2==0;
		
		System.out.println(bs.getAsBoolean());
		
	}

}
/*
 *true
true
false

 * */
 