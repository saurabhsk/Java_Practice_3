package com.stackroute.practice_3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveSeriesTest {
   ConsecutiveSeries consecutiveSeries;
    @Before
    public void setUp() throws Exception {
        consecutiveSeries = new ConsecutiveSeries();
    }

    @After
    public void tearDown() throws Exception {
        consecutiveSeries = null;
    }

    @Test
    public void series() {
        boolean expected = true;
        boolean actual = consecutiveSeries.series(7,new String[]{"50,51,52,53,54,55,56"});
        assertEquals(expected,actual);
    }
    @Test
    public void seriesOf() {
        boolean expected = false;
        boolean actual = consecutiveSeries.series(6,new String[]{"1,1,3,4,5,6"});
        assertEquals(expected,actual);
    }
}