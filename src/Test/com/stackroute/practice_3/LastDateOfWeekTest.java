package com.stackroute.practice_3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.*;

public class LastDateOfWeekTest {
    LastDateOfWeek lastDateOfWeek;

    @Before
    public void setUp() throws Exception {
        lastDateOfWeek =new LastDateOfWeek();
    }

    @After
    public void tearDown() throws Exception {
        lastDateOfWeek=null;
    }

    @Test
    public void firstWeekDay() throws ParseException {
        String expected = "Mon 18/02/2019";
        String actual = lastDateOfWeek.firstWeekDay("18/02/2019");
        assertEquals(expected,actual);
    }

    @Test
    public void lastWeekDay() throws ParseException {
        String expected = "Sun 24/02/2019";
        String actual = lastDateOfWeek.lastWeekDay("24/02/2019");
        assertEquals(expected,actual);
    }
    @Test
    public void firstWeekDayOf() throws ParseException {
        String expected = "Mon 25/02/2019";
        String actual = lastDateOfWeek.firstWeekDay("27/02/2019");
        assertEquals(expected,actual);
    }

    @Test
    public void lastWeekDayOf() throws ParseException {
        String expected = "Sun 03/03/2019";
        String actual = lastDateOfWeek.lastWeekDay("02/03/2019");
        assertEquals(expected,actual);
    }
}