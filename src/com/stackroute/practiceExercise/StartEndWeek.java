package com.stackroute.practiceExercise;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.LocalDate;
import static java.time.DayOfWeek.MONDAY;
import static java.time.DayOfWeek.SUNDAY;
import static java.time.temporal.TemporalAdjusters.nextOrSame;
import static java.time.temporal.TemporalAdjusters.previousOrSame;

public class StartEndWeek {
    public static void main(String[] args) {
        StartEndWeek obj = new StartEndWeek();
        String statement = obj.giveStartEnd();
        System.out.println(statement);
    }
    public String giveStartEnd()
    {
        LocalDate today = LocalDate.now();
        LocalDate monday = today.with(previousOrSame(MONDAY));
        LocalDate sunday = today.with(nextOrSame(SUNDAY));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E dd/MM/yyyy");
        //System.out.println("Today: " + today);
        return "Start day of the Week: " + monday.format(formatter)+"\n"+"Last day of the Week: " + sunday.format(formatter);
    }
}
