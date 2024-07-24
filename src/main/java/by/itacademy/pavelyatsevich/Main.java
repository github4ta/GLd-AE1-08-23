package by.itacademy.pavelyatsevich;

import by.itacademy.pavelyatsevich.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("to add, enter numbers");
        System.out.println("summ of two numbers: "
                + Calculator.add(Calculator.getNumber(), Calculator.getNumber()));
        System.out.println("for multiplication enter numbers");
        System.out.println("multiply of two numbers: "
                + Calculator.multiply(Calculator.getNumber(), Calculator.getNumber()));
        System.out.println("to subtract, enter numbers");
        System.out.println("subtract of two numbers: "
                + Calculator.subtract(Calculator.getNumber(), Calculator.getNumber()));
        System.out.println("for division, enter numbers");
        System.out.println("divide of two numbers: "
                + Calculator.divide(Calculator.getNumber(), Calculator.getNumber()));
    }
}
