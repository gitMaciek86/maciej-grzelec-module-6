package com.kodilla.testing.calculator;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }
    public int add(int a, int b) {
        return this.a + this.b;
    }

    public int substract(int a, int b) {
        return this.b - this.a;
    }
}
