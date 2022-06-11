package com.hillel.lesson15;

import java.util.Arrays;

public class ArrayMethods {

    public int searchElement(int [] array, int element){
        Arrays.sort(array);
        return Arrays.binarySearch(array, element);
    }
}
