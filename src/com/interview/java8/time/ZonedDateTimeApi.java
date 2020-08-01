package com.interview.java8.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeApi {

	public static void main(String[] args) {
		
		ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
		System.out.println(zonedDateTime1);
		System.out.println("---------------------");
		
		ZoneId zoneId = ZoneId.of(ZoneId.SHORT_IDS.get("EST"));
		ZonedDateTime zonedDateTime2 = ZonedDateTime.of(LocalDate.now(), LocalTime.now() ,zoneId);
		System.out.println(zonedDateTime2);
		System.out.println("---------------------");
	}

}
