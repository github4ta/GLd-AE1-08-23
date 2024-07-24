package by.itacademy;

import java.util.Scanner;

public class PavelYatsevichCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = getNumer(scanner);
        int numberTwo = getNumer(scanner);

        System.out.println("sum of numbers - " + (numberOne + numberTwo));
    }

    private static int getNumer(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Введены не корректные данные. Повторите ввод.");
                scanner.nextLine();
            }
        }
    }
}
