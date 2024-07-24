package by.itacademy.antonzinko;

public class Calculator {
    public static int fold(int a, int b) {

        return (a + b);
    }

    public static int multiply(int a, int b) {

        return (a * b);
    }

    public static int subtraction(int a, int b) {

        return (a - b);
    }

    public static int division(int a, int b) {
        return (a / b);
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(Calculator.fold(a, b));
        System.out.println(Calculator.multiply(a, b));
        System.out.println(Calculator.subtraction(a, b));
        System.out.println(Calculator.division(a, b));
    }
}
