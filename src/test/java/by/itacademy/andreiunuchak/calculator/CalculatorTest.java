package by.itacademy.andreiunuchak.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void test1(){
        int number1 = 1;
        int number2 = 2;
        int expected = 3;
        int result = Calculator.add(number1,number2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test2(){
        int number1 = -1;
        int number2 = -2;
        int expected = -3;
        int result = Calculator.add(number1,number2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test3(){
        int number1 = -1;
        int number2 = 2;
        int expected = 1;
        int result = Calculator.add(number1,number2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test4(){
        int number1 = Integer.MAX_VALUE;
        int number2 = Integer.MIN_VALUE;
        int expected = -1;
        int result = Calculator.add(number1,number2);
        Assertions.assertEquals(expected, result);
    }
}
