package com.interview.java8.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime localDateTime1 = LocalDateTime.now();
		System.out.println(localDateTime1);
		System.out.println("--------------------------");
		
		LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(localDateTime2);
		System.out.println("--------------------------");
		
		LocalDateTime localDateTime3 = LocalDateTime.ofEpochSecond(1554865765, 88504385, ZoneOffset.MIN);
		System.out.println(localDateTime3);
		System.out.println("--------------------------");
		
		LocalDateTime localDateTime4 = LocalDateTime.of(2020, 8, 1, 22, 43);
		System.out.println(localDateTime4);
		System.out.println("--------------------------");
		
		System.out.println(localDateTime1.isAfter(localDateTime2));
		

	}

}
