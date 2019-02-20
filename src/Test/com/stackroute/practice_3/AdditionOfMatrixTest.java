package com.stackroute.practice_3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOfMatrixTest {
    AdditionOfMatrix additionOfMatrix;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        additionOfMatrix = null;
    }

    @Test
    public void sumOfMatrix() {
        additionOfMatrix = new AdditionOfMatrix(2,3, new int[][]{{1,2,3},{1,2,3}},new int[][]{{1,2,3},{1,2,3}});
        boolean expected = true;
        boolean actual = additionOfMatrix.sumOfMatrix();
        assertEquals(expected,actual);
    }
    @Test
    public void isSumOfMatrix() {
        additionOfMatrix = new AdditionOfMatrix(2,3, new int[][]{{2,2,2},{3,3,3}},new int[][]{{1,2,3},{1,2,3}});
        boolean expected = true;
        boolean actual = additionOfMatrix.sumOfMatrix();
        assertEquals(expected,actual);
    }
}