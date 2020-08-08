package com.interview.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2 , 4 , 6 , 8, 10);
		UnaryOperator<Integer> unaryOperator = (num)-> num*num;
		unaryOperatorFun(unaryOperator , list).forEach(s-> System.out.print(s+" "));
		System.out.println();
		
		System.out.println(unaryOperator.apply(12));
		System.out.println(unaryOperator.apply(14));
		System.out.println(unaryOperator.apply(16));
		System.out.println(unaryOperator.apply(18));
		System.out.println(unaryOperator.apply(20));
	}

	private static List<Integer> unaryOperatorFun(UnaryOperator<Integer> unaryOperator, List<Integer> list) {
		List<Integer> resultList = new ArrayList<>();
		list.forEach(element -> resultList.add(unaryOperator.apply(element)));
		return resultList;
	}

}
/*4 16 36 64 100 */