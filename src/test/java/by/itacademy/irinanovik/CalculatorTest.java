package by.itacademy.irinanovik;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd1() {
        int a = 6;
        int b = 9;
        int result = Calculator.add(a,b);
        Assertions.assertEquals(15, result);
    }
}
