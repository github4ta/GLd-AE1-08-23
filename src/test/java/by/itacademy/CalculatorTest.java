package by.itacademy;

import by.itacademy.andreiunuchak.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculatorTest {

    @ParameterizedTest
    @MethodSource ("addDataProvider")
    void calculatorAddTest(int a, int b, int expected){
        assertEquals(Calculator.add(a,b), expected);
    }

    @ParameterizedTest
    @MethodSource ("multiplyDataProvider")
    void calculatorMultiplyTest(int a, int b, int expected){
        assertEquals(Calculator.multiply(a,b), expected);
    }

    @ParameterizedTest
    @MethodSource ("multiplyDataProvider")
    void calculatorDivideTest(int a, int b, int expected){
        assertEquals(Calculator.divide(a,b), expected);
    }

    @ParameterizedTest
    @MethodSource ("subtractDataProvider")
    void calculatorSubtractTest(int a, int b, int expected){
        assertEquals(Calculator.subtract(a,b), expected);
    }

    static Stream<Arguments> addDataProvider() {
        return Stream.of(
                arguments(10, 15, 25),
                arguments(0, 0, 0),
                arguments(-10, -10, -20),
                arguments(-10, 15, 0)
        );
    }

    static Stream<Arguments> multiplyDataProvider() {
        return Stream.of(
                arguments(10, 15, 150),
                arguments(0, 0, 0),
                arguments(-10, -10, 100),
                arguments(-10, 15, -150)
        );
    }

    static Stream<Arguments> subtractDataProvider() {
        return Stream.of(
                arguments(15, 10, 5),
                arguments(0, 0, 0),
                arguments(-10, -10, 0),
                arguments(-10, 15, -25)
        );
    }

    static Stream<Arguments> divideDataProvider() {
        return Stream.of(
                arguments(15, 10, 1.5),
                arguments(0, 0, 0),
                arguments(-10, -10, 0),
                arguments(-10, 15, -25)
        );
    }
}
