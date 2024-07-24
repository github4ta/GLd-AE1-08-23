package by.itacademy.pavelyatsevich;

import by.itacademy.pavelyatsevich.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter numbers");
        System.out.println("summ of two numbers: "
                + Calculator.add(Calculator.getNumber(), Calculator.getNumber()));
        System.out.println("enter numbers");
        System.out.println("multiply of two numbers: "
                + Calculator.multiply(Calculator.getNumber(), Calculator.getNumber()));
    }
}
