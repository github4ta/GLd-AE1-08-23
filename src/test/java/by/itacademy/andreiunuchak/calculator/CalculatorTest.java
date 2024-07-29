package by.itacademy.andreiunuchak.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class CalculatorTest {
    @Test
    public void test1() {
        int number1 = 1;
        int number2 = 2;
        int expected = 3;
        int actual = Calculator.add(number1, number2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int number1 = -1;
        int number2 = -2;
        int expected = -3;
        int actual = Calculator.add(number1, number2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        int number1 = -1;
        int number2 = 2;
        int expected = 1;
        int actual = Calculator.add(number1, number2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        int number1 = Integer.MAX_VALUE;
        int number2 = Integer.MIN_VALUE;
        int expected = -1;
        int actual = Calculator.add(number1, number2);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("addSource")
    public void test5(int number1, int number2, int expected) {
        int actual = Calculator.add(number1, number2);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> addSource() {
        return Stream.of(
                Arguments.arguments(1, 2, 3),
                Arguments.arguments(-1, -2, -3),
                Arguments.arguments(-1, 2, 1),
                Arguments.arguments(1, -2, -1),
                Arguments.arguments(Integer.MAX_VALUE, Integer.MIN_VALUE, -1)
        );
    }
}
