package by.itacademy.artsiommironchyk;

import by.itacademy.mironchyk.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAdd() {
        //given
        int a = 10;
        int b = 2;
        //when
        int result = Calculator.add(a, b);
        //then
        Assertions.assertEquals(12, result);
        Assertions.assertNotEquals(11, result);
    }

    @Test
    void testMultiply() {
        //given
        int a = 10;
        int b = 2;
        //when
        int result = Calculator.multiply(a, b);
        //then
        Assertions.assertEquals(20, result);
        Assertions.assertNotEquals(7, result);
    }

    @Test
    void testSubtract() {
        int a = 10;
        int b = 2;
        int result = Calculator.subtract(a, b);
        Assertions.assertEquals(8, result);
        Assertions.assertNotEquals(9, result);
    }
}