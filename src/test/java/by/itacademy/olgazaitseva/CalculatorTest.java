package by.itacademy.olgazaitseva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd (){
        //Подготовка
        int a =4;
        int b =5;
        //Действие
        int result =Calculator.add(a,b);
        //Проверка
        Assertions.assertEquals(9, result);
    }
}
