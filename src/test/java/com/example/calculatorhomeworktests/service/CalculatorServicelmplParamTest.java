package com.example.calculatorhomeworktests.service;

import com.example.calculatorhomeworktests.exeption.DivisionByZeroException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServicelmplParamTest {
    private final CalculatorService calculatorService = new CalculatorServicelmpl();
    @ParameterizedTest
    @MethodSource("provideCalculatorParams")

    public void shouldSumCorrectly(int a,int b) {
        int result = calculatorService.plus(a, b);
        assertEquals(a + b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldMinusCorrectly(int a,int b) {
        int result = calculatorService.minus(a, b);
        assertEquals(a - b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldMyltiplyCorrectly(int a,int b) {
        int result = calculatorService.multiply(a, b);
        assertEquals(a * b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldDivideCorrectly(int a,int b) throws DivisionByZeroException {
        int result = calculatorService.divide(a, b);
        assertEquals(a / b, result);
    }
    private static Stream<Arguments>provideCalculatorParams(){
        return Stream.of(
                Arguments.of(Constants.ONE,Constants.TWO),
                Arguments.of(Constants.TWO,Constants.TWO),
                Arguments.of(Constants.THREE,Constants.TWO),
                Arguments.of(Constants.FOR,Constants.TWO));


    }
}
