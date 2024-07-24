package by.itacademy;

import by.itacademy.mironchyk.Calculator;

public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        System.out.println(Calculator.add(a, b));
        System.out.println(Calculator.multiply(a, b));
        System.out.println(Calculator.subtract(a, b));
        System.out.println(Calculator.division(a, b));
    }
}
