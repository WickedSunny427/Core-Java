package com.corejavaprojects.java8.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Duration;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.Instant;

public class DateTimeExample {
    public static void main(String[] args) {
        // Creating LocalDate, LocalTime, LocalDateTime
        LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date);

        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + dateTime);

        // Creating ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Current date, time, and time zone: " + zonedDateTime);

        // Creating Duration and Period
        Duration duration = Duration.ofHours(2);
        System.out.println("Duration of 2 hours: " + duration);

        Period period = Period.ofDays(7);
        System.out.println("Period of 7 days: " + period);

        // Formatting and parsing dates and times
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);

        LocalDateTime parsedDateTime = LocalDateTime.parse("2022-04-15 10:30:00", formatter);
        System.out.println("Parsed date and time: " + parsedDateTime);

        // Converting between time zones
        ZoneId zoneId1 = ZoneId.of("America/New_York");
        ZoneId zoneId2 = ZoneId.of("Europe/London");

        ZonedDateTime newYorkTime = ZonedDateTime.now(zoneId1);
        ZonedDateTime londonTime = newYorkTime.withZoneSameInstant(zoneId2);
        System.out.println("Current time in New York: " + newYorkTime);
        System.out.println("Current time in London: " + londonTime);

        // Creating Instant
        Instant instant = Instant.now();
        System.out.println("Current instant: " + instant);
    }
}
