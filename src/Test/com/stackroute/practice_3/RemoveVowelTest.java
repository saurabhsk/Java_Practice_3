package com.stackroute.practice_3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelTest {
    RemoveVowel removeVowel;

    @Before
    public void setUp() throws Exception {
        removeVowel = new RemoveVowel();
    }

    @After
    public void tearDown() throws Exception {
        removeVowel = null;
    }

    @Test
    public void findVowel() {
        String[] expected ={"Ind","Untd Stts","Grmny","Egypt","czchslvk"};
        String []actual  = removeVowel.findVowel(5,new String[]{"India", "United States" ,"Germany","Egypt","czechoslovakia"});
        assertArrayEquals(expected,actual);
    }
}