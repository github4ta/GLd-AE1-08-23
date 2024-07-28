package by.itacademy.andreiunuchak;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("division by zero");
        }
        return (double) a / b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
