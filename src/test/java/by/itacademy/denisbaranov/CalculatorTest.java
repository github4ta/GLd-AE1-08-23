package by.itacademy.denisbaranov;

import by.itacademy.denisbaranov.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testSum() {
        //1.Подготовка
        int a = 4;
        int b = 5;
        //2.Действие
        int result = Calculator.sum(a, b);
        //3. Результат
        Assertions.assertEquals(9, result);

    }

    @Test
    public void testSubstract() {
        //1.Подготовка
        int a = 4;
        int b = 5;
        //2.Действие
        int result = Calculator.subtract(a, b);
        //3. Результат
        Assertions.assertEquals(-1, result, "Ваш метод работает неккоректно с корректными данными");
    }

    @Test
    public void testMultiply() {
        //1.Подготовка
        int a = 4;
        int b = 5;
        //2.Действие
        int result = Calculator.multiply(a, b);
        //3. Результат
        Assertions.assertEquals(20, result, "Ваш метод работает неккоректно с корректными данными");
    }
    @Test
    public void testDivide() {
        //1.Подготовка
        double a = 4.5;
        double b = 50.0;
        //2.Действие
        double result = Calculator.divide(a, b);
        //3. Результат
        Assertions.assertEquals(0.08, result, 0.01);
    }
}
