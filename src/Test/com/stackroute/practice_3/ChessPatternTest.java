package com.stackroute.practice_3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessPatternTest {
    ChessPattern chessPattern;

    @Before
    public void setUp() throws Exception {
        chessPattern = new ChessPattern();
    }

    @After
    public void tearDown() throws Exception {
        chessPattern = null;
    }

    @Test
    public void pattern() {
       String expected= "WW|BB|WW|BB|WW|BB|WW|BB|\n"+
                        "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                        "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                        "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                        "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                        "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                        "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                        "BB|WW|BB|WW|BB|WW|BB|WW|";

        String actual = chessPattern.pattern(8,8);
        assertEquals(expected,actual);
    }
}