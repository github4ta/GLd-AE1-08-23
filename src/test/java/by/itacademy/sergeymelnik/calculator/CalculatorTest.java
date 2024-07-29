package by.itacademy.sergeymelnik.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {



    @Test
    public void testSum(){
        //1 given / assembly исходные данные, которые либо сразу задаем для проверки метода или получае по результатам какого либо метода
        int a = 2;
        int b = 3;

        //2 when / act вызываем метод/код, который хотим протестировать
        int result =  Calculator.sum(a, b);

        //3 then / assertion проверка, обычно с помощью библиотек JUnit5 or TestNG
        Assertions.assertEquals(5, result);

    }

    @Test
    public void testSubtract(){
        int a= 4;
        int b= 5;
        int actual = Calculator.subtraction(b, a);
        Assertions.assertEquals(1, actual, "Ваш метод не работает некорректно с корректными данными");
        Assertions.assertNotEquals(5, actual);

    }

    @Test
    public void testMultiply(){
        double a = 10.2;
        double b = 15.1;
        double result = Calculator.multiply(a, b);
        double validResult = 154.02; //a*b;
        System.out.println(validResult);
        Assertions.assertEquals(validResult, result, 0.01);
        Assertions.assertNotEquals(123,result);

    }
}
