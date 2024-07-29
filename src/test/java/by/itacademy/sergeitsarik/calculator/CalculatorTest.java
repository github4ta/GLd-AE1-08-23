package by.itacademy.sergeitsarik.calculator;

public class CalculatorTest {


    public void testSum() {
        // 1 Данные
        int invalidA = 2;
        int validB = 3;

        // 2 Вызвать код, который хотим протестировать
        Calculator.sum(invalidA, validB);

        Calculator.sum(2, 3); // magic numbers

        // 3 проверка

    }
}
