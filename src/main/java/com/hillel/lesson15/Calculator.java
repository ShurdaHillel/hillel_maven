package com.hillel.lesson15;

public class Calculator {

    public Double calculate(double a, String operation, double b){
        return 0.0;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public Integer add(Integer a, Integer b) {
        if (a != null && b != null) {
            return a + b;
        }
        return null;
    }
}
