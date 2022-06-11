package com.hillel.lesson15;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;


    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int actual = calculator.add(2, 2);

        Assert.assertEquals(4, actual);
    }

    @Test
    public void testAddWhenMembersAreNegative() {
        int actual = calculator.add(-2, -2);

        Assert.assertEquals(-4, actual);
    }

    @Test
    public void testAddWhenOneMemberIsZero() {
        int actual = calculator.add(-2, 0);

        Assert.assertEquals(-2, actual);
    }

    @Test
    public void testCalculate() {
        double actual = calculator.calculate(2, "+", 2);
        Assert.assertEquals(4.0, actual, 0.0);
    }
}
