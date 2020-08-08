package com.interview.java8.lambda;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<Integer> supplier = SupplierDemo :: generateRandom;
		for(int i = 0 ; i < 25 ; i++) {
			System.out.println(supplier.get());
		}
	}
	
	public static int generateRandom() {
		Random random = new Random();
		return random.nextInt(25);
	}

}
