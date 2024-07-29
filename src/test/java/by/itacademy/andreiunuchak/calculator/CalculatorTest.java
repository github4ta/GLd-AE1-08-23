package by.itacademy.andreiunuchak.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTest {

    @ParameterizedTest
    @MethodSource("addDataProvider")
    void calculatorAddTest(int a, int b, int expected) {
        Assertions.assertEquals(expected, Calculator.add(a, b));
    }

    static Stream<Arguments> addDataProvider() {
        return Stream.of(
                Arguments.arguments(10, 15, 25),
                Arguments.arguments(0, 0, 0),
                Arguments.arguments(-10, -10, -20),
                Arguments.arguments(-10, 15, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("multiplyDataProvider")
    void calculatorMultiplyTest(int a, int b, int expected) {
        Assertions.assertEquals(expected, Calculator.multiply(a, b));
    }

    static Stream<Arguments> multiplyDataProvider() {
        return Stream.of(
                Arguments.arguments(10, 15, 150),
                Arguments.arguments(0, 0, 0),
                Arguments.arguments(-10, -10, 100),
                Arguments.arguments(-10, 15, -150)
        );
    }

    @ParameterizedTest
    @MethodSource("divideDataProvider")
    void calculatorDivideTest(int a, int b, double expected) {
        Assertions.assertEquals(expected, Calculator.divide(a, b), 0.0000001);
    }

    static Stream<Arguments> divideDataProvider() {
        return Stream.of(
                Arguments.arguments(15, 10, 1.5),
                Arguments.arguments(-10, -10, 1),
                Arguments.arguments(1, 3, 0.3333333)
        );
    }

    @Test
    void calculatorDivideByZeroTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> Calculator.divide(0, 0));
    }

    @ParameterizedTest
    @MethodSource("subtractDataProvider")
    void calculatorSubtractTest(int a, int b, int expected) {
        Assertions.assertEquals(expected, Calculator.subtract(a, b));
    }

    static Stream<Arguments> subtractDataProvider() {
        return Stream.of(
                Arguments.arguments(15, 10, 5),
                Arguments.arguments(-10, -10, 0),
                Arguments.arguments(-10, 15, -25)
        );
    }
}
