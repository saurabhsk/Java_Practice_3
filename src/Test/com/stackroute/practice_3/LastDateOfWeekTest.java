package com.stackroute.practice_3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
    public void firstWeekDay(){
        String expected = "Mon 18/02/2019";
        String actual = lastDateOfWeek.firstWeekDay("Mon 18/02/2019");
        assertEquals(expected,actual);
    }

    @Test
    public void lastWeekDay() {
        String expected = "Sun 24/02/2019";
        String actual = lastDateOfWeek.lastWeekDay("Sun 24/02/2019");
        assertEquals(expected,actual);
    }
}