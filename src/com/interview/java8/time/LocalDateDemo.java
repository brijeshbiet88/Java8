package com.interview.java8.time;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateDemo {

	public static void main(String[] args) {
		
		LocalDate localDate1 = LocalDate.now();
		System.out.println(localDate1);
		System.out.println("-----------------");

		Clock clock = Clock.systemDefaultZone();
		LocalDate localDate2 = LocalDate.now(clock);
		System.out.println(localDate2);
		System.out.println("-----------------");
		
		ZoneId zoneId = ZoneId.of(ZoneId.SHORT_IDS.get("IST"));
		LocalDate localDate3 = LocalDate.now(zoneId);
		System.out.println(localDate3);
		System.out.println("-----------------");
		
		LocalDate localDate4 = LocalDate.of(2020, 8, 01);
		System.out.println(localDate4);
		System.out.println("-----------------");
		
		LocalDate localDate5 = LocalDate.parse("2020-08-01");
		System.out.println(localDate5);
		System.out.println("-----------------");
		
		LocalDate localDate6 = LocalDate.now();
		localDate6 = localDate6.minusDays(1);
		System.out.println(localDate6);
		System.out.println("-----------------");
		
		localDate6 = localDate6.plusMonths(1);
		System.out.println(localDate6);
		System.out.println("-----------------");
		
		LocalDate localDate7 = LocalDate.of(2020 , Month.AUGUST , 1);
		System.out.println(localDate7);
		
		
		
	}

}
