package by.itacademy.pavelyatsevich.calculator;

import java.util.Scanner;

public class Calculator {
    private static final Scanner scanner = new Scanner(System.in);

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        }else {
            System.out.println("division by zero");
            return 0;
        }
    }

    public static int getNumber() {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Введены не корректные данные. Повторите ввод");
                scanner.nextLine();
            }
        }
    }
}
