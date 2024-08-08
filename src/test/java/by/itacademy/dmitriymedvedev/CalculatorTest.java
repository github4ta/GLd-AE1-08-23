package by.itacademy.dmitriymedvedev;

import by.itacademy.dmitriy.medvedev.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void test1(){
        int number1 = 1;
        int number2 = 2;
        int expected = 3;
        int result = Calculator.add(number1,number2);
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void test2() {
        int number1 = -1;
        int number2 = -2;
        int expected = -3;
        int result = Calculator.add(number1, number2);
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void test3() {
        int number1 = -1;
        int number2 = 2;
        int expected = 1;
        int result = Calculator.add(number1, number2);
        Assertions.assertEquals(expected, result);
    }

}
