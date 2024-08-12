package by.itacademy;

import by.itacademy.antonzinko.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void test1() {
        int a = 2;
        int b = 3;
        int result = Calculator.fold(a, b);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        int a = 1;
        int b = 2;
        int result = Calculator.multiply(a, b);
        Assertions.assertEquals(2, result, "Ваш метод имеет некорректные данные!");
        Assertions.assertNotEquals(3, result);
    }

}
