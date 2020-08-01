package com.interview.java8.time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {

	public static void main(String[] args) {
		LocalTime localTime1 = LocalTime.now();
		System.out.println(localTime1);
		System.out.println("-------------");
		
		LocalTime localTime2 = LocalTime.parse("12:38");
		System.out.println(localTime2);
		System.out.println("-------------");
		
		LocalTime localTime3 = LocalTime.of(23,58);
		System.out.println(localTime3);
		System.out.println("-------------");
		
		LocalTime localTime4 = localTime3.plus(1 ,ChronoUnit.HOURS);
		System.out.println(localTime4);
		System.out.println("-------------");
		
		LocalTime localTime5 = localTime3.plus(4 , ChronoUnit.MINUTES);
		System.out.println(localTime5);
		System.out.println("-------------");
		
		LocalTime localTime6 = localTime3.plusSeconds(45);
		System.out.println(localTime6);
		System.out.println("-------------");
		
		System.out.println(localTime6.isAfter(localTime5));
		

	}

}
