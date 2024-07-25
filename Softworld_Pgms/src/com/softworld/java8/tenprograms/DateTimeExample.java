package com.softworld.java8.tenprograms;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // Current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date-Time: " + currentDateTime);

        // Custom formatting using DateTimeFormatter
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDate = currentDate.format(dateFormatter);
        String formattedTime = currentTime.format(timeFormatter);
        String formattedDateTime = currentDateTime.format(dateTimeFormatter);

        System.out.println("Formatted Date: " + formattedDate);
        System.out.println("Formatted Time: " + formattedTime);
        System.out.println("Formatted Date-Time: " + formattedDateTime);

        // Parsing date and time strings
        String dateStr = "2023-12-25";
        LocalDate parsedDate = LocalDate.parse(dateStr, dateFormatter);
        System.out.println("Parsed Date: " + parsedDate);

        String timeStr = "15:30:00";
        LocalTime parsedTime = LocalTime.parse(timeStr, timeFormatter);
        System.out.println("Parsed Time: " + parsedTime);

        String dateTimeStr = "2023-12-25 15:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeStr, dateTimeFormatter);
        System.out.println("Parsed Date-Time: " + parsedDateTime);
    }
}
