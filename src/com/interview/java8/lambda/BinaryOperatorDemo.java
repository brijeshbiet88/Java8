package com.interview.java8.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		map.put("X", "A");
		map.put("Y", "B");
		map.put("Z", "C");
		
		BinaryOperator<String> binaryOperator = (s1,s2)-> s1+"-"+s2;
		binaryOperatorFun(binaryOperator , map).forEach(System.out::println);
	}

	private static List<String> binaryOperatorFun(BinaryOperator<String> binaryOperator, Map<String, String> map) {
		List<String> result = new ArrayList<>();
		map.forEach((k,v)->result.add(binaryOperator.apply(k, v)));
		return result;
	}

}
/*
X-A
Y-B
Z-C

 * */