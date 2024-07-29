package by.itacademy.pavelyatsevich.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    public void testAdd() {
        int value1 = 10;
        int value2 = 2;
        int validResult = 12;
        int result = Calculator.add(value1, value2);
        Assertions.assertEquals(validResult, result);
        //+ -
        value1 = 11;
        value2 = -9;
        validResult = 2;
        Assertions.assertEquals(validResult, Calculator.add(value1, value2));
        //- +
        value1 = -13;
        value2 = 5;
        validResult = -8;
        Assertions.assertEquals(validResult, Calculator.add(value1, value2));
        //- -
        value1 = -11;
        value2 = -9;
        validResult = -20;
        Assertions.assertEquals(validResult, Calculator.add(value1, value2));
        //0 0
        value1 = 0;
        value2 = 0;
        validResult = 0;
        Assertions.assertEquals(validResult, Calculator.add(value1, value2));
    }
}