package by.itacademy.pavelyatsevich.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testIntegerAdd() {
        //given
        int value1 = 10;
        int value2 = 2;
        int validResult = 12;
        int invalidResult = 11;
        //when
        int result = Calculator.add(value1, value2);
        //then
        Assertions.assertEquals(validResult, result,"The method does not work correctly with correct data.");
        Assertions.assertNotEquals(invalidResult, result);
    }

    @Test
    public void testIntegerMultiply() {
        //given
        int value1 = 10;
        int value2 = 2;
        int validResult = 20;
        int invalidResult = 7;
        //when
        int result = Calculator.multiply(value1, value2);
        //then
        Assertions.assertEquals(validResult, result,"The method does not work correctly with correct data.");
        Assertions.assertNotEquals(invalidResult, result);
    }

    @Test
    public void testIntegerSubtract() {
        //given
        int value1 = 10;
        int value2 = 2;
        int validResult = 8;
        int invalidResult = 9;
        //when
        int result = Calculator.subtract(value1, value2);
        //then
        Assertions.assertEquals(validResult, result);
        Assertions.assertNotEquals(invalidResult, result);
    }

    @Test
    public void testIntegerDivide() {
        //given
        int value1 = 10;
        int value2 = 2;
        int validResult = 5;
        int invalidResult = 10;
        //when
        double result = Calculator.divide(value1, value2);
        //then
        Assertions.assertEquals(validResult, result);
        Assertions.assertNotEquals(invalidResult, result);
    }

    @Test
    void testDoubleAdd() {
        //given
        double value1 = 10;
        double value2 = 2;
        double validResult = 12;
        double invalidResult = 11;
        //when
        double result = Calculator.add(value1, value2);
        //then
        Assertions.assertEquals(validResult, result);
        Assertions.assertNotEquals(invalidResult, result);
    }

    @Test
    void testDoubleMultiply() {
        //given
        double value1 = 10.2;
        double value2 = 2.0;
        double validResult = 20.4;
        double invalidResult = 7.2;
        //when
        double result = Calculator.multiply(value1, value2);
        //then
        Assertions.assertEquals(validResult, result,0.001);
        Assertions.assertNotEquals(invalidResult, result);
    }

    @Test
    void testDoubleSubtract() {
        //given
        double value1 = 10;
        double value2 = 2;
        double validResult = 8;
        double invalidResult = 9;
        //when
        double result = Calculator.subtract(value1, value2);
        //then
        Assertions.assertEquals(validResult, result);
        Assertions.assertNotEquals(invalidResult, result);
    }

    @Test
    void testDoubleDivide() {
        //given
        double value1 = 10;
        double value2 = 2;
        double validResult = 5;
        double invalidResult = 10;
        //when
        double result = Calculator.divide(value1, value2);
        //then
        Assertions.assertEquals(validResult, result);
        Assertions.assertNotEquals(invalidResult, result);
    }
}
