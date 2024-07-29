package by.itacademy.aksanabazhenava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd1() {
        int number1 = 4;
        int number2 = 6;
        int result = Calculator.add(number1, number2);
        Assertions.assertEquals(10, result);
    }
    @Test
    public void testAdd2(){
        int number1 = -1;
        int number2 = -5;
        int expected = -6;
        int result = Calculator.add(number1,number2);
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testAdd3(){
        int number1 = -10;
        int number2 = -2;
        int expected = -12;
        int result = Calculator.add(number1,number2);
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testAdd4() {
        int number1 = Integer.MAX_VALUE;
        int number2 = Integer.MIN_VALUE;
        int expected = -1;
        int result = Calculator.add(number1, number2);
        Assertions.assertEquals(expected, result);
    }
}
