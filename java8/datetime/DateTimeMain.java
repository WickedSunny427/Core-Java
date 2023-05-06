package com.corejavaprojects.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DateTimeMain {

	public static void main(String[] args) {

		System.out.println("-------- Using LocalDate-------- \n");

		System.out.println(LocalDate.now());
		System.out.println(LocalDate.of(1992, 04, 10));
		System.out.println(LocalDate.ofYearDay(2007, 99));
		System.out.println(LocalDate.parse("2007-07-07"));
		System.out.println(LocalDate.now().getDayOfMonth());
		System.out.println(LocalDate.now().plusDays(2));

		System.out.println("\n----------- Using LocalTime -----------------\n");

		System.out.println(LocalTime.now());
		System.out.println(LocalTime.of(14, 57, 11));
		System.out.println(LocalTime.parse("12:25"));
		System.out.println(LocalTime.now().minusHours(4));
		System.out.println(LocalTime.now().plusMinutes(55));

		System.out.println("\n----------- Using LocalDateTime -----------------\n");

		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.now().plusMonths(11).getDayOfMonth());

		System.out.println("\n----------- Using Zone -----------------\n");

		ZoneId zoneId = ZoneId.of("Europe/Paris");
		ZonedDateTime zone = ZonedDateTime.of(LocalDateTime.now(), zoneId);

		System.out.println("Custom Zone : " + zone);

		Set<String> allZones = ZoneId.getAvailableZoneIds();
		System.out.println("All Available Zones" + allZones);
	}

}
