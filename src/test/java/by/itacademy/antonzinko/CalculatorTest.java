package by.itacademy.antonzinko;

import by.itacademy.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void test1() {
        int a = 4;
        int b = 4;
        int result = Calculator.add(a, b);
        Assertions.assertEquals(8, result, "Ваш метод имеет некорректные данные!");
        Assertions.assertNotEquals(1, result);
    }
}
