package by.itacademy.aksanabazhenava;

import by.itacademy.aksanabazhenava.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
//    public void testAdd() {
//        // 1. Подготовка (Данные)
//        int a = 4;
//        int b = 6;
//
//        //2. Действия
//        int result = Calculator.add(a, b);
//
//        //3. Проверка
//        Assertions.assertEquals(10, result);
//    }
    public void testSum() {
        //1. Данные
        int invalidA = 2;
        int invalidB = 50;

        //2. Вызвать код, который хотим протестировать
        int result = Calculator.add(2, 50);
        Assertions.assertEquals(52, result);
    }

    @Test
    public void testDeduction() {
        //1. Данные
        int invalidA = 2;
        int invalidB = 50;

        //2. Вызвать код, который хотим протестировать
        int result = Calculator.substract(4, 90);
        Assertions.assertEquals(-86, result);
    }

    @Test
    void testMultiplay() {
        int a = 98;
        int b = 0;
        int result = Calculator.multiplay(a, b);
        Assertions.assertEquals(0, result);
    }

    @Test
    void testDivision() {
        int a = 9;
        int b = 3;
        int result = Calculator.division(a, b);
        Assertions.assertEquals(3, result);
    }
}
