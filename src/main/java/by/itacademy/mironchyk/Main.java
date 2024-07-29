package by.itacademy.mironchyk;

import by.itacademy.mironchyk.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(Calculator.add(a, b));
        System.out.println(Calculator.multiply(a, b));
        System.out.println(Calculator.deduct(a, b));
        System.out.println(Calculator.divide(a, b));
    }
}