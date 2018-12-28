package com.stackroute.practiceExercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class StartEndWeekTest {

    StartEndWeek obj = new StartEndWeek();
    @Test
    public void giveStartEnd() {

        String expected = "Start day of the Week: Mon 24/12/2018" + "\n" + "Last day of the Week: Sun 30/12/2018";
        String acutual = obj.giveStartEnd();
        assertEquals(expected,acutual);
    }
}