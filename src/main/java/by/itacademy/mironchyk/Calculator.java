package by.itacademy.mironchyk;

public class Calculator {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 4;

        System.out.println("Addition: " + Calculator.add(num1, num2));
    }

    public static int add(int a, int b) {
        return a + b;
    }
}