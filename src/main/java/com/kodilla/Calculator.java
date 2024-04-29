package com.kodilla;

public class Calculator {
    public int AddValues(int a, int b) {
        return a + b;
    }
    public int SubtractValues(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.AddValues(10, 20));
    }
}
