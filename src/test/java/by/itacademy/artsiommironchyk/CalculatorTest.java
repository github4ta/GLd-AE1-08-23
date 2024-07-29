package by.itacademy.artsiommironchyk;

import by.itacademy.mironchyk.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAdd() {
        int a = 10;
        int b = 2;
        int result = Calculator.add(a, b);
        Assertions.assertEquals(12, result);
        Assertions.assertNotEquals(11, result);
    }

    @Test
    void testMultiply() {
        int a = 10;
        int b = 2;
        int result = Calculator.multiply(a, b);
        Assertions.assertEquals(20, result);
        Assertions.assertNotEquals(7, result);
    }

    @Test
    void testSubtract() {
        int a =11;
        int b = 2;
        int result = Calculator.subtract(a, b);
        Assertions.assertEquals(8, result,"Ваш метод работает корректно с не корректными данными");
        Assertions.assertNotEquals(9, result);
    }
}