package by.itacademy.aksanabazhenava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        // 1. Подготовка
        int a = 4;
        int b = 6;

        //2. Действия
        int result = Calculator.add(a, b);

        //3. Проверка
        Assertions.assertEquals(10, result);
    }
}
