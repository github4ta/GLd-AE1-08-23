package by.itacademy.sergeymelnik;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {


    @Test
    public void testAdd(){
        int a= 4;
        int b= 5;
        int actual = Calculator.add(a, b);
        Assertions.assertEquals(9, actual);

    }
}
