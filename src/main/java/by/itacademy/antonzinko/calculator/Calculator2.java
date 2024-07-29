package by.itacademy.antonzinko.calculator;

public class Calculator2 {
    public static int f(int a, int b) {
        return (a + b);
    }

    public static int m(int a, int b) {
        return (a * b);
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(Calculator2.f(a, b));
        System.out.println(Calculator2.m(a, b));
    }
}