package com.hillel.lesson15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator;


    @BeforeEach
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int actual = calculator.add(2, 2);

        Assertions.assertEquals(4, actual);
    }

    @Test
    public void testAddWhenMembersAreNegative() {
        int actual = calculator.add(-2, -2);

        Assertions.assertEquals(-4, actual);
    }

    @Test
    public void testAddWhenOneMemberIsZero() {
        int actual = calculator.add(-2, 0);

        Assertions.assertEquals(-2, actual);
    }

//    @Test
//    public void testCalculate() {
//        double actual = calculator.calculate(2, "+", 2);
//        Assert.assertEquals(4.0, actual, 0.0);
//    }
}
