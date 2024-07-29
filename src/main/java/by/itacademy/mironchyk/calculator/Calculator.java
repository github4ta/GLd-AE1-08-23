package by.itacademy.mironchyk.calculator;

public class Calculator {
    public static int add(int a, int b) {
        return (a + b);
    }

    public static int multiply(int a, int b) {
        return (a * b);
    }

    public static int deduct(int a, int b) {
        return (a - b);
    }

    // добавил коментарий
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return (a / b);
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}

