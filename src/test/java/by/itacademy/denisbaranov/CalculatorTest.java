package by.itacademy.denisbaranov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void test1() {
        //1.Подготовка
        int a = 4;
        int b = 5;
        //2.Действие
        int result = Calculator.sum(a, b);
        //3. Результат
        Assertions.assertEquals(9, result);
    }
    @Test
    public void test2() {
        //1.Подготовка
        int a = 4;
        int b = 5;
        //2.Действие
        int result = Calculator.sum(a, b);
        //3. Результат
        Assertions.assertEquals(9, result);
    }
}
