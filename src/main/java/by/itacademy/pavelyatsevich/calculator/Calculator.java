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

    public static int getNumber() {
        while (true) {
            if (scanner.hasNextInt()){
                return scanner.nextInt();
            } else {
                System.out.println("Введены не корректные данные. Повторите ввод");
                scanner.nextLine();
            }
        }
    }
}
