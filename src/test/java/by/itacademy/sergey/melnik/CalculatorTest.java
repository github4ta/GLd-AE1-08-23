package by.itacademy.sergey.melnik;

import by.itacademy.sergeymelnik.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

    @Test
    public void testAdding(){
        int a = 5;
        int b = 6;
        int calc = Calculator.adding(a, b);
        Assertions.assertEquals(11,calc);
    }

    @Test
    public void testMultiply(){
        int a = 5;
        int b = 6;
        int calc = Calculator.multiply(a, b);
        Assertions.assertEquals(30,calc);

    }


    @Test
    public void testSubtract(){
        int a = 6;
        int b = 5;
        int calc = Calculator.subtract(a, b);
        Assertions.assertEquals(1,calc);

    }


}
