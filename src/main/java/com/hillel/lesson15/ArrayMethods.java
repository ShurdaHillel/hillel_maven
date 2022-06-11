package com.hillel.lesson15;

import java.util.Arrays;

public class ArrayMethods {

    public int searchElement(int [] array, int element){
        if (array.length > 0) {
            Arrays.sort(array);
            return Arrays.binarySearch(array, element);
        }
        return -1;
    }
}
