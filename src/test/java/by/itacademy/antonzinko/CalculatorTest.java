package by.itacademy.antonzinko;

import by.itacademy.antonzinko.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void test1() {
        int a = 2;
        int b = 3;
        int result = Calculator.fold(a, b);
        Assertions.assertEquals(5, result);
    }
}
