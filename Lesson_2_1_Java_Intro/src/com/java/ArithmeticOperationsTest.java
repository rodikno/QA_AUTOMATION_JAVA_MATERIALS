package com.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticOperationsTest {

    @Test
    public void testTwoPlusThreeShouldEqualFive() {
        ArithmeticCalculator testClass = new ArithmeticCalculator();
        int result = testClass.add(2, 3);
        assertEquals(5, result);
    }

}
