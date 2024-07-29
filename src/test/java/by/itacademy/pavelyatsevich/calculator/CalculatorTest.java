package by.itacademy.pavelyatsevich.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    public void testAdd() {
        int value1 = 10;
        int value2 = 2;
        int validResult = 12;
        int invalidResult = 11;
        int result = Calculator.add(value1, value2);
        Assertions.assertEquals(validResult, result);
        Assertions.assertNotEquals(invalidResult, result);
    }
}