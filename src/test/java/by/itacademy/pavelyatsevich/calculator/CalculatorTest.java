package by.itacademy.pavelyatsevich.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        //given
        int a = 10;
        int b = 2;
        int validResult = 12;
        int invalidResult = 11;
        //when
        int result = Calculator.add(a, b);
        //then
        Assertions.assertEquals(validResult, result);
        Assertions.assertNotEquals(invalidResult, result);
    }

    @Test
    public void testMultiply() {
        //given
        int a = 10;
        int b = 2;
        int validResult = 20;
        int invalidResult = 7;
        //when
        int result = Calculator.multiply(a, b);
        //then
        Assertions.assertEquals(validResult, result);
        Assertions.assertNotEquals(invalidResult, result);
    }

    @Test
    public void testSubtract() {
        //given
        int a = 10;
        int b = 2;
        int validResult = 8;
        int invalidResult = 9;
        //when
        int result = Calculator.subtract(a, b);
        //then
        Assertions.assertEquals(validResult, result);
        Assertions.assertNotEquals(invalidResult, result);
    }

    @Test
    public void testDivide() {
        //given
        int a = 10;
        int b = 2;
        int validResult = 5;
        int invalidResult = 10;
        //when
        double result = Calculator.divide(a, b);
        //then
        Assertions.assertEquals(validResult, result);
        Assertions.assertNotEquals(invalidResult, result);
    }
}
