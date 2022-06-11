package com.hillel.lesson15;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayMethodsTest {
    ArrayMethods arrayMethods;

    @Before
    public void setUp() throws Exception {
        arrayMethods = new ArrayMethods();
        System.out.println("before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @Test
    public void testSearchElement() {
        int[] array = {1, 7, 5, 3, 99, 0, 7, 3};
        int actual = arrayMethods.searchElement(array, 3);
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testSearchElementNegative() {
        int[] array = {1, 7, -5, 3, 99, 0, 7, 3};
        int actual = arrayMethods.searchElement(array, -5);
        Assert.assertEquals(0, actual);
    }

    @Test
    public void testSearchElementWhenArrayIsEmpty() {
        int[] array = {};
        int actual = arrayMethods.searchElement(array, -5);
        Assert.assertEquals(-1, actual);
    }
}