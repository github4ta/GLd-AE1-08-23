package by.itacademy.dmitriymedvedev;
import by.itacademy.dmitriymedvedev.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        int a = 3;
        int b = 4;
        int actual = Calculator.add(a, b);
        Assertions.assertEquals(7, actual);
    }
    @Test
    public void testSubtract() {
        int a = 10;
        int b = 2;
        int result = Calculator.subtract(a,b);
        Assertions.assertEquals(8, result, "Ваш метод работает некорректно с корректными данными.");
        Assertions.assertNotEquals(9,result);
    }

    @Test
    void testMultiply(){
        //given
        int a = 10;
        int b = 2;
        int validResult = 20;
        int invalidResult = 7;
        //when
        int result = Calculator.multiply(a,b);
        //then
        Assertions.assertEquals(validResult,result);
        Assertions.assertNotEquals(invalidResult,result);
        }
    }

