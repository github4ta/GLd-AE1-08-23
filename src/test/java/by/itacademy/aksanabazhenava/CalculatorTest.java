package by.itacademy.aksanabazhenava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        int a = 4;
        int b = 6;
        int result = Calculator.add(a, b);
        Assertions.assertEquals(10, result);
    }
}
