package com.stackroute.practice_3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks studentMarks;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        studentMarks = null;
    }

    @Test
    public void marks() {
        studentMarks = new StudentMarks(4, new int[]{10,20,30,40});
        boolean expected = true;
        boolean actual = studentMarks.Marks();
        assertEquals(expected,actual);
    }
    @Test
    public void stud_marks() {
        studentMarks = new StudentMarks(4, new int[]{10,451,30,40});
        boolean expected = true;
        boolean actual = studentMarks.Marks();
        assertEquals(expected,actual);
    }
    @Test
    public void stud_marksOf() {
        studentMarks = new StudentMarks(4, new int[]{10,100,30,40,12});
        boolean expected = true;
        boolean actual = studentMarks.Marks();
        assertEquals(expected,actual);
    }
}