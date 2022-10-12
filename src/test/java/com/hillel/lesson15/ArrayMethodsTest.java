package com.hillel.lesson15;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayMethodsTest {
    ArrayMethods arrayMethods;

    @BeforeEach
    public void setUp() throws Exception {
        arrayMethods = new ArrayMethods();
        System.out.println("before");
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @Test
    public void testSearchElement() {
        int[] array = {1, 7, 5, 3, 99, 0, 7, 3};
        int actual = arrayMethods.searchElement(array, 3);
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void testSearchElementNegative() {
        int[] array = {1, 7, -5, 3, 99, 0, 7, 3};
        int actual = arrayMethods.searchElement(array, -5);
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void testSearchElementWhenArrayIsEmpty() {
        int[] array = {};
        int actual = arrayMethods.searchElement(array, -5);
        Assertions.assertEquals(-1, actual);
    }
}