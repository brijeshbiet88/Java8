package com.interview.java8.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodAndDuration {

	public static void main(String[] args) {
		LocalDate localDate1 = LocalDate.now();
		LocalDate localDate2 = LocalDate.of(2019, 7, 29);
		
		System.out.println(Period.between(localDate1, localDate2));
		
		LocalTime localTime1 =  LocalTime.now();
		LocalTime localTime2 = LocalTime.NOON;
		
		System.out.println(Duration.between(localTime1, localTime2));

	}

}
